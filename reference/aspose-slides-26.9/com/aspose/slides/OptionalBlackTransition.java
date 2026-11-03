package com.aspose.slides;

public class OptionalBlackTransition extends TransitionValueBase implements IOptionalBlackTransition {
   private boolean l6 = false;

   OptionalBlackTransition(int type) {
      super(type);
   }

   @Override
   public final boolean getFromBlack() {
      return this.l6;
   }

   @Override
   public final void setFromBlack(boolean value) {
      this.l6 = value;
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, OptionalBlackTransition.class) ? this.n5((IOptionalBlackTransition)var1) : false;
   }

   final boolean n5(IOptionalBlackTransition var1) {
      if (var1 == null) {
         return false;
      }

      OptionalBlackTransition var2 = (OptionalBlackTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6;
   }
}
