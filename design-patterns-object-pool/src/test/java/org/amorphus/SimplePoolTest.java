package org.amorphus;

import org.amorphus.factory.ObjectInstanceFactory;
import org.amorphus.pool.GenericPool;
import org.amorphus.pool.ObjectPool;
import org.amorphus.pool.strategy.SimplePoolStrategy;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimplePoolTest {

  @Test
  public void testCreateAnObject() {
    ObjectPool<Object> pool = givenSimpleObjectPool();

    assertThat(pool.retrieveObject()).isNotNull();
  }

  @Test
  public void testTwoRetainedObjectsAreNotEqual() {
    ObjectPool<Object> pool = givenSimpleObjectPool();

    Object objectOne = pool.retrieveObject();
    Object objectTwo = pool.retrieveObject();

    assertThat(isPointerEquivalent(objectOne, objectTwo)).isFalse();
  }

  @Test
  public void testReusingOneObject() {
    ObjectPool<Object> pool = givenSimpleObjectPool();

    Object objectOne = pool.retrieveObject();
    pool.releaseObject(objectOne);
    Object objectTwo = pool.retrieveObject();

    assertThat(isPointerEquivalent(objectOne, objectTwo)).isTrue();
  }

  private GenericPool<Object> givenSimpleObjectPool() {
    return new GenericPool<>(new ObjectInstanceFactory(), new SimplePoolStrategy<>());
  }

  private boolean isPointerEquivalent(Object objectOne, Object objectTwo) {
    return objectOne == objectTwo;
  }

}
