package com.aspose.slides;

public class SplitTransition extends TransitionValueBase implements ISplitTransition {
   private int l6;
   private byte k5;

   SplitTransition(int type) {
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
   public final byte getOrientation() {
      return this.k5;
   }

   @Override
   public final void setOrientation(byte value) {
      this.k5 = value;
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, SplitTransition.class) ? this.n5((ISplitTransition)var1) : false;
   }

   final boolean n5(ISplitTransition var1) {
      if (var1 == null) {
         return false;
      }

      SplitTransition var2 = (SplitTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6 && this.k5 == var2.k5;
   }
}
