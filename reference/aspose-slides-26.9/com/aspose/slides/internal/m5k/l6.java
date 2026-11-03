package com.aspose.slides.internal.m5k;

import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.t9z.k5;
import com.aspose.slides.internal.x2o.u3;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.internal.x7u.a6;
import com.aspose.slides.internal.x7u.u9;

public class l6 {
   public static n5 n5(m3 var0, s7 var1, k5 var2) {
      if (var0.x8() == 0) {
         return null;
      }

      if (var0.x8() == 5 && var0.s7().length == 1) {
         return null;
      }

      boolean var3 = var1.t4();
      float[] var4 = n5(var0);
      float var5 = n5(var0, var3, var4);
      return new n5(var5, var4, var2);
   }

   private static float n5(m3 var0, boolean var1, float[] var2) {
      float var3 = var0.t2() * var0.q0();
      if (var0.c8() != 0 && var1) {
         float var4 = 0.0F;

         for (float var8 : var2) {
            var4 += var8;
         }

         var3 += var4;
         var3 -= var0.q0();
      }

      return var3;
   }

   private static float[] n5(m3 var0) {
      float var1 = var0.q0();
      float[] var2 = var0.s7();
      int var3 = var2.length % 2 == 0 ? var2.length : var2.length + 1;
      float[] var4 = new float[var3];

      for (int var5 = 0; var5 < var2.length; var5++) {
         var4[var5] = var2[var5] * var1;
      }

      if (var0.c8() != 0) {
         for (int var6 = 0; var6 < var4.length; var6++) {
            if (var6 % 2 == 0) {
               var4[var6] -= var1;
               var4[var6] = Math.max(var4[var6], var1 * 0.001F);
            } else {
               var4[var6] += var1;
            }
         }
      }

      return var4;
   }

   public static com.aspose.slides.internal.x2o.n5 n5(m3 var0, u9 var1) {
      switch (var0.c8()) {
         case 0:
            return new com.aspose.slides.internal.x2o.l6();
         case 1:
         default:
            throw new InvalidEnumArgumentException("DashCap");
         case 2:
            return new com.aspose.slides.internal.x2o.k5();
         case 3:
            if (var1 instanceof a6) {
               return null;
            } else {
               return var0.t4().l6() ? new com.aspose.slides.internal.x2o.a6() : new u3(var0.q0() / 2.0F, var0.t4().t2());
            }
      }
   }
}
