package com.aspose.slides.internal.j9e;

import com.aspose.slides.ms.System.x9;

public final class n5 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private x9 a6;
   private int u9;

   public n5() {
   }

   public n5(int var1, int var2, int var3, int var4, int var5, byte[] var6) {
      this.l6 = var2;
      this.n5 = var1;
      this.k5 = var4;
      this.u3 = var3;
      this.u9 = var5;
      this.a6 = new x9(com.aspose.slides.internal.l6j.n5.n5(var6));
   }

   public int n5() {
      return this.l6;
   }

   public int l6() {
      return this.n5;
   }

   public int k5() {
      return this.u3;
   }

   public x9 u3() {
      return this.a6;
   }

   public void n5(x9 var1) {
      this.a6 = var1;
   }

   public static int n5(int var0, int var1) {
      int var2 = var0 * var1 / 32;
      int var3 = var0 * var1 % 32;
      return var2 * 4 + (var3 > 0 ? 4 : 0);
   }

   public static int n5(int var0, int var1, int var2) {
      if (var1 < 8) {
         int var5 = 8 / var1;
         int var4 = var0 / var5 + (var0 % var5 == 0 ? 0 : 1);
         return var2 - var4;
      } else {
         int var3 = var1 >> 3;
         return var2 - var0 * var3;
      }
   }

   public int a6() {
      return this.k5;
   }

   public void n5(n5 var1) {
      var1.l6 = this.l6;
      var1.n5 = this.n5;
      var1.u3 = this.u3;
      var1.u9 = this.u9;
      var1.k5 = this.k5;
      var1.a6 = new x9(this.u3().k5());
   }

   public void n5(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 <= this.n5 - 1 && var2 >= 0 && var2 <= this.l6 - 1) {
         int var4 = com.aspose.slides.internal.o9b.t4.n5(this.u3);
         int var5 = var4 >> 3;
         if (var5 != 0) {
            int var6 = this.k5;
            byte[] var7 = (byte[])this.a6.k5().n5();
            int var8 = var1 * var5 + var2 * var6;

            for (int var9 = 0; var9 < var5; var9++) {
               var3[var9] = var7[var8++];
            }
         }
      } else {
         throw new ArrayIndexOutOfBoundsException("x or y out of locked area");
      }
   }
}
