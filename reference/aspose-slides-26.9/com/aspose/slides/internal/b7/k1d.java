package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

abstract class k1d {
   private w9 n5 = new w9(0.0, 0.0);

   public final w9 u3() {
      return this.n5;
   }

   public final void n5(w9 var1) {
      if (null == var1) {
         throw new ArgumentNullException();
      }

      this.n5 = var1;
   }

   public abstract j6 k5();

   protected k1d() {
   }

   protected static double a6() {
      return 127.0;
   }
}
