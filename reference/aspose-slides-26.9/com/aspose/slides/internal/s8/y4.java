package com.aspose.slides.internal.s8;

public class y4 extends x8 {
   public com.aspose.slides.internal.y6.u3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.k1.e2 var2 = new com.aspose.slides.internal.k1.e2();
      var2.n5(var1.r4());
      if ((var2.n5() & 65535) != 768) {
         var1.x8().seek(var2.n5() & 65535, 0);
      }

      var2.l6(var1.r4());
      var2.n5(new com.aspose.slides.internal.k1.t9[var2.l6()]);

      for (int var3 = 0; var3 < (var2.l6() & 65535); var3++) {
         var2.k5()[var3] = (com.aspose.slides.internal.k1.t9)new n3().n5(var1);
      }

      return var2;
   }
}
