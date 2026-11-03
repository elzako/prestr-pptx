package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public abstract class f7 extends n2z {
   @Override
   r7c[] n5(List<n2z$n5> var1) {
      w8d[] var2 = this.h0();
      int[] var3 = n5(var1.size(), var2.length);
      double var4 = this.n5(var1, var2, var3);
      if (var4 < 1.0) {
         this.n5(var1, var4);
      }

      List var6 = new List();
      int var7 = 0;

      for (int var8 = 0; var8 < var2.length; var8++) {
         w8d var9 = var2[var8];
         int var10 = var3[var8];
         double var11 = 0.0;
         double var13 = 0.0;
         double var15 = 0.0;

         for (int var17 = 0; var17 < var10; var17++) {
            n2z$n5 var18 = (n2z$n5)var1.get_Item(var7 + var17);
            if (var18.u9() > var13) {
               var13 = var18.u9();
            }

            if (var18.a6() > var15) {
               var15 = var18.a6();
            }
         }

         if (var2.length == 1 && var10 > 1 && this.n5() == 10) {
            var11 = var15;
         } else {
            for (int var21 = 0; var21 < var10; var21++) {
               n2z$n5 var23 = (n2z$n5)var1.get_Item(var7 + var21);
               var11 += var23.a6();
               if (var23.a6() == 0.0) {
                  var11 += var15;
               }
            }
         }

         if (var8 == 2) {
            var11 *= -1.0;
         } else if (var8 == 1 && var10 > 1) {
            var11 *= 0.75;
         }

         for (int var22 = 0; var22 < var10; var22++) {
            n2z$n5 var24 = (n2z$n5)var1.get_Item(var7);
            double var19 = var24.a6() == 0.0 ? var15 : var24.a6();
            var11 += var8 == 2 ? var19 : -var19;
            var6.addRange(com.aspose.slides.ms.System.u3.n5(this.n5(var24, var9.n5(var11), var13)));
            var7++;
         }
      }

      return (r7c[])var6.toArray(new r7c[0]);
   }

   private void n5(List<n2z$n5> var1, double var2) {
      n2z$n5 var4 = n2z$n5.n5(var1);
      k0 var5 = var4.l6().t2().u3();
      List$Enumerator var6 = var1.iterator();

      try {
         while (var6.hasNext()) {
            n2z$n5 var7 = (n2z$n5)var6.next();
            var7.n5(var5.u3(), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   private double n5(IGenericList<n2z$n5> var1, w8d[] var2, int[] var3) {
      double var4 = 1.0;
      int var6 = 0;

      for (int var7 = 0; var7 < var2.length; var7++) {
         w8d var8 = var2[var7];
         int var9 = var3[var7];

         for (int var10 = 0; var10 < var9; var10++) {
            n2z$n5 var11 = (n2z$n5)var1.get_Item(var6);
            double var12 = var8.n5() / var11.u3();
            if (var12 < var4) {
               var4 = var12;
            }

            var6++;
         }
      }

      return var4;
   }

   private r7c[] n5(n2z$n5 var1, w8d var2, double var3) {
      List var5 = new List();
      double var6 = 0.0;
      if (var1.k5() == 1) {
         var6 = (var2.n5() - var1.u3()) / 2.0;
      } else if (var1.k5() == 2) {
         var6 = var2.n5() - var1.u3();
      }

      v2 var8 = new v2(this.u9().n5().n5(), this.u9().n5().l6());

      for (l2p var12 : var1.h0()) {
         double var13 = var6 / var2.n5();
         double var15 = (var6 + var12.l6().h0() / 2.0) / var2.n5();
         k0 var17 = var2.l6(var15).u3();
         v2 var18 = var2.n5(var15, 1.0, true).u9();
         v2 var19 = v2.l6(var18.a6()).u9();
         v2.n5(var17, var8).n5(var17);
         h6[] var20 = var12.u3().l6().l6();

         for (int var21 = 0; var21 < var20.length; var21++) {
            h6 var22 = var20[var21];
            k0 var23 = new k0(var12.l6().n5() + var12.l6().h0() / 2.0, var12.l6().u3() - var3 * 127.0 * 0.5);

            for (int var24 = 0; var24 < var22.n5(); var24++) {
               v2 var25 = k0.n5(var23, var22.n5(var24)).u9();
               v2 var26 = v2.n5(v2.n5(var19, var25.n5()), v2.n5(var18, var25.l6())).u9();
               var22.n5(var24, v2.n5(var17, var26).u3());
            }
         }

         var5.addItem(var12.u3());
         var6 += var12.l6().h0();
      }

      return (r7c[])var5.toArray(new r7c[0]);
   }
}
