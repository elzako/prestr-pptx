package com.aspose.slides;

public final class MathBox extends MathElementBase implements IMathBox, q8r {
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private byte c8;
   final s7u n5;
   private m0g t2;

   @Override
   public final IMathElement getBase() {
      return this.t2.l6();
   }

   @Override
   public final boolean getOperatorEmulator() {
      return this.u3;
   }

   @Override
   public final void setOperatorEmulator(boolean value) {
      this.u3 = value;
   }

   @Override
   public final boolean getNoBreak() {
      return this.a6;
   }

   @Override
   public final void setNoBreak(boolean value) {
      this.a6 = value;
   }

   @Override
   public final boolean getDifferential() {
      return this.u9;
   }

   @Override
   public final void setDifferential(boolean value) {
      this.u9 = value;
   }

   @Override
   public final boolean getAlignmentPoint() {
      return this.h0;
   }

   @Override
   public final void setAlignmentPoint(boolean value) {
      this.h0 = value;
   }

   @Override
   public final byte getExplicitBreak() {
      return this.c8;
   }

   @Override
   public final void setExplicitBreak(byte value) {
      this.c8 = value;
   }

   public MathBox(IMathElement element) {
      this.t2 = m0g.n5(element, (byte)0);
      this.setOperatorEmulator(false);
      this.setNoBreak(true);
      this.setDifferential(false);
      this.setAlignmentPoint(false);
      this.setExplicitBreak((byte)0);
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
