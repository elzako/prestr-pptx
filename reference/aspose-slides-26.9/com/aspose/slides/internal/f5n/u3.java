package com.aspose.slides.internal.f5n;

import com.aspose.slides.internal.b3z.s7;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.l5.e2;
import com.aspose.slides.internal.l5.u9;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class u3 {
   public static com.aspose.slides.internal.l5.l6 n5(
      com.aspose.slides.internal.w5i.u3 var0, com.aspose.slides.internal.w9s.u3 var1, t2 var2, y1 var3, y1 var4, float var5
   ) {
      var0.n5(var1.u3());
      boolean var6 = var0.a0() == 1;
      y1 var7 = (var6 ? var3 : var4).y4();
      n3 var8 = var1.a6();
      int var9 = var8.n5;
      var8.n5 = var6 ? 1 : 0;
      float var10 = var8.n5(var0.d5(), "x", var0, var7.c8().a6());
      float var11 = var8.n5(var0.s3(), "y", var0, var7.c8().a6());
      float var12 = var8.n5(var0.p8(), "width", var0, var7.c8().a6());
      float var13 = var8.n5(var0.f2(), "height", var0, var7.c8().a6());
      var8.n5 = var9;
      if (q1.n5(var12) < 0.001 && q1.n5(var13) < 0.001) {
         return null;
      }

      s7 var14 = var0.i1();
      boolean var15 = var14 != null;
      y1 var16 = (var15 ? var14.n5(var8) : var4).y4();
      m1 var17 = new m1();

      try {
         boolean var18 = var0.d2() == 1;
         f2 var19 = new f2(var12, var13);
         if (var15) {
            float var20 = var12 / var16.s7();
            float var21 = var13 / var16.k5();
            var17.n5(var20, var21);
            var17.k5(-var16.x8(), -var16.n3());
         } else if (var18) {
            var17.n5(var7.s7(), var7.k5());
         }

         com.aspose.slides.internal.l5.u3 var32 = new com.aspose.slides.internal.l5.u3(
            new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(q1.u3(var12), 14), com.aspose.slides.internal.v6g.k5.u3(q1.u3(var13), 14)
            )
         );
         u9 var33 = u9.n5(var32);

         try {
            var33.n5(var17);
            var33.k5(2);
            var33.l6(2);
            if (var15) {
               var33.l6(new a0(var16.y4()));
            }

            com.aspose.slides.internal.w9s.u3 var22 = new com.aspose.slides.internal.w9s.u3(var33, var1.k5(), var1.u3(), var8, var1.u9(), var1.h0(), var1.l6());
            n5(var22, var0, var7.c8().a6());
         } finally {
            if (var33 != null) {
               var33.dispose();
            }
         }

         e2 var34 = new e2(var32);
         m1 var23 = var0.n5(var8, var19.a6());
         var23.l6(var10, var11, 1);
         var34.n5(var23);
         return var34;
      } finally {
         if (var17 != null) {
            var17.dispose();
         }
      }
   }

   public static void n5(com.aspose.slides.internal.w9s.u3 var0, com.aspose.slides.internal.w5i.u3 var1, f2 var2) {
      if (!var1.m1() && var1.b3() != null) {
         n5(var0, var1.b3(), var2.a6());
      }

      var0.n5(var1, var2.a6(), null);
   }
}
