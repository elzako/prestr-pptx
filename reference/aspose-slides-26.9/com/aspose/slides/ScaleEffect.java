package com.aspose.slides;

public class ScaleEffect extends Behavior implements IScaleEffect {
   com.aspose.slides.internal.o9b.w1 a6 = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
   com.aspose.slides.internal.o9b.w1 u9 = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
   com.aspose.slides.internal.o9b.w1 h0 = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
   byte c8 = -1;

   @Override
   public final byte getZoomContent() {
      return this.c8;
   }

   @Override
   public final void setZoomContent(byte value) {
      this.c8 = value;
   }

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
}
