package com.aspose.slides;

public class MathParagraphFactory implements IMathParagraphFactory {
   @Override
   public final IMathParagraph createMathParagraph() {
      return new MathParagraph();
   }

   @Override
   public final IMathParagraph createMathParagraph(IMathBlock mathBlock) {
      return new MathParagraph(mathBlock);
   }
}
