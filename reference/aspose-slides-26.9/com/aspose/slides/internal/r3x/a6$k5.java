package com.aspose.slides.internal.r3x;

import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;

class a6$k5 implements a6$c8 {
   @Override
   public com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, m1 var2, float var3, float var4) {
      com.aspose.slides.internal.o9b.l6 var5;
      if (t4.l6(var1.s7())) {
         var5 = new com.aspose.slides.internal.o9b.l6(var1.e2(), var1.h0(), 2498570);
         z1 var6 = z1.n5(var5);
         var6.n5(var1, new j5(0, 0));
      } else {
         var5 = (com.aspose.slides.internal.o9b.l6)var1.deepClone();
      }

      int var12 = var1.e2();
      int var7 = var1.h0();
      int[][][] var8 = new int[var12][var7][4];

      for (int var9 = 0; var9 < var12; var9++) {
         for (int var10 = 0; var10 < var7; var10++) {
            com.aspose.slides.internal.o9b.c8 var11 = var1.l6(var9, var10);
            var8[var9][var10][0] = var11.s7() & 255;
            var8[var9][var10][1] = var11.x8() & 255;
            var8[var9][var10][2] = var11.n3() & 255;
            var8[var9][var10][3] = var11.y4() & 255;
         }
      }

      k5.n5(var8, var3, var4);

      for (int var13 = 0; var13 < var12; var13++) {
         for (int var14 = 0; var14 < var7; var14++) {
            var5.n5(
               var13, var14, com.aspose.slides.internal.o9b.c8.n5(var8[var13][var14][0], var8[var13][var14][1], var8[var13][var14][2], var8[var13][var14][3])
            );
         }
      }

      return var5;
   }
}
