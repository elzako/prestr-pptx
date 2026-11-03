package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.q1;

public class y2 extends k7 {
   public y2(v4 var1, d5 var2, u9 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected int n5(int var1, int var2, int var3) {
      int var4 = u6.n5(var1);
      m3 var5 = this.u3[n5(var1, var4)];
      int var6 = var5.l6();
      int var7 = this.n5().l6(var3 + n5(var5.n5(), var4));
      int var8 = this.n5().n5(n5(var2 - var7, var4));
      int var9 = l6(var5.n5(var6 | this.n5().k5()) ^ var8);
      this.k5(var6, var9, this.n5().u9());
      var5.n5(var8, this.n5().k5(), this.n5().h0());
      int var10 = this.n5().n5(var7, n5(var8, var4));
      com.aspose.slides.internal.f8y.n5.n5(this.n5().l6(var10, var2), "The reconstructed pixel is not equal to actual pixel.");
      return var10;
   }

   @Override
   protected int n5(int var1, byte[] var2, int var3) {
      int var4 = this.k5.e2()[var1] - var3;
      int var5 = this.u3() + var3;
      int var6 = this.k5() + var3;
      byte var7 = var2[var5 - 1];
      int var8 = 0;

      while (this.n5().l6(var2[var5 + var8] & 255, var7 & 255)) {
         var2[var5 + var8] = var7;
         if (++var8 == var4) {
            break;
         }
      }

      this.n5(var8, var8 == var4);
      if (var8 == var4) {
         return var8;
      }

      var2[var5 + var8] = (byte)this.l6(var2[var5 + var8] & 255, var7 & 255, var2[var6 + var8] & 255);
      this.c8();
      return var8 + 1;
   }

   @Override
   protected int n5(byte[][] var1, int var2) {
      int var3 = this.k5.n5() - var2;
      int var4 = this.u3() + var2;
      int var5 = this.k5() + var2;
      int var6 = 0;

      do {
         boolean var7 = true;

         for (int var8 = 0; var8 < this.k5.a6(); var8++) {
            byte[] var9 = var1[var8];
            byte var10 = var9[var4 - 1];
            if (!this.n5().l6(var9[var4 + var6] & 255, var10 & 255)) {
               var7 = false;
               break;
            }
         }

         if (!var7) {
            break;
         }

         for (int var12 = 0; var12 < this.k5.a6(); var12++) {
            byte[] var14 = var1[var12];
            byte var16 = var14[var4 - 1];
            var14[var4 + var6] = var16;
         }
      } while (++var6 != var3);

      this.n5(var6, var6 == var3);
      if (var6 == var3) {
         return var6;
      }

      for (int var11 = 0; var11 < this.k5.a6(); var11++) {
         byte[] var13 = var1[var11];
         byte var15 = var13[var4 - 1];
         int var17 = this.l6(var13[var4 + var6] & 255, var15 & 255, var13[var5 + var6] & 255);
         var13[var4 + var6] = (byte)var17;
      }

      this.c8();
      return var6 + 1;
   }

   private void n5(int var1, boolean var2) {
      y1 var3 = (y1)this.l6;

      while (var1 >= 1 << this.n5[this.l6()]) {
         var3.n5(1);
         var1 -= 1 << this.n5[this.l6()];
         this.h0();
      }

      if (var2) {
         if (var1 > 0) {
            var3.n5(1);
         }
      } else {
         var3.n5(var1, this.n5[this.l6()] + 1);
      }
   }

   private int l6(int var1, int var2, int var3) {
      if (this.k5.h0() != 2 && q1.n5(var2 - var3) <= this.n5().k5()) {
         int var5 = this.n5().n5(var1 - var2);
         this.n5(this.a6[1], var5);
         return this.n5().n5(var2, var5);
      } else {
         int var4 = this.n5().n5((var1 - var3) * u6.l6(var3 - var2));
         this.n5(this.a6[0], var4);
         return this.n5().n5(var3, var4 * u6.l6(var3 - var2));
      }
   }

   private void n5(z8 var1, int var2) {
      int var3 = var1.l6();
      int var4 = var1.k5(var2, var3);
      int var5 = 2 * q1.n5(var2) - var1.n5() - var4;
      com.aspose.slides.internal.f8y.n5.n5(
         var2 == var1.l6(var5 + var1.n5(), var3), "The condition errVal == ctx.ComputeErrVal(emErrVal + ctx.RItype, k) is violated."
      );
      this.k5(var3, var5, this.n5().u9() - this.n5[this.l6()] - 1);
      var1.n5(var2, var5);
   }

   private void k5(int var1, int var2, int var3) {
      y1 var4 = (y1)this.l6;
      int var5 = var2 >> var1;
      if (var5 < var3 - this.n5().u3() - 1) {
         if (var5 + 1 > 31) {
            var4.n5(0, var5 / 2);
            var5 -= var5 / 2;
         }

         var4.n5(1, var5 + 1);
         var4.n5(var2 & (1 << var1) - 1, var1);
      } else {
         if (var3 - this.n5().u3() > 31) {
            var4.n5(0, 31);
            var4.n5(1, var3 - this.n5().u3() - 31);
         } else {
            var4.n5(1, var3 - this.n5().u3());
         }

         var4.n5(var2 - 1 & (1 << this.n5().u3()) - 1, this.n5().u3());
      }
   }
}
