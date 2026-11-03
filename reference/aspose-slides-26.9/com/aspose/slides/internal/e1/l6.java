package com.aspose.slides.internal.e1;

import com.aspose.slides.ms.System.q1;

public class l6 {
   public final n5 n5(com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3) {
      return this.n5(var1.y4(), var2.u3(), var3.u3(), 2);
   }

   public final n5 n5(com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3, int var4) {
      com.aspose.slides.internal.o9b.f2 var5 = new com.aspose.slides.internal.o9b.f2(var1.s7() / 2.0F, var1.k5() / 2.0F);
      com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1(var1.x8() + var5.l6(), var1.n3() + var5.k5());
      double var7 = q1.u3(var2.k5() - var6.k5(), var2.l6() - var6.l6());
      double var9 = q1.u3(var3.k5() - var6.k5(), var3.l6() - var6.l6());
      double var11 = n5(var7, var9, var4);
      var7 = com.aspose.slides.internal.c8e.k5.l6(var7);
      return new n5(var1.y4(), var7, var11);
   }

   private static double n5(double var0, double var2, int var4) {
      double var5 = l6(var0, var2, var4);
      if (var5 == 0.0) {
         return 360.0;
      }

      if (var4 == 2) {
         var5 = n5(var5);
      }

      return com.aspose.slides.internal.c8e.k5.l6(var5);
   }

   private static double n5(double var0) {
      if (var0 > Math.PI) {
         var0 -= Math.PI * 2;
      } else if (var0 < -Math.PI) {
         var0 += Math.PI * 2;
      }

      return var0;
   }

   private static double l6(double var0, double var2, int var4) {
      switch (var4) {
         case 0:
            if (var2 < var0) {
               var2 += Math.PI * 2;
            }
            break;
         case 1:
            if (var2 > var0) {
               var0 += Math.PI * 2;
            }
      }

      return var2 - var0;
   }
}
