package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class y8b extends z5z {
   private com.aspose.slides.internal.k4y.k3i n5;
   private int l6;
   private f1h k5;
   private static final com.aspose.slides.internal.n8e.e2 u3 = new com.aspose.slides.internal.n8e.e2(
      "none", "animLvl", "animOne", "bulEnabled", "chMax", "chPref", "dir", "hierBranch", "orgChart", "resizeHandles"
   );

   public y8b(com.aspose.slides.internal.k4y.k3i var1, f1h var2) {
      super(var1);
      this.n5 = var1;
      this.l6 = u3.n5(this.n5.c8());
      this.k5 = var2;
   }

   final boolean n5(l6s var1, k6a var2) {
      String var3 = this.l6(var1, var2);
      int var4 = 0;
      int var5 = 0;
      int[] var6 = new int[]{0};
      boolean var7 = com.aspose.slides.ms.System.a3.n5(var3, var6);
      var4 = var6[0];
      if (var7) {
         int[] var8 = new int[]{0};
         com.aspose.slides.ms.System.a3.n5(this.n5.s7(), var8);
         var5 = var8[0];
      }

      boolean var10 = false;
      switch (this.n5.t2()) {
         case 1:
            if (var7) {
               var10 = var4 == var5;
            } else {
               var10 = com.aspose.slides.ms.System.d1.a6(var3, this.n5.s7());
            }
            break;
         case 2:
            if (var7) {
               var10 = var4 != var5;
            } else {
               var10 = !com.aspose.slides.ms.System.d1.a6(var3, this.n5.s7());
            }
            break;
         case 3:
            if (!var7) {
               throw new PptxException("operator \"if\" expression is invalid");
            }

            var10 = var4 > var5;
            break;
         case 4:
            if (!var7) {
               throw new PptxException("operator \"if\" expression is invalid");
            }

            var10 = var4 < var5;
            break;
         case 5:
            if (!var7) {
               throw new PptxException("operator \"if\" expression is invalid");
            }

            var10 = var4 >= var5;
            break;
         case 6:
            if (!var7) {
               throw new PptxException("operator \"if\" expression is invalid");
            }

            var10 = var4 <= var5;
      }

      return var10;
   }

   private String l6(l6s var1, k6a var2) {
      List var3 = var1.n5(this, var2.s7() != null ? var2.s7().l6() : false);
      switch (this.n5.h0()) {
         case 1:
            return com.aspose.slides.ms.System.a3.n5(var3.size(), com.aspose.slides.internal.x7n.l6.k5());
         case 2:
            return com.aspose.slides.ms.System.a3.n5(var1.u3(), com.aspose.slides.internal.x7n.l6.k5());
         case 3:
            int var11 = var1.a6();
            if (var1.e2() == 6) {
               var11--;
            }

            return com.aspose.slides.ms.System.a3.n5(var11, com.aspose.slides.internal.x7n.l6.k5());
         case 4:
            return var1.u3() % 2 == 0 && var3.containsItem(var1) ? "1" : "0";
         case 5:
            return var1.u3() % 2 != 0 && var3.containsItem(var1) ? "1" : "0";
         case 6:
            return this.k5.n5(w4a.class).n5(this.l6, var2);
         case 7:
            return com.aspose.slides.ms.System.a3.n5(var1.z1(), com.aspose.slides.internal.x7n.l6.k5());
         case 8:
            int var4 = 0;
            List var5 = var1.n5(this, false);
            List$Enumerator var6 = var5.iterator();

            try {
               while (var6.hasNext()) {
                  l6s var7 = (l6s)var6.next();
                  if (var7.z1() > var4) {
                     var4 = var7.z1();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }

            l6s var12 = var1;
            if (this.n5().size() > 1) {
               List var8 = var1.n5(this, false, 0, false);
               if (var8.size() > 0) {
                  var12 = (l6s)var8.get_Item(0);
               }
            }

            return com.aspose.slides.ms.System.a3.n5(var4 - var12.z1(), com.aspose.slides.internal.x7n.l6.k5());
         default:
            return com.aspose.slides.ms.System.d1.n5;
      }
   }
}
