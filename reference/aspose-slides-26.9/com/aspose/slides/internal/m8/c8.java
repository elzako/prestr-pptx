package com.aspose.slides.internal.m8;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.q1;

public class c8 extends e2 {
   public com.aspose.slides.internal.t5.q0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.t5.x8 var2 = (com.aspose.slides.internal.t5.x8)new t2().n5(var1);
      com.aspose.slides.internal.t5.n3 var3 = new com.aspose.slides.internal.t5.n3(var2);
      var3.n5(var1.c8(256));
      var3.l6(n5(var3.m1(), 0, 128));
      var3.k5(n5(var3.m1(), 128, 64));
      var3.u3(n5(var3.m1(), 192, 64));
      return var3;
   }

   public static String n5(byte[] var0, int var1, int var2) {
      int var3 = var1 + var2;

      for (int var4 = var1; var4 < q1.l6(var0.length - 1, var1 + var2); var4 += 2) {
         if ((var0[var4] & 255) == 0 && (var0[var4 + 1] & 255) == 0) {
            var3 = var4;
            break;
         }
      }

      return j5.z1().l6(var0, var1, var3 - var1);
   }
}
