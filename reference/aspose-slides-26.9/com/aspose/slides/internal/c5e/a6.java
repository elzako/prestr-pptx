package com.aspose.slides.internal.c5e;

class a6 {
   public final l6 n5;
   public final int l6;
   public final int k5;
   public final k5$n5 u3;
   public final boolean a6;
   public final int u9;
   public final int h0;
   public final int c8;
   public final int t2;
   public final int[][] s7;
   public final byte[][] x8;

   public a6(l6 var1, k5$n5 var2, boolean var3, int var4, int var5, int var6) {
      this.n5 = var1;
      this.l6 = var1.u3;
      this.k5 = var1.k5;
      this.u3 = var2;
      this.a6 = var3 || !var1.c8;
      this.u9 = var3 ? var1.n3 : var1.y4;
      this.h0 = var4;
      this.c8 = var5;
      this.t2 = var6;
      if (var2 == k5$n5.n5) {
         this.s7 = new int[var5][this.u9];
         this.x8 = (byte[][])null;
      } else {
         if (var2 != k5$n5.l6) {
            throw new t9("bad ImageLine initialization");
         }

         this.x8 = new byte[var5][this.u9];
         this.s7 = (int[][])null;
      }
   }

   public int n5(int var1) {
      var1 -= this.h0;
      int var2 = var1 >= 0 && var1 % this.t2 == 0 ? var1 / this.t2 : -1;
      return var2 < this.c8 ? var2 : -1;
   }
}
