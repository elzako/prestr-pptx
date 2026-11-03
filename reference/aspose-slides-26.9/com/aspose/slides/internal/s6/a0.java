package com.aspose.slides.internal.s6;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

public class a0 extends com.aspose.slides.internal.v6g.h0<a0> {
   private double n5;
   private double l6;

   public a0() {
      this.n5 = 0.0;
      this.l6 = 0.0;
   }

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public a0(double var1, double var3) {
      if (com.aspose.slides.ms.System.d2.k5(var1)) {
         throw new ArgumentOutOfRangeException("x");
      }

      if (com.aspose.slides.ms.System.d2.k5(var3)) {
         throw new ArgumentOutOfRangeException("y");
      }

      this.n5 = var1;
      this.l6 = var3;
   }

   @Override
   public String toString() {
      return d1.n5("X = {0:0.#} Y = {1:0.#}", this.n5, this.l6);
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   public void n5(a0 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public a0 k5() {
      a0 var1 = new a0();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(a0 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a0) ? false : this.l6((a0)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a0 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a0 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
