package com.aspose.slides.internal.n8e;

class r8 extends com.aspose.slides.internal.v6g.h0<r8> {
   public double n5;
   public double l6;

   public r8() {
   }

   public void n5(r8 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public r8 n5() {
      r8 var1 = new r8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(r8 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r8) ? false : this.l6((r8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r8 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r8 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
