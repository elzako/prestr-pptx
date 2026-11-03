package com.aspose.slides;

class a0n extends com.aspose.slides.internal.v6g.h0<a0n> {
   public d2k n5 = new d2k();
   public com.aspose.slides.internal.o9b.n3 l6;
   public float k5;
   public d2k u3 = new d2k();
   public float a6;

   public a0n() {
   }

   public void n5(a0n var1) {
      this.n5.n5(var1.n5);
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      this.u3.n5(var1.u3);
      var1.a6 = this.a6;
   }

   public a0n n5() {
      a0n var1 = new a0n();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(a0n var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && var1.k5 == this.k5
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && var1.a6 == this.a6;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a0n) ? false : this.l6((a0n)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a0n Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a0n bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
