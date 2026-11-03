package com.aspose.slides.internal.j8o;

import com.aspose.slides.ms.System.j8;

public class l6$n5 extends com.aspose.slides.internal.v6g.h0<l6$n5> {
   public int n5;
   public int l6;

   public void n5(l6$n5 var1) {
      var1 = var1 == null ? new l6$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public l6$n5 n5() {
      l6$n5 var1 = new l6$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(l6$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof l6$n5) ? false : this.l6((l6$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l6$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(l6$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
