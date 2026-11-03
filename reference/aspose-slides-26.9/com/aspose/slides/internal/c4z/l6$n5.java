package com.aspose.slides.internal.c4z;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.internal.u2w.u9$n5;
import com.aspose.slides.ms.System.d1;

class l6$n5 implements t9 {
   private final u9$n5 n5;
   private final z6 l6;

   public l6$n5(u9$n5 var1, z6 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void n5(y2 var1, byte[] var2, j5 var3, j5 var4) {
      this.n5(var1.n3(), var2, var3.k5(), var4.k5(), null);
   }

   public final void n5(y2 var1, byte[] var2, j5 var3, j5 var4, d2 var5) {
      if (!v4.n5(this.l6.n5(), v4.l6()) && !v4.n5(this.l6.n5(), v4.k5())) {
         if (!v4.n5(this.l6.n5(), v4.l6(16))) {
            throw new NotSupportedException(d1.n5("PixelDataFormat {0} not supported the raw loader", new Object[]{this.l6.n5()}));
         }

         this.n5.n5(var1.n3(), var2, this.l6, var3.k5(), var4.k5());
      } else {
         this.n5.n5(var1.n3(), var2, this.l6, var3.k5(), var4.k5());
      }
   }
}
