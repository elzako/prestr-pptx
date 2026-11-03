package com.aspose.slides.internal.m5;

import com.aspose.slides.ms.System.q1;

public class l6 {
   public static com.aspose.slides.internal.o9b.c8 n5(float[] var0, String var1) {
      return n5(var0, var1, 1.0F);
   }

   public static com.aspose.slides.internal.o9b.c8 n5(float[] var0, String var1, float var2) {
      if (var0 == null || var0.length == 0) {
         return com.aspose.slides.internal.o9b.c8.e2();
      } else if ("DeviceGray".equals(var1)) {
         return n5(var0, var2);
      } else if ("DeviceRGB".equals(var1)) {
         return l6(var0, var2);
      } else if ("DeviceCMYK".equals(var1)) {
         return k5(var0, var2);
      } else if (var0.length >= 3) {
         return l6(var0, var2);
      } else {
         return var0.length >= 1 ? n5(var0, var2) : com.aspose.slides.internal.o9b.c8.f4();
      }
   }

   private static com.aspose.slides.internal.o9b.c8 n5(float[] var0, float var1) {
      float var2 = q1.n5(0.0F, q1.l6(1.0F, var0[0]));
      byte var3 = com.aspose.slides.internal.v6g.k5.n5((Object)(q1.u3(var2 * 255.0F)), 14);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1 * 255.0F), 14);
      return com.aspose.slides.internal.o9b.c8.n5(var4, var3 & 255, var3 & 255, var3 & 255);
   }

   private static com.aspose.slides.internal.o9b.c8 l6(float[] var0, float var1) {
      if (var0.length < 3) {
         return n5(var0, var1);
      }

      byte var2 = com.aspose.slides.internal.v6g.k5.n5((Object)(q1.u3(q1.n5(0.0F, q1.l6(255.0F, var0[0] * 255.0F)))), 14);
      byte var3 = com.aspose.slides.internal.v6g.k5.n5((Object)(q1.u3(q1.n5(0.0F, q1.l6(255.0F, var0[1] * 255.0F)))), 14);
      byte var4 = com.aspose.slides.internal.v6g.k5.n5((Object)(q1.u3(q1.n5(0.0F, q1.l6(255.0F, var0[2] * 255.0F)))), 14);
      int var5 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1 * 255.0F), 14);
      return com.aspose.slides.internal.o9b.c8.n5(var5, var2 & 255, var3 & 255, var4 & 255);
   }

   private static com.aspose.slides.internal.o9b.c8 k5(float[] var0, float var1) {
      if (var0.length < 4) {
         return com.aspose.slides.internal.o9b.c8.f4();
      }

      float var2 = q1.n5(0.0F, q1.l6(1.0F, var0[0]));
      float var3 = q1.n5(0.0F, q1.l6(1.0F, var0[1]));
      float var4 = q1.n5(0.0F, q1.l6(1.0F, var0[2]));
      float var5 = q1.n5(0.0F, q1.l6(1.0F, var0[3]));
      byte var6 = com.aspose.slides.internal.v6g.k5.n5((Object)(q1.u3(255.0F * (1.0F - var2) * (1.0F - var5))), 14);
      byte var7 = com.aspose.slides.internal.v6g.k5.n5((Object)(q1.u3(255.0F * (1.0F - var3) * (1.0F - var5))), 14);
      byte var8 = com.aspose.slides.internal.v6g.k5.n5((Object)(q1.u3(255.0F * (1.0F - var4) * (1.0F - var5))), 14);
      int var9 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1 * 255.0F), 14);
      return com.aspose.slides.internal.o9b.c8.n5(var9, var6 & 255, var7 & 255, var8 & 255);
   }
}
