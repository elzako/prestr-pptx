package com.aspose.slides.internal.b9y;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

abstract class k5 {
   private int n5;
   private final int l6;
   private final int k5;
   private final int u3;
   private final int a6;
   private int u9;
   private int h0;

   protected k5(int var1, int var2) {
      if (var1 > 8) {
         throw new ArgumentOutOfRangeException("tableBitsSize", "Too big code size. The maximal allowed is 8 bits.");
      }

      if (var1 < 1) {
         throw new ArgumentOutOfRangeException("tableBitsSize", "Too small code size. The minimal allowed is 1 bit.");
      }

      this.n5 = var1;
      if (this.n5 == 1) {
         this.n5 = 2;
      }

      if (var1 + 1 > 12) {
         throw new ArgumentOutOfRangeException(
            "tableBitsSize",
            d1.n5(
               "Too big code size. The maximal allowed is {0} bits. LZW does not allow compression sizes to be greater than {0} bits",
               new Object[]{com.aspose.slides.internal.v6g.k5.l6(12)}
            )
         );
      }

      if (this.n5 < 2) {
         throw new ArgumentOutOfRangeException("tableBitsSize", "Too small code size. The minimal allowed is 2 bits.");
      }

      this.u9 = this.n5 + 1;
      this.l6 = 1 << this.n5;
      this.k5 = this.l6 + 1;
      this.u3 = this.k5 + 1;
      this.a6 = var2;
   }

   public int u9() {
      return this.k5;
   }

   public int h0() {
      return this.l6;
   }

   public int c8() {
      return this.u3;
   }

   public int t2() {
      return this.n5;
   }

   protected int s7() {
      return this.u9;
   }

   protected void u3(int var1) {
      if (var1 > 12) {
         throw new ArgumentOutOfRangeException(
            "value",
            d1.n5(
               "Too big code size. The maximal allowed is {0} bits. LZW does not allow compression sizes to be greater than {0} bits",
               new Object[]{com.aspose.slides.internal.v6g.k5.l6(12)}
            )
         );
      }

      if (var1 < 2) {
         throw new ArgumentOutOfRangeException("value", "Too small code size. The minimal allowed is 2 bits.");
      }

      if (this.u9 != var1) {
         this.u9 = var1;
         this.u3();
      }
   }

   protected int x8() {
      return this.h0;
   }

   protected void n3() {
      this.h0 = this.a6((1 << this.s7()) - this.c8());
   }

   protected void y4() {
      int var1 = this.n5 + 1;
      if (var1 > 12) {
         var1 = 12;
      }

      this.u3(var1);
      this.h0 = this.a6((1 << this.s7()) - this.c8());
   }

   protected int a6(int var1) {
      return var1;
   }

   protected void e2() {
      int var1 = this.u9 + 1;
      if (var1 > 12) {
         var1 = 12;
      }

      this.u3(var1);
      this.h0 = this.a6((1 << this.s7()) - this.c8());
   }

   protected void u3() {
   }
}
