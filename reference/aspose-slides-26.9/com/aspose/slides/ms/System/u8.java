package com.aspose.slides.ms.System;

import java.lang.ref.WeakReference;

public class u8 {
   private WeakReference<Object> n5 = null;

   public u8(Object var1) {
      this.n5 = new WeakReference<>(var1);
   }

   public Object n5() {
      return this.n5.get();
   }

   public boolean l6() {
      return this.n5.get() != null;
   }
}
