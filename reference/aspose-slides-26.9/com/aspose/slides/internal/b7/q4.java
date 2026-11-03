package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class q4 extends k2 {
   private v5 n5;
   private int l6;

   public q4() {
      super(1);
      this.l6(new v5(50.0, 50.0, 50.0, 50.0));
      this.l6(3);
   }

   public q4(v5 var1, int var2) {
      super(1);
      this.l6(var1);
      this.l6(var2);
   }

   public final v5 u9() {
      return this.n5;
   }

   public final void l6(v5 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      this.n5 = var1;
   }

   public final int h0() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   @Override
   public n9 n5() {
      q4 var1 = new q4(this.u9().a6(), this.h0());
      this.n5(var1);
      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n9 cloneT() {
      return this.n5();
   }

}
