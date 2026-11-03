package com.aspose.slides;

public class MathBorderBoxFactory implements IMathBorderBoxFactory {
   @Override
   public final IMathBorderBox createMathBorderBox(IMathElement element) {
      return new MathBorderBox(element);
   }

   @Override
   public final IMathBorderBox createMathBorderBox(
      IMathElement element,
      boolean hideTop,
      boolean hideBottom,
      boolean hideLeft,
      boolean hideRight,
      boolean strikethroughHorizontal,
      boolean strikethroughVertical,
      boolean strikethroughBottomLeftToTopRight,
      boolean strikethroughTopLeftToBottomRight
   ) {
      return new MathBorderBox(
         element,
         hideTop,
         hideBottom,
         hideLeft,
         hideRight,
         strikethroughHorizontal,
         strikethroughVertical,
         strikethroughBottomLeftToTopRight,
         strikethroughTopLeftToBottomRight
      );
   }
}
