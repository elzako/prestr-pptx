package com.aspose.slides.ms.System.Xml;

public class y0 extends com.aspose.slides.internal.v6g.h0<y0> {
   public int n5;
   public int l6;

   public y0() {
   }

   public y0(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(y0 var1) {
      var1 = var1 == null ? new y0() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public y0 n5() {
      y0 var1 = new y0();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(y0 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof y0) ? false : this.l6((y0)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y0 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y0 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
