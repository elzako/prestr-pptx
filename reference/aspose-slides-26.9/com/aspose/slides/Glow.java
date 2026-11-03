package com.aspose.slides;

public final class Glow implements IGlow, i4e, q1v, r0g, Cloneable {
   private b8n l6;
   final com.aspose.slides.internal.v6g.n5<b8n> n5 = new Glow$1(this);
   private double k5;
   private ColorFormat u3;
   private r0g a6;
   private long u9;
   private b4h h0;
   private IPresentationComponent c8;

   Glow(r0g parentImmediate) {
      this.a6 = parentImmediate;
      this.u3 = new ColorFormat(this, 4, true);
      this.u3.n5.l6(new Glow$2(this));
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

   @Override
   public final IColorFormat getColor() {
      return this.u3;
   }

   public final IGlowEffectiveData getEffective() {
      return this.n5();
   }

   final b4h n5() {
      if (this.h0 == null) {
         b4h var1 = new b4h(this);
         this.h0 = var1;
      }

      this.h0.n5(b4h.class);
      return this.h0;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.a6;
   }

   final Glow l6() {
      Glow var1 = (Glow)this.memberwiseClone();
      var1.u3 = new ColorFormat(null);
      var1.u3.n5(this.u3);
      var1.u3.n5.l6(new Glow$3(this, var1));
      return var1;
   }

   final void n5(r0g var1) {
      this.a6 = var1;
      this.u3.n5(this);
      this.k5();
   }

   @Override
   public final long getVersion() {
      return (this.u9 & 4294967295L) + (this.u3.getVersion() & 4294967295L) & 4294967295L;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.c8 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.c8};
         d0u.n5(IPresentationComponent.class, this.a6, var1);
         this.c8 = var1[0];
      }

      return this.c8;
   }

   private void k5() {
      this.u9++;
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
      Glow var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Glow.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.u3, var2.u3) && com.aspose.slides.internal.n8e.v4.n5(this.k5, var2.k5);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   protected Object memberwiseClone() {
      try {
         Glow var1 = (Glow)super.clone();
         var1.setRadius(this.getRadius());
         if (this.u3 != null) {
            var1.u3.n5(this.u3);
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static b8n n5(Glow var0, b8n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void n5(Glow var0) {
      var0.u3();
   }
}
