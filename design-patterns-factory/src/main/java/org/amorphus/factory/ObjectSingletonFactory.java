package org.amorphus.factory;

public class ObjectSingletonFactory extends SingletonFactory<Object> {

  @Override
  protected Object createInstance() {
    return new Object();
  }

}
