package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

class d0c {
   public static byte[] n5(byte[] var0) {
      t4 var1 = new t4(var0);
      int var2 = var1.u9();
      int var3 = var1.u9();
      int var4 = var1.u9();
      d0c$l6[] var5 = (d0c$l6[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(d0c$l6.class), com.aspose.slides.internal.v6g.k5.k5(var4, 8))
      );

      for (int var6 = 0; var6 < com.aspose.slides.internal.v6g.k5.k5(var4, 8); var6++) {
         var5[var6] = new d0c$l6();
         var5[var6].n5 = var1.c8();
         var5[var6].l6 = var1.c8();
         var5[var6].k5 = var1.c8();
         var5[var6].u3 = var1.c8();
      }

      int[] var21 = new int[com.aspose.slides.internal.v6g.k5.k5(var4, 8)];

      for (int var7 = 0; var7 < com.aspose.slides.internal.v6g.k5.k5(var4, 8); var7++) {
         var21[var7] = var1.u9();
      }

      d0c$n5[] var22 = new d0c$n5[com.aspose.slides.internal.v6g.k5.k5(var3, 8)];
      z3 var8 = new z3(var0, true);

      for (int var9 = 0; var9 < com.aspose.slides.internal.v6g.k5.k5(var3, 8); var9++) {
         d0c$n5 var10 = new d0c$n5(null);
         var10.n5 = var1.u9();
         var22[var9] = var10;
         short var11 = var1.h0();
         short var12 = var1.h0();
         var8.n5(var1.n5());
         var10.u3 = (d0c$k5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(d0c$k5.class), var10.n5));
         int var13 = 8;

         for (int var14 = 0; var14 < com.aspose.slides.internal.v6g.k5.k5(var10.n5, 8); var14++) {
            byte var15 = n5(var8);
            byte var16 = n5(var8);
            byte var17 = n5(var8);
            int var18 = var15 + var13;
            int var19 = com.aspose.slides.internal.v6g.k5.u3(((double)var18 * var11 + 1024.0) / 2048.0, 14);
            int var20 = com.aspose.slides.internal.v6g.k5.u3(-((double)var18 * var12 + 1024.0) / 2048.0, 14);
            var10.u3[var14] = new d0c$k5();
            var10.u3[var14].n5 = com.aspose.slides.internal.v6g.k5.k5(var18, 9);
            var10.u3[var14].l6 = (short)(var19 + var16);
            var10.u3[var14].k5 = (short)(var20 + var17);
            if (var14 == 0) {
               var10.l6 = (byte)var18;
            }

            var10.k5 = (byte)var18;
            var13 = var18 + 1;
         }

         var1.n5(var8.n5());
      }

      if (var1.n5() != var0.length) {
         throw new InvalidOperationException("Incorrect length of 'VDMX' table");
      } else {
         return n5(var2, var5, var21, var22);
      }
   }

   private static byte[] n5(int var0, d0c$l6[] var1, int[] var2, d0c$n5[] var3) {
      if (com.aspose.slides.internal.v6g.k5.k5(var0, 8) != 0 && com.aspose.slides.internal.v6g.k5.k5(var0, 8) != 1) {
         throw new ArgumentException("Version of 'VDMX' table is incorrect");
      }

      byte var4 = 6;
      int var5 = 6 + 4 * var1.length + 2 * var2.length + 4 * var3.length;

      for (int var6 = 0; var6 < var3.length; var6++) {
         var5 += var3[var6].u3.length * 6;
      }

      byte[] var12 = new byte[var5];
      q0 var7 = new q0(var12);
      var7.k5(var0);
      var7.k5(com.aspose.slides.internal.v6g.k5.k5(var3.length, 9));
      var7.k5(com.aspose.slides.internal.v6g.k5.k5(var1.length, 9));

      for (int var8 = 0; var8 < var1.length; var8++) {
         d0c$l6 var9 = var1[var8].n5();
         var7.n5(var9.n5);
         var7.n5(var9.l6);
         var7.n5(var9.k5);
         var7.n5(var9.u3);
      }

      for (int var13 = 0; var13 < var2.length; var13++) {
         var7.k5(var2[var13]);
      }

      for (int var14 = 0; var14 < var3.length; var14++) {
         d0c$n5 var15 = var3[var14];
         var7.k5(var15.n5);
         var7.n5(var15.l6);
         var7.n5(var15.k5);

         for (int var10 = 0; var10 < var15.u3.length; var10++) {
            d0c$k5 var11 = var15.u3[var14].n5();
            var7.k5(var11.n5);
            var7.n5(var11.l6);
            var7.n5(var11.k5);
         }
      }

      return var12;
   }

   private static byte n5(z3 var0) {
      byte var1 = 0;

      while (var0.l6()) {
         var1++;
      }

      if (var1 != 0 && !var0.l6()) {
         var1 *= -1;
      }

      return var1;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(d0c$l6.class, new d0c$1());
      com.aspose.slides.internal.v6g.k5.n5(d0c$k5.class, new d0c$2());
   }
}
