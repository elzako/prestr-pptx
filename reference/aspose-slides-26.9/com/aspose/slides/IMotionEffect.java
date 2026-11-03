package com.aspose.slides;

import java.awt.geom.Point2D.Float;

public interface IMotionEffect extends IBehavior {
   Float getFrom();

   void setFrom(Float var1);

   Float getTo();

   void setTo(Float var1);

   Float getBy();

   void setBy(Float var1);

   Float getRotationCenter();

   void setRotationCenter(Float var1);

   int getOrigin();

   void setOrigin(int var1);

   IMotionPath getPath();

   void setPath(IMotionPath var1);

   int getPathEditMode();

   void setPathEditMode(int var1);

   float getAngle();

   void setAngle(float var1);
}
