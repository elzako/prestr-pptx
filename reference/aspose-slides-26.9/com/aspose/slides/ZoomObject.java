package com.aspose.slides;

public class ZoomObject extends GraphicalObject implements IZoomObject {
   private ISlide n5;
   private boolean l6;
   private int k5;
   private com.aspose.slides.ms.System.o0 u3 = new com.aspose.slides.ms.System.o0();
   private long a6;
   private long u9;
   private boolean h0;
   private float e2;
   private PictureFillFormat t9;

   final com.aspose.slides.ms.System.o0 e2() {
      return this.u3.k5();
   }

   final void l6(com.aspose.slides.ms.System.o0 var1) {
      this.u3 = var1.k5();
   }

   final long z1() {
      return this.a6;
   }

   final void n5(long var1) {
      this.a6 = var1;
   }

   final long m3() {
      return this.u9;
   }

   final void l6(long var1) {
      this.u9 = var1;
   }

   @Override
   public final int getImageType() {
      return this.k5;
   }

   @Override
   public final void setImageType(int value) {
      if (this.k5 != value) {
         this.n5(this.n5);
      }

      this.k5 = value;
   }

   @Override
   public final boolean getReturnToParent() {
      return this.h0;
   }

   @Override
   public final void setReturnToParent(boolean value) {
      this.h0 = value;
   }

   ISlide getTargetSlide() {
      return this.n5;
   }

   void setTargetSlide(ISlide value) {
      boolean var2 = this.n5 != value;
      this.n5 = value;
      this.l6(this.n5.getSlideId());
      this.n5(((Slide)this.n5).n5());
      if (var2) {
         this.n5(this.n5);
      }
   }

   @Override
   public final boolean getShowBackground() {
      return this.l6;
   }

   @Override
   public final void setShowBackground(boolean value) {
      boolean var2 = this.l6 != value && this.getImageType() == 1;
      this.l6 = value;
      if (var2) {
         this.n5(this.n5);
      }
   }

   @Override
   public final IPPImage getZoomImage() {
      return this.z8().getPicture().getImage();
   }

   @Override
   public final void setZoomImage(IPPImage value) {
      if (this.z8().getPicture().getImage() != null) {
         this.z8().getPicture().getImage().replaceImage(value);
      } else {
         this.z8().getPicture().setImage(value);
      }

      this.n5(2);
   }

   @Override
   public final float getTransitionDuration() {
      return this.e2;
   }

   @Override
   public final void setTransitionDuration(float value) {
      this.e2 = value;
   }

   final PictureFillFormat z8() {
      return this.t9;
   }

   private void n5(PictureFillFormat var1) {
      this.t9 = var1;
   }

   ZoomObject(r0g parentImmediate) {
      super(parentImmediate);
      this.l6(com.aspose.slides.ms.System.o0.l6().k5());
      this.l6 = true;
      this.k5 = 1;
      this.setReturnToParent(false);
      this.setTransitionDuration(1.0F);
      this.n5(new PictureFillFormat(this));
      this.z8().setPictureFillMode(1);
      this.t2 = new LineFormat(this);
      this.n5(new x4z(this));
   }

   final void n5(ISlide var1) {
      if (this.getImageType() != 2) {
         IPPImage var2 = ((Slide)var1).t4().n5(this.l6);
         if (this.z8().getPicture().getImage() != null && this.z8().getPicture().getImage() != var2) {
            this.z8().getPicture().getImage().replaceImage(var2);
         } else {
            this.z8().getPicture().setImage(var2);
         }
      }
   }

   final ISlide j5() {
      return this.n5;
   }

   final void l6(ISlide var1) {
      this.n5 = var1;
   }

   final boolean z6() {
      return this.l6;
   }

   final void n5(boolean var1) {
      this.l6 = var1;
   }

   final int e9() {
      return this.k5;
   }

   final void n5(int var1) {
      this.k5 = var1;
   }
}
