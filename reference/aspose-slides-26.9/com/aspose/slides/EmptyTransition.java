package com.aspose.slides;

public class EmptyTransition extends TransitionValueBase implements IEmptyTransition {
   EmptyTransition(int type) {
      super(type);
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, EmptyTransition.class) ? this.n5((IEmptyTransition)var1) : false;
   }

   final boolean n5(IEmptyTransition var1) {
      if (var1 == null) {
         return false;
      }

      EmptyTransition var2 = (EmptyTransition)var1;
      return this.n5 == var2.n5;
   }
}
