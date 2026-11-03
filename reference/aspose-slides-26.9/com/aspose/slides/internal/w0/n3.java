package com.aspose.slides.internal.w0;

import com.aspose.slides.exceptions.ArgumentNullException;

public class n3 extends l6 {
   private com.aspose.slides.internal.p1s.n5 n5;

   public n3(com.aspose.slides.internal.p1s.n5 var1) {
      super(0);
      this.n5(var1);
   }

   public final com.aspose.slides.internal.p1s.n5 l6() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5 = var1;
   }
}
