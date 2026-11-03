package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class h6q {
   public static void n5(d4w var0, com.aspose.slides.internal.k4y.j7d var1, t5w var2) {
      if (var0 == null) {
         throw new ArgumentNullException("formatOverride");
      }

      if (var1 == null) {
         throw new ArgumentNullException("formatOverrideData");
      }

      var0.n5((int)var1.l6());
      var0.n5(var1.u3());
      if (var1.k5() != null) {
         var0.n5(new Format(var0));
         k5r.n5(var0.k5(), var1.k5(), var2);
      }
   }

   static void n5(d4w var0, com.aspose.slides.internal.k4y.j7d var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("formatOverride");
      }

      var1.n5(var0.n5() & 4294967295L);
      var1.n5(var0.l6());
      k5r.n5(var0.k5(), new h6q$1(var1), var2, null, false);
   }
}
