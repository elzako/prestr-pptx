package com.aspose.slides.internal.y8;

import com.aspose.slides.internal.z0k.a0;
import com.aspose.slides.internal.z0k.t4;

public class k5 implements com.aspose.slides.internal.p6.k5 {
   private a0 n5;
   private t4 l6;

   @Override
   public final a0 n5() {
      return this.n5;
   }

   @Override
   public final void n5(a0 var1) {
      this.n5 = var1;
   }

   @Override
   public final void dispose() {
      this.l6 = null;
      if (this.n5 != null) {
         this.n5.dispose();
         this.n5 = null;
      }
   }
}
