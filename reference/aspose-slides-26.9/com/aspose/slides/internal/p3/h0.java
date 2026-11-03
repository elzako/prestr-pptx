package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class h0 {
   public static void n5(y4 var0, com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      t1 var3 = new t1(0);
      y2 var4 = null;
      y2 var5 = null;
      j8 var6 = null;
      j8 var7 = null;
      if (var0 != null) {
         var0.c4();
      }

      List var8 = new List();

      while (var1.l6()) {
         j8 var9 = (j8)var1.k5();
         if (var9 != null) {
            if (var9.a6() >= 0) {
               if (var6 == null) {
                  var6 = var9;
               }

               var7 = var9;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var9, f0.class)) {
               var8.addItem(var9.k5());
               var5 = var9.k5().u3();
               if (var4 == null) {
                  var4 = var5;
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var9, j4$n5.class)) {
               var8.addItem(var9);
            }
         }
      }

      if (var6 != null) {
         if (var0 != null) {
            var0.n5(true, var0.l6(var6), var0.k5(var7));
         }

         w2 var10 = new w2(new com.aspose.slides.internal.r4.u3(var8));

         y2 var11;
         while ((var11 = var10.u9()) != null) {
            var3.n5(32, var11 == var4);
            var3.n5(128, var11 == var5);
            var3.n5(var2.m3());
            var3.h0(var11 == var4 ? var2.a0() : 0);
            var3.c8(var2.d2());
            var3.n5(var2.q0());
            var11.n5(var10, var3);
         }

         if (var0 != null) {
            var0.n5(false, var0.l6(var6), var0.k5(var7));
            var0.u3(var7);
         }
      }
   }
}
