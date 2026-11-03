package com.aspose.slides.internal.g3y;

import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.IndexColorModel;

class a6$n5 {
   public static BufferedImage n5(BufferedImage var0) {
      IndexColorModel var1 = new IndexColorModel(1, 2, new byte[]{0, -1}, new byte[]{0, -1}, new byte[]{0, -1});
      BufferedImage var2 = new BufferedImage(var0.getWidth(), var0.getHeight(), 12, var1);
      ColorConvertOp var3 = new ColorConvertOp(var0.getColorModel().getColorSpace(), var2.getColorModel().getColorSpace(), null);
      var3.filter(var0, var2);
      return var2;
   }

   public static BufferedImage l6(BufferedImage var0) {
      int[] var1 = new int[]{0, 8388608, 32768, 8421376, 128, 8388736, 32896, 8421504, 12632256, 16711680, 65280, 16776960, 255, 16711935, 65535, 16777215};
      return n5(var0, var1);
   }

   public static BufferedImage n5(BufferedImage var0, int[] var1) {
      IndexColorModel var2 = new IndexColorModel(4, var1.length, var1, 0, false, 1, 0);
      BufferedImage var3 = new BufferedImage(var0.getWidth(), var0.getHeight(), 12, var2);
      ColorConvertOp var4 = new ColorConvertOp(var0.getColorModel().getColorSpace(), var3.getColorModel().getColorSpace(), null);
      var4.filter(var0, var3);
      return var3;
   }

   public static BufferedImage k5(BufferedImage var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(), var0.getHeight(), 13);
      ColorConvertOp var2 = new ColorConvertOp(var0.getColorModel().getColorSpace(), var1.getColorModel().getColorSpace(), null);
      var2.filter(var0, var1);
      return var1;
   }

   public static BufferedImage u3(BufferedImage var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(), var0.getHeight(), 1);
      ColorConvertOp var2 = new ColorConvertOp(var0.getColorModel().getColorSpace(), var1.getColorModel().getColorSpace(), null);
      var2.filter(var0, var1);
      return var1;
   }

   public static BufferedImage a6(BufferedImage var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(), var0.getHeight(), 2);
      ColorConvertOp var2 = new ColorConvertOp(var0.getColorModel().getColorSpace(), var1.getColorModel().getColorSpace(), null);
      var2.filter(var0, var1);
      return var1;
   }
}
