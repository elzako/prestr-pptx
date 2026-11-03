package com.aspose.slides;

public final class MathFraction extends MathElementBase implements IMathFraction, q8r {
   private int u3;
   private IMathElement a6;
   private IMathElement u9;
   final s7u n5;

   @Override
   public final int getFractionType() {
      return this.u3;
   }

   @Override
   public final void setFractionType(int value) {
      this.u3 = value;
   }

   @Override
   public final IMathElement getNumerator() {
      return this.a6;
   }

   private void n5(IMathElement var1) {
      this.a6 = var1;
   }

   @Override
   public final IMathElement getDenominator() {
      return this.u9;
   }

   private void l6(IMathElement var1) {
      this.u9 = var1;
   }

   public MathFraction(IMathElement numerator, IMathElement denominator, int fractionType) {
      this.n5(numerator);
      this.l6(denominator);
      this.setFractionType(fractionType);
      this.n5 = new s7u();
   }

   public MathFraction(IMathElement numerator, IMathElement denominator) {
      this(numerator, denominator, 1);
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getNumerator(), this.getDenominator());
   }

   final boolean l6() {
      return this.getFractionType() == 1 && this.n5.n5();
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
