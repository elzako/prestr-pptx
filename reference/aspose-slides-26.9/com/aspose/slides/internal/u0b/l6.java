package com.aspose.slides.internal.u0b;

import com.aspose.slides.internal.f4l.h6;

class l6 {
   private final com.aspose.slides.internal.f4l.a6 n5;
   private final com.aspose.slides.internal.f4l.u9 l6;
   private final int k5;
   private final int u3;

   public l6(com.aspose.slides.internal.f4l.a6 var1, com.aspose.slides.internal.f4l.u9 var2, int var3, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public final com.aspose.slides.internal.f4l.u9 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.u9 var2;
      if (this.l6 == null) {
         var2 = new com.aspose.slides.internal.f4l.u9();
         var2.n5(new h6(this.u3));
      } else {
         var2 = this.l6;
      }

      if (var2.l6().n5(var1.c8(this.k5))) {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2.l6().n5());

         try {
            return this.l6(new com.aspose.slides.internal.z0k.n5(var3));
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } else {
         return var2;
      }
   }

   private com.aspose.slides.internal.f4l.u9 l6(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.u9 var2 = new com.aspose.slides.internal.f4l.u9();
      if (com.aspose.slides.internal.j3z.s7.l6(this.n5.k5())) {
         var2.n5(b3.n5(var1));
      }

      int var3 = com.aspose.slides.internal.j3z.s7.n5(this.n5.k5());
      int var4 = var3 * this.n5.u9() / 8;
      int var5 = this.n5.u3() - var4;
      byte[] var6 = new byte[this.n5.l6() * var4];
      int var7 = 0;

      for (int var8 = 0; var8 < this.n5.l6(); var8++) {
         var1.n5(var6, var7, var4);
         var7 += var4;
         var1.x8().seek(var5, 1);
      }

      var2.n5(var6);
      return var2;
   }
}
