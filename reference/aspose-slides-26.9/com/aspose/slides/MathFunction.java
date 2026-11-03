package com.aspose.slides;

public final class MathFunction extends MathElementBase implements IMathFunction, q8r {
   private IMathElement u3;
   private IMathElement a6;
   final s7u n5;

   @Override
   public final IMathElement getName() {
      return this.u3;
   }

   private void n5(IMathElement var1) {
      this.u3 = var1;
   }

   @Override
   public final IMathElement getBase() {
      return this.a6;
   }

   private void l6(IMathElement var1) {
      this.a6 = var1;
   }

   public MathFunction(IMathElement funcName, IMathElement baseArgument) {
      this.n5(funcName);
      this.l6(baseArgument);
      this.n5 = new s7u();
   }

   public MathFunction(String funcName, IMathElement baseArgument) {
      this(new MathematicalText(funcName), baseArgument);
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getName(), this.getBase());
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
