package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class u7 extends w3 {
   private boolean h0;
   private List<List<g8t>> c8 = new List<>();

   protected u7(l5 var1) {
      super(var1);
   }

   protected final int m3() {
      int var1 = 0;
      int var2 = 0;

      while (var2 < this.n5.size()) {
         if (!com.aspose.slides.ms.System.d1.n5(this.n5.get_Item(var2).s7())) {
            var1++;
         }

         var2 += this.n5().r4();
      }

      return var1;
   }

   final float h0(z5 var1) {
      float var2 = 0.0F;
      int var3 = 0;

      while (var3 < this.n5.size()) {
         float var4 = this.n5.get_Item(var3).a6(var1).l6();
         if (var4 > var2) {
            var2 = var4;
         }

         var3 += this.n5().r4();
      }

      return var2;
   }

   protected final boolean c8(z5 var1) {
      z5 var2 = new z5(this.n5().d2().c4(), this.n5().d2().y2());

      for (int var3 = 0; var3 < this.n5.size(); var3 += this.n5().r4()) {
         float var4 = this.n5.get_Item(var3).a6(var2).l6();
         if (var4 > var1.n5() + 0.07F) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected com.aspose.slides.internal.o9b.f2 u9(z5 var1) {
      if (this.n5().c8().isVisible() && this.n5().c8().getTickLabelPosition() != 3) {
         float var2 = 0.0F;
         float var3 = 0.0F;

         for (int var4 = 0; var4 < this.n5.size(); var4 += this.n5().r4()) {
            g8t var5 = this.n5.get_Item(var4);
            d2k var6 = var5.k5(var1).u3();
            if (var6.n5 > var2) {
               var2 = var6.n5;
            }

            if (var6.l6 > var3) {
               var3 = var6.l6;
            }
         }

         return new com.aspose.slides.internal.o9b.f2(var2, var3);
      } else {
         return new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      }
   }

   protected abstract z5 t2(z5 var1);

   public void s7(z5 var1) {
      this.n5.clear();
      int var2 = 0;
      List$Enumerator var3 = this.l6.iterator();

      try {
         while (var3.hasNext()) {
            g3y var4 = (g3y)var3.next();
            int var5 = ChartTypeCharacterizer.n5(var4.u9().getType());
            if (var5 == 5 || var5 == 2) {
               double var6 = 0.0;
               double var8 = 0.0;
               double[] var10 = new double[]{0.0};
               double[] var11 = new double[]{0.0};
               com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), u2w.class).h0().n5(this, var10, var11);
               var6 = var10[0];
               var8 = var11[0];
               if (var8 > var2) {
                  var2 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var8), 14);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      int var19 = com.aspose.slides.ms.System.q1.n5(n1g.u3(this.l6), var2);
      if (this.n5(78)) {
         var19 = 1;
      }

      IChartCategoryCollection var20 = this.n5().c8().u9() && this.y2().u3().n3().getChartData().getUseSecondaryCategories()
         ? this.n5().d2().n3().getChartData().getSecondaryCategories()
         : this.n5().d2().n3().getChartData().getCategories();
      if (var20.size() > 0) {
         if (var19 / var20.size() > 4000) {
            var19 = 4000;
         }

         for (int var13 = 0; var13 < var19; var13++) {
            if (var13 < var20.size()) {
               ChartCategory var14 = (ChartCategory)var20.get_Item(var13);
               g8t var15 = this.n5(var14.u3());
               var15.n5(var14);
               if (!this.c4() && com.aspose.slides.ms.System.d1.n5(var15.s7())) {
                  this.n5(true);
               }

               if (var20.getGroupingLevelCount() > 1 && this.n5().c8().n5().u9()) {
                  for (int var16 = 1; var16 < var20.getGroupingLevelCount(); var16++) {
                     if (var14.n5(var16) != null) {
                        Object var23 = var14.n5(var16);
                        if (var15.h0() == null) {
                           var15.n5(var23);
                        } else {
                           var15.n5(com.aspose.slides.ms.System.d1.n5("{0}\n{1}", var15.s7(), var23));
                        }
                     }
                  }
               }
            } else {
               this.n5((Object)com.aspose.slides.ms.System.d1.n5);
               this.n5(true);
            }
         }
      } else if (((ChartCategoryCollection)var20).u9() || !this.l6.isEmpty() && ChartTypeCharacterizer.u3(this.l6.get_Item(0).u9().getType())) {
         if (!this.n5().c8().isAutomaticMaxValue()) {
            var19 = com.aspose.slides.internal.v6g.k5.u3(this.n5().c8().getMaxValue(), 14);
         }

         for (int var24 = 1; var24 <= var19; var24++) {
            this.n5(Integer.valueOf(var24));
         }
      }
   }

   protected final int z8() {
      int var1 = 0;
      int[] var2 = new int[]{0};
      int var3 = com.aspose.slides.ms.System.q1.n5(this.n5.size(), this.n5().r4(), var2);
      var1 = var2[0];
      if (var1 > 0) {
         var3++;
      }

      return var3;
   }

   protected final void j5() {
      if (this.n5().r4() != 1) {
         for (int var1 = 0; var1 < this.n5.size(); var1 += this.n5().r4()) {
            int var2 = var1 + 1;
            int var3 = var1 + this.n5().r4();
            if (var3 > this.n5.size()) {
               var3 = this.n5.size();
            }

            for (int var4 = var2; var4 < var3; var4++) {
               this.n5.get_Item(var4).l6(false);
               this.l6(this.n5.get_Item(var4));
            }
         }
      }
   }

   protected final List<List<g8t>> w1() {
      return this.c8;
   }

   protected final double r4() {
      int var1 = n1g.u3(this.n5().d2().e2());
      if (this.n5().a0() || this.n5().d2().n3().hasDataTable()) {
         var1++;
      }

      byte var2 = 1;
      if (var1 <= var2) {
         var1 = 2;
      }

      return var1;
   }

   @Override
   public float y4() {
      return this.n5(this.e2());
   }

   @Override
   public double e2() {
      byte var1 = 1;
      double var2 = this.n5().t4();
      if (this.n5().c8().getCrossType() == 1) {
         var2 = this.r4();
      }

      if (var2 > this.r4()) {
         var2 = this.r4();
      } else if (var2 < var1) {
         var2 = var1;
      }

      this.n5().n5((float)var2);
      return var2;
   }

   @Override
   public List<Float> m1() {
      List var1 = new List();
      int var2 = this.n5().a0() ? this.n5.size() + 1 : this.n5.size();
      int var3 = 0;
      int[] var4 = new int[]{0};
      var2 = com.aspose.slides.ms.System.q1.n5(var2, this.n5().y2(), var4);
      var3 = var4[0];
      if (var3 > 0) {
         var2++;
      }

      float var5 = this.a6() ? this.d5() / (var2 - 1) : this.d2() / (var2 - 1);
      int var6 = 1;
      if (!this.n5().c8().isAutomaticTickMarksSpacing()) {
         var6 = (int)this.n5().c8().getTickMarksSpacing();
      }

      for (int var7 = 0; var7 < var2; var7 += var6) {
         var1.addItem(var5 * var7);
      }

      return var1;
   }

   @Override
   public List<Float> k7() {
      int var1 = this.n5().a0() ? this.n5.size() + 1 : this.n5.size();
      int var2 = 0;
      int[] var3 = new int[]{0};
      var1 = com.aspose.slides.ms.System.q1.n5(var1, this.n5().y2(), var3);
      var2 = var3[0];
      if (var2 > 0) {
         var1++;
      }

      List var4 = new List();
      float var5 = this.a6() ? this.d5() / (var1 - 1) : this.d2() / (var1 - 1);

      for (int var6 = 0; var6 < var1 - 1; var6++) {
         var4.addItem(var5 * var6 + var5 / 2.0F);
      }

      return var4;
   }

   public final boolean c4() {
      return this.h0;
   }

   private void n5(boolean var1) {
      this.h0 = var1;
   }
}
