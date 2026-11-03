package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;

final class u3$a6 extends u3$l6 {
   private u3$a6(Object var1, int var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected u3$n5 n5(int var1, int var2) {
      return new u3$u9(this, var1, var2);
   }

   @Override
   protected Object n5(int var1) {
      int[] var2 = this.u9(var1);
      return this.n5(var2);
   }

   private int[] u9(int var1) {
      u3$u3 var2 = this.l6();
      int[] var3 = new int[u3$u3.l6(var2)];

      for (int var4 = u3$u3.l6(var2) - 1; var4 >= 0; var4--) {
         int var5 = this.a6(var4);
         var3[var4] = var1 % var5;
         var1 /= var5;
      }

      return var3;
   }

   @Override
   protected Object n5(int... var1) {
      if (u3$u3.l6(this.l6()) != var1.length) {
         throw new ArgumentException("Indices length does not match the array rank.");
      }

      Object var2 = this.n5();

      for (int var3 = 0; var3 < var1.length; var3++) {
         com.aspose.slides.internal.w4w.n5 var4 = var3 == var1.length - 1 ? this.k5() : com.aspose.slides.internal.w4w.n5.n5();
         var2 = u3.n5(var4, var2, var1[var3]);
      }

      return var2;
   }

   @Override
   protected void l6(Object var1, int var2) {
      int[] var3 = this.u9(var2);
      this.n5((Object)var1, var3);
   }

   // $VF: synthetic method
   u3$a6(Object var1, int var2, boolean var3, a6 var4) {
      this(var1, var2, var3);
   }
}
