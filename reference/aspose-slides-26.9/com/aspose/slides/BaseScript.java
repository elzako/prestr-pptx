package com.aspose.slides;

public abstract class BaseScript extends MathElementBase implements q8r {
   private final IMathElement u3;
   final s7u n5;

   public final IMathElement getBase() {
      return this.u3;
   }

   protected BaseScript(IMathElement scriptBase) {
      this.u3 = scriptBase;
      this.n5 = new s7u();
   }

   @Override
   public final s7u getControlCharacterProperties() {
      return this.n5;
   }
}
