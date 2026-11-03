package com.aspose.slides;

public class ResponsiveHtmlController implements IResponsiveHtmlController {
   private final IHtmlFormattingController n5;

   public ResponsiveHtmlController() {
      this.n5 = HtmlFormatter.n5(null, true);
   }

   public ResponsiveHtmlController(IHtmlFormattingController controller) {
      this.n5 = controller;
   }

   @Override
   public final void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation) {
      this.n5.writeDocumentStart(generator, presentation);
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      var3.n5("<style>");
      float var4 = ((SlideSize)presentation.getSlideSize()).n5().k5() / ((SlideSize)presentation.getSlideSize()).n5().l6();
      float var5 = ((SlideSize)presentation.getSlideSize()).n5().k5() / 0.75F / 2.0F - 2.0F;
      float var6 = ((SlideSize)presentation.getSlideSize()).n5().l6() / 0.75F + 16.0F;
      String var7 = "";
      if (presentation.getSlideSize().getOrientation() == 0) {
         var7 = com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.ms.System.d1.n5(
               ".slide {\r\n              position: relative;\r\n              box-sizing: border-box; }\r\n\r\n              @media only screen and (max-width:[MAXWIDTH]px) {\n\t\t\t\t.slides-canvas { width: 100%; margin-top: calc(((100% - 100vw*[SIZERATIO])/2) - [TOPSHIFT]px); }\n\t\t\t  }\r\n            ",
               "[SIZERATIO]",
               com.aspose.slides.ms.System.n1.u9(1.0F - var4)
            ),
            "[TOPSHIFT]",
            com.aspose.slides.ms.System.n1.u9(var5)
         );
      } else if (presentation.getSlideSize().getOrientation() == 1) {
         var7 = com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.ms.System.d1.n5(
               ".slide {\r\n              position: relative;\r\n              box-sizing: border-box; }\r\n\r\n              @media only screen and (max-width:[MAXWIDTH]px) {\n\t\t\t\t.slides-canvas { width: 100%; margin-top: calc(((100vw*[SIZERATIO] - 100%)/2) - [TOPSHIFT]px); }\n\t\t\t  }\r\n            ",
               "[SIZERATIO]",
               com.aspose.slides.ms.System.n1.u9(1.0F + var4)
            ),
            "[TOPSHIFT]",
            com.aspose.slides.ms.System.n1.u9(var5 + 48.0F)
         );
      }

      var7 = com.aspose.slides.ms.System.d1.n5(var7, "[MAXWIDTH]", com.aspose.slides.ms.System.n1.u9(var6));
      var3.n5(var7);
      var3.n5("</style>");
      generator.addHtml(var3.toString());
   }

   @Override
   public final void writeDocumentEnd(IHtmlGenerator generator, IPresentation presentation) {
      this.n5.writeDocumentEnd(generator, presentation);
   }

   @Override
   public final void writeSlideStart(IHtmlGenerator generator, ISlide slide) {
      this.n5.writeSlideStart(generator, slide);
   }

   @Override
   public final void writeSlideEnd(IHtmlGenerator generator, ISlide slide) {
      this.n5.writeSlideEnd(generator, slide);
   }

   @Override
   public final void writeShapeStart(IHtmlGenerator generator, IShape shape) {
      this.n5.writeShapeStart(generator, shape);
   }

   @Override
   public final void writeShapeEnd(IHtmlGenerator generator, IShape shape) {
      this.n5.writeShapeEnd(generator, shape);
   }
}
