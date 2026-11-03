package com.aspose.slides.internal.u0b;

class i1 {
   private final int n5;

   public i1(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.f4l.a5 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.a5 var2 = new com.aspose.slides.internal.f4l.a5();
      if ((this.n5 & 2) > 0) {
         var2.n5(j4.n5(var1));
      }

      com.aspose.slides.internal.f4l.h0[] var3 = new com.aspose.slides.internal.f4l.h0[2];
      if ((this.n5 & 4) == 0) {
         if ((this.n5 & 8) == 0) {
            if ((this.n5 & 16) == 0) {
            }
         } else if ((this.n5 & 16) == 0) {
            var3[1] = a6.n5(var1);
         } else {
            var3[0] = a6.n5(var1);
            var3[1] = a6.n5(var1);
         }
      } else if ((this.n5 & 8) == 0) {
         if ((this.n5 & 16) == 0) {
            var3[0] = u3.n5(var1);
         } else {
            var3[0] = a6.n5(var1);
         }
      }

      var2.n5(var3);
      return var2;
   }
}
