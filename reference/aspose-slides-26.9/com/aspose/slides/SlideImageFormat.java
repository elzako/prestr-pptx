package com.aspose.slides;

public class SlideImageFormat implements ISlideImageFormat {
   private int n5;
   private SVGOptions l6;
   private float k5;
   private int u3;

   public static SlideImageFormat svg(SVGOptions options) {
      SlideImageFormat var1 = new SlideImageFormat();
      var1.n5 = 0;
      var1.l6 = options;
      return var1;
   }

   public static SlideImageFormat bitmap(float scale, int imageFormat) {
      SlideImageFormat var2 = new SlideImageFormat();
      var2.n5 = 1;
      var2.k5 = scale;
      var2.u3 = imageFormat;
      return var2;
   }

   final int n5() {
      return this.n5;
   }

   final int l6() {
      return this.u3;
   }

   final SVGOptions k5() {
      return this.l6;
   }

   final float u3() {
      return this.k5;
   }
}
