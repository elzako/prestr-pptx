package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.q1;

public class a0 extends v4 {
   public a0(int var1) {
      this.u9(0);
      this.c8(var1);
      this.h0(var1);
      this.a6(1 << this.a6());
      this.u3(this.l6() - 1);
      this.t2(2 * (var1 + q1.n5(8, var1)));
      this.s7(64);
   }

   @Override
   public int n5(int var1) {
      return this.k5(var1);
   }

   @Override
   public boolean l6(int var1, int var2) {
      return var1 == var2;
   }

   public int k5(int var1) {
      return var1 << 32 - this.a6() >> 32 - this.a6();
   }

   @Override
   public int n5(int var1, int var2) {
      return this.n5() & var1 + var2;
   }

   @Override
   public int l6(int var1) {
      return (var1 & this.n5()) == var1 ? var1 : ~(var1 >> 31) & this.n5();
   }
}
