package com.aspose.slides.internal.g7;

class k9$n5 extends com.aspose.slides.internal.v6g.h0<k9$n5> {
   public static final k9$n5 n5 = new k9$n5(-1, -1);
   public int l6;
   public int k5;
   public int u3;

   public k9$n5() {
   }

   public k9$n5(int var1, int var2) {
      this.l6 = var1;
      this.k5 = this.l6;
      this.u3 = var2;
   }

   public final boolean n5() {
      return this.l6 == n5.l6 && this.u3 == n5.u3;
   }

   public void n5(k9$n5 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public k9$n5 l6() {
      k9$n5 var1 = new k9$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(k9$n5 var1) {
      return var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k9$n5) ? false : this.l6((k9$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k9$n5 Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k9$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
