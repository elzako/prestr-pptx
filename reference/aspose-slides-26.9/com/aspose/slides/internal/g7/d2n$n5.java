package com.aspose.slides.internal.g7;

class d2n$n5 extends com.aspose.slides.internal.v6g.h0<d2n$n5> {
   public byte n5;
   public int l6;
   public int k5;

   public d2n$n5() {
   }

   public void n5(d2n$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public d2n$n5 n5() {
      d2n$n5 var1 = new d2n$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d2n$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d2n$n5) ? false : this.l6((d2n$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d2n$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d2n$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
