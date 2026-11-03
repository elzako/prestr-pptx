package com.aspose.slides.internal.s8;

public class e2 extends x8 {
   public com.aspose.slides.internal.y6.u3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.k1.z1 var2 = new com.aspose.slides.internal.k1.z1();
      int var3 = var1.r4();
      int var4 = var3 & 65535 & 15 & 65535;
      int var5 = var3 & 65535 & 3840 & 65535;
      int var6 = var3 & 65535 & 61440 & 65535;
      boolean var7 = (var4 & 65535) <= 8
         && ((var5 & 65535) == 0 || (var5 & 65535) == 256 || (var5 & 65535) == 512)
         && ((var6 & 65535) == 0 || (var6 & 65535) == 4096 || (var6 & 65535) == 8192);
      if (var7) {
         var2.n5(var3);
         var2.n5((com.aspose.slides.internal.k1.z3)new z1().n5(var1));
         var2.n5((com.aspose.slides.internal.k1.c8)new a6().n5(var1));
         return var2;
      } else {
         throw new com.aspose.slides.internal.p5.l6("Invalid PenStyle value for WmfPen");
      }
   }
}
