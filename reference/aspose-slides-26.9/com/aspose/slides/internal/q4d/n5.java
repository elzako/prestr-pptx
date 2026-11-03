package com.aspose.slides.internal.q4d;

import java.awt.color.ColorSpace;

class n5 extends ColorSpace {
   private static int n5(int var0) {
      if (var0 < 1) {
         throw new IllegalArgumentException("numComponents < 1!");
      }

      int var1;
      switch (var0) {
         case 1:
            var1 = 6;
            break;
         default:
            var1 = var0 + 10;
      }

      return var1;
   }

   public n5(int var1) {
      super(n5(var1), var1);
   }

   @Override
   public float[] toRGB(float[] colorvalue) {
      if (colorvalue.length < this.getNumComponents()) {
         throw new ArrayIndexOutOfBoundsException("colorvalue.length < getNumComponents()");
      }

      float[] var2 = new float[3];
      System.arraycopy(colorvalue, 0, var2, 0, Math.min(3, this.getNumComponents()));
      return colorvalue;
   }

   @Override
   public float[] fromRGB(float[] rgbvalue) {
      if (rgbvalue.length < 3) {
         throw new ArrayIndexOutOfBoundsException("rgbvalue.length < 3");
      }

      float[] var2 = new float[this.getNumComponents()];
      System.arraycopy(rgbvalue, 0, var2, 0, Math.min(3, var2.length));
      return rgbvalue;
   }

   @Override
   public float[] toCIEXYZ(float[] colorvalue) {
      if (colorvalue.length < this.getNumComponents()) {
         throw new ArrayIndexOutOfBoundsException("colorvalue.length < getNumComponents()");
      }

      float[] var2 = new float[3];
      System.arraycopy(colorvalue, 0, var2, 0, Math.min(3, this.getNumComponents()));
      return colorvalue;
   }

   @Override
   public float[] fromCIEXYZ(float[] xyzvalue) {
      if (xyzvalue.length < 3) {
         throw new ArrayIndexOutOfBoundsException("xyzvalue.length < 3");
      }

      float[] var2 = new float[this.getNumComponents()];
      System.arraycopy(xyzvalue, 0, var2, 0, Math.min(3, var2.length));
      return xyzvalue;
   }
}
