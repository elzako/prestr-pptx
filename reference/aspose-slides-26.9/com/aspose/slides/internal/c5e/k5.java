package com.aspose.slides.internal.c5e;

public class k5 {
   public final l6 n5;
   private int s7 = 0;
   public final int[] l6;
   public final byte[] k5;
   protected n5 u3;
   final int a6;
   final int u9;
   final int h0;
   public final k5$n5 c8;
   public final boolean t2;

   public k5(l6 var1, k5$n5 var2, boolean var3) {
      this(var1, var2, var3, null, null);
   }

   k5(l6 var1, k5$n5 var2, boolean var3, int[] var4, byte[] var5) {
      this.n5 = var1;
      this.a6 = var1.u3;
      this.u9 = var1.k5;
      this.u3 = com.aspose.slides.internal.c5e.n5.s7;
      this.c8 = var2;
      this.t2 = var3 || !var1.c8;
      this.h0 = this.t2 ? var1.n3 : var1.y4;
      if (var2 == k5$n5.n5) {
         this.l6 = var4 != null ? var4 : new int[this.h0];
         this.k5 = null;
      } else {
         if (var2 != k5$n5.l6) {
            throw new t9("bad ImageLine initialization");
         }

         this.k5 = var5 != null ? var5 : new byte[this.h0];
         this.l6 = null;
      }

      this.s7 = -1;
   }

   public int n5() {
      return this.s7;
   }

   public void n5(int var1) {
      this.s7 = var1;
   }

   static void n5(l6 var0, int[] var1, int[] var2, boolean var3) {
      int var4 = var0.k5;
      if (var4 < 8) {
         int var5 = com.aspose.slides.internal.c5e.u3.n5(var4);
         int var6 = 8 - var4;
         int var7 = 8 * var0.y4 - var4 * var0.n3;
         int var8;
         int var9;
         if (var7 != 8) {
            var8 = var5 << var7;
            var9 = var7;
         } else {
            var8 = var5;
            var9 = 0;
         }

         int var10 = var0.n3 - 1;
         int var11 = var0.y4 - 1;

         while (var10 >= 0) {
            int var12 = (var1[var11] & var8) >> var9;
            if (var3) {
               var12 <<= var6;
            }

            var2[var10] = var12;
            var8 <<= var4;
            var9 += var4;
            if (var9 == 8) {
               var8 = var5;
               var9 = 0;
               var11--;
            }

            var10--;
         }
      }
   }

   static void n5(l6 var0, byte[] var1, byte[] var2, boolean var3) {
      int var4 = var0.k5;
      if (var4 < 8) {
         int var5 = com.aspose.slides.internal.c5e.u3.n5(var4);
         int var6 = 8 - var4;
         int var7 = 8 * var0.y4 - var4 * var0.n3;
         int var8;
         int var9;
         if (var7 != 8) {
            var8 = var5 << var7;
            var9 = var7;
         } else {
            var8 = var5;
            var9 = 0;
         }

         int var10 = var0.n3 - 1;
         int var11 = var0.y4 - 1;

         while (var10 >= 0) {
            int var12 = (var1[var11] & var8) >> var9;
            if (var3) {
               var12 <<= var6;
            }

            var2[var10] = (byte)var12;
            var8 <<= var4;
            var9 += var4;
            if (var9 == 8) {
               var8 = var5;
               var9 = 0;
               var11--;
            }

            var10--;
         }
      }
   }

   public k5 l6() {
      k5 var1 = new k5(this.n5, this.c8, true);
      if (this.c8 == k5$n5.n5) {
         n5(this.n5, this.l6, var1.l6, false);
      } else {
         n5(this.n5, this.k5, var1.k5, false);
      }

      return var1;
   }

   public void n5(n5 var1) {
      this.u3 = var1;
   }

   public byte[] k5() {
      return this.k5;
   }

   @Override
   public String toString() {
      return "row=" + this.s7 + " cols=" + this.n5.n5 + " bpc=" + this.n5.k5 + " size=" + (this.l6 != null ? this.l6.length : 0);
   }
}
