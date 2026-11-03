package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.s4;

@j3
public class z1 extends t4 {
   private static final int[][] k5 = com.aspose.slides.internal.o3n.n5.n5();
   static j5 n5 = new j5(1900, 4, 30);
   static j5 l6;

   @Override
   public int[] l6() {
      return new int[]{1};
   }

   @Override
   public j5 k5() {
      return l6;
   }

   @Override
   public j5 u3() {
      return n5;
   }

   @Override
   public int a6() {
      if (super.a6 == -1) {
         super.a6 = 1451;
      }

      return super.a6;
   }

   @Override
   public void n5(int var1) {
      if (var1 == 99 || var1 >= 1318 && var1 <= 1450) {
         super.c8();
         super.a6 = var1;
      } else {
         throw new ArgumentOutOfRangeException("value");
      }
   }

   @Override
   public int n5(j5 var1) {
      return this.n5(var1, 3);
   }

   @Override
   public int l6(j5 var1) {
      return (int)(var1.n3() / 864000000000L + 1L) % 7;
   }

   @Override
   public int k5(j5 var1) {
      return this.n5(var1, 1);
   }

   public int n5(int var1, int var2, int var3) {
      l6(var1, var2, var3);
      return (k5[var1 - 1318][0] & 1 << var2 - 1) == 0 ? 29 : 30;
   }

   @Override
   public int n5(int var1, int var2) {
      l6(var1, var2);
      return k5(var1);
   }

   @Override
   public int u3(j5 var1) {
      n5(var1.n3());
      return 1;
   }

   @Override
   public int a6(j5 var1) {
      return this.n5(var1, 2);
   }

   @Override
   public int u9(j5 var1) {
      return this.n5(var1, 0);
   }

   @Override
   public j5 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var3 >= 1 && var3 <= 29) {
         l6(var1, var2, var8);
      } else {
         int var9 = this.n5(var1, var2, var8);
         if (var3 < 1 || var3 > var9) {
            throw new ArgumentOutOfRangeException("day");
         }
      }

      long var10 = u3(var1, var2, var3);
      if (var10 >= 0L) {
         return new j5(var10 * 864000000000L + t4.n5(var4, var5, var6, var7));
      } else {
         throw new ArgumentOutOfRangeException("ArgumentOutOfRange_BadYearMonthDay");
      }
   }

   @Override
   public int h0() {
      return 1;
   }

   @Override
   public Object deepClone() {
      z1 var1 = new z1();
      var1.n5(this.a6());
      return var1;
   }

   static void l6(int var0) {
      if (var0 < 0 || var0 > 1) {
         throw new ArgumentOutOfRangeException("era");
      }
   }

   static void n5(long var0) {
      if (l6.n3() < var0 || n5.n3() > var0) {
         throw new ArgumentOutOfRangeException("time");
      }
   }

   static void l6(int var0, int var1, int var2) {
      l6(var0, var2);
      if (var1 < 1 || var1 > 12) {
         throw new ArgumentOutOfRangeException("month");
      }
   }

   static void l6(int var0, int var1) {
      l6(var1);
      if (var0 < 1318 || var0 > 1450) {
         throw new ArgumentOutOfRangeException("year");
      }
   }

   private static void n5(j5 var0, int[] var1, int[] var2, int[] var3) {
      int var4 = (int)((var0.n3() - n5.n3()) / 864000000000L) / 355;

      while (var0.n5(n5(k5[++var4])) > 0) {
      }

      if (var0.n5(n5(k5[var4])) != 0) {
         var4--;
      }

      s4 var5 = var0.l6(n5(k5[var4]));
      var1[0] = var4 + 1318;
      var2[0] = 1;
      var3[0] = 1;
      double var6 = var5.u9();
      int var8 = k5[var4][0];

      for (int var9 = 29 + (var8 & 1); var6 >= var9; var2[0]++) {
         var6 -= var9;
         var8 >>= 1;
         var9 = 29 + (var8 & 1);
      }

      var3[0] += (int)var6;
   }

   private static void n5(int var0, int var1, int var2, int[] var3, int[] var4, int[] var5) {
      int var6 = var2 - 1;
      int var7 = var0 - 1318;
      j5 var8 = n5(k5[var7]);
      int var9 = k5[var7][0];

      for (int var10 = 1; var10 < var1; var10++) {
         var6 = (var9 & 1) + var6 + 29;
         var9 >>= 1;
      }

      var8 = var8.n5((double)var6);
      var3[0] = var8.e2();
      var4[0] = var8.c8();
      var5[0] = var8.l6();
   }

   private static long u3(int var0, int var1, int var2) {
      int[] var3 = new int[1];
      int[] var4 = new int[1];
      int[] var5 = new int[1];
      n5(var0, var1, var2, var3, var4, var5);
      int var6 = var3[0];
      int var7 = var4[0];
      int var8 = var5[0];
      return com.aspose.slides.internal.o3n.n5.n5(var6, var7, var8);
   }

   int n5(j5 var1, int var2) {
      int[] var3 = new int[1];
      int[] var4 = new int[1];
      int[] var5 = new int[1];
      n5(var1.n3());
      n5(var1, var3, var4, var5);
      int var6 = var3[0];
      int var7 = var4[0];
      int var8 = var5[0];
      switch (var2) {
         case 0:
            return var6;
         case 1:
         default:
            if (var2 != 1) {
               throw new InvalidOperationException("InvalidOperation_DateTimeParsing");
            }

            return (int)(u3(var6, var7, var8) - u3(var6, 1, 1) + 1L);
         case 2:
            return var7;
         case 3:
            return var8;
      }
   }

   static int k5(int var0) {
      int var1 = 0;
      int var2 = k5[var0 - 1318][0];

      for (int var3 = 1; var3 <= 12; var3++) {
         var1 = var1 + 29 + (var2 & 1);
         var2 >>= 1;
      }

      return var1;
   }

   private static j5 n5(int[] var0) {
      return new j5(var0[1], var0[2], var0[3]);
   }

   static {
      j5 var0 = new j5(2029, 5, 13, 23, 59, 59, 999);
      l6 = new j5(var0.n3() + 9999L);
   }
}
