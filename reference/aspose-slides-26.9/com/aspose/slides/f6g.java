package com.aspose.slides;

final class f6g extends g8<ShapeBevel, f6g> implements IShapeBevelEffectiveData {
   private double l6 = 6.0;
   private double k5 = 6.0;
   private int u3 = 2;
   boolean n5;

   f6g(boolean var1) {
      this.n5 = var1;
   }

   final void n5() {
      this.l6 = 6.0;
      this.k5 = 6.0;
      this.u3 = 2;
   }

   @Override
   public final double getWidth() {
      return this.l6;
   }

   @Override
   public final double getHeight() {
      return this.k5;
   }

   @Override
   public final int getBevelType() {
      return this.u3;
   }

   final void n5(i7b var1) {
      f6g var2 = (f6g)var1;
      this.l6 = var2.l6;
      this.k5 = var2.k5;
      this.u3 = var2.u3;
      this.n5 = var2.n5;
   }

   void n5(i7b var1, ShapeBevel var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(ShapeBevel var1) {
      if (var1.getBevelType() != -1) {
         if (!com.aspose.slides.ms.System.j8.n5(var1.getWidth(), Double.NaN)) {
            this.l6 = var1.getWidth();
         }

         if (!com.aspose.slides.ms.System.j8.n5(var1.getHeight(), Double.NaN)) {
            this.k5 = var1.getHeight();
         }

         if (var1.getBevelType() != -1) {
            this.u3 = var1.getBevelType();
         }

         this.n5 = var1.u3();
      }
   }

   boolean n5(f6g var1) {
      return var1 == null
         ? false
         : com.aspose.slides.internal.n8e.v4.n5(this.l6, var1.l6) && com.aspose.slides.internal.n8e.v4.n5(this.k5, var1.k5) && this.u3 == var1.u3;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.f6g)recoveredArg);
   }
}
