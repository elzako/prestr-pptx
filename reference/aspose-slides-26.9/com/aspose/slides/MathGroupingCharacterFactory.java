package com.aspose.slides;

public class MathGroupingCharacterFactory implements IMathGroupingCharacterFactory {
   @Override
   public final IMathGroupingCharacter createMathGroupingCharacter(IMathElement element, char character, int position, int verticalJustification) {
      return new MathGroupingCharacter(element, character, position, verticalJustification);
   }

   @Override
   public final IMathGroupingCharacter createMathGroupingCharacter(IMathElement element) {
      return new MathGroupingCharacter(element);
   }
}
