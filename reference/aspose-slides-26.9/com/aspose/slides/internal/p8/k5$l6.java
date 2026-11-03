package com.aspose.slides.internal.p8;

import com.aspose.slides.Collections.Generic.List;

class k5$l6 implements k5$a6 {
   private int n5 = 0;

   public k5$l6(int var1) {
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
         var8.addItem(k5.n5()[0]);
      } else if (var9 && var1 < 10L) {
         var8.addItem(k5.l6()[(int)var1]);
      } else {
         int var10 = (int)(var1 % 1000L);
         int var11 = (int)(var1 / 1000L % 1000L);
         int var12 = (int)(var1 / 1000000L % 1000L);
         int var13 = (int)(var1 / 1000000000L % 1000L);
         if (var13 > 0) {
            var8 = n5(var8, var13);
            if (var9 && var1 % 1000000000L == 0L) {
               var8.addItem(k5.k5()[3]);
            } else {
               var8.addItem(k5.u3()[3]);
            }
         }

         if (var12 > 0) {
            var8 = n5(var8, var12);
            if (var9 && var1 % 1000000L == 0L) {
               var8.addItem(k5.k5()[2]);
            } else {
               var8.addItem(k5.u3()[2]);
            }
         }

         if (var11 > 0) {
            var8 = n5(var8, var11);
            if (var9 && var1 % 1000L == 0L) {
               var8.addItem(k5.k5()[1]);
            } else {
               var8.addItem(k5.u3()[1]);
            }
         }

         if (var10 > 0) {
            var8 = n5(var8, var10, var9);
         }
      }

      var8 = k5.n5(var8, this.n5);
      return u3.n5(k5.n5(var8, " "), 0, true);
   }

   private static List<String> n5(List<String> var0, int var1) {
      return n5(var0, var1, false);
   }

   private static List<String> n5(List<String> var0, int var1, boolean var2) {
      int var3 = var1 % 10;
      int var4 = var1 / 10 % 10;
      int var5 = var1 / 100 % 10;
      if (var5 > 0) {
         var0.addItem(k5.n5()[var5]);
         if (var2 && var1 % 100 == 0) {
            var0.addItem(k5.k5()[0]);
         } else {
            var0.addItem(k5.u3()[0]);
         }
      }

      if (var4 > 0) {
         if (var4 == 1) {
            if (var2) {
               var0.addItem(k5.a6()[var3]);
            } else {
               var0.addItem(k5.u9()[var3]);
            }
         } else {
            if (var2 && var3 == 0) {
               var0.addItem(k5.h0()[var4]);
            } else {
               var0.addItem(k5.c8()[var4]);
            }

            if (var3 > 0) {
               if (var2) {
                  var0.addItem(k5.l6()[var3]);
               } else {
                  var0.addItem(k5.n5()[var3]);
               }
            }
         }
      } else if (var3 > 0) {
         if (var2) {
            var0.addItem(k5.l6()[var3]);
         } else {
            var0.addItem(k5.n5()[var3]);
         }
      }

      return var0;
   }
}
