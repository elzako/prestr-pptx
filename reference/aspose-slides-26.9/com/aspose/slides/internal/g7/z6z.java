package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class z6z {
   private List<Long> l6(String var1) {
      int var2 = var1.length();
      List var3 = new List(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(new long[var2]))));
      byte var4 = 8;
      byte var5 = 8;
      int var6 = -1;
      boolean var7 = false;
      boolean var8 = (var4 & 2) != 0;
      int var9 = 0;
      byte var10 = 1;
      var9 = var2 - 1;
      var6 = var2;
      var10 = -1;

      for (int var11 = 0; var11 < var2; var9 += var10) {
         char var12 = var1.charAt(var11);
         int var13 = this.n5(var12);
         if (var13 == 8) {
            var3.set_Item(var9, 0L);
         } else {
            var3.set_Item(var9, 2415788032L);
         }

         if ((var13 & 4) == 0) {
            boolean var14 = (var13 & 8) == 0;
            boolean var15 = (var13 & 1) != 0;
            if (var8 && var15) {
               if (var7) {
                  this.n5(var6, 2, var3);
               }

               if (var14) {
                  this.n5(var9, 1, var3);
               }
            }

            var7 = var14;
            var8 = (var13 & 2) != 0;
            var6 = var9;
         }

         var11++;
      }

      if (var7 && var8 && (var5 & 1) != 0) {
         this.n5(var6, 2, var3);
      }

      return var3;
   }

   private void n5(int var1, int var2, List<Long> var3) {
      long var4 = (Long)var3.get_Item(var1);
      long var6 = var4 & 4026531840L & 4294967295L;
      var6 = (var6 & 4294967295L) >> var2 & 4294967295L;
      var3.set_Item(var1, var4 & -4026531841L | com.aspose.slides.internal.v6g.k5.h0(var6, 10));
   }

   private int n5(char var1) {
      int var2 = this.l6(var1);
      return var2 >= 0 && var2 < 6 ? h0.n5[var2] : 8;
   }

   private int l6(char var1) {
      char var2 = (char)this.k5(var1);
      int var3 = this.n5(var2, h0.n5());
      return var3 < 0 ? 0 : l6(h0.n5()[var3].k5()) & 65535;
   }

   private int n5(char var1, n6[] var2) {
      int var3 = var2.length;
      short var4 = n5(var3);
      int var5 = 1 << var4;
      int var6 = var3 - var5;
      int var7 = var5;
      int var8 = 0;
      if (var3 == 0) {
         return -1;
      }

      if ((l6(var2[var6].n5()) & 65535) <= var1) {
         var8 = var6;
      }

      while (var7 > 1) {
         var7 >>= 1;
         if ((l6(var2[var8 + var7].n5()) & 65535) <= var1) {
            var8 += var7;
         }
      }

      return (l6(var2[var8].n5()) & 65535) <= var1 && (l6(var2[var8].l6()) & 65535) >= var1 ? var8 : -1;
   }

   private static short n5(int var0) {
      if (var0 <= 0) {
         return -32;
      }

      byte var1 = 0;
      if (var0 >= 65536) {
         var0 >>= 16;
         var1 = (byte)((var1 & 255) + 16);
      }

      if (var0 >= 256) {
         var0 >>= 8;
         var1 = (byte)((var1 & 255) + 8);
      }

      if (var0 >= 16) {
         var0 >>= 4;
         var1 = (byte)((var1 & 255) + 4);
      }

      if (var0 >= 4) {
         var0 >>= 2;
         var1 = (byte)((var1 & 255) + 2);
      }

      if (var0 >= 2) {
         var0 >>= 1;
         var1 = (byte)((var1 & 255) + 1);
      }

      return (short)(var1 & 0xFF);
   }

   private int k5(char var1) {
      return (var1 & 65535) >> 0;
   }

   public final m5 n5(String var1) {
      List var2 = this.l6(var1);
      var2.reverse();
      return new m5(var1, var2, null);
   }

   private static int l6(int var0) {
      return (var0 & 65535 & 32768) == 0 ? var0 : ((var0 & 65535 & 0xFF) << 8 | (var0 & 65535 & 0xFF00) >> 8) & 65535;
   }
}
