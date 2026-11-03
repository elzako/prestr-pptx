package com.aspose.slides.internal.t6w;

import com.aspose.slides.ms.System.j8;

class u3$n5 extends com.aspose.slides.internal.v6g.h0<u3$n5> {
   public int n5;
   public int l6;
   public short k5;
   public int u3;
   public long a6;

   public u3$n5() {
   }

   public void n5(u3$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public u3$n5 n5() {
      u3$n5 var1 = new u3$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(u3$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof u3$n5) ? false : this.l6((u3$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u3$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(u3$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
