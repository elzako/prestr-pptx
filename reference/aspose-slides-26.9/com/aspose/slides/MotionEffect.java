package com.aspose.slides;

public class MotionEffect extends Behavior implements IMotionEffect {
   com.aspose.slides.internal.o9b.w1 a6 = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
   com.aspose.slides.internal.o9b.w1 u9 = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
   com.aspose.slides.internal.o9b.w1 h0 = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
   com.aspose.slides.internal.o9b.w1 c8 = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
   int t2;
   MotionPath s7;
   int x8;
   float n3;

   @Override
   public final java.awt.geom.Point2D.Float getFrom() {
      return com.aspose.slides.internal.o9b.w1.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.w1 l6() {
      return this.a6;
   }

   @Override
   public final void setFrom(java.awt.geom.Point2D.Float value) {
      this.n5(com.aspose.slides.internal.o9b.w1.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.a6);
   }

   @Override
   public final java.awt.geom.Point2D.Float getTo() {
      return com.aspose.slides.internal.o9b.w1.l6(this.k5());
   }

   com.aspose.slides.internal.o9b.w1 k5() {
      return this.u9;
   }

   @Override
   public final void setTo(java.awt.geom.Point2D.Float value) {
      this.l6(com.aspose.slides.internal.o9b.w1.n5(value));
   }

   void l6(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.u9);
   }

   @Override
   public final java.awt.geom.Point2D.Float getBy() {
      return com.aspose.slides.internal.o9b.w1.l6(this.u3());
   }

   com.aspose.slides.internal.o9b.w1 u3() {
      return this.h0;
   }

   @Override
   public final void setBy(java.awt.geom.Point2D.Float value) {
      this.k5(com.aspose.slides.internal.o9b.w1.n5(value));
   }

   void k5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.h0);
   }

   @Override
   public final java.awt.geom.Point2D.Float getRotationCenter() {
      return com.aspose.slides.internal.o9b.w1.l6(this.a6());
   }

   com.aspose.slides.internal.o9b.w1 a6() {
      return this.c8;
   }

   @Override
   public final void setRotationCenter(java.awt.geom.Point2D.Float value) {
      this.u3(com.aspose.slides.internal.o9b.w1.n5(value));
   }

   void u3(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.c8);
   }

   @Override
   public final int getOrigin() {
      return this.t2;
   }

   @Override
   public final void setOrigin(int value) {
      this.t2 = value;
   }

   @Override
   public final IMotionPath getPath() {
      return this.s7;
   }

   @Override
   public final void setPath(IMotionPath value) {
      this.s7 = (MotionPath)value;
   }

   @Override
   public final int getPathEditMode() {
      return this.x8;
   }

   @Override
   public final void setPathEditMode(int value) {
      this.x8 = value;
   }

   @Override
   public final float getAngle() {
      return this.n3;
   }

   @Override
   public final void setAngle(float value) {
      this.n3 = value;
   }
}
