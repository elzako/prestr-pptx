package com.aspose.slides;

public final class MathBorderBox extends MathElementBase implements IMathBorderBox, q8r {
   private IMathElement u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   final s7u n5;

   @Override
   public final IMathElement getBase() {
      return this.u3;
   }

   private void n5(IMathElement var1) {
      this.u3 = var1;
   }

   @Override
   public final boolean getHideTop() {
      return this.a6;
   }

   @Override
   public final void setHideTop(boolean value) {
      this.a6 = value;
   }

   @Override
   public final boolean getHideBottom() {
      return this.u9;
   }

   @Override
   public final void setHideBottom(boolean value) {
      this.u9 = value;
   }

   @Override
   public final boolean getHideLeft() {
      return this.h0;
   }

   @Override
   public final void setHideLeft(boolean value) {
      this.h0 = value;
   }

   @Override
   public final boolean getHideRight() {
      return this.c8;
   }

   @Override
   public final void setHideRight(boolean value) {
      this.c8 = value;
   }

   @Override
   public final boolean getStrikethroughHorizontal() {
      return this.t2;
   }

   @Override
   public final void setStrikethroughHorizontal(boolean value) {
      this.t2 = value;
   }

   @Override
   public final boolean getStrikethroughVertical() {
      return this.s7;
   }

   @Override
   public final void setStrikethroughVertical(boolean value) {
      this.s7 = value;
   }

   @Override
   public final boolean getStrikethroughBottomLeftToTopRight() {
      return this.x8;
   }

   @Override
   public final void setStrikethroughBottomLeftToTopRight(boolean value) {
      this.x8 = value;
   }

   @Override
   public final boolean getStrikethroughTopLeftToBottomRight() {
      return this.n3;
   }

   @Override
   public final void setStrikethroughTopLeftToBottomRight(boolean value) {
      this.n3 = value;
   }

   public MathBorderBox(IMathElement element) {
      this.n5(element);
      this.n5 = new s7u();
   }

   public MathBorderBox(
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
      this(element);
      this.setHideTop(hideTop);
      this.setHideBottom(hideBottom);
      this.setHideLeft(hideLeft);
      this.setHideRight(hideRight);
      this.setStrikethroughHorizontal(strikethroughHorizontal);
      this.setStrikethroughVertical(strikethroughVertical);
      this.setStrikethroughBottomLeftToTopRight(strikethroughBottomLeftToTopRight);
      this.setStrikethroughTopLeftToBottomRight(strikethroughTopLeftToBottomRight);
   }

   @Override
   public final IMathElement[] getChildren() {
      return this.getBase() == null ? k5 : new IMathElement[]{this.getBase()};
   }

   @Override
   public final s7u getControlCharacterProperties() {
      return this.n5;
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
