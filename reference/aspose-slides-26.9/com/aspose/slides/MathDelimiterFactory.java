package com.aspose.slides;

public class MathDelimiterFactory implements IMathDelimiterFactory {
   @Override
   public final IMathDelimiter createMathDelimiter(IMathElement element) {
      return new MathDelimiter(element);
   }

   @Override
   public final IMathDelimiter createMathDelimiter(IMathElementCollection mathElements) {
      return new MathDelimiter(mathElements, null);
   }
}
