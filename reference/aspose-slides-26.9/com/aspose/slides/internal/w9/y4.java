package com.aspose.slides.internal.w9;

public class y4 {
   public final boolean n5(com.aspose.slides.internal.b9.q0[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);
      com.aspose.slides.internal.b9.t4 var4 = new com.aspose.slides.internal.b9.t4(var1[0]);
      var4.n5((com.aspose.slides.internal.k1.k7)new com.aspose.slides.internal.s8.t4().n5(var3));
      long var5 = var3.c4();
      long var7 = 0L;
      var4.n5(var5);
      var4.n5(new com.aspose.slides.internal.t5.u3[(int)(var5 & 4294967295L)]);

      for (int var9 = 0; var9 < (var5 & 4294967295L); var9++) {
         com.aspose.slides.internal.t5.u3 var10 = (com.aspose.slides.internal.t5.u3)new com.aspose.slides.internal.m8.k5().n5(var3);
         var7 = (var7 & 4294967295L) + (var10.k5() & 4294967295L) & 4294967295L;
         var4.k5()[var9] = var10;
      }

      var4.n5(var3.c8((int)var7));
      var1[0] = var4;
      return true;
   }
}
