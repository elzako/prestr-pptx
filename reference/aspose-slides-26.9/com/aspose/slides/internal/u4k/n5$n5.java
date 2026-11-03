package com.aspose.slides.internal.u4k;

import java.awt.CompositeContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

class n5$n5 implements CompositeContext {
   private ColorModel l6;
   private ColorModel k5;
   // $VF: synthetic field
   final n5 n5;

   private n5$n5(n5 var1, ColorModel var2, ColorModel var3, RenderingHints var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public void compose(Raster src, Raster dstIn, WritableRaster dstOut) {
      Rectangle var4 = src.getBounds().intersection(dstIn.getBounds());
      Object var5 = this.l6.getDataElements(0, null);
      Object var6 = this.k5.getDataElements(0, null);
      int var7 = var4.x + var4.width;
      int var8 = var4.y + var4.height;
      int var9 = com.aspose.slides.internal.u4k.n5.n5(this.n5).l6() & 255;

      for (int var10 = var4.x; var10 < var7; var10++) {
         for (int var11 = var4.y; var11 < var8; var11++) {
            int var12 = this.l6.getRGB(src.getDataElements(var10, var11, var5));
            int var13 = var12 >> 24 & 0xFF;
            int var14 = var12 >> 16 & 0xFF;
            int var15 = var12 >> 8 & 0xFF;
            int var16 = var12 >> 0 & 0xFF;
            int var17 = this.k5.getRGB(dstIn.getDataElements(var10, var11, var6));
            int var18 = var17 >> 24 & 0xFF;
            int var19 = var17 >> 16 & 0xFF;
            int var20 = var17 >> 8 & 0xFF;
            int var21 = var17 >> 0 & 0xFF;
            if (com.aspose.slides.internal.u4k.n5.n5(this.n5).k5() == 0) {
               var19 = this.n5(var14, var19, var9);
               var20 = this.n5(var15, var20, var9);
               var21 = this.n5(var16, var21, var9);
               var18 = this.n5(var13, var18, var9);
            } else {
               var19 = this.n5(var14, var19, var9, var13);
               var20 = this.n5(var15, var20, var9, var13);
               var21 = this.n5(var16, var21, var9, var13);
               var18 = this.n5(var13, var18, var9, var13);
            }

            int var22 = (var18 << 24) + (var19 << 16) + (var20 << 8) + (var21 << 0);
            dstOut.setDataElements(var10, var11, this.k5.getDataElements(var22, var6));
         }
      }
   }

   private int n5(int var1, int var2, int var3) {
      int var4 = (int)(var1 * (var3 / 255.0F) + var2 * (1.0F - var3 / 255.0F));
      if (var4 > 255) {
         var4 = 255;
      }

      return var4;
   }

   private int n5(int var1, int var2, int var3, int var4) {
      int var5 = (int)(var1 * (var3 / 255.0F) + var2 * (1.0F - var4 / 255.0F));
      if (var5 > 255) {
         var5 = 255;
      }

      return var5;
   }

   @Override
   public void dispose() {
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/u4k/n5;Ljava/awt/image/ColorModel;Ljava/awt/image/ColorModel;Ljava/awt/RenderingHints;Lcom/aspose/slides/internal/u4k/l6;)V -> (Lcom/aspose/slides/internal/u4k/n5;Ljava/awt/image/ColorModel;Ljava/awt/image/ColorModel;Ljava/awt/RenderingHints;)V
   n5$n5(com.aspose.slides.internal.u4k.n5 recoveredArg0, java.awt.image.ColorModel recoveredArg1, java.awt.image.ColorModel recoveredArg2, java.awt.RenderingHints recoveredArg3, com.aspose.slides.internal.u4k.l6 recoveredArg4) {
      this(recoveredArg0, recoveredArg1, recoveredArg2, recoveredArg3);
   }
}
