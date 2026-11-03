package com.aspose.slides;

import java.awt.Dimension;

public class TiffOptions extends SaveOptions implements ITiffOptions {
   private com.aspose.slides.internal.o9b.p8 n5 = new com.aspose.slides.internal.o9b.p8();
   private long l6 = 96L;
   private long k5 = 96L;
   private int u3 = 0;
   private int a6 = 32;
   private boolean u9;
   private int h0 = 0;
   private InkOptions c8;
   private ISlidesLayoutOptions t2;

   public TiffOptions() {
      com.aspose.slides.internal.o9b.p8.n5.k5(this.n5);
      this.c8 = new InkOptions();
   }

   @Override
   public final IInkOptions getInkOptions() {
      return this.c8;
   }

   @Override
   public final boolean getShowHiddenSlides() {
      return this.u9;
   }

   @Override
   public final void setShowHiddenSlides(boolean value) {
      this.u9 = value;
   }

   @Override
   public final Dimension getImageSize() {
      return com.aspose.slides.internal.o9b.p8.l6(this.n5());
   }

   com.aspose.slides.internal.o9b.p8 n5() {
      return this.n5;
   }

   @Override
   public final void setImageSize(Dimension value) {
      this.n5(com.aspose.slides.internal.o9b.p8.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.p8 var1) {
      var1.k5(this.n5);
   }

   @Override
   public final long getDpiX() {
      return this.l6;
   }

   @Override
   public final void setDpiX(long value) {
      this.l6 = value;
   }

   @Override
   public final long getDpiY() {
      return this.k5;
   }

   @Override
   public final void setDpiY(long value) {
      this.k5 = value;
   }

   @Override
   public final int getCompressionType() {
      return this.u3;
   }

   @Override
   public final void setCompressionType(int value) {
      this.u3 = value;
   }

   @Override
   public final int getPixelFormat() {
      return this.a6;
   }

   @Override
   public final void setPixelFormat(int value) {
      this.a6 = value;
   }

   @Override
   public final ISlidesLayoutOptions getSlidesLayoutOptions() {
      return this.t2;
   }

   @Override
   public final void setSlidesLayoutOptions(ISlidesLayoutOptions value) {
      this.t2 = value;
   }

   @Override
   public final int getBwConversionMode() {
      return this.h0;
   }

   @Override
   public final void setBwConversionMode(int value) {
      this.h0 = value;
   }
}
