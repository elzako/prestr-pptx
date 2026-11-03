package com.aspose.slides;

import java.awt.Color;

final class k0p extends w9s<OuterShadow, k0p> implements IOuterShadowEffectiveData {
   j3z n5;
   private double k5 = Double.NaN;
   private double u9 = Double.NaN;
   private float h0 = Float.NaN;
   private double c8 = Double.NaN;
   private double t2 = Double.NaN;
   private double s7 = Double.NaN;
   private double x8 = Double.NaN;
   private byte n3 = -1;
   private byte y4 = -1;
   static final k0p l6 = u3();

   k0p(OuterShadow var1) {
      super(var1, OuterShadow.class, k0p.class);
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

   @Override
   public final byte getRectangleAlign() {
      return this.y4;
   }

   @Override
   public final double getSkewHorizontal() {
      return this.c8;
   }

   @Override
   public final double getSkewVertical() {
      return this.t2;
   }

   @Override
   public final boolean getRotateShadowWithShape() {
      return this.n3 == 1;
   }

   @Override
   public final double getScaleHorizontal() {
      return this.s7;
   }

   @Override
   public final double getScaleVertical() {
      return this.x8;
   }

   static k0p u3() {
      k0p var0 = new k0p(null);
      var0.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.k5 = 0.0;
      var0.u9 = 0.0;
      var0.h0 = 0.0F;
      var0.c8 = 0.0;
      var0.t2 = 0.0;
      var0.s7 = 100.0;
      var0.x8 = 100.0;
      var0.n3 = 1;
      var0.y4 = 0;
      return var0;
   }

   void n5(i7b var1, OuterShadow var2) {
      k0p var3 = (k0p)var1;
      this.k5 = var3.k5;
      this.u9 = var3.u9;
      this.h0 = var3.h0;
      this.c8 = var3.c8;
      this.t2 = var3.t2;
      this.s7 = var3.s7;
      this.x8 = var3.x8;
      this.n3 = var3.n3;
      this.y4 = var3.y4;
      if (!com.aspose.slides.ms.System.j8.n5(var2.getBlurRadius(), Double.NaN)) {
         this.k5 = var2.getBlurRadius();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getDistance(), Double.NaN)) {
         this.u9 = var2.getDistance();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getDirection(), Float.NaN)) {
         this.h0 = var2.getDirection();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getSkewHorizontal(), Double.NaN)) {
         this.c8 = var2.getSkewHorizontal();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getSkewVertical(), Double.NaN)) {
         this.t2 = var2.getSkewVertical();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getScaleHorizontal(), Double.NaN)) {
         this.s7 = var2.getScaleHorizontal();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getScaleVertical(), Double.NaN)) {
         this.x8 = var2.getScaleVertical();
      }

      int var4 = var2.getRotateShadowWithShape() ? 1 : 0;
      if (var4 != -1) {
         this.n3 = (byte)var4;
      }

      if (var2.getRectangleAlign() != -1) {
         this.y4 = var2.getRectangleAlign();
      }

      this.a6().n5(var3.a6(), (ColorFormat)var2.getShadowColor());
   }

   @Override
   public void n5(IBaseSlide var1, w6a var2) {
      this.n5.n5(var1, var2);
   }

   boolean n5(k0p var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1)
            ? true
            : this.getBlurRadius() == var1.getBlurRadius()
               && this.getDistance() == var1.getDistance()
               && this.getDirection() == var1.getDirection()
               && this.getSkewHorizontal() == var1.getSkewHorizontal()
               && this.getSkewVertical() == var1.getSkewVertical()
               && this.getScaleHorizontal() == var1.getScaleHorizontal()
               && this.getScaleVertical() == var1.getScaleVertical()
               && this.getRotateShadowWithShape() == var1.getRotateShadowWithShape()
               && this.getRectangleAlign() == var1.getRectangleAlign()
               && this.a6().l6(var1.a6());
      }
   }

   final j3z a6() {
      if (this.n5 == null) {
         this.n5 = new j3z();
      }

      return this.n5;
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
         this.n5 != null ? this.n5.toString() : ""
      });
   }

   final boolean u9() {
      return this.getSkewHorizontal() != 0.0 || this.getSkewVertical() != 0.0;
   }

   final boolean h0() {
      return (this.s7 != 100.0 || this.x8 != 100.0) && (!com.aspose.slides.ms.System.d2.k5(this.s7) || !com.aspose.slides.ms.System.d2.k5(this.x8));
   }
}
