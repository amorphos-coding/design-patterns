package org.amorphus.factory;

public abstract class SingletonFactory<T> extends AbstractFactory<T> {

  @Override
  protected boolean isSingleton() {
    return true;
  }

}
