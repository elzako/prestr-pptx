package com.aspose.slides.internal.f9d;

import com.aspose.slides.ms.System.j8;

class y4 extends com.aspose.slides.internal.v6g.h0<y4> {
   public byte n5;
   public byte l6;
   public int k5;
   public int u3;

   public y4() {
   }

   public void n5(y4 var1) {
      var1 = var1 == null ? new y4() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public y4 n5() {
      y4 var1 = new y4();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(y4 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof y4) ? false : this.l6((y4)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y4 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y4 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
