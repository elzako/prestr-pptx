package com.aspose.slides;

public final class MathSuperscriptElement extends BaseScript implements IMathSuperscriptElement {
   private final m0g u3;

   @Override
   public final IMathElement getSuperscript() {
      return this.u3.l6();
   }

   public MathSuperscriptElement(IMathElement baseArg, IMathElement superScript) {
      super(baseArg);
      this.u3 = m0g.n5(superScript, (byte)-1);
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getBase(), this.getSuperscript());
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
