package org.amorphus.proxy;

public abstract class AbstractProxy<T> implements Proxy<T> {

  private T proxy = null;

  protected T getProxy() {
    return (proxy != null) ? proxy : (proxy = createProxyInstance());
  }

  protected abstract T createProxyInstance();

}
