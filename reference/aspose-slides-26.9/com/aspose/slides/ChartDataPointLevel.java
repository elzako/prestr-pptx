package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;

public class ChartDataPointLevel extends DomObject<ChartDataPointLevelsManager> implements IChartDataPointLevel {
   private boolean n5 = true;
   private int l6;
   private int k5 = 0;
   private Format u3;
   private DataLabel a6;
   private IFormat h0;

   ChartDataPointLevel(ChartDataPointLevelsManager parent, int lvlIndex) {
      super(parent);
      this.k5 = lvlIndex;
   }

   @Override
   public final IFormat getFormat() {
      if (this.k5 == 0) {
         return this.h0().getFormat();
      }

      if (this.l6()) {
         if (this.u3 == null) {
            this.u3 = new Format(this);
         }

         return this.u3;
      } else {
         return this.n5().getFormat();
      }
   }

   @Override
   public final IDataLabel getLabel() {
      if (this.k5 == 0) {
         return this.h0().getLabel();
      }

      if (this.l6()) {
         if (this.a6 == null) {
            this.a6 = new DataLabel(this);
         }

         return this.a6;
      } else {
         return this.n5().getLabel();
      }
   }

   final IChartDataPointLevel n5() {
      int var1 = this.h0().u3().n5((IChartDataPoint)this.h0());
      ChartCategoryCollection var2 = (ChartCategoryCollection)this.h0().u3().l6().getChart().getChartData().getCategories();
      List var3 = var2.n5(this.k5);
      int var4 = 0;

      for (int var5 = 0; var5 < var3.size() && ((Integer)((KeyValuePair)var3.get_Item(var5)).getKey()).intValue() <= var1; var5++) {
         var4 = (Integer)((KeyValuePair)var3.get_Item(var5)).getKey();
      }

      return this.h0().u3().get_Item(var4).getDataPointLevels().get_Item(this.k5);
   }

   final boolean l6() {
      int var1 = this.h0().u3().n5((IChartDataPoint)this.h0());
      if (var1 == 0) {
         return true;
      }

      ChartCategoryCollection var2 = (ChartCategoryCollection)this.h0().u3().l6().getChart().getChartData().getCategories();
      if (var2.size() < var1 + 1) {
         return false;
      }

      List var3 = var2.n5(this.k5);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         if ((Integer)((KeyValuePair)var3.get_Item(var4)).getKey() == var1) {
            return true;
         }
      }

      return false;
   }

   final FillFormat k5() {
      if (this.getFormat().getFill().getFillType() == -1 && this.u9.getCount() > this.k5 + 1) {
         return com.aspose.slides.internal.v6g.k5.n5(this.u9.get_Item(this.k5 + 1), ChartDataPointLevel.class).k5();
      } else if (this.getFormat().getFill().getFillType() == -1) {
         IFormat var1 = this.a6();
         return (FillFormat)var1.getFill();
      } else {
         return (FillFormat)this.getFormat().getFill();
      }
   }

   final IEffectFormat u3() {
      if (this.getFormat().getFill().getFillType() == -1 && this.u9.getCount() > this.k5 + 1) {
         return com.aspose.slides.internal.v6g.k5.n5(this.u9.get_Item(this.k5 + 1), ChartDataPointLevel.class).u3();
      } else if (this.getFormat().getFill().getFillType() == -1) {
         IFormat var1 = this.a6();
         return var1.getEffect();
      } else {
         return this.getFormat().getEffect();
      }
   }

   final IFormat a6() {
      if (this.h0 == null) {
         int var1 = 0;
         int var2 = 0;
         Chart var3 = (Chart)this.h0().u3().l6().getChart();
         ChartData var4 = (ChartData)var3.getChartData();
         ChartCategoryCollection var5 = (ChartCategoryCollection)var4.getCategories();
         int var6 = this.h0().u3().n5((IChartDataPoint)this.h0());
         if (var5.size() == 0) {
            this.h0 = var3.t9().u9().n5(this, var6, this.h0().u3().size());
            return this.h0;
         }

         int var7 = var4.l6().k5() != 2 ? ((ChartCategory)var5.get_Item(0)).k5().n5() - 1 : var5.getGroupingLevelCount() - 1;
         List var8 = var5.n5(var7);

         for (int var9 = 0; var9 < var8.size(); var9++) {
            if (var6 >= (Integer)((KeyValuePair)var8.get_Item(var9)).getKey()) {
               var1 = var9;
            }
         }

         var2 = var8.size();
         this.h0 = var3.t9().u9().n5(this, var1, var2);
      }

      return this.h0;
   }

   final String u9() {
      int var1 = this.h0().u3().n5((IChartDataPoint)this.h0());
      ChartData var2 = (ChartData)this.h0().u3().l6().getChart().getChartData();
      ChartCategoryCollection var3 = (ChartCategoryCollection)var2.getCategories();
      List var4 = var3.n5(this.k5);
      int var5 = 0;
      int var6 = 0;

      while (var6 < var4.size() && var1 >= ((Integer)((KeyValuePair)var4.get_Item(var6)).getKey()).intValue()) {
         var5 = var6++;
      }

      return (String)((KeyValuePair)var4.get_Item(var5)).getValue();
   }

   final ChartDataPoint h0() {
      return (ChartDataPoint)com.aspose.slides.internal.v6g.k5.n5(this.u9, r0g.class).getParent_Immediate();
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }

   final int c8() {
      return this.l6;
   }

   final void n5(int var1) {
      this.l6 = var1;
   }
}
