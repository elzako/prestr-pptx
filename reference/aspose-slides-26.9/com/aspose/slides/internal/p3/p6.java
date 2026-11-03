package com.aspose.slides.internal.p3;

import com.aspose.slides.internal.a0.s3$n5;

public class p6 {
   public static void n5(
      com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.t2 var1, boolean var2, boolean var3, com.aspose.slides.internal.f2.u9 var4
   ) {
      int var5 = var1.n5(2, var2, var4);
      if (var5 > 0) {
         var0.n5(19, var5);
      }

      var5 = var1.n5(3, var3, var4);
      if (var5 > 0) {
         var0.n5(20, var5);
      }

      var5 = var1.n5(0, false, var4);
      if (var5 > 0) {
         var0.n5(21, var5);
      }

      var5 = var1.n5(1, false, var4);
      if (var5 > 0) {
         var0.n5(22, var5);
      }

      n5(var0, var1, var2, 2, 0, 15);
      n5(var0, var1, var3, 3, 0, 16);
      n5(var0, var1, false, 0, 0, 17);
      n5(var0, var1, false, 1, 0, 18);
   }

   private static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.t2 var1, boolean var2, int var3, int var4, int var5) {
      int var6 = var1.n5(var3, var2);
      if (var6 > 0) {
         var0.n5(var5, new com.aspose.slides.internal.v8.n5(var1.k5(var3), var6, var1.l6(var3).o8(), var4, var1.u3(var3)));
      }
   }

   public static void n5(
      com.aspose.slides.internal.a0.l6 var0,
      com.aspose.slides.internal.h2.t2 var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      com.aspose.slides.internal.f2.u9 var6
   ) {
      com.aspose.slides.internal.v8.n5 var7 = n5(var1, 0);
      if (var7 != null && !var2) {
         var0.n5(17, var7);
      }

      var7 = n5(var1, 1);
      if (var7 != null && !var3) {
         var0.n5(18, var7);
      }

      var7 = n5(var1, 2);
      if (var7 != null && !var4) {
         var0.n5(15, var7);
      }

      var7 = n5(var1, 3);
      if (var7 != null && !var5) {
         var0.n5(16, var7);
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.e2 var1, com.aspose.slides.internal.f2.u9 var2) {
      if (var1.k5() > 0) {
         com.aspose.slides.internal.v8.h0 var3 = new com.aspose.slides.internal.v8.h0(var1.n5(), var1.k5(), var1.l6().o8());
         var0.n5(44, var3);
      }
   }

   public static void n5(
      com.aspose.slides.internal.a0.l6 var0,
      com.aspose.slides.internal.h2.t2$n5 var1,
      com.aspose.slides.internal.h2.t2$n5 var2,
      com.aspose.slides.internal.h2.t2$n5 var3,
      com.aspose.slides.internal.h2.t2$n5 var4,
      boolean[] var5
   ) {
      com.aspose.slides.internal.v8.n5 var6 = n5(var1, var5[0]);
      if (var6 != null) {
         var0.n5(17, var6);
      }

      var6 = n5(var2, var5[1]);
      if (var6 != null) {
         var0.n5(18, var6);
      }

      var6 = n5(var3, var5[2]);
      if (var6 != null) {
         var0.n5(15, var6);
      }

      var6 = n5(var4, var5[3]);
      if (var6 != null) {
         var0.n5(16, var6);
      }
   }

   public static void l6(
      com.aspose.slides.internal.a0.l6 var0,
      com.aspose.slides.internal.h2.t2 var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      com.aspose.slides.internal.f2.u9 var6
   ) {
      int var7 = var1.n5(0, var2, var6);
      if (var7 != 0) {
         var0.n5(21, var7);
      }

      var7 = var1.n5(1, var3, var6);
      if (var7 != 0) {
         var0.n5(22, var7);
      }

      var7 = var1.n5(2, var4, var6);
      if (var7 != 0) {
         var0.n5(19, var7);
      }

      var7 = var1.n5(3, var5, var6);
      if (var7 != 0) {
         var0.n5(20, var7);
      }
   }

   private static com.aspose.slides.internal.v8.n5 n5(com.aspose.slides.internal.h2.t2 var0, int var1) {
      int var2 = var0.n5(var1, false);
      return var2 == 0 && var0.u3(var1) == null ? null : new com.aspose.slides.internal.v8.n5(var0.k5(var1), var2, var0.l6(var1).o8(), 0, var0.u3(var1));
   }

   private static com.aspose.slides.internal.v8.n5 n5(com.aspose.slides.internal.h2.t2$n5 var0, boolean var1) {
      int var2 = var0.u3();
      return var2 != 0 ? new com.aspose.slides.internal.v8.n5(var0.n5(), var2, var0.l6().o8(), var1 ? 2 : 1, var0.n5) : null;
   }

   public static void n5(
      com.aspose.slides.internal.a0.l6 var0,
      com.aspose.slides.internal.h2.t2 var1,
      com.aspose.slides.internal.f2.u9 var2,
      int var3,
      int var4,
      int var5,
      int var6
   ) {
      if (var1.a6()) {
         s3$n5 var7 = new s3$n5();
         var7.n5(var1.l6.o8());
         var7.n5 = var1.h0;
         var7.n5(var1.l6());
         if (var1.u3() != null) {
            var7.n5(var1.k5);
            var7.n5(var1.u3());
            var7.l6(var1.u3);
            if (var1.a6 != null && (var7.k5() == 96 || var7.k5() == 114) && var0.l6() > 0) {
               com.aspose.slides.internal.f2.t2 var8 = new com.aspose.slides.internal.f2.t2(var2, 9, var5 - var7.a6().k5().u3());
               var7.n5(var3 + var1.a6.l6(var8));
            }

            if (var1.u9 != null && (var7.k5() == 96 || var7.k5() == 113) && var0.e_() > 0) {
               com.aspose.slides.internal.f2.t2 var9 = new com.aspose.slides.internal.f2.t2(var2, 10, var6 - var7.a6().k5().a6());
               var7.k5(var4 + var1.u9.l6(var9));
            }
         }

         var0.n5(9, var7);
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.t2 var1, com.aspose.slides.internal.f2.u9 var2) {
      if (var1.a6()) {
         s3$n5 var3 = new s3$n5();
         var3.n5(var1.l6.o8());
         var3.n5 = var1.h0;
         var3.n5(var1.l6());
         if (var1.u3() != null) {
            var3.n5(var1.k5);
            var3.n5(var1.u3());
            var3.l6(var1.u3);
            if (var1.a6 != null && (var3.k5() == 96 || var3.k5() == 114) && var0.l6() > 0) {
               int var4 = var0.l6();
               var4 += var1.n5(false, var2);
               var4 += var1.l6(false, var2);
               int var5 = var3.a6().k5().u3();
               int var6 = var4 - var5;
               com.aspose.slides.internal.f2.t2 var7 = new com.aspose.slides.internal.f2.t2(var2, 9, var6);
               int var8 = var1.a6.l6(var7);
               var3.n5(var8);
            }

            if (var1.u9 != null && (var3.k5() == 96 || var3.k5() == 113) && var0.e_() > 0) {
               int var11 = var0.e_();
               var11 += var1.k5(false, var2);
               var11 += var1.u3(false, var2);
               int var14 = var3.a6().k5().a6();
               int var15 = var11 - var14;
               com.aspose.slides.internal.f2.t2 var16 = new com.aspose.slides.internal.f2.t2(var2, 10, var15);
               int var17 = var1.u9.l6(var16);
               var3.k5(var17);
            }
         }

         var0.n5(9, var3);
      }
   }

   public static void n5(
      com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.t2 var1, int var2, int var3, com.aspose.slides.internal.f2.u9 var4
   ) {
      if (var2 != 0) {
         var0.n5(27, var2);
      }

      int var5 = var2 - var1.n5(false) - var1.n5(false, var4);
      if (var5 != 0) {
         var0.n5(23, var5);
      }

      if (var3 != 0) {
         var0.n5(28, var3);
      }

      int var6 = var3 - var1.l6(false) - var1.l6(false, var4);
      if (var6 != 0) {
         var0.n5(24, var6);
      }
   }

   public static void n5(
      com.aspose.slides.internal.a0.l6 var0,
      com.aspose.slides.internal.h2.t2 var1,
      com.aspose.slides.internal.h2.n3 var2,
      com.aspose.slides.internal.f2.u9 var3
   ) {
      int var4 = var2.h0.l6(var3);
      int var5 = var2.c8.l6(var3);
      n5(var0, var1, var4, var5, var3);
   }

   public static int n5(double var0, com.aspose.slides.internal.v8.u9 var2) {
      if (var2 == null) {
         return 0;
      }

      int var3 = var2.l6();
      if (var0 > 0.0) {
         var3 += com.aspose.slides.internal.v6g.k5.u3(var0 * var2.a6(), 14);
      } else {
         var3 += com.aspose.slides.internal.v6g.k5.u3(var0 * var2.u3(), 14);
      }

      return var3;
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, double var1, com.aspose.slides.internal.v8.u9 var3, com.aspose.slides.internal.v8.u9 var4) {
      n5(var0, 29, var3, var1);
      n5(var0, 30, var4, var1);
   }

   private static void n5(com.aspose.slides.internal.a0.l6 var0, int var1, com.aspose.slides.internal.v8.u9 var2, double var3) {
      int var5 = n5(var3, var2);
      if (var5 != 0) {
         var0.n5(var1, var5);
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, int var1, int var2) {
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.v0.u3 var1) {
      var0.n5(3, var1.c8());
      var0.n5(4, var1.t2());
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.z1 var1) {
      if (var1 != null) {
         if (var1.n5()) {
            var0.n5(10, true);
            var0.n5(34, var1.a6().o8());
         }

         if (var1.l6()) {
            var0.n5(11, true);
            var0.n5(35, var1.u9().o8());
         }

         if (var1.k5()) {
            var0.n5(12, true);
            var0.n5(36, var1.h0().o8());
         }

         if (var1.u3()) {
            var0.n5(33, true);
         }
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.c4.n5 var1) {
      if (var1 != null) {
         var0.n5(37, var1);
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, String var1) {
      if (var1 != null && var1.length() > 0) {
         var0.n5(8, var1);
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.f2.u3 var1) {
      if (var1 != null) {
         var0.n5(43, var1);
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.a5 var1) {
      if (var1 != null && var1.a6() != 95) {
         var0.n5(46, var1.a6());
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, int var1) {
      var0.n5(48, var1);
   }

   public static void l6(com.aspose.slides.internal.a0.l6 var0, int var1) {
      var0.n5(49, var1);
   }

   public static void l6(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.a5 var1) {
      if (var1 != null && var1.a6() == 149) {
         var0.n5(50, 149);
      }
   }

   public static void k5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.h2.a5 var1) {
      if (var1 != null && var1.a6() == 149) {
         var0.n5(51, 149);
      }
   }

   public static void k5(com.aspose.slides.internal.a0.l6 var0, int var1) {
      if (var1 != 0) {
         var0.n5(45, new com.aspose.slides.internal.v8.x8(var1));
      }
   }
}
