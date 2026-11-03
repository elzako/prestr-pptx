package com.aspose.slides;

public final class MathLimit extends MathElementBase implements IMathLimit, q8r {
   private boolean u3;
   final s7u n5;
   private IMathElement a6;
   private m0g u9;

   @Override
   public final IMathElement getBase() {
      return this.a6;
   }

   @Override
   public final IMathElement getLimit() {
      return this.u9.l6();
   }

   @Override
   public final boolean getUpperLimit() {
      return this.u3;
   }

   @Override
   public final void setUpperLimit(boolean value) {
      this.u3 = value;
   }

   public MathLimit(IMathElement baseArg, IMathElement limit, boolean upperLimit) {
      this.a6 = baseArg;
      this.u9 = m0g.n5(limit, (byte)-1);
      this.setUpperLimit(upperLimit);
      this.n5 = new s7u();
   }

   public MathLimit(IMathElement baseArg, IMathElement limit) {
      this(baseArg, limit, false);
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getBase(), this.getLimit());
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
