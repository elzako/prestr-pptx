package com.aspose.slides;

public interface IChart extends IFormattedTextContainer, IGraphicalObject, IOverrideThemeable {
   boolean getPlotVisibleCellsOnly();

   void setPlotVisibleCellsOnly(boolean var1);

   int getDisplayBlanksAs();

   void setDisplayBlanksAs(int var1);

   IChartData getChartData();

   boolean hasTitle();

   void setTitle(boolean var1);

   IChartTitle getChartTitle();

   boolean hasDataTable();

   void setDataTable(boolean var1);

   boolean hasLegend();

   void setLegend(boolean var1);

   ILegend getLegend();

   IDataTable getChartDataTable();

   int getStyle();

   void setStyle(int var1);

   int getType();

   void setType(int var1);

   IChartPlotArea getPlotArea();

   IRotation3D getRotation3D();

   IChartWall getBackWall();

   IChartWall getSideWall();

   IChartWall getFloor();

   IGroupShape getUserShapes();

   IAxesManager getAxes();

   void validateChartLayout();

   boolean getShowDataLabelsOverMaximum();

   void setShowDataLabelsOverMaximum(boolean var1);

   boolean hasRoundedCorners();

   void setRoundedCorners(boolean var1);
}
