package com.aspose.slides.internal.e8;

import com.aspose.slides.ms.System.q1;

public class m1 extends com.aspose.slides.internal.k4.l6 {
   @Override
   public com.aspose.slides.internal.g1.n5 n5(
      com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3
   ) {
      com.aspose.slides.internal.i3.k7 var4 = (com.aspose.slides.internal.i3.k7)var1;
      if ((var4.u3() & 2) > 0) {
         return new com.aspose.slides.internal.g1.n5(var4.u9().u9().n3());
      }

      if (var3.s7() == null) {
         return com.aspose.slides.internal.g1.n5.k5();
      }

      com.aspose.slides.internal.o9b.e5 var5 = new com.aspose.slides.internal.o9b.e5();
      if ((var4.u3() & 128) > 0) {
         var5.k5(var5.k5() | 1);
      }

      if ((var4.u3() & 2048) > 0) {
         var5.n5(com.aspose.slides.internal.x7n.l6.k5().t2(), 2);
      }

      if ((var4.u3() & 1024) > 0) {
         var5.n5(com.aspose.slides.internal.x7n.l6.u3().t2(), 1);
      }

      float var6 = var4.l6();
      float var7 = var4.n5();
      if ((var3.t9() & 65535 & 1) == 1) {
         var6 = var3.t4().n5();
         var7 = var3.t4().l6();
      }

      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(var6, var7);
      com.aspose.slides.internal.o9b.n3 var9 = var3.s7().t4();
      com.aspose.slides.internal.e1x.i1 var10 = var3.s7().q0();
      String var11 = com.aspose.slides.internal.r0.l6.n5(var3.s7().s7(), var10).l6(var4.h0(), 0, var4.k5());
      com.aspose.slides.internal.o9b.y1 var12 = new com.aspose.slides.internal.o9b.y1();
      com.aspose.slides.internal.x4g.x8 var13 = var2.l6();
      if ((var4.u3() & 4) > 0) {
         com.aspose.slides.internal.o9b.y1.n5(var4.u9().u9()).a6(var12);
      }

      com.aspose.slides.internal.o9b.y1 var14 = n5(var8.u3(), var11, var10, var9, var4.c8(), var2, var3).y4();
      float var15 = 0.0F;
      if (!com.aspose.slides.ms.System.d1.n5(var11)) {
         var15 = var10.n5((float)var10.h0().l6(var11.charAt(0)).u3(), (float)var9.c8()) * n5(var3);
      }

      if (var15 > 0.0F) {
         var15 = 0.0F;
      }

      com.aspose.slides.internal.o9b.y1 var16 = new com.aspose.slides.internal.o9b.y1(var14.x8() + var15, var14.n3(), var14.s7() - var15, var14.k5());
      if ((var4.u3() & 4) > 0) {
         com.aspose.slides.internal.o9b.y1.n5(var16.y4(), var12.y4()).a6(var16);
      }

      if (var3.s7().u3() != 0) {
         com.aspose.slides.internal.x4g.m1 var17 = new com.aspose.slides.internal.x4g.m1();
         var17.n5(-var3.s7().u3() / 10.0F, var8.u3());
         com.aspose.slides.internal.o9b.a0 var18 = new com.aspose.slides.internal.o9b.a0(var16.y4());
         var18.l6(var17);
         var2.a6();
         var18.n5(var2).a6(var16);
         var2.n5(var13);
      }

      return new com.aspose.slides.internal.g1.n5(com.aspose.slides.internal.o9b.y2.l6(var16.y4()).n3());
   }

   private static com.aspose.slides.internal.o9b.y1 n5(
      com.aspose.slides.internal.o9b.w1 var0,
      String var1,
      com.aspose.slides.internal.e1x.i1 var2,
      com.aspose.slides.internal.o9b.n3 var3,
      short[] var4,
      com.aspose.slides.internal.o9b.z1 var5,
      com.aspose.slides.internal.g1.u9 var6
   ) {
      float var7 = var0.l6();
      float var8 = var0.k5();
      if ((var6.t9() & 65535 & 24) == 24) {
         var8 -= var2.n5((float)var2.s7(), (float)var3.c8());
      } else if ((var6.t9() & 65535 & 8) == 8) {
         var8 -= var2.n5((float)var2.n3(), (float)var3.c8());
      }

      float var9 = n5(var1, var4, var2, var3, var5, var6);
      if ((var6.t9() & 65535 & 6) == 6) {
         var7 -= var9 / 2.0F;
      } else if ((var6.t9() & 65535 & 2) == 2) {
         var7 -= var9;
      }

      float var10 = var5.n5(var1, var3, Integer.MAX_VALUE, com.aspose.slides.internal.o9b.e5.t2()).k5();
      return new com.aspose.slides.internal.o9b.y1(var7, var8, var9, var10);
   }

   public static float n5(com.aspose.slides.internal.g1.u9 var0) {
      float var1 = 1.0F;
      if (!var0.d2() && var0.s7() != null && !com.aspose.slides.ms.System.d1.n5(var0.s7().t9())) {
         com.aspose.slides.internal.x4g.m1 var2 = var0.f2();
         var1 = var2.n5()[3] / var2.n5()[0];
      }

      return var1;
   }

   private static float n5(
      String var0,
      short[] var1,
      com.aspose.slides.internal.e1x.i1 var2,
      com.aspose.slides.internal.o9b.n3 var3,
      com.aspose.slides.internal.o9b.z1 var4,
      com.aspose.slides.internal.g1.u9 var5
   ) {
      float var6 = 0.0F;
      if (var1 != null) {
         float var7 = 0.0F;
         float var8 = 0.0F;
         float var9 = 0.0F;
         int var10 = 0;
         int var11 = 0;

         while (var10 < var0.length()) {
            short var12 = var1[var11];
            float var13 = var2.n5(var0.charAt(var10), var3.c8()) * n5(var5);
            var8 = q1.n5(var8, var9 + q1.n5(var12, var13));
            int var14 = com.aspose.slides.internal.r0.l6.n5(var5.s7().s7(), var2).n5(com.aspose.slides.ms.System.t9.q0(var0.charAt(var10)));
            var9 += var1[var11];
            var11 += var14;
            var10++;
         }

         var6 = var8 - var7;
      } else {
         var6 += var2.n5(var0, var3.c8()) * n5(var5);
         if (q1.n5(var2.w1()) > 0.0F) {
            var6 += (float)(var3.c8() * q1.t2(q1.n5(var2.w1()) * Math.PI / 180.0));
         }
      }

      return var6;
   }
}
