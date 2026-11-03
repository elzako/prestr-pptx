package com.aspose.slides.internal.l1f;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j8;

public class a6$l6 extends h0<a6$l6> {
   public com.aspose.slides.internal.u2w.a6[] n5;
   public long l6;

   public void n5(a6$l6 var1) {
      var1 = var1 == null ? new a6$l6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public a6$l6 n5() {
      a6$l6 var1 = new a6$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(a6$l6 var1) {
      return j8.n5(var1.n5, this.n5) && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a6$l6) ? false : this.l6((a6$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a6$l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a6$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
