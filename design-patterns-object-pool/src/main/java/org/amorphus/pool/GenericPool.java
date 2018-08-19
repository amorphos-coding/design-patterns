package org.amorphus.pool;

import org.amorphus.factory.InstanceFactory;
import org.amorphus.pool.strategy.PoolStrategy;

import java.util.Optional;

public final class GenericPool<T> implements ObjectPool<T> {

  private final InstanceFactory<T> factory;
  private final PoolStrategy<T> strategy;

  public GenericPool(InstanceFactory<T> factory, PoolStrategy<T> strategy) {
    this.factory = factory;
    this.strategy = strategy;
  }

  @Override
  public T retrieveObject() {
    T object = findOrCreateObject();
    strategy.trackAsInUse(object);
    return object;
  }

  @Override
  public void releaseObject(T object) {
    strategy.trackAsAvailable(object);
  }

  private T findOrCreateObject() {
    Optional<T> availableObject = strategy.findAvailableObject();
    return availableObject.orElse(factory.yieldObject());
  }

}
