package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.List;

public abstract class s4 extends n2z {
   @Override
   r7c[] n5(List<n2z$n5> var1) {
      w8d[] var2 = this.h0();
      int var3 = var2.length / 2;
      List var4 = n2z$n5.l6(var1);
      int[] var5 = n5(var4.size(), var3);
      n2z$n5[] var6 = new n2z$n5[var3];
      double[] var7 = new double[var3];
      int var8 = 0;

      for (int var9 = 0; var9 < var3; var9++) {
         int var10 = var5[var9];
         n2z$n5[] var11 = new n2z$n5[var10];

         for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (n2z$n5)var4.get_Item(var8);
            var8++;
         }

         var6[var9] = n2z$n5.n5(com.aspose.slides.ms.System.u3.n5(var11));
         var7[var9] = (var2[var9 * 2].n5() + var2[var9 * 2 + 1].n5()) / 2.0;
      }

      g8v[] var13 = this.n5(var6, var7);
      List var14 = new List();

      for (int var15 = 0; var15 < var3; var15++) {
         n2z$n5 var16 = var6[var15];
         var14.addRange(com.aspose.slides.ms.System.u3.n5(this.n5(var16.h0(), var13[var15], var2[var15 * 2], var2[var15 * 2 + 1])));
      }

      return (r7c[])var14.toArray(new r7c[0]);
   }

   private g8v[] n5(n2z$n5[] var1, double[] var2) {
      d4[] var3 = (d4[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(d4.class), var1.length));

      for (int var4 = 0; var4 < var3.length; var4++) {
         var1[var4].n5().n5().n5(var3[var4]);
      }

      if (var1.length > 1) {
         double var5 = var3[0].c8();
         double var7 = var3[0].h0() / var2[0];

         for (int var9 = 1; var9 < var3.length; var9++) {
            d4 var10 = var3[var9].s7();
            if (var10.c8() > var5) {
               var5 = var10.c8();
            }

            double var11 = var10.h0() / var2[var9];
            if (var11 > var7) {
               var7 = var11;
            }
         }

         for (int var17 = 0; var17 < var3.length; var17++) {
            d4 var18 = var3[var17].s7();
            double var19 = var5 - var18.c8();
            double var13 = var7 * var2[var17] - var18.h0();
            if (var1[var17].k5() == 1) {
               var3[var17] = new d4(var18.n5() - var13 / 2.0, var18.l6() - var19 / 2.0, var18.k5() + var13 / 2.0, var18.u3() + var19 / 2.0);
            } else if (var1[var17].k5() == 2) {
               var3[var17] = new d4(var18.n5() - var13, var18.l6() - var19 / 2.0, var18.k5(), var18.u3() + var19 / 2.0);
            } else {
               var3[var17] = new d4(var18.n5(), var18.l6() - var19 / 2.0, var18.k5() + var13, var18.u3() + var19 / 2.0);
            }
         }
      }

      g8v[] var16 = new g8v[var3.length];

      for (int var15 = 0; var15 < var3.length; var15++) {
         var16[var15] = new g8v(var3[var15].s7());
      }

      return var16;
   }
}
