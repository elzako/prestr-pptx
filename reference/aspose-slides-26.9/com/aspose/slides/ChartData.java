package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class ChartData extends DomObject<Chart> implements IChartData {
   private final y0s n5;
   private final ChartSeriesCollection l6;
   private final r7n k5;
   private final ChartCategoryCollection u3 = new ChartCategoryCollection(this);
   private final ChartCategoryCollection a6 = new ChartCategoryCollection(this);
   private boolean h0;

   @Override
   public final IChartDataWorkbook getChartDataWorkbook() {
      return this.l6().l6();
   }

   @Override
   public final IChartSeriesCollection getSeries() {
      return this.l6;
   }

   @Override
   public final IChartSeriesGroupCollection getSeriesGroups() {
      return this.k5;
   }

   @Override
   public final IChartCategoryCollection getCategories() {
      return this.u3;
   }

   @Override
   public final boolean getUseSecondaryCategories() {
      return this.h0;
   }

   @Override
   public final void setUseSecondaryCategories(boolean value) {
      this.h0 = value;
   }

   @Override
   public final IChartCategoryCollection getSecondaryCategories() {
      return !this.h0 ? null : this.a6;
   }

   @Override
   public final byte[] readWorkbookStream() {
      return this.n5().toArray();
   }

   com.aspose.slides.internal.z0k.e2 n5() {
      return com.aspose.slides.internal.n2d.t4.n5(this.l6().a6());
   }

   @Override
   public final void writeWorkbookStream(byte[] ms) {
      this.n5(new com.aspose.slides.internal.z0k.e2(ms));
   }

   void n5(com.aspose.slides.internal.z0k.e2 var1) {
      this.l6().n5((com.aspose.slides.internal.z0k.t4)var1);
      if (this.l6().k5() == 2) {
         this.k5();
      }
   }

   @Override
   public final int getDataSourceType() {
      return this.l6().h0();
   }

   @Override
   public final String getExternalWorkbookPath() {
      return this.l6().u9();
   }

   @Override
   public final int getEmbeddedWorkbookType() {
      return this.getDataSourceType() == 0 ? this.l6().u3() : -1;
   }

   @Override
   public final String getRange() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int[] var5 = new int[]{0};
      int[] var6 = new int[]{0};
      int[] var7 = new int[]{0};
      int[] var8 = new int[]{0};
      com.aspose.slides.internal.v6g.k5.n5(this.getChartDataWorkbook(), ChartDataWorkbook.class).n5(var5, var6, var7, var8);
      var1 = var5[0];
      var2 = var6[0];
      var3 = var7[0];
      var4 = var8[0];
      ChartDataWorksheet var9 = com.aspose.slides.internal.v6g.k5.n5(this.getChartDataWorkbook(), ChartDataWorkbook.class).n5(this);
      if (var9 == null) {
         throw new InvalidOperationException("Chart data doesn't have workbook reference.");
      }

      String var10 = var9.l6().l6(var2, var1).a6();
      String var11 = com.aspose.slides.ms.System.d1.t2(var10);

      for (int var12 = 0; var12 < var11.length(); var12++) {
         char var13 = var10.charAt(var12);
         if (com.aspose.slides.ms.System.t9.u3(var13)) {
            var11 = com.aspose.slides.ms.System.d1.n5(var11, var12, "$");
            break;
         }
      }

      String var20 = var9.l6().l6(var4, var3).a6();
      String var21 = com.aspose.slides.ms.System.d1.t2(var20);

      for (int var14 = 0; var14 < var21.length(); var14++) {
         char var15 = var20.charAt(var14);
         if (com.aspose.slides.ms.System.t9.u3(var15)) {
            var21 = com.aspose.slides.ms.System.d1.n5(var21, var14, "$");
            break;
         }
      }

      return com.aspose.slides.ms.System.d1.n5(var9.getName(), "!", com.aspose.slides.ms.System.d1.n5(var11, 0, "$"), ":")
         + com.aspose.slides.ms.System.d1.n5(var21, 0, "$");
   }

   @Override
   public final void setRange(String formula) {
      if (formula == null) {
         throw new ArgumentNullException("formula");
      }

      if (com.aspose.slides.ms.System.d1.a6(formula, com.aspose.slides.ms.System.d1.n5)) {
         throw new ArgumentException("Formula couldn't be empty", "formula");
      }

      int var2 = this.u9.getType() == 73 ? this.getSeries().get_Item(0).getType() : this.u9.getType();
      r5d var3 = new r5d(formula, this);
      if (ChartTypeCharacterizer.isChartTypeBubble(var2)) {
         var3.n5(new v2());
      } else if (ChartTypeCharacterizer.isChartTypeScatter(var2)) {
         var3.n5(new u8n());
      } else {
         var3.n5(new z4());
      }
   }

   @Override
   public final void setExternalWorkbook(String workbookPath) {
      this.l6().n5(workbookPath, true);
   }

   @Override
   public final void setExternalWorkbook(String workbookPath, boolean updateChartData) {
      this.l6().n5(workbookPath, updateChartData);
   }

   final y0s l6() {
      return this.n5;
   }

   ChartData(Chart parentImmediate) {
      super(parentImmediate);
      this.l6 = new ChartSeriesCollection(this);
      this.k5 = new r7n(this);
      this.n5 = new n6o(parentImmediate);
   }

   final void k5() {
      ChartDataWorkbook var1 = (ChartDataWorkbook)this.getChartDataWorkbook();
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = this.u9.getPlotVisibleCellsOnly();
      IGenericEnumerator var5 = this.l6.iterator();

      try {
         while (var5.hasNext()) {
            IChartSeries var6 = (IChartSeries)var5.next();
            if (var6.getName().getDataSourceType() == 0) {
               String var7 = var6.getName().getAsCells().getCellsAddress();
               if (com.aspose.slides.ms.System.d1.n5(var7)) {
                  return;
               }

               var6.getName().setAsCells(var1.getCellCollection(var7, false));
            }

            IGenericEnumerator var18 = var6.getDataPoints().iterator();

            try {
               while (var18.hasNext()) {
                  IChartDataPoint var8 = (IChartDataPoint)var18.next();
                  if (var6.getDataPoints().getDataSourceTypeForValues() == 0) {
                     ChartDataCell var9 = (ChartDataCell)var8.getValue().getAsCell();
                     if (var9 != null) {
                        var8.getValue().setAsCell(var1.getCell(var9.getChartDataWorksheet().getIndex(), var9.a6()));
                     }
                  }

                  if (var6.getDataPoints().getDataSourceTypeForXValues() == 0) {
                     ChartDataCell var20 = (ChartDataCell)var8.getXValue().getAsCell();
                     if (var20 != null) {
                        var8.getXValue().setAsCell(var1.getCell(var20.getChartDataWorksheet().getIndex(), var20.a6()));
                     }
                  }

                  if (var6.getDataPoints().getDataSourceTypeForYValues() == 0) {
                     ChartDataCell var21 = (ChartDataCell)var8.getYValue().getAsCell();
                     if (var21 != null) {
                        var8.getYValue().setAsCell(var1.getCell(var21.getChartDataWorksheet().getIndex(), var21.a6()));
                     }
                  }

                  if (var6.getDataPoints().getDataSourceTypeForBubbleSizes() == 0) {
                     ChartDataCell var22 = (ChartDataCell)var8.getBubbleSize().getAsCell();
                     if (var22 != null) {
                        var8.getBubbleSize().setAsCell(var1.getCell(var22.getChartDataWorksheet().getIndex(), var22.a6()));
                     }
                  }

                  if (var6.getType() == 75 || var6.getType() == 74) {
                     ChartDataCell var23 = (ChartDataCell)var8.getSizeValue().getAsCell();
                     if (var23 != null) {
                        var8.getSizeValue().setAsCell(var1.getCell(var23.getChartDataWorksheet().getIndex(), var23.a6()));
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                  var18.dispose();
               }
            }

            for (int var19 = 0; var19 < var6.getDataPoints().size(); var19++) {
               IChartDataPoint var24 = var6.getDataPoints().get_Item(var19);
               IChartDataCell var10 = var24.getValue().getAsCell();
               if (var4 && var10 != null && var10.isHidden()) {
                  var24.remove();
                  var19--;
               }
            }

            if ((!var6.getPlotOnSecondAxis() || !this.h0) && !var2 && this.u3.getUseCells()) {
               if (this.u3.getGroupingLevelCount() > 1) {
                  m6n.n5(this.u3, this.u3.a6(), var1, this.u3.getGroupingLevelCount());
               } else {
                  m6n.n5(this.u3, this.u3.a6(), var1, false);
               }

               var2 = true;
            }

            if (var6.getPlotOnSecondAxis() && this.h0 && !var3 && this.a6.getUseCells()) {
               if (this.a6.getGroupingLevelCount() > 1) {
                  m6n.n5(this.a6, this.a6.a6(), var1, this.a6.getGroupingLevelCount());
               } else {
                  m6n.n5(this.a6, this.a6.a6(), var1, false);
               }

               var3 = true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   @Override
   public final void switchRowColumn() {
      if (ChartTypeCharacterizer.n5(this.getSeries().get_Item(0).getType()) == 5) {
         this.a6();
      } else {
         this.u9();
      }
   }

   private void a6() {
      boolean var1 = this.getSeries().get_Item(0).getDataPoints().get_Item(0).getXValue().getAsCell().getRow()
         != this.getSeries().get_Item(0).getDataPoints().get_Item(0).getYValue().getAsCell().getRow();
      int var2 = Integer.MAX_VALUE;
      int var3 = 0;
      int var4 = Integer.MAX_VALUE;
      int var5 = 0;
      int var6 = this.getSeries().get_Item(0).getType();
      boolean var7 = ChartTypeCharacterizer.isChartTypeBubble(var6);
      IGenericEnumerator var8 = this.getSeries().iterator();

      try {
         while (var8.hasNext()) {
            IChartSeries var9 = (IChartSeries)var8.next();
            if (var9.getName().getAsCells() != null) {
               IGenericEnumerator var10 = var9.getName().getAsCells().iterator();

               try {
                  while (var10.hasNext()) {
                     IChartDataCell var11 = (IChartDataCell)var10.next();
                     int[] var12 = new int[]{var2};
                     int[] var13 = new int[]{var3};
                     int[] var14 = new int[]{var4};
                     int[] var15 = new int[]{var5};
                     this.n5(var11, var12, var13, var14, var15);
                     var2 = var12[0];
                     var3 = var13[0];
                     var4 = var14[0];
                     var5 = var15[0];
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                     var10.dispose();
                  }
               }
            }

            IGenericEnumerator var40 = var9.getDataPoints().iterator();

            try {
               while (var40.hasNext()) {
                  IChartDataPoint var42 = (IChartDataPoint)var40.next();
                  int[] var45 = new int[]{var2};
                  int[] var47 = new int[]{var3};
                  int[] var48 = new int[]{var4};
                  int[] var50 = new int[]{var5};
                  this.n5(var42.getXValue().getAsCell(), var45, var47, var48, var50);
                  var2 = var45[0];
                  var3 = var47[0];
                  var4 = var48[0];
                  var5 = var50[0];
                  var45[0] = var2;
                  var47[0] = var3;
                  var48[0] = var4;
                  var50[0] = var5;
                  this.n5(var42.getYValue().getAsCell(), var45, var47, var48, var50);
                  var2 = var45[0];
                  var3 = var47[0];
                  var4 = var48[0];
                  var5 = var50[0];
                  if (var7) {
                     var45[0] = var2;
                     var47[0] = var3;
                     var48[0] = var4;
                     var50[0] = var5;
                     this.n5(var42.getBubbleSize().getAsCell(), var45, var47, var48, var50);
                     var2 = var45[0];
                     var3 = var47[0];
                     var4 = var48[0];
                     var5 = var50[0];
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
                  var40.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      this.getSeries().clear();
      byte var39 = 0;
      int var41 = var7 ? 2 : 1;
      if (var1) {
         IChartSeries var43 = this.getSeries().add(this.getChartDataWorkbook().getCell(0, var2, var4 + 1), var6);
         long var19 = 0L;

         for (int var49 = var2 + 1; var49 <= var3; var49 += var41) {
            ISingleCellChartValue var51 = k3h.n5(var43.getDataPoints().getOrCreateDataPointByIdx(var19), var39);
            var51.setAsCell(this.getChartDataWorkbook().getCell(0, var49, var4));
            var43.getDataPoints().get_Item(var43.getDataPoints().size() - 1).getYValue().setAsCell(this.getChartDataWorkbook().getCell(0, var49, var4 + 1));
            var43.getDataPoints().get_Item(var43.getDataPoints().size() - 1).getBubbleSize().setAsCell(this.getChartDataWorkbook().getCell(0, var49, var4 + 2));
            var19++;
         }
      } else {
         for (int var44 = var2 + 1; var44 <= var3; var44 += var41) {
            IChartSeries var46 = this.getSeries().add(var6);
            long var21 = 0L;

            for (int var52 = var4; var52 <= var5; var52++) {
               ISingleCellChartValue var16 = k3h.n5(var46.getDataPoints().getOrCreateDataPointByIdx(var21), var39);
               var16.setAsCell(this.getChartDataWorkbook().getCell(0, var2, var52));
               var46.getDataPoints().get_Item(var46.getDataPoints().size() - 1).getYValue().setAsCell(this.getChartDataWorkbook().getCell(0, var44, var52));
               if (ChartTypeCharacterizer.isChartTypeBubble(var6) && var44 + 1 <= var3) {
                  var46.getDataPoints()
                     .get_Item(var46.getDataPoints().size() - 1)
                     .getBubbleSize()
                     .setAsCell(this.getChartDataWorkbook().getCell(0, var44 + 1, var52));
               }

               var21++;
            }
         }
      }
   }

   private void n5(IChartDataCell var1, int[] var2, int[] var3, int[] var4, int[] var5) {
      if (var1 != null) {
         if (var1.getRow() < var2[0]) {
            var2[0] = var1.getRow();
         }

         if (var1.getRow() > var3[0]) {
            var3[0] = var1.getRow();
         }

         if (var1.getColumn() < var4[0]) {
            var4[0] = var1.getColumn();
         }

         if (var1.getColumn() > var5[0]) {
            var5[0] = var1.getColumn();
         }
      }
   }

   private void u9() {
      IChartSeries[] var1 = new IChartSeries[this.getSeries().size()];
      this.getSeries().copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0);
      this.getSeries().clear();

      for (int var2 = 0; var2 < this.getCategories().size(); var2++) {
         int var3 = var2 < var1.length ? var1[var2].getType() : var1[var1.length - 1].getType();
         IChartSeries var4 = this.getSeries().add(this.getCategories().get_Item(var2).getAsCell(), var3);
         ChartCategoryLevelsManager var5 = (ChartCategoryLevelsManager)this.getCategories().get_Item(var2).getGroupingLevels();

         for (int var6 = 1; var6 <= var5.n5(); var6++) {
            var4.getName().getAsCells().add(var5.get_Item(var6));
         }

         for (int var14 = 0; var14 < var1.length; var14++) {
            byte var7 = 3;
            ISingleCellChartValue var8 = k3h.n5(var4.getDataPoints().getOrCreateDataPointByIdx(var14 & 4294967295L), var7);
            var8.setAsCell(k3h.n5(var1[var14].getDataPoints().get_Item(var2), var7).getAsCell());
         }
      }

      this.getCategories().clear();

      for (int var9 = 0; var9 < var1.length; var9++) {
         if (var1[var9].getName().getAsCells() != null && var1[var9].getName().getAsCells().getCount() > 1) {
            IChartDataCell[] var10 = new ChartDataCell[var1[var9].getName().getAsCells().getCount()];

            for (int var11 = 0; var11 < var1[var9].getName().getAsCells().getCount(); var11++) {
               var10[var11] = var1[var9].getName().getAsCells().get_Item(var11);
            }

            com.aspose.slides.ms.System.u3.u3(com.aspose.slides.ms.System.u3.n5((Object)(var10)));
            IChartCategory var12 = this.getCategories().add(var10[0]);

            for (int var13 = 1; var13 < var10.length; var13++) {
               var12.getGroupingLevels().setGroupingItem(var13, var10[var13]);
            }
         } else if (var1[var9].getName().getAsCells() != null && var1[var9].getName().getAsCells().getCount() > 0) {
            this.getCategories().add(var1[var9].getName().getAsCells().get_Item(0));
         }
      }
   }

   final Chart u3() {
      return this.u9;
   }
}
