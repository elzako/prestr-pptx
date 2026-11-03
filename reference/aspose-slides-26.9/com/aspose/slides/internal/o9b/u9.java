package com.aspose.slides.internal.o9b;

import com.aspose.slides.ms.System.j8;

public class u9 extends com.aspose.slides.internal.v6g.h0<u9> {
   private int l6;
   private int k5;
   // $VF: synthetic field
   static final boolean n5 = !u9.class.desiredAssertionStatus();

   public u9() {
   }

   public u9(int var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public int n5() {
      return this.l6;
   }

   public int l6() {
      return this.k5;
   }

   public void n5(u9 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public u9 k5() {
      u9 var1 = new u9();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(u9 var1) {
      return var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof u9) ? false : this.l6((u9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.l6;
      return 31 * var1 + this.k5;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u9 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(u9 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
