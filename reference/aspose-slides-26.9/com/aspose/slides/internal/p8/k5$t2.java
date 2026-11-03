package com.aspose.slides.internal.p8;

import com.aspose.slides.Collections.Generic.List;

class k5$t2 implements k5$a6 {
   private int n5 = 0;

   public k5$t2(int var1) {
      this.n5 = var1;
   }

   @Override
   public final int[] n5(long var1, int var3, int var4, String var5, String var6, String var7) {
      List var8 = new List();
      if (var1 >= 1000000000000L) {
         return null;
      }

      boolean var9 = k5.n5(var5, "ordinal");
      if (var1 == 0L) {
         var8.addItem(k5.t9()[0]);
      } else if (var9 && var1 <= 10L) {
         boolean var15 = k5.n5(var5, "female");
         if (var15) {
            var8.addItem(k5.z1()[(int)var1]);
         } else {
            var8.addItem(k5.t4()[(int)var1]);
         }
      } else {
         int var10 = (int)(var1 % 1000L);
         int var11 = (int)(var1 / 1000L % 1000L);
         int var12 = (int)(var1 / 1000000L % 1000L);
         int var13 = (int)(var1 / 1000000000L % 1000L);
         if (var13 > 0) {
            if (var13 > 1) {
               var8 = n5(var8, var13);
            }

            var8.addItem(k5.q0()[2]);
            var8.addItem(k5.q0()[4]);
         }

         if (var12 > 0) {
            if (var12 == 1) {
               var8.addItem(k5.q0()[0]);
            } else {
               var8 = n5(var8, var12);
            }

            if (var12 > 1) {
               var8.addItem(k5.q0()[4]);
            } else {
               var8.addItem(k5.q0()[3]);
            }
         }

         if (var11 > 0) {
            if (var11 > 1) {
               var8 = n5(var8, var11);
            }

            var8.addItem(k5.q0()[2]);
         }

         if (var10 > 0) {
            var8 = n5(var8, var10);
         }
      }

      var8 = k5.n5(var8, this.n5);
      return u3.n5(k5.n5(var8, " "), 0, true);
   }

   private static List<String> n5(List<String> var0, int var1) {
      int var2 = var1 % 10;
      int var3 = var1 / 10 % 10;
      int var4 = var1 / 100 % 10;
      if (var4 > 0) {
         if (var4 == 1 && var3 == 0 && var2 == 0) {
            var0.addItem(k5.q0()[1]);
         } else {
            var0.addItem(k5.z3()[var4]);
         }
      }

      if (var3 > 0) {
         if (var3 == 1) {
            var0.addItem(k5.m1()[var2]);
         } else if (var3 == 2) {
            var0.addItem(k5.k7()[var2]);
         } else {
            var0.addItem(k5.m3()[var3]);
            if (var2 > 0) {
               var0.addItem("y");
               var0.addItem(k5.t9()[var2]);
            }
         }
      } else if (var2 > 0) {
         var0.addItem(k5.t9()[var2]);
      }

      return var0;
   }
}
