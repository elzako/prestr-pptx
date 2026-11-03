package com.aspose.slides;

public interface IGeometryShape extends IShape {
   IGeometryPath[] getGeometryPaths();

   void setGeometryPath(IGeometryPath var1);

   void setGeometryPaths(IGeometryPath[] var1);

   IShapeStyle getShapeStyle();

   int getShapeType();

   void setShapeType(int var1);

   IAdjustValueCollection getAdjustments();

   IShapeElement[] createShapeElements();
}
