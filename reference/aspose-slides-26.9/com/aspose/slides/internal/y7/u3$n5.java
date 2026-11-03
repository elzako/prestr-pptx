package com.aspose.slides.internal.y7;

import java.io.StringReader;

public final class u3$n5<T> {
   private final Class<T> n5;
   private boolean l6;

   u3$n5(Class<T> var1) {
      this.n5 = var1;
   }

   public T n5(String var1) throws a6 {
      return new u3(new h0(new StringReader(var1)), this.l6).n5(this.n5);
   }
}
