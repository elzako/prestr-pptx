package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.p6;

class h0$k5 extends com.aspose.slides.internal.t6g.n5 implements com.aspose.slides.internal.y7w.n5 {
   private final h0 n5;
   private final com.aspose.slides.internal.b8u.x8 l6;
   private final com.aspose.slides.internal.r2q.u9 k5;
   private final int u3;
   private final y2 a6 = new y2();
   private final int u9;
   private final int[][] h0;
   private final d2 c8;
   private com.aspose.slides.internal.h9s.u3 t2;
   private final boolean s7;
   private com.aspose.slides.internal.o7p.l6 x8;

   public h0$k5(h0 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, y2 var4) {
      var4.u3(this.a6);
      this.l6 = var3;
      this.n5 = var1;
      this.u3 = var1.s7();
      int var5 = this.n5.c8().t1();
      this.u9 = (this.n5.u9() * var5 + 7) / 8;
      this.k5 = new com.aspose.slides.internal.r2q.u9(
         var2, var1.c8(), var1.h0(), com.aspose.slides.internal.o9n.h0.l6(var1), com.aspose.slides.internal.o9n.h0.k5(var1), this.u3
      );
      this.h0 = com.aspose.slides.internal.u2w.n5.l6(var1.c8());
      this.c8 = com.aspose.slides.internal.o9n.h0.n5(var1);
      this.s7 = this.n5.c8().y2() == 6 && this.n5.t2() != 7 && this.n5.t2() != 6;
      if (this.s7) {
         this.x8 = com.aspose.slides.internal.o7p.c8.l6(
            this.n5.c8(), com.aspose.slides.internal.o9n.h0.u3(this.n5), com.aspose.slides.internal.o9n.h0.a6(this.n5)
         );
      }
   }

   @Override
   public void n5(y2 var1) {
      com.aspose.slides.internal.y7w.l6 var2 = new com.aspose.slides.internal.y7w.l6(
         this.n5.u9(), com.aspose.slides.internal.o9n.h0.u9(this.n5), com.aspose.slides.internal.o9n.h0.h0(this.n5), this.l6
      );
      var2.n5(var1.n3(), this);
   }

   @Override
   public final int[] n5(int var1, int var2, int var3, y2 var4) {
      return this.n5.c8().y1() == 1 ? this.l6(var1, var2, var3, var4.n3()) : this.k5(var1, var2, var3, var4.n3());
   }

   private int[] l6(int var1, int var2, int var3, y2 var4) {
      int var5 = var4.t2() * var4.l6();
      long var6 = var5 * com.aspose.slides.internal.v6g.k5.n5(9);
      com.aspose.slides.internal.b8u.n3 var8 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.b8u.n3.class);
      if (var8 != null) {
         var6 += var8.n5(var6);
      }

      this.n5.n5(var6);
      int[] var9 = new int[var5];
      int var10 = 0;
      int var11 = com.aspose.slides.internal.o9n.h0.c8(this.n5) * com.aspose.slides.internal.o9n.h0.t2(this.n5) * this.n5.x8();
      byte[] var12 = com.aspose.slides.internal.d9r.u9.n5(0).n5(var11);
      this.k5.a6(var1);
      this.n5.n5(this.k5);
      int var13 = this.s7 ? (int)this.x8.l6() : var12.length;
      p6 var14 = this.n5.n5(var12, var13).n5();
      if (!var14.n5) {
         throw new com.aspose.slides.internal.h6t.u3(var14.k5);
      }

      byte[] var15 = this.s7 ? this.x8.n5(var12) : var12;
      this.t2 = this.n5.n5(this.n5.c8(), this.h0, var4.n3(), false);
      this.t2.n5(0);
      int[] var16 = new int[]{0};
      this.t2.n5(var15, var15.length, var9, var5, var16);
      var10 = var16[0];
      this.n5(this.n5.c8(), var9, var4.n3(), this.c8);
      if (this.n5.a6()) {
         com.aspose.slides.internal.o9n.h0.u3(this.n5, var9, 0, var9.length);
      }

      return var9;
   }

   private int[] k5(int var1, int var2, int var3, y2 var4) {
      int var5 = var4.t2() * var4.l6();
      long var6 = var5 * com.aspose.slides.internal.v6g.k5.n5(9);
      com.aspose.slides.internal.b8u.n3 var8 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.b8u.n3.class);
      if (var8 != null) {
         var6 += var8.n5(var6);
      }

      this.n5.n5(var6);
      int[] var9 = new int[var5];
      int var10 = 0;
      int var11 = com.aspose.slides.internal.o9n.h0.s7(this.n5) * com.aspose.slides.internal.o9n.h0.x8(this.n5);
      int var12 = this.n5.c8().s3() & 65535;
      byte[][] var13 = new byte[var12][];
      com.aspose.slides.internal.o7p.c8 var14 = null;
      if (this.s7) {
         var14 = new com.aspose.slides.internal.o7p.c8(
            this.n5.c8(), com.aspose.slides.internal.o9n.h0.n3(this.n5), com.aspose.slides.internal.o9n.h0.y4(this.n5)
         );
      }

      int var15 = com.aspose.slides.internal.o9n.h0.e2(this.n5).length / var12;

      for (int var16 = 0; var16 < var12; var16++) {
         int var17 = var16 * var15 + var1;
         this.k5.a6(var17);
         this.n5.n5(this.k5);
         int var18 = var11;
         if (var16 == 1 || var16 == 2) {
            var18 = this.s7 ? var14.k5() : var11;
         }

         byte[] var19 = com.aspose.slides.internal.d9r.u9.n5(0).n5(var18);
         p6 var20 = this.n5.n5(var19, var18).n5();
         if (!var20.n5) {
            throw new com.aspose.slides.internal.h6t.u3(var20.k5);
         }

         if (var16 != 1 && var16 != 2) {
            var13[var16] = var19;
         } else {
            byte[] var21 = this.s7 ? var14.l6(var19) : var19;
            var13[var16] = var21;
         }
      }

      byte[] var27 = com.aspose.slides.internal.d9r.u9.n5(0).n5((int)((long)var11 * var12));

      for (long var22 = 0L; var22 < var11; var22++) {
         for (long var24 = 0L; var24 < var12; var24++) {
            var27[(int)(var22 * var12 + var24)] = var13[(int)var24][(int)var22];
         }
      }

      this.t2 = this.n5.n5(this.n5.c8(), this.h0, var4.n3(), false);
      this.t2.n5(0);
      int[] var28 = new int[]{0};
      this.t2.n5(var27, var27.length, var9, var5, var28);
      var10 = var28[0];
      return var9;
   }
}
