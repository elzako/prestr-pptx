package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;

public abstract class MathElementBase implements IMathElement, r0g {
   static final MathematicalText l6 = new MathematicalText("-1");
   static final IMathElement[] k5 = new IMathElement[0];
   private MathElementBase n5;

   boolean Y_() {
      return false;
   }

   @Override
   public r0g getParent_Immediate() {
      return this.n5;
   }

   abstract void n5(o5r var1);

   @Override
   public IMathBlock join(IMathElement mathElement) {
      IMathBlock var2 = com.aspose.slides.internal.v6g.k5.n5(mathElement, IMathBlock.class);
      MathBlock var3;
      if (var2 != null) {
         var3 = new MathBlock(1 + var2.getCount());
         var3.add(this);
         var3.joinBlock(var2);
      } else {
         var3 = new MathBlock(2);
         var3.add(this);
         var3.add(mathElement);
      }

      return var3;
   }

   @Override
   public IMathBlock join(String mathText) {
      return this.join(new MathematicalText(mathText));
   }

   @Override
   public final IMathFraction divide(IMathElement denominator) {
      return new MathFraction(this, denominator);
   }

   @Override
   public final IMathFraction divide(String denominator) {
      return this.divide(new MathematicalText(denominator));
   }

   @Override
   public final IMathFraction divide(IMathElement denominator, int fractionType) {
      return new MathFraction(this, denominator, fractionType);
   }

   @Override
   public final IMathFraction divide(String denominator, int fractionType) {
      return this.divide(new MathematicalText(denominator), fractionType);
   }

   @Override
   public final IMathDelimiter enclose() {
      return this.enclose('(', ')');
   }

   @Override
   public IMathDelimiter enclose(char beginningCharacter, char endingCharacter) {
      MathDelimiter var3 = new MathDelimiter(this);
      var3.setBeginningCharacter(beginningCharacter);
      var3.setEndingCharacter(endingCharacter);
      var3.setSeparatorCharacter('\u0000');
      return var3;
   }

   @Override
   public final IMathFunction function(IMathElement functionArgument) {
      return new MathFunction(this, functionArgument);
   }

   @Override
   public final IMathFunction function(String functionArgument) {
      return this.function(new MathematicalText(functionArgument));
   }

   @Override
   public final IMathFunction asArgumentOfFunction(IMathElement functionName) {
      return new MathFunction(functionName, this);
   }

   @Override
   public final IMathFunction asArgumentOfFunction(String functionName) {
      return this.asArgumentOfFunction(new MathematicalText(functionName));
   }

   @Override
   public final IMathFunction asArgumentOfFunction(int functionType) {
      switch (functionType) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
            return this.asArgumentOfFunction(k5(functionType));
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
            return n5(k5(functionType)).function(this);
         default:
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.d1.n5(
                  "Invalid value = '{0}' of argument '{1}' of function '{2}'",new Object[]{
                  com.aspose.slides.ms.System.s3.n5(MathFunctionsOfOneArgument.class, functionType),
                  "functionType",
                  "AsArgumentOfFunction(FunctionType)"
               })
            );
      }
   }

   @Override
   public final IMathFunction asArgumentOfFunction(int functionType, IMathElement additionalArgument) {
      switch (functionType) {
         case 0:
            return n5(u3(functionType), additionalArgument).function(this);
         case 1:
         case 2:
         case 3:
            return l6(u3(functionType), additionalArgument).function(this);
         default:
            throw new NotImplementedException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Not implemented type of function ", com.aspose.slides.ms.System.s3.n5(MathFunctionsOfTwoArguments.class, functionType)
               })
            );
      }
   }

   @Override
   public final IMathFunction asArgumentOfFunction(int functionType, String additionalArgument) {
      return this.asArgumentOfFunction(functionType, new MathematicalText(additionalArgument));
   }

   @Override
   public final IMathSubscriptElement setSubscript(IMathElement subscript) {
      return new MathSubscriptElement(this, subscript);
   }

   @Override
   public final IMathSubscriptElement setSubscript(String subscript) {
      return this.setSubscript(new MathematicalText(subscript));
   }

   @Override
   public final IMathSuperscriptElement setSuperscript(IMathElement superscript) {
      return new MathSuperscriptElement(this, superscript);
   }

   @Override
   public final IMathSuperscriptElement setSuperscript(String superscript) {
      return this.setSuperscript(new MathematicalText(superscript));
   }

   @Override
   public final IMathRightSubSuperscriptElement setSubSuperscriptOnTheRight(IMathElement subscript, IMathElement superscript) {
      return new MathRightSubSuperscriptElement(this, subscript, superscript);
   }

   @Override
   public final IMathRightSubSuperscriptElement setSubSuperscriptOnTheRight(String subscript, String superscript) {
      return this.setSubSuperscriptOnTheRight(new MathematicalText(subscript), new MathematicalText(superscript));
   }

   @Override
   public final IMathLeftSubSuperscriptElement setSubSuperscriptOnTheLeft(IMathElement subscript, IMathElement superscript) {
      return new MathLeftSubSuperscriptElement(this, subscript, superscript);
   }

   @Override
   public final IMathLeftSubSuperscriptElement setSubSuperscriptOnTheLeft(String subscript, String superscript) {
      return this.setSubSuperscriptOnTheLeft(new MathematicalText(subscript), new MathematicalText(superscript));
   }

   @Override
   public final IMathRadical radical(IMathElement degree) {
      return new MathRadical(this, degree);
   }

   @Override
   public final IMathRadical radical(String degree) {
      return this.radical(new MathematicalText(degree));
   }

   @Override
   public final IMathLimit setUpperLimit(IMathElement limit) {
      return new MathLimit(this, limit, true);
   }

   @Override
   public final IMathLimit setUpperLimit(String limit) {
      return this.setUpperLimit(new MathematicalText(limit));
   }

   @Override
   public final IMathLimit setLowerLimit(IMathElement limit) {
      return new MathLimit(this, limit, false);
   }

   @Override
   public final IMathLimit setLowerLimit(String limit) {
      return this.setLowerLimit(new MathematicalText(limit));
   }

   @Override
   public final IMathNaryOperator nary(int type, IMathElement lowerLimit, IMathElement upperLimit) {
      return new MathNaryOperator(l6(type), this, lowerLimit, upperLimit);
   }

   @Override
   public final IMathNaryOperator nary(int type, String lowerLimit, String upperLimit) {
      return this.nary(type, new MathematicalText(lowerLimit), new MathematicalText(upperLimit));
   }

   @Override
   public IMathArray toMathArray() {
      return new MathArray(this);
   }

   @Override
   public final IMathNaryOperator integral(int integralType, IMathElement lowerLimit, IMathElement upperLimit, int limitLocations) {
      MathNaryOperator var5 = new MathNaryOperator(n5(integralType), this, lowerLimit, upperLimit);
      var5.setLimitLocation(limitLocations);
      return var5;
   }

   @Override
   public final IMathNaryOperator integral(int integralType, IMathElement lowerLimit, IMathElement upperLimit) {
      return new MathNaryOperator(n5(integralType), this, lowerLimit, upperLimit);
   }

   @Override
   public final IMathNaryOperator integral(int integralType) {
      return new MathNaryOperator(n5(integralType), this);
   }

   @Override
   public final IMathNaryOperator integral(int integralType, String lowerLimit, String upperLimit, int limitLocations) {
      return this.integral(integralType, new MathematicalText(lowerLimit), new MathematicalText(upperLimit), limitLocations);
   }

   @Override
   public final IMathNaryOperator integral(int integralType, String lowerLimit, String upperLimit) {
      return this.integral(integralType, new MathematicalText(lowerLimit), new MathematicalText(upperLimit));
   }

   @Override
   public final IMathAccent accent(char accentCharacter) {
      return new MathAccent(this, accentCharacter);
   }

   @Override
   public final IMathBar overbar() {
      return new MathBar(this, 1);
   }

   @Override
   public final IMathBar underbar() {
      return new MathBar(this, 2);
   }

   @Override
   public final IMathGroupingCharacter group() {
      return new MathGroupingCharacter(this);
   }

   @Override
   public final IMathGroupingCharacter group(char character, int position, int verticalJustification) {
      return new MathGroupingCharacter(this, character, position, verticalJustification);
   }

   @Override
   public final IMathBorderBox toBorderBox() {
      return new MathBorderBox(this);
   }

   @Override
   public final IMathBorderBox toBorderBox(
      boolean hideTop,
      boolean hideBottom,
      boolean hideLeft,
      boolean hideRight,
      boolean strikethroughHorizontal,
      boolean strikethroughVertical,
      boolean strikethroughBottomLeftToTopRight,
      boolean strikethroughTopLeftToBottomRight
   ) {
      MathBorderBox var9 = new MathBorderBox(this);
      var9.setHideTop(hideTop);
      var9.setHideBottom(hideBottom);
      var9.setHideLeft(hideLeft);
      var9.setHideRight(hideRight);
      var9.setStrikethroughHorizontal(strikethroughHorizontal);
      var9.setStrikethroughVertical(strikethroughVertical);
      var9.setStrikethroughBottomLeftToTopRight(strikethroughBottomLeftToTopRight);
      var9.setStrikethroughTopLeftToBottomRight(strikethroughTopLeftToBottomRight);
      return var9;
   }

   @Override
   public final IMathBox toBox() {
      return new MathBox(this);
   }

   protected MathElementBase() {
   }

   final void n5(MathElementBase var1) {
      if (this.n5 != null) {
         throw new PptxEditException("It is not possible to set a new math element parent without removing the old one.");
      }

      if (var1 == null) {
         throw new ArgumentNullException("parentImmediate", "To set the value to null you need to call the method ResetParent");
      }

      this.n5 = var1;
   }

   final void u3() {
      this.n5 = null;
   }

   @Override
   public IMathElement[] getChildren() {
      throw new NotImplementedException();
   }

   protected final IMathElement[] getChildren(IMathElement child1, IMathElement child2, IMathElement child3) {
      if (child1 == null) {
         return this.getChildren(child2, child3);
      } else if (child2 == null) {
         return this.getChildren(child1, child3);
      } else {
         return child3 == null ? this.getChildren(child1, child2) : new IMathElement[]{child1, child2, child3};
      }
   }

   protected final IMathElement[] getChildren(IMathElement child1, IMathElement child2) {
      if (child1 == null) {
         return child2 == null ? k5 : new IMathElement[]{child2};
      } else {
         return child2 == null ? new IMathElement[]{child1} : new IMathElement[]{child1, child2};
      }
   }

   protected final IMathElement[] getChildren(IMathElement child) {
      return child == null ? k5 : new IMathElement[]{child};
   }

   private static char n5(int var0) {
      switch (var0) {
         case 0:
            return '∫';
         case 1:
            return '∬';
         case 2:
            return '∭';
         case 3:
            return '∮';
         case 4:
            return '∯';
         case 5:
            return '∰';
         default:
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.d1.n5(
                  "Invalid value = '{0}' of argument '{1}' of function '{2}'",new Object[]{
                  com.aspose.slides.ms.System.s3.n5(MathIntegralTypes.class, var0),
                  "integralType",
                  "GetIntegralCharacterByType"
               })
            );
      }
   }

   private static char l6(int var0) {
      switch (var0) {
         case 0:
            return '∑';
         case 1:
            return '∏';
         case 2:
            return '∐';
         case 3:
            return '∩';
         case 4:
            return '∪';
         case 5:
            return '∧';
         case 6:
            return '∨';
         default:
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.d1.n5(
                  "Invalid value = '{0}' of argument '{1}' of function '{2}'",new Object[]{
                  com.aspose.slides.ms.System.s3.n5(MathNaryOperatorTypes.class, var0),
                  "naryType",
                  "GetNaryCharacterByType"
               })
            );
      }
   }

   private static String k5(int var0) {
      switch (var0) {
         case 0:
            return "sin";
         case 1:
            return "cos";
         case 2:
            return "tan";
         case 3:
            return "csc";
         case 4:
            return "sec";
         case 5:
            return "cot";
         case 6:
            return "sinh";
         case 7:
            return "cosh";
         case 8:
            return "tanh";
         case 9:
            return "csch";
         case 10:
            return "sech";
         case 11:
            return "coth";
         case 12:
            return "log";
         case 13:
            return "ln";
         default:
            throw new NotImplementedException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "GetFunctionNameByType: Not implemented type of function ", com.aspose.slides.ms.System.s3.n5(MathFunctionsOfOneArgument.class, var0)
               })
            );
      }
   }

   private static String u3(int var0) {
      switch (var0) {
         case 0:
            return "log";
         case 1:
            return "lim";
         case 2:
            return "min";
         case 3:
            return "max";
         default:
            throw new NotImplementedException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "GetFunctionNameByType: Not implemented type of function ", com.aspose.slides.ms.System.s3.n5(MathFunctionsOfTwoArguments.class, var0)
               })
            );
      }
   }

   private static MathSuperscriptElement n5(String var0) {
      return (MathSuperscriptElement)new MathematicalText(var0).setSuperscript(l6);
   }

   private static MathSubscriptElement n5(String var0, IMathElement var1) {
      return (MathSubscriptElement)new MathematicalText(var0).setSubscript(var1);
   }

   private static MathLimit l6(String var0, IMathElement var1) {
      return (MathLimit)new MathematicalText(var0).setLowerLimit(var1);
   }
}
