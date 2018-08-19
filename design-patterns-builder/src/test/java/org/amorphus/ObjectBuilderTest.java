package org.amorphus;

import org.amorphus.builder.Builder;
import org.amorphus.builder.ObjectBuilder;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectBuilderTest {

  @Test
  public void testObjectBuilder() {
    Builder<Object> builder = new ObjectBuilder();

    Object o1 = builder.build();
    Object o2 = builder.build();

    assertThat(o1).isNotEqualTo(o2);
  }

}
