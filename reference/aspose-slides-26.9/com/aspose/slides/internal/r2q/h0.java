package com.aspose.slides.internal.r2q;

import com.aspose.slides.ms.System.j8;

public class h0 extends com.aspose.slides.internal.v6g.h0<h0> {
   public int n5;
   public String l6;
   public int k5;
   public int u3;

   public void n5(h0 var1) {
      var1 = var1 == null ? new h0() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public h0 n5() {
      h0 var1 = new h0();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(h0 var1) {
      return var1.n5 == this.n5 && j8.n5(var1.l6, this.l6) && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof h0) ? false : this.l6((h0)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public h0 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(h0 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
