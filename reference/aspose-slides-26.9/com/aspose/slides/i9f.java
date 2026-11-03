package com.aspose.slides;

final class i9f {
   private float n5;
   private final ColorFormat l6;
   private long k5;

   i9f(float var1, ColorFormat var2) {
      this.l6 = var2;
      this.n5(var1);
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.n5 = var1;
      this.u3();
   }

   public final IColorFormat l6() {
      return this.l6;
   }

   final void n5(i9f var1) {
      this.l6(var1);
      this.u3();
   }

   final void l6(i9f var1) {
      this.n5 = var1.n5();
      this.l6.n5((ColorFormat)var1.l6());
   }

   final void n5(IGradientStopEffectiveData var1) {
      this.n5 = var1.getPosition();
      this.l6.l6(((GradientStopEffectiveData)var1).n5().o8());
      this.u3();
   }

   final long k5() {
      return (this.k5 & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L;
   }

   private void u3() {
      this.k5++;
   }

   @Override
   public boolean equals(Object obj) {
      IGradientStop var2 = com.aspose.slides.internal.v6g.k5.n5(obj, IGradientStop.class);
      if (var2 == null) {
         return super.equals(obj);
      } else {
         return this.n5 != var2.getPosition() ? false : this.l6.equals(var2.getColor());
      }
   }

   @Override
   public int hashCode() {
      return 23456;
   }
}
