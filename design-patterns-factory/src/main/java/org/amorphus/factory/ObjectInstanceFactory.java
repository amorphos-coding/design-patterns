package org.amorphus.factory;

public class ObjectInstanceFactory extends InstanceFactory<Object> {

  protected Object createInstance() {
    return new Object();
  }

}
