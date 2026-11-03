package com.aspose.slides.ms.System;

public abstract class g7<T> extends z6 {
   public abstract boolean invoke(T var1);

   public final z7 beginInvoke(T obj, h0 callback, Object state) {
      return com.aspose.slides.internal.u5b.n5.n5(new j4(this, this, callback, state, obj));
   }

   public final boolean endInvoke(z7 result) {
      com.aspose.slides.internal.u5b.n5.n5(this, result);
      return com.aspose.slides.internal.v6g.k5.u3(this.peekResult(), boolean.class);
   }
}
