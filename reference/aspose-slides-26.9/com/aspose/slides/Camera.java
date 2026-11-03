package com.aspose.slides;

public final class Camera extends PVIObject implements ICamera {
   private i5 l6;
   final com.aspose.slides.internal.v6g.n5<i5> n5 = new Camera$1(this);
   private h8 k5;

   Camera(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.k5 = new h8(this);
      this.k5.n5.l6(new Camera$2(this));
   }

   @Override
   Object M_() {
      return new w6(this.k5);
   }

   final w6 l6() {
      return (w6)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().c8();
   }

   @Override
   public final int getCameraType() {
      return this.z3() ? this.l6().n5() : -1;
   }

   @Override
   public final void setCameraType(int value) {
      this.n5(-1, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.h0();
      }
   }

   @Override
   public final float getFieldOfViewAngle() {
      return this.z3() ? this.l6().l6() : Float.NaN;
   }

   @Override
   public final void setFieldOfViewAngle(float value) {
      this.n5(Float.NaN, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.h0();
      }
   }

   @Override
   public final float getZoom() {
      return this.z3() ? this.l6().k5() : Float.NaN;
   }

   @Override
   public final void setZoom(float value) {
      this.n5(Float.NaN, value);
      if (this.z3()) {
         this.l6().l6(value);
         this.h0();
      }
   }

   @Override
   public final void setRotation(float latitude, float longitude, float revolution) {
      if (this.z3() || !com.aspose.slides.ms.System.n1.k5(latitude + longitude + revolution)) {
         this.k7();
         this.l6().n5(latitude, longitude, revolution);
         this.h0();
      }
   }

   @Override
   public final float[] getRotation() {
      return !this.z3() ? null : this.l6().u3();
   }

   final h8 u3() {
      this.m3();
      return this.k5;
   }

   final float[] a6() {
      return !this.z3() ? null : this.l6().u9();
   }

   final void u9() {
      if (this.z3()) {
         this.k7();
         this.l6().h0();
      }
   }

   final void n5(ICamera var1) {
      if (this.z3() || ((PVIObject)var1).z3()) {
         this.k7();
         this.l6().n5((Camera)var1);
      }
   }

   final void n5(ICameraEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
   }

   private void h0() {
      i5 var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static i5 n5(Camera var0, i5 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void n5(Camera var0) {
      var0.h0();
   }
}
