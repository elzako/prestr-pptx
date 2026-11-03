package com.aspose.slides.internal.b8c;

class z0$n5 extends com.aspose.slides.internal.v6g.h0<z0$n5> {
   public z0 n5;
   public s7 l6;
   public s7 k5;
   public s7 u3;
   public s7 a6;

   public z0$n5() {
   }

   public z0$n5(z0 var1, s7 var2, s7 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = null;
      this.a6 = null;
   }

   public void n5(z0$n5 var1) {
      var1 = var1 == null ? new z0$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public z0$n5 n5() {
      z0$n5 var1 = new z0$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(z0$n5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5)
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && com.aspose.slides.ms.System.j8.n5(var1.a6, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof z0$n5) ? false : this.l6((z0$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z0$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(z0$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
