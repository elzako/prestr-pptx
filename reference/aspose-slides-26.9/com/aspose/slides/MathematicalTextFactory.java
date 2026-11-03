package com.aspose.slides;

public class MathematicalTextFactory implements IMathematicalTextFactory {
   @Override
   public final IMathematicalText createMathematicalText() {
      return new MathematicalText();
   }

   @Override
   public final IMathematicalText createMathematicalText(char mathSymbol) {
      return new MathematicalText(mathSymbol);
   }

   @Override
   public final IMathematicalText createMathematicalText(String mathText) {
      return new MathematicalText(mathText);
   }

   @Override
   public final IMathematicalText createMathematicalText(String mathText, IPortionFormat portionFormat) {
      return new MathematicalText(mathText, portionFormat);
   }
}
