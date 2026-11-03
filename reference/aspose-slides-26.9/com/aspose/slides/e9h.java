package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class e9h {
   public static q7g[] n5(com.aspose.slides.ms.System.i9 var0, com.aspose.slides.internal.o9b.y1 var1, ShapeElement[] var2, int var3) {
      q7g[] var4 = new q7g[var2.length];
      int var5 = var3 == 1 ? com.aspose.slides.internal.v6g.k5.u3(var1.s7(), 13) + 1 : (var3 == 2 ? 45 : 35);

      for (int var6 = 0; var6 < var2.length; var6++) {
         q7g var7 = new q7g();
         com.aspose.slides.internal.x4g.s7 var8 = var2[var6].l6();
         com.aspose.slides.internal.o9b.w1 var9 = com.aspose.slides.internal.o9b.w1.n5.u3();
         int var10 = 0;

         for (int var11 = 0; var10 < var8.u9().length; var11++) {
            int var12 = var8.u9()[var10] & 255 & 7;
            if (var12 == 0) {
               q7g var13 = n5(var8.a6()[var11].u3(), var1.y4());
               var7.n5(var13.h0(), var13.n5());
               var8.a6()[var11].n5(var9);
            }

            if (var12 == 1) {
               q7g var15 = n5(var0, var8.a6()[var11 - 1].u3(), var8.a6()[var11].u3(), var1.y4(), var5);
               var7.n5(var15.h0(), var15.n5());
            }

            if (var12 == 3) {
               com.aspose.slides.internal.o9b.w1[] var16 = new com.aspose.slides.internal.o9b.w1[]{
                  var8.a6()[var11 - 1], var8.a6()[var11], var8.a6()[var11 + 1], var8.a6()[var11 + 2]
               };
               q7g var14 = n5(var16, var1.y4(), var5);
               var7.n5(var14.h0(), var14.n5());
               var10 += 2;
               var11 += 2;
            }

            if ((var8.u9()[var10] & 255 & 128) != 0) {
               q7g var17 = n5(var0, var8.a6()[var11].u3(), var9.u3(), var1.y4(), var5);
               var7.n5(var17.h0(), var17.n5());
               var7.n5(new byte[]{0}, null);
            }

            var10++;
         }

         var7.l6(com.aspose.slides.internal.v6g.k5.u9(var1.k5() * 12700.0F, 13));
         var7.n5(com.aspose.slides.internal.v6g.k5.u9(var1.s7() * 12700.0F, 13));
         var7.n5(var2[var6].getStrokeSource() == 1);
         var4[var6] = var7;
      }

      return var4;
   }

   private static q7g n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.y1 var1) {
      List var2 = new List();
      List var3 = new List();
      var2.addItem((byte)1);
      var3.addItem(var0.u3());
      List var4 = com.aspose.slides.internal.c8e.l6.n5(
         (com.aspose.slides.internal.o9b.w1[])var3.toArray(new com.aspose.slides.internal.o9b.w1[0]), var1.y4(), new com.aspose.slides.internal.x4g.m1()
      );
      return new q7g(var2, var4);
   }

   private static q7g n5(
      com.aspose.slides.ms.System.i9 var0,
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.y1 var3,
      int var4
   ) {
      com.aspose.slides.internal.o9b.w1[] var5 = null;
      com.aspose.slides.internal.o9b.w1[] var6 = null;
      List var7 = new List();
      List var8 = new List();
      float var9 = com.aspose.slides.internal.c8e.l6.n5(var1.u3(), var2.u3());

      for (float var10 = var4 * n5(var0, 0.8F, 1.0F); var9 / var10 >= 2.0F; var10 = var4 * n5(var0, 0.8F, 1.0F)) {
         float var11 = var9 / var10;
         float var12 = var1.l6() + (var2.l6() - var1.l6()) / com.aspose.slides.internal.v6g.k5.u3(var11, 13);
         float var13 = var1.k5() + (var2.k5() - var1.k5()) / com.aspose.slides.internal.v6g.k5.u3(var11, 13);
         com.aspose.slides.internal.o9b.w1 var14 = new com.aspose.slides.internal.o9b.w1(var12, var13);
         var6 = n5(var0, var1.u3(), var14.u3(), var4);
         if (var5 != null) {
            var6[0] = new com.aspose.slides.internal.o9b.w1(var1.l6() + (var1.l6() - var5[1].l6()), var1.k5() + (var1.k5() - var5[1].k5()));
         }

         var8.addItem(var6[0].u3());
         var8.addItem(var6[1].u3());
         var8.addItem(var14.u3());
         var14.n5(var1);
         var7.addItem((byte)5);
         var5 = (com.aspose.slides.internal.o9b.w1[])var6;
         var9 = com.aspose.slides.internal.c8e.l6.n5(var1.u3(), var2.u3());
      }

      var6 = n5(var0, var1.u3(), var2.u3(), var4);
      if (var5 != null) {
         var6[0] = new com.aspose.slides.internal.o9b.w1(var1.l6() + (var1.l6() - var5[1].l6()), var1.k5() + (var1.k5() - var5[1].k5()));
      }

      var8.addItem(var6[0].u3());
      var8.addItem(var6[1].u3());
      var8.addItem(var2.u3());
      var7.addItem((byte)5);
      List var17 = com.aspose.slides.internal.c8e.l6.n5(
         (com.aspose.slides.internal.o9b.w1[])var8.toArray(new com.aspose.slides.internal.o9b.w1[0]), var3.y4(), new com.aspose.slides.internal.x4g.m1()
      );
      return new q7g(var7, var17);
   }

   private static q7g n5(com.aspose.slides.internal.o9b.w1[] var0, com.aspose.slides.internal.o9b.y1 var1, int var2) {
      List var3 = new List();
      List var4 = new List();
      var3.addItem((byte)5);
      float var5 = 10.0F;
      if (var2 == 35) {
         var5 = 6.0F;
      } else if (var2 == 45) {
         var5 = 8.0F;
      }

      float var6 = com.aspose.slides.ms.System.q1.n5(var0[1].l6() - var0[0].l6()) / var5;
      float var7 = com.aspose.slides.ms.System.q1.n5(var0[1].k5() - var0[0].k5()) / var5;
      var4.addItem(new com.aspose.slides.internal.o9b.w1(var0[1].l6() + var6, var0[1].k5() - var7));
      var6 = com.aspose.slides.ms.System.q1.n5(var0[3].l6() - var0[2].l6()) / var5;
      var7 = com.aspose.slides.ms.System.q1.n5(var0[3].k5() - var0[2].k5()) / var5;
      var4.addItem(new com.aspose.slides.internal.o9b.w1(var0[2].l6() - var6, var0[2].k5() + var7));
      var4.addItem(var0[3].u3());
      List var8 = com.aspose.slides.internal.c8e.l6.n5(
         (com.aspose.slides.internal.o9b.w1[])var4.toArray(new com.aspose.slides.internal.o9b.w1[0]), var1.y4(), new com.aspose.slides.internal.x4g.m1()
      );
      return new q7g(var3, var8);
   }

   private static com.aspose.slides.internal.o9b.w1[] n5(
      com.aspose.slides.ms.System.i9 var0, com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, int var3
   ) {
      com.aspose.slides.internal.o9b.w1[] var4 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
      );
      float var5 = n5(var0, 2.0F, 5.0F);
      float var6 = (var2.l6() - var1.l6()) / com.aspose.slides.ms.System.q1.n5(var5);
      float var7 = (var2.k5() - var1.k5()) / com.aspose.slides.ms.System.q1.n5(var5);
      float var8 = 10.0F;
      if (var3 == 45) {
         var8 = 25.0F;
      }

      float var9 = com.aspose.slides.internal.c8e.l6.n5(var1.u3(), var2.u3()) / var8;
      float var10 = n5(var0, com.aspose.slides.ms.System.q1.n5(-var9, -12.0F), com.aspose.slides.ms.System.q1.l6(var9, 12.0F));
      com.aspose.slides.internal.o9b.f2 var11 = com.aspose.slides.internal.c8e.l6.n5(var1.u3(), var2.u3(), var10).a6();
      com.aspose.slides.internal.o9b.w1.n5(new com.aspose.slides.internal.o9b.w1(var1.l6() + var6, var1.k5() + var7), var11).n5(var4[0]);
      var10 = n5(var0, com.aspose.slides.ms.System.q1.n5(-var9, -12.0F), com.aspose.slides.ms.System.q1.l6(var9, 12.0F));
      com.aspose.slides.internal.c8e.l6.n5(var1.u3(), var2.u3(), var10).l6(var11);
      com.aspose.slides.internal.o9b.w1.n5(new com.aspose.slides.internal.o9b.w1(var2.l6() - var6, var2.k5() - var7), var11).n5(var4[1]);
      return var4;
   }

   static float n5(com.aspose.slides.ms.System.i9 var0, float var1, float var2) {
      int var3 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1 * 10000.0), 14);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var2 * 10000.0), 14);
      int var5 = var0.n5(var3, var4);
      return var5 / 10000.0F;
   }
}
