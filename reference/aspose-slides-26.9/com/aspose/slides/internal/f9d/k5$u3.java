package com.aspose.slides.internal.f9d;

import com.aspose.slides.ms.System.q1;

class k5$u3 {
   private final int n5;
   private final int l6;
   private final k5$k5[] k5;
   private final k5$n5[] u3;
   private final com.aspose.slides.internal.g3j.l6 a6;

   public k5$u3(k5$k5[] var1, k5$n5[] var2, int var3, int var4, com.aspose.slides.internal.g3j.l6 var5) {
      this.k5 = var1;
      this.u3 = var2;
      this.n5 = q1.l6(var3, 8);
      this.l6 = var4;
      this.a6 = var5;
   }

   public final int n5() {
      int var1 = this.n5;
      int var2 = this.a6.n5(var1);
      var2 = (com.aspose.slides.internal.f9d.k5.k5()[var2] & 255) >> 8 - var1;

      while (var1 < 8) {
         if (this.k5[var2].l6() == var1) {
            return this.k5[var2].n5();
         }

         int var3 = this.a6.n5(1);
         var2 = var2 << 1 | var3;
         var1++;
      }

      return this.k5[var2].l6() == var1 ? this.k5[var2].n5() : this.n5(this.u3[var2]);
   }

   private int n5(k5$n5 var1) {
      k5$n5 var2 = var1;

      while (!var2.n5()) {
         int var3 = this.a6.n5(1);
         var2 = var2.n5(var3);
      }

      return var2.l6();
   }
}
