package com.aspose.slides.internal.c3g;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.t6q.h0;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.d1;

public final class n5 extends h0 {
   private static final u9 u3 = new u9("xmpRights:marked", "xmpRights:usageterms");

   public n5() {
      super("xmpRights", "http://ns.adobe.com/xap/1.0/rights/");
   }

   @Override
   public void n5(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("key", "Key should be provided for XMP Rights Management namespace");
      }

      switch (u3.n5(d1.u9(var1))) {
         case 0:
            this.n5(var1, new com.aspose.slides.internal.l3a.n5(var2));
            return;
         case 1:
            super.n5(var1, var2);
            return;
         default:
            super.n5(var1, var2);
      }
   }
}
