package com.aspose.slides;

class j8t extends com.aspose.slides.internal.v6g.h0<j8t> {
   private byte n5;
   private byte l6;

   public j8t() {
   }

   public final byte n5() {
      return this.n5;
   }

   public final byte l6() {
      return this.l6;
   }

   public j8t(byte var1, byte var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("Dx = {0:00}; Dy = {1:00}",new Object[]{ this.n5, this.l6});
   }

   public void n5(j8t var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public j8t k5() {
      j8t var1 = new j8t();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(j8t var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof j8t) ? false : this.l6((j8t)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j8t Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(j8t bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
