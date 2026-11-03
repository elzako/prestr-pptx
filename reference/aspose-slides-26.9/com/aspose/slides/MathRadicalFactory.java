package com.aspose.slides;

public class MathRadicalFactory implements IMathRadicalFactory {
   @Override
   public final IMathRadical createMathRadical(IMathElement baseArgument, IMathElement degreeArgument) {
      return new MathRadical(baseArgument, degreeArgument);
   }
}
