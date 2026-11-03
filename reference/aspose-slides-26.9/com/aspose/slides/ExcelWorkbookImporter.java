package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.k4y.h0m;
import com.aspose.slides.ms.System.IDisposable;
import java.io.InputStream;

public class ExcelWorkbookImporter {
   private ExcelWorkbookImporter() {
   }

   public static IChart addChartFromWorkbook(
      IShapeCollection shapes, float x, float y, IExcelDataWorkbook workbook, String worksheetName, int chartIndex, boolean embedAllWorkbook
   ) {
      return n5((ShapeCollection)shapes, x, y, (ExcelDataWorkbook)workbook, worksheetName, new KeyValuePair<>(chartIndex, null), embedAllWorkbook);
   }

   public static IChart addChartFromWorkbook(
      IShapeCollection shapes, float x, float y, IExcelDataWorkbook workbook, String worksheetName, String chartName, boolean embedAllWorkbook
   ) {
      n5(chartName, "chartName");
      return n5((ShapeCollection)shapes, x, y, (ExcelDataWorkbook)workbook, worksheetName, new KeyValuePair<>(-1, chartName), embedAllWorkbook);
   }

   public static IChart addChartFromWorkbook(
      IShapeCollection shapes, float x, float y, InputStream workbookStream, String worksheetName, String chartName, boolean embedAllWorkbook
   ) {
      return n5(shapes, x, y, com.aspose.slides.internal.z0k.t4.fromJava(workbookStream), worksheetName, chartName, embedAllWorkbook);
   }

   static IChart n5(IShapeCollection var0, float var1, float var2, com.aspose.slides.internal.z0k.t4 var3, String var4, String var5, boolean var6) {
      n5(var3, "workbookStream");
      n5(var5, "chartName");
      return n5((ShapeCollection)var0, var1, var2, var3, var4, new KeyValuePair<>(-1, var5), var6);
   }

   public static IChart addChartFromWorkbook(
      IShapeCollection shapes, float x, float y, String workbookPath, String worksheetName, String chartName, boolean embedWorkbook
   ) {
      n5(workbookPath, "workbookPath");
      n5(chartName, "chartName");
      com.aspose.slides.internal.z0k.n3 var7 = new com.aspose.slides.internal.z0k.n3(workbookPath, 3, 1, 1);

      try {
         IChart var8 = n5((ShapeCollection)shapes, x, y, var7, worksheetName, new KeyValuePair<>(-1, chartName), embedWorkbook);
         if (!embedWorkbook) {
            var8.getChartData().setExternalWorkbook(workbookPath, false);
         }

         return var8;
      } finally {
         var7.dispose();
      }
   }

   public static ITable addTableFromWorkbook(IShapeCollection shapes, float x, float y, IExcelDataWorkbook workbook, String worksheetName, String cellRange) {
      ChartDataWorkbook var6 = (ChartDataWorkbook)((ExcelDataWorkbook)workbook).n5();
      return n5((ShapeCollection)shapes, x, y, var6, worksheetName, cellRange);
   }

   public static ITable addTableFromWorkbook(IShapeCollection shapes, float x, float y, String workbookPath, String worksheetName, String cellRange) {
      n5(workbookPath, "workbookPath");
      com.aspose.slides.internal.z0k.n3 var6 = new com.aspose.slides.internal.z0k.n3(workbookPath, 3, 1, 1);

      try {
         return n5(shapes, x, y, var6, worksheetName, cellRange);
      } finally {
         var6.dispose();
      }
   }

   public static ITable addTableFromWorkbook(IShapeCollection shapes, float x, float y, InputStream workbookStream, String worksheetName, String cellRange) {
      return n5(shapes, x, y, com.aspose.slides.internal.z0k.t4.fromJava(workbookStream), worksheetName, cellRange);
   }

   static ITable n5(IShapeCollection var0, float var1, float var2, com.aspose.slides.internal.z0k.t4 var3, String var4, String var5) {
      Presentation var6 = (Presentation)var0.getParentGroup().getPresentation();
      InterruptionToken var7 = (InterruptionToken)var6.a6().getInterruptionToken();
      ChartDataWorkbook var8 = new ChartDataWorkbook(null, var3, var6.w1(), var7, false);
      return n5((ShapeCollection)var0, var1, var2, var8, var4, var5);
   }

   private static ITable n5(ShapeCollection var0, float var1, float var2, ChartDataWorkbook var3, String var4, String var5) {
      n5(var4, "worksheetName");
      n5(var5, "cellRange");
      ChartDataWorksheet var6 = null;
      IGenericEnumerator var7 = var3.getWorksheets().iterator();

      try {
         while (var7.hasNext()) {
            IChartDataWorksheet var8 = (IChartDataWorksheet)var7.next();
            if (com.aspose.slides.ms.System.d1.a6(var8.getName(), var4)) {
               var6 = com.aspose.slides.internal.v6g.k5.n5(var8, ChartDataWorksheet.class);
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (var6 == null) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"There is no '", var4, "' worksheet in the workbook!"}));
      }

      x6s var60 = var6.l6();
      List var9 = var3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var4, "!", var5}), true, false);
      if (var9.isEmpty()) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"The cell range '", var5, "' is invalid or empty!"}));
      }

      SortedList var10 = new SortedList();
      SortedList var11 = new SortedList();
      List$Enumerator var12 = var9.iterator();

      try {
         while (var12.hasNext()) {
            ChartDataCell var13 = (ChartDataCell)var12.next();
            int var14 = var13.getColumn();
            int var15 = var13.getRow();
            if (!var11.containsKey(var14)) {
               r6i var16 = null;
               r6i[] var17 = new r6i[]{var16};
               boolean var18 = var60.u3.tryGetValue((var14 & 4294967295L) + 1L & 4294967295L, var17);
               var16 = var17[0];
               if (var18) {
                  var11.set_Item(var14, var16.l6());
               } else {
                  var11.set_Item(var14, var60.a6());
               }
            }

            if (!var10.containsKey(var15)) {
               q8g var65 = null;
               q8g[] var68 = new q8g[]{var65};
               boolean var70 = var60.k5.tryGetValue((var15 & 4294967295L) + 1L & 4294967295L, var68);
               var65 = var68[0];
               if (var70) {
                  var10.set_Item(var15, var65.l6());
               } else {
                  var10.set_Item(var15, var60.u9());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      Double[] var61 = new Double[var11.getValues().size()];
      Double[] var62 = new Double[var10.getValues().size()];
      var11.getValues().copyToTArray(var61, 0);
      var10.getValues().copyToTArray(var62, 0);
      Table var63 = (Table)var0.addTable(var1, var2, com.aspose.slides.internal.n8e.v4.n5(var61), com.aspose.slides.internal.n8e.v4.n5(var62));
      i4u var67 = new i4u(var3, var0.getParentGroup().getPresentation());
      IGenericEnumerator var69 = var6.n5().iterator();

      try {
         while (var69.hasNext()) {
            l4a var71 = (l4a)var69.next();
            if (com.aspose.slides.ms.System.d1.a6(var71.h0(), var5)) {
               var67.n5(var63, var71);
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var69, IDisposable.class)) {
            var69.dispose();
         }
      }

      List$Enumerator var72 = var9.iterator();

      try {
         while (var72.hasNext()) {
            ChartDataCell var19 = (ChartDataCell)var72.next();
            int var20 = var19.getColumn() - (Integer)var11.getKeys().get_Item(0);
            int var21 = var19.getRow() - (Integer)var10.getKeys().get_Item(0);
            Cell var22 = com.aspose.slides.internal.v6g.k5.n5(var63.get_Item(var20, var21), Cell.class);
            var67.n5(var22, var19);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var72, IDisposable.class)) {
            var72.dispose();
         }
      }

      Dictionary var73 = j7d.n5(var5, var6);
      List$Enumerator var74 = var9.iterator();

      try {
         while (var74.hasNext()) {
            ChartDataCell var75 = (ChartDataCell)var74.next();
            Cell var76 = com.aspose.slides.internal.v6g.k5.n5(
               var63.get_Item(var75.getColumn() - (Integer)var11.getKeys().get_Item(0), var75.getRow() - (Integer)var10.getKeys().get_Item(0)), Cell.class
            );
            i0e var23 = null;
            i0e[] var24 = new i0e[]{var23};
            boolean var25 = !var73.tryGetValue(var75.a6(), var24);
            var23 = var24[0];
            if (!var25) {
               var76.n5 = var23.l6();
               var76.l6 = var23.k5();
               var76.k5 = null;
               if (var76.h0()) {
                  var76.l6(true);
                  int var26 = var76.s7();
                  if (var26 < var63.getRows().size()) {
                     Cell var27 = com.aspose.slides.internal.v6g.k5.n5(var63.get_Item(var76.getFirstColumnIndex(), var26), Cell.class);
                     ((LineFormat)var76.x8().getBorderBottom()).n5(var27.x8().getBorderTop());
                  }

                  int var78 = var76.t2();
                  if (var78 < var63.getColumns().size()) {
                     Cell var28 = com.aspose.slides.internal.v6g.k5.n5(var63.get_Item(var78, var76.getFirstRowIndex()), Cell.class);
                     ((LineFormat)var76.x8().getBorderRight()).n5(var28.x8().getBorderLeft());
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var74, IDisposable.class)) {
            var74.dispose();
         }
      }

      var63.c8();
      return var63;
   }

   private static IChart n5(ShapeCollection var0, float var1, float var2, ExcelDataWorkbook var3, String var4, KeyValuePair<Integer, String> var5, boolean var6) {
      n5(var4, "worksheetName");
      ChartDataWorkbook var7 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(), ChartDataWorkbook.class);
      Chart var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var0, var1, var2, var7, var4, var5.Clone()), Chart.class);
      var8.u6();
      if (var6) {
         com.aspose.slides.internal.z0k.e2 var9 = new com.aspose.slides.internal.z0k.e2();
         var7.n5(var9);
         ((ChartData)var8.getChartData()).l6().n5(var9);
      }

      return var8;
   }

   private static IChart n5(
      ShapeCollection var0, float var1, float var2, com.aspose.slides.internal.z0k.t4 var3, String var4, KeyValuePair<Integer, String> var5, boolean var6
   ) {
      n5(var4, "worksheetName");
      Presentation var7 = (Presentation)var0.getParentGroup().getPresentation();
      InterruptionToken var8 = (InterruptionToken)var7.a6().getInterruptionToken();
      ChartDataWorkbook var9 = new ChartDataWorkbook(null, var3, var7.w1(), var8, false);
      Chart var10 = com.aspose.slides.internal.v6g.k5.n5(n5(var0, var1, var2, var9, var4, var5.Clone()), Chart.class);
      var10.u6();
      if (var6) {
         if (var3.canSeek()) {
            var3.setPosition(0L);
         }

         ((ChartData)var10.getChartData()).l6().n5(ImageCollection.l6(var3));
      }

      return var10;
   }

   private static IChart n5(ShapeCollection var0, float var1, float var2, ChartDataWorkbook var3, String var4, KeyValuePair<Integer, String> var5) {
      ChartDataWorksheet var6 = null;
      IGenericEnumerator var7 = var3.getWorksheets().iterator();

      try {
         while (var7.hasNext()) {
            IChartDataWorksheet var8 = (IChartDataWorksheet)var7.next();
            if (com.aspose.slides.ms.System.d1.a6(var8.getName(), var4)) {
               var6 = com.aspose.slides.internal.v6g.k5.n5(var8, ChartDataWorksheet.class);
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (var6 == null) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"There is no '", var4, "' worksheet in the workbook!"}));
      }

      boolean var22 = !com.aspose.slides.ms.System.d1.n5((String)var5.getValue());
      h0m var9 = null;
      int var10 = 0;
      List$Enumerator var11 = var6.a6().b3().iterator();

      try {
         while (var11.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var12 = (com.aspose.slides.internal.k4y.g7)var11.next();
            h0m var13 = n5(var12);
            if (var13 != null) {
               if (var22 && com.aspose.slides.ms.System.d1.a6(var13.n5().n5().u3(), (String)var5.getValue())
                  || (Integer)var5.getKey() > -1 && var10 == (Integer)var5.getKey()) {
                  var9 = var13;
                  break;
               }

               var10++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }

      if (var9 == null) {
         if (var22) {
            throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"There is no chart with ", (String)var5.getValue(), " name on the worksheet!"}));
         } else {
            throw new ArgumentException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "There is no chart with ", com.aspose.slides.ms.System.a3.l6((Integer)var5.getKey()), " index on the worksheet!"
               })
            );
         }
      } else {
         i1x var23 = new i1x(new t5w(var0.getParentGroup().getPresentation(), InterruptionToken.getNone()), null);
         var23.n5().n5(com.aspose.slides.internal.l7h.j5.z3().u3("Generated by Aspose.Slides for Java "));
         var23.n5().n5(var6.a6().o0());
         boolean var24 = false;
         boolean[] var14 = new boolean[]{false};
         com.aspose.slides.internal.k4y.s1k var15 = n5(var9, var1, var2, var14);
         var24 = var14[0];
         return o5k.n5(var0, var15, var23, var24, var3);
      }
   }

   static Dictionary<Integer, String> n5(IChartDataWorkbook var0, String var1) {
      Dictionary var2 = new Dictionary();
      IGenericEnumerator var3 = var0.getWorksheets().iterator();

      try {
         while (var3.hasNext()) {
            ChartDataWorksheet var4 = (ChartDataWorksheet)var3.next();
            if (com.aspose.slides.ms.System.d1.a6(var4.getName(), var1)) {
               int var5 = 0;
               List$Enumerator var6 = var4.a6().b3().iterator();

               try {
                  while (var6.hasNext()) {
                     com.aspose.slides.internal.k4y.g7 var7 = (com.aspose.slides.internal.k4y.g7)var6.next();
                     h0m var8 = n5(var7);
                     if (var8 != null) {
                        var2.addItem(var5++, var8.n5().n5().u3());
                     }
                  }
                  break;
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static h0m n5(com.aspose.slides.internal.k4y.g7 var0) {
      if (!"graphicFrame".equals(var0.n5())) {
         return null;
      }

      h0m var1 = com.aspose.slides.internal.v6g.k5.n5(var0.k5(), h0m.class);
      return var1.k5().n5().y4() == null && var1.k5().n5().e2() == null ? null : var1;
   }

   private static com.aspose.slides.internal.k4y.s1k n5(h0m var0, float var1, float var2, boolean[] var3) {
      com.aspose.slides.internal.k4y.s1k var4 = new com.aspose.slides.internal.k4y.s1k();
      var4.n5().n5().n5(var0.n5().n5().u3());
      com.aspose.slides.internal.k4y.s2b var5 = var4.l6().n5();
      var5.n5(var1);
      var5.l6(var2);
      com.aspose.slides.internal.k4y.q8g var6 = var4.l6().l6();
      var6.n5(var0.l6().h0().n5());
      var6.l6(var0.l6().h0().l6());
      var3[0] = false;
      if (var0.k5().n5().y4() != null) {
         var4.k5().n5().l6().n5(var0.k5().n5().y4().n5());
      } else if (var0.k5().n5().e2() != null) {
         var4.k5().n5().k5().n5(var0.k5().n5().e2().n5());
         var3[0] = true;
      }

      return var4;
   }

   private static void n5(String var0, String var1) {
      e7n.n5((String)var0, var1);
      if (var0.isEmpty()) {
         throw new ArgumentException("Value cannot be empty.", var1);
      }
   }

   private static void n5(com.aspose.slides.internal.z0k.t4 var0, String var1) {
      e7n.n5(var0, var1);
      if (var0.getLength() == 0L) {
         throw new ArgumentException("Stream cannot be empty.", var1);
      }
   }
}
