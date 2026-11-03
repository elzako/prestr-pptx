package com.aspose.slides.internal.r3x;

import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.WritableRaster;

public class n5 {
   public static BufferedImage n5(BufferedImage var0, int var1, int var2, double var3, double var5) {
      float[] var7 = n5(var1, 1, var3, var5);
      float[] var8 = n5(1, var2, var3, var5);
      Kernel var9 = new Kernel(var7.length, 1, var7);
      Kernel var10 = new Kernel(1, var8.length, var8);
      RenderingHints var11 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
      ConvolveOp var12 = new ConvolveOp(var9, 1, var11);
      ConvolveOp var13 = new ConvolveOp(var10, 1, var11);
      BufferedImage var14 = var12.filter(var0, null);
      BufferedImage var15 = n5(var14);
      return var13.filter(var15, var14);
   }

   public static BufferedImage l6(BufferedImage var0, int var1, int var2, double var3, double var5) {
      float[] var7 = n5(var1, var2, var3, var5);
      Kernel var8 = new Kernel(var1, var2, var7);
      RenderingHints var9 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
      ConvolveOp var10 = new ConvolveOp(var8, 1, var9);
      return var10.filter(var0, null);
   }

   public static float[] n5(int var0, int var1, double var2, double var4) {
      float[] var6 = new float[var0 * var1];
      float var7 = 0.0F;

      for (int var8 = 0; var8 < var1; var8++) {
         for (int var9 = 0; var9 < var0; var9++) {
            int var10 = var8 * var0 + var9;
            int var11 = var9 - var0 / 2;
            int var12 = var8 - var1 / 2;
            var6[var10] = (float)Math.pow(Math.E, -(var11 * var11 + var12 * var12) / (2.0 * (var2 * var4)));
            var7 += var6[var10];
         }
      }

      for (int var13 = 0; var13 < var6.length; var13++) {
         var6[var13] /= var7;
      }

      return var6;
   }

   static BufferedImage n5(BufferedImage var0) {
      ColorModel var1 = var0.getColorModel();
      boolean var2 = var1.isAlphaPremultiplied();
      WritableRaster var3 = var0.copyData(null);
      return new BufferedImage(var1, var3, var2, null);
   }
}
