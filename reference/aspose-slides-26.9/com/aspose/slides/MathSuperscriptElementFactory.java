package com.aspose.slides;

public class MathSuperscriptElementFactory implements IMathSuperscriptElementFactory {
   @Override
   public final IMathSuperscriptElement createMathSuperscriptElement(IMathElement baseArg, IMathElement superScript) {
      return new MathSuperscriptElement(baseArg, superScript);
   }
}
