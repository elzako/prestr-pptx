package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.k4y.f6l;
import com.aspose.slides.internal.k4y.h0m;
import com.aspose.slides.internal.k4y.l2q;
import com.aspose.slides.internal.k4y.r6p;
import com.aspose.slides.internal.k4y.t0g;
import com.aspose.slides.internal.k4y.z1y;
import com.aspose.slides.ms.System.IDisposable;

class c8m extends o2k {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("twoCellAnchor", "oneCellAnchor", "absoluteAnchor");

   final void n5(ChartDataWorksheet var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "wsDr".equals(this.s7().n3())) {
            f6l var2 = new f6l(this.s7());
            u6f var3 = var1.a6();
            var3.n5(this.n5().k7());
            var3.n5(this.n5().h0());
            e4c var4 = new e4c();
            e4c var5 = new e4c();
            List$Enumerator var6 = var2.n5().iterator();

            try {
               while (var6.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var7 = (com.aspose.slides.internal.k4y.g7)var6.next();
                  com.aspose.slides.internal.k4y.g7 var8 = null;
                  switch (n5.n5(var7.n5())) {
                     case 0:
                        z1y var9 = com.aspose.slides.internal.v6g.k5.n5(var7.k5(), z1y.class);
                        var8 = var9.k5();
                        if (!"graphicFrame".equals(var8.n5())) {
                           continue;
                        }

                        h0m var18 = com.aspose.slides.internal.v6g.k5.n5(var9.k5().k5(), h0m.class);
                        n5(var1.l6(), var9.n5()).l6(var4);
                        n5(var1.l6(), var9.l6()).l6(var5);
                        var18.l6().h0().n5(var5.n5 - var4.n5);
                        var18.l6().h0().l6(var5.l6 - var4.l6);
                        break;
                     case 1:
                        r6p var11 = com.aspose.slides.internal.v6g.k5.n5(var7.k5(), r6p.class);
                        var8 = var11.l6();
                        if (!"graphicFrame".equals(var11.l6().n5())) {
                           continue;
                        }

                        h0m var17 = com.aspose.slides.internal.v6g.k5.n5(var11.l6().k5(), h0m.class);
                        var17.l6().h0().n5(var11.n5().n5());
                        var17.l6().h0().l6(var11.n5().l6());
                        break;
                     case 2:
                        t0g var12 = com.aspose.slides.internal.v6g.k5.n5(var7.k5(), t0g.class);
                        var8 = var12.l6();
                        if ("graphicFrame".equals(var12.l6().n5())) {
                           h0m var10 = com.aspose.slides.internal.v6g.k5.n5(var12.l6().k5(), h0m.class);
                           var10.l6().h0().n5(var12.n5().n5());
                           var10.l6().h0().l6(var12.n5().l6());
                           break;
                        }
                     default:
                        continue;
                  }

                  if (var8 != null) {
                     var3.b3().addItem(var8);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      }

      this.n3();
   }

   public c8m(com.aspose.slides.internal.c8m.j8 var1, o9g var2) {
      super(var1, var2);
   }

   private static e4c n5(x6s var0, l2q var1) {
      e4c var2 = e4c.k5.u9();

      for (int var3 = 0; var3 < (var1.n5() & 4294967295L); var3++) {
         r6i var4 = null;
         r6i[] var5 = new r6i[]{var4};
         boolean var6 = var0.u3.tryGetValue(var3 + 1 & 4294967295L, var5);
         var4 = var5[0];
         if (var6) {
            if (!var4.n5()) {
               var2.n5 = var2.n5 + var4.l6();
            }
         } else {
            var2.n5 = var2.n5 + var0.a6();
         }
      }

      var2.n5 = var2.n5 + var1.l6();

      for (int var7 = 0; var7 < (var1.k5() & 4294967295L); var7++) {
         q8g var9 = null;
         q8g[] var11 = new q8g[]{var9};
         boolean var12 = var0.k5.tryGetValue(var7 + 1 & 4294967295L, var11);
         var9 = var11[0];
         if (var12) {
            if (!var9.n5()) {
               var2.l6 = var2.l6 + var9.l6();
            }
         } else {
            var2.l6 = var2.l6 + var0.u9();
         }
      }

      var2.l6 = var2.l6 + var1.u3();
      return var2;
   }
}
