package com.aspose.slides;

public class EmbeddedEotFontsHtmlController implements IEmbeddedEotFontsHtmlController {
   private final c8e n5;
   private static final x8z l6 = new d2x();

   public EmbeddedEotFontsHtmlController() {
      this.n5 = new c8e(l6, c8e.n5);
   }

   public EmbeddedEotFontsHtmlController(IHtmlFormattingController controller) {
      this.n5 = new c8e(controller, c8e.n5, l6);
   }

   @Override
   public final void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation) {
      this.n5.n5(generator, presentation);
   }

   @Override
   public final void writeDocumentEnd(IHtmlGenerator generator, IPresentation presentation) {
      this.n5.u3(generator, presentation);
   }

   @Override
   public final void writeSlideStart(IHtmlGenerator generator, ISlide slide) {
      this.n5.n5(generator, slide);
   }

   @Override
   public final void writeSlideEnd(IHtmlGenerator generator, ISlide slide) {
      this.n5.l6(generator, slide);
   }

   @Override
   public final void writeShapeStart(IHtmlGenerator generator, IShape shape) {
      this.n5.n5(generator, shape);
   }

   @Override
   public final void writeShapeEnd(IHtmlGenerator generator, IShape shape) {
      this.n5.l6(generator, shape);
   }
}
