package com.aspose.slides.internal.b6;

public class w2 extends com.aspose.slides.internal.g1.u3 {
   @Override
   public void n5(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.s0 var4 = (com.aspose.slides.internal.i3.s0)var1;
      com.aspose.slides.internal.k1.e2 var5 = var4.n5();
      if (var3.x8() != null && var3.x8().k5() == (var5.l6() & 65535)) {
         for (int var6 = 0; var6 < (var5.l6() & 65535); var6++) {
            var5.k5()[var6].u9().n5(var3.x8().l6()[var6]);
            var3.x8().n5()[var6] = var5.k5()[var6].n5();
         }
      }
   }
}
