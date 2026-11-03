package com.aspose.slides;

class l0h extends com.aspose.slides.internal.v6g.h0<l0h> {
   public d2k n5 = new d2k();
   public d2k l6 = new d2k();

   public l0h() {
   }

   public l0h(d2k var1, d2k var2) {
      var1.n5(this.n5);
      var2.n5(this.l6);
   }

   public final d2k n5(float var1) {
      return d2k.n5(this.n5, d2k.n5(this.l6, var1));
   }

   public static d2k n5(d2k var0, d2k var1, float var2) {
      return d2k.n5(var0, d2k.n5(d2k.l6(var1, var0), var2));
   }

   public void n5(l0h var1) {
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
   }

   public l0h n5() {
      l0h var1 = new l0h();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6);
   }

   private boolean l6(l0h var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof l0h) ? false : this.l6((l0h)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l0h Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(l0h bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
