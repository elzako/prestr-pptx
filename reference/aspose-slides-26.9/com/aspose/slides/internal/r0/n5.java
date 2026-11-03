package com.aspose.slides.internal.r0;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x8;
import com.aspose.slides.ms.System.x9;

public class n5 {
   public static int[] n5(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      switch (var0.s7()) {
         case 135173:
            var1 = t2(var0);
            break;
         case 135174:
            var1 = c8(var0);
            break;
         case 137224:
            var1 = u9(var0);
            break;
         case 139273:
            var1 = a6(var0);
            break;
         case 196865:
            var1 = y4(var0);
            break;
         case 197634:
            var1 = n3(var0);
            break;
         case 198659:
            var1 = x8(var0);
            break;
         case 397319:
            var1 = h0(var0);
            break;
         case 925707:
         case 2498570:
         default:
            var1 = u3(var0);
            break;
         case 1052676:
            var1 = s7(var0);
            break;
         case 1060876:
            var1 = k5(var0);
            break;
         case 1851406:
         case 3424269:
            var1 = l6(var0);
      }

      return var1;
   }

   private static int[] l6(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 8;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = (byte)((x8.n5(var6, var11) & 65535) >> 5);
            byte var13 = (byte)((x8.n5(var6, var11 + 2) & 65535) >> 5);
            byte var14 = (byte)((x8.n5(var6, var11 + 4) & 65535) >> 5);
            byte var15 = (byte)((x8.n5(var6, var11 + 6) & 65535) >> 5);
            var1[var9] = (var15 & 255) << 24 | (var14 & 255) << 16 | (var13 & 255) << 8 | var12 & 255;
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] k5(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 6;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = (byte)((x8.n5(var6, var11) & 65535) >> 5);
            byte var13 = (byte)((x8.n5(var6, var11 + 2) & 65535) >> 5);
            byte var14 = (byte)((x8.n5(var6, var11 + 4) & 65535) >> 5);
            var1[var9] = (var14 & 255) << 16 | (var13 & 255) << 8 | var12 & 255;
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] u3(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 4;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = var6[var11];
            byte var13 = var6[var11 + 1];
            byte var14 = var6[var11 + 2];
            byte var15 = var6[var11 + 3];
            var1[var9] = (var15 & 255) << 24 | (var14 & 255) << 16 | (var13 & 255) << 8 | var12 & 255;
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] a6(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 4;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = var6[var11];
            byte var13 = var6[var11 + 1];
            byte var14 = var6[var11 + 2];
            byte var15 = var6[var11 + 3];
            var1[var9] = (var15 & 255) << 24 | (var14 & 255) << 16 | (var13 & 255) << 8 | var12 & 255;
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] u9(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 3;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = var6[var11];
            byte var13 = var6[var11 + 1];
            byte var14 = var6[var11 + 2];
            var1[var9] = (var14 & 255) << 16 | (var13 & 255) << 8 | var12 & 255;
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] h0(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 2;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = (byte)((var6[var11] & 255) >> 3);
            byte var13 = (byte)((var6[var11] & 255 & 7) << 2 | (var6[var11 + 1] & 255) >> 6);
            byte var14 = (byte)((var6[var11 + 1] & 255) >> 1 & 31);
            byte var15 = (byte)(var6[var11 + 1] & 0xFF & 1);
            int var16 = (var14 & 255) << 16 | (var13 & 255) << 8 | var12 & 255;
            var1[var9] = (int)((var15 & 255) == 0 ? var16 : (4278190080L | var16) & 4294967295L);
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] c8(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 2;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = (byte)((var6[var11] & 255) >> 3);
            byte var13 = (byte)((var6[var11] & 255 & 7) << 3 | (var6[var11 + 1] & 255) >> 5);
            byte var14 = (byte)(var6[var11 + 1] & 0xFF & 31);
            var1[var9] = (var14 & 255) << 16 | (var13 & 255) << 8 | var12 & 255;
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] t2(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 2;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = (byte)((var6[var11] & 255) >> 3);
            byte var13 = (byte)((var6[var11] & 255 & 7) << 2 | (var6[var11 + 1] & 255) >> 6);
            byte var14 = (byte)((var6[var11 + 1] & 255) >> 1 & 31);
            var1[var9] = (var14 & 255) << 16 | (var13 & 255) << 8 | var12 & 255;
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] s7(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 * 2;
            int var11 = var7 * q1.n5(var3) + var10;
            int var12 = x8.n5(var6, var11);
            var1[var9] = (var12 & 65535) << 16 | (var12 & 65535) << 8 | var12 & 65535;
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] x8(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8;
            int var11 = var7 * q1.n5(var3) + var10;
            byte var12 = var6[var11];
            var1[var9] = var0.t2().n5()[var12 & 0xFF].h0();
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] n3(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 / 2;
            int var11 = var8 % 2;
            int var12 = var7 * q1.n5(var3) + var10;
            byte var13 = var6[var12];
            var1[var9] = var0.t2().n5()[(var13 & 255) >> 4 * (1 - var11) & 15].h0();
         }
      }

      var0.n5(var2);
      return var1;
   }

   private static int[] y4(com.aspose.slides.internal.o9b.l6 var0) {
      int[] var1 = new int[var0.e2() * var0.h0()];
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var0.s7());
      int var3 = var2.a6();
      x9 var4 = var2.u3();
      int var5 = q1.n5(var3) * var0.h0();
      byte[] var6 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4, var6, 0, var6.length);

      for (int var7 = 0; var7 < var0.h0(); var7++) {
         for (int var8 = 0; var8 < var0.e2(); var8++) {
            int var9 = var7 * var0.e2() + var8;
            int var10 = var8 / 8;
            int var11 = var8 % 8;
            int var12 = var7 * q1.n5(var3) + var10;
            byte var13 = var6[var12];
            int var14 = (var13 & 255 & 1 << 7 - var11) >> 7 - var11;
            var1[var9] = var0.t2().n5()[var14].h0();
         }
      }

      var0.n5(var2);
      return var1;
   }
}
