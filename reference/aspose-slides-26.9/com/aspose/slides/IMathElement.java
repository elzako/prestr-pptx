package com.aspose.slides;

public interface IMathElement {
   IMathElement[] getChildren();

   IMathBlock join(IMathElement var1);

   IMathBlock join(String var1);

   IMathFraction divide(IMathElement var1);

   IMathFraction divide(String var1);

   IMathFraction divide(IMathElement var1, int var2);

   IMathFraction divide(String var1, int var2);

   IMathDelimiter enclose();

   IMathDelimiter enclose(char var1, char var2);

   IMathFunction function(IMathElement var1);

   IMathFunction function(String var1);

   IMathFunction asArgumentOfFunction(IMathElement var1);

   IMathFunction asArgumentOfFunction(String var1);

   IMathFunction asArgumentOfFunction(int var1);

   IMathFunction asArgumentOfFunction(int var1, IMathElement var2);

   IMathFunction asArgumentOfFunction(int var1, String var2);

   IMathSubscriptElement setSubscript(IMathElement var1);

   IMathSubscriptElement setSubscript(String var1);

   IMathSuperscriptElement setSuperscript(IMathElement var1);

   IMathSuperscriptElement setSuperscript(String var1);

   IMathRightSubSuperscriptElement setSubSuperscriptOnTheRight(IMathElement var1, IMathElement var2);

   IMathRightSubSuperscriptElement setSubSuperscriptOnTheRight(String var1, String var2);

   IMathLeftSubSuperscriptElement setSubSuperscriptOnTheLeft(IMathElement var1, IMathElement var2);

   IMathLeftSubSuperscriptElement setSubSuperscriptOnTheLeft(String var1, String var2);

   IMathRadical radical(IMathElement var1);

   IMathRadical radical(String var1);

   IMathLimit setUpperLimit(IMathElement var1);

   IMathLimit setUpperLimit(String var1);

   IMathLimit setLowerLimit(IMathElement var1);

   IMathLimit setLowerLimit(String var1);

   IMathNaryOperator nary(int var1, IMathElement var2, IMathElement var3);

   IMathNaryOperator nary(int var1, String var2, String var3);

   IMathArray toMathArray();

   IMathNaryOperator integral(int var1, IMathElement var2, IMathElement var3, int var4);

   IMathNaryOperator integral(int var1, IMathElement var2, IMathElement var3);

   IMathNaryOperator integral(int var1);

   IMathNaryOperator integral(int var1, String var2, String var3, int var4);

   IMathNaryOperator integral(int var1, String var2, String var3);

   IMathAccent accent(char var1);

   IMathBar overbar();

   IMathBar underbar();

   IMathGroupingCharacter group();

   IMathGroupingCharacter group(char var1, int var2, int var3);

   IMathBorderBox toBorderBox();

   IMathBorderBox toBorderBox(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8);

   IMathBox toBox();
}
