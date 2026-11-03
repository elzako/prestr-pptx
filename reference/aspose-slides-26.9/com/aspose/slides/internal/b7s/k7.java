package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.q1;

public abstract class k7 {
   protected final int[] n5 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 10, 11, 12, 13, 14, 15};
   protected final u9 l6;
   protected final d5 k5;
   protected final m3[] u3 = new m3[365];
   protected final z8[] a6 = new z8[2];
   private v4 u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private com.aspose.slides.internal.o9b.y2 y4 = new com.aspose.slides.internal.o9b.y2();
   private byte[] e2;

   public k7(v4 var1, d5 var2, u9 var3) {
      this.l6 = var3;
      this.u9 = var1;
      this.s7 = 0;
      this.x8 = 0;
      this.n3 = 0;
      this.h0 = 0;
      this.e2 = null;
      this.k5 = var2;
   }

   protected final v4 n5() {
      return this.u9;
   }

   protected final int l6() {
      return this.h0;
   }

   protected final int k5() {
      return this.c8;
   }

   protected final int u3() {
      return this.t2;
   }

   public static v4 n5(d5 var0) {
      p8 var1 = var0.c8();
      int var2 = (1 << var0.k5()) - 1;
      if (var1 != null && var1.a6() != 0 && var1.a6() != 64) {
         return new c4(var2, var0.u9(), var1.a6());
      } else {
         return var0.u9() != 0 ? new c4(var2, var0.u9()) : new a0(var0.k5());
      }
   }

   public final void n5(p8 var1) {
      if (var1 == null) {
         var1 = l6(this.u9.n5(), this.u9.k5());
      }

      this.n5(var1.l6(), var1.k5(), var1.u3(), var1.a6());
   }

   public final void n5(int var1, h0 var2) {
      this.l6.n5(new h0[]{var2});
      this.n5(var1);
   }

   public final void n5(h0[] var1) {
      this.l6.n5(var1);
      this.u9();
   }

   public final void l6(h0[] var1) {
      this.l6.n5(var1);
      this.a6();
   }

   public final void n5(int var1, h0 var2, com.aspose.slides.internal.o9b.y2 var3) {
      var3.u3(this.y4);
      this.l6.n5(new h0[]{var2});
      this.n5(var1);
   }

   public final void n5(h0[] var1, com.aspose.slides.internal.o9b.y2 var2) {
      var2.u3(this.y4);
      this.l6.n5(var1);
      this.u9();
   }

   public final void l6(h0[] var1, com.aspose.slides.internal.o9b.y2 var2) {
      var2.u3(this.y4);
      this.l6.n5(var1);
      this.a6();
   }

   public final void n5(int var1) {
      int var2 = this.k5.e2()[var1] + 2;
      byte[] var3 = new byte[2 * var2];
      int var4 = 0;
      com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2();
      var5.k5(this.y4.s7() * (this.k5.s7()[var1] & 255) / (this.k5.n3() & 255));
      var5.u3(this.y4.x8() * (this.k5.x8()[var1] & 255) / (this.k5.y4() & 255));
      var5.l6(com.aspose.slides.internal.n5p.h0.n5(this.y4.t2() * (this.k5.s7()[var1] & 255), this.k5.n3() & 255));
      var5.n5(com.aspose.slides.internal.n5p.h0.n5(this.y4.l6() * (this.k5.x8()[var1] & 255), this.k5.y4() & 255));
      int var6 = this.k5.e2()[var1];
      int var7 = this.k5.t9()[var1];

      for (int var8 = 0; var8 < var7; var8++) {
         if ((var8 & 1) == 1) {
            this.c8 = 1 + var2;
            this.t2 = 1;
         } else {
            this.c8 = 1;
            this.t2 = 1 + var2;
         }

         this.l6.n5(0, var3, this.t2, var6, var2);
         this.h0 = var4;
         var3[this.c8 + var6] = var3[this.c8 + var6 - 1];
         var3[this.t2 - 1] = var3[this.c8];
         this.n5(var1, var3);
         var4 = this.h0;
         if (var5.x8() <= var8 && var8 < var5.x8() + var5.l6()) {
            this.l6.l6(0, var3, this.t2 + var5.s7(), var5.t2(), var2);
         }

         this.c8 += var2;
         this.t2 += var2;
      }

      this.l6.n5();
   }

   public final void a6() {
      int var1 = this.k5.a6();
      int var2 = this.k5.n5();
      int var3 = this.k5.n5();
      int var4 = var2 + 2;
      byte[][] var5 = new byte[var1][];

      for (int var6 = 0; var6 < var1; var6++) {
         var5[var6] = new byte[2 * var4];
      }

      int var10 = 0;

      for (int var7 = 0; var7 < var3; var7++) {
         if ((var7 & 1) == 1) {
            this.c8 = 1 + var4;
            this.t2 = 1;
         } else {
            this.c8 = 1;
            this.t2 = 1 + var4;
         }

         for (int var8 = 0; var8 < var1; var8++) {
            byte[] var9 = var5[var8];
            this.l6.n5(var8, var9, this.t2, var2, var4);
            var9[this.c8 + var2] = var9[this.c8 + var2 - 1];
            var9[this.t2 - 1] = var9[this.c8];
         }

         this.h0 = var10;
         this.n5(var5);
         var10 = this.h0;
         if (this.y4.x8() <= var7 && var7 < this.y4.x8() + this.y4.l6()) {
            for (int var11 = 0; var11 < var1; var11++) {
               this.l6.l6(var11, var5[var11], this.t2 + this.y4.s7(), this.y4.t2(), var4);
            }
         }

         this.c8 += var4;
         this.t2 += var4;
      }

      this.l6.n5();
   }

   public final void u9() {
      int var1 = this.k5.a6();
      int[] var2 = new int[var1];
      byte[][] var3 = new byte[var1][];
      int[] var4 = new int[var1];
      int[] var5 = new int[var1];
      int[] var6 = new int[var1];
      com.aspose.slides.internal.o9b.y2[] var7 = (com.aspose.slides.internal.o9b.y2[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.y2.class), var1)
      );
      int var8 = 0;

      for (int var9 = 0; var9 < var1; var9++) {
         int var10 = this.k5.e2()[var9] + 2;
         var3[var9] = new byte[2 * var10];
         var7[var9].k5(this.y4.s7() * (this.k5.s7()[var9] & 255) / (this.k5.n3() & 255));
         var7[var9].u3(this.y4.x8() * (this.k5.x8()[var9] & 255) / (this.k5.y4() & 255));
         var7[var9].l6(com.aspose.slides.internal.n5p.h0.n5(this.y4.t2() * (this.k5.s7()[var9] & 255), this.k5.n3() & 255));
         var7[var9].n5(com.aspose.slides.internal.n5p.h0.n5(this.y4.l6() * (this.k5.x8()[var9] & 255), this.k5.y4() & 255));
         var8 += this.k5.t9()[var9];
      }

      int var17 = 0;

      while (var17 < var8) {
         for (int var11 = 0; var11 < this.k5.a6(); var11++) {
            int var12 = var4[var11];
            int var13 = this.k5.e2()[var11];
            if (var12 < this.k5.t9()[var11]) {
               com.aspose.slides.internal.o9b.y2 var14 = var7[var11].n3();

               for (int var15 = 0; var15 < (this.k5.x8()[var11] & 255); var15++) {
                  int var18 = var13 + 2;
                  if ((var12 & 1) == 1) {
                     var5[var11] = 1 + var18;
                     var6[var11] = 1;
                  } else {
                     var5[var11] = 1;
                     var6[var11] = 1 + var18;
                  }

                  this.h0 = var2[var11];
                  this.c8 = var5[var11];
                  this.t2 = var6[var11];
                  byte[] var16 = var3[var11];
                  this.l6.n5(var11, var16, this.t2, var13, var18);
                  var16[this.c8 + var13] = var16[this.c8 + var13 - 1];
                  var16[this.t2 - 1] = var16[this.c8];
                  this.n5(var11, var16);
                  var2[var11] = this.h0;
                  var5[var11] += var18;
                  var6[var11] += var18;
                  if (var14.x8() <= var12 && var12 < var14.x8() + var14.l6()) {
                     this.l6.l6(var11, var16, this.t2 + var14.s7(), var14.t2(), var18);
                  }

                  var12++;
                  var17++;
               }

               var4[var11] = var12;
            }
         }
      }

      this.l6.n5();
   }

   protected static int l6(int var0) {
      return var0 >> 30 ^ 2 * var0;
   }

   protected static int n5(int var0, int var1) {
      return (var1 ^ var0) - var1;
   }

   protected abstract int n5(int var1, int var2, int var3);

   protected abstract int n5(int var1, byte[] var2, int var3);

   protected abstract int n5(byte[][] var1, int var2);

   protected final void h0() {
      if (this.h0 < 31) {
         this.h0++;
      }
   }

   protected final void c8() {
      if (this.h0 > 0) {
         this.h0--;
      }
   }

   private static int l6(int var0, int var1, int var2) {
      return (var0 * 9 + var1) * 9 + var2;
   }

   private static int k5(int var0, int var1, int var2) {
      int var3 = u6.n5(var1 - var0);
      if ((var3 ^ var2 - var0) < 0) {
         return var1;
      } else {
         return (var3 ^ var1 - var2) < 0 ? var0 : var0 + var1 - var2;
      }
   }

   private static p8 l6(int var0, int var1) {
      p8 var2 = new p8();
      int var3 = (q1.l6(var0, 4095) + 128) / 256;
      var2.l6(u3(var3 * 1 + 2 + 3 * var1, var1 + 1, var0));
      var2.k5(u3(var3 * 4 + 3 + 5 * var1, var2.l6(), var0));
      var2.u3(u3(var3 * 17 + 4 + 7 * var1, var2.k5(), var0));
      var2.n5(var0);
      var2.a6(64);
      return var2;
   }

   private static int u3(int var0, int var1, int var2) {
      return var0 <= var2 && var0 >= var1 ? var0 : var1;
   }

   private void n5(int var1, byte[] var2) {
      int var3 = 0;

      while (var3 < this.k5.e2()[var1]) {
         int var4 = var2[this.t2 + var3 - 1] & 255;
         int var5 = var2[this.c8 + var3 - 1] & 255;
         int var6 = var2[this.c8 + var3] & 255;
         int var7 = var2[this.c8 + var3 + 1] & 255;
         int var8 = l6(this.k5(var7 - var6), this.k5(var6 - var5), this.k5(var5 - var4));
         if (var8 == 0) {
            var3 += this.n5(var1, var2, var3);
         } else {
            int var9 = var2[this.t2 + var3] & 255;
            int var10 = k5(var4, var6, var5);
            int var11 = this.n5(var8, var9, var10);
            var2[this.t2 + var3] = (byte)var11;
            var3++;
         }
      }
   }

   private void n5(byte[][] var1) {
      byte[] var2 = new byte[this.k5.a6()];
      byte[] var3 = new byte[this.k5.a6()];
      byte[] var4 = new byte[this.k5.a6()];
      int[] var5 = new int[this.k5.a6()];
      int var6 = 0;

      while (var6 < this.k5.n5()) {
         boolean var7 = true;

         for (int var8 = 0; var8 < this.k5.a6(); var8++) {
            byte[] var9 = var1[var8];
            var2[var8] = var9[this.t2 + var6 - 1];
            var3[var8] = var9[this.c8 + var6 - 1];
            var4[var8] = var9[this.c8 + var6];
            byte var10 = var9[this.c8 + var6 + 1];
            var5[var8] = l6(
               this.k5((var10 & 255) - (var4[var8] & 255)), this.k5((var4[var8] & 255) - (var3[var8] & 255)), this.k5((var3[var8] & 255) - (var2[var8] & 255))
            );
            if (var5[var8] != 0) {
               var7 = false;
            }
         }

         if (var7) {
            var6 += this.n5(var1, var6);
         } else {
            for (int var13 = 0; var13 < this.k5.a6(); var13++) {
               byte[] var14 = var1[var13];
               byte var11 = var14[this.t2 + var6];
               byte var12 = (byte)this.n5(var5[var13], var11 & 255, k5(var2[var13] & 255, var4[var13] & 255, var3[var13] & 255));
               var14[this.t2 + var6] = var12;
            }

            var6++;
         }
      }
   }

   private void n5(int var1, int var2, int var3, int var4) {
      this.s7 = var1;
      this.x8 = var2;
      this.n3 = var3;
      this.t2();
      int var5 = q1.n5(2, (this.u9.l6() + 32) / 64);

      for (long var6 = 0L; (var6 & 4294967295L) < this.u3.length; var6++) {
         this.u3[(int)var6] = new m3(var5);
      }

      this.a6[0] = new z8(q1.n5(2, (this.u9.l6() + 32) / 64), 0, var4);
      this.a6[1] = new z8(q1.n5(2, (this.u9.l6() + 32) / 64), 1, var4);
      this.h0 = 0;
   }

   private void t2() {
      if (this.u9.k5() == 0 && this.u9.n5() == (1 << this.u9.a6()) - 1) {
         p8 var1 = l6(this.u9.n5(), this.u9.k5());
         if (var1.l6() == this.s7 && var1.k5() == this.x8 && var1.u3() == this.n3 && this.u9.a6() == 8) {
            this.e2 = this.u3(8);
            return;
         }
      }
   }

   private byte k5(int var1) {
      if (var1 <= -this.n3) {
         return -4;
      } else if (var1 <= -this.x8) {
         return -3;
      } else if (var1 <= -this.s7) {
         return -2;
      } else if (var1 < -this.u9.k5()) {
         return -1;
      } else if (var1 <= this.u9.k5()) {
         return 0;
      } else if (var1 < this.s7) {
         return 1;
      } else if (var1 < this.x8) {
         return 2;
      } else {
         return (byte)(var1 < this.n3 ? 3 : 4);
      }
   }

   private byte[] u3(int var1) {
      p8 var2 = l6((1 << var1) - 1, 0);
      int var3 = var2.n5() + 1;
      byte[] var4 = new byte[var3 * 2];

      for (int var5 = -var3; var5 < var3; var5++) {
         var4[var3 + var5] = this.k5(var5);
      }

      return var4;
   }
}
