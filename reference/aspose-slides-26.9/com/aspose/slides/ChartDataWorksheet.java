package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class ChartDataWorksheet extends DomObject<ChartDataWorksheetCollection> implements IChartDataWorksheet {
   private v5j k5;
   z2z n5;
   private long u3;
   private String a6 = "*";
   private x6s h0;
   private List<a1k> c8 = new List<>();
   private int t2;
   b6z l6;
   private u6f s7;

   @Override
   public final String getName() {
      return this.a6;
   }

   @Override
   public final int getIndex() {
      return this.t2;
   }

   ChartDataWorksheet(ChartDataWorksheetCollection parentImmediate) {
      super(parentImmediate);
      this.n5(new v5j(this));
      this.n5(parentImmediate, null, null);
   }

   private void n5(ChartDataWorksheetCollection var1, x3h var2, g4l var3) {
      this.h0 = new x6s(this);
      this.l6 = new b6z(this);
      this.s7 = new u6f();
      if (var2 != null && var3 != null) {
         this.n5(var2, var3);
      }
   }

   final void n5(String var1) {
      this.a6 = var1;
   }

   final void n5(int var1) {
      this.t2 = var1;
   }

   final b6z n5() {
      return this.l6;
   }

   final x6s l6() {
      return this.h0;
   }

   final long k5() {
      return this.u3;
   }

   final void n5(long var1) {
      this.u3 = var1;
   }

   final ChartDataWorkbook u3() {
      return this.u9.l6();
   }

   final u6f a6() {
      return this.s7;
   }

   final v5j u9() {
      return this.k5;
   }

   private void n5(v5j var1) {
      this.k5 = var1;
   }

   final void n5(x3h var1, g4l var2) {
      this.n5 = (z2z)var1.h0();
      this.n5.n5.l6 = this;
      w9f var3 = var1.l6("sheetData", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      w9f var4 = var1.l6("cols", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      if (var4 != null) {
         w9f[] var5 = var4.n5("col", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");

         for (w9f var9 : var5) {
            this.c8.addItem((a1k)var9);
         }
      }

      if (var3 != null) {
         this.h0.n5(var3, this.c8);
      }

      w9f var19 = this.n5.k5().l6("tableParts", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      if (var19 != null) {
         w9f[] var20 = var19.n5("tablePart", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");

         for (w9f var10 : var20) {
            String var11 = var10.u3("id", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            IGenericEnumerator var12 = this.n5.l6.iterator();

            try {
               while (var12.hasNext()) {
                  x6u var13 = (x6u)var12.next();
                  if ("http://schemas.openxmlformats.org/officeDocument/2006/relationships/table".equals(var13.k5())
                     && com.aspose.slides.ms.System.d1.a6(var11, var13.l6())) {
                     m2v var14 = this.u3().n5.l6.get_Item(var13.n5());
                     l4a var15 = new l4a(this, (q4e)var14.n5);
                     this.l6.n5(var15);
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }
         }
      }
   }
}
