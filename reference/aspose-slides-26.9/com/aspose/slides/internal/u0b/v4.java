package com.aspose.slides.internal.u0b;

import com.aspose.slides.ms.System.d1;

public class v4 {
   public static com.aspose.slides.internal.f4l.a3 n5(com.aspose.slides.internal.z0k.n5 var0) {
      com.aspose.slides.internal.f4l.a3 var1 = new com.aspose.slides.internal.f4l.a3();
      com.aspose.slides.internal.f4l.f2 var2 = new com.aspose.slides.internal.f4l.f2();
      var2.n5(var0.m3());
      var1.n5(var2);
      var1.n5(var0.m3());
      short var3 = var0.k7();
      var1.n5(var3);
      var1.l6(var0.k7());
      if ((var3 & -27) > 0) {
         com.aspose.slides.internal.f8y.n5.k5(
            d1.n5(new String[]{"Damage EmfPlusPath flags = ", com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.j3z.c8.class, var3)})
         );
      }

      com.aspose.slides.ms.System.u3 var4 = null;
      if ((var3 & 2048) > 0) {
         var4 = com.aspose.slides.ms.System.u3.n5((Object)(v0.n5(var1.n5(), var0)));
      } else if ((var3 & 16384) > 0) {
         var4 = com.aspose.slides.ms.System.u3.n5((Object)(f0.n5(var1.n5(), var0)));
      } else {
         var4 = com.aspose.slides.ms.System.u3.n5((Object)(h2.n5(var1.n5(), var0)));
      }

      var1.n5(var4);
      com.aspose.slides.internal.f4l.u3[] var5;
      if ((var3 & 4096) > 0) {
         var5 = new com.aspose.slides.internal.f4l.j9[var1.n5()];

         for (int var6 = 0; var6 < ((Object[])var5).length; var6++) {
            com.aspose.slides.internal.f4l.j9 var7 = new com.aspose.slides.internal.f4l.j9();
            var7.n5(com.aspose.slides.internal.v6g.k5.u3(var0.z1(), 6));
            ((Object[])var5)[var6] = var7;
         }
      } else {
         var5 = new com.aspose.slides.internal.f4l.y0[var1.n5()];

         for (int var9 = 0; var9 < ((Object[])var5).length; var9++) {
            com.aspose.slides.internal.f4l.y0 var11 = new com.aspose.slides.internal.f4l.y0();
            var11.n5(com.aspose.slides.internal.v6g.k5.u3(var0.z1(), 6));
            ((Object[])var5)[var9] = var11;
         }
      }

      var1.n5(var5);
      int var10 = 4 - (int)var0.x8().getPosition() & 3;
      if (var10 > 0) {
         var1.n5(var0.c8(var10));
      }

      return var1;
   }
}
