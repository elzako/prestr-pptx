package com.aspose.slides.ms.System;

public abstract class n5<T> extends z6 {
   public abstract void invoke(T var1);

   public final z7 beginInvoke(T obj, h0 callback, Object state) {
      return com.aspose.slides.internal.u5b.n5.n5(new l6(this, this, callback, state, obj));
   }

   public final void endInvoke(z7 result) {
      com.aspose.slides.internal.u5b.n5.n5(this, result);
   }
}
