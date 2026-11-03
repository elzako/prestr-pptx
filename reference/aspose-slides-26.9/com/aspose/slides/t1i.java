package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;

class t1i {
   private n2x n5;
   private boolean l6 = false;

   public void n5(ChartDataWorkbook var1, com.aspose.slides.internal.e5a.d2 var2, int var3) {
      if (this.l6) {
         throw new Exception("XlsxSerializator instance can call WriteWorkbookToZipFile() method only once.");
      }

      this.l6 = true;
      com.aspose.slides.internal.c8m.b6 var4 = new com.aspose.slides.internal.c8m.b6();
      this.n5 = new n2x(var4, var1);
      if (var1.y4() != null) {
         var1.x8();
      }

      var1.l6.n5();
      com.aspose.slides.internal.c8m.q6 var5 = this.n5(var1.k5());
      com.aspose.slides.internal.c8m.j8 var6 = var4.n5("/xl/workbook.xml", null, var5);
      this.n5(var1, var6);
      d3m var7 = new d3m(var6, this.n5);
      var7.l6(var1);
      var4.c8().l6(var6);
      this.k5(var4, var1);
      this.u3(var4, var1);
      this.a6(var4, var1);
      this.l6(var4, var1);
      this.n5(var4, var1);
      var4.n5(var2);
   }

   private com.aspose.slides.internal.c8m.q6 n5(int var1) {
      com.aspose.slides.internal.c8m.q6 var2;
      switch (var1) {
         case 0:
            var2 = new com.aspose.slides.internal.c8m.l8();
            break;
         case 1:
            var2 = new com.aspose.slides.internal.c8m.s8();
            break;
         case 2:
            var2 = new com.aspose.slides.internal.c8m.g1();
            break;
         case 3:
            var2 = new com.aspose.slides.internal.c8m.i3();
            break;
         default:
            throw new ArgumentOutOfRangeException("outputType");
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/xl/sharedStrings.xml", null, new com.aspose.slides.internal.c8m.x0());
      g4i var4 = new g4i(var3, this.n5);
      var4.l6(var2);
      var1.z3().e2().l6(var3);
   }

   private void l6(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/xl/styles.xml", null, new com.aspose.slides.internal.c8m.b4());
      g5c var4 = new g5c(var3, this.n5);
      var4.l6(var2);
      var1.z3().e2().l6(var3);
   }

   private void n5(ChartDataWorkbook var1, com.aspose.slides.internal.c8m.j8 var2) {
      w7m var3 = var1.h0();
      d3o.n5(var2, var3.z3(), var3.m1());

      for (h0o var5 : var3.z3()) {
         d3o.n5(this.n5.n5(), var5);
      }
   }

   private void k5(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      if (var1.u9("/docProps/core.xml") == null) {
         com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/docProps/core.xml", null, new com.aspose.slides.internal.c8m.y1());
         r0w var4 = new r0w(var3, this.n5);
         var4.l6(var2.h0().k7());
         var1.c8().l6(var3);
      }
   }

   private void u3(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/docProps/app.xml", null, new com.aspose.slides.internal.c8m.i9());
      d1t var4 = new d1t(var3, this.n5);
      var4.n5(var2.h0().k7(), null);
      var1.c8().l6(var3);
   }

   private void a6(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      if (var2.h0().k7().getCountOfCustomProperties() > 0) {
         com.aspose.slides.internal.c8m.j8 var3 = var1.n5("/docProps/custom.xml", null, new com.aspose.slides.internal.c8m.a0());
         var1.c8().l6(var3);
         f7v var4 = new f7v(var3, this.n5);
         var4.l6(var2.h0().k7());
      }
   }
}
