package com.aspose.slides.internal.p1;

import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.w0.c8;
import com.aspose.slides.ms.System.q1;

public class l6 {
   public static c8 n5(w1 var0, c8 var1, f2 var2, com.aspose.slides.internal.p1s.l6 var3, int var4, float var5) {
      c8 var6 = var1.k5();
      var6.l6(-n5(var2.a6(), var4), q1.l6(var6.h0()) * n5(var3, var4), 0);
      float[] var7 = var6.l6();
      float[] var8 = new float[]{q1.l6(var7[0]), q1.l6(var7[3]), q1.l6(var7[4]), q1.l6(var7[5])};
      var8[2] = var8[0] < 0.0F ? var8[2] : 1.0F;
      var8[3] = var8[1] < 0.0F ? var8[3] : 1.0F;
      var0 = new w1(var8[0] * var0.l6(), var8[1] * var0.k5());
      var6 = new c8(var8[0] * var7[0], var7[1], var7[2], var8[1] * var7[3], var8[2] * var7[4], var8[3] * var7[5]);
      var6.n5(-var5 * q1.l6(var0.k5()), new w1(var0.l6(), var0.k5() - n5(var3, var4)), 0);
      return var6;
   }

   public static float n5(com.aspose.slides.internal.p1s.l6 var0, int var1) {
      switch (24 & var1) {
         case 0:
            return var0.t2();
         case 8:
            return -var0.s7();
         default:
            return 0.0F;
      }
   }

   public static float n5(f2 var0, int var1) {
      switch (6 & var1) {
         case 2:
            return var0.l6();
         case 6:
            return var0.l6() / 2.0F;
         default:
            return 0.0F;
      }
   }
}
