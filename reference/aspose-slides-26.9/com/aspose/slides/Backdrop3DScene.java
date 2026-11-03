package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

public final class Backdrop3DScene extends PVIObject implements IBackdrop3DScene {
   private final float[] n5 = new float[]{0.0F, 0.0F, 0.0F};

   Backdrop3DScene(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   Object M_() {
      return new t5();
   }

   final t5 l6() {
      return (t5)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().u3();
   }

   @Override
   public final float[] getNormalVector() {
      return this.z3() ? this.l6().n5() : this.n5;
   }

   @Override
   public final void setNormalVector(float[] value) {
      if (value != null && value.length >= 3) {
         if (!this.z3() && (value[0] != 0.0F || value[1] != 0.0F || value[2] != 0.0F)) {
            this.k7();
         }

         if (this.z3()) {
            this.l6().n5(value);
         }
      } else {
         throw new ArgumentException("NormalVector");
      }
   }

   @Override
   public final float[] getAnchorPoint() {
      return this.z3() ? this.l6().l6() : (float[])this.n5.clone();
   }

   @Override
   public final void setAnchorPoint(float[] value) {
      if (value != null && value.length >= 3) {
         if (!this.z3() && (value[0] != 0.0F || value[1] != 0.0F || value[2] != 0.0F)) {
            this.k7();
         }

         if (this.z3()) {
            this.l6().l6(value);
         }
      } else {
         throw new ArgumentException("AnchorPoint");
      }
   }

   @Override
   public final float[] getUpVector() {
      return this.z3() ? this.l6().k5() : (float[])this.n5.clone();
   }

   @Override
   public final void setUpVector(float[] value) {
      if (value != null && value.length >= 3) {
         if (!this.z3() && (value[0] != 0.0F || value[1] != 0.0F || value[2] != 0.0F)) {
            this.k7();
         }

         if (this.z3()) {
            this.l6().k5(value);
         }
      } else {
         throw new ArgumentException("UpVector");
      }
   }

   final void n5(Backdrop3DScene var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         if (var1.z3()) {
            this.l6().n5(var1);
         } else {
            this.n5((java.lang.Object)null);
         }
      }
   }
}
