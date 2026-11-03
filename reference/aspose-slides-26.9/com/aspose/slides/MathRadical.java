package com.aspose.slides;

public final class MathRadical extends MathElementBase implements IMathRadical, q8r {
   private boolean u3;
   final s7u n5;
   private final IMathElement a6;
   private m0g u9;

   @Override
   public final IMathElement getBase() {
      return this.a6;
   }

   @Override
   public final IMathElement getDegree() {
      return this.u9.l6();
   }

   @Override
   public final boolean getHideDegree() {
      return this.u3;
   }

   @Override
   public final void setHideDegree(boolean value) {
      this.u3 = value;
   }

   final boolean l6() {
      return !this.getHideDegree() && this.n5.n5();
   }

   @Override
   public final s7u getControlCharacterProperties() {
      return this.n5;
   }

   public MathRadical(IMathElement baseArgument, IMathElement degreeArgument) {
      this.a6 = baseArgument;
      this.u9 = m0g.n5(degreeArgument, (byte)-2);
      this.n5 = new s7u();
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getBase(), this.getDegree());
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
