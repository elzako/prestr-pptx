package com.aspose.slides.internal.o9;

import com.aspose.slides.internal.f3.a6;
import com.aspose.slides.internal.f3.u3;
import com.aspose.slides.internal.f3.u9;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.l6;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.w0.t4;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public class n5 {
   public static void n5(l6 var0, com.aspose.slides.ms.System.n5<Integer> var1) {
      p8 var2 = var0.n3().u3();
      int var3 = var2.l6();
      int var4 = var2.k5();
      com.aspose.slides.internal.j9e.n5 var5 = var0.n5(n5(var0).n3(), 1, 2498570);
      x9 var6 = var5.u3();
      int[] var7 = new int[var5.l6() * var5.n5()];
      com.aspose.slides.internal.e3m.n5.n5(var6, var7, 0, var7.length);
      var0.n5(var5);
      int var8 = 0;

      for (int var9 = 0; var9 < var4; var9++) {
         for (int var10 = 0; var10 < var3; var10++) {
            var1.invoke(var7[var8]);
            var8++;
         }
      }

      Object var11 = null;
   }

   public static void n5(l6 var0, y2 var1, u3<Integer, Integer> var2) {
      t4 var3 = new t4(var1.s7(), var1.x8());
      t4 var4 = new t4(var1.t2(), var1.l6());
      t4[] var5 = new t4[]{var3};
      t4[] var6 = new t4[]{var4};
      n5(new t4(var0.e2(), var0.h0()), var5, var6);
      var5[0].n5(var3);
      var6[0].n5(var4);
      var1 = new y2(var3.k5, var3.u3, var4.k5, var4.u3);
      int var7 = var1.t2();
      int var8 = var1.l6();
      if (var7 >= 1 && var8 >= 1) {
         com.aspose.slides.internal.j9e.n5 var9 = var0.n5(var1.n3(), 3, 2498570);

         try {
            x9 var10 = var9.u3();
            int[] var11 = new int[var9.l6() * var9.n5()];
            com.aspose.slides.internal.e3m.n5.n5(var10, var11, 0, var11.length);
            int var12 = 0;

            for (int var13 = 0; var13 < var8; var13++) {
               for (int var14 = 0; var14 < var7; var14++) {
                  var11[var12] = (Integer)var2.invoke(var11[var12]);
                  var12++;
               }
            }

            com.aspose.slides.internal.e3m.n5.n5(var11, 0, var10, var11.length);
            Object var19 = null;
         } finally {
            var0.n5(var9);
         }
      }
   }

   public static void n5(l6 var0, y2 var1, a6<t4, Integer, Integer> var2) {
      t4 var3 = new t4(var1.s7(), var1.x8());
      t4 var4 = new t4(var1.t2(), var1.l6());
      t4[] var5 = new t4[]{var3};
      t4[] var6 = new t4[]{var4};
      n5(new t4(var0.e2(), var0.h0()), var5, var6);
      var5[0].n5(var3);
      var6[0].n5(var4);
      var1 = new y2(var3.k5, var3.u3, var4.k5, var4.u3);
      int var7 = var1.t2();
      int var8 = var1.l6();
      if (var7 >= 1 && var8 >= 1) {
         com.aspose.slides.internal.j9e.n5 var9 = var0.n5(var1.n3(), 3, 2498570);

         try {
            x9 var10 = var9.u3();
            int[] var11 = new int[var9.l6() * var9.n5()];
            com.aspose.slides.internal.e3m.n5.n5(var10, var11, 0, var11.length);
            int var12 = 0;

            for (t4 var13 = t4.n5.n5(); var13.u3 < var8; var13.u3++) {
               for (var13.k5 = 0; var13.k5 < var7; var13.k5++) {
                  var11[var12] = (Integer)var2.n5(var13.n5(), var11[var12]);
                  var12++;
               }
            }

            com.aspose.slides.internal.e3m.n5.n5(var11, 0, var10, var11.length);
            Object var18 = null;
         } finally {
            var0.n5(var9);
         }
      }
   }

   public static void n5(t4 var0, t4 var1, t4[] var2, t4[] var3, t4[] var4) {
      n5(var0.n5(), var2, var4);
      n5(var1.n5(), var3, var4);
   }

   private static void n5(t4 var0, t4[] var1, t4[] var2) {
      t4 var3 = t4.n5(var1[0], var2[0]).n5();
      t4.n5(var1[0].n5(), t4.n5.n5(), t4.l6(var0, t4.l6).n5()).n5(var1[0]);
      t4.n5(var3.n5(), var1[0].n5(), var0.n5()).n5(var3);
      t4.l6(var3, var1[0]).n5(var2[0]);
   }

   public static void n5(l6 var0, l6 var1, t4 var2, t4 var3, t4 var4, a6<Integer, Integer, Integer> var5) {
      int var6 = var4.k5;
      int var7 = var4.u3;
      com.aspose.slides.internal.j9e.n5 var8 = var0.n5(new y2(var2.k5, var2.u3, var6, var7), 3, 2498570);

      try {
         com.aspose.slides.internal.j9e.n5 var9 = var1.n5(new y2(var3.k5, var3.u3, var6, var7), 1, 2498570);

         try {
            x9 var10 = var8.u3();
            x9 var11 = var9.u3();
            int[] var12 = new int[var8.l6() * var8.n5()];
            com.aspose.slides.internal.e3m.n5.n5(var10, var12, 0, var12.length);
            int[] var13 = new int[var9.l6() * var9.n5()];
            com.aspose.slides.internal.e3m.n5.n5(var11, var13, 0, var13.length);
            int var14 = 0;
            int var15 = 0;

            for (int var16 = 0; var16 < var7; var16++) {
               for (int var17 = 0; var17 < var6; var17++) {
                  var12[var14] = (Integer)var5.n5(var12[var14], var13[var15]);
                  var14++;
                  var15++;
               }
            }

            com.aspose.slides.internal.e3m.n5.n5(var12, 0, var10, var12.length);
            Object var26 = null;
            com.aspose.slides.internal.e3m.n5.n5(var13, 0, var11, var13.length);
            Object var27 = null;
         } finally {
            var1.n5(var9);
         }
      } finally {
         var0.n5(var8);
      }
   }

   public static void n5(l6 var0, l6 var1, t4 var2, t4 var3, t4 var4, u9<t4, Integer, Integer, Integer> var5) {
      int var6 = var4.k5;
      int var7 = var4.u3;
      com.aspose.slides.internal.j9e.n5 var8 = var0.n5(new y2(var2.k5, var2.u3, var6, var7), 3, 2498570);

      try {
         com.aspose.slides.internal.j9e.n5 var9 = var1.n5(new y2(var3.k5, var3.u3, var6, var7), 1, 2498570);

         try {
            x9 var10 = var8.u3();
            x9 var11 = var9.u3();
            int[] var12 = new int[var8.l6() * var8.n5()];
            com.aspose.slides.internal.e3m.n5.n5(var10, var12, 0, var12.length);
            int[] var13 = new int[var9.l6() * var9.n5()];
            com.aspose.slides.internal.e3m.n5.n5(var11, var13, 0, var13.length);
            int var14 = 0;
            int var15 = 0;

            for (t4 var16 = t4.n5.n5(); var16.u3 < var7; var16.u3++) {
               for (var16.k5 = 0; var16.k5 < var6; var16.k5++) {
                  var12[var14] = (Integer)var5.n5(var16.n5(), var12[var14], var13[var15]);
                  var14++;
                  var15++;
               }
            }

            com.aspose.slides.internal.e3m.n5.n5(var12, 0, var10, var12.length);
            Object var25 = null;
            com.aspose.slides.internal.e3m.n5.n5(var13, 0, var11, var13.length);
            Object var26 = null;
         } finally {
            var1.n5(var9);
         }
      } finally {
         var0.n5(var8);
      }
   }

   public static void n5(l6 var0, l6 var1, a6<Integer, Integer, Integer> var2) {
      int var3 = q1.l6(var0.e2(), var1.e2());
      int var4 = q1.l6(var0.h0(), var1.h0());
      y2 var5 = new y2(0, 0, var3, var4);
      n5(var0, var1, new t4(var5.a6().n5(), var5.a6().l6()), new t4(var5.a6().n5(), var5.a6().l6()), new t4(var5.h0().l6(), var5.h0().k5()), var2);
   }

   private static y2 n5(l6 var0) {
      return new y2(0, 0, var0.e2(), var0.h0());
   }

   public static c8 n5(c8 var0, c8 var1, double var2) {
      return c8.n5(
         n5(var0.s7() & 255, var1.s7() & 255, var2),
         n5(var0.x8() & 255, var1.x8() & 255, var2),
         n5(var0.n3() & 255, var1.n3() & 255, var2),
         n5(var0.y4() & 255, var1.y4() & 255, var2)
      );
   }

   private static int n5(int var0, int var1, double var2) {
      return k5.u3(var0 + var2 * (var1 - var0), 14);
   }
}
