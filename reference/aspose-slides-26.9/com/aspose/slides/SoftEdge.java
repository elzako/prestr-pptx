package com.aspose.slides;

public final class SoftEdge implements ISoftEdge, i4e, q1v, r0g, Cloneable {
   private b8n l6;
   final com.aspose.slides.internal.v6g.n5<b8n> n5 = new SoftEdge$1(this);
   private double k5 = 1.0;
   private r0g u3;
   private long a6;
   private q1m u9;
   private IPresentationComponent h0;

   SoftEdge(r0g parentImmediate) {
      this.u3 = parentImmediate;
   }

   @Override
   public final double getRadius() {
      return this.k5;
   }

   @Override
   public final void setRadius(double value) {
      this.k5 = value;
      this.k5();
   }

   public final ISoftEdgeEffectiveData getEffective() {
      return this.n5();
   }

   final q1m n5() {
      if (this.u9 == null) {
         this.u9 = new q1m(this);
      }

      return this.u9;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u3;
   }

   final SoftEdge l6() {
      return (SoftEdge)this.memberwiseClone();
   }

   final void n5(r0g var1) {
      this.u3 = var1;
      this.k5();
   }

   @Override
   public final long getVersion() {
      return this.a6;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.h0 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.h0};
         d0u.n5(IPresentationComponent.class, this.u3, var1);
         this.h0 = var1[0];
      }

      return this.h0;
   }

   private void k5() {
      this.a6++;
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
      SoftEdge var2 = com.aspose.slides.internal.v6g.k5.n5(obj, SoftEdge.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.n8e.v4.n5(this.k5, var2.k5);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   protected Object memberwiseClone() {
      try {
         return (SoftEdge)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static b8n n5(SoftEdge var0, b8n var1) {
      return var0.l6 = var1;
   }
}
