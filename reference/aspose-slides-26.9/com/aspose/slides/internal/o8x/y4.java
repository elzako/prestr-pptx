package com.aspose.slides.internal.o8x;

import com.aspose.slides.ms.System.j8;

public class y4 extends com.aspose.slides.internal.v6g.h0<y4> {
   private c8[] n5;
   private int l6;

   public y4() {
   }

   public y4(c8[] var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final c8[] n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   @Override
   public int hashCode() {
      return t2.n5(this.n5, this.l6);
   }

   public void n5(y4 var1) {
      var1 = var1 == null ? new y4() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public y4 k5() {
      y4 var1 = new y4();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(y4 var1) {
      return j8.n5(var1.n5, this.n5) && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof y4) ? false : this.l6((y4)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y4 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y4 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
