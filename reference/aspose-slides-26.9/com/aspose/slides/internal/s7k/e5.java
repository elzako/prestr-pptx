package com.aspose.slides.internal.s7k;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j8;

class e5 extends com.aspose.slides.internal.v6g.h0<e5> {
   public int n5;
   public long l6;
   public long k5;

   public e5() {
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("[TagSignature={0};", com.aspose.slides.internal.v6g.k5.l6(this.n5));
      var1.n5(" Offset={0};", com.aspose.slides.internal.v6g.k5.n5(this.l6));
      var1.n5(" Size={0}]", com.aspose.slides.internal.v6g.k5.n5(this.k5));
      return var1.toString();
   }

   public void n5(e5 var1) {
      var1 = var1 == null ? new e5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public e5 n5() {
      e5 var1 = new e5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(e5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof e5) ? false : this.l6((e5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public e5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(e5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
