package com.aspose.slides.internal.g0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.s7;

public class u3 {
   public static r4 n5(w1[] var0, boolean var1) {
      r4 var2 = new r4();
      c4 var3 = c4.n5(var0, var1);
      var2.n5(var3);
      return var2;
   }

   public static r4 n5(w1[][] var0, boolean var1) {
      r4 var2 = new r4();

      for (w1[] var6 : var0) {
         c4 var7 = c4.n5(var6, var1);
         var2.n5(var7);
      }

      return var2;
   }

   public static r4 n5(j5[] var0) {
      return n5(com.aspose.slides.internal.p1.n5.n5(var0));
   }

   public static r4 n5(w1[] var0) {
      r4 var1 = new r4();
      c4 var2 = c4.n5(var0);
      var1.n5(var2);
      return var1;
   }

   public static r4 n5(y1 var0, w1 var1, w1 var2) {
      r4 var3 = new r4();
      c4 var4 = new c4();
      var3.n5(var4);
      com.aspose.slides.internal.e1.n5 var5 = new com.aspose.slides.internal.e1.l6().n5(var0.y4(), var1.u3(), var2.u3());
      var4.n5(var5);
      return var3;
   }

   public static r4 n5(y1 var0, float var1, float var2) {
      r4 var3 = new r4();
      c4 var4 = new c4();
      var3.n5(var4);
      com.aspose.slides.internal.e1.n5 var5 = new com.aspose.slides.internal.e1.n5(var0.y4(), var1, var2);
      var4.n5(var5);
      return var3;
   }

   public static r4 n5(y1 var0) {
      r4 var1 = new r4();
      c4 var2 = new c4();
      var1.n5(var2);
      com.aspose.slides.internal.e1.n5 var3 = new com.aspose.slides.internal.e1.n5(var0.y4());
      var2.n5(var3);
      return var1;
   }

   public static r4 l6(y1 var0, w1 var1, w1 var2) {
      r4 var3 = new r4();
      c4 var4 = new c4();
      var3.n5(var4);
      com.aspose.slides.internal.e1.n5 var5 = new com.aspose.slides.internal.e1.l6().n5(var0.y4(), var1.u3(), var2.u3(), 1);
      var4.n5(var5);
      y2 var6 = new y2();
      var6.n5().addItem(var5.c8().u3());
      var6.n5().addItem(var5.n5().u3());
      var4.n5(var6);
      return var3;
   }

   public static r4 l6(y1 var0, float var1, float var2) {
      r4 var3 = new r4();
      c4 var4 = new c4();
      var3.n5(var4);
      com.aspose.slides.internal.e1.n5 var5 = new com.aspose.slides.internal.e1.n5(var0.y4(), var1, var2);
      var4.n5(var5);
      y2 var6 = new y2();
      var6.n5().addItem(var5.c8().u3());
      var6.n5().addItem(var5.n5().u3());
      var4.n5(var6);
      return var3;
   }

   public static r4 k5(y1 var0, w1 var1, w1 var2) {
      r4 var3 = new r4();
      c4 var4 = new c4();
      var3.n5(var4);
      com.aspose.slides.internal.e1.n5 var5 = new com.aspose.slides.internal.e1.l6().n5(var0.y4(), var1.u3(), var2.u3(), 1);
      var4.n5(var5);
      y2 var6 = new y2();
      var6.n5().addItem(var5.n5().u3());
      var4.n5(var6);
      return var3;
   }

   public static r4 n5(y1 var0, f2 var1) {
      r4 var2 = new r4();
      c4 var3 = new c4();
      var2.n5(var3);
      f2 var4 = new f2(var1.l6() / 2.0F, var1.k5() / 2.0F);
      y2 var5 = new y2();
      var5.n5().addItem(new w1(var0.a6() + var4.l6(), var0.t2()));
      var5.n5().addItem(new w1(var0.h0() - var4.l6(), var0.t2()));
      var3.n5(var5);
      com.aspose.slides.internal.e1.l6 var6 = new com.aspose.slides.internal.e1.l6();
      com.aspose.slides.internal.e1.n5 var7 = var6.n5(
         new y1(var0.h0() - var1.l6(), var0.t2(), var1.l6(), var1.k5()), new w1(var0.h0() - var4.l6(), var0.t2()), new w1(var0.h0(), var0.t2() + var4.k5())
      );
      var3.n5(var7);
      y2 var8 = new y2();
      var8.n5().addItem(new w1(var0.h0(), var0.l6() - var4.k5()));
      var3.n5(var8);
      com.aspose.slides.internal.e1.n5 var9 = var6.n5(
         new y1(var0.h0() - var1.l6(), var0.l6() - var1.k5(), var1.l6(), var1.k5()),
         new w1(var0.h0(), var0.l6() - var4.k5()),
         new w1(var0.h0() - var4.l6(), var0.l6())
      );
      var3.n5(var9);
      y2 var10 = new y2();
      var10.n5().addItem(new w1(var0.a6() + var4.l6(), var0.l6()));
      var3.n5(var10);
      com.aspose.slides.internal.e1.n5 var11 = var6.n5(
         new y1(var0.a6(), var0.l6() - var1.k5(), var1.l6(), var1.k5()), new w1(var0.a6() + var4.l6(), var0.l6()), new w1(var0.a6(), var0.l6() - var4.k5())
      );
      var3.n5(var11);
      y2 var12 = new y2();
      var12.n5().addItem(new w1(var0.a6(), var0.t2() + var4.k5()));
      var3.n5(var12);
      com.aspose.slides.internal.e1.n5 var13 = var6.n5(
         new y1(var0.a6(), var0.t2(), var1.l6(), var1.k5()), new w1(var0.a6(), var0.t2() + var4.k5()), new w1(var0.a6() + var4.l6(), var0.t2())
      );
      var3.n5(var13);
      return var2;
   }

   private static w1[] n5(w1[] var0, int var1, float var2) {
      w1[] var3 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 4));
      int var4 = var1 - 1;
      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1 + 1;
      int var6 = var1 + 2;
      if (var6 > var0.length - 1) {
         var6 = var5;
      }

      w1 var7 = var0[var1].u3();
      w1 var8 = var0[var5].u3();
      w1 var9 = new w1(var2 * (var0[var5].l6() - var0[var4].l6()), var2 * (var0[var5].k5() - var0[var4].k5()));
      w1 var10 = new w1(var2 * (var0[var6].l6() - var0[var1].l6()), var2 * (var0[var6].k5() - var0[var1].k5()));
      w1 var11 = new w1((var9.l6() + 3.0F * var7.l6()) / 3.0F, (var9.k5() + 3.0F * var7.k5()) / 3.0F);
      w1 var12 = new w1((3.0F * var8.l6() - var10.l6()) / 3.0F, (3.0F * var8.k5() - var10.k5()) / 3.0F);
      var7.n5(var3[0]);
      var11.n5(var3[1]);
      var12.n5(var3[2]);
      var8.n5(var3[3]);
      return var3;
   }

   public static w1[] n5(w1[] var0, boolean var1, float var2) {
      int var3 = var0.length - 1;
      if (var1) {
         var3++;
      }

      w1[] var4 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), var3 * 3 + 1));
      w1[] var5;
      if (var1) {
         var5 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), var0.length + 3));
         com.aspose.slides.ms.System.u3.n5((Object)(var0)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var5)), 1);
         var0[var0.length - 1].n5(var5[0]);
         var5[1].n5(var5[var0.length + 1]);
         var5[2].n5(var5[var0.length + 2]);
      } else {
         var5 = var0;
      }

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var1 ? var6 + 1 : var6;
         w1[] var8 = n5(var5, var7, var2);
         var8[0].n5(var4[var6 * 3]);
         var8[1].n5(var4[var6 * 3 + 1]);
         var8[2].n5(var4[var6 * 3 + 2]);
         var8[3].n5(var4[var6 * 3 + 3]);
      }

      return var4;
   }

   public static r4 n5(w1[] var0, int[] var1, boolean var2) {
      r4 var3 = new r4();
      c4 var4 = new c4();
      var3.n5(var4);
      var4.n5(var2);
      List var5 = null;
      int var6 = 0;

      for (int var7 = 0; var7 < var0.length; var7++) {
         boolean var8 = var7 == var0.length - 1;
         int var9 = var1[var7];
         if (var9 == 0) {
            if (var5 != null && var5.size() > 0) {
               boolean var10 = var2;
               if ((var6 & 128) != 128) {
                  var10 = false;
               }

               var4.n5(var10);
               n5(var4, var5, var6);
               if (!var8) {
                  var4 = n5(var3, var2);
               }
            }

            var5 = new List();
         }

         int var14 = var6 & 7;
         int var11 = var9 & 7;
         boolean var12 = var6 != 0 && var14 != var11;
         if (var12 && var9 != 0) {
            n5(var4, var5, var6);
            var5 = new List();
            var5.addItem(var0[var7 - 1].u3());
         }

         if (var5 != null) {
            var5.addItem(var0[var7].u3());
         }

         boolean var13 = (var9 & 128) == 128;
         if (var13) {
            n5(var4, var5, var11);
            if (!var8) {
               var4 = n5(var3, var2);
            }

            var5 = new List();
         }

         var6 = var9;
         if (!var13 && var8) {
            n5(var4, var5, var6);
         }
      }

      return var3;
   }

   private static c4 n5(r4 var0, boolean var1) {
      c4 var2 = new c4();
      var0.n5(var2);
      var2.n5(var1);
      return var2;
   }

   public static r4 n5(s7 var0, boolean var1) {
      int[] var2 = com.aspose.slides.internal.p1.n5.n5(var0);
      return n5(var0.a6(), var2, var1);
   }

   private static void n5(c4 var0, List<w1> var1, int var2) {
      if (var1 != null) {
         if ((var2 & 3) == 3) {
            var0.k5(var1.toArray(new w1[0]));
         } else if ((var2 & 1) == 1) {
            var0.l6(var1.toArray(new w1[0]));
         }
      }
   }
}
