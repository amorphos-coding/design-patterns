package org.amorphus.factory;

public abstract class AbstractFactory<T> implements Factory<T> {

  private T object = null;

  @Override
  public T yieldObject() {
    if (isSingleton()) {
      return (object == null) ? (object = createInstance()) : object;
    }

    return createInstance();
  }

  protected abstract T createInstance();

  protected abstract boolean isSingleton();

}
