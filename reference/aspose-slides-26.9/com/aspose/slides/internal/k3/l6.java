package com.aspose.slides.internal.k3;

import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public abstract class l6 implements IDisposable {
   private t4 n5;

   public l6(t4 var1) {
      this.n5 = var1;
   }

   public final t4 k5() {
      return this.n5;
   }

   @Override
   public final void dispose() {
      if (this.n5 != null) {
         this.n5.dispose();
      }
   }
}
