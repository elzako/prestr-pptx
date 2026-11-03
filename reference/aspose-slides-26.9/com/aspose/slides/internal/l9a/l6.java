package com.aspose.slides.internal.l9a;

import com.aspose.slides.internal.b7s.h2;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.b7s.t2;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.d1;

public class l6 {
   public static t2 n5(h2 var0) {
      t2 var1 = null;
      int var2 = 0;
      int[] var3 = new int[]{0};
      var0.n5(var3);
      var2 = var3[0];
      byte[] var4 = new byte[5];
      var0.n5(var4, 0, 5);
      String var5 = j5.z3().l6(var4, 0, var4.length);
      if (d1.l6(var5, "JFIF")) {
         var1 = new t2();
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         int[] var12 = new int[]{0};
         var0.n5(var12);
         var6 = var12[0];
         int[] var13 = new int[]{0};
         var0.l6(var13);
         var7 = var13[0];
         var1.n5((byte)var7);
         int[] var14 = new int[]{0};
         var0.n5(var14);
         var8 = var14[0];
         int[] var15 = new int[]{0};
         var0.n5(var15);
         var9 = var15[0];
         var1.l6((short)var8);
         var1.k5((short)var9);
         int[] var16 = new int[]{0};
         var0.l6(var16);
         var10 = var16[0];
         int[] var17 = new int[]{0};
         var0.l6(var17);
         var11 = var17[0];
         if (var11 != 0 && var10 != 0) {
            int var18 = var11 * var10;
            int[] var19 = new int[var18];

            for (int var20 = 0; var20 < var18; var20++) {
               int var21 = 0;
               int var22 = 0;
               int var23 = 0;
               int[] var24 = new int[]{0};
               var0.l6(var24);
               var21 = var24[0];
               int[] var25 = new int[]{0};
               var0.l6(var25);
               var22 = var25[0];
               int[] var26 = new int[]{0};
               var0.l6(var26);
               var23 = var26[0];
               int var27 = (var21 << 16) + (var22 << 8) + var23;
               var19[var20] = var27;
            }

            var1.n5(new q0(var10, var11));
            var1.l6().l6(new y2(0, 0, var10, var11), var19);
         }

         var1.n5((short)var6);
      } else if (d1.l6(var5, "JFXX")) {
         var0.l6(var2 - 7);
      }

      return var1;
   }
}
