package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class w1$n5 extends h2 implements Cloneable {
   public w1$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      if (d1.a6(var2, "inherit")) {
         return super.n5(var1, var2, var3);
      }

      w1 var4 = new w1(null);
      if (j8.l6(this.l6, var2) && !d1.n5(var3.q_().j5())) {
         var4.n5(x9.l6(var3.q_().j5()));
      }

      int var5 = 0;
      int var6 = d1.u3(var2, ',');
      boolean var7 = false;

      while (!var7) {
         String var8;
         if (var6 == -1) {
            var8 = d1.l6(d1.k5(var2, var5));
            var7 = true;
         } else {
            var8 = d1.l6(com.aspose.slides.internal.v3.x8.n5(var2, var5, var6));
            var5 = var6 + 1;
            var6 = d1.l6(var2, ',', var5);
         }

         int var9 = d1.u3(var8, '\'');
         int var10 = d1.u3(var8, '"');
         if (var9 != -1 || var10 != -1) {
            int var11 = var9 == -1 ? 34 : 39;
            if (var8.length() >= 3 && d1.k5(var8, (char)var11) == var8.length() - 1) {
               var8 = com.aspose.slides.internal.v3.x8.n5(var8, 1, var8.length() - 1);
            } else {
               var8 = d1.n5;
            }
         }

         if (!d1.n5(var8)) {
            for (int var12 = d1.c8(var8, "  "); var12 != -1; var12 = d1.c8(var8, "  ")) {
               var8 = d1.n5(new String[]{com.aspose.slides.internal.v3.x8.n5(var8, 0, var12), d1.k5(var8, var12 + 1)});
            }

            var4.n5(x9.l6(var8));
         }
      }

      return var4;
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, w1.class) ? var1 : new w1(var1, null);
   }
}
