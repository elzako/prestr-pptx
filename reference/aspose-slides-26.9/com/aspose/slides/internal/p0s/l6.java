package com.aspose.slides.internal.p0s;

import java.awt.color.ColorSpace;

public final class l6 extends ColorSpace {
   private static ColorSpace n5 = null;
   private ColorSpace l6 = ColorSpace.getInstance(1004);

   public static final synchronized ColorSpace n5() {
      if (n5 == null) {
         n5 = new l6();
      }

      return n5;
   }

   private l6() {
      super(9, 4);
   }

   @Override
   public boolean equals(Object o) {
      return o != null && o instanceof l6;
   }

   @Override
   public int hashCode() {
      return n5.hashCode();
   }

   @Override
   public float[] toRGB(float[] colorvalue) {
      float var2 = colorvalue[0];
      float var3 = colorvalue[1];
      float var4 = colorvalue[2];
      float var5 = colorvalue[3];
      float var6 = 1.0F - var5;
      float[] var7 = new float[]{var6 * (1.0F - var2), var6 * (1.0F - var3), var6 * (1.0F - var4)};

      for (int var8 = 0; var8 < 3; var8++) {
         float var9 = var7[var8];
         if (var9 < 0.0F) {
            var9 = 0.0F;
         }

         if (var9 < 0.0031308F) {
            var7[var8] = 12.92F * var9;
         } else {
            if (var9 > 1.0F) {
               var9 = 1.0F;
            }

            var7[var8] = (float)(1.055 * Math.pow(var9, 0.4166666666666667) - 0.055);
         }
      }

      return var7;
   }

   @Override
   public float[] fromRGB(float[] rgbvalue) {
      for (int var2 = 0; var2 < 3; var2++) {
         if (rgbvalue[var2] < 0.040449936F) {
            rgbvalue[var2] /= 12.92F;
         } else {
            rgbvalue[var2] = (float)Math.pow((rgbvalue[var2] + 0.055) / 1.055, 2.4);
         }
      }

      float var7 = 1.0F - rgbvalue[0];
      float var3 = 1.0F - rgbvalue[1];
      float var4 = 1.0F - rgbvalue[2];
      float var5 = Math.min(var7, Math.min(var3, var4));
      if (var5 != 1.0F) {
         float var6 = 1.0F - var5;
         var7 = (var7 - var5) / var6;
         var3 = (var3 - var5) / var6;
         var4 = (var4 - var5) / var6;
      } else {
         var4 = 0.0F;
         var3 = 0.0F;
         var7 = 0.0F;
      }

      return new float[]{var7, var3, var4, var5};
   }

   @Override
   public float[] toCIEXYZ(float[] colorvalue) {
      return this.l6.toCIEXYZ(this.toRGB(colorvalue));
   }

   @Override
   public float[] fromCIEXYZ(float[] xyzvalue) {
      return this.fromRGB(this.l6.fromCIEXYZ(xyzvalue));
   }
}
