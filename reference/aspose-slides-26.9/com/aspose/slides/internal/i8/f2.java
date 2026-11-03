package com.aspose.slides.internal.i8;

import com.aspose.slides.internal.i0.a7;

public class f2 extends e5 {
   private final long n5;

   public f2(long var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.h2 var2 = new com.aspose.slides.internal.i0.h2();
      if ((this.n5 & 2L) > 0L) {
         var2.n5((a7)new v3().n5(var1));
      }

      com.aspose.slides.internal.i0.c8[] var3 = new com.aspose.slides.internal.i0.c8[2];
      if ((this.n5 & 4L) == 0L) {
         if ((this.n5 & 8L) == 0L) {
            if ((this.n5 & 16L) == 0L) {
            }
         } else if ((this.n5 & 16L) == 0L) {
            var3[1] = (com.aspose.slides.internal.i0.s7)new a6().n5(var1);
         } else {
            var3[0] = (com.aspose.slides.internal.i0.s7)new a6().n5(var1);
            var3[1] = (com.aspose.slides.internal.i0.s7)new a6().n5(var1);
         }
      } else if ((this.n5 & 8L) == 0L) {
         if ((this.n5 & 16L) == 0L) {
            var3[0] = (com.aspose.slides.internal.i0.t2)new u3().n5(var1);
         } else {
            var3[0] = (com.aspose.slides.internal.i0.s7)new a6().n5(var1);
         }
      }

      var2.n5(var3);
      return var2;
   }
}
