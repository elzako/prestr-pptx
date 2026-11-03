package com.aspose.slides;

public class OrientationTransition extends TransitionValueBase implements IOrientationTransition {
   private byte l6;

   OrientationTransition(int type) {
      super(type);
   }

   @Override
   public final byte getDirection() {
      return this.l6;
   }

   @Override
   public final void setDirection(byte value) {
      this.l6 = value;
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, OrientationTransition.class) ? this.n5((IOrientationTransition)var1) : false;
   }

   final boolean n5(IOrientationTransition var1) {
      if (var1 == null) {
         return false;
      }

      OrientationTransition var2 = (OrientationTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6;
   }
}
