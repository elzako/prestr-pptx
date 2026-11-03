package com.aspose.slides.internal.f9d;

import com.aspose.slides.exceptions.ArgumentNullException;

abstract class s7 extends h0 {
   private int n5;
   private com.aspose.slides.internal.b8u.a6 l6;
   private int k5 = -1;
   private int u3 = -1;
   private int a6;
   private int u9;
   private int[] h0;
   private int c8;
   private boolean t2;
   private int s7;

   protected s7(int var1, int var2) {
      super(var1, var2);
   }

   public final void n3() {
      this.n5(this.a6() + 1);
      this.a6 = 1 << this.a6();
      this.u9 = this.a6 + 1;
      this.y4();
      this.t2();
      this.t2 = false;
   }

   public void k5(int var1) {
      this.u3(this.h0[this.s7]);
   }

   public final void n5(byte[] var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("values");
      }

      if (this.u3 == -1) {
         throw new com.aspose.slides.internal.r1q.l6("StartEncoding method was not called first.");
      }

      if (var2 > 0) {
         int var3 = 0;
         if (!this.t2) {
            this.u3(this.k5());
            this.s7 = (var1[0] & 255) * this.u9;
            var3 = 1;
            this.t2 = true;
         }

         int[] var4 = this.h0;
         int var5 = this.s7;
         if (this.n5() == 3 && this.n5 > 0) {
            s7$n5 var12 = new s7$n5();
            var12.n5 = 0;
            var12.l6 = 0;
            var12.k5 = 0;
            int var13 = 0;

            while (true) {
               s7$l6 var14 = this.n5(var1, var2, var13 + 1, var5, com.aspose.slides.internal.v6g.k5.h0(0, 9), var12.n5()).n5();
               var13 = var14.l6;
               if (var13 >= var2) {
                  var5 = var14.n5;
                  break;
               }

               int var15 = var1[var13] & 255;
               int var10 = var14.n5 + var15 + 1;
               com.aspose.slides.internal.f8y.n5.n5(var4[var10] == 0, "The best lossy node has a descendant.");
               int var11 = this.c8 - var10;
               var4[var10] = var11;
               var4[this.c8] = this.u3() + this.u3++;
               this.c8 = (this.a6 + this.u3) * this.u9;
               this.u3(var4[var14.n5]);
               if (this.u3 > this.c8()) {
                  this.x8();
               }

               if (this.u9() == 12 && this.u3 == this.c8()) {
                  this.u3(this.k5());
                  this.s7();
                  this.y4();
               }

               var5 = var15 * this.u9;
            }
         } else {
            for (; var3 < var2; var3++) {
               int var6 = var1[var3] & 255;
               int var7 = var5 + var6 + 1;
               int var8 = var4[var7];
               if (var8 != 0) {
                  var5 = var7 + var8;
               } else {
                  int var9 = this.c8 - var7;
                  var4[var7] = var9;
                  var4[this.c8] = this.u3() + this.u3++;
                  this.c8 = (this.a6 + this.u3) * this.u9;
                  this.u3(var4[var5]);
                  if (this.u3 > this.c8()) {
                     this.x8();
                  }

                  if (this.u9() == 12 && this.u3 == this.c8()) {
                     this.u3(this.k5());
                     this.s7();
                     this.y4();
                  }

                  var5 = var6 * this.u9;
               }
            }
         }

         this.s7 = var5;
      }
   }

   protected abstract void u3(int var1);

   private static long n5(int var0, int var1, boolean var2, boolean var3, s7$n5 var4) {
      if (var2 != var3) {
         return 33554432L;
      }

      if (var2) {
         return 0L;
      }

      int var5 = var0 >> 16 & 0xFF;
      int var6 = var0 >> 8 & 0xFF;
      int var7 = var0 & 0xFF;
      int var8 = var1 >> 16 & 0xFF;
      int var9 = var1 >> 8 & 0xFF;
      int var10 = var1 & 0xFF;
      int var11 = var5 - var8 + var4.n5;
      int var12 = var6 - var9 + var4.l6;
      int var13 = var7 - var10 + var4.k5;
      int var14 = var5 - var8 + var4.n5 / 2;
      int var15 = var6 - var9 + var4.l6 / 2;
      int var16 = var7 - var10 + var4.k5 / 2;
      long var17 = var11 * var11 + var12 * var12 + var13 * var13 & 4294967295L;
      long var19 = var14 * var14 + var15 * var15 + var16 * var16 & 4294967295L;
      return (var17 & 4294967295L) < (var19 & 4294967295L) ? var17 : var19;
   }

   private static s7$n5 l6(int var0, int var1, boolean var2, boolean var3, s7$n5 var4) {
      if (!var2 && !var3) {
         int var12 = var0 >> 16 & 0xFF;
         int var6 = var0 >> 8 & 0xFF;
         int var7 = var0 & 0xFF;
         int var8 = var1 >> 16 & 0xFF;
         int var9 = var1 >> 8 & 0xFF;
         int var10 = var1 & 0xFF;
         s7$n5 var11 = new s7$n5();
         var11.n5 = (short)(var12 - var8 + var4.n5 * 3 / 4);
         var11.l6 = (short)(var6 - var9 + var4.l6 * 3 / 4);
         var11.k5 = (short)(var7 - var10 + var4.k5 * 3 / 4);
         return var11;
      } else {
         s7$n5 var5 = new s7$n5();
         var5.n5 = 0;
         var5.l6 = 0;
         var5.k5 = 0;
         return var5;
      }
   }

   private void y4() {
      if (this.h0 == null) {
         this.h0 = new int[4095 * this.u9];
      } else {
         com.aspose.slides.ms.System.u3.n5(this.h0, 0, this.h0.length);
      }

      int var1 = 0;

      while (var1 < this.a6) {
         this.h0[this.u9 * var1] = var1++;
      }

      this.u3 = 0;
      this.c8 = this.a6 * this.u9;
   }

   private s7$l6 n5(byte[] var1, int var2, int var3, int var4, long var5, s7$n5 var7) {
      s7$l6 var8 = new s7$l6();
      var8.n5 = var4;
      var8.l6 = var3;
      var8.k5 = var5;
      if (var3 > var2 - 1) {
         return var8;
      }

      int var9 = var1[var3] & 255;
      int var10 = this.l6.l6(var9);

      for (int var11 = 1; var11 < this.u9; var11++) {
         int var12 = this.h0[var4 + var11];
         if (var12 != 0) {
            int var13 = var4 + var11 + var12;
            int var14 = var11 - 1;
            int var15 = this.l6.l6(var14);
            long var16 = var9 == var14 ? 0L : n5(var10, var15, var9 == this.k5, var14 == this.k5, var7.n5());
            if ((var16 & 4294967295L) <= this.n5) {
               s7$n5 var18 = l6(var10, var15, var9 == this.k5, var14 == this.k5, var7.n5()).n5();
               s7$l6 var19 = this.n5(var1, var2, var3 + 1, var13, var5 + com.aspose.slides.internal.v6g.k5.h0(var16, 10), var18.n5()).n5();
               if (var19.l6 > var8.l6 || var19.l6 == var8.l6 && var19.k5 < var8.k5) {
                  var19.n5(var8);
               }
            }
         }
      }

      return var8;
   }
}
