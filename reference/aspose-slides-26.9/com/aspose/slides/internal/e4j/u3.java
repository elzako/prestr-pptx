package com.aspose.slides.internal.e4j;

import com.aspose.slides.internal.w2a.x8;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class u3 extends u9 {
   public u3(com.aspose.slides.internal.f2i.n5 var1) {
      super(var1);
   }

   @Override
   public boolean n5(boolean var1) {
      byte var2 = 3;
      byte var3 = 2;
      byte var4 = 8;
      if ((this.u3 == 7 || this.u3 == 6)
         && (this.n5.length != 3 || this.n5[0] != this.n5[1] || this.n5[0] != this.n5[2] || (this.n5[0] & 65535) < 2 || (this.n5[0] & 65535) > 8)) {
         if (var1) {
            return false;
         }

         String var5 = d1.n5(
            d1.n5(new String[]{
               "Invalid bits per sample combination {0} for Photometric={1} and Compression={2}. ",
               "The bits per sample should be [8,8,8], [7,7,7], [6,6,6], [5,5,5], [4,4,4], [3,3,3] or [2,2,2]"
            }),new Object[]{
            n5(this.n5),
            s3.n5(x8.class, this.l6),
            s3.n5(com.aspose.slides.internal.w2a.a6.class, this.u3)
         });
         throw new com.aspose.slides.internal.h6t.u3(var5, 5);
      } else {
         return super.n5(var1);
      }
   }
}
