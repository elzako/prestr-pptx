package com.aspose.slides.internal.m8;

public class x8 extends e2 {
   public com.aspose.slides.internal.t5.q0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.t5.e2 var2 = new com.aspose.slides.internal.t5.e2();
      var2.n5(var1.r4());
      int var3 = var1.r4();
      var2.l6(var3);
      var2.n5(n5(var1, var3 & 65535));
      return var2;
   }

   public static int[] n5(com.aspose.slides.internal.z0k.n5 var0, long var1) {
      int[] var3 = new int[(int)(var1 & 4294967295L)];

      for (int var4 = 0; var4 < (var1 & 4294967295L); var4++) {
         int var5 = var0.m3();
         var3[var4] = 0xFF000000 | (var5 & 0xFF) << 16 | var5 & 0xFF00 | var5 >> 16 & 0xFF;
      }

      return var3;
   }
}
