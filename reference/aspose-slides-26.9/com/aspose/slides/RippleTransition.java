package com.aspose.slides;

public class RippleTransition extends TransitionValueBase implements IRippleTransition {
   private int l6;

   RippleTransition(int type) {
      super(type);
   }

   @Override
   public final int getDirection() {
      return this.l6;
   }

   @Override
   public final void setDirection(int value) {
      this.l6 = value;
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, RippleTransition.class) ? this.n5((IRippleTransition)var1) : false;
   }

   final boolean n5(IRippleTransition var1) {
      if (var1 == null) {
         return false;
      }

      RippleTransition var2 = (RippleTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6;
   }
}
