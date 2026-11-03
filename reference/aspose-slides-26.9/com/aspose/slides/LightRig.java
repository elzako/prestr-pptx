package com.aspose.slides;

public final class LightRig extends PVIObject implements ILightRig {
   private x6c l6;
   final com.aspose.slides.internal.v6g.n5<x6c> n5 = new LightRig$1(this);

   LightRig(ThreeDFormat parentImmediate) {
      super(parentImmediate);
   }

   @Override
   Object M_() {
      return new o4t();
   }

   final o4t l6() {
      return (o4t)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().h0();
   }

   @Override
   public final int getDirection() {
      return this.z3() ? this.l6().n5() : -1;
   }

   @Override
   public final void setDirection(int value) {
      this.n5(-1, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.h0();
      }
   }

   @Override
   public final int getLightType() {
      return this.z3() ? this.l6().l6() : -1;
   }

   @Override
   public final void setLightType(int value) {
      this.n5(-1, value);
      if (this.z3()) {
         this.l6().l6(value);
         this.h0();
      }
   }

   @Override
   public final void setRotation(float latitude, float longitude, float revolution) {
      if (this.z3() || latitude != 0.0F || longitude != 0.0F || revolution != 0.0F) {
         this.k7();
         this.l6().n5(latitude, longitude, revolution);
         this.h0();
      }
   }

   @Override
   public final float[] getRotation() {
      return !this.z3() ? null : this.l6().k5();
   }

   final boolean u3() {
      return this.z3() ? this.l6().u9() : false;
   }

   final void n5(boolean var1) {
      this.n5(false, var1);
      if (this.z3()) {
         this.l6().n5(var1);
         this.h0();
      }
   }

   final float[] a6() {
      return !this.z3() ? null : this.l6().u3();
   }

   final void u9() {
      if (this.z3()) {
         this.k7();
         this.l6().a6();
         this.h0();
      }
   }

   final void n5(LightRig var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         this.l6().n5(var1);
         this.h0();
      }
   }

   final void n5(ILightRigEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
      this.h0();
   }

   private void h0() {
      x6c var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static x6c n5(LightRig var0, x6c var1) {
      return var0.l6 = var1;
   }
}
