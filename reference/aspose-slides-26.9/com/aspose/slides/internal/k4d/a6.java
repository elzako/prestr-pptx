package com.aspose.slides.internal.k4d;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.n2d.t2;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class a6 {
   private static final byte[] n5 = new byte[]{71, 73, 70, 56, 57, 97};
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "bmp", "emf", "jpg", "jpeg", "png", "wmf", "pict", "pct", "gif", "tif", "tiff", "IHDR", "pHYs", "IEND"
   );

   public static boolean n5(byte[] var0) {
      return l6(l6(var0));
   }

   public static int l6(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         try {
            if (t2(var0)) {
               return 2;
            }

            if (s7(var0)) {
               return 2;
            }

            if (x8(var0)) {
               return 1;
            }

            if (u3(var0)) {
               return 4;
            }

            if (a6(var0)) {
               return 5;
            }

            if (u9(var0)) {
               return 6;
            }

            if (c8(var0)) {
               return 3;
            }

            if (h0(var0)) {
               return 7;
            }

            if (k5(var0)) {
               return 8;
            }
         } catch (RuntimeException var2) {
         }

         return 0;
      } else {
         return 0;
      }
   }

   public static String n5(int var0) {
      switch (var0) {
         case 1:
            return "emf";
         case 2:
            return "wmf";
         case 3:
            return "pict";
         case 4:
            return "jpeg";
         case 5:
            return "png";
         case 6:
            return "bmp";
         case 7:
            return "gif";
         case 8:
            return "tif";
         default:
            throw new InvalidOperationException("Cannot convert image type to string.");
      }
   }

   public static boolean k5(byte[] var0) {
      return u9.n5(var0);
   }

   public static boolean u3(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         long var3 = var2.r4() & 65535;
         return (var3 & 4294967295L) == 55551L;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean a6(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         long var3 = var2.c4();
         if ((var3 & 4294967295L) != 1196314761L) {
            return false;
         }

         long var6 = var2.c4();
         return (var6 & 4294967295L) == 169478669L;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean u9(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         long var3 = var2.r4() & 65535;
         if ((var3 & 4294967295L) != 19778L) {
            return false;
         }

         long var6 = var2.c4();
         var2.c4();
         long var8 = var2.c4();
         if ((var6 & 4294967295L) != 0L && (var8 & 4294967295L) > (var6 & 4294967295L)) {
            return false;
         }

         long var11 = 12L;
         long var13 = 16L;
         long var15 = var2.c4();
         boolean var17 = var15 == 12L;
         if (!var17 && (var15 & 4294967295L) < 16L) {
            return false;
         }

         if (var17) {
            var2.c4();
         } else {
            var2.m3();
            var2.m3();
         }

         long var19 = var2.r4() & 65535;
         if ((var19 & 4294967295L) != 1L) {
            return false;
         }

         long var22 = var2.r4() & 65535;
         return (var22 & 4294967295L) == 1L
            || (var22 & 4294967295L) == 4L
            || (var22 & 4294967295L) == 8L
            || (var22 & 4294967295L) == 16L
            || (var22 & 4294967295L) == 24L
            || (var22 & 4294967295L) == 32L;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean h0(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         int var3 = var2.m3() & 16777215;
         return var3 == 4606279;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean n5(byte[] var0, int[] var1) {
      var1[0] = -1;
      if (!a6(var0)) {
         return false;
      }

      var1[0] = com.aspose.slides.internal.n2d.n5.n5(var0, 0, var0.length, n5);
      return var1[0] != -1;
   }

   public static boolean c8(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         var2.r4();
         var2.r4();
         var2.r4();
         var2.r4();
         var2.r4();
         int var3 = com.aspose.slides.internal.n2d.a6.l6(var2.r4()) & 65535;
         if (var3 == 273) {
            return true;
         }

         if (var3 == 17) {
            int var4 = com.aspose.slides.internal.n2d.a6.l6(var2.r4()) & 65535;
            if (var4 == 767) {
               return true;
            }
         }

         return false;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean t2(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         short var3 = var2.k7();
         if (var3 != 0 && var3 != 1) {
            return false;
         }

         short var4 = var2.k7();
         if (var4 != 9) {
            return false;
         }

         var2.k7();
         var2.m3();
         var2.k7();
         var2.m3();
         short var5 = var2.k7();
         return var5 == 0;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean n5(t4 var0) {
      boolean var1 = true;
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var0);
      short var3 = var2.k7();
      if (var3 != 0 && var3 != 1) {
         var1 = false;
      }

      short var4 = var2.k7();
      if (var4 != 9) {
         var1 = false;
      }

      var2.k7();
      var2.m3();
      var2.k7();
      var2.m3();
      short var5 = var2.k7();
      if (var5 != 0) {
         var1 = false;
      }

      var0.setPosition(0L);
      return var1;
   }

   public static boolean s7(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         long var3 = var2.c4();
         if ((var3 & 4294967295L) != 2596720087L) {
            return false;
         }

         short var5 = var2.k7();
         return var5 == 0;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean l6(t4 var0) {
      boolean var1 = true;
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var0);
      long var3 = var2.c4();
      if ((var3 & 4294967295L) != 2596720087L) {
         var1 = false;
      }

      short var5 = var2.k7();
      if (var5 != 0) {
         var1 = false;
      }

      var0.setPosition(0L);
      return var1;
   }

   public static boolean x8(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         return k5(var1);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean k5(t4 var0) {
      if (var0.getLength() < 88L) {
         return false;
      }

      boolean var1 = true;
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var0);
      long var3 = var2.c4();
      if ((var3 & 4294967295L) != 1L) {
         var1 = false;
      }

      var2.x8().setPosition(40L);
      long var5 = var2.c4();
      if ((var5 & 4294967295L) != 1179469088L) {
         var1 = false;
      }

      var0.setPosition(0L);
      return var1;
   }

   public static boolean l6(int var0) {
      return var0 == 2 || var0 == 1;
   }

   public static int u3(t4 var0) {
      if (k5(var0)) {
         com.aspose.slides.internal.z0k.n5 var1 = new com.aspose.slides.internal.z0k.n5(var0);
         var1.c4();
         long var2 = var1.c4();
         var1.x8().setPosition(var2 & 4294967295L);
         long var4 = var1.c4();
         if ((var4 & 4294967295L) != 70L) {
            return 3;
         }

         var1.m3();
         var1.m3();
         int var6 = var1.m3();
         if (var6 == 726027589) {
            int var7 = var1.r4() & 65535;
            if (var7 != 16385) {
               return 3;
            }

            int var8 = var1.r4() & 65535;
            return (var8 & 1) == 1 ? 5 : 4;
         } else {
            return 3;
         }
      } else {
         return 0;
      }
   }

   public static int a6(t4 var0) {
      if (n5(var0)) {
         return 1;
      } else {
         return l6(var0) ? 2 : u3(var0);
      }
   }

   public static int u9(t4 var0) {
      var0.setPosition(0L);
      return a6(var0);
   }

   public static byte[] n5(com.aspose.slides.internal.z0k.n5 var0, int var1) {
      int var2 = (int)var0.x8().getPosition();
      l6 var3 = new l6();
      var3.n5(var0);
      var0.x8().setPosition(var2);
      byte[] var4 = new byte[14 + var1];
      e2 var5 = new e2(var4);

      try {
         com.aspose.slides.internal.z0k.l6 var6 = new com.aspose.slides.internal.z0k.l6(var5);
         n5 var7 = new n5();
         var7.l6 = 14 + var1 & 4294967295L;
         var7.a6 = 54 + var3.n5() & 4294967295L;
         var7.n5(var6);
         var6.k5();
         var0.n5(var4, 14, var1);
         return var4;
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   public static byte[] n5(com.aspose.slides.internal.z0k.n5 var0, int var1, int var2) {
      int var3 = (int)var0.x8().getPosition();
      l6 var4 = new l6();
      var4.n5(var0);
      boolean var5 = var4.n5;
      int var6 = 40 + var4.n5();
      byte[] var7 = var0.c8(var4.n5());
      var0.x8().setPosition(var3 + var1);
      byte[] var8 = new byte[14 + var6 + var2];
      e2 var9 = new e2(var8);

      try {
         com.aspose.slides.internal.z0k.l6 var10 = new com.aspose.slides.internal.z0k.l6(var9);
         n5 var11 = new n5();
         var11.l6 = 14 + var6 + var2 & 4294967295L;
         var11.a6 = 14 + var6 & 4294967295L;
         var11.n5(var10);
         var4.n5(var10);
         var10.n5(var7);
         var10.k5();
         var0.n5(var8, 14 + var6, var2);
         return var5 ? new byte[0] : var8;
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   public static u3 n3(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         var1.setPosition(14L);
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         l6 var3 = new l6();
         var3.n5(var2);
         return u3.n5(var3.k5, q1.n5(var3.u3), k5(var3.t2), k5(var3.s7));
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static u3 y4(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         var1.setPosition(6L);
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         int var3 = var2.r4();
         int var4 = var2.r4();
         return u3.n5(var3 & 65535, var4 & 65535, 0.0, 0.0);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static u3 e2(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.n2d.k5 var2 = new com.aspose.slides.internal.n2d.k5(var1);
         byte var3 = 8;
         var1.setPosition(8L);
         int var4 = 0;
         int var5 = 0;
         double var6 = 0.0;
         double var8 = 0.0;
         boolean var10 = false;

         while (!var10 && var1.getPosition() < var1.getLength()) {
            long var11 = var2.k5();
            String var13 = d1.n5(var2.l6(4));
            switch (l6.n5(var13)) {
               case 11:
                  var4 = var2.l6();
                  var5 = var2.l6();
                  var1.seek(-8L, 1);
                  break;
               case 12:
                  int var14 = (int)var2.k5();
                  int var15 = (int)var2.k5();
                  short var16 = (short)(var2.u9() & 0xFF);
                  if (var16 == 1) {
                     var6 = k5(var14);
                     var8 = k5(var15);
                  }

                  var10 = true;
                  break;
               case 13:
                  var10 = true;
            }

            var1.seek((var11 & 4294967295L) + 4L & 4294967295L, 1);
         }

         return u3.n5(var4, var5, var6, var8);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static u3 t9(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.n2d.k5 var2 = new com.aspose.slides.internal.n2d.k5(var1);
         var2.a6();
         int var3 = var2.a6();
         w1 var4 = w1.n5.u3();

         while ((var3 & 65535 & 65520) != 65472 || (var3 & 65535) == 65476 || (var3 & 65535) == 65484) {
            w1[] var5 = new w1[]{var4};
            boolean var6 = n5(var3, var2, var5);
            var5[0].n5(var4);
            if (!var6) {
               int var7 = var2.a6();
               var1.seek((var7 & 65535) - 2, 1);
            }

            var3 = var2.a6();
         }

         byte var13 = 2;
         boolean var14 = true;
         var1.seek(3L, 1);
         int var15 = var2.a6() & 65535;
         int var8 = var2.a6() & 65535;
         return u3.n5(var8, var15, var4.l6(), var4.k5());
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private static boolean n5(int var0, com.aspose.slides.internal.n2d.k5 var1, w1[] var2) {
      if ((var0 & 65535) == 65504) {
         n5(var1, var2);
         return true;
      } else if ((var0 & 65535) == 65505) {
         l6(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   private static void n5(com.aspose.slides.internal.n2d.k5 var0, w1[] var1) {
      int var2 = var0.a6();
      byte var3 = 5;
      byte var4 = 2;
      var0.n5().seek(7L, 1);
      short var5 = (short)(var0.u9() & 0xFF);
      int var6 = var0.a6();
      int var7 = var0.a6();
      switch (var5) {
         case 0:
         default:
            break;
         case 1:
            var1[0] = new w1(var6 & 65535, var7 & 65535);
            break;
         case 2:
            double var8 = 2.54;
            var1[0] = new w1((float)((var6 & 65535) * 2.54), (float)((var7 & 65535) * 2.54));
      }

      var0.n5().seek((var2 & 65535) - 14, 1);
   }

   private static void l6(com.aspose.slides.internal.n2d.k5 var0, w1[] var1) {
      long var2 = var0.n5().getPosition();
      int var4 = var0.a6();
      String var5 = d1.n5(var0.l6(6));
      if (d1.l6(var5, "Exif")) {
         u9 var6 = new u9(var0);
         if (var6.k5() > 0.0 && var6.u3() > 0.0) {
            var1[0] = new w1((float)var6.k5(), (float)var6.u3());
         }
      }

      var0.n5().setPosition(var2 + (var4 & 65535));
   }

   public static u3 z1(byte[] var0) {
      u9 var1 = new u9(var0);
      return u3.n5(var1.n5(), var1.l6(), var1.k5(), var1.u3());
   }

   public static u3 t4(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         var2.r4();
         int var3 = com.aspose.slides.internal.n2d.a6.l6(var2.r4()) & 65535;
         int var4 = com.aspose.slides.internal.n2d.a6.l6(var2.r4()) & 65535;
         int var5 = com.aspose.slides.internal.n2d.a6.l6(var2.r4()) & 65535;
         int var6 = com.aspose.slides.internal.n2d.a6.l6(var2.r4()) & 65535;
         int var7 = t2.s7(var6 - var4);
         int var8 = t2.s7(var5 - var3);
         return u3.n5(var4, var3, var6, var5, var7, var8);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean q0(byte[] var0) {
      if (var0.length < 4) {
         return false;
      } else if ((var0[0] & 255) == 215 && (var0[1] & 255) == 205 && (var0[2] & 255) == 198 && (var0[3] & 255) == 154) {
         return true;
      } else if (var0[0] == 1 && var0[1] == 0 && var0[2] == 9 && var0[3] == 0) {
         return true;
      } else {
         return var0.length < 48
            ? false
            : var0[40] == 32 && var0[41] == 69 && var0[42] == 77 && var0[43] == 70 && var0[44] == 0 && var0[45] == 0 && var0[46] == 1 && var0[47] == 0;
      }
   }

   public static u3 z3(byte[] var0) {
      return n5(var0, l6(var0));
   }

   public static u3 n5(byte[] var0, int var1) {
      switch (var1) {
         case 3:
            return t4(var0);
         case 4:
            return t9(var0);
         case 5:
            return e2(var0);
         case 6:
            return n3(var0);
         case 7:
            return y4(var0);
         case 8:
            return z1(var0);
         default:
            return u3.n5(100, 100, 96.0, 96.0);
      }
   }

   public static z1 n5(com.aspose.slides.internal.o9b.t4 var0) {
      return z1.n5(var0);
   }

   public static f2 n5(float var0, float var1) {
      if (var0 * var1 <= 8388608.0F) {
         return new f2(var0, var1);
      }

      f2 var2 = new f2();
      double var3 = var0 / var1;
      var2.n5((float)(q1.z3(8388608.0 * var3) + 0.5));
      var2.l6((float)(var2.l6() / var3 + 0.5));
      return var2;
   }

   public static double k5(int var0) {
      return var0 / 39.37007874015748;
   }
}
