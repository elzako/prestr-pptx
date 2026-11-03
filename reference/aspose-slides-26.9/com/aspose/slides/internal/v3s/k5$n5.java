package com.aspose.slides.internal.v3s;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j8;

class k5$n5 extends h0<k5$n5> {
   public int n5;
   public int l6;
   public short k5;
   public int u3;
   public long a6;

   public k5$n5() {
   }

   public void n5(k5$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public k5$n5 n5() {
      k5$n5 var1 = new k5$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(k5$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k5$n5) ? false : this.l6((k5$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k5$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k5$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
