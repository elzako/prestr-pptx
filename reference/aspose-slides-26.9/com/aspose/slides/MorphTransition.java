package com.aspose.slides;

public class MorphTransition extends TransitionValueBase implements IMorphTransition {
   private int l6;

   MorphTransition(int type) {
      super(type);
   }

   @Override
   public final int getMorphType() {
      return this.l6;
   }

   @Override
   public final void setMorphType(int value) {
      this.l6 = value;
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, MorphTransition.class) ? this.n5((IMorphTransition)var1) : false;
   }

   final boolean n5(IMorphTransition var1) {
      if (var1 == null) {
         return false;
      }

      MorphTransition var2 = (MorphTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6;
   }
}
