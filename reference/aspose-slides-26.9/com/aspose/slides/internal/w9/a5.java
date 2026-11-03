package com.aspose.slides.internal.w9;

import com.aspose.slides.internal.b9.x5;

public class a5 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      com.aspose.slides.internal.b9.x9 var3 = new com.aspose.slides.internal.b9.x9(var0[0]);
      var3.n5((com.aspose.slides.internal.k1.k7)new com.aspose.slides.internal.s8.t4().n5(var2));
      var3.n5(var2.c4());
      var3.l6(var2.c4());
      var3.k5(var2.c4() & 4294967295L);
      x5 var4 = new x5();
      com.aspose.slides.internal.t5.z8[] var5 = new com.aspose.slides.internal.t5.z8[(int)var3.l6()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = (com.aspose.slides.internal.t5.z8)new com.aspose.slides.internal.m8.z3().n5(var2);
      }

      var4.n5(var5);
      if (var3.u3() == 0L || var3.u3() == 1L) {
         com.aspose.slides.internal.t5.a6[] var9 = new com.aspose.slides.internal.t5.a6[(int)var3.k5()];

         for (int var10 = 0; var10 < var9.length; var10++) {
            var9[var10] = (com.aspose.slides.internal.t5.a6)new com.aspose.slides.internal.m8.u3().n5(var2);
         }

         var4.n5(var9);
         var4.n5(var2.c8((int)var3.k5() * 4));
      } else if (var3.u3() == 2L) {
         com.aspose.slides.internal.t5.u9[] var8 = new com.aspose.slides.internal.t5.u9[(int)var3.k5()];

         for (int var7 = 0; var7 < var8.length; var7++) {
            var8[var7] = (com.aspose.slides.internal.t5.u9)new com.aspose.slides.internal.m8.a6().n5(var2);
         }

         var4.n5(var8);
      }

      var3.n5(var4);
      var0[0] = var3;
      return true;
   }
}
