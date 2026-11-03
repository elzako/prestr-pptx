package com.aspose.slides.internal.o3;

public class y4 extends x8 {
   public void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.y6.u3 var2) {
      com.aspose.slides.internal.k1.e2 var3 = (com.aspose.slides.internal.k1.e2)var2;
      var1.n5(var3.n5() & 65535);
      if ((var3.n5() & 65535) != 768) {
         var1.n5().seek(var3.n5() & 65535, 0);
      }

      var1.n5(var3.l6() & 65535);

      for (int var4 = 0; var4 < (var3.l6() & 65535); var4++) {
         new n3().n5(var1, var3.k5()[var4]);
      }
   }
}
