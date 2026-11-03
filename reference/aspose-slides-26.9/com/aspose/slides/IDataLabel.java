package com.aspose.slides;

public interface IDataLabel extends IActualLayout, ILayoutable, IOverridableText {
   boolean isVisible();

   void hide();

   IDataLabelFormat getDataLabelFormat();

   IChartDataCell getValueFromCell();

   void setValueFromCell(IChartDataCell var1);

   String getActualLabelText();
}
