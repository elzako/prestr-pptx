package com.aspose.slides;

import java.awt.Color;

final class u0y extends w9s<PresetShadow, u0y> implements IPresetShadowEffectiveData {
   j3z n5;
   private int k5 = 0;
   private double u9 = Double.NaN;
   private float h0 = Float.NaN;
   static final u0y l6 = u3();

   u0y(PresetShadow var1) {
      super(var1, PresetShadow.class, u0y.class);
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
   public final int getPreset() {
      return this.k5;
   }

   static u0y u3() {
      u0y var0 = new u0y(null);
      var0.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.k5 = 0;
      var0.u9 = 0.0;
      var0.h0 = 0.0F;
      return var0;
   }

   void n5(i7b var1, PresetShadow var2) {
      u0y var3 = (u0y)var1;
      this.k5 = var3.k5;
      this.u9 = var3.u9;
      this.h0 = var3.h0;
      if (var2.getPreset() != 0) {
         this.k5 = var2.getPreset();
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
      this.n5.n5(var1, var2);
   }

   boolean n5(u0y var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1)
            ? true
            : this.getPreset() == var1.getPreset()
               && this.getDistance() == var1.getDistance()
               && this.getDirection() == var1.getDirection()
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
         com.aspose.slides.ms.System.s3.n5(PresetShadowType.class, this.k5),
         ' ',
         com.aspose.slides.ms.System.d2.u9(this.u9),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.h0),
         ' ',
         this.n5 != null ? this.n5.toString() : ""
      });
   }
}
