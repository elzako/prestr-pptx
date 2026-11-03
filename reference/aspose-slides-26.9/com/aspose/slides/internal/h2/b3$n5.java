package com.aspose.slides.internal.h2;

public class b3$n5 extends t4 {
   public b3$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 n5() {
      return new b3();
   }

   private static boolean n5(com.aspose.slides.internal.f2.k5 var0) {
      return com.aspose.slides.internal.v6g.k5.l6(var0, t1.class) && ((t1)var0).e2() < 0.0 || var0.k5() && var0.u3() < 0;
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, b3.class)) {
         return var1;
      }

      if (this.n5 != 17 && this.n5 != 127) {
         return super.l6(var1, var2, var3);
      }

      com.aspose.slides.internal.f2.k5 var4 = var1.c8();
      if (var4 != null && n5(var4)) {
         var1 = j5.n5;
      }

      b3 var5 = (b3)super.l6(var1, var2, var3);
      if ((b3.n5(var5) & 2) != 0) {
         b3.n5(var5, 2);
      }

      return var5;
   }

   @Override
   public a5 n5(a5 var1, int var2, a5 var3) {
      com.aspose.slides.internal.f2.l6 var4 = (com.aspose.slides.internal.f2.l6)var1.g_();
      if (this.n5 == 17 || this.n5 == 127) {
         com.aspose.slides.internal.f2.k5 var5 = var3.c8();
         if (var5 != null && n5(var5)) {
            var4.n5(var2, j5.n5, false);
            return var1;
         }
      }

      var4.n5(var2, var3, false);
      return var1;
   }
}
