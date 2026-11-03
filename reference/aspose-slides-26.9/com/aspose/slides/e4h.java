package com.aspose.slides;

class e4h extends com.aspose.slides.internal.v6g.h0<e4h> {
   public int n5;

   public e4h() {
   }

   public void n5(e4h var1) {
      var1.n5 = this.n5;
   }

   public e4h n5() {
      e4h var1 = new e4h();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5);
   }

   private boolean l6(e4h var1) {
      return var1.n5 == this.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof e4h) ? false : this.l6((e4h)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public e4h Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(e4h bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
