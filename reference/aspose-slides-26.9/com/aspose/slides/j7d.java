package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class j7d {
   public static Dictionary<String, i0e> n5(String var0, ChartDataWorksheet var1) {
      Dictionary var2 = new Dictionary<>(com.aspose.slides.ms.System.p6.u3());
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var2;
      }

      com.aspose.slides.internal.k4y.y9a var3 = var1.a6().e2();
      if (var3 == null) {
         return var2;
      }

      com.aspose.slides.internal.k4y.f2e[] var4 = var3.n5();
      if (var4.length == 0) {
         return var2;
      }

      List var5 = var1.u3().u3(com.aspose.slides.ms.System.d1.n5(new String[]{var1.getName(), "!", var0}));
      if (var5.isEmpty()) {
         return var2;
      }

      g1p var6 = (g1p)var5.get_Item(0);
      List var7 = new List();

      for (com.aspose.slides.internal.k4y.f2e var11 : var4) {
         List var12 = var1.u3().u3(com.aspose.slides.ms.System.d1.n5(new String[]{var1.getName(), "!", var11.n5()}));
         if (!var12.isEmpty()) {
            List$Enumerator var13 = var12.iterator();

            try {
               while (var13.hasNext()) {
                  g1p var14 = (g1p)var13.next();
                  if (var14.n5(var6)) {
                     var7.addItem(var14);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                  var13.dispose();
               }
            }
         }
      }

      for (int[] var18 = new int[]{var6.a6()}; var18[0] <= var6.u9(); var18[0]++) {
         for (int[] var19 = new int[]{var6.l6()}; var19[0] <= var6.k5(); var19[0]++) {
            g1p var20 = (g1p)var7.find(new j7d$1(var18, var19));
            if (var20 != null && var18[0] == var20.a6() && var19[0] == var20.l6()) {
               i0e var21 = new i0e();
               var21.n5(com.aspose.slides.ms.System.d1.n5(new String[]{n5.n5(var19[0] + 1), com.aspose.slides.ms.System.a3.l6(var18[0] + 1)}));
               var21.n5(var18[0]);
               var21.l6(var19[0]);
               var21.k5(var20.h0());
               var21.u3(var20.u3());
               var2.set_Item(var21.n5(), var21);
            }
         }
      }

      return var2;
   }
}
