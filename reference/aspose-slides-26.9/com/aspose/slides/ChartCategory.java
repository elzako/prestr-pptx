package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

public class ChartCategory implements IChartCategory, r0g {
   private Object n5;
   private String l6;
   private ChartCategoryLevelsManager k5;
   private g4 u3;
   private Object a6;
   private ChartCategoryCollection u9;

   @Override
   public final boolean getUseCell() {
      return this.u9.getUseCells();
   }

   @Override
   public final IChartDataCell getAsCell() {
      if (!this.getUseCell()) {
         throw new InvalidOperationException("See ChartCategory.UseCell property summary.");
      } else {
         return this.getGroupingLevels().get_Item(0);
      }
   }

   @Override
   public final void setAsCell(IChartDataCell value) {
      if (!this.getUseCell()) {
         throw new InvalidOperationException("See ChartCategory.UseCell property summary.");
      }

      ChartData var2 = w8d.n5(ChartData.class, this.u9);
      var2.l6().n5((ChartDataCell)value);
      this.getGroupingLevels().setGroupingItem(0, value);
   }

   @Override
   public final Object getAsLiteral() {
      if (this.getUseCell()) {
         throw new InvalidOperationException("See ChartCategory.UseCell property summary.");
      } else {
         return this.a6;
      }
   }

   @Override
   public final void setAsLiteral(Object value) {
      if (this.getUseCell()) {
         throw new InvalidOperationException("See ChartCategory.UseCell property summary.");
      }

      this.a6 = value;
   }

   @Override
   public final Object getValue() {
      return this.getUseCell() ? this.getAsCell().getValue() : this.getAsLiteral();
   }

   @Override
   public final void setValue(Object value) {
      if (this.getUseCell()) {
         this.getAsCell().setValue(value);
      } else {
         this.setAsLiteral(value);
      }
   }

   @Override
   public final IChartCategoryLevelsManager getGroupingLevels() {
      if (!this.getUseCell()) {
         return null;
      }

      if (this.u9.getUseCells()) {
         ChartData var1 = w8d.n5(ChartData.class, this.u9);
         var1.l6().n5();
      }

      if (this.k5 == null) {
         this.k5 = new ChartCategoryLevelsManager(this);
      }

      return this.k5;
   }

   final Object n5() {
      return this.n5;
   }

   final void n5(Object var1) {
      this.n5 = var1;
   }

   final String l6() {
      return this.l6;
   }

   final void n5(String var1) {
      this.l6 = var1;
   }

   final g4 k5() {
      return this.u3;
   }

   final Object u3() {
      ChartData var1 = w8d.n5(ChartData.class, this.u9);
      boolean var2 = var1.l6().k5() != 2;
      if (!var2 || !this.u9.getUseCells()) {
         return this.getValue();
      } else {
         return this.k5().n5() > 0 ? this.k5().n5(0) : this.n5();
      }
   }

   final Object n5(int var1) {
      ChartData var2 = w8d.n5(ChartData.class, this.u9);
      boolean var3 = var2.l6().k5() != 2;
      if (var3) {
         return this.k5().n5(var1);
      } else {
         return this.getGroupingLevels() != null && this.getGroupingLevels().get_Item(var1) == null ? null : this.getGroupingLevels().get_Item(var1).getValue();
      }
   }

   @Override
   public final void remove() {
      if (this.u9 == null) {
         throw new PptxEditException("Category is already removed from chart.");
      }

      synchronized (this.u9.getSyncRoot()) {
         IChartDataWorkbook var2 = w8d.n5(ChartData.class, this.u9).getChartDataWorkbook();
         this.u9.n5(this);
         this.u9 = null;
      }
   }

   ChartCategory(ChartCategoryCollection parentImmediate) {
      this.u9 = parentImmediate;
      this.u3 = new g4();
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u9;
   }
}
