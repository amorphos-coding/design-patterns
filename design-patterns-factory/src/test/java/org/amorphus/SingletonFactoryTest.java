package org.amorphus;

import org.amorphus.factory.Factory;
import org.amorphus.factory.ObjectSingletonFactory;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonFactoryTest {

  @Test
  public void testTwoInstancesAreTheSame() {
    Factory<Object> objectFactory = new ObjectSingletonFactory();
    Object objectOne = objectFactory.yieldObject();
    Object objectTwo = objectFactory.yieldObject();

    assertThat(isPointerEquivalent(objectOne, objectTwo)).isTrue();
  }

  private boolean isPointerEquivalent(Object objectOne, Object objectTwo) {
    return objectOne == objectTwo;
  }

}
