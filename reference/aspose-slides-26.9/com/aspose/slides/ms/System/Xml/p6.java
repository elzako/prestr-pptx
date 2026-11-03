package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;

public class p6 extends com.aspose.slides.internal.l7h.u9 {
   private boolean n5;
   private int u3 = -1;

   public p6(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3) {
      return this.n5(var1, var2, var3, false);
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, boolean var4) {
      int var5 = var3 + (this.u3 >= 0 ? 1 : 0);
      if (var4 && var5 % 2 != 0) {
         throw new ArgumentException(v3.n5("Invalid byte was found at index {0}.", -1), (String)null);
      } else {
         return var5 / 2;
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5) {
      int var6 = this.n5(var1, var2, var3);
      if (this.u3 >= 0) {
         if (var3 == 0) {
            return var6;
         }

         int var7 = var1[var2++] & 255;
         var3--;
         var4[var5++] = this.n5 ? (char)(this.u3 << 8 | var7) : (char)(var7 << 8 | this.u3);
         this.u3 = -1;
      }

      if ((var3 & 1) != 0) {
         this.u3 = var1[var2 + --var3] & 255;
      }

      if (this.n5) {
         int var12 = var2 + var3;
         if (this.n5) {
            while (var2 < var12) {
               int var13 = var1[var2++] & 255;
               int var14 = var1[var2++] & 255;
               var4[var5++] = (char)(var13 << 8 | var14);
            }
         } else {
            while (var2 < var12) {
               int var8 = var1[var2++] & 255;
               int var9 = var1[var2++] & 255;
               var4[var5++] = (char)(var9 << 8 | var8);
            }
         }
      } else {
         com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(var4)), var5 * 2, var3);
      }

      return var6;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, boolean var7, int[] var8, int[] var9, boolean[] var10) {
      var9[0] = 0;
      var8[0] = 0;
      if (this.u3 >= 0) {
         if (var3 == 0) {
            var10[0] = true;
            return;
         }

         int var11 = var1[var2++] & 255;
         var3--;
         var8[0]++;
         var4[var5++] = this.n5 ? (char)(this.u3 << 8 | var11) : (char)(var11 << 8 | this.u3);
         var6--;
         var9[0]++;
         this.u3 = -1;
      }

      if (var6 * 2 < var3) {
         var3 = var6 * 2;
         var10[0] = false;
      } else {
         var10[0] = true;
      }

      if (this.n5) {
         int var15 = var2;
         int var12 = var15 + (var3 & -2);
         if (this.n5) {
            while (var15 < var12) {
               int var18 = var1[var15++] & 255;
               int var19 = var1[var15++] & 255;
               var4[var5++] = (char)(var18 << 8 | var19);
            }
         } else {
            while (var15 < var12) {
               int var13 = var1[var15++] & 255;
               int var14 = var1[var15++] & 255;
               var4[var5++] = (char)(var14 << 8 | var13);
            }
         }
      } else {
         com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(var4)), var5 * 2, var3 & -2);
      }

      var9[0] += var3 / 2;
      var8[0] += var3;
      if ((var3 & 1) != 0) {
         this.u3 = var1[var2 + var3 - 1] & 255;
      }
   }
}
