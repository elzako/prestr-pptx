package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;

public class ChartCategoryLevelsManager implements IChartCategoryLevelsManager {
   private List<k4s> n5;
   private r0g l6;

   @Override
   public final IChartDataCell get_Item(int level) {
      if (level < 0) {
         throw new ArgumentOutOfRangeException("level must be >= 0");
      } else if (level >= this.n5.size()) {
         return null;
      } else {
         return this.n5.get_Item(level) != null ? this.n5.get_Item(level).n5() : null;
      }
   }

   @Override
   public final void setGroupingItem(int level, Object value) {
      ChartDataCell var3 = this.n5.get_Item(0) != null ? (ChartDataCell)this.n5.get_Item(0).n5() : null;
      if (level < 0) {
         throw new ArgumentOutOfRangeException("level must be >= 0");
      }

      if (level == 0 && !com.aspose.slides.internal.v6g.k5.l6(value, ChartDataCell.class) && var3 == null) {
         throw new ArgumentException("Undefined workbook cell for category of level 0.");
      }

      if (var3 != null && var3.getColumn() - level < 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(
               "Cell for category of level 0 has Name \"",
               var3.a6(),
               "\". ",
               "It's zero-based column number is ",
               com.aspose.slides.ms.System.a3.l6(var3.getColumn()),
               ". ",
               "So max level for this category is ",
               com.aspose.slides.ms.System.a3.l6(var3.getColumn()),
               "."
            )
         );
      }

      for (int var4 = this.n5.size(); var4 <= level; var4++) {
         this.n5.addItem(null);
      }

      IChartDataCell var6 = com.aspose.slides.internal.v6g.k5.n5(value, IChartDataCell.class);
      if (var6 != null) {
         this.n5.set_Item(level, new k4s(var6, this.l6));
      } else {
         if (var3 == null) {
            throw new NullReferenceException("ChartDataCell couldn't be empty.");
         }

         ChartDataWorkbook var5 = ((ChartDataWorksheet)var3.getChartDataWorksheet()).u3();
         this.n5.set_Item(level, new k4s(var5.getCell(var3.getChartDataWorksheet().getIndex(), var3.getRow(), var3.getColumn() - level, value), this.l6));
      }
   }

   @Override
   public final void deleteGroupingItem(int level) {
      if (level > 0 && level < this.n5.size()) {
         this.n5.set_Item(level, null);

         for (int var2 = this.n5.size() - 1; var2 > 0 && this.n5.get_Item(var2) == null; var2--) {
            this.n5.removeAt(var2);
         }
      }
   }

   final int n5() {
      return this.n5.size() - 1;
   }

   ChartCategoryLevelsManager(r0g parent) {
      this.l6 = parent;
      this.n5 = new List<>();
      this.n5.addItem(null);
   }
}
