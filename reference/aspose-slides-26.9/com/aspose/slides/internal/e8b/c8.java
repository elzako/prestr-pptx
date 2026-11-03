package com.aspose.slides.internal.e8b;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

class c8 {
   private final t2[] n5;
   private int l6;

   public c8(int var1, int var2) {
      this.n5 = new t2[var1];
      this.l6(var2);
   }

   public final int n5() {
      return this.l6;
   }

   private void l6(int var1) {
      this.l6 = var1;
   }

   public final void n5(double var1, int var3) {
      if (var3 > this.n5.length) {
         throw new IndexOutOfRangeException("Pixel number exceeds block size");
      }

      if (this.n5[var3] == null) {
         this.n5[var3] = new t2(var3);
      }

      this.n5[var3].n5(var1);
   }

   public final t2 n5(int var1) {
      if (var1 > this.n5.length) {
         throw new IndexOutOfRangeException("Pixel number exceeds block size");
      } else if (this.n5[var1] == null) {
         throw new IndexOutOfRangeException("The statistics for pixel is not ready");
      } else {
         return this.n5[var1];
      }
   }

   public final int[][] n5(int var1, int var2, int var3) {
      int[][] var4 = new int[][]{new int[this.n5.length], new int[this.n5.length]};

      for (int var5 = 0; var5 < this.n5.length; var5++) {
         var4[0][var5] = this.n5[var5].l6(var1);
         var4[1][var5] = this.n5[var5].n5(var2, var3);
         if (var4[1][var5] < var4[0][var5]) {
            var4[1][var5] = var4[0][var5];
         }
      }

      return var4;
   }
}
