package com.aspose.slides.internal.u2w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.q1;

class n5$n5 implements com.aspose.slides.internal.h9s.l6 {
   private final int[] n5;
   private final double[] l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;

   public n5$n5(int[] var1, double[] var2) {
      if (var1.length != var2.length) {
         throw new ArgumentException("The channelBits and channelConversionFunction lengths are different.");
      }

      this.n5 = var1;
      this.l6 = var2;

      for (int var3 = 0; var3 < var1.length; var3++) {
         this.k5 = this.k5 + (var1[var3] & 65535);
      }
   }

   @Override
   public final int[] n5() {
      return this.n5;
   }

   @Override
   public void l6() {
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
   }

   @Override
   public final byte[] n5(byte[] var1, int[] var2) {
      byte[] var3 = new byte[this.n5.length];
      this.n5(var3, var1, var2, this.u9, 1);
      return var3;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3, int var4) {
      this.u9 = (int)(((long)var4 * this.k5 + var3) % 8L);
   }

   protected int n5(int var1) {
      return 0;
   }

   protected void n5(int var1, byte var2) {
   }

   protected final void n5(byte[] var1, byte[] var2, int[] var3, int var4, int var5) {
      int var6 = (1 << 8 - var4) - 1;
      int var7 = (int)((long)var5 * this.k5);

      while (var7 > 0) {
         int var8 = 0;

         while (var8 < this.n5.length) {
            int var9 = this.n5[var8] & 65535;

            while (this.u3 < var9) {
               this.a6 <<= 8 - var4;
               this.a6 = this.a6 | var2[var3[0]] & 255 & var6;
               int var10 = q1.l6(8 - var4, var7);
               if (var4 + var10 < 8) {
                  this.a6 >>= 8 - var4 - var10;
               }

               this.u3 += var10;
               var7 -= var10;
               var4 += var10;
               if (var4 == 8) {
                  var4 = 0;
                  var6 = 255;
                  var3[0]++;
               } else {
                  var6 = (1 << 8 - var4) - 1;
               }
            }

            while (this.u3 >= var9) {
               int var12 = this.a6 >> this.u3 - var9 & (1 << var9) - 1;
               var12 = com.aspose.slides.internal.v6g.k5.u3(this.l6[var8] * var12 + 0.5, 14);
               byte var11 = (byte)(var12 + this.n5(var8));
               this.n5(var8, var11);
               if (var1 != null) {
                  var1[var8] = var11;
               }

               var8++;
               this.u3 -= var9;
               if (var8 == this.n5.length) {
                  break;
               }

               var9 = this.n5[var8] & 65535;
            }
         }
      }

      this.u9 = var4;
   }
}
