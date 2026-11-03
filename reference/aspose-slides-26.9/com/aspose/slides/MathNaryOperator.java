package com.aspose.slides;

public final class MathNaryOperator extends MathElementBase implements IMathNaryOperator, q8r {
   private IMathElement n5;
   private b5i u3;
   private m0g a6;
   private m0g u9;

   @Override
   public final IMathElement getBase() {
      return this.n5;
   }

   private void n5(IMathElement var1) {
      this.n5 = var1;
   }

   @Override
   public final IMathElement getSubscript() {
      return this.a6.l6();
   }

   @Override
   public final IMathElement getSuperscript() {
      return this.u9.l6();
   }

   @Override
   public final char getOperator() {
      return this.u3.getOperator();
   }

   @Override
   public final void setOperator(char value) {
      this.u3.setOperator(value);
   }

   @Override
   public final int getLimitLocation() {
      return this.u3.getLimitLocation();
   }

   @Override
   public final void setLimitLocation(int value) {
      this.u3.setLimitLocation(value);
   }

   @Override
   public final boolean getGrowToMatchOperandHeight() {
      return this.u3.getGrowToMatchOperandHeight();
   }

   @Override
   public final void setGrowToMatchOperandHeight(boolean value) {
      this.u3.setGrowToMatchOperandHeight(value);
   }

   @Override
   public final boolean getHideSubscript() {
      return this.u3.getHideSubscript();
   }

   @Override
   public final void setHideSubscript(boolean value) {
      this.u3.setHideSubscript(value);
   }

   @Override
   public final boolean getHideSuperscript() {
      return this.u3.getHideSuperscript();
   }

   @Override
   public final void setHideSuperscript(boolean value) {
      this.u3.setHideSuperscript(value);
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getBase(), this.getSubscript(), this.getSuperscript());
   }

   @Override
   public final s7u getControlCharacterProperties() {
      return this.u3.l6();
   }

   MathNaryOperator(IMathElement baseArgument, IMathElement lowerLimit, IMathElement upperLimit, IMathNaryOperatorProperties properties) {
      this.n5(baseArgument);
      this.a6 = m0g.n5(lowerLimit, (byte)-1);
      this.u9 = m0g.n5(upperLimit, (byte)-1);
      if (this.a6 != null && this.a6.l6() != null) {
         ((MathElementBase)this.a6.l6()).n5(this);
      }

      this.u3 = properties != null ? new b5i(properties) : new b5i();
   }

   public MathNaryOperator(char operatorSymbol, IMathElement baseArgument, IMathElement lowerLimit, IMathElement upperLimit) {
      this(baseArgument, lowerLimit, upperLimit, new b5i(operatorSymbol, lowerLimit == null, upperLimit == null));
   }

   public MathNaryOperator(char operatorSymbol, IMathElement baseArgument, IMathElement lowerLimit) {
      this(operatorSymbol, baseArgument, lowerLimit, null);
   }

   public MathNaryOperator(char operatorSymbol, IMathElement baseArgument) {
      this(operatorSymbol, baseArgument, null, null);
   }

   final boolean l6() {
      return this.u3.n5();
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
