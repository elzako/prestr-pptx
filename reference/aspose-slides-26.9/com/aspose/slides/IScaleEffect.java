package com.aspose.slides;

import java.awt.geom.Point2D.Float;

public interface IScaleEffect extends IBehavior {
   byte getZoomContent();

   void setZoomContent(byte var1);

   Float getFrom();

   void setFrom(Float var1);

   Float getTo();

   void setTo(Float var1);

   Float getBy();

   void setBy(Float var1);
}
