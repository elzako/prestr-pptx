package com.aspose.slides.internal.d7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.c5.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class n5 extends l6 {
   public n5(t4 var1) {
      super(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.y6.l6 var1) {
      com.aspose.slides.internal.d9.n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.d9.n5.class);
      if (var2 != null) {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(this.n5());

         for (int var4 = 0; var4 < var2.n5().size(); var4++) {
            s9 var5 = (s9)var2.n5().n5(var4);
            com.aspose.slides.internal.s2.n5 var6 = com.aspose.slides.internal.s2.l6.n5(var5.c4());
            if (var6 == null) {
               throw new com.aspose.slides.internal.p5.n5(d1.n5(new String[]{"Unable to write record:", s3.n5(e2.class, var5.c4())}));
            }

            if (var5.y1() != var3.n5().getPosition()) {
               throw new Exception(d1.n5(new String[]{"Invalid writer position. Record index=", a3.l6(var4)}));
            }

            var6.l6(var5, var3);
            int var7 = (int)(var5.y1() + var5.y2() - var3.n5().getPosition());
            if (var7 > 0) {
               var3.n5().seek(var7, 1);
            }
         }
      } else {
         throw new com.aspose.slides.internal.p5.n5("Metafile is not EMF image");
      }
   }
}
