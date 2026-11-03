package com.aspose.slides.internal.u6p;

import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.p4l.e2;
import com.aspose.slides.internal.p4l.y4;
import com.aspose.slides.ms.System.y8;

class u3 extends k5 {
   private e2[] u3;

   public u3(y8 var1, s3 var2) {
      super(var1);
      this.u3 = com.aspose.slides.internal.h3d.u9.n5(var1, var2.k5());
   }

   @Override
   public void n5(h0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      for (e2 var6 : this.u3) {
         y8 var7 = ((y4)var6).a6();

         while (var7.s3()) {
            var7 = var7.h0();
         }

         var1.n5(var2, var7.t4());
      }
   }

   @Override
   public void n5(h0 var1, com.aspose.slides.internal.z0k.l6 var2, boolean var3) {
      var2.l6(this.u3.length);

      for (e2 var7 : this.u3) {
         var2.n5(var7.s7());
      }

      if (var3) {
         for (e2 var14 : this.u3) {
            h0.n5(var2, ((y4)var14).a6());
         }

         for (e2 var15 : this.u3) {
            var1.l6(var2, ((y4)var15).a6());
         }
      }
   }

   @Override
   public void n5(h0 var1, com.aspose.slides.internal.z0k.l6 var2, Object var3) {
      Object[] var4 = com.aspose.slides.internal.h3d.u9.n5(var3, this.u3);

      for (int var5 = 0; var5 < var4.length; var5++) {
         var1.n5(var2, ((y4)this.u3[var5]).a6(), var4[var5]);
      }
   }
}
