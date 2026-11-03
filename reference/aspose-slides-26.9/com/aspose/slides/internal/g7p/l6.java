package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.x4g.m3;
import java.util.ArrayList;
import java.util.List;

public abstract class l6<T extends com.aspose.slides.internal.w4c.l6> extends n5<T> {
   protected float[] l6;
   protected float[] k5;

   protected l6(m3 var1) {
      super(var1);
      this.l6 = var1.c8().l6();
      this.k5 = var1.c8().k5();
   }

   protected com.aspose.slides.internal.o9b.c8 n5(double var1, com.aspose.slides.internal.o9b.c8 var3, double var4, double var6, double var8, double var10) {
      double var12 = this.n5(var1, var4, var6, var8, var10);
      return this.n5(var3, var12);
   }

   protected com.aspose.slides.internal.o9b.c8 l6(double var1, com.aspose.slides.internal.o9b.c8 var3, double var4, double var6, double var8, double var10) {
      double var12 = 1.0 - this.n5(var1, var4, var6, var8, var10);
      return this.n5(var3, var12);
   }

   protected double n5(double var1, double var3, double var5, double var7, double var9) {
      double var13;
      if (var7 <= var9) {
         double var11 = (var1 - var3) / (var5 - var3);
         var13 = var7 + var11 * (var9 - var7);
      } else {
         double var15 = 1.0 - (var1 - var3) / (var5 - var3);
         var13 = var9 + var15 * (var7 - var9);
      }

      return var13;
   }

   protected List<com.aspose.slides.internal.o9b.c8[]> n5() {
      short var1 = 256;
      com.aspose.slides.internal.o9b.c8 var2 = this.n5.t2();
      com.aspose.slides.internal.o9b.c8 var3 = this.n5.y4()[0];
      ArrayList var4 = new ArrayList(this.k5.length - 1);

      for (int var5 = 0; var5 < this.k5.length - 1; var5++) {
         float var6 = this.k5[var5];
         float var7 = this.k5[var5 + 1];
         float var8 = this.l6[var5];
         float var9 = this.l6[var5 + 1];
         com.aspose.slides.internal.o9b.c8 var10 = com.aspose.slides.internal.y4x.n5.n5(var2, var3, var8, 1.0F - var8);
         com.aspose.slides.internal.o9b.c8 var11 = com.aspose.slides.internal.y4x.n5.n5(var2, var3, var9, 1.0F - var9);
         int var12 = (int)Math.ceil(Math.abs(var7 - var6) * 256.0F);
         com.aspose.slides.internal.y4x.k5 var13 = new com.aspose.slides.internal.y4x.k5(var12);
         com.aspose.slides.internal.o9b.c8[] var14 = var13.n5(var10, var11);
         var4.add(var14);
      }

      return var4;
   }

   protected com.aspose.slides.internal.o9b.c8 n5(List<com.aspose.slides.internal.o9b.c8[]> var1, double var2) {
      var2 = Math.max(0.0, Math.min(1.0, var2));

      for (int var4 = this.k5.length - 1; var4 > 0; var4--) {
         float var5 = this.k5[var4 - 1];
         float var6 = this.k5[var4];
         if (var5 <= var2 && var2 <= var6) {
            double var10 = (var2 - var5) / (var6 - var5);
            return this.n5((com.aspose.slides.internal.o9b.c8[])var1.get(var4 - 1), var10);
         }

         if (var6 <= var2 && var2 <= var5) {
            double var7 = (var5 - var2) / (var5 - var6);
            return this.n5((com.aspose.slides.internal.o9b.c8[])var1.get(var4 - 1), var7);
         }
      }

      return com.aspose.slides.internal.o9b.c8.n5(0);
   }
}
