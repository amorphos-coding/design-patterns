package org.amorphus.pool;

public interface ObjectPool<E> {

  E retrieveObject();

  void releaseObject(E object);

}
