package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class c5w extends v6g {
   private final n1g n5;
   private h9p[] l6;
   private float k5;
   private float u3;
   private boolean a6;
   private float u9;
   private int h0 = 0;
   private float c8 = Float.NaN;
   private float t2 = Float.NaN;
   private float s7 = Float.NaN;
   private float x8 = Float.NaN;
   private float n3 = Float.NaN;

   public final int u3() {
      return this.e2().getPosition();
   }

   public final boolean h0() {
      return this.e2().getOverlay();
   }

   public final boolean c8() {
      int var1 = this.u3();
      return var1 == 1 || var1 == 2 || var1 == 4;
   }

   @Override
   public int O_() {
      return 11;
   }

   final int t2() {
      return this.h0;
   }

   final float s7() {
      return this.u9;
   }

   final float x8() {
      return ChartTypeCharacterizer.u3(this.n5.y4().get_Item(0).u9().getType())
            && !com.aspose.slides.ms.System.n1.k5(this.e2().getTextFormat().getPortionFormat().getFontHeight())
         ? 7.0F
         : this.u9 * 0.36F;
   }

   public c5w(n1g var1) {
      this.n5 = var1;
      if (var1.y4().size() > 0) {
         this.a6 = n5(var1.n3().getChartData().getSeries());
         List var2 = this.n5(var1.y4());
         g3y var3 = (g3y)var2.get_Item(0);
         List var4 = new List();
         if (this.a6) {
            List$Enumerator var25 = var3.c8().iterator();

            try {
               while (var25.hasNext()) {
                  t9z var29 = (t9z)var25.next();
                  LegendEntryProperties var33 = (LegendEntryProperties)var29.s7().getRelatedLegendEntry();
                  if (!var33.getHide()) {
                     var4.addItem(new d1z(var33, var29));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
                  var25.dispose();
               }
            }
         } else {
            for (int var5 = 0; var5 < var2.size(); var5++) {
               LegendEntryProperties var6 = (LegendEntryProperties)var1.y4().get_Item(var5).u9().getRelatedLegendEntry();
               if (!var6.getHide()) {
                  var4.addItem(new p7p(var6, (g3y)var2.get_Item(var5)));
               }
            }

            List$Enumerator var24 = var2.iterator();

            try {
               while (var24.hasNext()) {
                  g3y var28 = (g3y)var24.next();
                  List$Enumerator var7 = var28.a6().iterator();

                  try {
                     while (var7.hasNext()) {
                        w3q var8 = (w3q)var7.next();
                        LegendEntryProperties var9 = (LegendEntryProperties)var8.k5().getRelatedLegendEntry();
                        if (!var9.getHide()) {
                           var4.addItem(new t5d(var9, var8));
                           if (this.h0 != 2) {
                              this.h0 = 2;
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                        var7.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
                  var24.dispose();
               }
            }
         }

         if (var3.u9().getType() == 74 || var3.u9().getType() == 75) {
            var4.clear();
            ChartCategoryCollection var26 = (ChartCategoryCollection)var1.n3().getChartData().getCategories();
            if (var26.size() != 0 && !var26.l6()) {
               int var31 = var26.getGroupingLevelCount();
               List var35 = var26.n5(var31 - 1);

               for (int var38 = 0; var38 < var35.size(); var38++) {
                  ChartDataPointLevel var40 = (ChartDataPointLevel)var3.u9()
                     .getDataPoints()
                     .get_Item((Integer)((KeyValuePair)var35.get_Item(var38)).getKey())
                     .getDataPointLevels()
                     .get_Item(var31 - 1);
                  e6q var10 = new e6q(
                     new LegendEntryProperties((Legend)var1.n3().getLegend()), var40, (String)((KeyValuePair)var35.get_Item(var38)).getValue(), var1
                  );
                  var4.addItem(var10);
               }
            } else {
               for (int var30 = 0; var30 < var1.n3().getChartData().getSeries().get_Item(0).getDataPoints().size(); var30++) {
                  ChartDataPointLevel var34 = (ChartDataPointLevel)var1.n3()
                     .getChartData()
                     .getSeries()
                     .get_Item(0)
                     .getDataPoints()
                     .get_Item(var30)
                     .getDataPointLevels()
                     .get_Item(0);
                  e6q var37 = new e6q(
                     new LegendEntryProperties((Legend)var1.n3().getLegend()),
                     var34,
                     com.aspose.slides.ms.System.d1.n5("Branch {0}", new Object[]{var30 + 1}),
                     var1
                  );
                  var4.addItem(var37);
               }
            }
         }

         if (var3.u9().getType() == 79) {
            var4.clear();
            var4.addItem(new p7p(new LegendEntryProperties((Legend)var1.n3().getLegend()), var3, "Increase"));
            var4.addItem(new p7p(new LegendEntryProperties((Legend)var1.n3().getLegend()), var3, "Decrease"));
            var4.addItem(new p7p(new LegendEntryProperties((Legend)var1.n3().getLegend()), var3, "Total"));
         }

         this.l6 = (h9p[])var4.toArray(new h9p[0]);

         for (h9p var39 : this.l6) {
            this.n5(var39);
         }
      }
   }

   private void n3() {
      for (h9p var4 : this.l6) {
         int var5 = var4.c8().u3();
         if (var5 == 2) {
            this.h0 = 2;
            break;
         }

         if (var5 == 1 && this.h0 != 1) {
            this.h0 = 1;
         }
      }

      float var7 = 0.0F;

      for (h9p var11 : this.l6) {
         n4c var6 = var11.h0();
         var7 = com.aspose.slides.ms.System.q1.n5((float)(var6.c8().a6()), (float)(var7));
      }

      this.u9 = var7;
   }

   private List<g3y> n5(List<g3y> var1) {
      List var2 = new List();
      g3y var3 = (g3y)var1.get_Item(0);
      List var4 = new List();

      for (int var5 = 0; var5 < var1.size(); var5++) {
         boolean var6 = var5 + 1 == var1.size();
         boolean var7 = ((g3y)var1.get_Item(var5)).u9().getType() != var3.u9().getType();
         if (var6) {
            if (!var7) {
               var4.addItem(var1.get_Item(var5));
            }

            if (this.n5(var3)) {
               var4.reverse();
            }

            var2.addRange(var4);
            if (var7) {
               var2.addItem(var1.get_Item(var5));
            }
         } else if (var7) {
            if (this.n5(var3)) {
               var4.reverse();
            }

            var2.addRange(var4);
            var3 = (g3y)var1.get_Item(var5);
            var4.clear();
            var4.addItem(var1.get_Item(var5));
         } else {
            var4.addItem(var1.get_Item(var5));
         }
      }

      return var2;
   }

   private boolean n5(g3y var1) {
      if (!this.c8()
         || !ChartTypeCharacterizer.isChartTypeArea(var1.u9().getType())
            && !ChartTypeCharacterizer.isChartTypeColumn(var1.u9().getType())
            && !ChartTypeCharacterizer.isChartTypeLine(var1.u9().getType())
         || !ChartTypeCharacterizer.c8(var1.u9().getType()) && !ChartTypeCharacterizer.s7(var1.u9().getType())) {
         if (var1.u9().getType() == 34 && !this.a6) {
            boolean var2 = var1.u9().getPlotOnSecondAxis()
               ? var1.t2().n3().getAxes().getSecondaryVerticalAxis().isPlotOrderReversed()
               : var1.t2().n3().getAxes().getVerticalAxis().isPlotOrderReversed();
            return !var2;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   protected void n5(z5 var1) {
      if (this.l6.length != 0) {
         this.n3();
         float var2 = 0.0F;
         float var3 = 0.0F;

         for (h9p var7 : this.l6) {
            com.aspose.slides.internal.o9b.f2 var8 = var7.h0().h0().a6();
            var2 = com.aspose.slides.ms.System.q1.n5((float)(var2), (float)(var8.k5()));
            var3 = com.aspose.slides.ms.System.q1.n5((float)(var3), (float)(var8.l6()));
         }

         this.n3 = var2;
         float var11 = 3.0F;
         if (this.t2() == 0) {
            this.s7 = 3.0F;
            this.x8 = 3.0F;
         } else {
            this.s7 = this.n5(var2) ? 0.0F : 3.0F;
            this.x8 = this.n5(var2) ? 0.0F : 3.0F;
         }

         z5 var12 = this.k5(var1);

         for (h9p var9 : this.l6) {
            var9.n3(var12);
         }

         if (this.t2() != 0) {
            float var14 = 0.0F;

            for (h9p var10 : this.l6) {
               var14 = com.aspose.slides.ms.System.q1.n5((float)(var14), (float)(var10.d5()));
            }

            if (this.n5(var14)) {
               this.x8 = 0.0F;
               this.s7 = 0.0F;
            }
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      if (this.l6.length != 0) {
         com.aspose.slides.internal.o9b.f2 var2 = new com.aspose.slides.internal.o9b.f2();
         z5 var3 = this.k5(var1);
         if (var3.n5() != 0.0F && var3.l6() != 0.0F) {
            if (this.c8()) {
               this.n5(this.l6, var3).l6(var2);
            } else {
               this.n5(this.l6, this.n3, var3).l6(var2);
            }

            this.k5(com.aspose.slides.ms.System.n1.k5(var2.l6()) ? 0.0F : var2.l6());
            this.u3(com.aspose.slides.ms.System.n1.k5(var2.k5()) ? 0.0F : var2.k5());

            for (h9p var11 : this.l6) {
               var11.t1();
            }
         } else {
            for (h9p var7 : this.l6) {
               var7.t1();
            }

            this.k5(0.0F);
            this.u3(0.0F);
         }
      }
   }

   @Override
   protected void u3(z5 var1) {
      if (this.l6.length == 0) {
         this.k5(0.0F);
         this.u3(0.0F);
      }

      if (this.y4()) {
         o3t var2 = (o3t)var1;
         this.k5 = var2.k5();
         this.u3 = var2.h0();
         z5 var3 = new z5(this.k5, this.u3 - 4.0F);

         for (h9p var7 : this.l6) {
            var7.n5(false);
            var7.n3(var3);
         }

         this.l6(this.l6, new z5(var2.k5(), var2.h0()));
      }
   }

   private com.aspose.slides.internal.o9b.f2 n5(h9p[] var1, z5 var2) {
      float var3 = 2.88F;
      float var4 = 0.0F;
      float var5 = 0.0F;

      for (h9p var9 : var1) {
         var4 = com.aspose.slides.ms.System.q1.n5((float)(var4), (float)(var9.d5()));
         var5 = com.aspose.slides.ms.System.q1.n5((float)(var5), (float)(var9.d2()));
      }

      float var16 = this.t9();
      float var17 = this.n5(var4 / 2.0F) ? 2.0F : 4.0F + com.aspose.slides.ms.System.q1.n5((float)(2.0F), (float)(1.0F / var4 * 20.0F));
      float var18 = 0.0F;
      float var19 = 0.0F;

      for (h9p var13 : var1) {
         float var14 = com.aspose.slides.ms.System.q1.n5((float)(0.0F), (float)((this.x8() - var13.d5()) / 2.0F));
         float var15 = var4 - var14;
         var13.a6(var3);
         var13.u9(var16 + var14);
         if (!(var16 + var13.d5() < var2.l6()) && !this.y4()) {
            var13.n5(true);
         } else {
            var18 = com.aspose.slides.ms.System.q1.n5((float)(var18), (float)(var13.b3() + var13.d2()));
            if (var16 + var4 + var17 < var2.l6()) {
               var19 = com.aspose.slides.ms.System.q1.n5((float)(var19), (float)(var13.o0() + var15));
            } else {
               var19 = com.aspose.slides.ms.System.q1.n5(
                  (float)(var19), (float)(var13.o0() + com.aspose.slides.ms.System.q1.n5((float)(var13.d5()), (float)((var2.l6() - var16 - var17 - var13.d5()) / 2.0F))
               ));
            }
         }

         var16 += var4 + var17;
         var13.t1();
      }

      return new com.aspose.slides.internal.o9b.f2(var18 + 2.88F, var19 + this.z1());
   }

   @Override
   protected void V_() {
      if (this.T_()) {
         Legend var1 = this.e2();
         var1.n5(this.p8() - this.n5.n3().getX());
         var1.l6(this.f2() - this.n5.n3().getY());
         var1.k5(this.d2());
         var1.u3(this.d5());
      }
   }

   private com.aspose.slides.internal.o9b.f2 n5(h9p[] var1, float var2, z5 var3) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = -Float.MAX_VALUE;
      float var7 = Float.MAX_VALUE;

      for (h9p var11 : var1) {
         var5 += var11.d2();
         var4 = com.aspose.slides.ms.System.q1.n5((float)(var4), (float)(var11.d5()));
         var7 = com.aspose.slides.ms.System.q1.l6(var11.d2() * 0.15F, var7);
         var6 = com.aspose.slides.ms.System.q1.n5((float)(var11.d2() * 0.15F), (float)(var6));
      }

      if (!(var5 <= var3.n5())) {
         return this.l6(var1, var2, var3);
      }

      float var18 = this.t9();
      boolean var20 = this.n5.y4().size() == 1 && ChartTypeCharacterizer.isChartTypePie(this.n5.y4().get_Item(0).u9().getType());
      boolean var21 = ChartTypeCharacterizer.u3(this.n5.y4().get_Item(0).u9().getType())
         && !com.aspose.slides.ms.System.n1.k5(this.e2().getTextFormat().getPortionFormat().getFontHeight());
      float var12 = var21 ? 0.0F : com.aspose.slides.ms.System.q1.l6(2.0F + var2 * 0.4F, (var3.n5() - var5) / var1.length);
      float var13 = (var6 + var7) / 2.0F;
      if (!ChartTypeCharacterizer.u3(this.n5.y4().get_Item(0).u9().getType()) && var13 * var1.length + var5 < var3.n5()) {
         var12 = var13;
      }

      float var19 = var12;

      for (h9p var17 : var1) {
         if (var17.T_()) {
            var17.a6(var19);
            var17.u9(var18 + (var4 - var17.d5()) / 2.0F);
            var19 += var17.d2() + var12;
         }

         var17.t1();
      }

      float var22 = var19 - var12;
      if (!var20) {
         var22 += var12;
      }

      float var23 = this.t9() + var4 + this.z1();
      return new com.aspose.slides.internal.o9b.f2(var22, var23);
   }

   private com.aspose.slides.internal.o9b.f2 l6(h9p[] var1, float var2, z5 var3) {
      int var4 = 0;
      int var5 = 0;
      int[] var6 = new int[]{0};
      int[] var7 = new int[]{0};
      com.aspose.slides.internal.o9b.f2 var8 = this.n5(var1, var3, var6, var7).a6();
      var4 = var6[0];
      var5 = var7[0];
      float var9 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5((float)(5.0F), (float)(3.0F + var2 * 0.2F)), (var3.n5() - var8.l6() * var5) / var5);
      float var10 = 3.5F + var2 * 0.2F;
      float var11 = this.t9();
      int var12 = 0;

      for (int var13 = 0; var12 < var4 && var13 < var1.length; var12++) {
         float var14 = 0.0F;

         for (int var15 = 0; var15 < var5 && var13 < var1.length; var13++) {
            h9p var16 = var1[var13];
            var16.a6(var14);
            var16.u9(var11 + (var8.k5() - var16.d5()) / 2.0F);
            var16.k5(var8.l6());
            var16.u3(var8.k5());
            var16.t1();
            var14 += var8.l6() + var9;
            var16.n5(var11 > var3.l6());
            var15++;
         }

         var11 += var8.k5() + var10;
      }

      return new com.aspose.slides.internal.o9b.f2(var8.l6() * var5 + var9 * (var5 - 1), this.t9() + var8.k5() * var4 + var10 * (var4 - 1) + this.z1());
   }

   private void l6(h9p[] var1, z5 var2) {
      float var3 = 0.0F;
      float var4 = 0.0F;

      for (h9p var8 : var1) {
         var3 += var8.d2();
         var4 = com.aspose.slides.ms.System.q1.n5((float)(var4), (float)(var8.d5()));
      }

      if (var3 <= var2.n5()) {
         float var25 = (var2.n5() - var3) / (var1.length + 1);
         float var27 = var25;

         for (int var31 = 0; var31 < var1.length; var31++) {
            h9p var35 = var1[var31];
            var35.a6(var27);
            var35.u9((var2.l6() - var4) / 2.0F);
            var27 += var35.d2() + var25;
         }
      } else {
         float var26 = 3.0F;

         for (h9p var9 : this.l6) {
            var9.n3(new z5(var2.n5() - var26, var2.l6()));
         }

         int var29 = 0;
         int var33 = 0;
         int[] var37 = new int[]{0};
         int[] var38 = new int[]{0};
         com.aspose.slides.internal.o9b.f2 var10 = this.n5(var1, var2, var37, var38).a6();
         var29 = var37[0];
         var33 = var38[0];
         if (this.c8() && var29 > 1 && var33 > 1) {
            float var11 = 3.6F;
            z5 var12 = new z5(var2.n5() - var26 - var33 * var11, var2.l6());
            var37[0] = var29;
            var38[0] = var33;
            this.n5(var1, var12, var37, var38).l6(var10);
            var29 = var37[0];
            var33 = var38[0];
         }

         float var39 = 0.0F;
         float var40 = var2.n5() / var33;
         float var13 = com.aspose.slides.ms.System.q1.n5((float)(var10.k5()), (float)(var2.l6() / var29));
         float var14 = 0.87F;
         int var15 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var2.l6() / (var13 * var14) + 1.0E-5), 14);
         int var16 = com.aspose.slides.ms.System.q1.l6(var15, var1.length);
         if (var16 == 0) {
            var16 = 1;
         }

         var13 = var2.l6() / var16;
         boolean var17 = var2.n5() * var14 < var10.l6() && var2.l6() * var14 <= var13;
         double var18 = -var13 * 0.034999996F;
         int var20 = 0;

         for (int var21 = 0; var20 < var29 && var21 < var1.length; var20++) {
            float var22 = var39;

            for (int var23 = 0; var23 < var33 && var21 < var1.length; var21++) {
               h9p var24 = var1[var21];
               var24.a6(var22 + (var40 - var10.l6()) / 2.0F);
               var24.u9((float)(var18 + (var13 - var10.k5()) / 2.0F));
               var24.n5(var17 || var18 + var13 > var2.l6());
               var22 += var40;
               var23++;
            }

            var18 += var13;
         }
      }
   }

   private com.aspose.slides.internal.o9b.f2 n5(h9p[] var1, z5 var2, int[] var3, int[] var4) {
      float var5 = 0.0F;
      float var6 = 0.0F;

      for (h9p var10 : var1) {
         var5 = com.aspose.slides.ms.System.q1.n5((float)(var5), (float)(var10.d2()));
         var6 = com.aspose.slides.ms.System.q1.n5((float)(var6), (float)(var10.d5() * 0.93F));
      }

      if (var5 == 0.0F) {
         var5 = 1.0F;
      }

      int var11 = com.aspose.slides.ms.System.z3.h0(com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.q1.n5((float)(var2.n5() / var5), (float)(1.0F))));
      var3[0] = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)((float)var1.length / var11)), 14);
      var4[0] = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)((float)var1.length / var3[0])), 14);
      return new com.aspose.slides.internal.o9b.f2(var5, var6);
   }

   private z5 k5(z5 var1) {
      float var2 = this.c8() ? 3.6F : 0.0F;
      float var3 = var1.n5() - var2 * 2.0F;
      float var4 = var1.l6() - this.t9() - this.z1();
      return new z5(var3, var4);
   }

   private boolean n5(float var1) {
      return this.t2() != 0 && var1 > 90.0F;
   }

   private boolean y4() {
      Legend var1 = this.e2();
      float var2 = var1.getX();
      float var3 = var1.getY();
      float var4 = var1.getWidth();
      float var5 = var1.getHeight();
      return !com.aspose.slides.ms.System.n1.k5(var2)
         && !com.aspose.slides.ms.System.n1.k5(var3)
         && !com.aspose.slides.ms.System.n1.k5(var4)
         && !com.aspose.slides.ms.System.n1.k5(var5);
   }

   private Legend e2() {
      return (Legend)this.n5.n3().getLegend();
   }

   private float t9() {
      return this.s7;
   }

   private float z1() {
      return this.x8;
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y2().p8(), this.y2().f2(), this.y2().d2(), this.y2().d5());
      f9 var2 = new f9(this.n5);
      var2.n5(var1.y4());

      try {
         com.aspose.slides.internal.o9b.y1 var3 = (this.y4() ? new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.k5, this.u3) : this.e5()).y4();
         ILegend var4 = this.n5.n3().getLegend();
         if (var3.s7() > 0.0F && var3.k5() > 0.0F) {
            w5k.l6(
               com.aspose.slides.internal.o9b.c8.u3.o8(),
               com.aspose.slides.internal.o9b.c8.u3.o8(),
               this.n5,
               var3.y4(),
               (LineFormat)var4.getFormat().getLine(),
               (FillFormat)var4.getFormat().getFill(),
               var4.getFormat().getEffect()
            );
            boolean var5 = false;
            if (var4.getFormat().getEffect3D().getCamera().getCameraType() == -1 && var4.getFormat().getEffect3D().getMaterial() == -1) {
               var5 = w5k.n5(
                  var3.y4(),
                  var3.y4(),
                  this.n5,
                  this.e2().getFormat().getEffect3D(),
                  (FillFormat)var4.getFormat().getFill(),
                  (LineFormat)var4.getFormat().getLine(),
                  com.aspose.slides.internal.o9b.c8.u3.o8(),
                  com.aspose.slides.internal.o9b.c8.u3.o8()
               );
            }

            if (!var5) {
               w5k.n5(
                  com.aspose.slides.internal.o9b.c8.u3.o8(),
                  com.aspose.slides.internal.o9b.c8.u3.o8(),
                  this.n5,
                  var3.y4(),
                  (LineFormat)var4.getFormat().getLine(),
                  (FillFormat)var4.getFormat().getFill(),
                  var4.getFormat().getEffect()
               );
            }
         }
      } finally {
         var2.n5();
      }
   }

   static boolean n5(IChartSeriesCollection var0) {
      if (var0.size() == 1) {
         IChartSeries var16 = var0.get_Item(0);
         int var17 = var16.getType();
         if (ChartTypeCharacterizer.isChartTypePie(var17)) {
            return true;
         }

         if (ChartTypeCharacterizer.isChartTypeDoughnut(var17)) {
            return true;
         }

         if (var16.isColorVaried()) {
            return true;
         }

         if (!ChartTypeCharacterizer.isChartTypeArea(var17) && !ChartTypeCharacterizer.isChartTypeStock(var17) && var16.getDataPoints().size() > 0) {
            IMarker var18 = var16.getMarker();
            IFormat var19 = var16.getFormat();
            IGenericEnumerator var20 = var16.getDataPoints().iterator();

            try {
               while (var20.hasNext()) {
                  ChartDataPoint var6 = (ChartDataPoint)var20.next();
                  if (n5(var19, var6.n5(), false) || n5(var18, var6.l6())) {
                     return true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
                  var20.dispose();
               }
            }
         }

         return false;
      } else {
         boolean var1 = true;
         boolean var2 = true;
         IGenericEnumerator var3 = var0.iterator();

         try {
            while (var3.hasNext()) {
               IChartSeries var4 = (IChartSeries)var3.next();
               int var5 = var4.getType();
               if (var1) {
                  var1 &= ChartTypeCharacterizer.isChartTypeDoughnut(var5) && var4.isColorVaried();
               }

               if (var2) {
                  var2 &= ChartTypeCharacterizer.isChartTypePie(var5);
               }

               if (!var1 && !var2) {
                  return false;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return true;
      }
   }

   private static boolean n5(IMarker var0, IMarker var1) {
      if (var0 != var1 && var0 != null && var1 != null) {
         if (var0.getSize() != var1.getSize() && var1.getSize() != 0) {
            return true;
         }

         if (var0.getSymbol() != var1.getSymbol() && var1.getSymbol() != -1) {
            return true;
         }

         if (n5(var0.getFormat(), var1.getFormat(), true)) {
            return true;
         }
      }

      return false;
   }

   private static boolean n5(IFormat var0, IFormat var1, boolean var2) {
      if (var0 != var1 && var0 != null && var1 != null) {
         if (var2) {
            if (n5(var0.getFill(), var1.getFill())) {
               return true;
            }

            if (n5(var0.getLine(), var1.getLine())) {
               return true;
            }
         } else {
            if (var1.getFill().getFillType() != -1) {
               return true;
            }

            if (!var1.getLine().isFormatNotDefined()) {
               return true;
            }
         }
      }

      return false;
   }

   private static boolean n5(IFillFormat var0, IFillFormat var1) {
      if (var1.getFillType() != -1) {
         if (var0.getFillType() != var1.getFillType()) {
            return true;
         }

         switch (var1.getFillType()) {
            case 1:
               return n5(var0.getSolidFillColor(), var1.getSolidFillColor());
            case 2:
               return n5(var0.getGradientFormat(), var1.getGradientFormat());
            case 3:
               return n5(var0.getPatternFormat(), var1.getPatternFormat());
            case 4:
               return var0.getPictureFillFormat().getPicture() != var1.getPictureFillFormat().getPicture();
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   private static boolean n5(ILineFormat var0, ILineFormat var1) {
      if (!var1.isFormatNotDefined()) {
         if (var0.getAlignment() == var1.getAlignment()
            && var0.getBeginArrowheadLength() == var1.getBeginArrowheadLength()
            && var0.getBeginArrowheadStyle() == var1.getBeginArrowheadStyle()
            && var0.getBeginArrowheadWidth() == var1.getBeginArrowheadWidth()
            && var0.getCapStyle() == var1.getCapStyle()
            && var0.getDashStyle() == var1.getDashStyle()
            && var0.getEndArrowheadLength() == var1.getEndArrowheadLength()
            && var0.getEndArrowheadStyle() == var1.getEndArrowheadStyle()
            && var0.getEndArrowheadWidth() == var1.getEndArrowheadWidth()
            && var0.getJoinStyle() == var1.getJoinStyle()
            && com.aspose.slides.internal.n8e.v4.n5(var0.getMiterLimit(), var1.getMiterLimit())
            && var0.getStyle() == var1.getStyle()
            && var0.getFillFormat().getFillType() == var1.getFillFormat().getFillType()) {
            switch (var0.getFillFormat().getFillType()) {
               case 1:
                  return n5(var0.getFillFormat().getSolidFillColor(), var1.getFillFormat().getSolidFillColor());
               case 2:
                  return n5(var0.getFillFormat().getGradientFormat(), var1.getFillFormat().getGradientFormat());
               case 3:
                  return n5(var0.getFillFormat().getPatternFormat(), var1.getFillFormat().getPatternFormat());
               default:
                  return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean n5(IGradientFormat var0, IGradientFormat var1) {
      if (var0.getGradientDirection() == var1.getGradientDirection()
         && var0.getGradientShape() == var1.getGradientShape()
         && var0.getLinearGradientAngle() == var1.getLinearGradientAngle()
         && var0.getLinearGradientScaled() == var1.getLinearGradientScaled()
         && var0.getTileFlip() == var1.getTileFlip()
         && var0.getGradientStops().size() == var1.getGradientStops().size()) {
         for (int var2 = 0; var2 < var0.getGradientStops().size(); var2++) {
            IGradientStop var3 = var0.getGradientStops().get_Item(var2);
            IGradientStop var4 = var1.getGradientStops().get_Item(var2);
            if (!com.aspose.slides.internal.n8e.v4.n5(var3.getPosition(), var4.getPosition()) || n5(var3.getColor(), var4.getColor())) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private static boolean n5(IPatternFormat var0, IPatternFormat var1) {
      return var0.getPatternStyle() != var1.getPatternStyle() || n5(var0.getBackColor(), var1.getBackColor()) || n5(var0.getForeColor(), var1.getForeColor());
   }

   private static boolean n5(IColorFormat var0, IColorFormat var1) {
      return var0 != var1 && var0.getColorType() != var1.getColorType() || ((ColorFormat)var0).u3().h0() != ((ColorFormat)var1).u3().h0();
   }
}
