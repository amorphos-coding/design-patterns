package org.amorphus.builder;

import org.amorphus.builder.context.BuilderContext;

public class ObjectBuilder extends AbstractBuilder<Object, BuilderContext<Object>> {

  public ObjectBuilder() {
    super(null);
  }

  @Override
  public Object build() {
    return new Object();
  }

}
