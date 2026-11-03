package com.aspose.slides;

class e2c {
   static void n5(q7g var0, com.aspose.slides.internal.k4y.j8m var1, r8e[] var2, y2[] var3) {
      com.aspose.slides.internal.k4y.c7f var4 = var1.n5();
      int var5 = 0;

      for (byte var9 : var0.h0()) {
         com.aspose.slides.internal.k4y.g7 var10 = var4.n5(q7g.n5.n5(var9 & 255));
         switch (var9) {
            case 0:
            default:
               break;
            case 1:
               com.aspose.slides.internal.k4y.p7x var11 = (com.aspose.slides.internal.k4y.p7x)var10.l6();
               n5(var11.n5(), var0.n5()[var5], var0.n5()[var5 + 1], var2, var3);
               var5 += 2;
               break;
            case 2:
               com.aspose.slides.internal.k4y.c1x var12 = (com.aspose.slides.internal.k4y.c1x)var10.l6();
               n5(var12.n5(), var0.n5()[var5], var0.n5()[var5 + 1], var2, var3);
               var5 += 2;
               break;
            case 3:
               com.aspose.slides.internal.k4y.z6e var13 = (com.aspose.slides.internal.k4y.z6e)var10.l6();
               var13.n5(u7a.n5(var0.n5()[var5++], var2, var3));
               var13.l6(u7a.n5(var0.n5()[var5++], var2, var3));
               var13.k5(u7a.n5(var0.n5()[var5++], var2, var3));
               var13.u3(u7a.n5(var0.n5()[var5++], var2, var3));
               break;
            case 4:
               com.aspose.slides.internal.k4y.o6t var14 = (com.aspose.slides.internal.k4y.o6t)var10.l6();
               n5(var14.n5(), var0.n5()[var5], var0.n5()[var5 + 1], var2, var3);
               var5 += 2;
               n5(var14.l6(), var0.n5()[var5], var0.n5()[var5 + 1], var2, var3);
               var5 += 2;
               break;
            case 5:
               com.aspose.slides.internal.k4y.y8m var15 = (com.aspose.slides.internal.k4y.y8m)var10.l6();
               n5(var15.n5(), var0.n5()[var5], var0.n5()[var5 + 1], var2, var3);
               var5 += 2;
               n5(var15.l6(), var0.n5()[var5], var0.n5()[var5 + 1], var2, var3);
               var5 += 2;
               n5(var15.k5(), var0.n5()[var5], var0.n5()[var5 + 1], var2, var3);
               var5 += 2;
         }
      }

      var4.n5(var0.l6() / 12700.0);
      var4.l6(var0.k5() / 12700.0);
      var4.n5(var0.a6());
      var4.n5(var0.u9());
      var4.l6(var0.u3());
   }

   private static void n5(com.aspose.slides.internal.k4y.u1 var0, long var1, long var3, r8e[] var5, y2[] var6) {
      var0.n5(u7a.n5(var1, var5, var6));
      var0.l6(u7a.n5(var3, var5, var6));
   }
}
