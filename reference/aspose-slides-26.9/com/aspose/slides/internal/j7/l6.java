package com.aspose.slides.internal.j7;

import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;

public class l6 implements IDisposable {
   private final com.aspose.slides.internal.o9b.l6 n5;
   private com.aspose.slides.internal.o9b.l6 l6;

   public l6(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final com.aspose.slides.internal.o9b.l6 n5() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.o9b.l6 var1) {
      this.l6.dispose();
      this.l6 = var1;
   }

   @Override
   public final void dispose() {
      if (!j8.l6(this.n5, this.l6)) {
         this.l6.dispose();
      }
   }
}
