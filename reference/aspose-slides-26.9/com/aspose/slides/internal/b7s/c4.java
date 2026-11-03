package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.q1;

public class c4 extends v4 {
   public c4(int var1, int var2) {
      this(var1, var2, 64);
   }

   public c4(int var1, int var2, int var3) {
      this.u3(var1);
      this.a6((var1 + 2 * var2) / (2 * var2 + 1) + 1);
      this.u9(var2);
      this.h0(v4.x8(this.l6()));
      this.c8(v4.x8(var1));
      this.t2(2 * (this.a6() + q1.n5(8, this.a6())));
      this.s7(var3);
   }

   @Override
   public int n5(int var1) {
      return this.k5(this.n3(var1));
   }

   @Override
   public int n5(int var1, int var2) {
      return this.e2(var1 + this.y4(var2));
   }

   @Override
   public boolean l6(int var1, int var2) {
      return q1.n5(var1 - var2) <= this.k5();
   }

   @Override
   public int l6(int var1) {
      return (var1 & this.n5()) == var1 ? var1 : ~(var1 >> 31) & this.n5();
   }

   public int k5(int var1) {
      com.aspose.slides.internal.f8y.n5.n5(q1.n5(var1) <= this.l6(), "Condition Abs(errorValue) <= RANGE is violated.");
      if (var1 < 0) {
         var1 += this.l6();
      }

      if (var1 >= (this.l6() + 1) / 2) {
         var1 -= this.l6();
      }

      com.aspose.slides.internal.f8y.n5.n5(-this.l6() / 2 <= var1 && var1 <= this.l6() / 2 - 1, "The error doesn't lie in the range relevant for coding");
      return var1;
   }

   private int n3(int var1) {
      return var1 > 0 ? (var1 + this.k5()) / (2 * this.k5() + 1) : -(this.k5() - var1) / (2 * this.k5() + 1);
   }

   private int y4(int var1) {
      return var1 * (2 * this.k5() + 1);
   }

   private int e2(int var1) {
      if (var1 < -this.k5()) {
         var1 += this.l6() * (2 * this.k5() + 1);
      } else if (var1 > this.n5() + this.k5()) {
         var1 -= this.l6() * (2 * this.k5() + 1);
      }

      return this.l6(var1);
   }
}
