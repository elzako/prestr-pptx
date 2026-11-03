package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotSupportedException;

public class SwfOptions extends SaveOptions implements ISwfOptions {
   private final com.aspose.slides.internal.p5k.t9 n5;
   private boolean l6;
   private ISlidesLayoutOptions k5 = new NotesCommentsLayoutingOptions();

   @Override
   public final boolean getShowHiddenSlides() {
      return this.l6;
   }

   @Override
   public final void setShowHiddenSlides(boolean value) {
      this.l6 = value;
   }

   @Override
   public final boolean getCompressed() {
      return this.n5.n5();
   }

   @Override
   public final void setCompressed(boolean value) {
      this.n5.n5(value);
   }

   @Override
   public final boolean getViewerIncluded() {
      return this.n5.l6();
   }

   @Override
   public final void setViewerIncluded(boolean value) {
      this.n5.l6(value);
   }

   @Override
   public final boolean getShowPageBorder() {
      return this.n5.u9();
   }

   @Override
   public final void setShowPageBorder(boolean value) {
      this.n5.k5(value);
   }

   @Override
   public final boolean getShowFullScreen() {
      return this.n5.h0();
   }

   @Override
   public final void setShowFullScreen(boolean value) {
      this.n5.u3(value);
   }

   @Override
   public final boolean getShowPageStepper() {
      return this.n5.c8();
   }

   @Override
   public final void setShowPageStepper(boolean value) {
      this.n5.a6(value);
   }

   @Override
   public final boolean getShowSearch() {
      return this.n5.t2();
   }

   @Override
   public final void setShowSearch(boolean value) {
      this.n5.u9(value);
   }

   @Override
   public final boolean getShowTopPane() {
      return this.n5.s7();
   }

   @Override
   public final void setShowTopPane(boolean value) {
      this.n5.h0(value);
   }

   @Override
   public final boolean getShowBottomPane() {
      return this.n5.x8();
   }

   @Override
   public final void setShowBottomPane(boolean value) {
      this.n5.c8(value);
   }

   @Override
   public final boolean getShowLeftPane() {
      return this.n5.n3();
   }

   @Override
   public final void setShowLeftPane(boolean value) {
      this.n5.t2(value);
   }

   @Override
   public final boolean getStartOpenLeftPane() {
      return this.n5.y4();
   }

   @Override
   public final void setStartOpenLeftPane(boolean value) {
      this.n5.s7(value);
   }

   @Override
   public final boolean getEnableContextMenu() {
      return this.n5.t9();
   }

   @Override
   public final void setEnableContextMenu(boolean value) {
      this.n5.x8(value);
   }

   @Override
   public final byte[] getLogoImageBytes() {
      return this.n5.q0();
   }

   @Override
   public final void setLogoImageBytes(byte[] value) {
      this.n5.n5(value);
   }

   @Override
   public final String getLogoLink() {
      return this.n5.z3();
   }

   @Override
   public final void setLogoLink(String value) {
      this.n5.n5(value);
   }

   @Override
   public final int getJpegQuality() {
      return this.n5.r4();
   }

   @Override
   public final void setJpegQuality(int value) {
      if (value >= 0 && value <= 100) {
         this.n5.l6(value);
      } else {
         throw new ArgumentException("value");
      }
   }

   public SwfOptions() {
      this.n5 = new com.aspose.slides.internal.p5k.t9();
   }

   @Override
   public final ISlidesLayoutOptions getSlidesLayoutOptions() {
      return this.k5;
   }

   @Override
   public final void setSlidesLayoutOptions(ISlidesLayoutOptions value) {
      if (com.aspose.slides.internal.v6g.k5.l6(value, HandoutLayoutingOptions.class)) {
         throw new NotSupportedException("The SwfOption.SlidesLayoutOptions property doesn't support assigning objects of type HandoutLayoutingOptions");
      }

      this.k5 = value;
   }

   final com.aspose.slides.internal.p5k.t9 n5() {
      return this.n5;
   }
}
