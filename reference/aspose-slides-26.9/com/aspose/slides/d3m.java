package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class d3m extends o2k {
   final void n5(ChartDataWorkbook var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "workbook".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.g5w var2 = new com.aspose.slides.internal.k4y.g5w(this.s7());
            if (var2.t2() != null) {
               for (com.aspose.slides.internal.k4y.u8j var6 : var2.t2().n5()) {
                  var1.l6(var6.n5(), var6.l6());
               }
            }

            com.aspose.slides.internal.c8m.a2 var15 = this.n5().k7();

            for (com.aspose.slides.internal.k4y.e4c var7 : var2.u9().l6()) {
               String var8 = var7.k5();
               com.aspose.slides.internal.c8m.j8 var9 = var15.n5(var8).l6();
               var9.n5(this.n5().k5().n5(var9.t2()));
               e6v var10 = new e6v(var9, this.n5());

               try {
                  ChartDataWorksheet var11 = ((ChartDataWorksheetCollection)var1.getWorksheets()).n5();
                  var11.n5(var7.l6());
                  var11.n5(var7.n5());
                  var10.n5(var11);
                  this.n5().n5().addItem(var9.l6(), var11);
               } finally {
                  if (var10 != null) {
                     var10.dispose();
                  }
               }
            }

            w7m var17 = var1.h0();
            var17.n5(var2.a6());
            var17.n5(var2.s7());
            var17.n5(var2.n3());
            var17.n5(var2.t2());
            var17.n5(var2.c8());
            var17.n5(var2.t4());
            var17.n5(var2.l6());
            var17.n5(var2.n5());
            var17.n5(var2.h0());
            var17.n5(var2.x8());
            var17.n5(var2.y4());
            var17.n5(var2.e2());
            var17.n5(var2.t9());
            var17.n5(var2.q0());
            var17.n5(var2.z1());
            var17.n5(var2.k5());
            var17.n5(var2.u3());
            var17.n5(var2.z3());
         }
      }

      this.n3();
   }

   final void l6(ChartDataWorkbook var1) {
      this.y4();
      com.aspose.slides.internal.k4y.g5w var2 = new com.aspose.slides.internal.k4y.g5w();
      long var3 = 1L;
      IGenericEnumerator var5 = var1.getWorksheets().iterator();

      try {
         while (var5.hasNext()) {
            ChartDataWorksheet var6 = (ChartDataWorksheet)var5.next();
            com.aspose.slides.internal.c8m.j8 var7 = this.l6().n5().n5("/xl/worksheets/sheet{0}.xml", new d3m$1(this), new com.aspose.slides.internal.c8m.e8());
            e6v var8 = new e6v(var7, this.l6(), var6);
            var8.l6(var6);
            com.aspose.slides.internal.c8m.r7 var9 = this.t9().e2().l6(var7);
            com.aspose.slides.internal.k4y.e4c var10 = var2.u9().n5();
            var10.l6(var9.a6());
            var10.n5(var3++);
            var10.n5(var6.getName());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      w7m var14 = var1.h0();
      var2.n5(var14.a6());
      var2.n5(var14.t2());
      var2.n5(var14.x8());
      var2.n5(var14.c8());
      var2.n5(var14.h0());
      if (var14.z1() != null) {
         for (com.aspose.slides.internal.k4y.v2i var18 : var14.z1()) {
            var2.n5(var18);
         }
      }

      var2.n5(var14.l6());
      var2.n5(var14.n5());
      var2.n5(var14.u9());
      var2.n5(var14.s7());
      var2.n5(var14.n3());
      var2.n5(var14.y4());
      var2.n5(var14.e2());
      var2.n5(var14.t4());
      var2.n5(var14.t9());
      var2.n5(var14.k5());
      var2.n5(var14.u3());
      var2.n5(var14.q0());
      var2.n5(null, this.x8(), "workbook");
      this.e2();
   }

   public d3m(com.aspose.slides.internal.c8m.j8 var1, o9g var2) {
      super(var1, var2);
   }

   public d3m(com.aspose.slides.internal.c8m.j8 var1, n2x var2) {
      super(var1, var2);
   }
}
