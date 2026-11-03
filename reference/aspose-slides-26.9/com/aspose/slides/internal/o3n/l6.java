package com.aspose.slides.internal.o3n;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.x7n.t4;
import com.aspose.slides.ms.System.j5;

public final class l6 {
   j5 n5;
   int[] l6;
   int k5;
   int u3 = 9999;
   t4 a6;
   u9[] u9;
   private final long h0 = 864000000000L;

   public int[] n5() {
      if (this.l6 == null) {
         this.l6 = new int[this.u9.length];

         for (int var1 = 0; var1 < this.u9.length; var1++) {
            this.l6[var1] = this.u9[var1].n5;
         }
      }

      return (int[])this.l6.clone();
   }

   public int l6() {
      return this.u3;
   }

   public l6(t4 var1, u9[] var2) {
      this.a6 = var1;
      this.u9 = var2;
      this.n5 = this.a6.u3();
      this.u3 = this.u9[0].l6;
      this.k5 = this.u9[0].k5;
   }

   public int n5(j5 var1) {
      return this.n5(var1.n3(), 3);
   }

   public int l6(j5 var1) {
      this.n5(var1.n3());
      return (int)((var1.n3() / 864000000000L + 1L) % 7L);
   }

   public int k5(j5 var1) {
      return this.n5(var1.n3(), 1);
   }

   public int n5(int var1, int var2) {
      var1 = this.l6(var1, var2);
      return var1 % 4 != 0 || var1 % 100 == 0 && var1 % 400 != 0 ? 365 : 366;
   }

   public int u3(j5 var1) {
      long var2 = var1.n3();

      for (int var4 = 0; var4 < this.u9.length; var4++) {
         if (var2 >= this.u9[var4].u3) {
            return this.u9[var4].n5;
         }
      }

      throw new ArgumentOutOfRangeException("ArgumentOutOfRange_Era");
   }

   public int l6(int var1, int var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("year");
      }

      if (var2 == 0) {
         var2 = this.a6.h0();
      }

      for (int var3 = 0; var3 < this.u9.length; var3++) {
         if (var2 == this.u9[var3].n5) {
            if (var1 >= this.u9[var3].k5 && var1 <= this.u9[var3].l6) {
               return this.u9[var3].a6 + var1;
            }

            throw new ArgumentOutOfRangeException("year");
         }
      }

      throw new ArgumentOutOfRangeException("era");
   }

   public int a6(j5 var1) {
      return this.n5(var1.n3(), 2);
   }

   public int n5(j5 var1, int var2, int var3) {
      this.n5(var1.n3());
      return com.aspose.slides.internal.x7n.a6.u9().n5(var1, var2, var3);
   }

   public int u9(j5 var1) {
      long var2 = var1.n3();
      int var4 = this.n5(var2, 0);

      for (int var5 = 0; var5 < this.u9.length; var5++) {
         if (var2 >= this.u9[var5].u3) {
            return var4 - this.u9[var5].a6;
         }
      }

      throw new ArgumentException("Argument_NoEra");
   }

   public j5 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      var1 = this.l6(var1, var8);
      long var9 = l6(var1, var2, var3) + n5(var4, var5, var6, var7);
      this.n5(var9);
      return new j5(var9);
   }

   static long n5(int var0, int var1, int var2, int var3) {
      if (var0 < 0 || var0 >= 24 || var1 < 0 || var1 >= 60 || var2 < 0 || var2 >= 60) {
         throw new ArgumentOutOfRangeException("ArgumentOutOfRange_BadHourMinuteSecond");
      } else if (var3 >= 0 && var3 < 1000) {
         return n5(var0, var1, var2) + var3 * 10000L;
      } else {
         throw new ArgumentOutOfRangeException("millisecond");
      }
   }

   static long n5(int var0, int var1, int var2) {
      long var3 = var0 * 3600L + var1 * 60L + var2;
      if (var3 <= 922337203685L && var3 >= -922337203685L) {
         return var3 * 10000000L;
      } else {
         throw new ArgumentOutOfRangeException("Overflow_TimeSpanTooLong");
      }
   }

   static long l6(int var0, int var1, int var2) {
      return k5(var0, var1, var2) * 864000000000L;
   }

   static long k5(int var0, int var1, int var2) {
      if (var0 >= 1 && var0 <= 9999 && var1 >= 1 && var1 <= 12) {
         int[] var3 = var0 % 4 != 0 || var0 % 100 == 0 && var0 % 400 != 0 ? com.aspose.slides.internal.o3n.n5.n5 : com.aspose.slides.internal.o3n.n5.l6;
         if (var2 >= 1 && var2 <= var3[var1] - var3[var1 - 1]) {
            int var4 = var0 - 1;
            int var5 = var4 * 365 + var4 / 4 - var4 / 100 + var4 / 400 + var3[var1 - 1] + var2 - 1;
            return var5;
         }
      }

      throw new ArgumentOutOfRangeException("ArgumentOutOfRange_BadYearMonthDay");
   }

   int n5(long var1, int var3) {
      this.n5(var1);
      int var4 = (int)(var1 / 864000000000L);
      int var5 = var4 / 146097;
      var4 -= var5 * 146097;
      int var6 = var4 / 36524;
      if (var6 == 4) {
         var6 = 3;
      }

      var4 -= var6 * 36524;
      int var7 = var4 / 1461;
      var4 -= var7 * 1461;
      int var8 = var4 / 365;
      if (var8 == 4) {
         var8 = 3;
      }

      if (var3 == 0) {
         return var5 * 400 + var6 * 100 + var7 * 4 + var8 + 1;
      }

      var4 -= var8 * 365;
      if (var3 == 1) {
         return var4 + 1;
      }

      int[] var9 = var8 != 3 || var7 == 24 && var6 != 3 ? com.aspose.slides.internal.o3n.n5.n5 : com.aspose.slides.internal.o3n.n5.l6;
      int var10 = var4 >> 6;

      while (var4 >= var9[var10]) {
         var10++;
      }

      return var3 == 2 ? var10 : var4 - var9[var10 - 1] + 1;
   }

   void n5(long var1) {
      com.aspose.slides.internal.o3n.n5.n5(var1, this.a6.u3(), this.a6.k5());
   }
}
