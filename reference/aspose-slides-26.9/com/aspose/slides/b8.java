package com.aspose.slides;

class b8 extends com.aspose.slides.internal.v6g.h0<b8> {
   public static final b8 n5 = new b8();
   public float l6;
   public float k5;
   public float u3;

   public b8() {
   }

   public void n5(b8 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public b8 n5() {
      b8 var1 = new b8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(b8 var1) {
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
         return !(obj instanceof b8) ? false : this.l6((b8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public b8 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(b8 bridgeArg0) {
      this.n5(bridgeArg0);
   }


   static {
      n5.l6 = 0.0F;
      n5.k5 = 0.0F;
      n5.u3 = 0.0F;
   }
}
