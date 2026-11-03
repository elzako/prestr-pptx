package com.aspose.slides;

public final class MathRightSubSuperscriptElement extends BaseScript implements IMathRightSubSuperscriptElement {
   private boolean u3;
   private final IMathElement a6;
   private final IMathElement u9;

   public MathRightSubSuperscriptElement(IMathElement baseArg, IMathElement subScript, IMathElement superScript) {
      super(baseArg);
      this.a6 = subScript;
      this.u9 = superScript;
   }

   @Override
   public final IMathElement getSubscript() {
      return this.a6;
   }

   @Override
   public final IMathElement getSuperscript() {
      return this.u9;
   }

   @Override
   public final boolean getAlignScripts() {
      return this.u3;
   }

   @Override
   public final void setAlignScripts(boolean value) {
      this.u3 = value;
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
