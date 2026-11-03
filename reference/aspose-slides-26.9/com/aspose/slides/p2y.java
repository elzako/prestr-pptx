package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

class p2y implements com.aspose.slides.internal.s6.k7 {
   private final p2y$n5[] n5;
   private final float l6;
   private final float k5;

   public p2y(float var1, float var2, int var3, float var4, float var5, com.aspose.slides.internal.o9b.c8[] var6) {
      this.n5 = this.n5(var1, var2, var3, var6);
      this.l6 = var4;
      this.k5 = var5;
   }

   @Override
   public final void getPixel(float u, float v, com.aspose.slides.internal.s6.g7[] color) {
      this.n5(u, v).n5().n5(color[0]);
   }

   @Override
   public final void beginRender() {
   }

   @Override
   public final void endRender() {
   }

   @Override
   public final void updateCurrentLevel(float approximateSize) {
   }

   public static com.aspose.slides.internal.o9b.c8[] n5(Chart var0) {
      if (var0 == null) {
         throw new ArgumentNullException("chart");
      }

      if (!u6p.l6(var0)) {
         return (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), 0)
         );
      }

      com.aspose.slides.internal.o9b.c8[] var1 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), 15)
      );
      var0.n5((byte)4).n5(var1[0]);
      var0.n5((byte)5).n5(var1[1]);
      var0.n5((byte)6).n5(var1[2]);
      var0.n5((byte)7).n5(var1[3]);
      var0.n5((byte)8).n5(var1[4]);
      var0.n5((byte)9).n5(var1[5]);
      ColorFormat var2 = new ColorFormat(var0, 4, true);
      var2.getColorTransform().add(16, 0.6F);
      var2.u3().n5(var1[6]);
      var2.setSchemeColor(5);
      var2.u3().n5(var1[7]);
      var2.setSchemeColor(6);
      var2.u3().n5(var1[8]);
      var2.setSchemeColor(7);
      var2.u3().n5(var1[9]);
      var2.setSchemeColor(8);
      var2.u3().n5(var1[10]);
      var2.setSchemeColor(9);
      var2.u3().n5(var1[11]);
      var2.getColorTransform().add(15, 0.2F);
      var2.setSchemeColor(4);
      var2.u3().n5(var1[12]);
      var2.setSchemeColor(5);
      var2.u3().n5(var1[13]);
      var2.setSchemeColor(6);
      var2.u3().n5(var1[14]);
      return var1;
   }

   private p2y$n5 n5(float var1, float var2) {
      float var3 = this.k5 + var2 * (this.l6 - this.k5);

      for (p2y$n5 var7 : this.n5) {
         if (var7.n5(var3)) {
            return var7;
         }
      }

      return this.n5[0];
   }

   private p2y$n5[] n5(float var1, float var2, int var3, com.aspose.slides.internal.o9b.c8[] var4) {
      int var5 = var3 - 1;
      float var6 = (var1 - var2) / var5;
      List var7 = new List();

      for (int var8 = 0; var8 < var5; var8++) {
         com.aspose.slides.internal.o9b.c8 var9 = var4[var8].o8();
         float var10 = (var2 + var8 * var6) / (var1 - var2);
         float var11 = (var2 + (var8 + 1) * var6) / (var1 - var2);
         var7.addItem(new p2y$n5(var10, var11, var9.o8()));
      }

      return (p2y$n5[])var7.toArray(new p2y$n5[0]);
   }
}
