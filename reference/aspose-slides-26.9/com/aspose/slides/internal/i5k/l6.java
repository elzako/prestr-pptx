package com.aspose.slides.internal.i5k;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.t6q.h0;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;

public class l6 extends h0 {
   private static final u9 u3 = new u9("xmp:createdate", "xmp:metadatadate", "xmp:modifyDate", "xmp:identifier", "xmp:rating");

   public l6() {
      super("xmp", "http://ns.adobe.com/xap/1.0/");
   }

   public l6(String var1, String var2) {
      super(var1, var2);
   }

   @Override
   public void n5(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("key", "Metadata key is not provided");
      }

      switch (u3.n5(d1.u9(var1))) {
         case 0:
         case 1:
         case 2:
            this.k5(var1, var2);
            return;
         case 3:
            com.aspose.slides.internal.t6q.l6 var3 = new com.aspose.slides.internal.t6q.l6(0);
            var3.n5(var2);
            this.n5(var1, var3);
            return;
         case 4:
            this.u3(var1, var2);
            return;
         default:
            super.n5(var1, var2);
      }
   }

   public void n5(j5 var1) {
      this.n5(com.aspose.slides.internal.i5k.n5.u9, new com.aspose.slides.internal.l3a.l6(var1.m3()));
   }
}
