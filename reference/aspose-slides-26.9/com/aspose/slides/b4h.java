package com.aspose.slides;

import java.awt.Color;

final class b4h extends w9s<Glow, b4h> implements IGlowEffectiveData {
   private j3z l6;
   private double k5 = Double.NaN;
   static final b4h n5 = u3();

   b4h(Glow var1) {
      super(var1, Glow.class, b4h.class);
   }

   @Override
   public final double getRadius() {
      return this.k5;
   }

   @Override
   public final Color getColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.c8 l6() {
      return this.l6.n5();
   }

   static b4h u3() {
      b4h var0 = new b4h(null);
      var0.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.k5 = 0.0;
      return var0;
   }

   void n5(i7b var1, Glow var2) {
      b4h var3 = (b4h)var1;
      this.k5 = var3.k5;
      if (!com.aspose.slides.ms.System.j8.n5(var2.getRadius(), Double.NaN)) {
         this.k5 = var2.getRadius();
      }

      this.a6().n5(var3.a6(), (ColorFormat)var2.getColor());
   }

   @Override
   public void n5(IBaseSlide var1, w6a var2) {
      this.l6.n5(var1, var2);
   }

   boolean n5(b4h var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1) ? true : this.getRadius() == var1.getRadius() && this.a6().l6(var1.a6());
      }
   }

   final j3z a6() {
      if (this.l6 == null) {
         this.l6 = new j3z();
      }

      return this.l6;
   }

   @Override
   public c0v n5(c0v var1) {
      return var1;
   }

   @Override
   public String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{super.n5(), ' ', com.aspose.slides.ms.System.d2.u9(this.k5), ' ', this.l6 != null ? this.l6.toString() : ""});
   }
}
