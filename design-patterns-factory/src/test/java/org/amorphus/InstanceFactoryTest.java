package org.amorphus;

import org.amorphus.factory.Factory;
import org.amorphus.factory.ObjectInstanceFactory;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InstanceFactoryTest {

  @Test
  public void testTwoInstancesAreDifferent() {
    Factory<Object> objectFactory = new ObjectInstanceFactory();
    Object objectOne = objectFactory.yieldObject();
    Object objectTwo = objectFactory.yieldObject();

    assertThat(isPointerEquivalent(objectOne, objectTwo)).isFalse();
  }

  private boolean isPointerEquivalent(Object objectOne, Object objectTwo) {
    return objectOne == objectTwo;
  }

}
