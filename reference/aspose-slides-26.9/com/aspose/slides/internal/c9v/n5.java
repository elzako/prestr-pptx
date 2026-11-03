package com.aspose.slides.internal.c9v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.t6q.h0;
import com.aspose.slides.internal.t6q.l6;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.d1;

public final class n5 extends h0 {
   private static final u9 u3 = new u9("dc:contributor", "dc:date");

   public n5() {
      super("dc", "http://purl.org/dc/elements/1.1/");
   }

   @Override
   public void n5(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("key", "DublinCore property could not be null");
      }

      switch (u3.n5(var1)) {
         case 0:
            l6 var3 = new l6(0, new String[]{var2});
            this.n5(var1, var3);
            return;
         case 1:
            this.k5(var1, var2);
            return;
         default:
            super.n5(var1, var2);
      }
   }
}
