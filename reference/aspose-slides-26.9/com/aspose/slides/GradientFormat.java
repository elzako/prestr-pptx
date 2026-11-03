package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;

public final class GradientFormat extends PVIObject implements IGradientFormat {
   static final s4s n5 = new s4s(d2k.k5.u3(), d2k.u3.u3());
   private n1d k5;
   final com.aspose.slides.internal.v6g.n5<n1d> l6 = new GradientFormat$1(this);
   private GradientStopCollection u3;
   private c1t a6;

   GradientFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.u3 = new GradientStopCollection(this);
      this.a6 = new c1t();
      this.u3.n5.l6(new GradientFormat$2(this));
   }

   @Override
   Object M_() {
      return new w2e(this.u3, this.a6);
   }

   final w2e l6() {
      return (w2e)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().h0();
   }

   @Override
   public final int getTileFlip() {
      return this.z3() ? this.l6().l6() : -1;
   }

   @Override
   public final void setTileFlip(int value) {
      this.n5(-1, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final int getGradientDirection() {
      return this.z3() ? this.l6().k5() : -1;
   }

   @Override
   public final void setGradientDirection(int value) {
      this.n5(-1, value);
      if (this.z3()) {
         this.l6().l6(value);
      }
   }

   @Override
   public final float getLinearGradientAngle() {
      return this.z3() ? this.l6().u3() : Float.NaN;
   }

   @Override
   public final void setLinearGradientAngle(float value) {
      this.n5(Float.NaN, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final byte getLinearGradientScaled() {
      return this.z3() ? this.l6().a6() : -1;
   }

   @Override
   public final void setLinearGradientScaled(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final byte getGradientShape() {
      return this.z3() ? this.l6().u9() : -1;
   }

   @Override
   public final void setGradientShape(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().l6(value);
      }
   }

   @Override
   public final IGradientStopCollection getGradientStops() {
      this.m3();
      return this.u3;
   }

   final void n5(IGradientStopCollection var1) {
      this.u3 = (GradientStopCollection)var1;
      if (this.z3()) {
         this.l6().n5(var1);
      }
   }

   final c1t u3() {
      this.m3();
      return this.a6;
   }

   final void a6() {
      this.n5(true);
   }

   final void n5(boolean var1) {
      if (this.z3()) {
         this.k7();
         this.n5((Object)null);
         if (var1) {
            this.h0();
         }
      }
   }

   final void n5(GradientFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         if (var1.z3()) {
            this.l6().n5(var1);
         } else {
            this.n5((Object)null);
         }

         this.h0();
      }
   }

   final void n5(IGradientFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
   }

   final void l6(GradientFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         if (var1.z3()) {
            this.l6().n5(var1);
         } else {
            this.n5((Object)null);
         }
      }
   }

   final SortedList<Float, com.aspose.slides.internal.o9b.c8> n5(IBaseSlide var1) {
      return !this.z3() ? null : this.l6().n5(var1);
   }

   final void n5(float var1, float var2, float var3, float var4) {
      if (this.z3() || var1 != 0.0F || var2 != 0.0F || var3 != 1.0F || var4 != 1.0F) {
         this.k7();
         this.l6().n5(new s4s(var1, var2, var3, var4));
      }
   }

   final s4s u9() {
      return this.z3() ? this.l6().n5() : n5;
   }

   final void h0() {
      if (this.k5 != null) {
         this.k5.n5();
      }
   }

   // $VF: synthetic method
   static n1d n5(GradientFormat var0, n1d var1) {
      return var0.k5 = var1;
   }
}
