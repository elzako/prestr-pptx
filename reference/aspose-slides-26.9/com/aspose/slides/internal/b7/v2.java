package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.DivideByZeroException;

public class v2 extends com.aspose.slides.internal.v6g.h0<v2> {
   private double n5;
   private double l6;

   public v2() {
      this.n5 = 0.0;
      this.l6 = 0.0;
   }

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public final double k5() {
      return com.aspose.slides.ms.System.q1.z3(this.n5 * this.n5 + this.l6 * this.l6);
   }

   public v2(double var1, double var3) {
      if (com.aspose.slides.ms.System.d2.k5(var1)) {
         throw new ArgumentOutOfRangeException("dx");
      }

      if (com.aspose.slides.ms.System.d2.k5(var3)) {
         throw new ArgumentOutOfRangeException("dy");
      }

      this.n5 = var1;
      this.l6 = var3;
   }

   public final double n5(v2 var1) {
      if (!(this.k5() < 1.0E-6) && !(var1.k5() < 1.0E-6)) {
         return com.aspose.slides.ms.System.q1.y4(
            com.aspose.slides.ms.System.q1.n5((double)((this.n5() * var1.n5() + this.l6() * var1.l6()) / (this.k5() * var1.k5())), 3)
         );
      } else {
         throw new DivideByZeroException();
      }
   }

   public final v2 u3() {
      if (this.k5() < 1.0E-6) {
         throw new DivideByZeroException();
      } else {
         return l6(this, this.k5());
      }
   }

   public final v2 a6() {
      v2 var1 = this.u3().u9();
      return new v2(-var1.l6(), var1.n5());
   }

   public static v2 n5(v2 var0, v2 var1) {
      return new v2(var0.n5 + var1.n5, var0.l6 + var1.l6);
   }

   public static k0 n5(k0 var0, v2 var1) {
      return new k0(var0.n5() + var1.n5, var0.l6() + var1.l6);
   }

   public static v2 n5(v2 var0, double var1) {
      return new v2(var0.n5 * var1, var0.l6 * var1);
   }

   public static v2 l6(v2 var0, double var1) {
      return new v2(var0.n5 / var1, var0.l6 / var1);
   }

   public static v2 l6(v2 var0) {
      return new v2(-var0.n5, -var0.l6);
   }

   public void k5(v2 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public v2 u9() {
      v2 var1 = new v2();
      this.k5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u9();
   }

   private boolean u3(v2 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof v2) ? false : this.u3((v2)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v2 Clone() {
      return this.u9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(v2 bridgeArg0) {
      this.k5(bridgeArg0);
   }

}
