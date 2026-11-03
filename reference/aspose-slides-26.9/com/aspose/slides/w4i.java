package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class w4i {
   private final n1g n5;

   public w4i(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      boolean var1 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
      float var2 = o9b.n5(
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().k5() - this.n5.e5().a6(), 13),
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().a6(), 13),
         var1,
         this.n5.m1()
      );
      List var3 = this.n5.y4();
      p4p var4 = new p4p(this.n5);
      t9z var5 = ((g3y)var3.get_Item(var3.size() - 1)).c8().get_Item(0);
      List$Enumerator var6 = var4.n5(var2).iterator();

      try {
         while (var6.hasNext()) {
            k4l var7 = (k4l)var6.next();
            var5.n5(var7);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }
}
