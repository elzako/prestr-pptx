package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class ChartDataPointLevelsManager extends DomObject<ChartDataPoint> implements IChartDataPointLevelsManager {
   private final List<ChartDataPointLevel> n5;

   @Override
   public final IChartDataPointLevel get_Item(int level) {
      if (level < 0) {
         throw new ArgumentOutOfRangeException("level must be >= 0");
      }

      if (level >= this.n5.size()) {
         return null;
      }

      if (this.n5.get_Item(level) == null) {
         this.n5.set_Item(level, new ChartDataPointLevel(this, level));
      }

      return this.n5.get_Item(level);
   }

   @Override
   public final int getCount() {
      return this.n5.size();
   }

   ChartDataPointLevelsManager(ChartDataPoint parent) {
      super(parent);
      ChartData var2 = (ChartData)parent.u3().l6().getChart().getChartData();
      ChartCategoryCollection var3 = (ChartCategoryCollection)var2.getCategories();
      this.n5 = new List<>();
      if (var3.size() == 0) {
         this.n5.addItem(new ChartDataPointLevel(this, 0));
      } else {
         for (int var4 = 0; var4 < var3.getGroupingLevelCount(); var4++) {
            this.n5.addItem(new ChartDataPointLevel(this, var4));
         }
      }
   }
}
