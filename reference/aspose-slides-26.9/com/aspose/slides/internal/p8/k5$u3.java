package com.aspose.slides.internal.p8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.v3.a6;

class k5$u3 implements k5$a6 {
   private k5$u3() {
   }

   @Override
   public final int[] n5(long var1, int var3, int var4, String var5, String var6, String var7) {
      if (var3 == 1488) {
         if (var4 == 1) {
            return k5.n5(var1, var3, k5.c4().length, k5.c4());
         } else if (var4 == 2) {
            return var1 != 0L && var1 <= 1999L ? n5(var1, var5, var7) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static int[] n5(long var0, String var2, String var3) {
      List var4 = new List();
      int[] var5 = k5.c4();
      int var6 = (int)(var0 / 1000L % 10L);
      int var7 = (int)(var0 / 100L % 10L);
      int var8 = (int)(var0 / 10L % 10L);
      int var9 = (int)(var0 / 1L % 10L);
      if (var6 > 0) {
         var4.addItem(var5[0 + (var6 - 1)]);
         var4.addItem(1523);
      }

      if (var7 > 0) {
         if (var7 < 5) {
            var4.addItem(var5[18 + (var7 - 1)]);
         } else if (var7 < 9) {
            var4.addItem(var5[21]);
            var4.addItem(1524);
            var4.addItem(var5[18 + (var7 - 5)]);
         } else if (var7 == 9) {
            var4.addItem(var5[21]);
            var4.addItem(var5[21]);
            var4.addItem(1524);
            var4.addItem(var5[18 + (var7 - 9)]);
         }
      }

      if (var0 == 15L) {
         var4.addItem(var5[8]);
         var4.addItem(1524);
         var4.addItem(var5[5]);
      } else if (var0 == 16L) {
         var4.addItem(var5[8]);
         var4.addItem(1524);
         var4.addItem(var5[6]);
      } else {
         if (var8 > 0) {
            var4.addItem(var5[9 + (var8 - 1)]);
         }

         if (var9 > 0) {
            var4.addItem(var5[0 + (var9 - 1)]);
         }
      }

      return a6.n5(var4);
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/p8/k5$1;)V -> ()V
   k5$u3(com.aspose.slides.internal.p8.k5$1 recoveredArg0) {
      this();
   }
}
