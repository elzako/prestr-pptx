package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class z7<TParentElement> extends w2<TParentElement> {
   private int n5;

   public z7(List<TParentElement> var1, int var2, int var3) {
      super(new com.aspose.slides.internal.r4.u3<>(var1, var2));
      this.n5 = var3 - var2;
   }

   public z7(List<TParentElement> var1) {
      this(var1, 0, var1.size());
   }

   @Override
   protected boolean u3() {
      if (this.n5 > 0) {
         return super.u3();
      }

      this.h0();
      return false;
   }

   @Override
   public j8 a6() {
      this.n5--;
      return super.a6();
   }

   @Override
   protected y2 n5(Object var1) {
      return ((v0)var1).m3();
   }

   @Override
   protected j8 l6(Object var1) {
      return ((v0)var1).k7();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j8 k5() {
      return this.a6();
   }

}
