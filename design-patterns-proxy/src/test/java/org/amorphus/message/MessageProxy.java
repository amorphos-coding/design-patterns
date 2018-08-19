package org.amorphus.message;

import org.amorphus.builder.AbstractBuilder;
import org.amorphus.builder.Builder;
import org.amorphus.builder.context.BuilderContext;
import org.amorphus.proxy.AbstractProxy;

public class MessageProxy extends AbstractProxy<Message> implements Message {

  private String message;

  public MessageProxy(String message) {
    this.message = message;
  }

  @Override
  public String getString() {
    return getProxy().getString();
  }

  @Override
  protected Message createProxyInstance() {
    return new MessageProxy.Builder(message).build();
  }

  private static class Builder extends AbstractBuilder<Message, Builder.Context> {

    private Builder(String message) {
      super(new Builder.Context());
      this.getContext().message = message;
    }

    @Override
    public Message build() {
      return new MessageImpl(getContext().message);
    }

    private static class Context implements BuilderContext<Message> {

      private String message;

    }

  }

}