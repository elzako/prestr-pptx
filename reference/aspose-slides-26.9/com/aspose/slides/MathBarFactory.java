package com.aspose.slides;

public class MathBarFactory implements IMathBarFactory {
   @Override
   public final IMathBar createMathBar(IMathElement element) {
      return new MathBar(element);
   }

   @Override
   public final IMathBar createMathBar(IMathElement element, int position) {
      return new MathBar(element, position);
   }
}
