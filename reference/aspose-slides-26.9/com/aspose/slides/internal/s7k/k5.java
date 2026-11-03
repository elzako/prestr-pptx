package com.aspose.slides.internal.s7k;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j8;

class k5 extends com.aspose.slides.internal.v6g.h0<k5> {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9;

   public k5() {
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("[Year={0};", com.aspose.slides.internal.v6g.k5.l6(this.n5));
      var1.n5(" Month={0};", com.aspose.slides.internal.v6g.k5.l6(this.l6));
      var1.n5(" Day={0};", com.aspose.slides.internal.v6g.k5.l6(this.k5));
      var1.n5(" Hours={0};", com.aspose.slides.internal.v6g.k5.l6(this.u3));
      var1.n5(" Minutes={0}", com.aspose.slides.internal.v6g.k5.l6(this.a6));
      var1.n5(" Seconds={0}]", com.aspose.slides.internal.v6g.k5.l6(this.u9));
      return var1.toString();
   }

   public void n5(k5 var1) {
      var1 = var1 == null ? new k5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
   }

   public k5 n5() {
      k5 var1 = new k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(k5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6 && var1.u9 == this.u9;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k5) ? false : this.l6((k5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
