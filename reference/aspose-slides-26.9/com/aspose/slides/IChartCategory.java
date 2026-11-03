package com.aspose.slides;

public interface IChartCategory {
   boolean getUseCell();

   IChartDataCell getAsCell();

   void setAsCell(IChartDataCell var1);

   Object getAsLiteral();

   void setAsLiteral(Object var1);

   Object getValue();

   void setValue(Object var1);

   IChartCategoryLevelsManager getGroupingLevels();

   void remove();
}
