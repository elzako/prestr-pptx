package com.aspose.slides.internal.a9t;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o8m.i1;
import com.aspose.slides.internal.o8m.i9;
import com.aspose.slides.internal.o8m.y1;
import com.aspose.slides.internal.o8m.z1;
import com.aspose.slides.internal.o8m.z7;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x8;
import com.aspose.slides.ms.System.y4;

public class l6 {
   private static byte[] n5 = new byte[]{75, 71, 83, 33, 64, 35, 36, 37};
   private static byte[] l6 = new byte[]{-86, -45, -76, 53, -75, 20, 4, -18};

   static byte[] n5(String var0, byte[] var1) {
      byte[] var2 = new byte[21];
      z1 var3 = z1.k5();
      var3.k5(2);
      i1 var4 = null;
      if (var0 != null && var0.length() >= 1) {
         var3.k5(n5(var0, 0));
         var4 = var3.t9();
         var4.n5(n5, 0, 8, var2, 0);
      } else {
         y4.n5(l6, 0, var2, 0, 8);
      }

      if (var0 != null && var0.length() >= 8) {
         var3.k5(n5(var0, 7));
         var4 = var3.t9();
         var4.n5(n5, 0, 8, var2, 8);
      } else {
         y4.n5(l6, 0, var2, 8, 8);
      }

      var3.h0();
      return n5(var1, var2);
   }

   static byte[] n5(String var0) {
      byte[] var1 = new byte[21];
      com.aspose.slides.internal.x8w.u3 var2 = com.aspose.slides.internal.x8w.u3.a6();
      byte[] var3 = var0 == null ? new byte[0] : j5.z1().u3(var0);
      byte[] var4 = var2.l6(var3);
      y4.n5(var4, 0, var1, 0, 16);
      com.aspose.slides.ms.System.u3.n5(var3, 0, var3.length);
      com.aspose.slides.ms.System.u3.n5(var4, 0, var4.length);
      return var1;
   }

   static byte[] l6(String var0, byte[] var1) {
      byte[] var2 = n5(var0);
      return n5(var1, var2);
   }

   static void n5(String var0, byte[] var1, byte[][] var2, byte[][] var3) {
      byte[] var4 = new byte[8];
      i9 var5 = i9.n5();
      var5.n5(var4);
      byte[] var6 = new byte[var1.length + 8];
      com.aspose.slides.ms.System.u3.n5((Object)(var1)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var6)), 0);
      com.aspose.slides.ms.System.u3.n5((Object)(var4)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var6)), var1.length);
      var2[0] = new byte[24];
      com.aspose.slides.ms.System.u3.n5((Object)(var4)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var2[0])), 0);
      z7 var7 = z7.a6();
      byte[] var8 = var7.l6(var6);
      byte[] var9 = new byte[8];
      com.aspose.slides.ms.System.u3.n5(var8, var9, 8);
      var3[0] = l6(var0, var9);
      com.aspose.slides.ms.System.u3.n5(var4, 0, var4.length);
      com.aspose.slides.ms.System.u3.n5(var6, 0, var6.length);
      com.aspose.slides.ms.System.u3.n5(var9, 0, var9.length);
      com.aspose.slides.ms.System.u3.n5(var8, 0, var8.length);
   }

   static byte[] n5(u9 var0, String var1, String var2, String var3) {
      byte[] var4 = n5(var2);
      byte[] var5 = j5.z1().u3(d1.s7(var1));
      byte[] var6 = j5.z1().u3(var3);
      byte[] var7 = new byte[var5.length + var6.length];
      com.aspose.slides.ms.System.u3.n5((Object)(var5)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var7)), 0);
      com.aspose.slides.ms.System.u3.n5(var6, 0, var7, var5.length, var6.length);
      y1 var8 = new y1(var4);
      byte[] var9 = var8.l6(var7);
      com.aspose.slides.ms.System.u3.n5(var4, 0, var4.length);
      var8.x8();
      y1 var10 = new y1(var9);
      com.aspose.slides.ms.System.j5 var11 = com.aspose.slides.ms.System.j5.s7().m3();
      long var12 = var11.n3() - 504911232000000000L;
      byte[] var14 = new byte[8];
      i9 var15 = i9.n5();
      var15.n5(var14);
      byte[] var16 = new byte[28 + var0.u9().length];
      var16[0] = 1;
      var16[1] = 1;
      y4.n5(x8.l6(var12), 0, var16, 8, 8);
      y4.n5(var14, 0, var16, 16, 8);
      y4.n5(var0.u9(), 0, var16, 28, var0.u9().length);
      byte[] var17 = var0.u3();
      byte[] var18 = new byte[var17.length + var16.length];
      com.aspose.slides.ms.System.u3.n5((Object)(var17)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var18)), 0);
      com.aspose.slides.ms.System.u3.n5((Object)(var16)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var18)), var17.length);
      byte[] var19 = var10.l6(var18);
      byte[] var20 = new byte[var16.length + var19.length];
      com.aspose.slides.ms.System.u3.n5((Object)(var19)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var20)), 0);
      com.aspose.slides.ms.System.u3.n5((Object)(var16)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var20)), var19.length);
      com.aspose.slides.ms.System.u3.n5(var9, 0, var9.length);
      var10.x8();
      com.aspose.slides.ms.System.u3.n5(var14, 0, var14.length);
      com.aspose.slides.ms.System.u3.n5(var16, 0, var16.length);
      com.aspose.slides.ms.System.u3.n5(var18, 0, var18.length);
      com.aspose.slides.ms.System.u3.n5(var19, 0, var19.length);
      return var20;
   }

   public static void n5(u9 var0, int var1, String var2, String var3, String var4, byte[][] var5, byte[][] var6) {
      var5[0] = null;
      switch (var1) {
         case 0:
            var5[0] = n5(var3, var0.u3());
            var6[0] = l6(var3, var0.u3());
            break;
         case 1:
            if ((var0.n5() & 524288) == 0) {
               var5[0] = n5(var3, var0.u3());
               var6[0] = l6(var3, var0.u3());
            } else {
               n5(var3, var0.u3(), var5, var6);
            }
            break;
         case 2:
            if ((var0.n5() & 524288) != 0) {
               n5(var3, var0.u3(), var5, var6);
            } else {
               var6[0] = l6(var3, var0.u3());
            }
            break;
         case 3:
            var6[0] = n5(var0, var2, var3, var4);
            break;
         default:
            throw new InvalidOperationException();
      }
   }

   static byte[] n5(byte[] var0, byte[] var1) {
      byte[] var2 = new byte[24];
      z1 var3 = z1.k5();
      var3.k5(2);
      var3.k5(n5(var1, 0));
      i1 var4 = var3.t9();
      var4.n5(var0, 0, 8, var2, 0);
      var3.k5(n5(var1, 7));
      var4 = var3.t9();
      var4.n5(var0, 0, 8, var2, 8);
      var3.k5(n5(var1, 14));
      var4 = var3.t9();
      var4.n5(var0, 0, 8, var2, 16);
      return var2;
   }

   static byte[] n5(byte[] var0, int var1) {
      return new byte[]{
         var0[var1],
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var0[var1], 6) << 7 | com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 1], 6) >> 1), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 1], 6) << 6 | com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 2], 6) >> 2), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 2], 6) << 5 | com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 3], 6) >> 3), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 3], 6) << 4 | com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 4], 6) >> 4), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 4], 6) << 3 | com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 5], 6) >> 5), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 5], 6) << 2 | com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 6], 6) >> 6), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.v6g.k5.u3(var0[var1 + 6], 6) << 1), 9)
      };
   }

   static byte[] n5(String var0, int var1) {
      byte[] var2 = new byte[7];
      int var3 = q1.l6(var0.length() - var1, 7);
      j5.e2().n5(d1.l6(var0, com.aspose.slides.internal.x7n.l6.u3()), var1, var3, var2, 0);
      byte[] var4 = n5(var2, 0);
      com.aspose.slides.ms.System.u3.n5(var2, 0, var2.length);
      return var4;
   }
}
