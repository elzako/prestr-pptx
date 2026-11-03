package com.aspose.slides.internal.m2n;

import com.aspose.slides.internal.f4l.a3;
import com.aspose.slides.internal.f4l.j9;
import com.aspose.slides.internal.f4l.y0;
import com.aspose.slides.internal.y5s.m1;
import com.aspose.slides.internal.y5s.z3;

public class n5 {
   public static void n5(a3 var0, com.aspose.slides.internal.z0k.l6 var1) {
      u9.n5(var0.u9(), var1);
      var1.n5((long)var0.n5());
      var1.n5((int)var0.l6());
      var1.n5((int)var0.u3());
      if ((var0.l6() & 2048) > 0) {
         n5(var0.k5(), var1);
      } else if ((var0.l6() & 16384) > 0) {
         l6(var0.k5(), var1);
      } else {
         k5(var0.k5(), var1);
      }

      if ((var0.l6() & 4096) > 0) {
         for (int var2 = 0; var2 < var0.a6().length; var2++) {
            j9 var3 = (j9)var0.a6()[var2];
            var1.n5((byte)var3.n5());
         }
      } else {
         for (int var4 = 0; var4 < var0.a6().length; var4++) {
            y0 var5 = (y0)var0.a6()[var4];
            var1.n5((byte)var5.n5());
         }
      }

      if (var0.h0() != null && var0.h0().length > 0) {
         var1.n5(var0.h0());
      }
   }

   private static void n5(com.aspose.slides.ms.System.u3 var0, com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < var0.a6(); var2++) {
         z3 var3 = (z3)var0.get_Item(var2);
         var1.l6(var3.l6());
         var1.l6(var3.k5());
      }
   }

   private static void l6(com.aspose.slides.ms.System.u3 var0, com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < var0.a6(); var2++) {
         z3 var3 = (z3)var0.get_Item(var2);
         var1.n5((short)var3.l6());
         var1.n5((short)var3.k5());
      }
   }

   private static void k5(com.aspose.slides.ms.System.u3 var0, com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < var0.a6(); var2++) {
         m1 var3 = (m1)var0.get_Item(var2);
         var1.n5(var3.n5());
         var1.n5(var3.l6());
      }
   }
}
