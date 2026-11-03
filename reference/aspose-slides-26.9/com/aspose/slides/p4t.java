package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class p4t extends g2l {
   private final u5w[] k5;
   private final a6y[] u3;
   private final c9q[] a6;
   private final int u9;

   public p4t(double var1, int var3, ChartSeries var4, t9z[] var5) {
      this.u9 = var3;
      double var6 = n5(com.aspose.slides.ms.System.u3.n5(var5));
      if (var6 > 0.0) {
         this.a6 = new c9q[var5.length];
         double var8 = 0.0;
         double var10 = 0.0;
         double[] var12 = new double[]{0.0};
         double[] var13 = new double[]{0.0};
         this.n5(com.aspose.slides.ms.System.u3.n5(var5), var12, var13);
         var8 = var12[0];
         var10 = var13[0];

         for (int var14 = 0; var14 < var5.length; var14++) {
            t9z var15 = var5[var14];
            double var16 = com.aspose.slides.ms.System.q1.n5(var15.n5()) / var6;
            double var18 = var16 < 1.0E-9 && var15.c8() ? 0.0 : com.aspose.slides.internal.c8e.k5.n5(var16 * 360.0, var8, var10);
            c9q var20 = new c9q(var15, var1, var18, var16, var15.n5());
            this.a6[var14] = var20;
            var1 += var18;
         }

         this.n5(var4.getLabels().getDefaultDataLabelFormat().getNumberFormat());
         this.l6(var6);
         List var31 = new List();
         List var32 = new List();

         for (int var21 = 0; var21 < var5.length; var21++) {
            t9z var22 = var5[var21];
            c9q var23 = this.a6[var21];
            if (var22.t9() != null && var22.t9().y4() && n5(var23, var22)) {
               u5w var24 = new u5w(var23, var22);
               var31.addItem(var24);
               if (var22.t9().l6().getDataLabelFormat().getShowLeaderLines() || var22.y4().u9().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                  a6y var33 = new a6y(var22);
                  var32.addItem(var33);
               }
            }
         }

         this.k5 = (u5w[])var31.toArray(new u5w[0]);
         this.u3 = (a6y[])var32.toArray(new a6y[0]);
      } else {
         this.k5 = new u5w[0];
         this.a6 = new c9q[0];
         this.u3 = new a6y[0];
      }

      for (c9q var28 : this.a6) {
         this.n5(var28);
      }

      for (a6y var40 : this.u3) {
         this.n5(var40);
      }

      for (u5w var41 : this.k5) {
         this.n5(var41);
      }
   }

   @Override
   protected f6d[] k5() {
      return this.a6;
   }

   @Override
   protected void n5(z5 var1) {
      for (c9q var5 : this.a6) {
         var5.n3(var1);
      }

      for (u5w var12 : this.k5) {
         var12.n3(var12.e2());
      }

      for (a6y var13 : this.u3) {
         var13.n3(var1);
      }
   }

   @Override
   protected void l6(z5 var1) {
      a9v var2 = (a9v)var1;
      this.n5(var2);
      this.l6(var2);
      this.u3();
   }

   private void n5(a9v var1) {
      for (c9q var5 : this.a6) {
         if (this.u9 >= 0) {
            double var6 = (var5.t9() < 0 ? this.u9 : var5.t9()) / 100.0;
            com.aspose.slides.internal.o9b.w1 var8 = var5.n5(var5.x8() * var6, var1).u3();
            var5.a6(var8.l6());
            var5.u9(var8.k5());
         }

         var5.t1();
      }
   }

   private void l6(a9v var1) {
      com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(-var1.u3(), -var1.a6(), this.y2().d2(), this.y2().d5());
      boolean var3 = ((l6j)this.y1()).u3() == 0;

      for (int var4 = 0; var4 < this.k5.length; var4++) {
         u5w var5 = this.k5[var4];
         c9q var6 = var5.k7();
         com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1();
         if (var3) {
            double var8 = var6.x8() - var6.u3();
            switch (var5.c8()) {
               case 2:
                  var6.h0().n5(var7);
                  break;
               case 4:
                  var6.n5(var5.e5().c8().a6(), var6.u3() + var8 * 0.96).n5(var7);
                  break;
               default:
                  var6.l6(var5.e5().c8().a6(), var6.u3() + var8 * 1.04).n5(var7);
            }
         } else {
            var6.h0().n5(var7);
         }

         com.aspose.slides.internal.o9b.w1 var10 = var5.n5(var7.u3(), var2.y4()).u3();
         var5.a6(var10.l6());
         var5.u9(var10.k5());
         var5.t1();
         if (var4 < this.u3.length) {
            this.u3[var4].n5(var5.t2() != 0.0F || var5.s7() != 0.0F);
         }
      }
   }

   private void u3() {
      for (int var1 = 0; var1 < this.u3.length; var1++) {
         a6y var2 = this.u3[var1];
         if (var2.u3()) {
            u5w var3 = this.k5[var1];
            com.aspose.slides.internal.o9b.w1[] var4 = new com.aspose.slides.internal.o9b.w1[]{var3.k7().h0()};
            var2.n5(var2.n5(var3.e5().y4(), var4, var3.t4()));
         }

         var2.t1();
      }
   }

   @Override
   void U_() {
      if (this.T_()) {
         for (v6g var4 : this.a0()) {
            var4.U_();
         }
      }
   }
}
