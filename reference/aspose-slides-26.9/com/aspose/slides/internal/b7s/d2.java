package com.aspose.slides.internal.b7s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class d2 extends x9 {
   private final byte[][] n5;
   private final int[] l6;
   private final d5 k5;

   public d2(byte[][] var1, int[] var2, d5 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public void n5(y0 var1) {
      y2 var2 = n5(var1, this.k5, this.k5.c8());
      h0[] var3 = new h0[this.k5.a6()];

      for (int var4 = 0; var4 < this.k5.a6(); var4++) {
         var3[var4] = n5(var4, this.n5[var4], this.l6[var4], this.k5, this.k5.e2()[var4]);
      }

      switch (this.k5.h0()) {
         case 1:
            var2.n5(var3);
            break;
         case 2:
            var2.l6(var3);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }
}
