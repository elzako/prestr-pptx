package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class e3x extends g2l {
   private int k5;
   private final u5w[] u3;
   private final a6y[] a6;
   private final g4j[] u9;

   public final g4j[] u3() {
      return this.u9;
   }

   public e3x(double var1, ChartSeries var3, t9z[] var4) {
      double var5 = n5(com.aspose.slides.ms.System.u3.n5(var4));
      if (var5 > 0.0) {
         this.u9 = new g4j[var4.length];
         int var7 = -1;
         boolean var8 = true;
         double var9 = 0.0;
         double var11 = 0.0;
         double[] var13 = new double[]{0.0};
         double[] var14 = new double[]{0.0};
         this.n5(com.aspose.slides.ms.System.u3.n5(var4), var13, var14);
         var9 = var13[0];
         var11 = var14[0];

         for (int var15 = 0; var15 < var4.length; var15++) {
            if (var4[var15].s7() != null && var4[var15].s7().getExplosion() != -1) {
               var7 = com.aspose.slides.ms.System.q1.l6(var4[var15].s7().getExplosion(), var7);
            } else {
               var8 = false;
            }

            t9z var16 = var4[var15];
            double var17 = com.aspose.slides.ms.System.q1.n5(var16.n5()) / var5;
            double var19 = var17 < 1.0E-9 && var16.c8() ? 0.0 : com.aspose.slides.internal.c8e.k5.n5(var17 * 360.0, var9, var11);
            g4j var21 = new g4j(var16, var1, var19, var17, var16.n5());
            this.u9[var15] = var21;
            var1 += var19;
         }

         this.k5 = var8 ? var7 : com.aspose.slides.ms.System.q1.n5(var7, var3.getExplosion());
         this.n5(var3.getNumberFormatOfValues());
         this.l6(var5);
         List var36 = new List();
         List var37 = new List();

         for (int var22 = 0; var22 < var4.length; var22++) {
            t9z var23 = var4[var22];
            g4j var24 = this.u9[var22];
            if (var23.t9() != null && var23.t9().y4() && n5(var24, var23)) {
               u5w var25 = new u5w(var24, var23);
               var36.addItem(var25);
               if (var23.t9().l6().getDataLabelFormat().getShowLeaderLines() || var23.y4().u9().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                  a6y var38 = new a6y(var23);
                  var37.addItem(var38);
               }
            }
         }

         this.u3 = (u5w[])var36.toArray(new u5w[0]);
         this.a6 = (a6y[])var37.toArray(new a6y[0]);
      } else {
         this.u3 = new u5w[0];
         this.u9 = new g4j[0];
         this.a6 = new a6y[0];
      }

      for (g4j var27 : this.u9) {
         this.n5(var27);
      }

      for (a6y var41 : this.a6) {
         this.n5(var41);
      }

      for (u5w var42 : this.u3) {
         this.n5(var42);
      }
   }

   @Override
   protected f6d[] k5() {
      return this.u9;
   }

   @Override
   protected void n5(z5 var1) {
      a9v var2 = (a9v)var1;
      a9v var3 = this.k5(var2);

      for (g4j var7 : this.u9) {
         var7.n3(var3);
      }

      for (u5w var14 : this.u3) {
         var14.n3(var14.e2());
      }

      for (a6y var15 : this.a6) {
         var15.n3(var1);
      }
   }

   @Override
   protected void l6(z5 var1) {
      a9v var2 = (a9v)var1;
      this.n5(var2);
      this.l6(var2);
      this.t2();
   }

   @Override
   protected void l6() {
      for (v6g var4 : this.a0()) {
         var4.U_();
      }
   }

   private void n5(a9v var1) {
      for (g4j var5 : this.u9) {
         if (this.k5 > 0) {
            com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1(var1.n5() / 2.0F, var1.l6() / 2.0F);
            float var7 = var1.n5() / 2.0F;
            com.aspose.slides.internal.o9b.w1 var8 = x5h.n5(var5.e2(), var7 - var5.x8(), com.aspose.slides.internal.o9b.w1.n5.u3()).u3();
            com.aspose.slides.internal.o9b.w1 var9 = x5h.n5(var6.u3(), var8.l6(), var8.k5()).u3();
            com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(var5.d2() / 2.0F, var5.d5() / 2.0F);
            var5.a6(var9.l6() - var10.l6());
            var5.u9(var9.k5() - var10.k5());
         }

         if (var5.t9() >= 0) {
            double var11 = (var5.t9() - this.k5) / 100.0;
            com.aspose.slides.internal.o9b.w1 var13 = var5.n5(var5.x8() * var11, var1).u3();
            var5.a6(var5.b3() + var13.l6());
            var5.u9(var5.o0() + var13.k5());
         }

         var5.t1();
      }
   }

   private void l6(a9v var1) {
      List var2 = new List();
      com.aspose.slides.internal.o9b.y1 var3 = new com.aspose.slides.internal.o9b.y1(-var1.u3(), -var1.a6(), this.y2().d2(), this.y2().d5());

      for (int var4 = 0; var4 < this.u3.length; var4++) {
         u5w var5 = this.u3[var4];
         g4j var6 = var5.u3();
         com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1();
         switch (var5.c8()) {
            case -1:
            case 0:
            case 1:
            case 3:
            case 5:
            default:
               com.aspose.slides.internal.o9b.w1[] var8 = new com.aspose.slides.internal.o9b.w1[]{var7};
               boolean var9 = !n5(var5, var8, var3.y4());
               var8[0].n5(var7);
               if (var9) {
                  var2.addItem(var5);
                  if (var4 < this.a6.length) {
                     this.a6[var4].n5(true);
                  }
               }
               break;
            case 2:
               var6.l6(var6.x8() * 0.5).n5(var7);
               break;
            case 4:
               var6.n5(var5.e5().c8().a6(), (float)var6.x8() * 0.96).n5(var7);
               break;
            case 6:
               var6.l6(var5.e5().c8().a6(), (float)var6.x8() * 1.04).n5(var7);
               var2.addItem(var5);
               var5.k5(true);
         }

         com.aspose.slides.internal.o9b.w1 var11 = var5.n5(var7.u3(), var3.y4()).u3();
         var5.a6(var11.l6());
         var5.u9(var11.k5());
         var5.t1();
         if (var4 < this.a6.length && (var5.t2() != 0.0F || var5.s7() != 0.0F)) {
            this.a6[var4].n5(true);
            var5.k5(true);
         }

         var6.l6(var6.x8()).n5(var7);
         float var12 = var7.k5() - var5.o0();
         float var10 = var7.l6() - var5.b3();
         var5.n5(new com.aspose.slides.internal.o9b.w1(var10, var12));
      }

      n5(var2, var3.y4());
   }

   private void t2() {
      for (int var1 = 0; var1 < this.a6.length; var1++) {
         a6y var2 = this.a6[var1];
         if (var2.u3()) {
            u5w var3 = this.u3[var1];
            g4j var4 = var3.u3();
            com.aspose.slides.internal.o9b.w1[] var5 = new com.aspose.slides.internal.o9b.w1[]{var4.l6(var4.x8() + 0.5)};
            com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1();
            com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1();
            com.aspose.slides.internal.o9b.w1[] var8 = new com.aspose.slides.internal.o9b.w1[]{var6};
            com.aspose.slides.internal.o9b.w1[] var9 = new com.aspose.slides.internal.o9b.w1[]{var7};
            boolean var10 = var2.n5(var3.e5().y4(), var5, var3.z8(), true, var8, var9);
            var8[0].n5(var6);
            var9[0].n5(var7);
            if (var10) {
               var2.n5(!x5h.n5(var6.u3(), var7.u3(), var4.i1().u3(), var4.x8()));
            } else {
               var2.n5(false);
            }
         }

         var2.t1();
      }
   }

   private static boolean n5(u5w var0, com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.y1 var2) {
      g4j var3 = var0.u3();
      z3y var4 = var0.t9();
      z3y var5 = var3.n5(0.98, 0.98);
      if (!n5(var4, var3, var5, var1)) {
         var5 = var0.u3().n5(1.0, 1.0);
         if (n5(var4, var3, var5, var1)) {
            return true;
         } else if (!n5(var0, var1)) {
            var5 = var0.u3().n5(1.02, 1.0);
            n5(var0, var4, var3, var5).n5(var1[0]);
            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   private static boolean n5(u5w var0, com.aspose.slides.internal.o9b.w1[] var1) {
      return n5(var0, var1, 5, 0.95F, 0.89);
   }

   private static boolean n5(u5w var0, com.aspose.slides.internal.o9b.w1[] var1, int var2, float var3, double var4) {
      String var6 = var0.n3().c8();
      z3y var7 = var0.t9();
      com.aspose.slides.internal.o9b.f2 var8 = var7.u3().c8().a6();
      z3y var9 = var0.u3().n5(var4, var4);

      for (int var10 = var2; var10 > 0; var10--) {
         var0.n3().n5(var6, var7.l6() * var3, 2.0F * var8.k5());
         var7 = var0.t9();
         if (n5(var7, var0.u3(), var9, var1)) {
            var0.n5(new d2k(var7.l6(), var7.k5()));
            return true;
         }
      }

      var0.n3().n5(var6, 2.0F * var8.l6(), 2.0F * var8.k5());
      return false;
   }

   private static boolean n5(z3y var0, g4j var1, z3y var2, com.aspose.slides.internal.o9b.w1[] var3) {
      com.aspose.slides.internal.o9b.w1.n5.n5(var3[0]);
      com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2(var0.l6(), var0.k5());
      com.aspose.slides.internal.o9b.w1 var5 = var1.i1().u3();
      double var6 = 0.01;
      double var8 = var1.y4() <= 45.0 ? var1.y4() : 45.0;

      for (double var10 = 0.0; var10 < var8 / 2.0; var10++) {
         for (double var12 = 0.99; var12 > 0.2; var12 -= 0.01) {
            double var14 = var1.x8() * var12;
            n5(var5.u3(), var1.e2() + var10, var14, var4.a6()).n5(var3[0]);
            var0.n5(var3[0].u3());
            if (var0.n5(var2)) {
               return true;
            }

            if (var10 > 0.0) {
               n5(var5.u3(), var1.e2() - var10, var14, var4.a6()).n5(var3[0]);
               var0.n5(var3[0].u3());
               if (var0.n5(var2)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static com.aspose.slides.internal.o9b.w1 n5(u5w var0, z3y var1, g4j var2, z3y var3) {
      com.aspose.slides.internal.o9b.w1 var4 = com.aspose.slides.internal.o9b.w1.n5.u3();
      com.aspose.slides.internal.o9b.w1 var5 = var2.i1().u3();
      com.aspose.slides.internal.o9b.w1 var6 = x5h.n5(var2.e2(), var2.x8(), var5.u3()).u3();
      z3y var7 = var0.z1();
      float var8 = 0.98F;
      var7.n5(new com.aspose.slides.internal.o9b.w1(var6.l6(), var6.k5() + var7.k5() / 2.0F));
      if (!n5(var7, var2.i1().u3(), var2.x8() * var8)) {
         return var7.a6();
      }

      var7.n5(new com.aspose.slides.internal.o9b.w1(var6.l6() - var7.l6() / 2.0F, var6.k5()));
      if (!n5(var7, var2.i1().u3(), var2.x8() * var8)) {
         return var7.a6();
      }

      var7.n5(new com.aspose.slides.internal.o9b.w1(var6.l6(), var6.k5() - var7.k5() / 2.0F));
      if (!n5(var7, var2.i1().u3(), var2.x8() * var8)) {
         return var7.a6();
      }

      var7.n5(new com.aspose.slides.internal.o9b.w1(var6.l6() + var7.l6() / 2.0F, var6.k5()));
      if (!n5(var7, var2.i1().u3(), var2.x8() * var8)) {
         return var7.a6();
      }

      com.aspose.slides.internal.o9b.f2 var9 = new com.aspose.slides.internal.o9b.f2(var1.l6(), var1.k5());
      var1.n5(var6.u3());
      double var10 = 0.01;

      for (double var12 = var0.h0() ? 1.02 : 1.04; var12 < 1.5; var12 += 0.01) {
         n5(var5.u3(), var2.e2(), var2.x8() * var12, var9.a6()).n5(var4);
         var1.n5(var4.u3());
         if (var1.l6(var3)) {
            return var4;
         }
      }

      return var4;
   }

   private static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0, double var1, double var3, com.aspose.slides.internal.o9b.f2 var5) {
      com.aspose.slides.internal.o9b.w1 var6 = x5h.n5(var1, var3, var0.u3()).u3();
      double var7 = Math.PI / 180.0;
      double var9 = com.aspose.slides.ms.System.q1.c8(var1 * (Math.PI / 180.0));
      double var11 = com.aspose.slides.ms.System.q1.h0(var1 * (Math.PI / 180.0));
      double var13 = var9 * var5.l6() / 2.0;
      double var15 = var11 * var5.k5() / 2.0;
      return x5h.n5(var6.u3(), (float)var13, (float)var15);
   }

   private static void n5(List<u5w> var0, com.aspose.slides.internal.o9b.y1 var1) {
      if (var0.size() > 0) {
         List var2 = n5(var0);

         for (int var3 = 0; var2.size() != var0.size() && var3 < 50; var2 = n5(var0)) {
            List$Enumerator var4 = var2.iterator();

            try {
               while (var4.hasNext()) {
                  List var5 = (List)var4.next();
                  n5(var1.y4(), var5);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }

            var3++;
         }
      }
   }

   private static void n5(com.aspose.slides.internal.o9b.y1 var0, List<u5w> var1) {
      boolean var2 = var1.size() % 2 > 0;
      int var3 = var2 ? var1.size() / 2 : var1.size() / 2 - 1;

      for (int var4 = var3; var4 >= 0; var4--) {
         u5w var5 = (u5w)var1.get_Item(var4);
         if (!var5.r4()) {
            if ((var4 != var3 || !var2) && var1.size() != 1) {
               n5(var5, var1, var0.y4(), -1);
            } else {
               n5(var5, var1, var0.y4(), 0);
            }
         }
      }

      for (int var6 = var3 + 1; var6 < var1.size(); var6++) {
         u5w var7 = (u5w)var1.get_Item(var6);
         if (!var7.r4()) {
            n5(var7, var1, var0.y4(), 1);
         }
      }
   }

   private static List<List<u5w>> n5(List<u5w> var0) {
      List var1 = new List();
      List var2 = new List();
      List$Enumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            u5w var4 = (u5w)var3.next();
            List var5 = new List();
            if (!var4.x8().t9().l6().getDataLabelFormat().getShowLeaderLines()
               && var4.x8().t9().l6().getDataLabelFormat().getFormat().getFill().getFillType() != 1) {
               com.aspose.slides.internal.o9b.y1[] var6 = var4.y4();

               for (int var7 = 0; var7 < var6.length; var7++) {
                  z3y var8 = new z3y(var6[var7].y4());
                  var8.n5(new com.aspose.slides.internal.o9b.w1(var4.i1().l6(), var4.f2() + var6[var7].k5() * var7 + var6[var7].k5() / 2.0F));
                  var5.addItem(var8);
               }
            } else {
               var5.addItem(var4.t9());
            }

            int var39 = -1;

            for (int var40 = 0; var40 < var1.size(); var40++) {
               List$Enumerator var42 = var5.iterator();

               try {
                  while (var42.hasNext()) {
                     z3y var9 = (z3y)var42.next();
                     if (var9.n5((IGenericEnumerable<z3y>)var2.get_Item(var40), var4.x8().t9().x8() * 0.125F)) {
                        var39 = var40;
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
                     var42.dispose();
                  }
               }
            }

            if (var39 == -1) {
               var39 = var1.size();
               var1.addItem(new List());
               var2.addItem(new List());
            }

            ((List)var1.get_Item(var39)).addItem(var4);
            List$Enumerator var41 = var5.iterator();

            try {
               while (var41.hasNext()) {
                  z3y var43 = (z3y)var41.next();
                  ((List)var2.get_Item(var39)).addItem(var43);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
                  var41.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      for (int var37 = 0; var37 < var1.size(); var37++) {
         List var38 = (List)var1.get_Item(var37);
         if (var38.size() > 1) {
            var38.sort(new e3x$n5(Double.NaN));
            double var13 = ((u5w)var38.get_Item(0)).u3().e2() - ((u5w)var38.get_Item(var38.size() - 1)).u3().e2();
            if (var13 < 0.0) {
               var13 += 360.0;
            } else {
               var13 = 0.0;
            }

            double var15 = ((u5w)var38.get_Item(0)).u3().e2();
            double var17 = ((u5w)var38.get_Item(var38.size() - 1)).u3().e2() + var13 / 2.0;

            for (int var12 = 1; var12 < var38.size(); var12++) {
               double var19 = ((u5w)var38.get_Item(var12)).u3().e2() % 360.0;
               double var21 = var19 - var15;
               if (var21 > var13) {
                  var13 = var21;
                  var17 = var15 + var21 / 2.0;
               }

               var15 = var19;
            }

            double var23 = (var17 + 180.0) % 360.0;
            var38.sort(new e3x$n5(var23));
         }
      }

      return var1;
   }

   private static void n5(u5w var0, List<u5w> var1, com.aspose.slides.internal.o9b.y1 var2, int var3) {
      if (var1.size() != 1 || n5(var0.t9(), var0.u3().i1().u3(), var0.u3().x8())) {
         double var4 = var0.x8().t9().x8() / 4.0F;
         double var6 = var0.x8().t9().x8() / 4.0F;
         double var8 = var0.j5() + var4;
         double var10 = var3 == 0 ? 0.0 : com.aspose.slides.ms.System.q1.t9(var6 / var8) * 180.0 / Math.PI;
         double var12 = var3 == -1 ? var0.w1() - var10 : var0.w1() + var10;
         com.aspose.slides.internal.o9b.w1 var14 = x5h.n5(var12 % 360.0, var8, var0.u3().i1().u3()).u3();
         com.aspose.slides.internal.o9b.w1 var15 = new com.aspose.slides.internal.o9b.w1(var14.l6() - var0.d2() / 2.0F, var14.k5() - var0.d5() / 2.0F);
         if (var15.l6() < var2.x8()
            || var15.k5() < var2.n3()
            || var15.l6() + var0.d2() > var2.x8() + var2.s7()
            || var15.k5() + var0.d5() > var2.n3() + var2.k5()) {
            x5h.n5(var12 % 360.0, var0.j5(), var0.u3().i1().u3()).n5(var14);
            var15 = new com.aspose.slides.internal.o9b.w1(var14.l6() - var0.d2() / 2.0F, var14.k5() - var0.d5() / 2.0F);
         }

         var0.a6(var15.l6());
         var0.u9(var15.k5());
      }
   }

   protected static boolean n5(z3y var0, com.aspose.slides.internal.o9b.w1 var1, double var2) {
      for (com.aspose.slides.internal.o9b.w1 var7 : var0.n5()) {
         double var8 = var1.l6() - var7.l6();
         double var10 = var1.k5() - var7.k5();
         double var12 = var8 * var8 + var10 * var10;
         if (var12 < var2 * var2) {
            return true;
         }
      }

      return false;
   }

   private a9v k5(a9v var1) {
      if (var1 == null) {
         throw new ArgumentNullException("area");
      }

      float var2 = var1.n5() / 2.0F;
      if (this.k5 > 0) {
         float var3 = this.k5 / 100.0F;
         var2 /= 1.0F + var3;
      }

      float var4 = var2 * 2.0F;
      return var1.n5(var4, var4);
   }
}
