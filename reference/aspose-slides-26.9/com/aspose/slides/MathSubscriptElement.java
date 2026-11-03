package com.aspose.slides;

public final class MathSubscriptElement extends BaseScript implements IMathSubscriptElement {
   private final m0g u3;

   public MathSubscriptElement(IMathElement baseArg, IMathElement subScript) {
      super(baseArg);
      this.u3 = m0g.n5(subScript, (byte)-1);
   }

   @Override
   public final IMathElement getSubscript() {
      return this.u3.l6();
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getBase(), this.getSubscript());
   }

   final m0g l6() {
      return this.u3;
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
