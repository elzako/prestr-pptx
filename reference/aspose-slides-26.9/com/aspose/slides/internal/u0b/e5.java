package com.aspose.slides.internal.u0b;

import com.aspose.slides.internal.f4l.h6;

class e5 {
   private final com.aspose.slides.internal.f4l.h2 n5;
   private final int l6;
   private final int k5;

   public e5(com.aspose.slides.internal.f4l.h2 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final com.aspose.slides.internal.f4l.h2 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.h2 var2;
      int var3;
      if (this.n5 == null) {
         var2 = new com.aspose.slides.internal.f4l.h2();
         var2.n5(var1.m3());
         var2.l6(var1.m3());
         var3 = this.l6 - 8;
         int var4 = this.k5 - 8;
         var2.n5(new h6(var4));
      } else {
         var2 = this.n5;
         var3 = this.l6;
      }

      if (var2.n5().n5(var1.c8(var3))) {
      }

      return var2;
   }
}
