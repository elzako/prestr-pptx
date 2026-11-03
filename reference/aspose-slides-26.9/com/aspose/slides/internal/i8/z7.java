package com.aspose.slides.internal.i8;

import com.aspose.slides.internal.i0.a7;

public class z7 extends e5 {
   private final long n5;

   public z7(long var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.y0 var2 = new com.aspose.slides.internal.i0.y0();
      if ((this.n5 & 2L) == 2L) {
         var2.n5((a7)new v3().n5(var1));
      }

      com.aspose.slides.internal.i0.c8 var3 = null;
      if ((this.n5 & 4L) != 0L || (this.n5 & 8L) != 0L) {
         if ((this.n5 & 4L) == 4L) {
            var3 = (com.aspose.slides.internal.i0.t2)new u3().n5(var1);
         } else if ((this.n5 & 8L) == 8L) {
            var3 = (com.aspose.slides.internal.i0.s7)new a6().n5(var1);
         }
      }

      var2.n5(var3);
      if ((this.n5 & 64L) == 64L) {
         var2.n5((com.aspose.slides.internal.i0.s3)new r4().n5(var1));
      }

      return var2;
   }
}
