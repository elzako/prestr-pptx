package com.aspose.slides.internal.u5b;

import com.aspose.slides.ms.System.a0;
import com.aspose.slides.ms.System.h0;

public abstract class l6<T> {
   private final a0 a;
   private final h0 b;
   private final Object c;

   protected l6(a0 var1, h0 var2, Object var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   protected abstract void beginInvoke();

   public h0 getCallback() {
      return this.b;
   }

   public Object getState() {
      return this.c;
   }

   public a0 getDelegate() {
      return this.a;
   }
}
