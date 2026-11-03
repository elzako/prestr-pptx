package com.aspose.slides;

public class MathFractionFactory implements IMathFractionFactory {
   @Override
   public final IMathFraction createMathFraction(IMathElement numerator, IMathElement denominator, int fractionType) {
      return new MathFraction(numerator, denominator, fractionType);
   }

   @Override
   public final IMathFraction createMathFraction(IMathElement numerator, IMathElement denominator) {
      return new MathFraction(numerator, denominator);
   }
}
