package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.Dictionary;

class x8$n5$n5 {
   private static final byte[] n5 = new byte[]{-128, 64, 32, 16, 8, 4, 2, 1};
   private final Dictionary<Integer, Integer> l6;
   private final x8$n5$n5[] k5 = new x8$n5$n5[8];

   public x8$n5$n5() {
      this.l6 = new Dictionary<>();
   }

   public final void n5(int var1, int var2, int var3) {
      this.l6.addItem(var2, var1);
      if (var3 < 8) {
         int var4 = l6(var1, var3);
         if (this.k5[var4] == null) {
            this.k5[var4] = new x8$n5$n5();
         }

         this.k5[var4].n5(var1, var2, var3 + 1);
      }
   }

   public final Dictionary<Integer, Integer> n5(int var1, int var2) {
      Dictionary var3 = this.l6;
      if (var2 < 8) {
         int var4 = l6(var1, var2);
         if (this.k5[var4] != null) {
            var3 = this.k5[var4].n5(var1, var2 + 1);
         }
      }

      return var3;
   }

   private static int l6(int var0, int var1) {
      return ((var0 >> 16 & n5[var1] & 0xFF) == (n5[var1] & 0xFF) ? 4 : 0)
         | ((var0 >> 8 & n5[var1] & 0xFF) == (n5[var1] & 0xFF) ? 2 : 0)
         | ((var0 & n5[var1] & 0xFF) == (n5[var1] & 0xFF) ? 1 : 0);
   }
}
