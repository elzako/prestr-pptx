package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class DataLabelCollection extends DomObject<ChartSeries> implements IDataLabelCollection {
   private final DataLabelFormat n5;
   private final IChartLinesFormat l6;
   private final a9t k5 = new a9t();
   private GeometryShape u3;
   private String a6;

   DataLabelCollection(ChartSeries parentImmediate) {
      super(parentImmediate);
      this.n5 = new DataLabelFormat(this);
      this.l6 = new ChartLinesFormat(this);
   }

   final String n5() {
      return this.a6;
   }

   final void n5(String var1) {
      this.a6 = var1;
   }

   final a9t l6() {
      return this.k5;
   }

   @Override
   public final IChart getChart() {
      return this.getParentSeries().getChart();
   }

   @Override
   public final IGenericEnumerator<IDataLabel> iterator() {
      return new t5n(this.getParentSeries().getDataPoints());
   }

   public final IGenericEnumerator<IDataLabel> iteratorJava() {
      return new z6y(this.getParentSeries().getDataPoints());
   }

   @Override
   public final boolean isVisible() {
      if (!this.n5.getShowLegendKey()
         && !this.n5.getShowValue()
         && !this.n5.getShowCategoryName()
         && !this.n5.getShowSeriesName()
         && !this.n5.getShowPercentage()
         && !this.n5.getShowBubbleSize()
         && !this.n5.getShowLabelValueFromCell()) {
         IGenericEnumerator var1 = this.iterator();

         try {
            while (var1.hasNext()) {
               IDataLabel var2 = (IDataLabel)var1.next();
               if (var2.isVisible()) {
                  return true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public final void hide() {
      this.n5.setShowLegendKey(false);
      this.n5.setShowValue(false);
      this.n5.setShowCategoryName(false);
      this.n5.setShowSeriesName(false);
      this.n5.setShowPercentage(false);
      this.n5.setShowBubbleSize(false);
   }

   @Override
   public final int getCountOfVisibleDataLabels() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.getParentSeries().getDataPoints().size(); var2++) {
         if (this.getParentSeries().getDataPoints().get_Item(var2).getLabel().isVisible()) {
            var1++;
         }
      }

      return var1;
   }

   @Override
   public final int getCount() {
      return this.getParentSeries().getDataPoints().size();
   }

   @Override
   public final IDataLabelFormat getDefaultDataLabelFormat() {
      return this.n5;
   }

   @Override
   public final IChartLinesFormat getLeaderLinesFormat() {
      return this.l6;
   }

   @Override
   public final IChartSeries getParentSeries() {
      return this.u9;
   }

   @Override
   public final int indexOf(IDataLabel value) {
      for (int var2 = 0; var2 < this.getParentSeries().getDataPoints().size(); var2++) {
         if (this.get_Item(var2) == value) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public final IDataLabel get_Item(int index) {
      return this.getParentSeries().getDataPoints().get_Item(index).getLabel();
   }

   final String k5() {
      ChartCellCollection var1 = new ChartCellCollection(this);
      IGenericEnumerator var2 = this.iterator();

      try {
         while (var2.hasNext()) {
            DataLabel var3 = (DataLabel)var2.next();
            if (var3.getValueFromCell() != null) {
               var1.add(var3.getValueFromCell());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.getCellsAddress();
   }

   final GeometryShape u3() {
      if (!this.getDefaultDataLabelFormat().getShowLabelAsDataCallout()) {
         return null;
      }

      if (this.u3 == null) {
         this.u3 = new AutoShape(this);
         this.u3.setShapeType(117);
      }

      return this.u3;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.getParentSeries().getSlide();
   }

   @Override
   public final IPresentation getPresentation() {
      return this.getParentSeries().getPresentation();
   }
}
