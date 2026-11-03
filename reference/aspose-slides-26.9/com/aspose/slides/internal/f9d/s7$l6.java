package com.aspose.slides.internal.f9d;

import com.aspose.slides.ms.System.j8;

class s7$l6 extends com.aspose.slides.internal.v6g.h0<s7$l6> {
   public int n5;
   public int l6;
   public long k5;

   public s7$l6() {
   }

   public void n5(s7$l6 var1) {
      var1 = var1 == null ? new s7$l6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public s7$l6 n5() {
      s7$l6 var1 = new s7$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(s7$l6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof s7$l6) ? false : this.l6((s7$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s7$l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(s7$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
