package com.aspose.slides;

class s4s extends com.aspose.slides.internal.v6g.h0<s4s> {
   public d2k n5 = new d2k();
   public d2k l6 = new d2k();

   public s4s() {
   }

   public s4s(d2k var1, d2k var2) {
      var1.n5(this.n5);
      var2.n5(this.l6);
   }

   public s4s(float var1, float var2, float var3, float var4) {
      this.n5 = new d2k(var1, var2);
      this.l6 = new d2k(var3, var4);
   }

   public final d2k n5() {
      return d2k.n5(this.n5, this.l6);
   }

   public static boolean n5(s4s var0, s4s var1) {
      return d2k.k5(var0.n5, var1.n5) && d2k.k5(var0.l6, var1.l6);
   }

   public static boolean l6(s4s var0, s4s var1) {
      return !n5(var0, var1);
   }

   public void n5(s4s var1) {
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
   }

   public s4s l6() {
      s4s var1 = new s4s();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(s4s var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
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
         return !(obj instanceof s4s) ? false : this.l6((s4s)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s4s Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(s4s bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
