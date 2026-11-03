package com.aspose.slides.internal.l0;

public class c8 extends x8 {
   public void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.t5.q0 var2) {
      com.aspose.slides.internal.t5.e2 var3 = (com.aspose.slides.internal.t5.e2)var2;
      var1.n5(var3.n5() & 65535);
      var1.n5(var3.l6() & 65535);
      n5(var1, var3.k5());
   }

   public static void n5(com.aspose.slides.internal.z0k.l6 var0, int[] var1) {
      for (int var5 : var1) {
         int var6 = (var5 & 0xFF) << 16 | var5 & 0xFF00 | var5 >> 16 & 0xFF;
         var0.l6(var6);
      }
   }
}
