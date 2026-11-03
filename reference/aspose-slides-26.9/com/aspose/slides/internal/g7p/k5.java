package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.x4g.m3;
import java.util.List;

public abstract class k5<T extends com.aspose.slides.internal.w4c.l6> extends n5<T> {
   protected k5(m3 var1) {
      super(var1);
   }

   protected com.aspose.slides.internal.o9b.c8 n5(double var1, List<com.aspose.slides.internal.o9b.c8[]> var3, float[] var4) {
      var1 = Math.max(0.0, Math.min(1.0, var1));
      int var5 = var3.size() - 1;

      for (int var6 = var4.length - 1; var6 > 0; var5--) {
         float var7 = var4[var6 - 1];
         float var8 = var4[var6];
         if (var7 > var8) {
            float var9 = var7;
            var7 = var8;
            var8 = var9;
         }

         if (var7 <= var1 && var1 <= var8) {
            double var10 = this.n5(var1, var7, var8);
            return this.n5((com.aspose.slides.internal.o9b.c8[])var3.get(var5), var10);
         }

         var6--;
      }

      return com.aspose.slides.internal.o9b.c8.n5(0);
   }

   protected com.aspose.slides.internal.o9b.c8 n5(double var1, com.aspose.slides.internal.o9b.c8[] var3, float[] var4) {
      var1 = Math.max(0.0, Math.min(1.0, var1));

      for (int var5 = var4.length - 1; var5 > 0; var5--) {
         com.aspose.slides.internal.o9b.c8 var6 = var3[var5 - 1];
         com.aspose.slides.internal.o9b.c8 var7 = var3[var5];
         float var8 = var4[var5 - 1];
         float var9 = var4[var5];
         if (var8 > var9) {
            com.aspose.slides.internal.o9b.c8 var10 = var6;
            var6 = var7;
            var7 = var10;
            float var11 = var8;
            var8 = var9;
            var9 = var11;
         }

         if (var8 <= var1 && var1 <= var9) {
            com.aspose.slides.internal.o9b.c8 var17 = this.n5(var1, var7, var8, var9);
            com.aspose.slides.internal.o9b.c8 var18 = this.l6(var1, var6, var8, var9);
            int var12 = (var17.s7() & 255) + (var18.s7() & 255);
            int var13 = (var17.x8() & 255) + (var18.x8() & 255);
            int var14 = (var17.n3() & 255) + (var18.n3() & 255);
            int var15 = (var17.y4() & 255) + (var18.y4() & 255);
            return this.n5(255, var13, var14, var15);
         }
      }

      return com.aspose.slides.internal.o9b.c8.n5(0);
   }

   protected com.aspose.slides.internal.o9b.c8 n5(double var1, com.aspose.slides.internal.o9b.c8 var3, double var4, double var6) {
      double var8 = this.n5(var1, var4, var6);
      return this.n5(var3, var8);
   }

   protected com.aspose.slides.internal.o9b.c8 l6(double var1, com.aspose.slides.internal.o9b.c8 var3, double var4, double var6) {
      double var8 = 1.0 - this.n5(var1, var4, var6);
      return this.n5(var3, var8);
   }

   protected double n5(double var1, double var3, double var5) {
      return (var1 - var3) / (var5 - var3);
   }
}
