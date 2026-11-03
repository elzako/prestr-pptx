package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class SVGOptions extends SaveOptions implements ISVGOptions, Cloneable {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private int u9;
   private ILinkEmbedController h0 = com.aspose.slides.internal.k0r.f0.n5;
   private ILinkEmbedController c8;
   private l6x t2;
   private int s7 = 85;
   private boolean x8;
   private boolean n3;
   private ISvgShapeFormattingController y4;
   private int e2 = 0;
   private final r3d t9 = r3d.u3();
   private InkOptions z1;

   public SVGOptions() {
      this.a6();
   }

   public SVGOptions(ILinkEmbedController linkEmbedController) {
      this.a6();
      this.n5(linkEmbedController);
   }

   private void a6() {
      this.t2 = new l6x();
      this.t2.n5("Webdings", 2);
      this.t2.l6("\\AWingdings\\s?[23]?\\z", 2);
      this.t2.n5("Symbol", 2);
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = 72;
      this.x8 = false;
      this.n3 = true;
      this.z1 = new InkOptions();
   }

   @Override
   public final IInkOptions getInkOptions() {
      return this.z1;
   }

   @Override
   public final boolean getUseFrameSize() {
      return this.x8;
   }

   @Override
   public final void setUseFrameSize(boolean value) {
      this.x8 = value;
   }

   @Override
   public final boolean getUseFrameRotation() {
      return this.n3;
   }

   @Override
   public final void setUseFrameRotation(boolean value) {
      this.n3 = value;
   }

   @Override
   public final boolean getVectorizeText() {
      return this.l6;
   }

   @Override
   public final void setVectorizeText(boolean value) {
      this.l6 = value;
   }

   @Override
   public final int getMetafileRasterizationDpi() {
      return this.u9;
   }

   @Override
   public final void setMetafileRasterizationDpi(int value) {
      if (value < 1) {
         throw new ArgumentException("MetafileRasterizationDpi can't be less than 1");
      }

      this.u9 = value;
   }

   @Override
   public final boolean getDisable3DText() {
      return this.k5;
   }

   @Override
   public final void setDisable3DText(boolean value) {
      this.k5 = value;
   }

   @Override
   public final boolean getDisableGradientSplit() {
      return this.u3;
   }

   @Override
   public final void setDisableGradientSplit(boolean value) {
      this.u3 = value;
   }

   @Override
   public final boolean getDisableLineEndCropping() {
      return this.a6;
   }

   @Override
   public final void setDisableLineEndCropping(boolean value) {
      this.a6 = value;
   }

   final l6x n5() {
      return this.t2;
   }

   public static SVGOptions getDefault() {
      return new SVGOptions();
   }

   public static SVGOptions getSimple() {
      SVGOptions var0 = new SVGOptions();
      var0.setDisable3DText(true);
      var0.setVectorizeText(false);
      var0.setDisableGradientSplit(true);
      var0.setDisableLineEndCropping(true);
      var0.n5().l6();
      return var0;
   }

   public static SVGOptions getWYSIWYG() {
      SVGOptions var0 = new SVGOptions();
      var0.setVectorizeText(true);
      var0.setMetafileRasterizationDpi(300);
      return var0;
   }

   @Override
   public final int getJpegQuality() {
      return this.s7;
   }

   @Override
   public final void setJpegQuality(int value) {
      if (value >= 1 && value <= 100) {
         this.s7 = value;
      } else {
         throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.d1.n5("Value for JpegQuality ({0}) is out of range 1..100", new Object[]{value}));
      }
   }

   @Override
   public final ISvgShapeFormattingController getShapeFormattingController() {
      return this.y4;
   }

   @Override
   public final void setShapeFormattingController(ISvgShapeFormattingController value) {
      this.y4 = value;
   }

   @Override
   public final int getPicturesCompression() {
      return this.t9.n5();
   }

   @Override
   public final void setPicturesCompression(int value) {
      this.t9.n5(value);
   }

   @Override
   public final boolean getDeletePicturesCroppedAreas() {
      return this.t9.l6();
   }

   @Override
   public final void setDeletePicturesCroppedAreas(boolean value) {
      this.t9.n5(value);
   }

   @Override
   public final int getExternalFontsHandling() {
      return this.e2;
   }

   @Override
   public final void setExternalFontsHandling(int value) {
      this.e2 = value;
   }

   final void n5(ILinkEmbedController var1) {
      this.c8 = var1;
      ILinkEmbedController var2 = var1;
      if (var2 == null) {
         var2 = com.aspose.slides.internal.k0r.f0.n5;
      }

      this.h0 = var2;
   }

   final ILinkEmbedController l6() {
      return this.h0;
   }

   final r3d k5() {
      return this.t9;
   }

   final ISVGOptions u3() {
      SVGOptions var1 = (SVGOptions)this.memberwiseClone();
      var1.t2 = new l6x(this.t2);
      return var1;
   }

   @Override
   public final boolean getDisableFontLigatures() {
      return this.n5;
   }

   @Override
   public final void setDisableFontLigatures(boolean value) {
      this.n5 = value;
   }

   protected Object memberwiseClone() {
      try {
         return (SVGOptions)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
