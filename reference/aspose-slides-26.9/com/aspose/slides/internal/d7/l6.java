package com.aspose.slides.internal.d7;

import com.aspose.slides.internal.z0k.t4;

public abstract class l6 {
   private t4 n5;
   private boolean l6 = false;

   public l6(t4 var1) {
      this.n5 = var1;
   }

   public final t4 n5() {
      return this.n5;
   }

   public final void l6(com.aspose.slides.internal.y6.l6 var1) {
      this.n5(var1);
      if (this.l6 && this.n5 != null) {
         this.n5.close();
      }
   }

   protected abstract void n5(com.aspose.slides.internal.y6.l6 var1);
}
