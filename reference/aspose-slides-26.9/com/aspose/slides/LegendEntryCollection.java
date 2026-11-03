package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class LegendEntryCollection implements ILegendEntryCollection {
   private Chart n5;

   LegendEntryCollection(Chart parent) {
      this.n5 = parent;
   }

   @Override
   public final ILegendEntryProperties get_Item(int index) {
      if ((this.n5.getChartData().getSeries().size() <= 0 || !c5w.n5(this.n5.getChartData().getSeries()))
         && (
            this.n5.getChartData().getSeries().size() != 1
               || !ChartTypeCharacterizer.isChartTypePie(this.n5.getChartData().getSeries().get_Item(0).getType())
                  && !ChartTypeCharacterizer.isChartTypeDoughnut(this.n5.getChartData().getSeries().get_Item(0).getType())
         )) {
         List var2 = new List();
         List var3 = new List();
         IGenericEnumerator var4 = this.n5.getChartData().getSeries().iterator();

         try {
            while (var4.hasNext()) {
               ChartSeries var5 = (ChartSeries)var4.next();
               if (!var5.l6()) {
                  var2.addItem(var5.getRelatedLegendEntry());
                  if (var5.getTrendLines() != null) {
                     IGenericEnumerator var6 = var5.getTrendLines().iterator();

                     try {
                        while (var6.hasNext()) {
                           Trendline var7 = (Trendline)var6.next();
                           var3.addItem(var7.getRelatedLegendEntry());
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                           var6.dispose();
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         var2.addRange(var3);
         return (ILegendEntryProperties)var2.get_Item(index);
      } else {
         return ((ChartDataPoint)this.n5.getChartData().getSeries().get_Item(0).getDataPoints().get_Item(index)).getRelatedLegendEntry();
      }
   }

   @Override
   public final int getCount() {
      if (!z7d.n5(this.n5)
         && (
            this.n5.getChartData().getSeries().size() != 1
               || !ChartTypeCharacterizer.isChartTypePie(this.n5.getChartData().getSeries().get_Item(0).getType())
                  && !ChartTypeCharacterizer.isChartTypeDoughnut(this.n5.getChartData().getSeries().get_Item(0).getType())
         )) {
         int var1 = this.n5.getChartData().getSeries().size();
         IGenericEnumerator var2 = this.n5.getChartData().getSeries().iterator();

         try {
            while (var2.hasNext()) {
               ChartSeries var3 = (ChartSeries)var2.next();
               if (var3.getTrendLines() != null) {
                  var1 += var3.getTrendLines().getCount();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return var1;
      } else {
         return this.n5.getChartData().getSeries().get_Item(0).getDataPoints().size();
      }
   }
}
