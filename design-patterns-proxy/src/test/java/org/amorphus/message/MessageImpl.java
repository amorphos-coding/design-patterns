package org.amorphus.message;

public class MessageImpl implements Message {

  private final String string;

  public MessageImpl(String string) {
    this.string = string;
  }

  @Override
  public String getString() {
    return string;
  }

}
