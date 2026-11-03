package com.aspose.slides;

class AutoShapeImpBase$n5 extends com.aspose.slides.internal.v6g.h0<AutoShapeImpBase$n5> {
   int n5;
   short l6;
   short k5;
   short u3;

   public AutoShapeImpBase$n5() {
   }

   public AutoShapeImpBase$n5(int var1, short var2, short var3, short var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public void n5(AutoShapeImpBase$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public AutoShapeImpBase$n5 n5() {
      AutoShapeImpBase$n5 var1 = new AutoShapeImpBase$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(AutoShapeImpBase$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof AutoShapeImpBase$n5) ? false : this.l6((AutoShapeImpBase$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public AutoShapeImpBase$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(AutoShapeImpBase$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
