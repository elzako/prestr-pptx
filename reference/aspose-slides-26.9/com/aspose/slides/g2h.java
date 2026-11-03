package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class g2h {
   private o9g n5;
   private com.aspose.slides.internal.c8m.j8 l6;

   public final void n5(
      ChartDataWorkbook var1, com.aspose.slides.internal.z0k.t4 var2, com.aspose.slides.internal.q7.l6 var3, InterruptionToken var4, boolean var5
   ) {
      com.aspose.slides.internal.c8m.b6 var6 = new com.aspose.slides.internal.c8m.b6(var2, new g2h$1(this, var4));
      this.n5 = new o9g(var1, var3, var4);
      this.n5.n5(var6);
      this.n5.n5(var5);
      this.l6 = var6.z3();
      var1.n5(g5g.n5(this.l6.y4().n5(), 0));
      this.n5(var6, var1.u3());
      this.n5(var6, var1);
      this.l6(var6, var1);
      if (var1.k5() == 4) {
         var1.u3().n5("Binary macro-enabled workbook (*.xlsb) format is not supported.", 1);
      } else {
         this.k5(var6, var1);
         this.u3(var6, var1);
         this.a6(var6, var1);
         n5(var6, var1, this.n5);
      }
   }

   private void n5(com.aspose.slides.internal.c8m.b6 var1, e0h var2) {
      if (var1.c8().n5(com.aspose.slides.internal.c8m.o0.n5).length > 0) {
         var2.l6();
         var1.c8().l6(com.aspose.slides.internal.c8m.o0.n5);
      }
   }

   private void n5(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      if (var1.t4() != null) {
         g4i var3 = new g4i(var1.t4(), this.n5);
         var3.n5(var2);
      }
   }

   private void l6(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      if (var1.q0() != null) {
         g5c var3 = new g5c(var1.q0(), this.n5);
         var3.n5(var2);
      }
   }

   private void k5(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      d3m var3 = new d3m(var1.z3(), this.n5);
      var3.n5(var2);
   }

   private void u3(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      if (var1.z1() != null) {
         m6 var3 = new m6(var1.z1(), this.n5);
         var3.n5(var2);
      }
   }

   private void a6(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      if (var1.e2() != null) {
         r0w var3 = new r0w(var1.e2(), this.n5);
         var3.n5(var2.h0().k7());
      }

      if (var1.t9() != null) {
         d1t var4 = new d1t(var1.t9(), this.n5);
         var4.n5(var2.h0().k7());
      }

      if (var1.y4() != null) {
         f7v var5 = new f7v(var1.y4(), this.n5);
         var5.n5(var2.h0().k7());
      }
   }

   static void n5(com.aspose.slides.internal.c8m.b6 var0, ChartDataWorkbook var1, o9g var2) {
      w7m var3 = var1.h0();

      for (com.aspose.slides.internal.c8m.j8 var7 : var0.t2()) {
         if (!var7.s7() && !com.aspose.slides.internal.v6g.k5.l6(var7.y4(), com.aspose.slides.internal.c8m.h1.class)) {
            var3.z3().n5(var7.l6(), var7.a6(), var7.y4().n5(), var7.y4().l6() != null ? var7.y4().l6().n5() : "", var7.e2());
            var7.n5(true);
         }
      }

      for (com.aspose.slides.internal.c8m.r7 var24 : var0.z3().e2().l6()) {
         n5(var3, var3.m1(), var24);
      }

      List var17 = new List();

      for (com.aspose.slides.internal.c8m.j8 var8 : var0.m1()) {
         var17.addItem(var8);
      }

      List$Enumerator var20 = var17.iterator();

      try {
         while (var20.hasNext()) {
            com.aspose.slides.internal.c8m.j8 var23 = (com.aspose.slides.internal.c8m.j8)var20.next();
            IChartDataWorksheet var26 = var2.n5().get_Item(var23.l6());
            u6f var27 = ((ChartDataWorksheet)var26).a6();

            for (com.aspose.slides.internal.c8m.r7 var12 : var23.e2().l6()) {
               n5(var3, var27.e5(), var12);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }
   }

   private static void n5(w7m var0, List<b8o> var1, com.aspose.slides.internal.c8m.r7 var2) {
      h0o var3 = var0.z3().n5(var2.n5());
      if (var3 != null) {
         if (com.aspose.slides.ms.System.d1.n5(var3.u3())) {
            var3.n5(var2.u9());
         }

         var1.addItem(new b8o(var2.a6(), var2.u9(), var2.n5(), var2.h0()));
      } else {
         var1.addItem(new b8o(var2.a6(), var2.u9(), var2.n5(), var2.h0()));
      }
   }
}
