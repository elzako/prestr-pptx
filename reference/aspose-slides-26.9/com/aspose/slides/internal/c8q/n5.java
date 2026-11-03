package com.aspose.slides.internal.c8q;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.t6q.h0;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.d1;

public final class n5 extends h0 {
   private static final u9 u3 = new u9("xmpDM:audioSampleRate", "xmpDM:good");

   public n5() {
      super("xmpDM", "http://ns.adobe.com/xmp/1.0/DynamicMedia/");
   }

   @Override
   public void n5(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("key", "DynamicMedia property could not be null");
      }

      switch (u3.n5(d1.u9(var1))) {
         case 0:
            this.u3(var1, var2);
            return;
         case 1:
            this.a6(var1, var2);
            return;
         default:
            super.n5(var1, var2);
      }
   }
}
