package com.aspose.slides.internal.u0b;

import com.aspose.slides.internal.f4l.h6;

class t4 {
   private final com.aspose.slides.internal.f4l.m3 n5;
   private final int l6;
   private final int k5;

   public t4(com.aspose.slides.internal.f4l.m3 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final com.aspose.slides.internal.f4l.m3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.m3 var2;
      if (this.n5 == null) {
         var2 = new com.aspose.slides.internal.f4l.m3();
         var2.n5(new h6(this.k5));
      } else {
         var2 = this.n5;
      }

      if (var2.n5().n5(var1.c8(this.l6))) {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2.n5().n5());
         if (var3 != null) {
            var3.dispose();
         }
      }

      return var2;
   }
}
