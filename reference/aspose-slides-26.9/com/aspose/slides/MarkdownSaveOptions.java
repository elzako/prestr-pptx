package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

public class MarkdownSaveOptions extends SaveOptions {
   private int n5;
   private String l6;
   private String k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private int c8;
   private int t2;
   private boolean s7;
   private MarkdownSaveOptions$MarkdownImageSavingHandler x8;
   private MarkdownSaveOptions$MarkdownSvgImageSavingHandler n3;
   private String y4 = "# {0}";

   public final int getExportType() {
      return this.n5;
   }

   public final void setExportType(int value) {
      this.n5 = value;
   }

   public final String getBasePath() {
      return this.l6;
   }

   public final void setBasePath(String value) {
      this.l6 = value;
   }

   public final String getImagesSaveFolderName() {
      return this.k5;
   }

   public final void setImagesSaveFolderName(String value) {
      this.k5 = value;
   }

   public final int getNewLineType() {
      return this.u3;
   }

   public final void setNewLineType(int value) {
      this.u3 = value;
   }

   public final boolean getShowComments() {
      return this.a6;
   }

   public final void setShowComments(boolean value) {
      this.a6 = value;
   }

   public final boolean getShowHiddenSlides() {
      return this.u9;
   }

   public final void setShowHiddenSlides(boolean value) {
      this.u9 = value;
   }

   public final boolean getShowSlideNumber() {
      return this.h0;
   }

   public final void setShowSlideNumber(boolean value) {
      this.h0 = value;
   }

   public final int getFlavor() {
      return this.c8;
   }

   public final void setFlavor(int value) {
      this.c8 = value;
   }

   public final String getSlideNumberFormat() {
      return this.y4;
   }

   public final void setSlideNumberFormat(String value) {
      if (com.aspose.slides.ms.System.d1.n5(value)) {
         throw new ArgumentNullException("value", "Slide number format cannot be null or empty.");
      }

      if (!com.aspose.slides.ms.System.d1.t2(value, "{0}")) {
         throw new ArgumentException("Slide number format must contain the \"{0}\" placeholder, e.g., \"# Slide {0}\".", "value");
      }

      this.y4 = value;
   }

   public final int getHandleRepeatedSpaces() {
      return this.t2;
   }

   public final void setHandleRepeatedSpaces(int value) {
      this.t2 = value;
   }

   public final boolean getRemoveEmptyLines() {
      return this.s7;
   }

   public final void setRemoveEmptyLines(boolean value) {
      this.s7 = value;
   }

   public final void setImageSaving(MarkdownSaveOptions$MarkdownImageSavingHandler event) {
      this.x8 = event;
   }

   public final void setSvgImageSaving(MarkdownSaveOptions$MarkdownSvgImageSavingHandler event) {
      this.n3 = event;
   }

   public MarkdownSaveOptions() {
      this.setExportType(1);
      this.setImagesSaveFolderName("Images");
      this.setBasePath(com.aspose.slides.internal.z0k.u3.n5());
      this.setFlavor(23);
      this.setHandleRepeatedSpaces(1);
      this.setRemoveEmptyLines(false);
   }

   final boolean n5(IImage var1, int var2, String[] var3) {
      boolean var4 = false;
      if (this.x8 != null) {
         var4 = this.x8.invoke(var1, var2, var3);
      }

      return var4;
   }

   final boolean n5(SvgImage var1, String[] var2) {
      boolean var3 = false;
      if (this.n3 != null) {
         var3 = this.n3.invoke(var1, var2);
      }

      return var3;
   }
}
