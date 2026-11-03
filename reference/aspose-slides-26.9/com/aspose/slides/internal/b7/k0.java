package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class k0 extends com.aspose.slides.internal.v6g.h0<k0> {
   private double n5;
   private double l6;

   public k0() {
      this.n5 = 0.0;
      this.l6 = 0.0;
   }

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public k0(double var1, double var3) {
      if (com.aspose.slides.ms.System.d2.k5(var1)) {
         throw new ArgumentOutOfRangeException("x");
      }

      if (com.aspose.slides.ms.System.d2.k5(var3)) {
         throw new ArgumentOutOfRangeException("y");
      }

      this.n5 = var1;
      this.l6 = var3;
   }

   public static v2 n5(k0 var0, k0 var1) {
      return new v2(var0.n5() - var1.n5(), var0.l6() - var1.l6());
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("X = {0:0.#} Y = {1:0.#}", this.n5, this.l6);
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   final com.aspose.slides.internal.o9b.w1 k5() {
      return new com.aspose.slides.internal.o9b.w1((float)this.n5, (float)this.l6);
   }

   public void n5(k0 var1) {
      var1.n5 = this.n5();
      var1.l6 = this.l6();
   }

   public k0 u3() {
      k0 var1 = new k0();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(k0 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k0) ? false : this.l6((k0)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k0 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k0 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
