package com.aspose.slides.internal.v6g;

public class c8<T> extends ThreadLocal<T> {
   T n5;

   public c8(T var1) {
      this.n5 = (T)var1;
   }

   @Override
   protected T initialValue() {
      return this.n5;
   }
}
