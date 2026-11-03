package com.aspose.slides.internal.e8b;

class a6 {
   private final int n5;
   private final int l6;
   private final com.aspose.slides.internal.g7e.u3 k5;
   private final int[][] u3;
   private final int[][] a6;

   public a6(int var1, int var2, com.aspose.slides.internal.g7e.u3 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = new int[var1][];

      for (int var4 = 0; var4 < var1; var4++) {
         this.u3[var4] = new int[var2 + 1];
      }

      com.aspose.slides.internal.z8m.n5.n5(this.u3, Integer.MAX_VALUE);
      this.a6 = new int[var1][];

      for (int var5 = 0; var5 < var1; var5++) {
         this.a6[var5] = new int[var2 + 1];
      }

      this.k5 = var3;
   }

   public final int n5(u3 var1, n5 var2, int[][] var3) {
      int[][] var4 = var1.n5();
      int[][] var5 = var2.l6();
      this.n5(var4, var5, var3);
      int var6 = this.l6;
      int var7 = com.aspose.slides.ms.System.u3.n5(var5, 1, true).a6(0);
      int var8 = this.k5.k5();
      int[] var9 = new int[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         var9[var10] = com.aspose.slides.internal.z8m.l6.n5(var10, var8);
      }

      for (int var17 = 1; var17 < var7; var17++) {
         int var11 = com.aspose.slides.internal.z8m.l6.n5(var3[0][var17]);
         int var12 = com.aspose.slides.internal.z8m.l6.n5(var3[1][var17]);

         for (int var13 = 0; var13 <= var6; var13++) {
            if (this.u3[var17 - 1][var13] != Integer.MAX_VALUE) {
               for (int var14 = var11; var14 <= var12; var14++) {
                  int var15 = var13 + var4[var17][var14];
                  if (var15 <= var6) {
                     int var16 = var5[var17][var14] + this.u3[var17 - 1][var13];
                     if (var16 < this.u3[var17][var15]) {
                        this.u3[var17][var15] = var16;
                        this.a6[var17][var15] = var9[var14];
                     }
                  }
               }
            }
         }
      }

      return this.n5(var1, this.l6);
   }

   public final int[] n5(int var1, u3 var2) {
      if (var1 < 0) {
         return null;
      }

      int[] var3 = new int[this.n5];
      int var4 = var1;

      for (int var5 = this.n5 - 1; var5 >= 0; var5--) {
         if (var4 >= 0 && var4 <= this.l6) {
            var3[var5] = this.a6[var5][var4] > 0 ? this.a6[var5][var4] : this.k5.u3();
         }

         var4 -= var2.n5()[var5][com.aspose.slides.internal.z8m.l6.n5(var3[var5])];
      }

      return var3;
   }

   private void n5(int[][] var1, int[][] var2, int[][] var3) {
      for (int var4 = com.aspose.slides.internal.z8m.l6.n5(var3[0][0]); var4 <= com.aspose.slides.internal.z8m.l6.n5(var3[1][0]); var4++) {
         if (var1[0][var4] <= this.l6 && var2[0][var4] < this.u3[0][var1[0][var4]]) {
            this.u3[0][var1[0][var4]] = var2[0][var4];
            this.a6[0][var1[0][var4]] = com.aspose.slides.internal.z8m.l6.n5(var4, this.k5.k5());
         }
      }
   }

   private int n5(u3 var1, int var2) {
      int var3 = com.aspose.slides.ms.System.u3.n5(this.a6, 1, true).a6(0) - 1;

      while (var2 > 0) {
         if (this.a6[var3][var2] > 0) {
            int[] var4 = this.n5(var2, var1);
            if (var4 != null && com.aspose.slides.internal.z8m.l6.n5(var1.n5(var4)) <= this.l6) {
               break;
            }
         }

         var2--;
      }

      if (var2 <= 0) {
         throw new com.aspose.slides.internal.z3b.l6("Optimization fault - nothing was optimized");
      } else {
         return var2;
      }
   }
}
