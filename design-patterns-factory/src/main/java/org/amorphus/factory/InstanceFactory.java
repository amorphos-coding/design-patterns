package org.amorphus.factory;

public abstract class InstanceFactory<T> extends AbstractFactory<T> {

  @Override
  protected boolean isSingleton() {
    return false;
  }

}
