package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.j8;

class j5$l6 extends com.aspose.slides.internal.v6g.h0<j5$l6> {
   private int n5;
   private int l6;

   public j5$l6() {
   }

   public j5$l6(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final int n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public void n5(j5$l6 var1) {
      var1 = var1 == null ? new j5$l6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public j5$l6 k5() {
      j5$l6 var1 = new j5$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(j5$l6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof j5$l6) ? false : this.l6((j5$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j5$l6 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(j5$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
