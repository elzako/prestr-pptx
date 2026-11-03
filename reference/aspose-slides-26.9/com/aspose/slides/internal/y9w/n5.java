package com.aspose.slides.internal.y9w;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public class n5 {
   public static t2 n5(t4 var0, int var1, long var2, int var4) {
      e2 var5 = new e2();
      byte[] var6 = new byte[512];
      var0.setPosition(76L);
      int var7 = q1.l6(var1, 109) * 4;
      var0.read(var6, 0, var7);
      var5.write(var6, 0, var7);
      long var8 = var2;

      for (int var10 = 0; var10 < var4; var10++) {
         var0.setPosition(s7.n5(var8, true));
         var0.read(var6, 0, 512);
         short var11 = 508;
         var5.write(var6, 0, var11);
         var8 = (var6[var11] & 0xFF | (var6[var11 + 1] & 255) << 8 | (var6[var11 + 2] & 255) << 16 | (var6[var11 + 3] & 255) << 24) & 4294967295L;
      }

      return new t2(var5);
   }

   public static void n5(t4 var0, long var1, int var3, u9 var4) {
      long var5 = var1;
      com.aspose.slides.internal.z0k.l6 var7 = new com.aspose.slides.internal.z0k.l6(var0, j5.z1());
      long var8 = var0.getPosition();
      var0.setPosition(76L);
      int var10 = q1.l6(var3, 109);

      for (int var11 = 0; var11 < var10; var11++) {
         var7.n5(var5 & 4294967295L);
         var5++;
      }

      s7.n5(var7);
      var0.setPosition(var8);
      int var16 = var3 - var10;
      if (var16 > 0) {
         var4.x8 = s7.l6(var0.getPosition(), true);
         var4.n3 = 0;

         while (var16 > 0) {
            int var12 = q1.l6(var16, 127);

            for (int var13 = 0; var13 < var12; var13++) {
               var7.n5(var5 & 4294967295L);
               var5++;
            }

            s7.n5(var7);
            var16 -= var12;
            var4.n3++;
            var0.setPosition(var0.getPosition() - 4L);
            if (var16 > 0) {
               long var14 = (s7.l6(var0.getPosition(), true) & 4294967295L) + 1L & 4294967295L;
               var7.n5(var14 & 4294967295L);
            } else {
               var7.n5(4294967294L);
            }
         }
      } else {
         var4.x8 = 4294967294L;
         var4.n3 = 0;
      }
   }
}
