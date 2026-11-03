package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class v5x extends v6g {
   private float n5;
   private List<v5x> l6 = new List<>();
   private n9 k5;
   private m7a u3;
   private float a6;
   private float u9;
   private boolean h0;
   private int c8 = 0;
   private ChartDataPointLevel t2;
   private g3y s7;

   v5x(g3y var1, int var2, int var3, int var4, int[] var5, boolean var6) {
      this.s7 = var1;
      ChartCategoryCollection var7 = (ChartCategoryCollection)var1.u9().getChart().getChartData().getCategories();
      this.c8 = var3;
      if (var2 == -1) {
         this.h0 = true;
         ChartDataPointLevel var13 = (ChartDataPointLevel)this.s7.u9().getDataPoints().get_Item(this.c8).getDataPointLevels().get_Item(var2 + 1);
         this.u3 = new m7a(var13, this.s7.t2());
         this.n5(this.u3);
         this.t2 = var13;
      } else {
         Object var8 = ((ChartCategory)var7.get_Item(var3)).n5(var2);
         int var9 = var3;

         for (int var10 = var3; var10 < var4; var10++) {
            Object var11 = ((ChartCategory)var7.get_Item(var10)).n5(var2);
            if (var11 != null && !com.aspose.slides.ms.System.d1.a6(var8.toString(), var11.toString()) && !"".equals(var11.toString())) {
               var5[0]++;
               v5x var12 = new v5x(var1, var2 - 1, var9, var10, var5, false);
               var9 = var10;
               if (!(var12.u3() <= 0.0)) {
                  this.l6.addItem(var12);
                  this.n5(var12);
                  var8 = var11;
               }
            }
         }

         if (var8 != null && !"".equals(var8.toString())) {
            var5[0]++;
            v5x var15 = new v5x(var1, var2 - 1, var9, var4, var5, false);
            if (!(var15.u3() <= 0.0)) {
               this.l6.addItem(var15);
               this.n5(var15);
               if (var6 && var1.u9().getParentLabelLayout() != 1 && this.l6.size() > 0) {
                  ChartDataPointLevel var16 = (ChartDataPointLevel)this.s7.u9().getDataPoints().get_Item(this.c8).getDataPointLevels().get_Item(var2 + 1);
                  this.k5 = new n9(var16, var1.t2());
                  this.n5(this.k5);
                  this.t2 = var16;
               }
            }
         } else {
            this.h0 = true;
            ChartDataPointLevel var14 = (ChartDataPointLevel)this.s7.u9().getDataPoints().get_Item(this.c8).getDataPointLevels().get_Item(var2 + 1);
            this.u3 = new m7a(var14, this.s7.t2());
            this.n5(this.u3);
            this.t2 = var14;
         }
      }
   }

   v5x(g3y var1) {
      this.s7 = var1;
      ChartCategoryCollection var2 = (ChartCategoryCollection)var1.u9().getChart().getChartData().getCategories();
      int var3 = 0;
      if (var2.size() != 0) {
         int var10 = ((ChartData)var1.u9().getChart().getChartData()).l6().k5() != 2
            ? ((ChartCategory)var2.get_Item(0)).k5().n5() - 1
            : var2.getGroupingLevelCount() - 1;
         List var11 = var2.n5(var10);

         for (int var12 = 0; var12 < var11.size() - 1; var12++) {
            int[] var7 = new int[]{var3};
            v5x var8 = new v5x(
               var1,
               var10 - 1,
               (Integer)((KeyValuePair)var11.get_Item(var12)).getKey(),
               (Integer)((KeyValuePair)var11.get_Item(var12 + 1)).getKey(),
               var7,
               true
            );
            var3 = var7[0];
            if (!(var8.u3() <= 0.0)) {
               this.l6.addItem(var8);
               this.n5(var8);
            }
         }

         if (var11.size() > 0) {
            int[] var13 = new int[]{var3};
            v5x var14 = new v5x(var1, var10 - 1, (Integer)((KeyValuePair)var11.get_Item(var11.size() - 1)).getKey(), var2.size(), var13, true);
            var3 = var13[0];
            if (var14.u3() <= 0.0) {
               return;
            }

            this.l6.addItem(var14);
            this.n5(var14);
         }
      } else {
         for (int var4 = 0; var4 < var1.c8().size(); var4++) {
            int[] var5 = new int[]{var3};
            v5x var6 = new v5x(var1, -1, var4, var4, var5, true);
            var3 = var5[0];
            this.l6.addItem(var6);
            this.n5(var6);
         }
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
      float var2 = var1.n5();
      float var3 = var1.l6();
      if (this.u3 != null) {
         this.u3.n3(var1);
      }

      this.a6 = 0.0F;
      this.u9 = 0.0F;
      if (this.k5 != null) {
         this.k5.n3(var1);
         if (this.s7.u9().getParentLabelLayout() == 0) {
            this.u9 = this.u9 + this.k5.d5();
            var3 -= this.k5.d5();
         }
      }

      if (this.l6.size() != 0) {
         this.k5(new z5(var2, var3));
         this.n5(this.l6);
         this.n5(0, 0, 0.0F, 2.1474836E9F, new z5(var2, var3));
      }
   }

   private void n5(List<v5x> var1) {
      boolean var2 = true;

      for (int var3 = var1.size(); var3 > 0 && var2; var3--) {
         var2 = false;

         for (int var4 = 1; var4 < var3; var4++) {
            if (((v5x)var1.get_Item(var4 - 1)).u3() < ((v5x)var1.get_Item(var4)).u3()) {
               v5x var5 = (v5x)var1.get_Item(var4 - 1);
               var1.set_Item(var4 - 1, var1.get_Item(var4));
               var1.set_Item(var4, var5);
               var2 = true;
            }
         }
      }
   }

   final double u3() {
      if (this.h0) {
         ChartDataPoint var1 = (ChartDataPoint)this.s7.u9().getDataPoints().get_Item(this.c8);
         boolean var2 = ((ChartData)this.s7.t2().n3().getChartData()).l6().k5() != 2;
         if (var2) {
            return var1.t4().n5() == null ? 0.0 : com.aspose.slides.internal.v6g.k5.u3(var1.t4().n5(), double.class);
         }

         double var3 = var1.getSizeValue().toDouble();
         return com.aspose.slides.ms.System.d2.k5(var3) ? 0.0 : var3;
      } else {
         double var5 = 0.0;
         List$Enumerator var7 = this.l6.iterator();

         try {
            while (var7.hasNext()) {
               v5x var8 = (v5x)var7.next();
               var5 += var8.u3();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         return var5;
      }
   }

   private void k5(z5 var1) {
      float var2 = var1.n5() * var1.l6();
      double var3 = 0.0;
      List$Enumerator var5 = this.l6.iterator();

      try {
         while (var5.hasNext()) {
            v5x var6 = (v5x)var5.next();
            var3 += var6.u3();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      this.n5(var2);
      if (var3 == 0.0) {
         var3 = 1.0;
      }

      float var17 = var2 / (float)var3;
      float var7 = 0.0F;
      List$Enumerator var8 = this.l6.iterator();

      try {
         while (var8.hasNext()) {
            v5x var9 = (v5x)var8.next();
            var9.n5((float)var9.u3() * var17);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }
   }

   private void n5(int var1, int var2, float var3, float var4, z5 var5) {
      boolean var6 = this.a6(var5);
      if (var2 >= this.l6.size()) {
         this.n5(var1, var2, var3, var5, var6);
      } else {
         float var7 = var3 + this.l6.get_Item(var2).h0();
         if (var6) {
            this.l6.get_Item(var2).k5(var7 / var5.l6());
            this.l6.get_Item(var2).u3(var5.l6() * (this.l6.get_Item(var2).h0() / var7));
         } else {
            this.l6.get_Item(var2).u3(var7 / var5.n5());
            this.l6.get_Item(var2).k5(var5.n5() * (this.l6.get_Item(var2).h0() / var7));
         }

         float var8 = 1.622305F;
         float var9 = 2.511665F;
         float var10 = com.aspose.slides.ms.System.q1.n5(
            (float)(var8 * this.l6.get_Item(var2).d5() / this.l6.get_Item(var2).d2()), (float)(var9 * this.l6.get_Item(var2).d2() / this.l6.get_Item(var2).d5()
         ));
         if (var10 <= var4) {
            var4 = var10;
            var3 += this.l6.get_Item(var2).h0();
            this.n5(var1, ++var2, var3, var4, var5);
         } else {
            this.n5(var1, var2, var3, var5, var6);
         }
      }
   }

   private void n5(int var1, int var2, float var3, z5 var4, boolean var5) {
      z5 var6 = new z5(var4.n5(), var4.l6());
      float var7 = this.a6;
      float var8 = this.u9;

      for (int var9 = var1; var9 < var2; var9++) {
         if (var5) {
            this.l6.get_Item(var9).n3(new z5(var3 / var4.l6(), this.l6.get_Item(var9).h0() / var3 * var4.l6()));
            this.l6.get_Item(var9).a6(var7);
            this.l6.get_Item(var9).u9(var8);
            var6 = new z5(var4.n5() - this.l6.get_Item(var9).d2(), var4.l6());
            var8 += this.l6.get_Item(var9).d5();
         } else {
            this.l6.get_Item(var9).n3(new z5(this.l6.get_Item(var9).h0() / var3 * var4.n5(), var3 / var4.n5()));
            this.l6.get_Item(var9).a6(var7);
            this.l6.get_Item(var9).u9(var8);
            var6 = new z5(var4.n5(), var4.l6() - this.l6.get_Item(var9).d5());
            var7 += this.l6.get_Item(var9).d2();
         }
      }

      if (var5) {
         this.a6 = this.a6 + (var4.n5() - var6.n5());
      } else {
         this.u9 = this.u9 + (var4.l6() - var6.l6());
      }

      if (var2 < this.l6.size()) {
         this.n5(var2, var2, 0.0F, 2.1474836E9F, var6);
      }
   }

   private boolean a6(z5 var1) {
      return var1.n5() > var1.l6();
   }

   @Override
   protected void l6() {
      if (this.h0) {
         FillFormat var1 = this.t2.k5();
         IEffectFormat var2 = this.t2.u3();
         w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), this.s7.t2(), this.e5().y4(), var1, var2);
         this.s7.t2().d2().n5(this.e5().y4(), new l6v(com.aspose.slides.internal.o9b.c8.w4().o8(), 0.15F), new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
      }
   }

   @Override
   protected void l6(z5 var1) {
      if (this.u3 != null) {
         this.u3.a6(3.0F);
         this.u3.u9(this.d5() - this.u3.d5() - 3.0F);
      }

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   final float h0() {
      return this.n5;
   }

   final void n5(float var1) {
      this.n5 = var1;
   }
}
