package org.amorphus.pool.strategy;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class SimplePoolStrategy<T> implements PoolStrategy<T> {

  private final List<T> available = new LinkedList<>();

  @Override
  public Optional<T> findAvailableObject() {
    return (available.isEmpty()) ? Optional.empty() : Optional.ofNullable(available.get(0));
  }

  @Override
  public void trackAsInUse(T object) {
    available.remove(object);
  }

  @Override
  public void trackAsAvailable(T object) {
    available.add(object);
  }

}