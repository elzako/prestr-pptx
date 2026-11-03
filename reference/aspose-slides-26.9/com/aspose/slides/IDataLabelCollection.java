package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface IDataLabelCollection extends IGenericEnumerable<IDataLabel>, IChartComponent {
   IDataLabel get_Item(int var1);

   IDataLabelFormat getDefaultDataLabelFormat();

   IChartLinesFormat getLeaderLinesFormat();

   boolean isVisible();

   void hide();

   int getCountOfVisibleDataLabels();

   int getCount();

   IChartSeries getParentSeries();

   int indexOf(IDataLabel var1);
}
