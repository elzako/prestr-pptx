package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import java.awt.Color;

public class PdfOptions extends SaveOptions implements IPdfOptions {
   private int l6;
   private boolean k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private int t2;
   private boolean s7;
   private int x8;
   private boolean n3;
   private String[] y4;
   private String e2;
   private float t9;
   private boolean z1;
   private boolean t4;
   private com.aspose.slides.internal.o9b.c8 q0 = com.aspose.slides.internal.o9b.c8.e2().o8();
   private boolean z3 = true;
   private boolean m1 = false;
   private ISlidesLayoutOptions k7;
   private InkOptions m3 = new InkOptions();
   private boolean z8;
   static final String[] n5 = new String[]{"Arial", "Helvetica", "Times", "Times New Roman", "Courier", "Courier New", "Symbol", "Zapf Dingbats"};

   public PdfOptions() {
      this.u3 = 1;
      this.u9 = true;
      this.c8 = false;
      this.h0 = false;
      this.t2 = 100;
      this.s7 = false;
      this.x8 = 2;
      this.n3 = true;
      this.t9 = 96.0F;
      this.z8 = false;
      this.setAccessPermissions(0);
   }

   @Override
   public final ISlidesLayoutOptions getSlidesLayoutOptions() {
      return this.k7;
   }

   @Override
   public final void setSlidesLayoutOptions(ISlidesLayoutOptions value) {
      this.k7 = value;
   }

   @Override
   public final IInkOptions getInkOptions() {
      return this.m3;
   }

   @Override
   public final boolean getShowHiddenSlides() {
      return this.t4;
   }

   @Override
   public final void setShowHiddenSlides(boolean value) {
      this.t4 = value;
   }

   @Override
   public final int getTextCompression() {
      return this.u3;
   }

   @Override
   public final void setTextCompression(int value) {
      this.u3 = value;
   }

   @Override
   public final boolean getBestImagesCompressionRatio() {
      return this.a6;
   }

   @Override
   public final void setBestImagesCompressionRatio(boolean value) {
      this.a6 = value;
   }

   @Override
   public final boolean getEmbedTrueTypeFontsForASCII() {
      return this.u9;
   }

   @Override
   public final void setEmbedTrueTypeFontsForASCII(boolean value) {
      this.u9 = value;
   }

   @Override
   public final String[] getAdditionalCommonFontFamilies() {
      return this.y4 == null ? null : (String[])this.y4.clone();
   }

   @Override
   public final void setAdditionalCommonFontFamilies(String[] value) {
      if (value == null) {
         this.y4 = null;
      } else {
         this.y4 = (String[])value.clone();
      }
   }

   @Override
   public final boolean getEmbedFullFonts() {
      return this.c8;
   }

   @Override
   public final void setEmbedFullFonts(boolean value) {
      this.c8 = value;
   }

   @Override
   public final boolean getRasterizeUnsupportedFontStyles() {
      return this.h0;
   }

   @Override
   public final void setRasterizeUnsupportedFontStyles(boolean value) {
      this.h0 = value;
   }

   @Override
   public final byte getJpegQuality() {
      return (byte)this.t2;
   }

   @Override
   public final void setJpegQuality(byte value) {
      if ((value & 255) >= 0 && (value & 255) <= 100) {
         this.t2 = value & 255;
      } else {
         throw new ArgumentOutOfRangeException("value", "JpegQuality value must be between 0 and 100.");
      }
   }

   @Override
   public final int getCompliance() {
      return this.x8;
   }

   @Override
   public final void setCompliance(int value) {
      this.x8 = value;
   }

   @Override
   public final String getPassword() {
      return this.e2;
   }

   @Override
   public final void setPassword(String value) {
      this.e2 = value;
   }

   @Override
   public final int getAccessPermissions() {
      return this.l6;
   }

   @Override
   public final void setAccessPermissions(int value) {
      this.l6 = value;
   }

   @Override
   public final boolean getSaveMetafilesAsPng() {
      return this.n3;
   }

   @Override
   public final void setSaveMetafilesAsPng(boolean value) {
      this.n3 = value;
   }

   @Override
   public final float getSufficientResolution() {
      return this.t9;
   }

   @Override
   public final void setSufficientResolution(float value) {
      this.t9 = value;
   }

   @Override
   public final boolean getDrawSlidesFrame() {
      return this.z1;
   }

   @Override
   public final void setDrawSlidesFrame(boolean value) {
      this.z1 = value;
   }

   @Override
   public final Color getImageTransparentColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.n5());
   }

   com.aspose.slides.internal.o9b.c8 n5() {
      return this.q0;
   }

   @Override
   public final void setImageTransparentColor(Color value) {
      this.n5(com.aspose.slides.internal.o9b.c8.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.q0);
   }

   @Override
   public final boolean getApplyImageTransparent() {
      return this.z3;
   }

   @Override
   public final void setApplyImageTransparent(boolean value) {
      this.z3 = value;
   }

   @Override
   public final boolean getIncludeOleData() {
      return this.z8;
   }

   @Override
   public final void setIncludeOleData(boolean value) {
      this.z8 = value;
   }

   final com.aspose.slides.internal.z4.k7 l6() {
      com.aspose.slides.internal.z4.k7 var1 = new com.aspose.slides.internal.z4.k7();
      var1.n5(new z0q(this));
      var1.n5(com.aspose.slides.internal.p1s.n5.n5(this.q0.o8()));
      var1.l6(this.z3);
      var1.n5(this.getTextCompression() == 1 ? 3 : 0);
      var1.n5(this.getBestImagesCompressionRatio());
      var1.l6(this.getJpegQuality() & 255);
      var1.k5(n5(this.getCompliance()));
      if (this.e2 != null && !"".equals(com.aspose.slides.ms.System.d1.l6(this.e2))) {
         var1.n5(new com.aspose.slides.internal.d0.n5(this.e2, null, this.getAccessPermissions(), 1));
      }

      if (this.getCompliance() != 3) {
         var1.u3(this.getEmbedFullFonts() ? 4 : 2);
         if (!this.getEmbedTrueTypeFontsForASCII()) {
            byte var2 = 1;
            if (this.getEmbedFullFonts()) {
               var2 |= 4;
            }

            for (int var3 = 0; var3 < n5.length; var3++) {
               var1.m1().n5(n5[var3], var2);
            }

            if (this.y4 != null) {
               for (int var4 = 0; var4 < this.y4.length; var4++) {
                  if (this.y4[var4] != null && !"".equals(this.y4[var4])) {
                     var1.m1().n5(this.y4[var4], var2);
                  }
               }
            }
         }
      }

      var1.m1().l6("Batang", 4);
      var1.m1().l6("BatangChe", 4);
      var1.m1().l6("GulimChe", 4);
      return var1;
   }

   private static int n5(int var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 4;
         case 4:
            return 3;
         case 5:
            return 6;
         case 6:
            return 5;
         case 7:
            return 8;
         case 8:
            return 7;
         case 9:
            return 9;
         case 10:
            return 10;
         default:
            throw new ArgumentOutOfRangeException("compliance", var0, null);
      }
   }

   final boolean k5() {
      return this.k5;
   }

   final void n5(boolean var1) {
      this.k5 = var1;
   }
}
