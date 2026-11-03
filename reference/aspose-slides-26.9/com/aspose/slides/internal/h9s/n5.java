package com.aspose.slides.internal.h9s;

public class n5 {
   private final int[] n5;

   public n5(int var1, int var2, int var3) {
      int[] var4 = new int[var2 + 1];

      for (int var5 = 0; var5 < var4.length - 1; var5++) {
         var4[var5 + 1] = var4[var5] + var3;
      }

      var4[var4.length - 1] = var1;
      this.n5 = var4;
   }

   public final int n5() {
      return this.n5.length;
   }

   public final int n5(int var1) {
      return this.n5[var1];
   }

   public final int l6(int var1) {
      int var2 = this.n5.length;
      int var3 = 0;

      while (var2 - var3 > 1) {
         int var4 = var2 + var3 >> 1;
         if (var1 == this.n5[var4]) {
            var3 = var4;
            break;
         }

         if (var1 < this.n5[var4]) {
            var2 = var4;
         } else {
            var3 = var4;
         }
      }

      return var3;
   }
}
