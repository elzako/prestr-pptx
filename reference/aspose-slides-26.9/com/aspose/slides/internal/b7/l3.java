package com.aspose.slides.internal.b7;

public class l3 extends com.aspose.slides.internal.v6g.h0<l3> {
   private double n5;
   private double l6;
   private double k5;

   public l3() {
      this.n5 = 0.0;
      this.l6 = 0.0;
      this.k5 = 0.0;
   }

   public l3(double var1, double var3, double var5) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var5;
   }

   public void n5(l3 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public l3 n5() {
      l3 var1 = new l3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(l3 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof l3) ? false : this.l6((l3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(l3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
