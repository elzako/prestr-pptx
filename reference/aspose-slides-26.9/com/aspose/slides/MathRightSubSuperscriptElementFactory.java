package com.aspose.slides;

public class MathRightSubSuperscriptElementFactory implements IMathRightSubSuperscriptElementFactory {
   @Override
   public final IMathRightSubSuperscriptElement createMathRightSubSuperscriptElement(IMathElement baseArg, IMathElement subScript, IMathElement superScript) {
      return new MathRightSubSuperscriptElement(baseArg, subScript, superScript);
   }
}
