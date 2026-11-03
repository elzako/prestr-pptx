package com.aspose.slides.internal.b6;

import com.aspose.slides.ms.System.q1;

public class z8 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.k7 var4 = (com.aspose.slides.internal.i3.k7)var1;
      if ((var4.u3() & 2) > 0) {
         var2.l6(new com.aspose.slides.internal.o9b.i1(var3.e2().o8()), var4.u9().u9().n3());
      }

      if (var3.s7() != null) {
         com.aspose.slides.internal.o9b.i1 var5 = new com.aspose.slides.internal.o9b.i1(var3.n3().o8());
         com.aspose.slides.internal.o9b.e5 var6 = this.n5(var4.u3());
         int var7 = var4.l6();
         int var8 = var4.n5();
         if ((var3.t9() & 65535 & 1) == 1) {
            var7 = var3.t4().n5();
            var8 = var3.t4().l6();
         }

         com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var7, var8);
         com.aspose.slides.internal.o9b.n3 var10 = var3.s7().t4();
         com.aspose.slides.internal.e1x.i1 var11 = var3.s7().q0();
         String var12 = this.n5(var4, var3.s7().s7(), var11);
         if ((var4.u3() & 4) > 0) {
            var2.n5(var4.u9().u9().n3(), 0);
         }

         com.aspose.slides.internal.x4g.x8 var13 = var2.l6();
         boolean var14 = false;
         float var15 = 0.0F;
         boolean[] var16 = new boolean[]{false};
         float[] var17 = new float[]{0.0F};
         com.aspose.slides.internal.x4g.m1 var18 = n5(var9.u3(), var2, var3, var16, var17);
         var14 = var16[0];
         var15 = var17[0];
         com.aspose.slides.internal.o9b.w1 var19 = n5(var9.u3(), var12, var10.c8(), var14, var15, var3).u3();
         float var20 = var19.l6() - var9.l6();
         float var21 = var19.k5() - var9.k5();
         if (var4.c8() != null && var4.c8().length > 0) {
            short var22 = 0;
            int var23 = 0;

            for (int var24 = 0; var24 < var12.length(); var24++) {
               n5(
                  var2,
                  com.aspose.slides.ms.System.t9.q0(var12.charAt(var24)),
                  var10,
                  var5,
                  com.aspose.slides.internal.o9b.w1.l6(var9.u3(), new com.aspose.slides.internal.o9b.f2(var20 + var22 * var15, var21)).u3(),
                  var6,
                  var18
               );
               int var25 = com.aspose.slides.internal.r0.l6.n5(var3.s7().s7(), var11).n5(com.aspose.slides.ms.System.t9.q0(var12.charAt(var24)));
               if (var25 > 1 && var12.length() == var4.c8().length) {
                  var25 = 1;
               }

               for (int var26 = 0; var26 < var25; var26++) {
                  if (var23 < var4.c8().length) {
                     var22 += var4.c8()[var23];
                  }

                  var23++;
               }
            }

            if ((var3.t9() & 65535 & 1) == 1) {
               var3.k5(new com.aspose.slides.internal.o9b.j5(var7 + var22, var8));
            }
         } else {
            n5(var2, var12, var10, var5, var19.u3(), var6, var18);
         }

         var2.n5(var13);
      }
   }

   public static void n5(
      com.aspose.slides.internal.o9b.z1 var0,
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      com.aspose.slides.internal.o9b.e5 var5,
      com.aspose.slides.internal.x4g.m1 var6
   ) {
      com.aspose.slides.internal.x4g.m1 var7 = var0.m1();

      try {
         if (!var6.equals(var7)) {
            var0.l6(var6);
         }

         var0.n5(var1, var2, var3, com.aspose.slides.internal.v6g.k5.u3(q1.u3(var4.l6()), 14), com.aspose.slides.internal.v6g.k5.u3(q1.u3(var4.k5()), 14), var5);
      } finally {
         var0.l6(var7);
      }
   }

   public static com.aspose.slides.internal.x4g.m1 n5(
      com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.g1.u9 var2, boolean[] var3, float[] var4
   ) {
      com.aspose.slides.internal.x4g.m1 var5 = var1.m1().u9();
      var3[0] = var2.n5() == 8 && var2.u3().n5()[3] < 0.0F && var2.u3().n5()[0] > 0.0F;
      if (var3[0]) {
         var5.n5(1.0F, -1.0F);
      }

      var4[0] = 1.0F;
      float[] var6 = var5.n5();
      if (q1.n5(var6[0] - var6[3]) > 1.0E-4) {
         var4[0] = var6[0] / var6[3];
         var5 = new com.aspose.slides.internal.x4g.m1(var6[3], var6[1], var6[2], var6[3], var6[4], var6[5]);
      }

      if (var2.s7().u3() != 0) {
         var5.n5(-var2.s7().u3() / 10.0F, new com.aspose.slides.internal.o9b.w1(var0.l6() * var4[0], var0.k5()));
      } else if (var2.s7().k5() != 0) {
         var5.n5(-var2.s7().k5() / 10.0F, new com.aspose.slides.internal.o9b.w1(var0.l6() * var4[0], var0.k5()));
      }

      return var5;
   }

   public final com.aspose.slides.internal.o9b.e5 n5(int var1) {
      com.aspose.slides.internal.o9b.e5 var2 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
      if ((var1 & 128) > 0) {
         var2.k5(var2.k5() | 1);
      }

      if ((var1 & 2048) > 0) {
         var2.n5(com.aspose.slides.internal.x7n.l6.k5().t2(), 2);
      }

      if ((var1 & 1024) > 0) {
         var2.n5(com.aspose.slides.internal.x7n.l6.u3().t2(), 1);
      }

      return var2;
   }

   public static com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var0, String var1, float var2, boolean var3, float var4, com.aspose.slides.internal.g1.u9 var5
   ) {
      float var6 = var0.l6() * var4;
      float var7 = var0.k5();
      com.aspose.slides.internal.e1x.i1 var8 = var5.s7().q0();
      int var9 = var8.t2();
      int var10 = var8.x8();
      int var11 = var8.s7();
      int var12 = var10 + var11;
      float var13 = var2 / var9;
      if ((var5.t9() & 65535 & 24) == 24) {
         var7 -= var11 * var13;
      } else if ((var5.t9() & 65535 & 8) == 8) {
         var7 -= var12 * var13;
      }

      float var14 = var8.n5(var1, var2);
      if ((var5.t9() & 65535 & 6) == 6) {
         var6 -= var14 / 2.0F;
      } else if ((var5.t9() & 65535 & 2) == 2) {
         var6 -= var14;
      }

      if (var3) {
         var7 = var7 - var0.k5() - var0.k5();
      }

      return new com.aspose.slides.internal.o9b.w1(var6, var7);
   }

   private String n5(com.aspose.slides.internal.i3.k7 var1, byte var2, com.aspose.slides.internal.e1x.i1 var3) {
      com.aspose.slides.internal.l7h.j5 var4 = com.aspose.slides.internal.r0.l6.n5(var2, var3);
      String var5 = var4.l6(var1.h0(), 0, var1.k5());
      if (var4.t9() == 1252 && !com.aspose.slides.ms.System.d1.n5(var5)) {
         var5 = com.aspose.slides.internal.r7c.c8.n5(var5, "[\\u0080-\\u009F]", "");
      }

      return var5;
   }
}
