package com.aspose.slides.internal.b6;

import com.aspose.slides.internal.i3.i6;

public class l4 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      i6 var4 = (i6)var1;
      com.aspose.slides.internal.o9b.i1 var5 = new com.aspose.slides.internal.o9b.i1(var3.n3().o8());
      com.aspose.slides.internal.o9b.e5 var6 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
      float var7 = var4.k5();
      float var8 = var4.u3();
      com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var7, var8);
      com.aspose.slides.internal.o9b.n3 var10 = var3.s7().n5(true);
      com.aspose.slides.internal.e1x.i1 var11 = com.aspose.slides.internal.e1x.x8.u3().n5(var10.l6().a6(), var10.x8());
      String var12 = com.aspose.slides.internal.r0.l6.n5(var3.s7().s7(), var11).l6(var4.u9(), 0, var4.n5());
      com.aspose.slides.internal.x4g.x8 var13 = var2.l6();
      com.aspose.slides.internal.o9b.y1 var14 = com.aspose.slides.internal.e8.h6.n5(var9.u3(), var12, var11, var10, var3).y4();
      float var15 = var11.n5((float)var11.h0().l6(var12.charAt(0)).u3(), (float)var10.c8()) * com.aspose.slides.internal.e8.m1.n5(var3);
      if (var15 > 0.0F) {
         var15 = 0.0F;
      }

      boolean var16 = false;
      float var17 = 0.0F;
      boolean[] var18 = new boolean[]{false};
      float[] var19 = new float[]{0.0F};
      com.aspose.slides.internal.x4g.m1 var20 = z8.n5(var9.u3(), var2, var3, var18, var19);
      var16 = var18[0];
      var17 = var19[0];
      com.aspose.slides.internal.o9b.y1 var21 = new com.aspose.slides.internal.o9b.y1((var14.x8() + var15) * var17, var14.n3(), var14.s7() - var15, var14.k5());
      if (var3.y4() == 2) {
         var2.l6(new com.aspose.slides.internal.o9b.i1(var3.e2().o8()), var21.y4());
      }

      if (var3.r4() > 0) {
         float var22 = var21.a6();
         float var23 = var21.t2();

         for (int var24 = 0; var24 < var12.length(); var24++) {
            char var25 = var12.charAt(var24);
            String var26 = com.aspose.slides.ms.System.t9.q0(var25);
            float var27 = var11.n5(var25, var10.c8()) + var3.r4();
            z8.n5(var2, var26, var10, var5, new com.aspose.slides.internal.o9b.w1(var22, var23), var6, var20);
            var22 += var27;
         }
      } else {
         z8.n5(var2, var12, var10, var5, var21.u9().u3(), var6, var20);
      }

      var2.n5(var13);
   }
}
