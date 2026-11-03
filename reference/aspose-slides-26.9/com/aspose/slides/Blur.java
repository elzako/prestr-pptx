package com.aspose.slides;

public final class Blur extends ImageTransformOperation implements IBlur, i4e {
   private double l6;
   private boolean k5;
   private r3 u3;

   Blur(r0g parentImmediate) {
      super(parentImmediate);
   }

   Blur(double radius, boolean grow, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = radius;
      this.k5 = grow;
      this.h0();
   }

   @Override
   public final double getRadius() {
      return this.l6;
   }

   @Override
   public final void setRadius(double value) {
      this.l6 = value;
      this.h0();
   }

   @Override
   public final boolean getGrow() {
      return this.k5;
   }

   @Override
   public final void setGrow(boolean value) {
      this.k5 = value;
      this.h0();
   }

   public final IBlurEffectiveData getEffective() {
      return this.l6();
   }

   final r3 l6() {
      if (this.u3 == null) {
         this.u3 = new r3(this);
      }

      return this.u3;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      com.aspose.slides.internal.o9b.l6 var3 = var1.s7();
      if (var3.s7() != 2498570) {
         var3 = var3.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var3.e2(), var3.h0()), 2498570);
      }

      n2d.n5(var3, (byte)0, 1);
      x9p.n5(var3, this.getRadius() * 12700.0 / 3.0, 3);
      return c0v.n5(var3);
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{super.n5(var1, var2), com.aspose.slides.ms.System.d2.u9(this.l6), this.k5});
   }

   @Override
   public boolean equals(Object obj) {
      Blur var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Blur.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6) && com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(this.k5), var2.k5);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
