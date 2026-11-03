package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class x3z extends d5 {
   @Override
   public boolean n5(k6a var1, e4c var2) {
      double var3 = var2.n5 / var1.c8().h0();
      double var5 = var2.l6 / var1.c8().x8();
      List$Enumerator var7 = var1.l6().iterator();

      try {
         while (var7.hasNext()) {
            k6a var8 = (k6a)var7.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var8.s7(), o7p.class)) {
               double var9 = var8.c8().s7() != 0.0 ? var2.n5 / var8.c8().s7() : 1.0;
               double var11 = var8.c8().e2() != 0.0 ? var2.l6 / var8.c8().e2() : 1.0;
               if (n5(var9)) {
                  var8.n5(var9, 61);
               }

               if (n5(var11)) {
                  var8.n5(var11, 15);
               }
            } else {
               if (n5(var3)) {
                  var8.n5(var3, 61);
               }

               if (n5(var5)) {
                  var8.n5(var5, 15);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      l6(var1, var2.u9());
      return n5(var3) || n5(var5);
   }

   private static void l6(k6a var0, e4c var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0.s7(), v6s.class)) {
         var0.u3(61, var1.n5);
         var0.u3(15, var1.l6);
      }

      List$Enumerator var2 = var0.l6().iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            l6(var3, var1.u9());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public boolean n5(k6a var1) {
      this.s7(var1);
      e4c var2 = x8(var1).u9();
      e4c var3 = var1.c8().k5(true).u9();
      e4c var4 = var1.c8().k5(false).u9();
      new e4c();
      e4c var5;
      if (this.t2()) {
         var5 = new e4c(var3.n5, var2.l6);
         var1.c8().a6(com.aspose.slides.ms.System.q1.k5(var4.n5, var5.n5));
         var1.c8().c8(var5.l6);
      } else {
         var5 = new e4c(var2.n5, var3.l6);
         var1.c8().a6(var5.n5);
         var1.c8().c8(com.aspose.slides.ms.System.q1.k5(var4.l6, var5.l6));
      }

      var1.c8().k5(var5.n5);
      var1.c8().u9(var5.l6);
      e4c var6 = this.c8(var1).u9();
      double var7 = var5.n5 == 0.0 ? 1.0 : var6.n5 / var5.n5;
      double var9 = var5.l6 == 0.0 ? 1.0 : var6.l6 / var5.l6;
      boolean var11 = this.c8().u9() == 1;
      double var12;
      if (var11) {
         var12 = com.aspose.slides.ms.System.q1.k5(var7, var9);
      } else {
         var12 = this.t2() ? var9 : var7;
      }

      l6(var1, this.c8().n5(), this.c8().l6());
      this.t2(var1);
      double var14 = 0.0;
      double var16 = 0.0;
      List$Enumerator var18 = var1.l6().iterator();

      try {
         while (var18.hasNext()) {
            k6a var19 = (k6a)var18.next();
            k7t var20 = var19.c8();
            if (var20.c8() > 0.0 || var20.n3() > 0.0) {
               double var21 = var20.u3();
               double var23 = var20.a6();
               if (var21 < var14) {
                  var14 = var21;
               }

               if (var23 < var16) {
                  var16 = var23;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      if (var14 != 0.0 || var16 != 0.0) {
         List$Enumerator var65 = var1.l6().iterator();

         try {
            while (var65.hasNext()) {
               k6a var67 = (k6a)var65.next();
               var67.c8().n5(-var14, -var16);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var65, IDisposable.class)) {
               var65.dispose();
            }
         }
      }

      boolean var66 = false;
      List var68 = new List();
      double var69 = Double.MAX_VALUE;
      if (var1.k7() != null) {
         for (j2l var26 : var1.k7().u3()) {
            List var29 = var26.l6(var1);
            List$Enumerator var30 = var29.iterator();

            try {
               while (var30.hasNext()) {
                  k6a var31 = (k6a)var30.next();
                  if (!var68.containsItem(var31)) {
                     var68.addItem(var31);
                     var69 = com.aspose.slides.ms.System.q1.k5(var69, var31.a6(var26.a6()));
                  }

                  var66 |= var31.c8().a0() && var31.c8().m1();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                  var30.dispose();
               }
            }
         }
      }

      if (!var66 || !n5(var7 + 0.01) && !n5(var9 + 0.01)) {
         if (!n5(var12 + 0.01)) {
            if (var1.n5() != null) {
               var1.k5(61, var5.n5);
               var1.k5(15, var5.l6);
            }

            return true;
         } else {
            List$Enumerator var71 = var1.l6().iterator();

            try {
               while (var71.hasNext()) {
                  k6a var73 = (k6a)var71.next();
                  if (this.t2()) {
                     if (var11) {
                        var73.n5(var12, 61);
                     }

                     var73.n5(var12, 15);
                  } else {
                     if (var11) {
                        var73.n5(var12, 15);
                     }

                     var73.n5(var12, 61);
                  }

                  var73.s7().n5(var73, var12);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var71, IDisposable.class)) {
                  var71.dispose();
               }
            }

            var1.w1();
            return false;
         }
      } else {
         List$Enumerator var70 = var68.iterator();

         try {
            while (var70.hasNext()) {
               k6a var72 = (k6a)var70.next();
               var69 = com.aspose.slides.ms.System.q1.k5(var6.l6 * var12, var69);
               h3o.l6(var72, var69);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var70, IDisposable.class)) {
               var70.dispose();
            }
         }

         return false;
      }
   }

   private e4c c8(k6a var1) {
      double var2 = var1.a6(61);
      double var4 = var1.a6(15);
      if (var2 == 0.0) {
         var2 = Double.POSITIVE_INFINITY;
      }

      if (var4 == 0.0) {
         var4 = Double.POSITIVE_INFINITY;
      }

      double var6 = var1.h0(61);
      double var8 = var1.h0(15);
      if (!com.aspose.slides.ms.System.d2.k5(var6) && var6 > var2) {
         var2 = var6;
      }

      if (!com.aspose.slides.ms.System.d2.k5(var8) && var8 > var4) {
         var4 = var8;
      }

      return new e4c(var2, var4);
   }

   private void t2(k6a var1) {
      int var2 = this.c8().k5();
      boolean var3 = var2 == 1 || var2 == 3;
      int var4 = var1.l6().size();
      double var5 = 0.0;
      double var7 = 0.0;

      for (int var9 = var3 ? var4 - 1 : 0; var3 ? var9 >= 0 : var9 < var4; var9 += var3 ? -1 : 1) {
         k6a var10 = var1.l6().get_Item(var9);
         if (this.t2()) {
            var7 += this.n5(var10, var7, var1.c8().h0(), this.c8().u3());
         } else {
            var5 += this.l6(var10, var5, var1.c8().x8(), this.c8().a6());
         }
      }
   }

   private double n5(k6a var1, double var2, double var4, int var6) {
      double var7 = 0.0;
      if (var6 == 2) {
         var7 = (var4 - var1.c8().h0()) / 2.0;
      } else if (var6 == 3) {
         var7 = var4 - var1.c8().h0();
      }

      var1.c8().n5(new e4c(var7, var2));
      return var1.c8().x8();
   }

   private double l6(k6a var1, double var2, double var4, int var6) {
      double var7 = 0.0;
      if (var6 == 2) {
         var7 = (var4 - var1.c8().x8()) / 2.0;
      } else if (var6 == 3) {
         var7 = var4 - var1.c8().x8();
      }

      var1.c8().n5(new e4c(var2, var7));
      return var1.c8().h0();
   }

   @Override
   public e4c k5(k6a var1) {
      double var2 = 0.0;
      double var4 = 0.0;
      k6a var6 = null;
      k6a var7 = var1.n5();
      if (var7 != null) {
         int var8 = var1.t4() - 1;

         for (int var9 = var8 + 1; var9 < var7.l6().size(); var9++) {
            k6a var10 = var7.l6().get_Item(var9);
            if (var10.c8().c8() != 0.0 || var10.c8().n3() != 0.0) {
               var6 = var10;
               break;
            }
         }

         if (var6 == null) {
            for (int var23 = var8 - 1; var23 >= 0; var23--) {
               k6a var24 = var7.l6().get_Item(var23);
               if (var24.c8().c8() != 0.0 || var24.c8().n3() != 0.0) {
                  var6 = var24;
                  break;
               }
            }
         }
      }

      if (var6 == null) {
         var6 = var1;
      }

      double var11 = com.aspose.slides.ms.System.q1.n5(var6.c8().c8());
      double var13 = com.aspose.slides.ms.System.q1.n5(var6.c8().n3());
      e4c var15 = var1.z8().u9();
      double var16 = var1.c8().c8();
      double var18 = var1.c8().n3();
      e4c var20 = var1.m3().u9();
      if (this.t2()) {
         var2 = (var20.n5 + var15.n5) * var16;
         var4 = var20.l6 * var18 + var15.l6 * var13;
      } else {
         var2 = var20.n5 * var16 + var15.n5 * var11;
         var4 = (var20.l6 + var15.l6) * var18;
      }

      return new e4c(var2, var4);
   }

   private void s7(k6a var1) {
      if (var1.k7() != null) {
         int var2 = this.t2() ? 15 : 61;

         for (j2l var6 : var1.k7().u3()) {
            if (var6.k5() != 1 && var2 == var6.a6()) {
               e4c var7 = this.c8(var1).u9();
               List var8 = var6.n5(var1);
               if (var8.size() > 0) {
                  double var9 = 0.0;
                  double var11 = 0.0;
                  double var13 = 0.0;
                  double var15 = 0.0;
                  int var17 = ((k6a)var8.get_Item(0)).t4() - 1;
                  int var18 = ((k6a)var8.get_Item(var8.size() - 1)).t4();
                  var8.clear();

                  for (int var19 = 0; var19 < var17; var19++) {
                     k6a var20 = var1.l6().get_Item(var19);
                     var9 += var20.c8().h0();
                     var11 += var20.c8().x8();
                  }

                  if (var18 < var1.l6().size()) {
                     k6a var30 = var1.l6().get_Item(var18);
                     var9 += var30.c8().h0();
                     var11 += var30.c8().x8();
                  }

                  for (int var31 = var17; var31 < var18; var31++) {
                     k6a var33 = var1.l6().get_Item(var31);
                     var8.addItem(var33);
                     var13 += var33.c8().h0();
                     var15 += var33.c8().x8();
                  }

                  List$Enumerator var32 = var8.iterator();

                  try {
                     while (var32.hasNext()) {
                        k6a var34 = (k6a)var32.next();
                        double var21 = var7.n5 - var9;
                        double var23 = var7.l6 - var11;
                        double var25 = this.t2() ? var23 / var15 : var21 / var13;
                        if (n5(var25)) {
                           var34.n5(var25, var2);
                           var34.w1();
                           var34.d5();
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
                        var32.dispose();
                     }
                  }
               }
            }
         }
      }
   }

   private static e4c x8(k6a var0) {
      double var1 = 0.0;
      double var3 = 0.0;
      double var5 = Double.MAX_VALUE;
      double var7 = Double.MAX_VALUE;
      double var9 = -Double.MAX_VALUE;
      double var11 = -Double.MAX_VALUE;
      List$Enumerator var13 = var0.l6().iterator();

      try {
         while (var13.hasNext()) {
            k6a var14 = (k6a)var13.next();
            double var15 = var14.c8().h0();
            double var17 = var14.c8().x8();
            if (var17 > 0.0) {
               var5 = com.aspose.slides.ms.System.q1.k5(var5, var1);
               var9 = com.aspose.slides.ms.System.q1.l6(var9, var1 + var17);
            }

            var1 += var17;
            if (var15 > 0.0) {
               var7 = com.aspose.slides.ms.System.q1.k5(var7, var3);
               var11 = com.aspose.slides.ms.System.q1.l6(var11, var3 + var15);
            }

            var3 += var15;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      double var20;
      if (var5 != Double.MAX_VALUE && var9 != -Double.MAX_VALUE) {
         var20 = com.aspose.slides.ms.System.q1.n5(var9 - var5);
      } else {
         var20 = 0.0;
      }

      double var22;
      if (var7 != Double.MAX_VALUE && var11 != -Double.MAX_VALUE) {
         var22 = com.aspose.slides.ms.System.q1.n5(var11 - var7);
      } else {
         var22 = 0.0;
      }

      return new e4c(var22, var20);
   }

   private y4t c8() {
      return (y4t)this.n5();
   }

   private boolean t2() {
      return this.c8().k5() == 1 || this.c8().k5() == 4;
   }
}
