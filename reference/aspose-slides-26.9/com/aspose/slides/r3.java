package com.aspose.slides;

final class r3 extends p9<Blur> implements IBlurEffectiveData, i7b, t9f {
   r3(Blur var1) {
      super(var1);
   }

   @Override
   public final double getRadius() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getRadius(), Double.NaN) ? this.n5.getRadius() : 0.0;
   }

   @Override
   public final boolean getGrow() {
      return this.n5.getGrow();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      r3 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, r3.class);
      return var2 == null ? false : this.getRadius() == var2.getRadius() && this.getGrow() == var2.getGrow();
   }

   @Override
   public final c0v n5(c0v var1) {
      return var1;
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         com.aspose.slides.ms.System.j8.n5(this).s7(), ' ', com.aspose.slides.ms.System.d2.u9(this.getRadius()), ' ', this.getGrow()
      });
   }
}
