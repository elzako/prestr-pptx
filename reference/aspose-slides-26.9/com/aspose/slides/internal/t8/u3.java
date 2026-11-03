package com.aspose.slides.internal.t8;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class u3 {
   public static m1 n5(s7 var0) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.n5.class)) {
         return new m1();
      }

      com.aspose.slides.internal.v2.n5 var1 = (com.aspose.slides.internal.v2.n5)var0;
      if (var1.n5() < 6) {
         return new m1();
      }

      for (int var2 = 0; var2 < 6; var2++) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1.l6(var2), com.aspose.slides.internal.v2.t2.class)) {
            return new m1();
         }
      }

      return new m1(
         ((com.aspose.slides.internal.v2.t2)var1.l6(0)).u3(),
         ((com.aspose.slides.internal.v2.t2)var1.l6(1)).u3(),
         ((com.aspose.slides.internal.v2.t2)var1.l6(2)).u3(),
         ((com.aspose.slides.internal.v2.t2)var1.l6(3)).u3(),
         ((com.aspose.slides.internal.v2.t2)var1.l6(4)).u3(),
         ((com.aspose.slides.internal.v2.t2)var1.l6(5)).u3()
      );
   }

   public static m1 n5(float var0) {
      return new m1(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, var0);
   }

   public static float n5(m1 var0, int var1, int var2) {
      float[] var3 = var0.n5();
      return var3[var1 * 2 + var2];
   }

   public static float n5(m1 var0) {
      float[] var1 = var0.n5();
      float var2 = var1[0];
      float var3 = q1.n5(var1[1]);
      float var4 = q1.n5(var1[2]);
      if (var3 > 1.0E-6 || var4 > 1.0E-6) {
         var2 = (float)q1.z3(var1[0] * var1[0] + var1[1] * var1[1]);
      }

      return var2;
   }

   public static float l6(m1 var0) {
      float[] var1 = var0.n5();
      float var2 = var1[3];
      float var3 = q1.n5(var1[1]);
      float var4 = q1.n5(var1[2]);
      if (var3 > 1.0E-6 || var4 > 1.0E-6) {
         var2 = (float)q1.z3(var1[2] * var1[2] + var1[3] * var1[3]);
      }

      return var2;
   }

   public static w1 n5(float var0, float var1, m1 var2) {
      w1 var3 = new w1();
      var3.n5(var2.n5()[0] * var0 + var2.n5()[2] * var1 + var2.n5()[4]);
      var3.l6(var2.n5()[1] * var0 + var2.n5()[3] * var1 + var2.n5()[5]);
      return var3;
   }

   public static w1 n5(m1 var0, w1 var1) {
      if (var0 == null) {
         return var1;
      }

      w1[] var2 = new w1[]{var1};
      var0.n5(var2);
      return var2[0];
   }
}
