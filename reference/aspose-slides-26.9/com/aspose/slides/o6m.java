package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class o6m {
   static void n5(com.aspose.slides.internal.e1.r4[] var0, com.aspose.slides.internal.o9b.w1[] var1, int[] var2, boolean var3) {
      com.aspose.slides.internal.e1.c4 var4 = new com.aspose.slides.internal.e1.c4();
      var0[0].n5(var4);
      if (var3) {
         var4.n5(var3);
         com.aspose.slides.internal.o9b.w1[] var5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var2.length + 1)
         );
         int[] var6 = new int[var2.length + 1];
         com.aspose.slides.ms.System.u3.n5((Object)(var1)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0);
         var1[0].n5(var5[var2.length]);
         com.aspose.slides.ms.System.u3.n5(var2).copyTo(com.aspose.slides.ms.System.u3.n5(var6), 0);
         var6[var2.length] = var2[var2.length - 1];
         var2[var2.length - 1] = var2[var2.length - 1] & 7;
      }

      List var8 = null;
      int var9 = 0;

      for (int var7 = 0; var7 < var1.length; var7++) {
         if (var2[var7] == 0) {
            var8 = new List();
         }

         if (var9 != 0 && var9 != var2[var7]) {
            n5(var4, var8, var9);
            var8 = new List();
            if (var7 > 0) {
               var8.addItem(var1[var7 - 1].u3());
            }
         }

         if (var8 != null) {
            var8.addItem(var1[var7].u3());
         }

         var9 = var2[var7];
         if (var7 == var1.length - 1 && var8 != null) {
            n5(var4, var8, var9);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.e1.c4 var0, List<com.aspose.slides.internal.o9b.w1> var1, int var2) {
      switch (var2 & 7) {
         case 1:
            var0.l6(var1.toArray(new com.aspose.slides.internal.o9b.w1[0]));
            break;
         case 3:
            var0.k5(var1.toArray(new com.aspose.slides.internal.o9b.w1[0]));
      }
   }
}
