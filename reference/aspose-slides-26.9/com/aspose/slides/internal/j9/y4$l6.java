package com.aspose.slides.internal.j9;

import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;

class y4$l6 implements IDisposable {
   private static final com.aspose.slides.internal.v6g.c8<y4> n5 = new com.aspose.slides.internal.v6g.c8<>(null);
   private final y4 l6;
   private boolean k5;

   public y4$l6(y4 var1) {
      this.l6 = var1;
      this.k5 = this.n5(var1);
   }

   public final boolean n5(y4 var1) {
      if (n5.get() == null) {
         n5.set(var1);
         return true;
      }

      if (!j8.l6(n5.get(), var1)) {
         return false;
      }

      n5.set(var1);
      return true;
   }

   public final void n5() {
      if (j8.l6(this.l6, n5.get())) {
         n5.set(null);
      }
   }

   public final boolean l6() {
      return this.k5;
   }

   @Override
   public final void dispose() {
      if (n5.get() != null) {
         this.n5();
      }
   }
}
