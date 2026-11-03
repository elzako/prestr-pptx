package com.aspose.slides;

public class LeftRightDirectionTransition extends TransitionValueBase implements ILeftRightDirectionTransition {
   private int l6;

   LeftRightDirectionTransition(int type) {
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
      return com.aspose.slides.internal.v6g.k5.l6(var1, LeftRightDirectionTransition.class) ? this.n5((ILeftRightDirectionTransition)var1) : false;
   }

   final boolean n5(ILeftRightDirectionTransition var1) {
      if (var1 == null) {
         return false;
      }

      LeftRightDirectionTransition var2 = (LeftRightDirectionTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6;
   }
}
