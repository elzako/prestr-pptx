package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;

class n3$k5 extends com.aspose.slides.internal.t6g.n5 implements com.aspose.slides.internal.y7w.n5 {
   private final com.aspose.slides.internal.v6s.u3 n5;
   private final com.aspose.slides.internal.b8u.x8 l6;
   private final n3 k5;
   private final int[][] u3;
   private final boolean a6;
   private com.aspose.slides.internal.o7p.l6 u9;
   private int h0;

   public n3$k5(n3 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3) {
      this.l6 = var3;
      this.n5 = var2;
      this.k5 = var1;
      this.u3 = com.aspose.slides.internal.u2w.n5.l6(var1.c8());
      this.h0 = this.k5.c8().s3() & 65535;
      this.a6 = this.k5.c8().y2() == 6 && this.k5.t2() != 7 && this.k5.t2() != 6;
      if (this.a6) {
         this.u9 = com.aspose.slides.internal.o7p.c8.l6(this.k5.c8(), n3.l6(this.k5), n3.k5(this.k5));
      }
   }

   @Override
   public void n5(y2 var1) {
      com.aspose.slides.internal.y7w.l6 var2 = new com.aspose.slides.internal.y7w.l6(this.k5.u9(), n3.u3(this.k5), n3.a6(this.k5), this.l6);
      var2.n5(var1.n3(), this);
   }

   @Override
   public final int[] n5(int var1, int var2, int var3, y2 var4) {
      return this.k5.c8().y1() == 1 ? this.l6(var1, var2, var3, var4.n3()) : this.k5(var1, var2, var3, var4.n3());
   }

   private int[] l6(int var1, int var2, int var3, y2 var4) {
      long var5 = n3.u9(this.k5)[var1] & 4294967295L;
      long var7 = n3.h0(this.k5)[var1] & 4294967295L;
      byte[] var9 = new byte[(int)var5];
      this.n5.n5(var9, 0, var7, var5);
      byte[] var10 = this.a6 ? this.u9.n5(var9) : var9;
      int var11 = var4.t2() * var4.l6();
      this.k5.n5(var11);
      int[] var12 = new int[var11];
      int var13 = 0;
      com.aspose.slides.internal.h9s.u3 var14 = this.k5.n5(this.k5.c8(), this.u3, var4.n3(), false);
      int[] var15 = new int[]{0};
      var14.n5(var10, var10.length, var12, var11, var15);
      var13 = var15[0];
      return var12;
   }

   private int[] k5(int var1, int var2, int var3, y2 var4) {
      byte[][] var5 = new byte[this.h0][];
      com.aspose.slides.internal.o7p.c8 var6 = null;
      if (this.a6) {
         var6 = new com.aspose.slides.internal.o7p.c8(this.k5.c8(), n3.c8(this.k5), n3.t2(this.k5));
      }

      int var7 = n3.s7(this.k5).length / this.h0;

      for (int var8 = 0; var8 < this.h0; var8++) {
         int var9 = var8 * var7 + var1;
         long var10 = n3.x8(this.k5)[var9] & 4294967295L;
         long var12 = n3.n3(this.k5)[var9] & 4294967295L;
         byte[] var14 = new byte[(int)var10];
         this.n5.n5(var14, 0, var12, var10);
         if (var8 != 1 && var8 != 2) {
            var5[var8] = var14;
         } else {
            byte[] var15 = this.a6 ? var6.l6(var14) : var14;
            var5[var8] = var15;
         }
      }

      long var16 = (long)n3.y4(this.k5) * n3.e2(this.k5);
      byte[] var18 = com.aspose.slides.internal.d9r.u9.n5(0).n5((int)(var16 * this.h0));

      for (long var19 = 0L; var19 < var16; var19++) {
         for (long var21 = 0L; var21 < this.h0; var21++) {
            var18[(int)(var19 * this.h0 + var21)] = var5[(int)var21][(int)var19];
         }
      }

      int var23 = var4.t2() * var4.l6();
      long var27 = var23 * com.aspose.slides.internal.v6g.k5.n5(9);
      com.aspose.slides.internal.b8u.n3 var28 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.b8u.n3.class);
      if (var28 != null) {
         var27 += var28.n5(var23);
      }

      this.k5.n5(var27);
      int[] var29 = new int[var23];
      int var24 = 0;
      com.aspose.slides.internal.h9s.u3 var25 = this.k5.n5(this.k5.c8(), this.u3, var4.n3(), false);
      int[] var26 = new int[]{0};
      var25.n5(var18, var18.length, var29, var23, var26);
      var24 = var26[0];
      return var29;
   }
}
