package com.aspose.slides.internal.p8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.v3.a6;

class k5$c8 implements k5$a6 {
   private k5$c8() {
   }

   @Override
   public final int[] n5(long var1, int var3, int var4, String var5, String var6, String var7) {
      List var8 = new List();
      if (var1 == 0L) {
         return null;
      }

      String[] var9;
      int var10;
      if (k5.n5(var5, "unicode-number-forms")) {
         var9 = k5.z8();
         var10 = 199999;
      } else if (k5.n5(var5, "large")) {
         var9 = k5.j5();
         var10 = 199999;
      } else {
         var9 = k5.w1();
         var10 = 4999;
      }

      if (var1 > var10) {
         return null;
      }

      while (var1 > 0L) {
         int var11 = 0;

         for (int var12 = k5.r4().length; var11 < var12; var11++) {
            int var13 = k5.r4()[var11];
            if (var1 >= var13 && var9[var11] != null) {
               k5.n5(var8, new List(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(u3.n5(var9[var11], 0, true))))));
               var1 -= var13;
               break;
            }
         }
      }

      if (var3 == 73) {
         return k5.n5(a6.n5(var8));
      } else {
         return var3 == 105 ? k5.l6(a6.n5(var8)) : null;
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/p8/k5$1;)V -> ()V
   k5$c8(com.aspose.slides.internal.p8.k5$1 recoveredArg0) {
      this();
   }
}
