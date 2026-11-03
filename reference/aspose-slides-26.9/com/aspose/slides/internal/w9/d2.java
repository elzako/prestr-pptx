package com.aspose.slides.internal.w9;

public class d2 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.b9.e5 var2 = new com.aspose.slides.internal.b9.e5(var0[0]);
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var1);
      var2.n5(var3.c4());
      short var4 = 320;
      int var5 = var2.y2() - 12;
      long var6 = var1.getPosition();
      com.aspose.slides.internal.t5.x8 var8;
      if (var5 <= 320) {
         var8 = (com.aspose.slides.internal.t5.x8)new com.aspose.slides.internal.m8.t2().n5(var3);
      } else {
         var8 = (com.aspose.slides.internal.t5.y4)new com.aspose.slides.internal.m8.h0().n5(var3);
      }

      var1.seek(var6 + var5, 0);
      var2.n5(var8);
      var0[0] = var2;
      return true;
   }
}
