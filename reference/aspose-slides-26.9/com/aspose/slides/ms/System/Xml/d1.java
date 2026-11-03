package com.aspose.slides.ms.System.Xml;

public abstract class d1 extends com.aspose.slides.internal.l7h.u9 {
   public byte[] n5 = new byte[4];
   public int u3 = 0;

   @Override
   public int n5(byte[] var1, int var2, int var3) {
      return (var3 + this.u3) / 4;
   }

   public abstract int l6(byte[] var1, int var2, int var3, char[] var4, int var5);

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5) {
      int var6 = this.u3;
      if (this.u3 <= 0) {
         var6 = 0;
      } else {
         while (this.u3 < 4 && var3 > 0) {
            this.n5[this.u3] = var1[var2];
            var2++;
            var3--;
            this.u3++;
         }

         if (this.u3 < 4) {
            return 0;
         }

         var6 = this.l6(this.n5, 0, 4, var4, var5);
         var5 += var6;
         this.u3 = 0;
      }

      var6 = this.l6(var1, var2, var3, var4, var5) + var6;
      int var7 = var3 & 3;
      if (var7 >= 0) {
         System.arraycopy(var1, var2 + var3 - var7 + 0, this.n5, 0, var7);
         this.u3 = var7;
      }

      return var6;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, boolean var7, int[] var8, int[] var9, boolean[] var10) {
      var8[0] = 0;
      var9[0] = 0;
      int var11 = 0;
      int var12 = this.u3;
      if (var12 <= 0) {
         var11 = 0;
      } else {
         while (var12 < 4 && var3 > 0) {
            this.n5[var12] = var1[var2];
            var2++;
            var3--;
            var8[0]++;
            var12++;
         }

         if (var12 < 4) {
            this.u3 = var12;
            var10[0] = true;
            return;
         }

         var11 = this.l6(this.n5, 0, 4, var4, var5);
         var5 += var11;
         var6 -= var11;
         var9[0] = var11;
         this.u3 = 0;
         if (var6 == 0) {
            var10[0] = var3 == 0;
            return;
         }
      }

      if (var6 * 4 < var3) {
         var3 = var6 * 4;
         var10[0] = false;
      } else {
         var10[0] = true;
      }

      var8[0] += var3;
      var9[0] = this.l6(var1, var2, var3, var4, var5) + var11;
      int var13 = var3 & 3;
      if (var13 >= 0) {
         System.arraycopy(var1, var2 + var3 - var13 + 0, this.n5, 0, var13);
         this.u3 = var13;
      }
   }

   public final void n5(long var1, char[] var3, int var4) {
      var3[var4] = (char)(
         '\ud800'
            + (char)(((var1 & 4294967295L) >> 16 & 4294967295L) - 1L & 4294967295L)
            + (char)((var1 & 4294967295L) >> 10 & 4294967295L & 63L & 4294967295L)
      );
      var3[var4 + 1] = (char)('\udc00' + (char)(var1 & 4294967295L & 1023L & 4294967295L));
   }
}
