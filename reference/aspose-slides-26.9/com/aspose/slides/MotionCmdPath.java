package com.aspose.slides;

import java.awt.geom.Point2D.Float;

public class MotionCmdPath implements IMotionCmdPath {
   int n5;
   boolean l6;
   com.aspose.slides.internal.o9b.w1[] k5;
   int u3;

   MotionCmdPath(int type, com.aspose.slides.internal.o9b.w1[] pts, int typePts, boolean bRelCoord) {
      this.l6 = bRelCoord;
      this.n5 = type;
      this.u3 = typePts;
      this.k5 = null;
      if (pts != null) {
         this.k5 = (com.aspose.slides.internal.o9b.w1[])pts.clone();
      }
   }

   @Override
   public final Float[] getPoints() {
      return com.aspose.slides.internal.n8e.v4.n5(this.k5);
   }

   com.aspose.slides.internal.o9b.w1[] n5() {
      return this.k5;
   }

   @Override
   public final void setPoints(Float[] value) {
      this.k5 = com.aspose.slides.internal.n8e.v4.n5(value);
   }

   @Override
   public final int getCommandType() {
      return this.n5;
   }

   @Override
   public final void setCommandType(int value) {
      this.n5 = value;
   }

   @Override
   public final boolean isRelative() {
      return this.l6;
   }

   @Override
   public final void setRelative(boolean value) {
      this.l6 = value;
   }

   @Override
   public final int getPointsType() {
      return this.u3;
   }

   @Override
   public final void setPointsType(int value) {
      this.u3 = value;
   }
}
