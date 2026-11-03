package com.aspose.slides.internal.x0;

import com.aspose.slides.internal.b9.s9;

public abstract class u3 extends com.aspose.slides.internal.v6.a6 {
   private com.aspose.slides.internal.x4g.m1 l6;

   protected u3(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   protected void l6(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      this.l6 = var2.<com.aspose.slides.internal.o9b.z1>n5().m1();
   }

   @Override
   protected void k5(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      var2.<com.aspose.slides.internal.o9b.z1>n5().l6(this.l6);
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, int var2, com.aspose.slides.internal.r6.u9 var3) {
      var3.<com.aspose.slides.internal.o9b.z1>n5().n5(var1.n3(), var2);
   }

   @Override
   protected com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var1, String var2, com.aspose.slides.internal.o9b.n3 var3, int var4, float var5, com.aspose.slides.internal.r6.u9 var6
   ) {
      return com.aspose.slides.internal.y6.c8.l6(var1.u3(), var2, var3, var6.n5(), (int)(var6.j5() & 65535L), 1.0F);
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.i1 var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.r6.u9 var3) {
      var3.<com.aspose.slides.internal.o9b.z1>n5().l6(var1, var2.y4());
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.m1 var1, com.aspose.slides.internal.r6.u9 var2) {
      if (!var1.l6()) {
         com.aspose.slides.internal.o9b.z1 var3 = var2.n5();
         com.aspose.slides.internal.x4g.m1 var4 = var3.m1().u9();
         var4.n5(var1, 0);
         var3.l6(var4);
      }
   }

   @Override
   protected com.aspose.slides.internal.x4g.x8 n5(com.aspose.slides.internal.r6.u9 var1) {
      return var1.<com.aspose.slides.internal.o9b.z1>n5().l6();
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.x8 var1, com.aspose.slides.internal.r6.u9 var2) {
      var2.<com.aspose.slides.internal.o9b.z1>n5().n5(var1);
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.r6.u9 var2) {
      var2.<com.aspose.slides.internal.o9b.z1>n5().c8(var1);
   }

   @Override
   protected void l6(int var1, com.aspose.slides.internal.r6.u9 var2) {
      var2.<com.aspose.slides.internal.o9b.z1>n5().a6(var1);
   }

   @Override
   protected com.aspose.slides.internal.o9b.f2 n5(
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.e5 var4,
      com.aspose.slides.internal.r6.u9 var5
   ) {
      return var5.<com.aspose.slides.internal.o9b.z1>n5().n5(var1, var2, var3.u3(), var4);
   }

   @Override
   protected void n5(
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.y1 var4,
      com.aspose.slides.internal.o9b.e5 var5,
      byte var6,
      long var7,
      com.aspose.slides.internal.r6.u9 var9,
      boolean var10
   ) {
      com.aspose.slides.internal.o9b.z1 var11 = var9.n5();
      int var12 = var11.z3();
      com.aspose.slides.internal.x4g.m1 var13 = var11.m1();
      if (var10) {
         com.aspose.slides.internal.x4g.m1 var14 = var11.m1();
         var14.n5(1.0F, -1.0F);
         var11.l6(var14);
      }

      if (var12 == 5) {
         com.aspose.slides.internal.o9b.f2 var36 = var11.n5(var1, var2, var4.u9().u3(), var5).a6();
         com.aspose.slides.internal.o9b.y1 var15 = new com.aspose.slides.internal.o9b.y1(var4.u9().u3(), var36.a6());
         com.aspose.slides.internal.o9b.a0 var16 = var11.u9();
         var11.u3();
         com.aspose.slides.internal.x4g.m1 var17 = var11.m1();
         var11.l6(new com.aspose.slides.internal.x4g.m1());
         com.aspose.slides.internal.x4g.m1 var18 = var17.u9();
         var18.h0();
         com.aspose.slides.internal.o9b.a0 var19 = new com.aspose.slides.internal.o9b.a0();
         var19.l6(var18);
         var19.l6(var15.y4());
         var19.l6(var17);
         com.aspose.slides.internal.o9b.y1 var20 = var19.n5(var11).y4();
         var11.l6(var17);
         var11.l6(var16);
         int var21 = com.aspose.slides.internal.v6g.k5.u3(var20.x8(), 13) - 1;
         int var22 = com.aspose.slides.internal.v6g.k5.u3(var20.n3(), 13) - 1;
         int var23 = com.aspose.slides.internal.v6g.k5.u3(var20.s7(), 13) + 3;
         int var24 = com.aspose.slides.internal.v6g.k5.u3(var20.k5(), 13) + 3;
         long var25 = var9.q0().h0() & 4294967295L;
         com.aspose.slides.internal.o9b.l6 var27 = var9.z7();
         if (var21 < 0) {
            var21 = 0;
         }

         if (var22 < 0) {
            var22 = 0;
         }

         if (var21 + var23 > var27.e2()) {
            var23 = var27.e2() - var21;
         }

         if (var22 + var24 > var27.h0()) {
            var24 = var27.h0() - var22;
         }

         if (var23 <= 0 || var24 <= 0) {
            return;
         }

         com.aspose.slides.internal.j9e.n5 var28 = var27.n5(new com.aspose.slides.internal.o9b.y2(var21, var22, var23, var24), 1, 2498570);
         int var29 = var28.a6();
         int[] var30 = new int[var23 * var24];

         for (int var31 = 0; var31 < var24; var31++) {
            for (int var32 = 0; var32 < var23; var32++) {
               int var33 = var31 * var29 + var32 * 4;
               var30[var31 * var23 + var32] = com.aspose.slides.internal.e3m.n5.l6(var28.u3(), var33);
            }
         }

         var27.n5(var28);
         if (var4.u3()) {
            var11.n5(var1, var2, var3, var4.u9().u3(), var5);
         } else {
            var11.n5(var1, var2, var3, var4.y4(), var5);
         }

         var28 = var27.n5(new com.aspose.slides.internal.o9b.y2(var21, var22, var23, var24), 3, 2498570);

         for (int var38 = 0; var38 < var24; var38++) {
            for (int var39 = 0; var39 < var23; var39++) {
               int var40 = var38 * var29 + var39 * 4;
               int var34 = com.aspose.slides.internal.e3m.n5.l6(var28.u3(), var40);
               if (var30[var38 * var23 + var39] != var34) {
                  var34 = var30[var38 * var23 + var39];
                  byte var35 = (byte)(var34 >> 24 & 0xFF);
                  if ((var35 & 255) < 255) {
                     var34 = (int)com.aspose.slides.internal.y6.c8.n5(var34 & 4294967295L, var25, var35);
                  }

                  com.aspose.slides.internal.e3m.n5.n5(var28.u3(), var40, var34);
               }
            }
         }

         var27.n5(var28);
      }

      if (var4.u3()) {
         var11.n5(var1, var2, var3, var4.u9().u3(), var5);
      } else {
         var11.n5(var1, var2, var3, var4.y4(), var5);
      }

      var11.l6(var13);
   }

   @Override
   protected void n5(
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      com.aspose.slides.internal.o9b.e5 var5,
      byte var6,
      long var7,
      com.aspose.slides.internal.r6.u9 var9,
      boolean var10
   ) {
      this.n5(var1, var2, var3, new com.aspose.slides.internal.o9b.y1(var4.u3(), new com.aspose.slides.internal.o9b.f2()), var5, var6, var7, var9, var10);
   }
}
