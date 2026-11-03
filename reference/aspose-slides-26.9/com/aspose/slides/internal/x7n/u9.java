package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j5;

@j3
public class u9 extends t4 {
   static final j5 n5 = new j5(1583, 1, 1);
   static final j5 l6;
   private static final int[] k5 = com.aspose.slides.internal.o3n.n5.u9();
   private static final int[][] u9 = com.aspose.slides.internal.o3n.n5.h0();

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
         super.a6 = 5790;
      }

      return super.a6;
   }

   @Override
   public void n5(int var1) {
      super.c8();
      if (var1 != 99) {
         n5(var1, 1, "value");
      }

      super.a6 = var1;
   }

   @Override
   public int n5(j5 var1) {
      return n5(var1.n3(), 3);
   }

   @Override
   public int l6(j5 var1) {
      return (int)(var1.n3() / 864000000000L + 1L) % 7;
   }

   @Override
   public int k5(j5 var1) {
      int var2 = this.u9(var1);
      j5 var3 = this.n5(var2, 1, 1, 0, 0, 0, 0, 0);
      return (int)((var1.n3() - var3.n3()) / 864000000000L) + 1;
   }

   public int n5(int var1, int var2, int var3) {
      l6(var3);
      int var4 = u3(var1, var3);
      this.l6(var1, var2, var3);
      int var5 = u9[var4][var2];
      if (var5 == 0) {
         throw new ArgumentOutOfRangeException("month");
      } else {
         return var5;
      }
   }

   @Override
   public int n5(int var1, int var2) {
      l6(var2);
      int var3 = u3(var1, var2);
      return var3 < 4 ? 352 + var3 : 382 + (var3 - 3);
   }

   @Override
   public int u3(j5 var1) {
      return 1;
   }

   @Override
   public int a6(j5 var1) {
      return n5(var1.n3(), 2);
   }

   public int l6(int var1, int var2) {
      return !this.k5(var1, var2) ? 12 : 13;
   }

   @Override
   public int u9(j5 var1) {
      return n5(var1.n3(), 0);
   }

   public boolean k5(int var1, int var2) {
      n5(var1, var2, "year");
      return (7L * var1 + 1L) % 19L < 7L;
   }

   @Override
   public j5 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      n5(var1, var8, "year");
      this.l6(var1, var2, var8);
      this.l6(var1, var2, var3, var8);
      j5 var9 = l6(var1, var2, var3, var4, var5, var6, var7);
      n5(var9.n3());
      return var9;
   }

   @Override
   public int h0() {
      return 1;
   }

   @Override
   public Object deepClone() {
      u9 var1 = new u9();
      var1.n5(this.a6());
      return var1;
   }

   static void l6(int var0) {
      if (var0 != 0 && var0 != 1) {
         throw new ArgumentOutOfRangeException("era");
      }
   }

   static int u3(int var0, int var1) {
      n5(var0, var1, "year");
      return k5[(var0 - 3760 - 1583) * 2 + 1];
   }

   private void l6(int var1, int var2, int var3, int var4) {
      int var5 = this.n5(var1, var2, var4);
      if (var3 < 1 || var3 > var5) {
         throw new ArgumentOutOfRangeException("day");
      }
   }

   private void l6(int var1, int var2, int var3) {
      int var4 = this.l6(var1, var3);
      if (var2 < 1 || var2 > var4) {
         throw new ArgumentOutOfRangeException("month");
      }
   }

   private static void n5(int var0, int var1, String var2) {
      l6(var1);
      if (var0 < 5343 || var0 > 5999) {
         throw new ArgumentOutOfRangeException(var2);
      }
   }

   private static void n5(long var0) {
      if (var0 < n5.n3() || var0 > l6.n3()) {
         throw new ArgumentOutOfRangeException("time");
      }
   }

   static int n5(long var0, int var2) {
      n5(var0);
      j5 var3 = new j5(var0);
      int var4 = var3.e2();
      int var5 = var3.c8();
      int var6 = var3.l6();
      int[] var7 = new int[]{0};
      int[] var8 = new int[]{0};
      int[] var9 = new int[]{0};
      var7[0] = var4 + 3760;
      int var10 = n5(var4, var7, var8, var9);
      int var11 = var7[0];
      int var12 = var8[0];
      int var13 = var9[0];
      long var14 = com.aspose.slides.internal.o3n.n5.n5(var4, var5, var6);
      if (var5 != 1 || var6 != 1) {
         long var16 = var14 - com.aspose.slides.internal.o3n.n5.n5(var4, 1, 1);
         if (var16 + var9[0] <= u9[var10][var8[0]]) {
            var13 += (int)var16;
            if (var2 == 0) {
               return var11;
            }

            if (var2 == 2) {
               return var12;
            }

            if (var2 == 3) {
               return var13;
            }

            throw new InvalidOperationException("InvalidOperation_DateTimeParsing");
         }

         var12++;
         var13 = 1;
         var16 -= u9[var10][var8[0]] - var9[0];
         if (var16 > 1L) {
            while (var16 > u9[var10][var12]) {
               var16 -= u9[var10][var12++];
               if (var12 > 13 || u9[var10][var12] == 0) {
                  var11++;
                  var10 = k5[(var4 + 1 - 1583) * 2 + 1];
                  var12 = 1;
               }
            }

            var13 += (int)(var16 - 1L);
         }
      }

      if (var2 == 0) {
         return var11;
      } else if (var2 == 2) {
         return var12;
      } else if (var2 == 3) {
         return var13;
      } else {
         throw new InvalidOperationException("InvalidOperation_DateTimeParsing");
      }
   }

   private static int n5(int var0, int var1, int var2, int var3, int var4) {
      if (var1 == var3) {
         return var2 - var4;
      }

      boolean var5 = var1 > var3;
      if (var5) {
         int var6 = var1;
         int var7 = var2;
         var1 = var3;
         var2 = var4;
         var3 = var6;
         var4 = var7;
      }

      int var9 = u9[var0][var1] - var2;
      var1++;

      while (var1 < var3) {
         var9 += u9[var0][var1++];
      }

      var9 += var4;
      return !var5 ? -var9 : var9;
   }

   static int n5(int var0, int[] var1, int[] var2, int[] var3) {
      int var4 = var0 - 1583;
      if (var4 >= 0 && var4 <= 656) {
         var4 *= 2;
         var3[0] = k5[var4];
         int var5 = k5[var4 + 1];
         switch (var3[0]) {
            case 0:
               var2[0] = 5;
               var3[0] = 1;
               return var5;
            case 30:
               var2[0] = 3;
               return var5;
            case 31:
               var2[0] = 5;
               var3[0] = 2;
               return var5;
            case 32:
               var2[0] = 5;
               var3[0] = 3;
               return var5;
            case 33:
               var2[0] = 3;
               var3[0] = 29;
               return var5;
            default:
               var2[0] = 4;
               return var5;
         }
      } else {
         throw new ArgumentOutOfRangeException("gregorianYear");
      }
   }

   private static j5 l6(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var0 - 3760;
      int[] var8 = new int[]{0};
      int[] var9 = new int[]{0};
      int[] var10 = new int[]{0};
      int var11 = n5(var7, var8, var9, var10);
      int var12 = var8[0];
      int var13 = var9[0];
      int var14 = var10[0];
      if (var1 == var13 && var2 == var14) {
         return new j5(var7, 1, 1, var3, var4, var5, var6);
      }

      int var15 = n5(var11, var1, var2, var13, var14);
      j5 var16 = new j5(var7, 1, 1);
      return new j5(var16.n3() + var15 * 864000000000L + t4.n5(var3, var4, var5, var6));
   }

   static {
      j5 var0 = new j5(2239, 9, 29, 23, 59, 59, 999);
      l6 = new j5(var0.n3() + 9999L);
   }
}
