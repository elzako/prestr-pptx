package com.aspose.slides.ms.System;

class r8$l6 extends com.aspose.slides.internal.v6g.h0<r8$l6> {
   public String n5;
   public String l6;
   public int k5;
   // $VF: synthetic field
   static final boolean u3 = !r8.class.desiredAssertionStatus();

   public r8$l6() {
   }

   public r8$l6(String var1, String var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public void n5(r8$l6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public r8$l6 n5() {
      r8$l6 var1 = new r8$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(r8$l6 var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6) && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r8$l6) ? false : this.l6((r8$l6)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = 31 * var1 + (this.l6 != null ? this.l6.hashCode() : 0);
      return 31 * var1 + this.k5;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r8$l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r8$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
