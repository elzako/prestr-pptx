package com.aspose.slides;

public class MathFunctionFactory implements IMathFunctionFactory {
   @Override
   public final IMathFunction createMathFunction(IMathElement funcName, IMathElement baseArgument) {
      return new MathFunction(funcName, baseArgument);
   }

   @Override
   public final IMathFunction createMathFunction(String funcName, IMathElement baseArgument) {
      return new MathFunction(funcName, baseArgument);
   }
}
