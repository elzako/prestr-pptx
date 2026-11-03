package com.aspose.slides;

public class MathAccentFactory implements IMathAccentFactory {
   @Override
   public final IMathAccent createMathAccent(IMathElement element) {
      return new MathAccent(element);
   }

   @Override
   public final IMathAccent createMathAccent(IMathElement element, char accentCharacter) {
      return new MathAccent(element, accentCharacter);
   }
}
