package com.aspose.slides;

import java.awt.Color;

final class d8f extends w9s<InnerShadow, d8f> implements IInnerShadowEffectiveData {
   private j3z l6;
   private double k5 = Double.NaN;
   private double u9 = Double.NaN;
   private float h0 = Float.NaN;
   static final d8f n5 = u3();

   d8f(InnerShadow var1) {
      super(var1, InnerShadow.class, d8f.class);
   }

   @Override
   public final double getBlurRadius() {
      return this.k5;
   }

   @Override
   public final float getDirection() {
      return this.h0;
   }

   @Override
   public final double getDistance() {
      return this.u9;
   }

   @Override
   public final Color getShadowColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.c8 l6() {
      return this.a6().n5();
   }

   static d8f u3() {
      d8f var0 = new d8f(null);
      var0.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.k5 = 0.0;
      var0.u9 = 0.0;
      var0.h0 = 0.0F;
      return var0;
   }

   void n5(i7b var1, InnerShadow var2) {
      d8f var3 = (d8f)var1;
      this.k5 = var3.k5;
      this.u9 = var3.u9;
      this.h0 = var3.h0;
      if (!com.aspose.slides.ms.System.j8.n5(var2.getBlurRadius(), Double.NaN)) {
         this.k5 = var2.getBlurRadius();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getDistance(), Double.NaN)) {
         this.u9 = var2.getDistance();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getDirection(), Float.NaN)) {
         this.h0 = var2.getDirection();
      }

      this.a6().n5(var3.a6(), (ColorFormat)var2.getShadowColor());
   }

   @Override
   public void n5(IBaseSlide var1, w6a var2) {
      this.l6.n5(var1, var2);
   }

   boolean n5(d8f var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1)
            ? true
            : this.getBlurRadius() == var1.getBlurRadius()
               && this.getDistance() == var1.getDistance()
               && this.getDirection() == var1.getDirection()
               && this.a6().l6(var1.a6());
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
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         super.n5(),
         ' ',
         com.aspose.slides.ms.System.d2.u9(this.k5),
         ' ',
         com.aspose.slides.ms.System.d2.u9(this.u9),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.h0),
         ' ',
         this.l6 != null ? this.l6.toString() : ""
      });
   }
}
