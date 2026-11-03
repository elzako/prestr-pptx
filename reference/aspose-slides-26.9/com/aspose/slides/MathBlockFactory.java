package com.aspose.slides;

public class MathBlockFactory implements IMathBlockFactory {
   @Override
   public final IMathBlock createMathBlock() {
      return new MathBlock();
   }

   @Override
   public final IMathBlock createMathBlock(IMathElement mathElement) {
      return new MathBlock(mathElement);
   }

   @Override
   public final IMathBlock createMathBlock(IMathElementCollection mathElements) {
      return new MathBlock(mathElements);
   }
}
