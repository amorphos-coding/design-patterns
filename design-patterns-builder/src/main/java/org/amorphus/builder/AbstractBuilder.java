package org.amorphus.builder;

import org.amorphus.builder.context.BuilderContext;

public abstract class AbstractBuilder<T, C extends BuilderContext<T>> implements Builder<T> {

  private final C context;

  protected AbstractBuilder(C context) {
    this.context = context;
  }

  protected C getContext() {
    return context;
  }

}
