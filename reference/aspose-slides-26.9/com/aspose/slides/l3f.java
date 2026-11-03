package com.aspose.slides;

class l3f extends com.aspose.slides.internal.v6g.h0<l3f> {
   public d2k n5 = new d2k();
   public d2k l6 = new d2k();
   public x4t k5 = new x4t();

   public l3f() {
   }

   public final d6z n5() {
      d6z var1 = new d6z();
      d2k.n5(this.n5, d2k.n5(this.l6, 2)).n5(var1.n5);
      var1.l6 = this.k5.l6;
      var1.u3 = this.k5.u3;
      var1.k5 = this.k5.k5;
      return var1;
   }

   public void n5(l3f var1) {
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
      this.k5.n5(var1.k5);
   }

   public l3f l6() {
      l3f var1 = new l3f();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(l3f var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5);
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof l3f) ? false : this.l6((l3f)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l3f Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(l3f bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
