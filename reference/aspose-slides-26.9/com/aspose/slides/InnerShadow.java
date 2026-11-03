package com.aspose.slides;

public final class InnerShadow implements IInnerShadow, i4e, q1v, r0g, Cloneable {
   private b8n l6;
   final com.aspose.slides.internal.v6g.n5<b8n> n5 = new InnerShadow$1(this);
   private double k5;
   private float u3;
   private double a6;
   private ColorFormat u9;
   private r0g h0;
   private long c8;
   private d8f t2;
   private IPresentationComponent s7;

   InnerShadow(r0g parentImmediate) {
      this.h0 = parentImmediate;
      this.u9 = new ColorFormat(this, 7);
      this.u9.n5.l6(new InnerShadow$2(this));
   }

   @Override
   public final double getBlurRadius() {
      return this.k5;
   }

   @Override
   public final void setBlurRadius(double value) {
      this.k5 = value;
      this.k5();
   }

   @Override
   public final float getDirection() {
      return this.u3;
   }

   @Override
   public final void setDirection(float value) {
      this.u3 = value;
      this.k5();
   }

   @Override
   public final double getDistance() {
      return this.a6;
   }

   @Override
   public final void setDistance(double value) {
      this.a6 = value;
      this.k5();
   }

   @Override
   public final IColorFormat getShadowColor() {
      return this.u9;
   }

   public final IInnerShadowEffectiveData getEffective() {
      return this.n5();
   }

   final d8f n5() {
      if (this.t2 == null) {
         this.t2 = new d8f(this);
      }

      this.t2.n5(d8f.class);
      return this.t2;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.h0;
   }

   final InnerShadow l6() {
      InnerShadow var1 = (InnerShadow)this.memberwiseClone();
      var1.u9 = new ColorFormat(null);
      var1.u9.n5(this.u9);
      var1.u9.n5.l6(new InnerShadow$3(this, var1));
      return var1;
   }

   final void n5(r0g var1) {
      this.h0 = var1;
      this.u9.n5(this);
      this.k5();
   }

   @Override
   public final long getVersion() {
      return (this.c8 & 4294967295L) + (this.u9.getVersion() & 4294967295L) & 4294967295L;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.s7 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.s7};
         d0u.n5(IPresentationComponent.class, this.h0, var1);
         this.s7 = var1[0];
      }

      return this.s7;
   }

   private void k5() {
      this.c8++;
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
      InnerShadow var2 = com.aspose.slides.internal.v6g.k5.n5(obj, InnerShadow.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.k5, var2.k5)
               && com.aspose.slides.internal.n8e.v4.n5(this.u3, var2.u3)
               && com.aspose.slides.internal.n8e.v4.n5(this.a6, var2.a6)
               && com.aspose.slides.internal.n8e.v4.n5(this.u9, var2.u9);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   protected Object memberwiseClone() {
      try {
         InnerShadow var1 = (InnerShadow)super.clone();
         if (this.u9 != null) {
            var1.u9.n5(this.u9);
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static b8n n5(InnerShadow var0, b8n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void n5(InnerShadow var0) {
      var0.u3();
   }
}
