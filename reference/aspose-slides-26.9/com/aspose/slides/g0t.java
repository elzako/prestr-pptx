package com.aspose.slides;

class g0t {
   static p0s n5(com.aspose.slides.internal.k0r.z5 var0, com.aspose.slides.internal.k0r.z5 var1) {
      p0s var2 = new p0s();
      long var3 = var0 != null ? var0.j5() : 25400L;
      long var5 = var1 != null ? var1.j5() : 25400L;
      double var7 = var0 != null ? (int)(var3 & 4294967295L) / 12700.0 : 2.0;
      double var9 = var1 != null ? (int)(var5 & 4294967295L) / 12700.0 : 2.0;
      var2.n5 = com.aspose.slides.ms.System.q1.z3(var7 * var7 + var9 * var9);
      var2.l6 = (float)(com.aspose.slides.ms.System.q1.y4(var7 / var2.n5) * 180.0 / Math.PI);
      if (var9 < 0.0) {
         var2.l6 = 360.0F - var2.l6;
      }

      if (com.aspose.slides.ms.System.n1.k5(var2.l6)) {
         var2.l6 = 0.0F;
      }

      return var2;
   }

   static void n5(p0s var0, com.aspose.slides.internal.k0r.r3 var1) {
      com.aspose.slides.internal.k0r.w8 var2 = var1.l6();
      double var3 = var0.n5 * com.aspose.slides.ms.System.q1.c8(var0.l6 * Math.PI / 180.0);
      double var5 = var0.n5 * com.aspose.slides.ms.System.q1.h0(var0.l6 * Math.PI / 180.0);
      long var7 = (long)(var3 * 12700.0 + com.aspose.slides.ms.System.q1.u9(var3) * 0.5);
      long var9 = (long)(var5 * 12700.0 + com.aspose.slides.ms.System.q1.u9(var5) * 0.5);
      if ((var7 & 4294967295L) != 25400L) {
         var2.l6(new com.aspose.slides.internal.k0r.z5(517, var7));
      }

      if ((var9 & 4294967295L) != 25400L) {
         var2.l6(new com.aspose.slides.internal.k0r.z5(518, var9));
      }
   }
}
