package com.aspose.slides;

class f6b$n5 extends com.aspose.slides.internal.v6g.h0<f6b$n5> {
   private int n5;
   private int l6;
   private double k5;
   private e4c u3 = new e4c();

   public f6b$n5() {
   }

   public final double n5() {
      return this.k5;
   }

   public final double l6() {
      return this.u3.n5 * this.k5;
   }

   public final double k5() {
      return this.u3.l6 * this.k5;
   }

   public f6b$n5(int var1, int var2, double var3, e4c var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      var5.l6(this.u3);
   }

   public void n5(f6b$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      this.u3.l6(var1.u3);
   }

   public f6b$n5 u3() {
      f6b$n5 var1 = new f6b$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(f6b$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3);
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
         return !(obj instanceof f6b$n5) ? false : this.l6((f6b$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f6b$n5 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f6b$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
