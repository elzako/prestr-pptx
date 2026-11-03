package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.InvalidOperationException;

class o4 {
   public static byte[] n5(s8 var0, byte[] var1, int var2, int var3) {
      t4 var4 = new t4(var1);
      int var5 = var4.u9();
      int var6 = var4.u9();
      long var7 = var4.u3();
      o4$n5[] var9 = (o4$n5[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(o4$n5.class), com.aspose.slides.internal.v6g.k5.k5(var6, 8))
      );

      for (int var10 = 0; var10 < com.aspose.slides.internal.v6g.k5.k5(var6, 8); var10++) {
         var9[var10] = new o4$n5();
         var9[var10].n5 = var4.c8();
         var9[var10].l6 = var4.c8();
      }

      z3 var22 = new z3(var1, true);
      var22.n5(var4.n5());
      byte var11 = 8;
      int var12 = com.aspose.slides.internal.v6g.k5.u3(var2, 8) + 2 + 4 - 1 & -4;
      byte[] var13 = new byte[8 + var9.length * var12];

      int var14;
      for (var14 = 0; var14 < 8; var14++) {
         var13[var14] = var1[var14];
      }

      for (o4$n5 var18 : var9) {
         var13[var14] = var18.n5;
         var13[var14 + 1] = var18.l6;
         var14 += 2;

         for (int var19 = 0; var19 < com.aspose.slides.internal.v6g.k5.k5(var2, 8); var19++) {
            int var20 = com.aspose.slides.internal.v6g.k5.u3(
               (
                     (
                              64.0 * com.aspose.slides.internal.v6g.k5.t2(var18.n5, 6) * com.aspose.slides.internal.v6g.k5.t2(var0.n5(var19), 8)
                                 + com.aspose.slides.internal.v6g.k5.t2(var3, 8) / 2.0
                           )
                           / com.aspose.slides.internal.v6g.k5.t2(var3, 8)
                        + 32.0
                  )
                  / 64.0,
               14
            );
            byte var21 = n5(var22);
            var13[var19 + var14] = (byte)(var20 + var21);
         }

         var14 += var12 - 2;
      }

      if (var14 != var13.length) {
         throw new InvalidOperationException("Incorrect length of output data in 'hdmx' decoder");
      } else {
         return var13;
      }
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
      com.aspose.slides.internal.v6g.k5.n5(o4$n5.class, new o4$1());
   }
}
