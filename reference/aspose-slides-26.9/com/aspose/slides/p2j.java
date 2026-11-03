package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class p2j {
   public static void n5(Table var0, com.aspose.slides.internal.k4y.y7e var1, x0a var2) {
      if (var0 == null) {
         throw new ArgumentNullException("table");
      }

      if (var1 == null) {
         throw new ArgumentNullException("tableElement");
      }

      var1.k5(var0.getName());
      l6(var0, var1, var2);
      k5(var0, var1, var2);
   }

   private static void l6(Table var0, com.aspose.slides.internal.k4y.y7e var1, x0a var2) {
      IGenericEnumerator var3 = var0.getColumns().iterator();

      try {
         while (var3.hasNext()) {
            Column var4 = (Column)var3.next();
            com.aspose.slides.internal.k4y.l5h var5 = (com.aspose.slides.internal.k4y.l5h)var1.n5("table-column").l6();
            com.aspose.slides.internal.k4y.y2i var6 = var2.n5("co", 6);
            var5.n5(var6.n5());
            com.aspose.slides.internal.k4y.n0l var7 = (com.aspose.slides.internal.k4y.n0l)var6.n5("table-column-properties").l6();
            var7.n5(t2f.n5(var4.getWidth()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void k5(Table var0, com.aspose.slides.internal.k4y.y7e var1, x0a var2) {
      int var3 = var0.getColumns().size();

      for (int var4 = 0; var4 < var0.getRows().size(); var4++) {
         Row var5 = (Row)var0.getRows().get_Item(var4);
         com.aspose.slides.internal.k4y.w1x var6 = (com.aspose.slides.internal.k4y.w1x)var1.l6("table-row").l6();
         com.aspose.slides.internal.k4y.y2i var7 = var2.n5("ro", 7);
         var6.l6(var7.n5());
         com.aspose.slides.internal.k4y.s6j var8 = (com.aspose.slides.internal.k4y.s6j)var7.n5("table-row-properties").l6();
         var8.n5(t2f.n5(var5.getHeight()));
         int var9 = 0;

         while (var9 < var3) {
            Cell var10 = var0.n5(var9, var4);
            var9++;
            if (var10.c8()) {
               var6.n5("covered-table-cell");
            } else {
               com.aspose.slides.internal.k4y.p6d var11 = (com.aspose.slides.internal.k4y.p6d)var6.n5("table-cell").l6();
               b3e.n5((TextFrame)var10.getTextFrame(), new p2j$1(var11), var6.n5(), var2);
               var11.n5(var10.getColSpan() & 4294967295L);
               var11.l6(var10.getRowSpan() & 4294967295L);
               n5(var10, var11, var2);
            }
         }
      }
   }

   private static void n5(Cell var0, com.aspose.slides.internal.k4y.p6d var1, x0a var2) {
      com.aspose.slides.internal.k4y.y2i var3 = var2.n5("ce", 8);
      var1.l6(var3.n5());
      IFillFormatEffectiveData var4 = var0.getCellFormat().getFillFormat().getEffective();
      com.aspose.slides.internal.k4y.b4u var5 = t2f.n5(com.aspose.slides.internal.k4y.b4u.class, "table-cell-properties", var3.u3(), new p2j$2(var3));
      if (var4.getFillType() == 1 && (((f6a)var4).h0().s7() & 255) > 0) {
         var5.n5(t2f.n5(((f6a)var4).h0().o8()));
      }

      var5.n5(n5(var0.getTextAnchorType()));
      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginTop())) {
         var5.u9(t2f.n5(var0.getMarginTop()));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginRight())) {
         var5.t2(t2f.n5(var0.getMarginRight()));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginBottom())) {
         var5.h0(t2f.n5(var0.getMarginBottom()));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginLeft())) {
         var5.c8(t2f.n5(var0.getMarginLeft()));
      }

      com.aspose.slides.internal.k4y.p3w var6 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3(), new p2j$3(var3));
      j2k.n5(var4, new i4v(var6), var2.l6());
      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginTop())) {
         var6.m1(t2f.n5(var0.getMarginTop()));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginRight())) {
         var6.z8(t2f.n5(var0.getMarginRight()));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginBottom())) {
         var6.k7(t2f.n5(var0.getMarginBottom()));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginLeft())) {
         var6.m3(t2f.n5(var0.getMarginLeft()));
      }

      var6.l6(b3e.n5(var0.getTextAnchorType()));
      com.aspose.slides.internal.k4y.v5n var7 = t2f.n5(com.aspose.slides.internal.k4y.v5n.class, "paragraph-properties", var3.u3(), new p2j$4(var3));
      if (var0.getTextVerticalType() == 1) {
         var7.u3(3);
      }

      n5(var0, var5, var7);
   }

   private static void n5(Cell var0, com.aspose.slides.internal.k4y.b4u var1, com.aspose.slides.internal.k4y.v5n var2) {
      ICellFormatEffectiveData var3 = var0.x8().getEffective();
      String var4 = com.aspose.slides.ms.System.d1.n5;
      String var5 = com.aspose.slides.ms.System.d1.n5;
      String[] var6 = new String[]{var4};
      String[] var7 = new String[]{var5};
      n5(var3.getBorderTop(), var6, var7);
      var4 = var6[0];
      var5 = var7[0];
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         var1.l6(var4);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var5)) {
         var2.t2(var5);
      }

      var6[0] = var4;
      var7[0] = var5;
      n5(var3.getBorderLeft(), var6, var7);
      var4 = var6[0];
      var5 = var7[0];
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         var1.u3(var4);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var5)) {
         var2.x8(var5);
      }

      var6[0] = var4;
      var7[0] = var5;
      n5(var3.getBorderBottom(), var6, var7);
      var4 = var6[0];
      var5 = var7[0];
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         var1.k5(var4);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var5)) {
         var2.s7(var5);
      }

      var6[0] = var4;
      var7[0] = var5;
      n5(var3.getBorderRight(), var6, var7);
      var4 = var6[0];
      var5 = var7[0];
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         var1.a6(var4);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var5)) {
         var2.n3(var5);
      }
   }

   private static void n5(ILineFormatEffectiveData var0, String[] var1, String[] var2) {
      switch (var0.getFillFormat().getFillType()) {
         case 0:
            var1[0] = "none";
            var2[0] = "none";
            break;
         case 1:
            double var3 = com.aspose.slides.ms.System.d2.k5(var0.getWidth()) ? 1.0 : var0.getWidth();
            var1[0] = com.aspose.slides.ms.System.d1.n5("{0} {1} {2}",new Object[]{ t2f.k5(var3), "solid", t2f.n5(((z1a)var0.getFillFormat()).u3().o8())});
            var2[0] = com.aspose.slides.ms.System.d1.n5("{0} {1} {2}",new Object[]{ t2f.k5(var3 * 0.5), "solid", t2f.n5(((z1a)var0.getFillFormat()).u3().o8())});
            break;
         default:
            var1[0] = com.aspose.slides.ms.System.d1.n5;
            var2[0] = com.aspose.slides.ms.System.d1.n5;
      }
   }

   private static int n5(byte var0) {
      switch (var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         default:
            return 4;
      }
   }
}
