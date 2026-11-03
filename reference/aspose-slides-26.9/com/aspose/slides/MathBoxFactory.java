package com.aspose.slides;

public class MathBoxFactory implements IMathBoxFactory {
   @Override
   public final IMathBox createMathBox(IMathElement element) {
      return new MathBox(element);
   }
}
