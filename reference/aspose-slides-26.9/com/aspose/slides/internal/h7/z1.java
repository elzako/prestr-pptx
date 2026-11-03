package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.q1;

public class z1 implements t9 {
   private com.aspose.slides.internal.t8.l6 n5;
   private final Stack<com.aspose.slides.internal.e7.t2> l6;
   private final com.aspose.slides.internal.t8.n5 k5;
   private final com.aspose.slides.internal.k0.n5 u3;
   private final com.aspose.slides.internal.k0.k5 a6;
   private final com.aspose.slides.internal.t8.k5 u9;

   public z1(
      com.aspose.slides.internal.t8.l6 var1,
      Stack<com.aspose.slides.internal.e7.t2> var2,
      com.aspose.slides.internal.t8.n5 var3,
      com.aspose.slides.internal.k0.n5 var4,
      com.aspose.slides.internal.k0.k5 var5,
      com.aspose.slides.internal.t8.k5 var6
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var2.get_Item(0);
      com.aspose.slides.internal.e7.t2 var4 = this.l6.peek();
      com.aspose.slides.internal.l9.h0 var5 = var4.n5(var3);
      if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.l9.u3.class)) {
         com.aspose.slides.internal.l9.u3 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.l9.u3.class);
         this.n5(var3, var6);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.l9.k5.class)) {
         com.aspose.slides.internal.l9.k5 var8 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.l9.k5.class);
         if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.l9.n5.class)) {
            com.aspose.slides.internal.l9.n5 var7 = com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.l9.n5.class);
            this.n5(var7);
         } else {
            this.n5(var8);
         }
      }
   }

   private void n5(com.aspose.slides.internal.l9.n5 var1) {
      this.n5.l6(this.n5.n5());
      this.n5.k5();
      com.aspose.slides.internal.v2.x8 var2 = var1.e2();
      com.aspose.slides.internal.v2.s7 var3 = var2.u9(com.aspose.slides.internal.v2.c8.e6);
      com.aspose.slides.internal.x4g.m1 var4 = com.aspose.slides.internal.t8.u3.n5(var3);
      com.aspose.slides.internal.t8.a6 var5 = this.n5.n5();
      if (var4 != null) {
         var4.n5(var5.n5(), 1);
         var5.n5(var4);
      }

      var5.n5(com.aspose.slides.internal.p0.n5.n5);
      var5.u3(1.0F);
      var5.a6(1.0F);
      var5.n5((com.aspose.slides.internal.v5.n5)null);
      var5.l6(com.aspose.slides.internal.o9b.c8.u3.o8());
      var5.n5(com.aspose.slides.internal.o9b.c8.u3.o8());
      this.n5.n5(var5);
      com.aspose.slides.internal.v2.n5 var6 = com.aspose.slides.internal.v6g.k5.n5(
         var2.u9(com.aspose.slides.internal.v2.c8.a0), com.aspose.slides.internal.v2.n5.class
      );
      if (var6 != null) {
         com.aspose.slides.internal.e7.c8 var7 = new com.aspose.slides.internal.e7.c8(var6);
         float var8 = var7.u9();
         float var9 = var7.h0();
         float var10 = var7.c8();
         float var11 = var7.s7();
         com.aspose.slides.internal.o9b.w1 var12 = com.aspose.slides.internal.t8.u3.n5(var8, var9, this.n5.n5().n5()).u3();
         com.aspose.slides.internal.o9b.w1 var13 = com.aspose.slides.internal.t8.u3.n5(var10, var9, this.n5.n5().n5()).u3();
         com.aspose.slides.internal.o9b.w1 var14 = com.aspose.slides.internal.t8.u3.n5(var10, var11, this.n5.n5().n5()).u3();
         com.aspose.slides.internal.o9b.w1 var15 = com.aspose.slides.internal.t8.u3.n5(var8, var11, this.n5.n5().n5()).u3();
         com.aspose.slides.internal.x4g.s7 var16 = new com.aspose.slides.internal.x4g.s7();
         var16.l6(
            new com.aspose.slides.internal.o9b.w1[]{
               new com.aspose.slides.internal.o9b.w1(var12.l6(), var12.k5()),
               new com.aspose.slides.internal.o9b.w1(var13.l6(), var13.k5()),
               new com.aspose.slides.internal.o9b.w1(var14.l6(), var14.k5()),
               new com.aspose.slides.internal.o9b.w1(var15.l6(), var15.k5())
            }
         );
         var16.n3();
      }

      com.aspose.slides.internal.e7.t2 var17 = var1.l6();
      if (var17 != null) {
         this.l6.push(var17);
         this.u9.n5(var2);
         this.l6.pop();
      } else {
         this.u9.n5(var2);
      }

      this.n5.u3();
      this.n5.l6(null);
   }

   private void n5(com.aspose.slides.internal.l9.k5 var1) {
      this.n5.k5();
      com.aspose.slides.internal.v2.x8 var2 = var1.e2();
      com.aspose.slides.internal.v2.s7 var3 = var2.u9(com.aspose.slides.internal.v2.c8.e6);
      com.aspose.slides.internal.x4g.m1 var4 = com.aspose.slides.internal.t8.u3.n5(var3);
      if (var4 != null) {
         com.aspose.slides.internal.t8.a6 var5 = this.n5.n5();
         var4.n5(var5.n5(), 1);
         var5.n5(var4);
         this.n5.n5(var5);
      }

      com.aspose.slides.internal.v2.n5 var16 = com.aspose.slides.internal.v6g.k5.n5(
         var2.u9(com.aspose.slides.internal.v2.c8.a0), com.aspose.slides.internal.v2.n5.class
      );
      if (var16 != null) {
         com.aspose.slides.internal.e7.c8 var6 = new com.aspose.slides.internal.e7.c8(var16);
         float var7 = var6.u9();
         float var8 = var6.h0();
         float var9 = var6.c8();
         float var10 = var6.s7();
         com.aspose.slides.internal.o9b.w1 var11 = com.aspose.slides.internal.t8.u3.n5(var7, var8, this.n5.n5().n5()).u3();
         com.aspose.slides.internal.o9b.w1 var12 = com.aspose.slides.internal.t8.u3.n5(var9, var8, this.n5.n5().n5()).u3();
         com.aspose.slides.internal.o9b.w1 var13 = com.aspose.slides.internal.t8.u3.n5(var9, var10, this.n5.n5().n5()).u3();
         com.aspose.slides.internal.o9b.w1 var14 = com.aspose.slides.internal.t8.u3.n5(var7, var10, this.n5.n5().n5()).u3();
         com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();
         var15.l6(
            new com.aspose.slides.internal.o9b.w1[]{
               new com.aspose.slides.internal.o9b.w1(var11.l6(), var11.k5()),
               new com.aspose.slides.internal.o9b.w1(var12.l6(), var12.k5()),
               new com.aspose.slides.internal.o9b.w1(var13.l6(), var13.k5()),
               new com.aspose.slides.internal.o9b.w1(var14.l6(), var14.k5())
            }
         );
         var15.n3();
      }

      com.aspose.slides.internal.e7.t2 var17 = var1.l6();
      if (var17 != null) {
         this.l6.push(var17);
         this.u9.n5(var2);
         this.l6.pop();
      } else {
         this.u9.n5(var2);
      }

      this.n5.u3();
   }

   private void n5(com.aspose.slides.internal.v2.c8 var1, com.aspose.slides.internal.l9.u3 var2) {
      com.aspose.slides.internal.x4g.m1 var3 = this.n5.n5().n5();
      float var4 = com.aspose.slides.internal.t8.u3.n5(var3);
      float var5 = com.aspose.slides.internal.t8.u3.l6(var3);
      float[] var6 = var3.n5();
      float var7 = (float)q1.y4(var6[0] / var4);
      if (var6[1] < 0.0F && var6[2] > 0.0F) {
         var7 = -var7;
      } else if (var4 < 0.0F && var5 < 0.0F) {
         var7 = (float) Math.PI;
      } else if (var6[0] < 0.0F && var6[1] > 0.0F && var6[2] > 0.0F) {
         var7 -= (float) Math.PI;
      } else if (var6[0] < 0.0F && var6[1] < 0.0F && var6[2] < 0.0F) {
         var7 = (float) Math.PI - var7;
      } else if (var6[3] < 0.0F && var6[1] > 0.0F && var6[2] > 0.0F) {
         var7 -= (float) Math.PI;
      } else if (var6[3] < 0.0F && var6[1] < 0.0F && var6[2] < 0.0F) {
         var7 = (float) Math.PI - var7;
      }

      com.aspose.slides.internal.x4g.m1 var8 = var3.u9();
      com.aspose.slides.internal.x4g.m1 var9 = com.aspose.slides.internal.t8.u3.n5(this.k5.n5());
      var8.n5(var9, 1);
      com.aspose.slides.internal.o9b.w1[] var10 = new com.aspose.slides.internal.o9b.w1[]{new com.aspose.slides.internal.o9b.w1(0.5F, 0.5F)};
      var8.n5(var10);
      com.aspose.slides.internal.o9b.w1 var11 = var10[0].u3();
      float var12 = (float)(var7 * 180.0F / Math.PI);
      var8.n5(var12, var11.u3(), 1);
      var10 = new com.aspose.slides.internal.o9b.w1[]{new com.aspose.slides.internal.o9b.w1(0.0F, 1.0F), new com.aspose.slides.internal.o9b.w1(1.0F, 0.0F)};
      var8.n5(var10);
      boolean var13 = var10[1].l6() < var10[0].l6();
      boolean var14 = var10[1].k5() < var10[0].k5();
      float var15 = q1.l6(var10[1].l6(), var10[0].l6());
      float var16 = q1.l6(var10[1].k5(), var10[0].k5());
      com.aspose.slides.internal.o9b.w1 var17 = new com.aspose.slides.internal.o9b.w1(var15, var16);
      float var18 = q1.n5(var10[1].l6() - var10[0].l6());
      float var19 = q1.n5(var10[1].k5() - var10[0].k5());
      com.aspose.slides.internal.o9b.f2 var20 = new com.aspose.slides.internal.o9b.f2(var18, var19);
      com.aspose.slides.internal.o9b.y1 var21 = new com.aspose.slides.internal.o9b.y1(var17.u3(), var20.a6());
      float var22 = (float)(-var7 * 180.0F / Math.PI);
      String var23 = var1.n5();
      this.u3.n5(var23, var2, var21.y4(), var22, this.n5.n5().l6(), var13, var14);
   }
}
