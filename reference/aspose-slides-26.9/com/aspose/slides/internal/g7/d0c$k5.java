package com.aspose.slides.internal.g7;

class d0c$k5 extends com.aspose.slides.internal.v6g.h0<d0c$k5> {
   public int n5;
   public short l6;
   public short k5;

   public d0c$k5() {
   }

   public void n5(d0c$k5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public d0c$k5 n5() {
      d0c$k5 var1 = new d0c$k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d0c$k5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d0c$k5) ? false : this.l6((d0c$k5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d0c$k5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d0c$k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
