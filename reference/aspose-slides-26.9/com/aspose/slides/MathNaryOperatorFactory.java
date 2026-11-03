package com.aspose.slides;

public class MathNaryOperatorFactory implements IMathNaryOperatorFactory {
   @Override
   public final IMathNaryOperator createMathNaryOperator(char operatorSymbol, IMathElement baseArgument, IMathElement lowerLimit, IMathElement upperLimit) {
      return new MathNaryOperator(operatorSymbol, baseArgument, lowerLimit, upperLimit);
   }

   @Override
   public final IMathNaryOperator createMathNaryOperator(char operatorSymbol, IMathElement baseArgument, IMathElement lowerLimit) {
      return new MathNaryOperator(operatorSymbol, baseArgument, lowerLimit);
   }

   @Override
   public final IMathNaryOperator createMathNaryOperator(char operatorSymbol, IMathElement baseArgument) {
      return new MathNaryOperator(operatorSymbol, baseArgument);
   }
}
