package com.aspose.slides.internal.d7;

import com.aspose.slides.internal.c9.f2;
import com.aspose.slides.internal.c9.j5;
import com.aspose.slides.internal.i3.v4;
import com.aspose.slides.internal.o4.m3;
import com.aspose.slides.internal.p5.u3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class k5 extends l6 {
   public k5(t4 var1) {
      super(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.y6.l6 var1) {
      com.aspose.slides.internal.m0.n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.m0.n5.class);
      if (var2 != null) {
         var2.t4();
         if (var2.n3() != null) {
            new f2().n5(var2.n3(), this.n5());
         }

         new j5().n5(var2.x8(), this.n5());

         for (int var3 = 0; var3 < var2.n5().size(); var3++) {
            if (((v4)var2.n5().n5(var3)).t9() != 65535) {
               v4 var4 = (v4)var2.n5().n5(var3);
               com.aspose.slides.internal.t7.l6 var5 = com.aspose.slides.internal.t7.k5.n5(var4.t9());
               if (var5 == null) {
                  throw new u3(d1.n5(new String[]{"Unable to write record:", s3.n5(m3.class, var4.t9())}));
               }

               long var6 = this.n5().getPosition();
               com.aspose.slides.internal.t7.l6.n5(var4, this.n5());
               var5.l6(var4, this.n5());
               long var8 = var6 + ((var4.e2() & 4294967295L) * 2L & 4294967295L) - this.n5().getPosition();
               if (var8 < 0L) {
                  throw new u3("Writed more bytes than RecordSize");
               }

               if (var8 > 0L) {
                  this.n5().seek(var8, 1);
               }
            }
         }
      } else {
         throw new u3("Metafile is not WMF image");
      }
   }
}
