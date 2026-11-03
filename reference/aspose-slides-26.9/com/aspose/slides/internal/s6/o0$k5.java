package com.aspose.slides.internal.s6;

public class o0$k5 extends com.aspose.slides.internal.v6g.h0<o0$k5> {
   public g7 n5 = new g7();
   public v3 l6 = new v3();
   public s0 k5 = new s0();
   public v3 u3 = new v3();

   public void n5(o0$k5 var1) {
      this.n5.n5(var1.n5);
      this.l6.l6(var1.l6);
      this.k5.n5(var1.k5);
      this.u3.l6(var1.u3);
   }

   public o0$k5 n5() {
      o0$k5 var1 = new o0$k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(o0$k5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5)
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3);
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof o0$k5) ? false : this.l6((o0$k5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o0$k5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(o0$k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
