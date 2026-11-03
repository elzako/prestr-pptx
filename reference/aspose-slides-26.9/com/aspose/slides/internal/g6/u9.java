package com.aspose.slides.internal.g6;

public class u9 {
   public final com.aspose.slides.internal.m9.c8 n5(com.aspose.slides.internal.x6.n5 var1) {
      com.aspose.slides.internal.q5.a6 var2 = (com.aspose.slides.internal.q5.a6)var1.l6(com.aspose.slides.internal.x6.k5.c4);
      com.aspose.slides.internal.q5.h0 var3 = (com.aspose.slides.internal.q5.h0)var1.l6(com.aspose.slides.internal.x6.k5.a6);
      com.aspose.slides.internal.q5.c8 var4 = (com.aspose.slides.internal.q5.c8)var1.l6(com.aspose.slides.internal.x6.k5.u9);
      com.aspose.slides.internal.q5.u3 var5 = (com.aspose.slides.internal.q5.u3)var1.l6(com.aspose.slides.internal.x6.k5.k5);
      int var6 = var5.u9();
      int var7 = var2.a6();
      int var8 = var4.a6();
      t2 var9 = new t2();

      for (int var10 = 0; var10 < var7; var10++) {
         int var11 = var2.n5(var10);

         for (int var12 = 0; var12 < var8; var12++) {
            int var13 = ((64 * var11 * var3.l6(var12) + var6 / 2) / var6 + 32) / 64;
            int var14 = var2.n5(var10, var12) - var13;
            var9.n5(var14);
         }
      }

      var9.n5();
      byte[] var15 = var9.l6();
      int var16 = var15.length + 8 + 2 * var7;
      com.aspose.slides.internal.m9.c8 var17 = com.aspose.slides.internal.m9.c8.n3(var16);
      var17.u3(0, 0);
      var17.u3(2, var7);
      var17.k5(4, (long)var2.u9());

      for (int var18 = 0; var18 < var7; var18++) {
         var17.n5(8 + 2 * var18, (byte)var2.n5(var18));
         var17.n5(8 + 2 * var18 + 1, (byte)var2.l6(var18));
      }

      var17.n5(8 + 2 * var7, var15);
      return var17;
   }
}
