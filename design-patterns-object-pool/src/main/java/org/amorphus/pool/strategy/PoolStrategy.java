package org.amorphus.pool.strategy;

import java.util.Optional;

public interface PoolStrategy<T> {

  Optional<T> findAvailableObject();

  void trackAsInUse(T object);

  void trackAsAvailable(T object);

}
