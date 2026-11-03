package com.aspose.slides;

public class MathArrayFactory implements IMathArrayFactory {
   @Override
   public final IMathArray createMathArray(IMathElement element) {
      return new MathArray(element);
   }

   @Override
   public final IMathArray createMathArray(IMathElementCollection elements) {
      return new MathArray(elements);
   }
}
