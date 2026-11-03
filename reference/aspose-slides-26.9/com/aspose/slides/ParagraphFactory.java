package com.aspose.slides;

public class ParagraphFactory implements IParagraphFactory {
   @Override
   public final IParagraph createParagraph() {
      return new Paragraph();
   }

   @Override
   public final IParagraph createParagraph(IParagraph paragraph) {
      return new Paragraph(com.aspose.slides.internal.v6g.k5.n5(paragraph, Paragraph.class));
   }
}
