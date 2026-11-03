package com.aspose.slides;

import java.awt.Color;

public class GradientStopEffectiveData implements IGradientStopEffectiveData, i7b {
   private float l6;
   j3z n5;

   GradientStopEffectiveData(float position, ColorFormat color) {
      this.l6 = position;
      this.n5 = new j3z(color);
   }

   GradientStopEffectiveData(GradientStopEffectiveData source) {
      this.l6 = source.l6;
      this.n5 = new j3z(source.n5);
   }

   final void n5(IBaseSlide var1, w6a var2) {
      this.n5.n5(var1, var2);
   }

   @Override
   public final float getPosition() {
      return this.l6;
   }

   @Override
   public final Color getColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.n5());
   }

   com.aspose.slides.internal.o9b.c8 n5() {
      return this.n5.n5();
   }

   @Override
   public boolean equals(Object obj) {
      GradientStopEffectiveData var2 = com.aspose.slides.internal.v6g.k5.n5(obj, GradientStopEffectiveData.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6) && com.aspose.slides.internal.n8e.v4.n5(this.n5, var2.n5);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
