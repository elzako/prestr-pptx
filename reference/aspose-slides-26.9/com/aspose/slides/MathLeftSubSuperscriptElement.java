package com.aspose.slides;

public final class MathLeftSubSuperscriptElement extends BaseScript implements IMathLeftSubSuperscriptElement {
   private final IMathElement u3;
   private final IMathElement a6;

   public MathLeftSubSuperscriptElement(IMathElement baseArg, IMathElement subScript, IMathElement superScript) {
      super(baseArg);
      this.u3 = subScript;
      this.a6 = superScript;
   }

   @Override
   public final IMathElement getSubscript() {
      return this.u3;
   }

   @Override
   public final IMathElement getSuperscript() {
      return this.a6;
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getBase(), this.getSubscript(), this.getSuperscript());
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
