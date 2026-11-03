package com.aspose.slides.internal.o1o;

import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.k7;
import java.util.ArrayList;
import java.util.List;

abstract class l6 implements k5 {
   private boolean l6;
   private boolean k5;
   private w1 u3;
   protected List<com.aspose.slides.internal.w4c.l6> n5;

   @Override
   public void n5(k7 var1, w1 var2, w1 var3, boolean var4, boolean var5, c8[] var6) {
      this.l6 = var4;
      this.k5 = var5;
      this.u3 = var2;
      this.n5 = this.n5(var3, var1, var6);
   }

   private List<com.aspose.slides.internal.w4c.l6> n5(w1 var1, k7 var2, c8[] var3) {
      w1[] var4 = var2.n5();
      boolean var5 = this.k5 && !this.l6;
      ArrayList var6 = new ArrayList();

      for (int var7 = 0; var7 < var4.length; var7++) {
         int var8 = var7 < var4.length - 1 ? var7 + 1 : 0;
         w1 var9 = var4[var7];
         w1 var10 = var4[var8];
         if (!(u9.n5(this.u3, var9, var10) <= 0.25)) {
            com.aspose.slides.internal.w4c.l6 var11 = null;
            if (var5) {
               var11 = new com.aspose.slides.internal.w4c.n5(this.u3, var9, var10, var1);
            } else {
               var11 = new com.aspose.slides.internal.w4c.k5(this.u3, var9, var10, var3[var7], var3[var8]);
            }

            var6.add(var11);
            this.n5(var11, this.u3, var9, var10);
         }
      }

      return var6;
   }

   protected void n5(com.aspose.slides.internal.w4c.l6 var1, w1 var2, w1 var3, w1 var4) {
   }
}
