package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class q9o extends com.aspose.slides.internal.v6g.h0<q9o> {
   public q9o() {
   }

   static void n5(com.aspose.slides.internal.o9b.y2[] var0, g3y var1) {
      Chart var2 = var1.t2().n3();
      if (var0[0].t2() > 0 && var0[0].l6() > 0) {
         if (var2.getType() == 27 || var2.getType() == 30) {
            if (com.aspose.slides.internal.v6g.k5.n5(var2.getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
               byte var3 = 4;
               var0[0].k5(var0[0].s7() + var3);
               var0[0].u3(var0[0].x8() + var3);
               var0[0].l6(var0[0].t2() - 2 * var3);
               var0[0].n5(var0[0].l6() - 2 * var3);
               if (var1.u9().getLabels().isVisible()
                  && (
                     var1.u9().getLabels().getDefaultDataLabelFormat().getPosition() == 6
                        || var1.u9().getLabels().getDefaultDataLabelFormat().getPosition() == 1
                  )) {
                  int var4 = g6z.n5(var1.t2().c4() / 100.0F * 6.0F);
                  int var5 = g6z.n5(var1.t2().y2() / 100.0F * 6.0F);
                  var0[0].k5(var0[0].s7() + var4);
                  var0[0].u3(var0[0].x8() + var5);
                  var0[0].l6(var0[0].t2() - 2 * var4);
                  var0[0].n5(var0[0].l6() - 2 * var5);
               }
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.o9b.y2[] var0, n1g var1) {
      int var2 = g6z.n5(var0[0].t2() / 400.0F * 3.0F);
      int var3 = g6z.n5(var0[0].l6() / 400.0F * 3.0F);
      var0[0].k5(var0[0].s7() + var2);
      var0[0].u3(var0[0].x8() + var3);
      var0[0].l6(var0[0].t2() - 2 * var2);
      var0[0].n5(var0[0].l6() - 2 * var3);
      double var4 = 0.14285715F / com.aspose.slides.ms.System.q1.c8(Math.PI / 18);
      byte var6 = 20;
      double var7 = (var1.s3() != 0 ? var1.s3() : var6) * Math.PI / 180.0;
      double var9 = var0[0].t2() * (com.aspose.slides.ms.System.q1.h0(var7) + var4 * var1.w1() / 100.0 * com.aspose.slides.ms.System.q1.c8(var7));
      double var11 = var0[0].l6() / (com.aspose.slides.ms.System.q1.h0(var7) + var4 * var1.w1() / 100.0 * com.aspose.slides.ms.System.q1.c8(var7));
      if (var9 <= var0[0].l6()) {
         var0[0].u3(g6z.k5(var0[0].x8() + var0[0].l6() / 2.0F - var9 / 2.0));
         var0[0].n5(g6z.k5(var9));
      } else {
         var0[0].k5(g6z.k5(var0[0].s7() + var0[0].t2() / 2.0F - var11 / 2.0));
         var0[0].l6(g6z.k5(var11));
      }

      double var13 = var0[0].t2() * var4 * var1.w1() / 100.0 * com.aspose.slides.ms.System.q1.c8(var7);
      double var15 = var13 / var0[0].l6();
      var1.n5((float)var15);
   }

   static void n5(n1g var0) {
      g3y var1 = var0.y4().get_Item(0);
      List var2 = var1.c8();
      com.aspose.slides.internal.o9b.c8[] var3 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var2.size())
      );
      double[] var4 = new double[var2.size()];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         t9z var6 = (t9z)var2.get_Item(var5);
         var4[var5] = var6.n5();
      }

      String[] var16 = new String[var2.size()];
      double var7 = 0.0;

      for (int var9 = 0; var9 < var2.size(); var9++) {
         var7 += com.aspose.slides.ms.System.q1.n5(((t9z)var2.get_Item(var9)).n5());
      }

      if (var7 != 0.0) {
         for (int var17 = 0; var17 < var2.size(); var17++) {
            t9z var10 = (t9z)var2.get_Item(var17);
            double var11 = var10.n5();
            double var13 = 0.0;
            if (var7 != 0.0) {
               var13 = var11 / var7;
            }

            var16[var17] = n5(var1, var17, var13, var0);
         }

         com.aspose.slides.internal.o9b.y2 var18 = var0.n5.n5.n3();
         com.aspose.slides.internal.o9b.y2[] var19 = new com.aspose.slides.internal.o9b.y2[]{var18};
         n5(var19, var0);
         var19[0].u3(var18);
         w3r var15 = new w3r(var18.s7(), var18.x8(), var18.t2(), var18.l6(), var4, var3, var0.r4(), var16, var2);
         var15.n5(var1);
         var15.n5();
         var15.n5(var0);
      }
   }

   private static String n5(g3y var0, int var1, double var2, n1g var4) {
      t9z var5 = var0.c8().get_Item(var1);
      List var6 = var4.l6();
      l5 var7 = var4.q0();
      f3h var8 = var5.t9();
      IDataLabelFormat var9 = var8.l6().getDataLabelFormat();
      boolean var10 = false;
      boolean var11 = var9.isNumberFormatLinkedToSource();
      String var12 = var9.getShowPercentage() ? "" : var9.getNumberFormat();
      String var13 = !"".equals(var9.getNumberFormat()) && !"General".equals(var9.getNumberFormat()) ? var9.getNumberFormat() : "0%";
      String var14 = var0.k5();
      String var15 = var1 < var7.h0.size() ? t7k.n5(var7.h0.get_Item(var1), var12, var10) : "";
      if (var11) {
         String var16 = var1 >= 0 && var1 < var6.size() ? ((x4)var6.get_Item(var1)).u9() : "";
         boolean var17 = var1 >= 0 && var1 < var6.size() && ((x4)var6.get_Item(var1)).a6();
         var15 = var1 >= 0 && var1 < var7.h0.size() ? t7k.n5(var7.h0.get_Item(var1), var16, var17) : "";
      }

      String var20 = t7k.n5(var5.n5(), var12, var10);
      if (var11) {
         var20 = t7k.n5(var5.n5(), var5.u3(), false);
      }

      String var21 = t7k.n5(var2, var13, var10);
      String var18 = t7k.n5(var8.l6());
      String var19 = "";
      if (var9.getShowSeriesName()) {
         var19 = com.aspose.slides.ms.System.d1.n5(var19, var14);
      }

      if (var9.getShowCategoryName()) {
         if (!"".equals(var19)) {
            var19 = com.aspose.slides.ms.System.d1.n5(var19, var18);
         }

         var19 = com.aspose.slides.ms.System.d1.n5(var19, var15);
      }

      if (var9.getShowValue()) {
         if (!"".equals(var19)) {
            var19 = com.aspose.slides.ms.System.d1.n5(var19, var18);
         }

         var19 = com.aspose.slides.ms.System.d1.n5(var19, var20);
      }

      if (var9.getShowPercentage()) {
         if (!"".equals(var19)) {
            var19 = com.aspose.slides.ms.System.d1.n5(var19, var18);
         }

         var19 = com.aspose.slides.ms.System.d1.n5(var19, var21);
      }

      return var19;
   }

   public void n5(q9o var1) {
   }

   public q9o n5() {
      q9o var1 = new q9o();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(q9o var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof q9o) ? false : this.l6((q9o)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public q9o Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(q9o bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
