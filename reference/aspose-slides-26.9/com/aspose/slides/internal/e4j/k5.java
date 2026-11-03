package com.aspose.slides.internal.e4j;

import com.aspose.slides.internal.w2a.x8;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class k5 extends u9 {
   public k5(com.aspose.slides.internal.f2i.n5 var1) {
      super(var1);
   }

   @Override
   public boolean n5(boolean var1) {
      boolean var2 = true;
      byte var3 = 2;
      byte var4 = 8;
      if ((this.u3 == 7 || this.u3 == 6) && (this.n5.length != 1 || (this.n5[0] & 65535) < 2 || (this.n5[0] & 65535) > 8)) {
         if (var1) {
            return false;
         }

         String var5 = d1.n5(
            "Invalid bits per sample combination {0} for Photometric={1} and Compression={2}. The bits per sample should be [{3}-{4}]",
            n5(this.n5),
            s3.n5(x8.class, this.l6),
            s3.n5(com.aspose.slides.internal.w2a.a6.class, this.u3),
            2,
            8
         );
         throw new com.aspose.slides.internal.h6t.u3(var5, 7);
      } else {
         return super.n5(var1);
      }
   }
}
