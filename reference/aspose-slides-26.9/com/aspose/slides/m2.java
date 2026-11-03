package com.aspose.slides;

class m2 {
   static GeometryPath n5(float var0, float var1, com.aspose.slides.internal.o9b.w1 var2) {
      boolean var3 = var2.l6() >= 0.0F && var2.l6() <= var0 && var2.k5() >= 0.0F && var2.k5() <= var1;
      int var4 = n5(var2.u3(), var0, var1);
      GeometryPath var5 = new GeometryPath();
      var5.moveTo(0.0F, 0.0F);
      switch (var4) {
         case 0:
            var5.lineTo(var0, 0.0F);
            if (!var3) {
               var5.lineTo(var0, var1 - var1 / 6.0F - var1 / 4.0F);
               var5.lineTo(var2.l6(), var2.k5());
               var5.lineTo(var0, var1 - var1 / 6.0F);
            }

            var5.lineTo(var0, var1);
            var5.lineTo(0.0F, var1);
            var5.lineTo(0.0F, 0.0F);
            break;
         case 1:
            var5.lineTo(var0, 0.0F);
            var5.lineTo(var0, var1);
            if (!var3) {
               var5.lineTo(var0 - var0 / 6.0F, var1);
               var5.lineTo(var2.l6(), var2.k5());
               var5.lineTo(var0 - var0 / 6.0F - var0 / 4.0F, var1);
            }

            var5.lineTo(0.0F, var1);
            var5.lineTo(0.0F, 0.0F);
            break;
         case 2:
            var5.lineTo(var0, 0.0F);
            var5.lineTo(var0, var1);
            if (!var3) {
               var5.lineTo(var0 / 6.0F + var0 / 4.0F, var1);
               var5.lineTo(var2.l6(), var2.k5());
               var5.lineTo(var0 / 6.0F, var1);
            }

            var5.lineTo(0.0F, var1);
            var5.lineTo(0.0F, 0.0F);
            break;
         case 3:
            var5.lineTo(var0, 0.0F);
            var5.lineTo(var0, var1);
            var5.lineTo(0.0F, var1);
            if (!var3) {
               var5.lineTo(0.0F, var1 - var1 / 6.0F);
               var5.lineTo(var2.l6(), var2.k5());
               var5.lineTo(0.0F, var1 - var1 / 6.0F - var1 / 4.0F);
            }

            var5.lineTo(0.0F, 0.0F);
            break;
         case 4:
            var5.lineTo(var0, 0.0F);
            var5.lineTo(var0, var1);
            var5.lineTo(0.0F, var1);
            if (!var3) {
               var5.lineTo(0.0F, var1 / 6.0F + var1 / 4.0F);
               var5.lineTo(var2.l6(), var2.k5());
               var5.lineTo(0.0F, var1 / 6.0F);
            }

            var5.lineTo(0.0F, 0.0F);
            break;
         case 5:
            if (!var3) {
               var5.lineTo(var0 / 6.0F, 0.0F);
               var5.lineTo(var2.l6(), var2.k5());
               var5.lineTo(var0 / 6.0F + var0 / 4.0F, 0.0F);
            }

            var5.lineTo(var0, 0.0F);
            var5.lineTo(var0, var1);
            var5.lineTo(0.0F, var1);
            var5.lineTo(0.0F, 0.0F);
            break;
         case 6:
            if (!var3) {
               var5.lineTo(var0 - var0 / 6.0F - var0 / 4.0F, 0.0F);
               var5.lineTo(var2.l6(), var2.k5());
               var5.lineTo(var0 - var0 / 6.0F, 0.0F);
            }

            var5.lineTo(var0, 0.0F);
            var5.lineTo(var0, var1);
            var5.lineTo(0.0F, var1);
            var5.lineTo(0.0F, 0.0F);
            break;
         case 7:
            var5.lineTo(var0, 0.0F);
            if (!var3) {
               var5.lineTo(var0, var1 / 6.0F);
               var5.lineTo(var2.l6(), var2.k5());
               var5.lineTo(var0, var1 / 6.0F + var1 / 4.0F);
            }

            var5.lineTo(var0, var1);
            var5.lineTo(0.0F, var1);
            var5.lineTo(0.0F, 0.0F);
      }

      return var5;
   }

   private static int n5(com.aspose.slides.internal.o9b.w1 var0, float var1, float var2) {
      com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1(var1 / 2.0F, var2 / 2.0F);
      float var4 = var3.l6();
      float var5 = var3.k5();
      double var6 = n5(var1, var2);
      if (var0.l6() >= var4) {
         if (var0.k5() > var5) {
            float var12 = var0.l6() - var4;
            float var15 = var0.k5() - var5;
            return n5(var12, var15) <= var6 ? 0 : 1;
         } else {
            float var11 = var0.l6() - var4;
            float var14 = var5 - var0.k5();
            return n5(var11, var14) <= var6 ? 7 : 6;
         }
      } else if (var0.k5() > var5) {
         float var10 = var4 - var0.l6();
         float var13 = var0.k5() - var5;
         return n5(var10, var13) <= var6 ? 3 : 2;
      } else {
         float var8 = var4 - var0.l6();
         float var9 = var5 - var0.k5();
         return n5(var8, var9) <= var6 ? 4 : 5;
      }
   }

   private static double n5(float var0, float var1) {
      return 90.0 - com.aspose.slides.ms.System.q1.t9(var0 / var1) * (180.0 / Math.PI);
   }
}
