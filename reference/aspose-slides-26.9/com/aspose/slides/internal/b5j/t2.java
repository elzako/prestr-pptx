package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;

public class t2 {
   private static final com.aspose.slides.internal.r7c.c8 n5 = new com.aspose.slides.internal.r7c.c8("(?=[MmZzLlHhVvCcSsQqTtAa])");
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "M", "m", "Z", "z", "L", "l", "H", "h", "V", "v", "C", "c", "S", "s", "Q", "q", "T", "t", "A", "a"
   );

   public static List<c8> n5(String var0, n3 var1) {
      List var2 = new List();
      if (d1.n5(var0)) {
         return var2;
      }

      String[] var3 = n5.n5(var0);

      for (String var7 : var3) {
         if (!d1.n5(d1.l6(var7))) {
            int var8 = n5(com.aspose.slides.ms.System.t9.q0(var7.charAt(0)));
            n5 var9 = new n5(var7);
            switch (var8) {
               case 0:
               case 1:
                  float[] var14 = new float[2];
                  if (n5(var9, var14)) {
                     boolean var15 = var8 == 1;
                     int var12 = var15 && var2.size() == 0 ? 0 : var8;
                     var2.addItem(new c8(var12, var1.k5(var14[0]), var1.k5(var14[1])));
                     int var13 = var15 ? 4 : 3;
                     n5(2, var2, var13, var9, var1);
                  }
                  break;
               case 2:
                  var2.addItem(new c8(var8));
                  break;
               case 3:
               case 4:
               case 15:
               case 16:
                  n5(2, var2, var8, var9, var1);
                  break;
               case 5:
               case 6:
               case 7:
               case 8:
                  n5(1, var2, var8, var9, var1);
                  break;
               case 9:
               case 10:
                  n5(6, var2, var8, var9, var1);
                  break;
               case 11:
               case 12:
               case 13:
               case 14:
                  n5(4, var2, var8, var9, var1);
                  break;
               case 17:
               case 18:
                  float[] var10 = new float[7];

                  while (l6(var9, var10)) {
                     for (int var11 = 0; var11 < var10.length; var11++) {
                        if (var11 != 2 && var11 != 3 && var11 != 4) {
                           var10[var11] = var1.k5(var10[var11]);
                        }
                     }

                     var2.addItem(new c8(var8, var10));
                  }
            }
         }
      }

      return var2;
   }

   private static void n5(int var0, List<c8> var1, int var2, n5 var3, n3 var4) {
      float[] var5 = new float[var0];

      while (n5(var3, var5)) {
         for (int var6 = 0; var6 < var0; var6++) {
            var5[var6] = var4.k5(var5[var6]);
         }

         var1.addItem(new c8(var2, var5));
      }
   }

   private static boolean n5(n5 var0, float[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var0.k5();
      }

      return !var0.n5();
   }

   private static boolean l6(n5 var0, float[] var1) {
      var1[0] = var0.k5();
      var1[1] = var0.k5();
      var1[2] = var0.k5();
      var1[3] = var0.l6() ? 1.0F : 0.0F;
      var1[4] = var0.l6() ? 1.0F : 0.0F;
      var1[5] = var0.k5();
      var1[6] = var0.k5();
      return !var0.n5();
   }

   private static int n5(String var0) {
      byte var1;
      switch (l6.n5(var0)) {
         case 0:
            var1 = 0;
            break;
         case 1:
            var1 = 1;
            break;
         case 2:
            var1 = 2;
            break;
         case 3:
            var1 = 2;
            break;
         case 4:
            var1 = 3;
            break;
         case 5:
            var1 = 4;
            break;
         case 6:
            var1 = 5;
            break;
         case 7:
            var1 = 6;
            break;
         case 8:
            var1 = 7;
            break;
         case 9:
            var1 = 8;
            break;
         case 10:
            var1 = 9;
            break;
         case 11:
            var1 = 10;
            break;
         case 12:
            var1 = 11;
            break;
         case 13:
            var1 = 12;
            break;
         case 14:
            var1 = 13;
            break;
         case 15:
            var1 = 14;
            break;
         case 16:
            var1 = 15;
            break;
         case 17:
            var1 = 16;
            break;
         case 18:
            var1 = 17;
            break;
         case 19:
            var1 = 18;
            break;
         default:
            var1 = 19;
      }

      return var1;
   }
}
