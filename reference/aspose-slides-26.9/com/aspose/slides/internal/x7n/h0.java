package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j5;

@j3
public class h0 extends t4 {
   static final j5 n5 = j5.k5.m3();
   static final j5 l6 = new j5(622, 7, 18);
   static final int[] k5 = new int[]{0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325, 355};
   private int u9 = 0;

   @Override
   public int[] l6() {
      return new int[]{1};
   }

   public int n5() {
      return this.u9;
   }

   public void l6(int var1) {
      if (var1 >= -2 && var1 <= 2) {
         super.c8();
         this.u9 = var1;
      } else {
         throw new ArgumentOutOfRangeException("HijriAdjustment");
      }
   }

   @Override
   public j5 k5() {
      return n5;
   }

   @Override
   public j5 u3() {
      return l6;
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
      super.c8();
      if (var1 >= 99 && var1 <= 9666) {
         super.a6 = var1;
      } else {
         throw new ArgumentOutOfRangeException("value");
      }
   }

   @Override
   public int n5(j5 var1) {
      return this.n5(var1.n3(), 3);
   }

   @Override
   public int l6(j5 var1) {
      return (int)(var1.n3() / 864000000000L + 1L) % 7;
   }

   @Override
   public int k5(j5 var1) {
      return this.n5(var1.n3(), 1);
   }

   public int n5(int var1, int var2, int var3) {
      l6(var1, var2, var3);
      if (var2 == 12) {
         return !this.l6(var1, 0) ? 29 : 30;
      } else {
         return var2 % 2 != 1 ? 29 : 30;
      }
   }

   @Override
   public int n5(int var1, int var2) {
      k5(var1, var2);
      return !this.l6(var1, 0) ? 354 : 355;
   }

   @Override
   public int u3(j5 var1) {
      n5(var1.n3());
      return 1;
   }

   @Override
   public int a6(j5 var1) {
      return this.n5(var1.n3(), 2);
   }

   @Override
   public int u9(j5 var1) {
      return this.n5(var1.n3(), 0);
   }

   public boolean l6(int var1, int var2) {
      k5(var1, var2);
      return (var1 * 11 + 14) % 30 < 11;
   }

   @Override
   public j5 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = this.n5(var1, var2, var8);
      if (var3 >= 1 && var3 <= var9) {
         long var10 = this.u3(var1, var2, var3);
         if (var10 < 0L) {
            throw new ArgumentOutOfRangeException(null);
         } else {
            return new j5(var10 * 864000000000L + t4.n5(var4, var5, var6, var7));
         }
      } else {
         throw new ArgumentOutOfRangeException("day");
      }
   }

   @Override
   public int h0() {
      return 1;
   }

   @Override
   public Object deepClone() {
      h0 var1 = new h0();
      var1.l6(this.n5());
      var1.n5(this.a6());
      return var1;
   }

   private static void k5(int var0) {
      if (var0 != 0 && var0 != 1) {
         throw new ArgumentOutOfRangeException("era");
      }
   }

   private static void n5(long var0) {
      if (var0 < l6.n3() || var0 > n5.n3()) {
         throw new ArgumentOutOfRangeException("time");
      }
   }

   private static void l6(int var0, int var1, int var2) {
      k5(var0, var2);
      if (var0 == 9666 && var1 > 4) {
         throw new ArgumentOutOfRangeException("month");
      } else if (var1 < 1 || var1 > 12) {
         throw new ArgumentOutOfRangeException("month");
      }
   }

   private static void k5(int var0, int var1) {
      k5(var1);
      if (var0 < 1 || var0 > 9666) {
         throw new ArgumentOutOfRangeException("year");
      }
   }

   private long a6(int var1) {
      int var2 = (var1 - 1) / 30 * 30;
      int var3 = var1 - var2 - 1;
      long var4 = var2 * 10631L / 30L + 227013L;

      while (var3 > 0) {
         var4 += 354 + (this.l6(var3, 0) ? 1 : 0);
         var3--;
      }

      return var4;
   }

   private long u3(int var1, int var2, int var3) {
      return this.a6(var1) + k5[var2 - 1] + var3 - 1L - this.n5();
   }

   private int n5(long var1, int var3) {
      n5(var1);
      long var4 = var1 / 864000000000L + 1L;
      var4 += this.n5();
      int var6 = (int)((var4 - 227013L) * 30L / 10631L) + 1;
      long var7 = this.a6(var6);
      long var9 = this.n5(var6, 0);
      if (var4 < var7) {
         var7 -= var9;
         var6--;
      } else if (var4 == var7) {
         var6--;
         var7 -= this.n5(var6, 0);
      } else if (var4 > var7 + var9) {
         var7 += var9;
         var6++;
      }

      if (var3 == 0) {
         return var6;
      }

      int var11 = 1;
      var4 -= var7;
      if (var3 == 1) {
         return (int)var4;
      }

      while (var11 <= 12 && var4 > k5[var11 - 1]) {
         var11++;
      }

      var11--;
      if (var3 == 2) {
         return var11;
      } else {
         int var12 = (int)var4 - k5[var11 - 1];
         if (var3 != 3) {
            throw new InvalidOperationException("InvalidOperation_DateTimeParsing");
         } else {
            return var12;
         }
      }
   }
}
