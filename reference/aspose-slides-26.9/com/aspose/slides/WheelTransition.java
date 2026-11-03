package com.aspose.slides;

public class WheelTransition extends TransitionValueBase implements IWheelTransition {
   private long l6;

   WheelTransition(int type) {
      super(type);
   }

   @Override
   public final long getSpokes() {
      return this.l6;
   }

   @Override
   public final void setSpokes(long value) {
      this.l6 = value;
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, WheelTransition.class) ? this.n5((IWheelTransition)var1) : false;
   }

   final boolean n5(IWheelTransition var1) {
      if (var1 == null) {
         return false;
      }

      WheelTransition var2 = (WheelTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6;
   }
}
