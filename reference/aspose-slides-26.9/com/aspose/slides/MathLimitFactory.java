package com.aspose.slides;

public class MathLimitFactory implements IMathLimitFactory {
   @Override
   public final IMathLimit createMathLimit(IMathElement baseArg, IMathElement limit, boolean upperLimit) {
      return new MathLimit(baseArg, limit, upperLimit);
   }

   @Override
   public final IMathLimit createMathLimit(IMathElement baseArg, IMathElement limit) {
      return new MathLimit(baseArg, limit);
   }
}
