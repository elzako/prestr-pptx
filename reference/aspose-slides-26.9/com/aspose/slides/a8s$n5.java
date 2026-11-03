package com.aspose.slides;

class a8s$n5 extends com.aspose.slides.internal.v6g.h0<a8s$n5> {
   private float n5;
   private float l6;
   private com.aspose.slides.internal.o9b.w1 k5 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 u3 = new com.aspose.slides.internal.o9b.w1();

   public a8s$n5() {
   }

   public a8s$n5(float var1, float var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.internal.o9b.w1 var4) {
      this.n5 = var1;
      this.l6 = var2;
      var3.n5(this.k5);
      var4.n5(this.u3);
   }

   public final float n5() {
      return this.n5;
   }

   public final float l6() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.w1 k5() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.w1 u3() {
      return this.u3;
   }

   public void n5(a8s$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      this.k5.n5(var1.k5);
      this.u3.n5(var1.u3);
   }

   public a8s$n5 a6() {
      a8s$n5 var1 = new a8s$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
   }

   private boolean l6(a8s$n5 var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5)
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a8s$n5) ? false : this.l6((a8s$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a8s$n5 Clone() {
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a8s$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
