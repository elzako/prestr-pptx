package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.b8u.x8;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.y4;
import com.aspose.slides.ms.System.d1;

public abstract class l6 extends n5 {
   protected l6(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
      if (this.u3 != null && this.a6 != null) {
         if (this.u3.length != this.a6.length) {
            throw new com.aspose.slides.internal.h6t.u3(
               "Cannot read image data. The strip/tile offset counts and strip/tile byte counts array lengths are not equal."
            );
         }
      } else {
         throw new com.aspose.slides.internal.h6t.u3("Cannot read image data. The strip/tile offset counts or strip/tile byte counts were undefined.");
      }
   }

   public abstract void n5(com.aspose.slides.internal.v6s.u3 var1, y2 var2, x8 var3);

   public void n5(long var1) {
      long var3 = com.aspose.slides.internal.r1x.y4.n5(var1, this.c8().n3());
      if (var3 > 1L) {
         throw new com.aspose.slides.internal.z3b.h0(
            d1.n5("The required amount of memory {0} exceeds memory allocation limit {1} for TIFF reader", var1, this.c8().n3()), var3
         );
      }
   }
}
