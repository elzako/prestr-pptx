package com.aspose.slides.internal.r1x;

public class p6 extends com.aspose.slides.internal.v6g.h0<p6> {
   public boolean n5;
   public int l6;
   public String k5;

   public void n5(p6 var1) {
      var1 = var1 == null ? new p6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public p6 n5() {
      p6 var1 = new p6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(p6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof p6) ? false : this.l6((p6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public p6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(p6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
