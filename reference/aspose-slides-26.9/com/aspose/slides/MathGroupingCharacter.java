package com.aspose.slides;

public final class MathGroupingCharacter extends MathElementBase implements IMathGroupingCharacter, q8r {
   private char u3;
   private int a6;
   private int u9;
   final s7u n5;
   private m0g h0;

   @Override
   public final IMathElement getBase() {
      return this.h0.l6();
   }

   @Override
   public final char getCharacter() {
      return this.u3;
   }

   @Override
   public final void setCharacter(char value) {
      this.u3 = value;
   }

   @Override
   public final int getPosition() {
      return this.a6;
   }

   @Override
   public final void setPosition(int value) {
      this.a6 = value;
   }

   @Override
   public final int getVerticalJustification() {
      return this.u9;
   }

   @Override
   public final void setVerticalJustification(int value) {
      this.u9 = value;
   }

   public MathGroupingCharacter(IMathElement element) {
      this(element, '⏟', 2, 1);
   }

   public MathGroupingCharacter(IMathElement element, char character, int position, int verticalJustification) {
      this.h0 = m0g.n5(element, (byte)0);
      this.setCharacter(character);
      this.setPosition(position);
      this.setVerticalJustification(verticalJustification);
      this.n5 = new s7u();
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getBase());
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
