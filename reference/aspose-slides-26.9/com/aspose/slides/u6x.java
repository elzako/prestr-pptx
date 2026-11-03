package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class u6x extends com.aspose.slides.internal.v6g.h0<u6x> {
   private double n5;
   private double l6;
   private double k5;
   private double u3;

   public u6x() {
   }

   public final double n5() {
      return com.aspose.slides.ms.System.q1.k5(this.n5, this.k5);
   }

   public final double l6() {
      return com.aspose.slides.ms.System.q1.k5(this.l6, this.u3);
   }

   public final double k5() {
      return this.n5() + this.t2();
   }

   public final double u3() {
      return this.l6() + this.s7();
   }

   public final double a6() {
      return this.n5;
   }

   public final double u9() {
      return this.l6;
   }

   public final double h0() {
      return this.k5;
   }

   public final double c8() {
      return this.u3;
   }

   public final double t2() {
      return com.aspose.slides.ms.System.q1.n5(this.k5 - this.n5);
   }

   public final double s7() {
      return com.aspose.slides.ms.System.q1.n5(this.u3 - this.l6);
   }

   public final e4c x8() {
      return new e4c(this.n5() + this.t2() / 2.0, this.l6() + this.s7() / 2.0);
   }

   public final double n3() {
      return com.aspose.slides.ms.System.q1.z3(com.aspose.slides.ms.System.q1.a6(this.t2(), 2.0) + com.aspose.slides.ms.System.q1.a6(this.s7(), 2.0));
   }

   public final double y4() {
      double var1 = com.aspose.slides.ms.System.q1.e2(this.s7() / this.n3()) * (180.0 / Math.PI);
      int var3;
      if (this.n5 <= this.k5) {
         var3 = this.l6 <= this.u3 ? 2 : 1;
      } else {
         var3 = this.l6 <= this.u3 ? 3 : 4;
      }

      switch (var3) {
         case 1:
            return 360.0 - var1;
         case 2:
            return var1;
         case 3:
            return 180.0 - var1;
         case 4:
            return 180.0 + var1;
         default:
            return 0.0;
      }
   }

   public final e4c e2() {
      double var1 = this.n3();
      return new e4c((this.n5 - this.k5) / var1, (this.l6 - this.u3) / var1);
   }

   public u6x(double var1, double var3, double var5, double var7) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var5;
      this.u3 = var7;
   }

   public u6x(e4c var1, e4c var2) {
      this(var1.n5, var1.l6, var2.n5, var2.l6);
   }

   public u6x(e4c var1, double var2, double var4, double var6) {
      this(new e4c(var1.n5 * var2, var1.l6 * var2), var4, var6);
   }

   public u6x(e4c var1, double var2, double var4) {
      this.n5 = var1.n5 - var2 / 2.0;
      this.l6 = var1.l6 - var4 / 2.0;
      this.k5 = var1.n5 + var2 / 2.0;
      this.u3 = var1.l6 + var4 / 2.0;
   }

   public u6x(IGenericEnumerable<u6x> var1) {
      this.n5 = Double.MAX_VALUE;
      this.l6 = Double.MAX_VALUE;
      this.k5 = -Double.MAX_VALUE;
      this.u3 = -Double.MAX_VALUE;
      boolean var2 = false;
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            u6x var4 = (u6x)var3.next();
            if (!var2) {
               var2 = true;
            }

            this.n5 = com.aspose.slides.ms.System.q1.k5(this.n5, var4.n5());
            this.l6 = com.aspose.slides.ms.System.q1.k5(this.l6, var4.l6());
            this.k5 = com.aspose.slides.ms.System.q1.l6(this.k5, var4.n5() + var4.t2());
            this.u3 = com.aspose.slides.ms.System.q1.l6(this.u3, var4.l6() + var4.s7());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (!var2) {
         this.n5 = this.l6 = this.k5 = this.u3 = 0.0;
      }
   }

   public final List<j8t> n5(double var1, double var3) {
      double var5 = 1.0E-4;
      List var7 = new List(2);
      if (com.aspose.slides.ms.System.q1.n5(var1 - this.n5) < 1.0E-4) {
         var7.addItem(new j8t((byte)-1, (byte)0));
      } else if (com.aspose.slides.ms.System.q1.n5(var1 - this.k5) < 1.0E-4) {
         var7.addItem(new j8t((byte)1, (byte)0));
      }

      if (com.aspose.slides.ms.System.q1.n5(var3 - this.l6) < 1.0E-4) {
         var7.addItem(new j8t((byte)0, (byte)-1));
      } else if (com.aspose.slides.ms.System.q1.n5(var3 - this.u3) < 1.0E-4) {
         var7.addItem(new j8t((byte)0, (byte)1));
      }

      return var7;
   }

   public final e4c[] t9() {
      return new e4c[]{new e4c(this.n5(), this.l6()), new e4c(this.k5(), this.l6()), new e4c(this.k5(), this.u3()), new e4c(this.n5(), this.u3())};
   }

   public final u6x l6(double var1, double var3) {
      return new u6x(this.n5() - var1, this.l6() - var3, this.k5() + var1, this.u3() + var3);
   }

   public final u6x n5(double var1) {
      return this.l6(var1, var1);
   }

   public final u6x l6(double var1) {
      return new u6x(this.x8().u9(), this.t2() * var1, this.s7() * var1);
   }

   public final u6x n5(u6x var1) {
      return new u6x(
         com.aspose.slides.ms.System.q1.k5(this.n5(), var1.n5()),
         com.aspose.slides.ms.System.q1.k5(this.l6(), var1.l6()),
         com.aspose.slides.ms.System.q1.l6(this.n5() + this.t2(), var1.n5() + var1.t2()),
         com.aspose.slides.ms.System.q1.l6(this.l6() + this.s7(), var1.l6() + var1.s7())
      );
   }

   public final u6x l6(u6x var1) {
      double var2 = com.aspose.slides.ms.System.q1.l6(
         0.0, com.aspose.slides.ms.System.q1.k5(this.k5(), var1.k5()) - com.aspose.slides.ms.System.q1.l6(this.n5(), var1.n5())
      );
      double var4 = com.aspose.slides.ms.System.q1.l6(
         0.0, com.aspose.slides.ms.System.q1.k5(this.u3(), var1.u3()) - com.aspose.slides.ms.System.q1.l6(this.l6(), var1.l6())
      );
      if (var2 > 0.0 && var4 > 0.0) {
         double var6 = com.aspose.slides.ms.System.q1.k5(this.k5(), var1.k5());
         double var8 = com.aspose.slides.ms.System.q1.k5(this.u3(), var1.u3());
         return new u6x(var6 - var2, var8 - var4, var6, var8);
      } else {
         return new u6x();
      }
   }

   public final boolean k5(u6x var1) {
      return com.aspose.slides.ms.System.q1.n5((double)(var1.n5()), 3) >= com.aspose.slides.ms.System.q1.n5((double)(this.n5()), 3)
         && com.aspose.slides.ms.System.q1.n5((double)(var1.l6()), 3) >= com.aspose.slides.ms.System.q1.n5((double)(this.l6()), 3)
         && var1.k5() <= this.k5()
         && var1.u3() <= this.u3();
   }

   public final u6x k5(double var1, double var3) {
      return new u6x(this.n5() + var1, this.l6() + var3, this.k5() + var1, this.u3() + var3);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("X = {0:0.0} Y = {1:0.0} Width = {2:0.0} Height = {3:0.0}", this.n5(), this.l6(), this.t2(), this.s7());
   }

   public static u6x n5(u6x var0, u6x var1) {
      return var0.l6(var1.z1());
   }

   public static u6x l6(u6x var0, u6x var1) {
      return var0.n5(var1.z1());
   }

   public void u3(u6x var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public u6x z1() {
      u6x var1 = new u6x();
      this.u3(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.z1();
   }

   private boolean a6(u6x var1) {
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
         return !(obj instanceof u6x) ? false : this.a6((u6x)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u6x Clone() {
      return this.z1();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(u6x bridgeArg0) {
      this.u3(bridgeArg0);
   }


   static {
      com.aspose.slides.internal.v6g.k5.n5(e4c.class, new u6x$1());
   }
}
