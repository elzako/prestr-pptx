package com.aspose.slides.internal.f9d;

import com.aspose.slides.ms.System.j8;

class k5$k5 extends com.aspose.slides.internal.v6g.h0<k5$k5> {
   private int n5;
   private int l6;

   public k5$k5() {
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public void n5(k5$k5 var1) {
      var1 = var1 == null ? new k5$k5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public k5$k5 k5() {
      k5$k5 var1 = new k5$k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(k5$k5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k5$k5) ? false : this.l6((k5$k5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k5$k5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k5$k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
