package com.aspose.slides.internal.s6;

public class d5 extends com.aspose.slides.internal.v6g.h0<d5> {
   private double n5;
   private double l6;
   private double k5;
   private double u3;

   public d5() {
   }

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.k5;
   }

   public final double k5() {
      return this.l6;
   }

   public final double u3() {
      return this.u3;
   }

   public d5(double var1, double var3, double var5, double var7) {
      this.n5 = var1;
      this.l6 = var5;
      this.k5 = var3;
      this.u3 = var7;
   }

   public void n5(d5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public d5 a6() {
      d5 var1 = new d5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   private boolean l6(d5 var1) {
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
         return !(obj instanceof d5) ? false : this.l6((d5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d5 Clone() {
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
