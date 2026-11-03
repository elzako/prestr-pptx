package com.aspose.slides;

public final class OuterShadow implements IOuterShadow, i4e, q1v, r0g, Cloneable {
   private b8n k5;
   final com.aspose.slides.internal.v6g.n5<b8n> n5 = new OuterShadow$1(this);
   final f4l l6 = new OuterShadow$2(this);
   private ColorFormat u3;
   private byte a6 = 7;
   private double u9;
   private float h0;
   private double c8;
   private double t2;
   private double s7;
   private boolean x8 = true;
   private double n3 = 100.0;
   private double y4 = 100.0;
   private r0g e2;
   private long t9;
   private k0p z1;
   private IPresentationComponent t4;

   OuterShadow(r0g parentImmediate) {
      this.e2 = parentImmediate;
      this.u3 = new ColorFormat(this, 7);
      this.u3.n5.l6(this.l6);
   }

   @Override
   public final double getBlurRadius() {
      return this.u9;
   }

   @Override
   public final void setBlurRadius(double value) {
      this.u9 = value;
      this.k5();
   }

   @Override
   public final float getDirection() {
      return this.h0;
   }

   @Override
   public final void setDirection(float value) {
      this.h0 = value;
      this.k5();
   }

   @Override
   public final double getDistance() {
      return this.c8;
   }

   @Override
   public final void setDistance(double value) {
      this.c8 = value;
      this.k5();
   }

   @Override
   public final IColorFormat getShadowColor() {
      return this.u3;
   }

   @Override
   public final byte getRectangleAlign() {
      return this.a6;
   }

   @Override
   public final void setRectangleAlign(byte value) {
      this.a6 = value;
      this.k5();
   }

   @Override
   public final double getSkewHorizontal() {
      return this.t2;
   }

   @Override
   public final void setSkewHorizontal(double value) {
      this.t2 = value;
      this.k5();
   }

   @Override
   public final double getSkewVertical() {
      return this.s7;
   }

   @Override
   public final void setSkewVertical(double value) {
      this.s7 = value;
      this.k5();
   }

   @Override
   public final boolean getRotateShadowWithShape() {
      return this.x8;
   }

   @Override
   public final void setRotateShadowWithShape(boolean value) {
      this.x8 = value;
      this.k5();
   }

   @Override
   public final double getScaleHorizontal() {
      return this.n3;
   }

   @Override
   public final void setScaleHorizontal(double value) {
      this.n3 = value;
      this.k5();
   }

   @Override
   public final double getScaleVertical() {
      return this.y4;
   }

   @Override
   public final void setScaleVertical(double value) {
      this.y4 = value;
      this.k5();
   }

   public final IOuterShadowEffectiveData getEffective() {
      return this.n5();
   }

   final k0p n5() {
      if (this.z1 == null) {
         this.z1 = new k0p(this);
      }

      this.z1.n5(k0p.class);
      return this.z1;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.e2;
   }

   final OuterShadow l6() {
      OuterShadow var1 = (OuterShadow)this.memberwiseClone();
      var1.z1 = null;
      var1.u3 = new ColorFormat(null);
      var1.u3.n5(this.u3);
      var1.u3.n5.l6(new OuterShadow$3(this, var1));
      return var1;
   }

   final void n5(r0g var1) {
      this.e2 = var1;
      this.u3.n5(this);
      this.k5();
   }

   @Override
   public final long getVersion() {
      return (this.t9 & 4294967295L) + (this.u3.getVersion() & 4294967295L) & 4294967295L;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.t4 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.t4};
         d0u.n5(IPresentationComponent.class, this.e2, var1);
         this.t4 = var1[0];
      }

      return this.t4;
   }

   private void k5() {
      this.t9++;
      this.u3();
   }

   private void u3() {
      b8n var1 = this.k5;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   @Override
   public boolean equals(Object obj) {
      OuterShadow var2 = com.aspose.slides.internal.v6g.k5.n5(obj, OuterShadow.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5((float)(this.a6), (float)(var2.a6))
               && com.aspose.slides.internal.n8e.v4.n5(this.u9, var2.u9)
               && com.aspose.slides.internal.n8e.v4.n5(this.h0, var2.h0)
               && com.aspose.slides.internal.n8e.v4.n5(this.c8, var2.c8)
               && com.aspose.slides.internal.n8e.v4.n5(this.t2, var2.t2)
               && com.aspose.slides.internal.n8e.v4.n5(this.s7, var2.s7)
               && com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(this.x8), var2.x8)
               && com.aspose.slides.internal.n8e.v4.n5(this.n3, var2.n3)
               && com.aspose.slides.internal.n8e.v4.n5(this.y4, var2.y4)
               && com.aspose.slides.internal.n8e.v4.n5(this.u3, var2.u3);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   protected Object memberwiseClone() {
      try {
         OuterShadow var1 = (OuterShadow)super.clone();
         if (this.u3 != null) {
            var1.u3.n5(this.u3);
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static b8n n5(OuterShadow var0, b8n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static void n5(OuterShadow var0) {
      var0.u3();
   }
}
