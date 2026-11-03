package com.aspose.slides.internal.p8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;

class k5$k5 implements k5$a6 {
   private int n5 = 0;

   public k5$k5(int var1) {
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
         var8.addItem(k5.t2()[0]);
      } else if (var9 && var1 <= 10L) {
         boolean var15 = k5.n5(var5, "female");
         if (var15) {
            var8.addItem(k5.s7()[(int)var1]);
         } else {
            var8.addItem(k5.x8()[(int)var1]);
         }
      } else {
         int var10 = (int)(var1 % 1000L);
         int var11 = (int)(var1 / 1000L % 1000L);
         int var12 = (int)(var1 / 1000000L % 1000L);
         int var13 = (int)(var1 / 1000000000L % 1000L);
         if (var13 > 0) {
            var8 = n5(var8, var13);
            if (var13 == 1) {
               var8.addItem(k5.n3()[5]);
            } else {
               var8.addItem(k5.n3()[6]);
            }
         }

         if (var12 > 0) {
            var8 = n5(var8, var12);
            if (var12 == 1) {
               var8.addItem(k5.n3()[3]);
            } else {
               var8.addItem(k5.n3()[4]);
            }
         }

         if (var11 > 0) {
            if (var11 > 1) {
               var8 = n5(var8, var11);
            }

            var8.addItem(k5.n3()[2]);
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
         if (var4 > 1) {
            var0.addItem(k5.t2()[var4]);
         }

         if (var4 > 1 && var3 == 0 && var2 == 0) {
            var0.addItem(k5.n3()[1]);
         } else {
            var0.addItem(k5.n3()[0]);
         }
      }

      if (var3 > 0) {
         if (var3 == 1) {
            var0.addItem(k5.y4()[var2]);
         } else if (var3 < 7) {
            if (var2 == 1) {
               var0.addItem(k5.e2()[var3]);
               var0.addItem("et");
               var0.addItem(k5.t2()[var2]);
            } else {
               a5 var5 = new a5();
               var5.n5(k5.e2()[var3]);
               if (var2 > 0) {
                  var5.n5('-');
                  var5.n5(k5.t2()[var2]);
               }

               var0.addItem(var5.toString());
            }
         } else if (var3 == 7) {
            if (var2 == 1) {
               var0.addItem(k5.e2()[6]);
               var0.addItem("et");
               var0.addItem(k5.y4()[var2]);
            } else {
               a5 var6 = new a5();
               var6.n5(k5.e2()[6]);
               var6.n5('-');
               var6.n5(k5.y4()[var2]);
               var0.addItem(var6.toString());
            }
         } else if (var3 == 8) {
            a5 var7 = new a5();
            var7.n5(k5.e2()[var3]);
            if (var2 > 0) {
               var7.n5('-');
               var7.n5(k5.t2()[var2]);
            } else {
               var7.n5('s');
            }

            var0.addItem(var7.toString());
         } else if (var3 == 9) {
            a5 var8 = new a5();
            var8.n5(k5.e2()[8]);
            var8.n5('-');
            var8.n5(k5.y4()[var2]);
            var0.addItem(var8.toString());
         }
      } else if (var2 > 0) {
         var0.addItem(k5.t2()[var2]);
      }

      return var0;
   }
}
