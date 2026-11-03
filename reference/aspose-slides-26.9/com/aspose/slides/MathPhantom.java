package com.aspose.slides;

public final class MathPhantom extends MathElementBase implements IMathPhantom, q8r {
   final s7u n5;
   private IMathElement u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;

   @Override
   public final IMathElement getBase() {
      return this.u3;
   }

   private void n5(IMathElement var1) {
      this.u3 = var1;
   }

   @Override
   public final boolean getShow() {
      return this.a6;
   }

   @Override
   public final void setShow(boolean value) {
      this.a6 = value;
   }

   @Override
   public final boolean getZeroWidth() {
      return this.u9;
   }

   @Override
   public final void setZeroWidth(boolean value) {
      this.u9 = value;
   }

   @Override
   public final boolean getZeroAsc() {
      return this.h0;
   }

   @Override
   public final void setZeroAsc(boolean value) {
      this.h0 = value;
   }

   @Override
   public final boolean getZeroDesc() {
      return this.c8;
   }

   @Override
   public final void setZeroDesc(boolean value) {
      this.c8 = value;
   }

   @Override
   public final boolean getTransp() {
      return this.t2;
   }

   @Override
   public final void setTransp(boolean value) {
      this.t2 = value;
   }

   @Override
   public final s7u getControlCharacterProperties() {
      return this.n5;
   }

   public MathPhantom(IMathElement element) {
      this.n5(element);
      this.n5 = new s7u();
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }

   @Override
   public final IMathElement[] getChildren() {
      return super.getChildren(this.getBase());
   }
}
