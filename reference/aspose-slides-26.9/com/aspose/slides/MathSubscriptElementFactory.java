package com.aspose.slides;

public class MathSubscriptElementFactory implements IMathSubscriptElementFactory {
   @Override
   public final IMathSubscriptElement createMathSubscriptElement(IMathElement baseArg, IMathElement subScript) {
      return new MathSubscriptElement(baseArg, subScript);
   }
}
