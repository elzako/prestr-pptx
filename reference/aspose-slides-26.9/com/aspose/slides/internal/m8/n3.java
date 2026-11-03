package com.aspose.slides.internal.m8;

public class n3 extends e2 {
   public com.aspose.slides.internal.t5.q0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.t5.t4 var2 = new com.aspose.slides.internal.t5.t4();
      var2.n5(var1.c4() & 4294967295L);
      var2.l6(var1.c4());
      var2.n5((int)(var1.c4() & 65535L));
      var2.n5((com.aspose.slides.internal.k1.c8)new com.aspose.slides.internal.s8.a6().n5(var1));
      var2.k5(var1.c4());
      var2.u3(var1.c4());
      if ((var2.c8() & 4294967295L) > 0L) {
         var2.n5(new long[(int)var2.c8()]);

         for (int var3 = 0; var3 < (var2.c8() & 4294967295L); var3++) {
            var2.t2()[var3] = var1.c4();
         }
      }

      return var2;
   }
}
