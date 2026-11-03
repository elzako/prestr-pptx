package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.v4;

@j3
public abstract class t4 implements v4, Cloneable {
   public static int u3 = 0;
   private boolean n5;
   int a6 = -1;

   protected t4() {
   }

   public abstract int[] l6();

   public j5 k5() {
      return j5.k5.m3();
   }

   public j5 u3() {
      return j5.l6.m3();
   }

   public int a6() {
      return this.a6;
   }

   public void n5(int var1) {
      this.c8();
      this.a6 = var1;
   }

   public abstract int h0();

   public abstract int n5(j5 var1);

   public abstract int l6(j5 var1);

   public abstract int k5(j5 var1);

   public int u3(int var1) {
      return this.n5(var1, 0);
   }

   public abstract int n5(int var1, int var2);

   public abstract int u3(j5 var1);

   public abstract int a6(j5 var1);

   public int n5(j5 var1, int var2, int var3) {
      if (var3 >= 0 && var3 <= 6) {
         switch (var2) {
            case 0:
               return this.l6(var1, var3);
            case 1:
               return this.n5(var1, var2, var3, 7);
            case 2:
               return this.n5(var1, var2, var3, 4);
            default:
               throw new ArgumentOutOfRangeException("rule");
         }
      } else {
         throw new ArgumentOutOfRangeException("firstDayOfWeek");
      }
   }

   public abstract int u9(j5 var1);

   @Override
   public Object clone() {
      t4 var1 = (t4)this.deepClone();
      var1.n5(false);
      return var1;
   }

   public j5 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return this.n5(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   public abstract j5 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   void n5(boolean var1) {
      this.n5 = var1;
   }

   static long n5(int var0, int var1, int var2, int var3) {
      if (var0 < 0 || var0 >= 24 || var1 < 0 || var1 >= 60 || var2 < 0 || var2 >= 60) {
         throw new ArgumentOutOfRangeException(null);
      } else if (var3 >= 0 && var3 < 1000) {
         return k5(var0, var1, var2) + var3 * 10000L;
      } else {
         throw new ArgumentOutOfRangeException("millisecond");
      }
   }

   static long k5(int var0, int var1, int var2) {
      long var3 = var0 * 3600L + var1 * 60L + var2;
      if (var3 <= 922337203685L && var3 >= -922337203685L) {
         return var3 * 10000000L;
      } else {
         throw new ArgumentOutOfRangeException("Overflow_TimeSpanTooLong");
      }
   }

   int l6(j5 var1, int var2) {
      int var3 = this.k5(var1) - 1;
      int var4 = var3 % 7;
      int var5 = this.l6(var1) - var4;
      int var6 = (var5 - var2 + 14) % 7;
      return (var3 + var6) / 7 + 1;
   }

   void c8() {
      if (this.n5) {
         throw new InvalidOperationException("InvalidOperation_ReadOnly");
      }
   }

   int n5(j5 var1, int var2, int var3, int var4) {
      int var5 = this.k5(var1) - 1;
      int var6 = this.l6(var1) - var5 % 7;
      int var7 = (var3 - var6 + 14) % 7;
      if (var7 != 0 && var7 >= var4) {
         var7 -= 7;
      }

      int var8 = var5 - var7;
      return var8 >= 0 ? var8 / 7 + 1 : this.n5(var1.n5((double)(-(var5 + 1))), var2, var3, var4);
   }
}
