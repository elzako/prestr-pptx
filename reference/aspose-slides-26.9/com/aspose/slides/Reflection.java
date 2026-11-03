package com.aspose.slides;

public final class Reflection implements IReflection, i4e, q1v, r0g, Cloneable {
   private b8n l6;
   final com.aspose.slides.internal.v6g.n5<b8n> n5 = new Reflection$1(this);
   private byte k5 = -1;
   private double u3;
   private float a6;
   private double u9;
   private float h0 = 0.0F;
   private float c8 = 100.0F;
   private float t2 = 90.0F;
   private float s7 = 100.0F;
   private float x8 = 0.0F;
   private double n3;
   private double y4;
   private boolean e2 = true;
   private double t9 = 100.0;
   private double z1 = 100.0;
   private r0g t4;
   private long q0;
   private i2u z3;
   private IPresentationComponent m1;

   Reflection(r0g parentImmediate) {
      this.t4 = parentImmediate;
   }

   @Override
   public final float getStartPosAlpha() {
      return this.h0;
   }

   @Override
   public final void setStartPosAlpha(float value) {
      this.h0 = value;
      this.k5();
   }

   @Override
   public final float getEndPosAlpha() {
      return this.c8;
   }

   @Override
   public final void setEndPosAlpha(float value) {
      this.c8 = value;
      this.k5();
   }

   @Override
   public final float getFadeDirection() {
      return this.t2;
   }

   @Override
   public final void setFadeDirection(float value) {
      this.t2 = value;
      this.k5();
   }

   @Override
   public final float getStartReflectionOpacity() {
      return this.s7;
   }

   @Override
   public final void setStartReflectionOpacity(float value) {
      this.s7 = value;
      this.k5();
   }

   @Override
   public final float getEndReflectionOpacity() {
      return this.x8;
   }

   @Override
   public final void setEndReflectionOpacity(float value) {
      this.x8 = value;
      this.k5();
   }

   @Override
   public final double getBlurRadius() {
      return this.u3;
   }

   @Override
   public final void setBlurRadius(double value) {
      this.u3 = value;
      this.k5();
   }

   @Override
   public final float getDirection() {
      return this.a6;
   }

   @Override
   public final void setDirection(float value) {
      this.a6 = value;
      this.k5();
   }

   @Override
   public final double getDistance() {
      return this.u9;
   }

   @Override
   public final void setDistance(double value) {
      this.u9 = value;
      this.k5();
   }

   @Override
   public final byte getRectangleAlign() {
      return this.k5;
   }

   @Override
   public final void setRectangleAlign(byte value) {
      this.k5 = value;
      this.k5();
   }

   @Override
   public final double getSkewHorizontal() {
      return this.n3;
   }

   @Override
   public final void setSkewHorizontal(double value) {
      this.n3 = value;
      this.k5();
   }

   @Override
   public final double getSkewVertical() {
      return this.y4;
   }

   @Override
   public final void setSkewVertical(double value) {
      this.y4 = value;
      this.k5();
   }

   @Override
   public final boolean getRotateShadowWithShape() {
      return this.e2;
   }

   @Override
   public final void setRotateShadowWithShape(boolean value) {
      this.e2 = value;
      this.k5();
   }

   @Override
   public final double getScaleHorizontal() {
      return this.t9;
   }

   @Override
   public final void setScaleHorizontal(double value) {
      this.t9 = value;
      this.k5();
   }

   @Override
   public final double getScaleVertical() {
      return this.z1;
   }

   @Override
   public final void setScaleVertical(double value) {
      this.z1 = value;
      this.k5();
   }

   public final IReflectionEffectiveData getEffective() {
      return this.n5();
   }

   final i2u n5() {
      if (this.z3 == null) {
         this.z3 = new i2u(this);
      }

      return this.z3;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.t4;
   }

   final Reflection l6() {
      return (Reflection)this.memberwiseClone();
   }

   final void n5(r0g var1) {
      this.t4 = var1;
      this.k5();
   }

   @Override
   public final long getVersion() {
      return this.q0;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.m1 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.m1};
         d0u.n5(IPresentationComponent.class, this.t4, var1);
         this.m1 = var1[0];
      }

      return this.m1;
   }

   private void k5() {
      this.q0++;
      this.u3();
   }

   private void u3() {
      b8n var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   @Override
   public boolean equals(Object obj) {
      Reflection var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Reflection.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5((float)(this.k5), (float)(var2.k5))
               && com.aspose.slides.internal.n8e.v4.n5(this.u3, var2.u3)
               && com.aspose.slides.internal.n8e.v4.n5(this.a6, var2.a6)
               && com.aspose.slides.internal.n8e.v4.n5(this.u9, var2.u9)
               && com.aspose.slides.internal.n8e.v4.n5(this.h0, var2.h0)
               && com.aspose.slides.internal.n8e.v4.n5(this.c8, var2.c8)
               && com.aspose.slides.internal.n8e.v4.n5(this.t2, var2.t2)
               && com.aspose.slides.internal.n8e.v4.n5(this.s7, var2.s7)
               && com.aspose.slides.internal.n8e.v4.n5(this.x8, var2.x8)
               && com.aspose.slides.internal.n8e.v4.n5(this.n3, var2.n3)
               && com.aspose.slides.internal.n8e.v4.n5(this.y4, var2.y4)
               && com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(this.e2), var2.e2)
               && com.aspose.slides.internal.n8e.v4.n5(this.t9, var2.t9)
               && com.aspose.slides.internal.n8e.v4.n5(this.z1, var2.z1);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   protected Object memberwiseClone() {
      try {
         return (Reflection)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static b8n n5(Reflection var0, b8n var1) {
      return var0.l6 = var1;
   }
}
