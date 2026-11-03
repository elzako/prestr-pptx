package com.aspose.slides;

public final class MathAccent extends MathElementBase implements IMathAccent, q8r {
   private IMathElement u3;
   private char a6;
   final s7u n5;

   @Override
   public final IMathElement getBase() {
      return this.u3;
   }

   private void n5(IMathElement var1) {
      this.u3 = var1;
   }

   @Override
   public final char getCharacter() {
      return this.a6;
   }

   @Override
   public final void setCharacter(char value) {
      if (value >= 768 && (879 >= value || value >= 8400) && 8431 < value) {
      }

      this.a6 = value;
   }

   public MathAccent(IMathElement element) {
      this(element, '̂');
   }

   public MathAccent(IMathElement element, char accentCharacter) {
      this.n5(element);
      this.setCharacter(accentCharacter);
      this.n5 = new s7u();
   }

   @Override
   public final IMathElement[] getChildren() {
      return this.getBase() == null ? k5 : new IMathElement[]{this.getBase()};
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
