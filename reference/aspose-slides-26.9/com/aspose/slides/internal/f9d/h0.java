package com.aspose.slides.internal.f9d;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

abstract class h0 {
   private int n5;
   private final int l6;
   private final int k5;
   private final int u3;
   private final int a6;
   private int u9;
   private int h0;
   private int c8;

   protected h0(int var1, int var2) {
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
            d1.n5("Too big code size. The maximal allowed is {0} bits. LZW does not allow compression sizes to be greater than {0} bits", new Object[]{12})
         );
      }

      if (var1 < 2) {
         throw new ArgumentOutOfRangeException("tableBitsSize", "Too small code size. The minimal allowed is 2 bits.");
      }

      this.u9 = var1 + 1;
      this.c8 = (1 << this.u9) - 1;
      this.l6 = 1 << var1;
      this.k5 = this.l6 + 1;
      this.u3 = this.k5 + 1;
      this.a6 = var2;
   }

   public final int n5() {
      return this.a6;
   }

   public final int l6() {
      return this.k5;
   }

   public final int k5() {
      return this.l6;
   }

   public final int u3() {
      return this.u3;
   }

   public final int a6() {
      return this.n5;
   }

   protected final int u9() {
      return this.u9;
   }

   protected final void n5(int var1) {
      if (var1 > 12) {
         throw new ArgumentOutOfRangeException(
            "value",
            d1.n5("Too big code size. The maximal allowed is {0} bits. LZW does not allow compression sizes to be greater than {0} bits", new Object[]{12})
         );
      }

      if (var1 < 2) {
         throw new ArgumentOutOfRangeException("value", "Too small code size. The minimal allowed is 2 bits.");
      }

      if (this.u9 != var1) {
         this.u9 = var1;
         this.c8 = (1 << this.u9) - 1;
      }
   }

   protected final int h0() {
      return this.c8;
   }

   protected final int c8() {
      return this.h0;
   }

   protected final void t2() {
      this.h0 = this.l6((1 << this.u9()) - this.u3());
   }

   protected final void s7() {
      int var1 = this.n5 + 1;
      if (var1 > 12) {
         var1 = 12;
      }

      this.n5(var1);
      this.h0 = this.l6((1 << this.u9()) - this.u3());
   }

   protected int l6(int var1) {
      return var1;
   }

   protected final void x8() {
      int var1 = this.u9 + 1;
      if (var1 > 12) {
         var1 = 12;
      }

      this.n5(var1);
      this.h0 = this.l6((1 << this.u9()) - this.u3());
   }
}
