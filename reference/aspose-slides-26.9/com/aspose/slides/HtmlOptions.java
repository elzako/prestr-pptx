package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class HtmlOptions extends SaveOptions implements IHtmlOptions {
   private boolean n5;
   private int l6 = 85;
   private boolean k5;
   private HtmlFormatter u3 = null;
   private SlideImageFormat a6 = null;
   private final ILinkEmbedController u9;
   private static HtmlFormatter h0;
   private final r3d c8 = r3d.u3();
   private boolean t2;
   private ISlidesLayoutOptions s7;
   private InkOptions x8 = new InkOptions();
   private static final SlideImageFormat n3 = SlideImageFormat.svg(new SVGOptions());

   public HtmlOptions(ILinkEmbedController linkEmbedController) {
      ILinkEmbedController var2 = linkEmbedController;
      if (var2 == null) {
         var2 = com.aspose.slides.internal.k0r.f0.n5;
      }

      this.u9 = var2;
      this.k5 = true;
   }

   @Override
   public final ISlidesLayoutOptions getSlidesLayoutOptions() {
      return this.s7;
   }

   @Override
   public final void setSlidesLayoutOptions(ISlidesLayoutOptions value) {
      this.s7 = value;
   }

   @Override
   public final IInkOptions getInkOptions() {
      return this.x8;
   }

   public HtmlOptions() {
      this.u9 = com.aspose.slides.internal.k0r.f0.n5;
   }

   @Override
   public final boolean getShowHiddenSlides() {
      return this.k5;
   }

   @Override
   public final void setShowHiddenSlides(boolean value) {
      this.k5 = value;
   }

   @Override
   public final IHtmlFormatter getHtmlFormatter() {
      return this.u3;
   }

   @Override
   public final void setHtmlFormatter(IHtmlFormatter value) {
      this.u3 = (HtmlFormatter)value;
   }

   @Override
   public final boolean getDisableFontLigatures() {
      return this.n5;
   }

   @Override
   public final void setDisableFontLigatures(boolean value) {
      this.n5 = value;
   }

   final HtmlFormatter n5(int var1) {
      if (this.u3 != null) {
         return this.u3;
      }

      if (h0 == null) {
         if (this.getSvgResponsiveLayout()) {
            h0 = HtmlFormatter.createDocumentFormatter(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "svg { position: absolute; top: 0; left: 0; } .slide { position: relative; overflow: hidden; padding-top: ",
                  com.aspose.slides.ms.System.a3.l6(var1),
                  "%; }"
               }),
               true
            );
         } else {
            h0 = HtmlFormatter.createDocumentFormatter(null, true);
         }
      }

      return h0;
   }

   @Override
   public final ISlideImageFormat getSlideImageFormat() {
      return this.a6;
   }

   @Override
   public final void setSlideImageFormat(ISlideImageFormat value) {
      this.a6 = (SlideImageFormat)value;
   }

   final SlideImageFormat n5() {
      return this.a6 != null ? this.a6 : n3;
   }

   final ILinkEmbedController l6() {
      return this.u9;
   }

   @Override
   public final byte getJpegQuality() {
      return (byte)this.l6;
   }

   @Override
   public final void setJpegQuality(byte value) {
      if ((value & 255) >= 0 && (value & 255) <= 100) {
         this.l6 = value & 255;
      } else {
         throw new ArgumentOutOfRangeException("value", "JpegQuality value must be between 0 and 100.");
      }
   }

   @Override
   public final int getPicturesCompression() {
      return this.c8.n5();
   }

   @Override
   public final void setPicturesCompression(int value) {
      this.c8.n5(value);
   }

   @Override
   public final boolean getDeletePicturesCroppedAreas() {
      return this.c8.l6();
   }

   @Override
   public final void setDeletePicturesCroppedAreas(boolean value) {
      this.c8.n5(value);
   }

   final r3d k5() {
      return this.c8;
   }

   @Override
   public final boolean getSvgResponsiveLayout() {
      return this.t2;
   }

   @Override
   public final void setSvgResponsiveLayout(boolean value) {
      this.t2 = value;
   }
}
