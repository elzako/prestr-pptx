package com.aspose.slides.internal.w2i;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j8;

class a6 extends com.aspose.slides.internal.v6g.h0<a6> {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9;

   public a6() {
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("[Year={0};", this.n5);
      var1.n5(" Month={0};", this.l6);
      var1.n5(" Day={0};", this.k5);
      var1.n5(" Hours={0};", this.u3);
      var1.n5(" Minutes={0}", this.a6);
      var1.n5(" Seconds={0}]", this.u9);
      return var1.toString();
   }

   public void n5(a6 var1) {
      var1 = var1 == null ? new a6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
   }

   public a6 n5() {
      a6 var1 = new a6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(a6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6 && var1.u9 == this.u9;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a6) ? false : this.l6((a6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
