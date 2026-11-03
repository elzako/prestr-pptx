package com.aspose.slides;

public interface IChartCategoryCollection extends IGenericCollection<IChartCategory> {
   IChartCategory get_Item(int var1);

   boolean getUseCells();

   void setUseCells(boolean var1);

   int getGroupingLevelCount();

   IChartCategory add(IChartDataCell var1);

   IChartCategory add(Object var1);

   int indexOf(IChartCategory var1);

   void remove(IChartCategory var1);

   void removeAt(int var1);

   void clear();
}
