package org.amorphus;

import org.amorphus.builder.Builder;
import org.amorphus.message.Message;
import org.amorphus.message.MessageBuilder;
import org.amorphus.message.MessageBuilderContext;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageBuilderTest {

  @Test
  public void testMessageBuilder() {
    Builder<Message> builder = new MessageBuilder(new MessageBuilderContext());

    Message m1 = builder.build();
    Message m2 = builder.build();

    assertThat(m1).isNotEqualTo(m2);
    assertThat(m1.getMessage()).isEqualTo(m2.getMessage());
  }

}
