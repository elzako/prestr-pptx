package com.aspose.slides;

public class SummaryZoomFrame extends GraphicalObject implements ISummaryZoomFrame {
   private int n5;
   private ISummaryZoomSectionCollection l6 = new SummaryZoomSectionCollection(this);
   private PictureFillFormat k5;

   final PictureFillFormat n5() {
      return this.k5;
   }

   private void n5(PictureFillFormat var1) {
      this.k5 = var1;
   }

   @Override
   public final int getLayout() {
      return this.n5;
   }

   final void n5(int var1) {
      this.n5 = var1;
   }

   @Override
   public final ISummaryZoomSectionCollection getSummaryZoomCollection() {
      return this.l6;
   }

   SummaryZoomFrame(ShapeCollection parentImmediate) {
      super(parentImmediate);
      this.n5(new PictureFillFormat(this));
      this.n5().setPictureFillMode(1);
      this.t2 = new LineFormat(this);
      this.n5(new f5e(this));
   }
}
