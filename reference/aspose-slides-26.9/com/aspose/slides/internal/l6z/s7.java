package com.aspose.slides.internal.l6z;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class s7 {
   private final int n5;
   private final com.aspose.slides.internal.x1.t2 l6;
   private String k5;

   public s7(com.aspose.slides.internal.x1.t2 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.n5 = var2;
      this.l6 = var1;
      this.n5();
   }

   public void n5(com.aspose.slides.internal.x1.t2 var1) {
      if (!var1.a6(this.l6)) {
      }
   }

   private void n5() {
      com.aspose.slides.internal.x1.c8 var1 = this.l6.u3("\u0003VBFrame");
      com.aspose.slides.internal.x1.u9 var2 = var1 instanceof com.aspose.slides.internal.x1.u9 ? (com.aspose.slides.internal.x1.u9)var1 : null;
      if (var2 == null) {
         throw new InvalidOperationException();
      }

      this.k5 = com.aspose.slides.internal.l6z.k5.n5(var2.n5(), this.n5);
   }
}
