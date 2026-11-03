package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ApplicationException;

final class l7h {
   private final List<r7c> n5;
   private final double l6;
   private final v7u k5;
   private final z6e u3;
   private final z6e a6;

   public l7h(v7u var1, z6e var2, double var3) {
      this.k5 = var1;
      this.a6 = var2;
      this.u3 = new z6e(
         new w9(var2.n5().n5() + var1.n5().l6(), var2.n5().l6() + var1.n5().k5()),
         new j6(var2.l6().n5() - var1.n5().l6() - var1.n5().u3(), var2.l6().l6() - var1.n5().k5() - var1.n5().a6())
      );
      this.l6 = var3;
      this.n5 = new List<>();
      this.l6();
   }

   public final r7c[] n5() {
      return this.n5.toArray(new r7c[0]);
   }

   private void n5(double var1, double var3, t5g var5) {
      k1d[] var6 = var5.u9();

      for (k1d var10 : var6) {
         x6s var11 = (x6s)var10;
         k1d[] var12 = var11.u9();

         for (k1d var16 : var12) {
            j2p var17 = (j2p)var16;
            this.n5(var1 + var5.u3().n5() + var11.u3().n5(), var3 + var5.u3().l6() + var11.u3().l6(), var17);
         }
      }
   }

   private void n5(n7 var1, w1n var2) {
      if (var1.s7() == 0) {
         y8 var4 = new y8();
         this.n5.addItem(new r7c(var4, var2));
      } else {
         var1.n5(this.u3.n5().n5(), this.u3.n5().l6(), false);
         var1.a6();
         y8 var3 = n5(var1);
         this.n5.addItem(new r7c(var3, var2));
      }
   }

   private void n5(double var1, double var3, j2p var5) {
      n7 var6 = var5.l6();
      com.aspose.slides.internal.x4g.m1 var7 = new com.aspose.slides.internal.x4g.m1();

      try {
         var6.k5();
         var6.n5(var1, var3, false);
         var6.a6();
         this.n5(var6, var5.n5());
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   private void l6() {
      w1n var1 = new w1n();
      boolean var2 = this.k5.n5().n5() != null;
      if (this.k5.u3() != null) {
         u1 var3 = new u1(this.k5, this.u3, var1);
         this.n5.addRange(com.aspose.slides.ms.System.u3.n5(var3.n5()));
         if (var2) {
            this.n5(com.aspose.slides.ms.System.u3.n5(var3.l6()));
         }
      } else {
         x7n var35 = new x7n(this.k5, this.u3, var1);
         k1d[] var4 = var35.u9();
         List var5 = var2 ? new List() : null;

         for (k1d var9 : var4) {
            r5w var10 = (r5w)var9;
            k1d[] var11 = var10.u9();

            for (k1d var15 : var11) {
               k4s var16 = (k4s)var15;
               double var17 = var10.u3().n5() + var16.u3().n5();
               double var19 = var10.u3().l6() + var16.u3().l6();
               if (null != var16.n5()) {
                  this.n5(var17, var19, var16.n5());
               }

               k1d[] var21 = var16.u9();

               for (k1d var25 : var21) {
                  x6s var26 = (x6s)var25;
                  k1d[] var27 = var26.u9();

                  for (k1d var31 : var27) {
                     j2p var32 = (j2p)var31;
                     this.n5(var17 + var26.u3().n5(), var19 + var26.u3().l6(), var32);
                     if (var2) {
                        k0 var33 = new k0(
                           var17 + var26.u3().n5() + var32.u3().n5() + this.u3.n5().n5(), var19 + var26.u3().l6() + var32.u3().l6() + this.u3.n5().l6()
                        );
                        d4 var34 = new d4(var33.n5(), var33.l6(), var33.n5() + var32.k5().n5(), var33.l6() - var32.k5().l6());
                        var5.addItem(new l2p(this.n5.get_Item(this.n5.size() - 1), var34.s7()));
                     }
                  }
               }
            }
         }

         if (var2) {
            this.n5(var5);
         }
      }
   }

   private void n5(IGenericEnumerable<l2p> var1) {
      n2z var2 = this.k5.n5().n5();
      if (var2 != null) {
         var2.n5(this.a6);
         r7c[] var3 = var2.n5(var1, this.k5);
         this.n5.clear();
         this.n5.addRange(com.aspose.slides.ms.System.u3.n5(var3));
      }
   }

   public static y8 n5(n7 var0) {
      y8 var1 = new y8();
      com.aspose.slides.internal.o9b.w1[] var2 = var0.c8();
      int[] var3 = var0.t2();
      boolean var4 = true;
      int var5 = -1;

      for (int var6 = 0; var6 < var3.length; var6++) {
         int var7 = var3[var6];
         if ((var7 & 1) != 1) {
            var5 = var6;
            var4 = false;
         } else if ((var7 & 128) != 128) {
            if (1 != var7 && 161 != var7) {
               throw new ApplicationException();
            }
         } else {
            int var8 = var6 - var5 + 1;
            h6 var9 = new h6(0);

            for (int var10 = 0; var10 < var8; var10++) {
               com.aspose.slides.internal.o9b.w1 var11 = var2[var5 + var10].u3();
               var9.n5(new k0(var11.l6(), var11.k5()));
            }

            var9.a6();
            var1.n5(var9);
            var4 = true;
            var5 = -1;
         }
      }

      return var1;
   }
}
