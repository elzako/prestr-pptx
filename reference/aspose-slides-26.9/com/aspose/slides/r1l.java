package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class r1l extends d5 {
   private boolean n5;

   public final boolean c8() {
      return this.n5;
   }

   @Override
   protected void L_() {
      this.n5 = false;
   }

   @Override
   public boolean n5(k6a var1) {
      h5z var2 = this.t2();
      int var3 = var1.l6().size();
      if (var3 > 0) {
         double var4 = var1.a6(61);
         double var6 = var1.a6(15);
         double var8 = var1.a6(23);
         if (var8 > 1.0) {
            var8 = 1.0;
         } else if (var8 < 0.0) {
            var8 = 0.0;
         }

         int var10 = var3;
         double var11 = 0.0;

         for (int var13 = 0; var13 < var3; var13++) {
            k6a var14 = var1.l6().get_Item(var13);
            k6a var15 = this.n5(var2.k5(), var14.l6());
            if (var15 == null) {
               throw new NullReferenceException("TreeNode couldn't be empty.");
            }

            if (var15.j5().l6 != 1.0) {
               var11 += var15.j5().l6;
               var10--;
            }
         }

         double var16 = var4 - var4 * var8;
         double var18 = var4 - var16;
         double var20 = var6 / (var10 + var11);
         double var22 = var16 / (2.0 * (var10 + var11));
         double var24 = 0.0;
         double var26 = var2.h0() == 0 ? var18 : 0.0;
         if (var2.u9() == 1) {
            var26 += var16 / 2.0;
         }

         double var28 = var2.u9() == 1 ? 0.0 : var16;

         for (int var30 = 0; var30 < var3; var30++) {
            k6a var31 = var1.l6().get_Item(var30);
            var31.u3(15, var20);
            k6a var32 = this.n5(var2.k5(), var31.l6());
            k6a var33 = this.n5(var2.u3(), var31.l6());
            if (var32 == null) {
               throw new NullReferenceException("TreeNode couldn't be empty.");
            }

            double var34 = var22 * var32.j5().l6;
            if (var30 != 0 || var2.u9() != 4) {
               var28 += (var2.u9() == 1 ? 2 : -2) * var34;
               var26 += (var2.u9() == 1 ? -1 : 1) * var34;
            }

            double var36 = 0.0;
            k6a var38 = this.n5(var2.a6(), var31.l6());
            if (var2.h0() == 1 || var2.h0() == 0 && var38 == null) {
               var36 = var26;
            }

            var31.c8().n5(var36, var24);
            if (!this.n5) {
               if (var32 != null) {
                  if (var2.u9() == 4) {
                     var32.c8().x8(180.0);
                  }

                  SmartArtShape var39 = var32.c8().l6();
                  if (var39.getShapeType() == 8 && var39.e2().l6()[0].a6()) {
                     var39.getAdjustments()
                        .get_Item(0)
                        .setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 * var34 / com.aspose.slides.ms.System.q1.k5(var20, var28), 14));
                  }

                  double var40 = var28 / 2.0;
                  if (var2.h0() == 0 && var38 != null) {
                     var40 += var26;
                  }

                  this.n5(var32, var28, var20, var40);
               }

               double var42 = var18 + (var16 - var28) / 2.0 + var34;
               if (var38 != null) {
                  if (var2.u9() == 1) {
                     var38.c8().x8(180.0);
                  }

                  SmartArtShape var44 = var38.c8().l6();
                  if (var44.getShapeType() == 9) {
                     int var45;
                     int var46;
                     if (var2.u9() == 4) {
                        var45 = var2.h0() == 0 ? 0 : 1;
                        var46 = var2.h0() == 0 ? 1 : 0;
                     } else {
                        var45 = var2.h0() == 0 ? 1 : 0;
                        var46 = var2.h0() == 0 ? 0 : 1;
                     }

                     var44.getAdjustments()
                        .get_Item(var46)
                        .setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 * var22 / com.aspose.slides.ms.System.q1.k5(var20, var42), 14));
                     var44.getAdjustments().get_Item(var45).setRawValue(0L);
                  }

                  double var47 = var42 / 2.0;
                  if (var2.h0() == 1) {
                     var47 += var28 - var22;
                  }

                  this.n5(var38, var42, var20, var47);
               }

               if (var33 != null) {
                  SmartArtShape var56 = var33.c8().l6();
                  if (var56.getShapeType() == 9) {
                     var56.getAdjustments().get_Item(0).setRawValue(0L);
                     var56.getAdjustments().get_Item(1).setRawValue(0L);
                  }

                  double var57 = var2.c8() == 0 ? var42 - var34 : var18;
                  double var49 = var57 / 2.0;
                  if (var2.h0() == 1) {
                     var49 += var28;
                  }

                  if (var2.c8() == 1 && var2.h0() == 1) {
                     var49 += var42 - var34 - var57;
                  }

                  this.n5(var33, var57, var20, var49);
               }
            }

            var24 += var20 * var32.j5().l6;
         }
      }

      if (this.n5) {
         return true;
      }

      List$Enumerator var51 = var1.l6().iterator();

      try {
         while (var51.hasNext()) {
            k6a var52 = (k6a)var51.next();
            var52.s7().u9(var52);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var51, IDisposable.class)) {
            var51.dispose();
         }
      }

      this.n5 = true;
      return false;
   }

   private void n5(k6a var1, double var2, double var4, double var6) {
      var1.u3(61, var2);
      var1.u3(15, var4);
      var1.u3(8, var6);
      var1.u3(10, var4 / 2.0);
   }

   private k6a n5(String var1, List<k6a> var2) {
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            k6a var4 = (k6a)var3.next();
            if (com.aspose.slides.ms.System.d1.a6(var4.h0().J_(), var1)) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }

   private h5z t2() {
      return (h5z)this.n5();
   }
}
