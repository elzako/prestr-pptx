package com.aspose.slides.internal.r0w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.t6q.h0;
import com.aspose.slides.ms.System.d1;

public final class l6 extends h0 {
   public l6() {
      super("pdf", "http://ns.adobe.com/pdf/1.3/");
   }

   @Override
   public void n5(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("key", "Pdf property could not be null");
      }

      if (com.aspose.slides.internal.r0w.n5.u3.equals(d1.u9(var1))) {
         this.a6(var1, var2);
      } else {
         super.n5(var1, var2);
      }
   }
}
