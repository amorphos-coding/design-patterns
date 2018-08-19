package org.amorphus;

import org.amorphus.message.Message;
import org.amorphus.message.MessageProxy;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageProxyTest {

  @Test
  public void testMessageProxy() {
    Message messageProxy = new MessageProxy("Hello, World!");

    assertThat(messageProxy.getString()).isNotNull();
    assertThat(messageProxy.getString()).containsIgnoringCase("hello");
    assertThat(messageProxy.getString()).containsIgnoringCase("world");
  }

}