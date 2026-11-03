package com.aspose.slides;

import java.awt.geom.Point2D.Float;

public interface IMotionCmdPath {
   Float[] getPoints();

   void setPoints(Float[] var1);

   int getCommandType();

   void setCommandType(int var1);

   boolean isRelative();

   void setRelative(boolean var1);

   int getPointsType();

   void setPointsType(int var1);
}
