package com.aspose.slides.internal.i4;

class a8 extends com.aspose.slides.internal.v6g.h0<a8> {
   public y1 n5;
   public g7 l6;

   public a8() {
   }

   public void n5(a8 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public a8 n5() {
      a8 var1 = new a8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(a8 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a8) ? false : this.l6((a8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a8 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a8 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
