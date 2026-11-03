package com.aspose.slides;

class x4t extends com.aspose.slides.internal.v6g.h0<x4t> {
   public static final x4t n5 = new x4t();
   public float l6;
   public boolean k5;
   public boolean u3;

   public x4t() {
   }

   public void n5(x4t var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public x4t n5() {
      x4t var1 = new x4t();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(x4t var1) {
      return var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.l6, this.k5, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof x4t) ? false : this.l6((x4t)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x4t Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(x4t bridgeArg0) {
      this.n5(bridgeArg0);
   }


   static {
      n5.l6 = 0.0F;
      n5.u3 = false;
      n5.k5 = false;
   }
}
