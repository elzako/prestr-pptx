package com.aspose.slides;

public class ShredTransition extends TransitionValueBase implements IShredTransition {
   private int l6;
   private int k5;

   ShredTransition(int type) {
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
   public final int getPattern() {
      return this.k5;
   }

   @Override
   public final void setPattern(int value) {
      this.k5 = value;
   }

   @Override
   boolean n5(ITransitionValueBase var1) {
      return com.aspose.slides.internal.v6g.k5.l6(var1, ShredTransition.class) ? this.n5((IShredTransition)var1) : false;
   }

   final boolean n5(IShredTransition var1) {
      if (var1 == null) {
         return false;
      }

      ShredTransition var2 = (ShredTransition)var1;
      return this.n5 == var2.n5 && this.l6 == var2.l6 && this.k5 == var2.k5;
   }
}
