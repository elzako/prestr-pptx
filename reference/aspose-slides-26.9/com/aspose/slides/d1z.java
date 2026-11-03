package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class d1z extends h9p {
   d1z(LegendEntryProperties var1, t9z var2) {
      super(var1);
      this.n5(new n4c(this.n5(var2)));
      this.n5(new x1j(var2));
      this.n5(this.h0());
      this.n5(this.c8());
   }

   private String n5(t9z var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5;
      if (var1.z1() >= 0) {
         g3y var3 = var1.y4();
         ChartSeries var4 = var3.u9();
         n1g var5 = var3.t2();
         List var6 = var4.getPlotOnSecondAxis() ? var5.k5() : var5.l6();
         if (var6.size() == 0) {
            var2 = com.aspose.slides.ms.System.a3.l6(var1.z1() + 1);
         }

         if (var1.z1() < var6.size()) {
            x4 var7 = (x4)var6.get_Item(var1.z1());

            do {
               var2 = com.aspose.slides.ms.System.d1.n5(new String[]{x0g.n5(var7.l6(), var7.u9()), var2});
               var7 = var7.n5();
               if (var7 != null) {
                  var2 = com.aspose.slides.ms.System.d1.n5(new String[]{" ", var2});
               }
            } while (var7 != null);
         }
      }

      return var2;
   }
}
