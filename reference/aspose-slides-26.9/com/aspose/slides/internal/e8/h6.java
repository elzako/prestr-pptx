package com.aspose.slides.internal.e8;

import com.aspose.slides.internal.i3.i6;
import com.aspose.slides.ms.System.q1;

public class h6 extends com.aspose.slides.internal.k4.l6 {
   @Override
   public com.aspose.slides.internal.g1.n5 n5(
      com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3
   ) {
      i6 var4 = (i6)var1;
      if (var3.s7() == null) {
         return com.aspose.slides.internal.g1.n5.k5();
      }

      float var5 = var4.k5();
      float var6 = var4.u3();
      com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1(var5, var6);
      String var8 = com.aspose.slides.ms.System.d1.l6(var4.l6(), 0, var4.n5());
      com.aspose.slides.internal.o9b.n3 var9 = var3.s7().n5(true);
      com.aspose.slides.internal.e1x.i1 var10 = var3.s7().q0();
      com.aspose.slides.internal.x4g.x8 var11 = var2.l6();
      com.aspose.slides.internal.o9b.y1 var12 = n5(var7.u3(), var8, var10, var9, var3).y4();
      float var13 = 0.0F;
      var13 = var10.n5((float)var10.h0().l6(var8.charAt(0)).u3(), (float)var9.c8()) * m1.n5(var3);
      if (var13 > 0.0F) {
         var13 = 0.0F;
      }

      com.aspose.slides.internal.o9b.y1 var14 = new com.aspose.slides.internal.o9b.y1(var12.x8() + var13, var12.n3(), var12.s7() - var13, var12.k5());
      if (var3.s7().k5() != 0) {
         com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1();
         var15.n5(-var3.s7().k5() / 10.0F, var7.u3());
         com.aspose.slides.internal.o9b.a0 var16 = new com.aspose.slides.internal.o9b.a0(var14.y4());
         var16.l6(var15);
         var2.a6();
         var16.n5(var2).a6(var14);
      }

      var2.n5(var11);
      return new com.aspose.slides.internal.g1.n5(com.aspose.slides.internal.o9b.y2.l6(var14.y4()).n3());
   }

   public static com.aspose.slides.internal.o9b.y1 n5(
      com.aspose.slides.internal.o9b.w1 var0,
      String var1,
      com.aspose.slides.internal.e1x.i1 var2,
      com.aspose.slides.internal.o9b.n3 var3,
      com.aspose.slides.internal.g1.u9 var4
   ) {
      float var5 = var0.l6();
      float var6 = var0.k5();
      int var7 = var2.t2();
      int var8 = var2.x8();
      int var9 = var2.s7();
      int var10 = var8 + var9;
      float var11 = var3.c8() / var7;
      if ((var4.t9() & 65535 & 24) == 24) {
         var6 -= var9 * var11;
      } else if ((var4.t9() & 65535 & 8) == 8) {
         var6 -= var10 * var11;
      }

      float var12 = n5(var1, var2, var3, var4);
      if ((var4.t9() & 65535 & 6) == 6) {
         var5 -= var12 / 2.0F;
      } else if ((var4.t9() & 65535 & 2) == 2) {
         var5 -= var12;
      }

      return new com.aspose.slides.internal.o9b.y1(var5, var6, var12, var2.n5((float)var2.n3(), (float)var3.c8()));
   }

   private static float n5(String var0, com.aspose.slides.internal.e1x.i1 var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.g1.u9 var3) {
      float var4 = 0.0F;
      float var5 = var1.n5(var0, var2.c8());
      if (var3.r4() > 0) {
         var5 += var3.r4() * var0.length();
      }

      var4 += var5 * m1.n5(var3);
      if (q1.n5(var1.w1()) > 0.0F) {
         var4 += (float)(var2.c8() * q1.t2(q1.n5(var1.w1()) * Math.PI / 180.0));
      }

      return var4;
   }
}
