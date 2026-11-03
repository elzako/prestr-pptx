package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class EmbedAllFontsHtmlController implements IHtmlFormattingController {
   private final c8e m_controllerInternal;

   public EmbedAllFontsHtmlController() {
      x8z var1 = this.createFontDataProvider(0);
      this.m_controllerInternal = new c8e(var1, c8e.n5, new EmbedAllFontsHtmlController$1(this));
   }

   public EmbedAllFontsHtmlController(String[] fontNameExcludeList) {
      if (fontNameExcludeList == null) {
         throw new ArgumentNullException("fontNameExcludeList");
      }

      x8z var2 = this.createFontDataProvider(0);
      this.m_controllerInternal = new c8e(var2, fontNameExcludeList, new EmbedAllFontsHtmlController$2(this));
   }

   final c8e getControllerInternal() {
      return this.m_controllerInternal;
   }

   @Override
   public void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation) {
      this.m_controllerInternal.n5(generator, presentation);
      this.writeAllFonts(generator, presentation);
   }

   @Override
   public void writeDocumentEnd(IHtmlGenerator generator, IPresentation presentation) {
      this.m_controllerInternal.u3(generator, presentation);
   }

   @Override
   public void writeSlideStart(IHtmlGenerator generator, ISlide slide) {
      this.m_controllerInternal.n5(generator, slide);
   }

   @Override
   public void writeSlideEnd(IHtmlGenerator generator, ISlide slide) {
      this.m_controllerInternal.l6(generator, slide);
   }

   @Override
   public void writeShapeStart(IHtmlGenerator generator, IShape shape) {
      this.m_controllerInternal.n5(generator, shape);
   }

   @Override
   public void writeShapeEnd(IHtmlGenerator generator, IShape shape) {
      this.m_controllerInternal.l6(generator, shape);
   }

   public void writeAllFonts(IHtmlGenerator generator, IPresentation presentation) {
      this.m_controllerInternal.k5(generator, presentation);
   }

   public void writeFont(IHtmlGenerator generator, IFontData originalFont, IFontData substitutedFont, String fontStyle, String fontWeight, byte[] fontData) {
      this.m_controllerInternal.n5(generator, originalFont, substitutedFont, fontStyle, fontWeight, fontData);
   }

   private x8z createFontDataProvider(int format) {
      switch (format) {
         case 0:
            return new g5w();
         case 1:
            return new d2x();
         default:
            throw new ArgumentOutOfRangeException("format", com.aspose.slides.ms.System.s3.n5(o9p.class, format), null);
      }
   }
}
