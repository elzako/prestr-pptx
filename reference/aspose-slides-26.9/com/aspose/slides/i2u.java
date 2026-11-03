package com.aspose.slides;

final class i2u extends p9<Reflection> implements IReflectionEffectiveData, i7b, t9f {
   i2u(Reflection var1) {
      super(var1);
   }

   @Override
   public final double getBlurRadius() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getBlurRadius(), Double.NaN) ? this.n5.getBlurRadius() : 0.0;
   }

   @Override
   public final float getDirection() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getDirection(), Float.NaN) ? this.n5.getDirection() : 0.0F;
   }

   @Override
   public final double getDistance() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getDistance(), Double.NaN) ? this.n5.getDistance() : 0.0;
   }

   @Override
   public final byte getRectangleAlign() {
      return this.n5.getRectangleAlign() != -1 ? this.n5.getRectangleAlign() : 0;
   }

   @Override
   public final double getSkewHorizontal() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getSkewHorizontal(), Double.NaN) ? this.n5.getSkewHorizontal() : 0.0;
   }

   @Override
   public final double getSkewVertical() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getSkewVertical(), Double.NaN) ? this.n5.getSkewVertical() : 0.0;
   }

   @Override
   public final boolean getRotateShadowWithShape() {
      return this.n5.getRotateShadowWithShape();
   }

   @Override
   public final double getScaleHorizontal() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getScaleHorizontal(), Double.NaN) ? this.n5.getScaleHorizontal() : 100.0;
   }

   @Override
   public final double getScaleVertical() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getScaleVertical(), Double.NaN) ? this.n5.getScaleVertical() : 100.0;
   }

   @Override
   public final float getStartPosAlpha() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getStartPosAlpha(), Float.NaN) ? this.n5.getStartPosAlpha() : 0.0F;
   }

   @Override
   public final float getEndPosAlpha() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getEndPosAlpha(), Float.NaN) ? this.n5.getEndPosAlpha() : 0.0F;
   }

   @Override
   public final float getFadeDirection() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getFadeDirection(), Float.NaN) ? this.n5.getFadeDirection() : 0.0F;
   }

   @Override
   public final float getStartReflectionOpacity() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getStartReflectionOpacity(), Float.NaN) ? this.n5.getStartReflectionOpacity() : 0.0F;
   }

   @Override
   public final float getEndReflectionOpacity() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getEndReflectionOpacity(), Float.NaN) ? this.n5.getEndReflectionOpacity() : 0.0F;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      i2u var2 = com.aspose.slides.internal.v6g.k5.n5(obj, i2u.class);
      return var2 == null
         ? false
         : this.getBlurRadius() == var2.getBlurRadius()
            && this.getDistance() == var2.getDistance()
            && this.getDirection() == var2.getDirection()
            && this.getSkewHorizontal() == var2.getSkewHorizontal()
            && this.getSkewVertical() == var2.getSkewVertical()
            && this.getScaleHorizontal() == var2.getScaleHorizontal()
            && this.getScaleVertical() == var2.getScaleVertical()
            && this.getRotateShadowWithShape() == var2.getRotateShadowWithShape()
            && this.getRectangleAlign() == var2.getRectangleAlign()
            && this.getStartPosAlpha() == var2.getStartPosAlpha()
            && this.getEndPosAlpha() == var2.getEndPosAlpha()
            && this.getFadeDirection() == var2.getFadeDirection()
            && this.getStartReflectionOpacity() == var2.getStartReflectionOpacity()
            && this.getEndReflectionOpacity() == var2.getEndReflectionOpacity();
   }

   @Override
   public final c0v n5(c0v var1) {
      return var1;
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         com.aspose.slides.ms.System.j8.n5(this).s7(),
         ' ',
         com.aspose.slides.ms.System.d2.u9(this.getBlurRadius()),
         ' ',
         com.aspose.slides.ms.System.d2.u9(this.getDistance()),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.getDirection())
      });
   }
}
