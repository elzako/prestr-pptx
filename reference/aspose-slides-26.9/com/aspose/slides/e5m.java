package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class e5m {
   public static String n5(IMathElement var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathAccent.class)) {
         return "acc";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathBar.class)) {
         return "bar";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathBox.class)) {
         return "box";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathGroupingCharacter.class)) {
         return "groupChr";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathBorderBox.class)) {
         return "borderBox";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathMatrix.class)) {
         return "m";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathDelimiter.class)) {
         return "d";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathArray.class)) {
         return "eqArr";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathFraction.class)) {
         return "f";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathFunction.class)) {
         return "func";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathLimit.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(var0, MathLimit.class).getUpperLimit() ? "limUpp" : "limLow";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathematicalText.class)) {
         return "r";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathNaryOperator.class)) {
         return "nary";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathRadical.class)) {
         return "rad";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, k3k.class)) {
         return "r";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathSubscriptElement.class)) {
         return "sSub";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathSuperscriptElement.class)) {
         return "sSup";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathRightSubSuperscriptElement.class)) {
         return "sSubSup";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathLeftSubSuperscriptElement.class)) {
         return "sPre";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathBlock.class)) {
         return "oMath";
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathPhantom.class)) {
         return "phant";
      } else {
         throw new NotImplementedException();
      }
   }

   public static String n5(o6z var0) {
      return "t";
   }
}
