package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.DOMResourcesUtils;
import com.aspose.slides.ms.System.IDisposable;

public class ChartDataWorkbook extends DomObject<ChartData> implements IChartDataWorkbook {
   private boolean a6;
   private p4b h0;
   private boolean c8;
   private Chart t2;
   j6s n5;
   g4l l6;
   l1h k5;
   a9f u3;
   private ChartDataWorksheetCollection s7;
   private int x8;
   private final e0h n3 = new e0h();
   private final List<KeyValuePair<String, String>> y4 = new List<>();
   private final x1u e2 = new x1u();
   private final w7m t9 = new w7m();
   private char z1;
   private String t4;
   private static final com.aspose.slides.internal.v6g.u9 q0 = new com.aspose.slides.internal.v6g.u9("application/vnd.openxmlformats-officedocument.vmlDrawing");

   @Override
   public final IChartDataWorksheetCollection getWorksheets() {
      return this.s7;
   }

   @Override
   public final IChartCellCollection getCellCollection(String formula, boolean skipHiddenCells) {
      ChartCellCollection var3 = new ChartCellCollection(this);
      var3.n5(this.n5(formula, skipHiddenCells, true));
      return var3;
   }

   @Override
   public final IChartDataCell getCell(String worksheetName, int row, int column) {
      ChartDataWorksheet var4 = this.l6(worksheetName);
      return var4.l6().l6(row, column);
   }

   @Override
   public final IChartDataCell getCell(int worksheetIndex, int row, int column) {
      this.l6(worksheetIndex);
      return ((ChartDataWorksheet)this.getWorksheets().get_Item(worksheetIndex)).l6().l6(row, column);
   }

   @Override
   public final IChartDataCell getCell(int worksheetIndex, String cellName) {
      this.l6(worksheetIndex);
      return ((ChartDataWorksheet)this.getWorksheets().get_Item(worksheetIndex)).l6().l6(cellName);
   }

   @Override
   public final IChartDataCell getCell(int worksheetIndex, String cellName, Object value) {
      this.l6(worksheetIndex);
      ChartDataCell var4 = ((ChartDataWorksheet)this.getWorksheets().get_Item(worksheetIndex)).l6().l6(cellName);
      var4.n5(value);
      return var4;
   }

   @Override
   public final IChartDataCell getCell(int worksheetIndex, int row, int column, Object value) {
      this.l6(worksheetIndex);
      ChartDataCell var5 = ((ChartDataWorksheet)this.getWorksheets().get_Item(worksheetIndex)).l6().l6(row, column);
      var5.n5(value);
      return var5;
   }

   @Override
   public final void clear(int sheetIndex) {
      if (sheetIndex < this.getWorksheets().size()) {
         ((ChartDataWorksheet)this.getWorksheets().get_Item(sheetIndex)).l6().h0();
      }

      this.l6().k5().n5(this.getWorksheets().get_Item(sheetIndex).getName());
   }

   @Override
   public final void calculateFormulas() {
      this.n5(true);
      List var1 = new List();
      IGenericEnumerator var2 = this.getWorksheets().iterator();

      try {
         while (var2.hasNext()) {
            ChartDataWorksheet var3 = (ChartDataWorksheet)var2.next();
            IGenericEnumerator var4 = var3.l6().iterator();

            try {
               while (var4.hasNext()) {
                  KeyValuePair var5 = (KeyValuePair)var4.next();
                  IGenericEnumerator var6 = ((SortedList)var5.getValue()).iterator();

                  try {
                     while (var6.hasNext()) {
                        KeyValuePair var7 = (KeyValuePair)var6.next();
                        IGenericEnumerator var8 = ((SortedList)var7.getValue()).iterator();

                        try {
                           while (var8.hasNext()) {
                              KeyValuePair var9 = (KeyValuePair)var8.next();
                              if (!com.aspose.slides.ms.System.d1.n5(((ChartDataCell)var9.getValue()).getFormula())) {
                                 var1.addItem(var9.getValue());
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                              var8.dispose();
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      try {
         List$Enumerator var99 = var1.iterator();

         try {
            while (var99.hasNext()) {
               ChartDataCell var100 = (ChartDataCell)var99.next();
               var100.calculate(false);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var99, IDisposable.class)) {
               var99.dispose();
            }
         }

         List$Enumerator var101 = var1.iterator();

         try {
            while (var101.hasNext()) {
               ChartDataCell var102 = (ChartDataCell)var101.next();
               var102.calculate(true);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var101, IDisposable.class)) {
               var101.dispose();
            }
         }

         List$Enumerator var103 = var1.iterator();

         try {
            while (var103.hasNext()) {
               ChartDataCell var104 = (ChartDataCell)var103.next();
               if (var104.t2().z1().c8() == 2) {
                  var104.calculate(true);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var103, IDisposable.class)) {
               var103.dispose();
            }
         }
      } catch (RuntimeException var93) {
         throw var93;
      } finally {
         this.n5(false);
      }
   }

   final IChartDataCell n5(String var1, String var2) {
      ChartDataWorksheet var3 = this.l6(var1);
      return var3.l6().l6(var2);
   }

   final String n5(String var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var1) && this.h0().c8() != null) {
         for (com.aspose.slides.internal.k4y.u8j var5 : this.h0().c8().n5()) {
            if (com.aspose.slides.ms.System.d1.a6(var5.n5(), var1)) {
               return var5.l6();
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   final boolean n5() {
      return this.a6;
   }

   final void n5(boolean var1) {
      this.a6 = var1;
   }

   final p4b l6() {
      return this.h0;
   }

   private void n5(p4b var1) {
      this.h0 = var1;
   }

   final int k5() {
      return this.x8;
   }

   final void n5(int var1) {
      this.x8 = var1;
   }

   final e0h u3() {
      return this.n3;
   }

   final boolean a6() {
      return this.c8;
   }

   final void l6(boolean var1) {
      this.c8 = var1;
   }

   final x1u u9() {
      return this.e2;
   }

   final w7m h0() {
      return this.t9;
   }

   ChartDataWorkbook(
      IChartData parentImmediate, com.aspose.slides.internal.z0k.t4 stream, com.aspose.slides.internal.q7.l6 blobManager, InterruptionToken interruptionToken
   ) {
      this(parentImmediate, stream, blobManager, interruptionToken, true);
   }

   ChartDataWorkbook(
      IChartData parentImmediate,
      com.aspose.slides.internal.z0k.t4 stream,
      com.aspose.slides.internal.q7.l6 blobManager,
      InterruptionToken interruptionToken,
      boolean checkCellFormulas
   ) {
      super((ChartData)parentImmediate);
      this.e2();

      try {
         this.n5(stream, blobManager, interruptionToken, checkCellFormulas);
      } catch (com.aspose.slides.internal.n8e.n5 var7) {
         throw new PptxReadException("Workbook reading aborted.", var7);
      }
   }

   ChartDataWorkbook(IChartData parentImmediate) {
      super((ChartData)parentImmediate);
      this.e2();
      com.aspose.slides.internal.z0k.t4 var2 = DOMResourcesUtils.getResourceStream("template.xlsx");

      try {
         if (var2 == null) {
            throw new PptxException("Aspose.Slides.dll is broken.");
         }

         this.n5(var2, new com.aspose.slides.internal.q7.l6(com.aspose.slides.internal.q7.u3.n5), InterruptionToken.getNone(), true);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void e2() {
      this.z1 = 'A';
      this.n5(new p4b(this));
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.q7.l6 var2, InterruptionToken var3, boolean var4) {
      if (var1.getPosition() != 0L) {
         if (!var1.canSeek()) {
            byte[] var5 = new byte[4096];
            long var6 = 0L;
            com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2((int)var6);

            while (true) {
               int var9 = var1.read(var5, 0, var5.length);
               if (var9 == 0) {
                  var8.seek(0L, 0);
                  var1 = var8;
                  break;
               }

               var8.write(var5, 0, var9);
            }
         } else {
            var1.seek(0L, 0);
         }
      }

      com.aspose.slides.internal.z0k.t4 var12 = var1;
      byte var10 = (byte)var1.readByte();
      var1.seek(-1L, 1);
      if (var10 == 80) {
         this.s7 = new ChartDataWorksheetCollection(this);
         this.l6 = new g4l(this);
         g2h var11 = new g2h();
         var11.n5(this, var12, var2, var3, var4);
      } else {
         throw new InvalidOperationException("Unsupported workbook file format");
      }
   }

   final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.e5a.d2 var2 = new com.aspose.slides.internal.e5a.d2();

      try {
         t1i var3 = new t1i();
         var3.n5(this, var2, this.k5());
         var2.l6(var1);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   final String c8() {
      if (this.k5() == 1) {
         return ".xlsm";
      } else {
         return this.k5() == 4 ? ".xlsb" : ".xlsx";
      }
   }

   final ChartDataCell t2() {
      String var1 = "AUTO_DATA";
      String var2 = "A1";
      String var3 = "A2";
      ChartDataWorksheet var4 = this.s7.l6("AUTO_DATA");
      if (var4 == null) {
         var4 = this.s7.n5("AUTO_DATA");
      }

      ChartDataCell var5 = var4.l6().l6("A1");
      int var6 = var5.getValue() != null ? var5.u9() + 1 : 0;
      ChartDataCell var7 = var4.l6().l6("A2");
      int var8 = var7.getValue() != null ? var7.u9() : 1;
      if (var6 > 65535) {
         if (var8 >= 255) {
            throw new InvalidOperationException("You reached the limit of worksheet, but you are able to add data using ChartDataWorkbook.GetCell method");
         }

         var6 = 0;
         var8++;
      }

      var4.l6().l6("A1").n5(var6);
      var4.l6().l6("A2").n5(var8);
      return var4.l6().l6(var6, var8);
   }

   final ChartDataWorksheet l6(String var1) {
      ChartDataWorksheet var2 = null;
      IGenericEnumerator var3 = this.getWorksheets().iterator();

      try {
         while (var3.hasNext()) {
            ChartDataWorksheet var4 = (ChartDataWorksheet)var3.next();
            if (com.aspose.slides.ms.System.d1.a6(var4.getName(), var1)) {
               var2 = var4;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (var2 == null) {
         var2 = this.s7.n5();
         var2.n5(var1);
         this.l6(true);
      }

      return var2;
   }

   final void l6(String var1, String var2) {
      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         KeyValuePair var3 = new KeyValuePair<>(var1, var2);
         this.y4.addItem(var3.Clone());
      }
   }

   final List<ChartDataCell> n5(String var1, boolean var2, boolean var3) {
      List var4 = new List();
      List var5 = this.u3(var1);
      List$Enumerator var6 = var5.iterator();

      try {
         while (var6.hasNext()) {
            g1p var7 = (g1p)var6.next();
            ChartDataWorksheet var8 = var3 ? this.l6(var7.n5()) : this.s7.l6(var7.n5());
            if (var8 != null) {
               for (int var9 = var7.a6(); var9 <= var7.u9(); var9++) {
                  for (int var10 = var7.l6(); var10 <= var7.k5(); var10++) {
                     ChartDataCell var11 = var8.l6().l6(var9, var10);
                     if (!var11.isHidden() || !var2) {
                        var4.addItem(var11);
                     }
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return var4;
   }

   final String s7() {
      return this.t4;
   }

   final void k5(String var1) {
      this.t4 = var1;
   }

   final List<g1p> u3(String var1) {
      List var2 = new List();
      String[] var3 = com.aspose.slides.ms.System.d1.n5(var1, new char[]{',', ';'}, (short)1);

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         String var6 = null;
         String var7 = null;
         String[] var8 = new String[]{var6};
         String[] var9 = new String[]{var7};
         boolean var10 = !n5(var5, var8, var9);
         var6 = var8[0];
         var7 = var9[0];
         if (!var10 && (var7.length() <= 0 || var7.charAt(0) != '#' || var7.charAt(var7.length() - 1) != '!')) {
            String var11 = this.u9(var7);
            if (!com.aspose.slides.ms.System.d1.n5(var11)) {
               return this.u3(var11);
            }

            String[] var12 = com.aspose.slides.ms.System.d1.n5(var7, new char[]{':'}, (short)1);
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            if (var12.length > 1) {
               int[] var17 = new int[]{0};
               int[] var18 = new int[]{0};
               int[] var19 = new int[]{0};
               int[] var20 = new int[]{0};
               boolean var21 = !n5(var12[0], var17, var18) || !n5(var12[1], var19, var20);
               var13 = var17[0];
               var14 = var18[0];
               var15 = var19[0];
               var16 = var20[0];
               if (var21) {
                  continue;
               }
            } else {
               int[] var28 = new int[]{0};
               int[] var29 = new int[]{0};
               boolean var30 = !n5(var7, var28, var29);
               var13 = var28[0];
               var14 = var29[0];
               if (var30) {
                  continue;
               }

               var15 = var13;
               var16 = var14;
            }

            var2.addItem(new g1p(var6, var13, var15, var14, var16));
         }
      }

      return var2;
   }

   final List<g1p> n5(long var1, String[] var3) {
      String var4 = null;
      String var5 = null;
      new List();
      boolean var7 = this.h0(var3[0]);
      List var6 = this.u3(var3[0]);
      String[] var8 = new String[]{var4};
      String[] var9 = new String[]{var5};
      n5(var3[0], var8, var9);
      var4 = var8[0];
      var5 = var9[0];
      int var10 = 0;
      List$Enumerator var11 = var6.iterator();

      try {
         while (var11.hasNext()) {
            g1p var12 = (g1p)var11.next();
            var10 += com.aspose.slides.ms.System.q1.n5(var12.u3(), var12.h0());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }

      if (var7 || var6.size() == 0 || var10 < (var1 & 4294967295L)) {
         var4 = "Repared";
         String var19 = com.aspose.slides.ms.System.d1.n5(new Object[]{"$", this.z1, "$1:$", this.z1, "$", com.aspose.slides.ms.System.l4.l6(var1)});
         var3[0] = com.aspose.slides.ms.System.d1.n5(new String[]{var4, "!", var19});
         var6 = this.u3(var3[0]);
         if (com.aspose.slides.ms.System.d1.n5(var5)) {
            this.l6(var5, var3[0]);
         }

         this.z1++;
      }

      return var6;
   }

   private boolean h0(String var1) {
      String[] var2 = com.aspose.slides.ms.System.d1.n5(var1, new char[]{',', ';'}, (short)1);
      List var3 = new List();

      for (int var4 = 0; var4 < var2.length; var4++) {
         if (com.aspose.slides.ms.System.d1.c8(var2[var4], ":") >= 0 && var3.containsItem(var2[var4])) {
            return true;
         }

         var3.addItem(var2[var4]);
      }

      return false;
   }

   final List<g1p> n5(com.aspose.slides.internal.k4y.c9q var1) {
      new List();
      long var3 = var1.k5().k5().n5();
      String var5 = var1.l6();
      String[] var6 = new String[]{var5};
      List var2 = this.n5(var3, var6);
      var5 = var6[0];
      if (var2.size() > 0) {
         var1.n5(var5);
      }

      return var2;
   }

   final List<g1p> n5(com.aspose.slides.internal.k4y.z3o var1) {
      new List();
      long var3 = var1.k5().u3().n5();
      String var5 = var1.l6();
      String[] var6 = new String[]{var5};
      List var2 = this.n5(var3, var6);
      var5 = var6[0];
      if (var2.size() > 0) {
         var1.n5(var5);
      }

      return var2;
   }

   final boolean a6(String var1) {
      String[] var2 = com.aspose.slides.ms.System.d1.n5(var1, new char[]{',', ';'}, (short)1);

      for (String var6 : var2) {
         String var7 = null;
         String var8 = null;
         String[] var9 = new String[]{var7};
         String[] var10 = new String[]{var8};
         boolean var11 = n5(var6, var9, var10);
         var7 = var9[0];
         var8 = var10[0];
         if (var11) {
            String var12 = this.u9(var8);
            if (!com.aspose.slides.ms.System.d1.n5(var12)) {
               return this.a6(var12);
            }

            ChartDataWorksheet var13 = this.s7.l6(var7);
            if (var13 == null) {
               return false;
            }
         }
      }

      return true;
   }

   final String u9(String var1) {
      List$Enumerator var2 = this.y4.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (com.aspose.slides.ms.System.d1.a6((String)var3.getKey(), var1)) {
               return (String)var3.getValue();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   private IChartDataWorksheet l6(int var1) {
      if (var1 > this.getWorksheets().size() - 1) {
         int var2 = var1 - (this.getWorksheets().size() - 1);

         for (int var3 = 0; var3 < var2; var3++) {
            this.s7.n5();
         }

         this.l6(true);
      }

      return this.getWorksheets().get_Item(var1);
   }

   final void x8() {
      if (this.y4() == null || this.y4().u3().l6().k5() == null) {
         ChartDataWorksheet var1 = null;
         var1 = this.n5(this.y4());
         if (var1 != null && var1.n5().n5() != 0) {
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[]{0};
            int[] var7 = new int[]{0};
            int[] var8 = new int[]{0};
            int[] var9 = new int[]{0};
            this.n5(var6, var7, var8, var9);
            var2 = var6[0];
            var3 = var7[0];
            var4 = var8[0];
            var5 = var9[0];
            if (var4 - var2 > 0 && var5 - var3 > 0 && var1.a6().s7() == null) {
               boolean var10 = false;
               IGenericEnumerator var11 = var1.n5().iterator();

               try {
                  while (var11.hasNext()) {
                     l4a var12 = (l4a)var11.next();
                     if (var12.l6() <= var4 || var12.k5() >= var2 || var12.u3() <= var5 || var12.a6() >= var5) {
                        var10 = true;
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                     var11.dispose();
                  }
               }

               if (!var10 && this.t9()) {
                  l4a var21 = var1.n5().l6();
                  var21.n5(var2);
                  var21.l6(var4);
                  var21.k5(var3);
                  var21.u3(var5);
                  this.l6(true);
               }
            }
         }
      }
   }

   final ChartDataWorksheet n5(ChartData var1) {
      if (this.y4().getSeries().size() > 0) {
         ChartDataPointCollection var2 = (ChartDataPointCollection)this.y4().getSeries().get_Item(0).getDataPoints();
         if (var2.size() > 0) {
            if (var2.getDataSourceTypeForValues() == 0 && var2.get_Item(0).getValue().getAsCell() != null) {
               return (ChartDataWorksheet)var2.get_Item(0).getValue().getAsCell().getChartDataWorksheet();
            }

            if (var2.getDataSourceTypeForXValues() == 0 && var2.get_Item(0).getXValue().getAsCell() != null) {
               return (ChartDataWorksheet)var2.get_Item(0).getXValue().getAsCell().getChartDataWorksheet();
            }

            if (var2.getDataSourceTypeForYValues() == 0 && var2.get_Item(0).getYValue().getAsCell() != null) {
               return (ChartDataWorksheet)var2.get_Item(0).getYValue().getAsCell().getChartDataWorksheet();
            }

            if (var2.getDataSourceTypeForBubbleSizes() == 0 && var2.get_Item(0).getBubbleSize().getAsCell() != null) {
               return (ChartDataWorksheet)var2.get_Item(0).getBubbleSize().getAsCell().getChartDataWorksheet();
            }

            if (ChartTypeCharacterizer.n3(var1.getSeries().get_Item(0).getType())) {
               return (ChartDataWorksheet)var2.get_Item(0).getSizeValue().getAsCell().getChartDataWorksheet();
            }

            if (var1.getSeries().get_Item(0).getType() == 81) {
               return (ChartDataWorksheet)var2.get_Item(0).getColorValue().getAsCell().getChartDataWorksheet();
            }
         }
      }

      return null;
   }

   final void n5(int[] var1, int[] var2, int[] var3, int[] var4) {
      var1[0] = var2[0] = Integer.MAX_VALUE;
      var3[0] = var4[0] = Integer.MIN_VALUE;
      boolean var5 = true;
      IGenericEnumerator var6 = this.y4().getSeries().iterator();

      try {
         while (var6.hasNext()) {
            ChartSeries var7 = (ChartSeries)var6.next();
            if (var7.getName().getDataSourceType() == 0 && var7.getName().getAsCells().getCount() == 0) {
               var5 = false;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (var5) {
         this.l6(var1, var2, var3, var4);
         this.k5(var1, var2, var3, var4);
      }

      if (var1[0] == Integer.MAX_VALUE) {
         var1[0] = 0;
      }

      if (var2[0] == Integer.MAX_VALUE) {
         var2[0] = 0;
      }

      if (var3[0] == Integer.MIN_VALUE) {
         var3[0] = 0;
      }

      if (var4[0] == Integer.MIN_VALUE) {
         var4[0] = 0;
      }
   }

   private void l6(int[] var1, int[] var2, int[] var3, int[] var4) {
      ChartData var5 = this.y4();
      if (var5.getCategories().getUseCells()) {
         IGenericEnumerator var6 = var5.getCategories().iterator();

         try {
            while (var6.hasNext()) {
               ChartCategory var7 = (ChartCategory)var6.next();

               for (int var8 = 0; var8 < var5.getCategories().getGroupingLevelCount(); var8++) {
                  n5(var7.getGroupingLevels().get_Item(var8), var1, var2, var3, var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      if (var5.getUseSecondaryCategories() && var5.getSecondaryCategories().getUseCells()) {
         IGenericEnumerator var17 = var5.getSecondaryCategories().iterator();

         try {
            while (var17.hasNext()) {
               ChartCategory var18 = (ChartCategory)var17.next();

               for (int var19 = 0; var19 < var5.getSecondaryCategories().getGroupingLevelCount(); var19++) {
                  n5(var18.getGroupingLevels().get_Item(var19), var1, var2, var3, var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
               var17.dispose();
            }
         }
      }
   }

   private boolean t9() {
      Dictionary var1 = new Dictionary();
      IGenericEnumerator var2 = this.y4().getSeries().iterator();

      try {
         while (var2.hasNext()) {
            ChartSeries var3 = (ChartSeries)var2.next();
            if (var3.getName().getDataSourceType() == 0) {
               String var4 = var3.getName().toString();
               String var5 = var3.getName().getCellsAddressInWorkbook();
               if (!com.aspose.slides.ms.System.d1.n5(var4) && var1.containsKey(var4) && !com.aspose.slides.ms.System.d1.a6((String)var1.get_Item(var4), var5)) {
                  return false;
               }

               if (!var1.containsKey(var4)) {
                  var1.addItem(var4, var5);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return true;
   }

   private void k5(int[] var1, int[] var2, int[] var3, int[] var4) {
      new Dictionary();
      IGenericEnumerator var6 = this.y4().getSeries().iterator();

      try {
         while (var6.hasNext()) {
            ChartSeries var7 = (ChartSeries)var6.next();
            if (var7.getName().getDataSourceType() == 0) {
               IGenericEnumerator var8 = var7.getName().getAsCells().iterator();

               try {
                  while (var8.hasNext()) {
                     ChartDataCell var9 = (ChartDataCell)var8.next();
                     n5(var9, var1, var2, var3, var4);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }
            }

            IGenericEnumerator var25 = var7.getDataPoints().iterator();

            try {
               while (var25.hasNext()) {
                  IChartDataPoint var26 = (IChartDataPoint)var25.next();
                  if (var7.getDataPoints().getDataSourceTypeForValues() == 0) {
                     n5(var26.getValue().getAsCell(), var1, var2, var3, var4);
                  }

                  if (var7.getDataPoints().getDataSourceTypeForXValues() == 0) {
                     n5(var26.getXValue().getAsCell(), var1, var2, var3, var4);
                  }

                  if (var7.getDataPoints().getDataSourceTypeForYValues() == 0) {
                     n5(var26.getYValue().getAsCell(), var1, var2, var3, var4);
                  }

                  if (var7.getDataPoints().getDataSourceTypeForBubbleSizes() == 0) {
                     n5(var26.getBubbleSize().getAsCell(), var1, var2, var3, var4);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
                  var25.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   private static void n5(IChartDataCell var0, int[] var1, int[] var2, int[] var3, int[] var4) {
      if (var0 != null) {
         if (var0.getColumn() < var1[0]) {
            var1[0] = var0.getColumn();
         }

         if (var0.getRow() < var2[0]) {
            var2[0] = var0.getRow();
         }

         if (var0.getColumn() > var3[0]) {
            var3[0] = var0.getColumn();
         }

         if (var0.getRow() > var4[0]) {
            var4[0] = var0.getRow();
         }
      }
   }

   static boolean n5(String var0, int[] var1, int[] var2) {
      var0 = com.aspose.slides.ms.System.d1.l6(var0);
      int var3 = var0.length() - 1;

      while (var3 >= 0 && com.aspose.slides.ms.System.t9.u3(var0.charAt(var3))) {
         var3--;
      }

      String var4 = com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.l6(var0, 0, ++var3),new char[]{ '$', ' '}));
      String var5 = com.aspose.slides.ms.System.d1.l6(var0, var3, var0.length() - var3);
      byte var6 = 65;
      byte var7 = 90;
      byte var8 = 26;
      var1[0] = 0;

      for (int var9 = 0; var9 < var4.length(); var9++) {
         int var10 = var4.charAt(var9) - 'A';
         var1[0] += com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(26.0, var4.length() - var9 - 1.0) * (var10 + 1), 14);
      }

      var1[0]--;
      int var17 = 0;
      byte var18 = 48;
      byte var11 = 57;
      if (var5.length() > 0) {
         boolean var12 = var5.charAt(0) == '-';

         for (int var13 = var12 ? 1 : 0; var13 < var5.length(); var13++) {
            char var14 = var5.charAt(var13);
            if (var14 < '0' || var14 > '9') {
               var17 = 0;
               break;
            }

            var17 = 10 * var17 + (var14 - '0');
         }

         if (var12) {
            var17 *= -1;
         }
      }

      var2[0] = var17 - 1;
      return !"".equals(var4) && !"".equals(var5);
   }

   private static boolean n5(String var0, String[] var1, String[] var2) {
      var0 = com.aspose.slides.ms.System.d1.n5(
         com.aspose.slides.ms.System.d1.n5(var0, ")", com.aspose.slides.ms.System.d1.n5), "(", com.aspose.slides.ms.System.d1.n5
      );
      int var3 = com.aspose.slides.ms.System.d1.u3(var0, '[');
      int var4 = com.aspose.slides.ms.System.d1.u3(var0, ']');
      if (var3 > -1 && var4 > var3) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, var3, var4 - var3 + 1);
      }

      int var5 = var0.length() - 1;
      if (var0.length() > 2 && var0.charAt(0) == '\'') {
         var5 = com.aspose.slides.ms.System.d1.k5(var0, '\'') + 1;
         if (var5 == 1) {
            var1[0] = var2[0] = com.aspose.slides.ms.System.d1.n5;
            return false;
         }
      } else {
         var5 = com.aspose.slides.ms.System.d1.u3(var0, '!');
      }

      if (var5 > 0) {
         var1[0] = com.aspose.slides.ms.System.d1.l6(var0, 0, var5);
         if (var1[0].length() > 2 && var1[0].charAt(0) == '\'' && var1[0].charAt(var1[0].length() - 1) == '\'') {
            var1[0] = com.aspose.slides.ms.System.d1.l6(var1[0], 1, var1[0].length() - 2);
         }

         var2[0] = com.aspose.slides.ms.System.d1.l6(var0, ++var5, var0.length() - var5);
         return true;
      } else {
         var1[0] = var2[0] = com.aspose.slides.ms.System.d1.n5;
         return false;
      }
   }

   final Chart n3() {
      if (this.t2 == null) {
         Chart[] var1 = new Chart[]{this.t2};
         d0u.n5(Chart.class, this.u9, var1);
         this.t2 = var1[0];
      }

      return this.t2;
   }

   final ChartData y4() {
      return this.u9;
   }
}
