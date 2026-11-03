package com.aspose.slides;

public final class MathBar extends MathElementBase implements IMathBar, q8r {
   private IMathElement u3;
   private int a6;
   final s7u n5;

   @Override
   public final IMathElement getBase() {
      return this.u3;
   }

   private void n5(IMathElement var1) {
      this.u3 = var1;
   }

   @Override
   public final int getPosition() {
      return this.a6;
   }

   @Override
   public final void setPosition(int value) {
      this.a6 = value;
   }

   public MathBar(IMathElement element) {
      this(element, 2);
   }

   public MathBar(IMathElement element, int position) {
      this.n5(element);
      this.setPosition(position);
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
