package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class z7s extends v6g {
   private List<c9q> n5 = new List<>();
   private List<z7s> l6 = new List<>();
   private v6g[] k5;
   private g3y u3;
   private boolean a6;
   private int u9 = 0;
   private int h0 = 0;

   z7s(g3y var1) {
      this.u3 = var1;
      ChartCategoryCollection var2 = (ChartCategoryCollection)var1.u9().getChart().getChartData().getCategories();
      if (var2.size() != 0) {
         int var10 = ((ChartData)var1.u9().getChart().getChartData()).l6().k5() != 2
            ? ((ChartCategory)var2.get_Item(0)).k5().n5() - 1
            : var2.getGroupingLevelCount() - 1;
         this.h0 = var10;
         List var11 = var2.n5(var10);
         int var12 = 0;

         for (int var6 = 0; var6 < var11.size() - 1; var6++) {
            int[] var7 = new int[]{var12};
            z7s var8 = new z7s(
               var1, var10 - 1, (Integer)((KeyValuePair)var11.get_Item(var6)).getKey(), (Integer)((KeyValuePair)var11.get_Item(var6 + 1)).getKey(), var7
            );
            var12 = var7[0];
            if (!(var8.u3() <= 0.0)) {
               this.l6.addItem(var8);
               this.n5((com.aspose.slides.v6g)var8);
            }
         }

         int[] var14 = new int[]{var12};
         z7s var15 = new z7s(var1, var10 - 1, (Integer)((KeyValuePair)var11.get_Item(var11.size() - 1)).getKey(), var2.size(), var14);
         var12 = var14[0];
         if (!(var15.u3() <= 0.0)) {
            this.l6.addItem(var15);
            this.n5((com.aspose.slides.v6g)var15);
         }
      } else {
         for (int var9 = 0; var9 < var1.u9().getDataPoints().size(); var9++) {
            int[] var4 = new int[]{var9};
            z7s var5 = new z7s(var1, -1, var4[0], var4[0] + 1, var4);
            var9 = var4[0];
            this.l6.addItem(var5);
            this.n5((com.aspose.slides.v6g)var5);
         }
      }
   }

   final double u3() {
      if (this.a6) {
         ChartDataPoint var1 = (ChartDataPoint)this.u3.u9().getDataPoints().get_Item(this.u9);
         boolean var2 = ((ChartData)this.u3.t2().n3().getChartData()).l6().k5() != 2;
         if (var2) {
            return var1.t4().n5() == null ? 0.0 : com.aspose.slides.internal.v6g.k5.u3(var1.t4().n5(), double.class);
         } else {
            return var1.getSizeValue().toDouble();
         }
      } else {
         double var3 = 0.0;
         List$Enumerator var5 = this.l6.iterator();

         try {
            while (var5.hasNext()) {
               z7s var6 = (z7s)var5.next();
               var3 += var6.u3();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         return var3;
      }
   }

   final ChartDataPointLevel h0() {
      return (ChartDataPointLevel)this.u3.u9().getDataPoints().get_Item(this.u9).getDataPointLevels().get_Item(this.h0 + 1);
   }

   private z7s(g3y var1, int var2, int var3, int var4, int[] var5) {
      this.u3 = var1;
      this.h0 = var2;
      this.u9 = var3;
      if (var2 == -1) {
         this.a6 = true;
      } else {
         ChartCategoryCollection var6 = (ChartCategoryCollection)var1.u9().getChart().getChartData().getCategories();
         Object var7 = ((ChartCategory)var6.get_Item(var3)).n5(var2);
         int var8 = var3;

         for (int var9 = var3; var9 < var4; var9++) {
            Object var10 = ((ChartCategory)var6.get_Item(var9)).n5(var2);
            if (var10 != null && !com.aspose.slides.ms.System.d1.a6(var7.toString(), var10.toString()) && !"".equals(var10.toString())) {
               var5[0]++;
               z7s var11 = new z7s(var1, var2 - 1, var8, var9, var5);
               this.l6.addItem(var11);
               this.n5((com.aspose.slides.v6g)var11);
               var7 = var10;
               var8 = var9;
            }
         }

         if (var7 != null && !"".equals(var7.toString())) {
            var5[0]++;
            z7s var12 = new z7s(var1, var2 - 1, var8, var4, var5);
            this.l6.addItem(var12);
            this.n5((com.aspose.slides.v6g)var12);
         } else {
            this.a6 = true;
         }
      }
   }

   public final void n5(double var1, double var3) {
      double var5 = 0.0;
      List$Enumerator var7 = this.l6.iterator();

      try {
         while (var7.hasNext()) {
            z7s var8 = (z7s)var7.next();
            var5 += var8.u3();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      this.l6.sort(new z7s$1(this));
      this.k5 = new v6g[this.l6.size()];

      for (int var18 = 0; var18 < this.l6.size(); var18++) {
         if (this.l6.get_Item(var18).T_()) {
            if (var5 == 0.0) {
               var5 = 1.0;
            }

            double var10 = com.aspose.slides.ms.System.q1.n5(this.l6.get_Item(var18).u3() / var5);
            double var12 = var10 * var3;
            c9q var14 = new c9q(this.l6.get_Item(var18), var1, var12, var10, this.l6.get_Item(var18).u3());
            this.n5.addItem(var14);
            this.n5(var14);
            this.l6.get_Item(var18).n5(var1, var12);
            if (this.l6.get_Item(var18).h0().getLabel().isVisible()) {
               m7a var15 = new m7a(this.l6.get_Item(var18).h0(), this.u3.t2());
               this.k5[var18] = var15;
               var15.n5(var1 + var12 / 2.0);
               this.n5(var15);
            }

            var1 += var12;
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      int var2 = com.aspose.slides.ms.System.q1.n5(this.u3.t2().n3().getChartData().getCategories().getGroupingLevelCount(), 1);
      com.aspose.slides.internal.f8y.n5.n5(var1.n5() == var1.l6(), "Must be square area");
      float var3 = var1.n5() / 2.0F;
      float var4 = var3 / (var2 + 1);
      float var5 = var4 * (var2 - this.h0);

      for (int var6 = 0; var6 < this.n5.size(); var6++) {
         float var7 = var5 + var4;
         a9v var8 = ((a9v)var1).u9().n5(var7 * 2.0F, var7 * 2.0F);
         t3o var9 = new t3o(var5, var8.n5(), var8.l6(), var8.u3(), var8.a6());
         this.n5.get_Item(var6).n3(var9);
         if (this.k5 != null && this.k5[var6] != null) {
            this.k5[var6].n3(new z5(var4 + 6.0F, var1.l6()));
         }
      }

      List$Enumerator var13 = this.l6.iterator();

      try {
         while (var13.hasNext()) {
            z7s var14 = (z7s)var13.next();
            var14.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   private boolean n5(c9q var1, m7a var2, z5 var3) {
      com.aspose.slides.internal.o9b.w1 var4 = this.i1().u3();
      double var5 = var1.n3();
      float var7 = var1.u3();
      double var8 = var1.y4();
      com.aspose.slides.internal.o9b.w1 var10 = x5h.n5(var5, var7, var4.u3()).u3();
      com.aspose.slides.internal.o9b.w1 var11 = x5h.n5(var5 + var8, var7, var4.u3()).u3();
      double var12 = com.aspose.slides.ms.System.q1.z3(
         com.aspose.slides.ms.System.q1.a6(com.aspose.slides.ms.System.q1.n5(var10.l6() - var11.l6()), 2.0)
            + com.aspose.slides.ms.System.q1.a6(com.aspose.slides.ms.System.q1.n5(var10.k5() - var11.k5()), 2.0)
      );
      if (com.aspose.slides.ms.System.d1.n5(var2.c8())) {
         return true;
      }

      com.aspose.slides.internal.o9b.y1[] var14 = var2.t9();
      return com.aspose.slides.internal.v6g.k5.u3(var14[0].k5(), 13) <= com.aspose.slides.internal.v6g.k5.u3(var12, 14);
   }

   @Override
   protected void l6(z5 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         float var3 = var1.n5() - this.n5.get_Item(var2).d2();
         float var4 = var1.l6() - this.n5.get_Item(var2).d5();
         this.n5.get_Item(var2).a6(var3 / 2.0F);
         this.n5.get_Item(var2).u9(var4 / 2.0F);
         this.n5.get_Item(var2).t1();
         if (this.k5 != null && this.k5[var2] != null) {
            ((m7a)this.k5[var2]).k5(this.n5(this.n5.get_Item(var2), (m7a)this.k5[var2], var1));
            com.aspose.slides.internal.o9b.w1 var5 = x5h.n5(this.n5.get_Item(var2).h0().u3(), -this.k5[var2].d2() / 2.0F, -this.k5[var2].d5() / 2.0F).u3();
            this.k5[var2].a6(var5.l6());
            this.k5[var2].u9(var5.k5());
            this.k5[var2].t1();
         }
      }

      List$Enumerator var9 = this.l6.iterator();

      try {
         while (var9.hasNext()) {
            z7s var10 = (z7s)var9.next();
            var10.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }
   }

   final n1g c8() {
      return this.u3.t2();
   }

   // $VF: synthetic method
   static int n5(z7s var0) {
      return var0.u9;
   }
}
