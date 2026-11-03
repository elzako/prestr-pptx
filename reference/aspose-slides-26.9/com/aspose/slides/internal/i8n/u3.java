package com.aspose.slides.internal.i8n;

import com.aspose.slides.internal.f4l.a3;
import com.aspose.slides.internal.f4l.j9;
import com.aspose.slides.internal.f4l.y0;
import com.aspose.slides.internal.x4g.s7;

public class u3 {
   public static s7 n5(a3 var0) {
      byte[] var1 = n5(var0.a6());
      com.aspose.slides.ms.System.u3 var2 = var0.k5();
      boolean var3 = (var0.l6() & 2048) > 0;
      return new s7(com.aspose.slides.internal.m0l.n5.n5(var2, var3, false), var1);
   }

   private static byte[] n5(com.aspose.slides.internal.f4l.u3[] var0) {
      byte[] var1 = new byte[var0.length];
      int var2 = 0;

      for (com.aspose.slides.internal.f4l.u3 var6 : var0) {
         if (var6 instanceof y0) {
            var1[var2] = (byte)(((y0)var0[var2]).n5() & 0xFF);
         } else {
            var1[var2] = (byte)(((j9)var0[var2]).n5() & 0xFF);
         }

         var2++;
      }

      return var1;
   }
}
