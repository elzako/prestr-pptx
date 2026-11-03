package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.q1;

public class j5 extends k7 {
   private static j5$n5[] u9 = new j5$n5[]{
      u3(0), u3(1), u3(2), u3(3), u3(4), u3(5), u3(6), u3(7), u3(8), u3(9), u3(10), u3(11), u3(12), u3(13), u3(14), u3(15)
   };

   public j5(v4 var1, d5 var2, u9 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected int n5(int var1, int var2, int var3) {
      int var4 = u6.n5(var1);
      m3 var5 = this.u3[n5(var1, var4)];
      int var6 = var5.l6();
      int var7 = this.n5().l6(var3 + n5(var5.n5(), var4));
      j5$l6 var8 = u9[var6].n5(((r4)this.l6).u3()).k5();
      int var9;
      if (var8.l6() != 0) {
         ((r4)this.l6).l6(var8.l6());
         var9 = var8.n5();
         com.aspose.slides.internal.f8y.n5.n5(q1.n5(var9) < 65535, "The prediction error must be less than 65535.");
      } else {
         var9 = k5(this.l6(var6, this.n5().u9(), this.n5().u3()));
         if (q1.n5(var9) > 65535) {
            throw new com.aspose.slides.internal.z3b.k5("InvalidCompressedData");
         }
      }

      if (var6 == 0) {
         var9 ^= var5.n5(this.n5().k5());
      }

      var5.n5(var9, this.n5().k5(), this.n5().h0());
      var9 = k7.n5(var9, var4);
      return this.n5().n5(var7, var9);
   }

   @Override
   protected int n5(int var1, byte[] var2, int var3) {
      byte var4 = var2[this.u3() + var3 - 1];
      int var5 = this.a6(this.k5.e2()[var1] - var3);

      for (int var6 = 0; var6 < var5; var6++) {
         var2[this.u3() + var3 + var6] = var4;
      }

      int var8 = var3 + var5;
      if (var8 == this.k5.e2()[var1]) {
         return var8 - var3;
      }

      byte var7 = var2[this.k5() + var8];
      var2[this.u3() + var8] = this.l6(var4 & 255, var7 & 255);
      this.c8();
      return var8 - var3 + 1;
   }

   @Override
   protected int n5(byte[][] var1, int var2) {
      int var3 = this.a6(this.k5.n5() - var2);

      for (int var4 = 0; var4 < this.k5.a6(); var4++) {
         byte[] var5 = var1[var4];
         byte var6 = var5[this.u3() + var2 - 1];

         for (int var7 = 0; var7 < var3; var7++) {
            var5[this.u3() + var2 + var7] = var6;
         }
      }

      int var9 = var2 + var3;
      if (var9 == this.k5.n5()) {
         return var9 - var2;
      }

      for (int var10 = 0; var10 < this.k5.a6(); var10++) {
         byte[] var11 = var1[var10];
         byte var12 = var11[this.u3() + var2 - 1];
         byte var8 = var11[this.k5() + var9];
         var11[this.u3() + var9] = this.l6(var12 & 255, var8 & 255);
      }

      this.c8();
      return var9 - var2 + 1;
   }

   private static int k5(int var0) {
      int var1 = var0 << 31 >> 31;
      return var1 ^ var0 >> 1;
   }

   private static j5$n5 u3(int var0) {
      int var1 = 0;
      int var2 = 0;
      j5$n5 var3 = new j5$n5();
      short var4 = 0;

      while (true) {
         int var5 = l6(var4);
         int[] var6 = new int[]{var1};
         int[] var7 = new int[]{var2};
         n5(var0, var5, var6, var7);
         var1 = var6[0];
         var2 = var7[0];
         if (var1 > 8) {
            var4 = -1;

            while (true) {
               var5 = l6(var4);
               var6 = new int[]{var1};
               var7 = new int[]{var2};
               n5(var0, var5, var6, var7);
               var1 = var6[0];
               var2 = var7[0];
               if (var1 > 8) {
                  return var3;
               }

               j5$l6 var13 = new j5$l6(var4, var1);
               var3.n5((byte)var2, var13.k5());
               var4--;
            }
         }

         j5$l6 var8 = new j5$l6(var4, var1);
         var3.n5((byte)var2, var8.k5());
         var4++;
      }
   }

   private static void n5(int var0, int var1, int[] var2, int[] var3) {
      int var4 = var1 >> var0;
      var2[0] = var4 + var0 + 1;
      var3[0] = 1 << var0 | var1 & (1 << var0) - 1;
   }

   private byte l6(int var1, int var2) {
      if (this.k5.h0() != 2 && q1.n5(var1 - var2) <= this.n5().k5()) {
         int var4 = this.n5(this.a6[1]);
         return (byte)this.n5().n5(var1, var4);
      } else {
         int var3 = this.n5(this.a6[0]);
         return (byte)this.n5().n5(var2, var3 * u6.l6(var2 - var1));
      }
   }

   private int n5(z8 var1) {
      int var2 = var1.l6();
      int var3 = this.l6(var2, this.n5().u9() - this.n5[this.l6()] - 1, this.n5().u3());
      int var4 = var1.l6(var3 + var1.n5(), var2);
      var1.n5(var4, var3);
      return var4;
   }

   private int l6(int var1, int var2, int var3) {
      int var4 = ((r4)this.l6).a6();
      if (var4 >= var2 - (var3 + 1)) {
         return ((r4)this.l6).n5(var3) + 1;
      } else {
         return var1 == 0 ? var4 : (var4 << var1) + ((r4)this.l6).n5(var1);
      }
   }

   private int a6(int var1) {
      int var2 = 0;

      while (((r4)this.l6).k5()) {
         int var3 = q1.l6(1 << this.n5[this.l6()], var1 - var2);
         var2 += var3;
         com.aspose.slides.internal.f8y.n5.n5(var2 <= var1, "InvalidCompressedData");
         if (var3 == 1 << this.n5[this.l6()]) {
            this.h0();
         }

         if (var2 == var1) {
            break;
         }
      }

      if (var2 != var1) {
         var2 += this.n5[this.l6()] > 0 ? ((r4)this.l6).n5(this.n5[this.l6()]) : 0;
      }

      if (var2 > var1) {
         throw new com.aspose.slides.internal.z3b.k5("InvalidCompressedData");
      } else {
         return var2;
      }
   }
}
