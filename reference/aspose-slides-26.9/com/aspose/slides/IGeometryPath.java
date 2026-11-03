package com.aspose.slides;

import java.awt.geom.Point2D.Float;

public interface IGeometryPath {
   IPathSegment[] getPathData();

   void removeAt(int var1);

   void lineTo(Float var1);

   void lineTo(float var1, float var2);

   void lineTo(Float var1, long var2);

   void lineTo(float var1, float var2, long var3);

   void cubicBezierTo(Float var1, Float var2, Float var3);

   void cubicBezierTo(float var1, float var2, float var3, float var4, float var5, float var6);

   void cubicBezierTo(Float var1, Float var2, Float var3, long var4);

   void cubicBezierTo(float var1, float var2, float var3, float var4, float var5, float var6, long var7);

   void quadraticBezierTo(Float var1, Float var2);

   void quadraticBezierTo(float var1, float var2, float var3, float var4);

   void quadraticBezierTo(Float var1, Float var2, long var3);

   void quadraticBezierTo(float var1, float var2, float var3, float var4, long var5);

   void closeFigure();

   void moveTo(Float var1);

   void moveTo(float var1, float var2);

   void arcTo(float var1, float var2, float var3, float var4);

   byte getFillMode();

   void setFillMode(byte var1);

   boolean getStroke();

   void setStroke(boolean var1);
}
