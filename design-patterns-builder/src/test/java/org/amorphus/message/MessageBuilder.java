package org.amorphus.message;

import org.amorphus.builder.AbstractBuilder;

public class MessageBuilder extends AbstractBuilder<Message, MessageBuilderContext> {

  public MessageBuilder(MessageBuilderContext context) {
    super(context);
  }

  @Override
  public Message build() {
    return new Message(getContext().message);
  }

}
