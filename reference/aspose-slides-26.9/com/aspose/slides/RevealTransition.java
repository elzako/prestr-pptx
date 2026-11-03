package com.aspose.slides;

public class RevealTransition extends TransitionValueBase implements IRevealTransition {
   private int l6;
   private boolean k5;

   RevealTransition(int type) {
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
   public final boolean getThroughBlack() {
      return this.k5;
   }

   @Override
   public final void setThroughBlack(boolean value) {
      this.k5 = value;
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, RevealTransition.class) ? this.n5((IRevealTransition)var1) : false;
   }

   final boolean n5(IRevealTransition var1) {
      if (var1 == null) {
         return false;
      }

      RevealTransition var2 = (RevealTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6 && this.k5 == var2.k5;
   }
}
