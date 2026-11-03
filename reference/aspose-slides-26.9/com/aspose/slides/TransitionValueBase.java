package com.aspose.slides;

public class TransitionValueBase implements ITransitionValueBase {
   int n5;

   TransitionValueBase(int type) {
      this.n5 = type;
   }

   @Override
   public boolean equals(Object obj) {
      return com.aspose.slides.internal.v6g.k5.l6(obj, TransitionValueBase.class) ? this.n5((ITransitionValueBase)obj) : false;
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   boolean n5(ITransitionValueBase var1) {
      if (var1 == null) {
         return false;
      }

      TransitionValueBase var2 = (TransitionValueBase)var1;
      return this.n5 == var2.n5;
   }
}
