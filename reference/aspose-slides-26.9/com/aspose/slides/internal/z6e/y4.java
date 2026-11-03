package com.aspose.slides.internal.z6e;

import java.awt.Rectangle;
import java.io.IOException;

public class y4 extends com.aspose.slides.internal.n2z.k5 {
   private Rectangle n5;
   private int l6;
   private int k5;
   private int u3;
   private com.aspose.slides.internal.u7f.a6[] a6;
   private com.aspose.slides.internal.u7f.l6[] u9;
   private com.aspose.slides.internal.u7f.k5[] h0;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u3 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.a6 = new com.aspose.slides.internal.u7f.a6[this.l6];

      for (int var4 = 0; var4 < this.l6; var4++) {
         this.a6[var4] = com.aspose.slides.internal.l1b.k5.e2(var1, var2);
         var2 += 16;
      }

      if (this.l6()) {
         this.u9 = new com.aspose.slides.internal.u7f.l6[this.k5];

         for (int var9 = 0; var9 < this.k5; var9++) {
            this.u9[var9] = com.aspose.slides.internal.l1b.k5.t9(var1, var2);
            var2 += 8;
         }
      } else if (this.k5()) {
         this.h0 = new com.aspose.slides.internal.u7f.k5[this.k5];

         for (int var10 = 0; var10 < this.k5; var10++) {
            this.h0[var10] = com.aspose.slides.internal.l1b.k5.z1(var1, var2);
            var2 += 12;
         }
      }
   }

   @Override
   public int n5() {
      return 118;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.o9b.z1 var4 = var1.t4();
      com.aspose.slides.internal.x4g.m1 var5 = var4.k7();
      com.aspose.slides.internal.x4g.m1 var6 = var4.m1();

      try {
         var4.l6(var5);
         var4.k5(com.aspose.slides.internal.x4g.m1.n5);
         if (this.l6()) {
            this.l6(var1);
         } else if (this.k5()) {
            this.n5(var1);
         }
      } finally {
         var4.k5(var5);
         var4.l6(var6);
      }
   }

   private void n5(com.aspose.slides.internal.o6t.k5 var1) {
      for (com.aspose.slides.internal.u7f.k5 var5 : this.h0) {
         com.aspose.slides.internal.u7f.a6 var6 = this.a6[var5.n5()];
         com.aspose.slides.internal.u7f.a6 var7 = this.a6[var5.l6()];
         com.aspose.slides.internal.u7f.a6 var8 = this.a6[var5.k5()];
         com.aspose.slides.internal.o9b.w1[] var9 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var6.n5(), var6.l6()),
            new com.aspose.slides.internal.o9b.w1(var7.n5(), var7.l6()),
            new com.aspose.slides.internal.o9b.w1(var8.n5(), var8.l6())
         };
         com.aspose.slides.internal.o9b.c8[] var10 = new com.aspose.slides.internal.o9b.c8[]{this.n5(var6), this.n5(var7), this.n5(var8)};
         com.aspose.slides.internal.x4g.s7 var11 = new com.aspose.slides.internal.x4g.s7();
         var11.k5(var9);
         if (!var11.getBounds().isEmpty()) {
            com.aspose.slides.internal.x4g.m3 var12 = new com.aspose.slides.internal.x4g.m3(var11);
            var12.n5(var10[0]);
            var12.n5(var9[0]);
            var12.n5(var10);
            var1.t4().n5(var12, var11);
         }
      }
   }

   private void l6(com.aspose.slides.internal.o6t.k5 var1) {
      for (com.aspose.slides.internal.u7f.l6 var5 : this.u9) {
         com.aspose.slides.internal.u7f.a6 var6 = this.a6[var5.n5()];
         com.aspose.slides.internal.u7f.a6 var7 = this.a6[var5.l6()];
         com.aspose.slides.internal.o9b.y2 var8 = new com.aspose.slides.internal.o9b.y2(var6.n5(), var6.l6(), var7.n5() - var6.n5(), var7.l6() - var6.l6());
         com.aspose.slides.internal.o9b.u3 var9 = null;
         if (this.u3 == 0) {
            float var10 = (var6.l6() + var7.l6()) / 2.0F;
            com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var6.n5(), var10);
            com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(var7.n5(), var10);
            com.aspose.slides.internal.o9b.c8 var13 = this.n5(var6);
            com.aspose.slides.internal.o9b.c8 var14 = this.n5(var7);
            var9 = new com.aspose.slides.internal.x4g.z3(var11, var12, var13, var14);
         } else {
            float var16 = (var6.n5() + var7.n5()) / 2.0F;
            com.aspose.slides.internal.o9b.w1 var17 = new com.aspose.slides.internal.o9b.w1(var16, var6.l6());
            com.aspose.slides.internal.o9b.w1 var18 = new com.aspose.slides.internal.o9b.w1(var16, var7.l6());
            com.aspose.slides.internal.o9b.c8 var19 = this.n5(var6);
            com.aspose.slides.internal.o9b.c8 var20 = this.n5(var7);
            var9 = new com.aspose.slides.internal.x4g.z3(var17, var18, var19, var20);
         }

         var1.t4().l6(var9, var8);
      }
   }

   private com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.u7f.a6 var1) {
      return com.aspose.slides.internal.o9b.c8.n5(var1.k5() >> 8 & 0xFF, var1.u3() >> 8 & 0xFF, var1.a6() >> 8 & 0xFF);
   }

   private boolean l6() {
      return this.u3 == 0 || this.u3 == 1;
   }

   private boolean k5() {
      return this.u3 == 2;
   }
}
