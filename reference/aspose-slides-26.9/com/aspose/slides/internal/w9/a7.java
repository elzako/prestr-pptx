package com.aspose.slides.internal.w9;

public class a7 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      long var2 = var1.getPosition() - 8L;
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var1);
      com.aspose.slides.internal.b9.w8 var5 = new com.aspose.slides.internal.b9.w8(var0[0]);
      var5.n5((com.aspose.slides.internal.k1.k7)new com.aspose.slides.internal.s8.t4().n5(var4));
      var5.n5(var4.c4() & 4294967295L);
      var5.n5(var4.w1());
      var5.l6(var4.w1());
      var5.l6(var4.c4());
      com.aspose.slides.internal.t5.m3[] var6 = new com.aspose.slides.internal.t5.m3[(int)var5.u9()];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = (com.aspose.slides.internal.t5.m3)new com.aspose.slides.internal.m8.q0(var2, true).n5(var4);
      }

      var5.n5(var6);
      var0[0] = var5;
      return true;
   }
}
