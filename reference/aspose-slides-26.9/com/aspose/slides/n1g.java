package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class n1g {
   private g3b l6;
   private a8e k5;
   private b9y u3;
   private Chart a6;
   private l5 u9;
   private l5 h0;
   private l5 c8;
   private l5 t2;
   private l5 s7;
   private List<g3y> x8 = new List<>();
   private List<g3y> n3 = new List<>();
   private List<g3y> y4 = new List<>();
   private j9e e2;
   private boolean t9 = true;
   public n2z n5;
   private List<x4> z1;
   private List<x4> t4;
   private List<x4> q0;
   private List<x4>[] z3;
   private List<x4>[] m1;
   private boolean k7;
   private float m3;
   private e3 z8;
   private s5u j5;
   private y9r w1;
   private y9r r4;
   private y9r c4;
   private y9r y2;
   private float y1;

   final boolean n5() {
      return this.t9;
   }

   final void n5(boolean var1) {
      this.t9 = var1;
   }

   n1g(Chart var1, e3 var2, s5u var3) {
      this.a6 = var1;
      this.n5(var2);
      this.n5(var3);
      IGenericEnumerator var4 = this.n3().getChartData().getSeriesGroups().iterator();

      try {
         while (var4.hasNext()) {
            ChartSeriesGroup var5 = (ChartSeriesGroup)var4.next();
            IGenericEnumerator var6 = var5.getSeries().iterator();

            try {
               while (var6.hasNext()) {
                  ChartSeries var7 = (ChartSeries)var6.next();
                  if (!var7.l6()) {
                     g3y var8 = new g3y(var7, this);
                     this.x8.addItem(var8);
                     if (!var8.u9().getPlotOnSecondAxis()) {
                        this.n3.addItem(var8);
                     } else {
                        this.y4.addItem(var8);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.n3.size() != 0 || this.y4.size() != 0) {
         if (this.a6.hasLegend() || ChartTypeCharacterizer.is3DChart(this.a6.getType())) {
            this.l6 = new g3b((Legend)this.a6.getLegend(), this);
         }

         if (this.a6.hasDataTable() || ChartTypeCharacterizer.is3DChart(this.a6.getType())) {
            this.k5 = new a8e((DataTable)this.a6.getChartDataTable(), this);
         }

         if (this.a6.hasTitle() || ChartTypeCharacterizer.is3DChart(this.a6.getType())) {
            this.u3 = new b9y((ChartTitle)this.a6.getChartTitle(), this, true);
         }

         this.n5(var1, this.n3, false);
         this.n5(var1, this.y4, true);
         this.s7 = new l5((Axis)var1.getAxes().getSeriesAxis(), this, 4);
         if (ChartTypeCharacterizer.is3DChart(this.n3().getType())) {
            this.k5(new y9r(this, null));
            this.u3(new g9t(this, this.a6.getFloor()));
            this.n5(new u7c(this, this.a6.getSideWall()));
            this.l6(new d9m(this, this.a6.getBackWall()));
         }

         this.n5(new List<>());
         this.l6(new List<>());
         this.k5(new List<>());
         this.n5 = new n2z((Format)this.n3().getPlotArea().getFormat(), this, this.n3().getPlotArea());
         n5(this.a6.getChartData().getCategories(), this.l6(), this.n3());
         if (!this.a6.getChartData().getUseSecondaryCategories()) {
            this.l6(this.l6());
         } else {
            n5(this.a6.getChartData().getSecondaryCategories(), this.k5(), this.n3());
         }

         this.n5(this.a6(this.l6()));
         this.l6(this.a6(this.k5()));
         this.n5(u9(this.l6()));
         this.l6(u9(this.k5()));
         if (this.u9 != null && this.u9.c8() != null && this.u9.c8().getCategoryAxisType() != 1 && this.l6().size() > 0) {
            List$Enumerator var33 = this.e2().iterator();

            try {
               while (var33.hasNext()) {
                  g3y var35 = (g3y)var33.next();

                  while (var35.c8().size() > this.l6().size()) {
                     this.l6().addItem(new x4(null, ""));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var33, IDisposable.class)) {
                  var33.dispose();
               }
            }
         }

         if (this.h0 != null && this.h0.c8() != null && this.h0.c8().getCategoryAxisType() != 1 && this.k5().size() > 0) {
            List$Enumerator var34 = this.t9().iterator();

            try {
               while (var34.hasNext()) {
                  g3y var36 = (g3y)var34.next();

                  while (var36.c8().size() > this.k5().size()) {
                     this.k5().addItem(new x4(null, ""));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var34, IDisposable.class)) {
                  var34.dispose();
               }
            }
         }

         if (!this.n3().k5()) {
            g6z.n5(this.e2(), this.z1(), this.u9, this.c8);
            g6z.n5(this.t9(), this.t4(), this.h0, this.t2);
         }

         this.n5(this.q0());
         this.n5(this.h0);
         this.n5(this.m1());
         this.n5(this.k7());
      }
   }

   private void n5(Chart var1, List<g3y> var2, boolean var3) {
      if (var2.size() != 0) {
         switch (ChartTypeCharacterizer.n5(((g3y)var2.get_Item(0)).u9().getType())) {
            case 0:
               if (!var3) {
                  this.u9 = new l5(null, this, 0);
                  this.c8 = new l5(null, this, 2);
               }

               this.h0 = new l5(null, this, 1);
               this.t2 = new l5(null, this, 3);
               break;
            case 1:
               if (!var3) {
                  this.u9 = new l5((Axis)var1.getAxes().getVerticalAxis(), this, 0);
                  this.c8 = new l5((Axis)var1.getAxes().getHorizontalAxis(), this, 2);
               }
               break;
            case 2:
            case 3:
            case 5:
            case 6:
               if (!var3) {
                  this.u9 = new l5((Axis)var1.getAxes().getHorizontalAxis(), this, 0);
                  this.c8 = new l5((Axis)var1.getAxes().getVerticalAxis(), this, 2);
               }

               this.h0 = new l5((Axis)var1.getAxes().getSecondaryHorizontalAxis(), this, 1);
               this.t2 = new l5((Axis)var1.getAxes().getSecondaryVerticalAxis(), this, 3);
               break;
            case 4:
               if (!var3) {
                  this.u9 = new l5((Axis)var1.getAxes().getVerticalAxis(), this, 0);
                  this.c8 = new l5((Axis)var1.getAxes().getHorizontalAxis(), this, 2);
               }

               this.h0 = new l5((Axis)var1.getAxes().getSecondaryVerticalAxis(), this, 1);
               this.t2 = new l5((Axis)var1.getAxes().getSecondaryHorizontalAxis(), this, 3);
               break;
            case 7:
               if (!var3) {
                  this.u9 = new l5((Axis)var1.getAxes().getHorizontalAxis(), this, 0);
                  this.c8 = new l5((Axis)var1.getAxes().getVerticalAxis(), this, 2);
               }
               break;
            case 8:
               this.u9 = new l5((Axis)var1.getAxes().getHorizontalAxis(), this, 0);
               this.t2 = new l5((Axis)var1.getAxes().getSecondaryVerticalAxis(), this, 3);
               break;
            default:
               throw new Exception();
         }
      }
   }

   private void n5(l5 var1) {
      if (var1 != null && var1.c8() != null) {
         if (var1.c8() != null && var1.c8().getCategoryAxisType() == 1) {
            List var2 = var1.y4() != 0 && var1.y4() != 2 ? this.k5() : this.l6();

            for (int var3 = 0; var3 < var2.size(); var3++) {
               if (com.aspose.slides.internal.v6g.k5.l6(((x4)var2.get_Item(var3)).l6(), Double.class)) {
                  return;
               }

               if (com.aspose.slides.internal.v6g.k5.l6(((x4)var2.get_Item(var3)).l6(), String.class)
                  && !com.aspose.slides.ms.System.d1.n5((String)((x4)var2.get_Item(var3)).l6())) {
                  var1.c8().setCategoryAxisType(0);
                  return;
               }
            }
         }
      }
   }

   public final List<x4> l6() {
      return this.z1;
   }

   public final void n5(List<x4> var1) {
      this.z1 = var1;
   }

   public final List<x4> k5() {
      return this.t4;
   }

   public final void l6(List<x4> var1) {
      this.t4 = var1;
   }

   public final void k5(List<x4> var1) {
      this.q0 = var1;
   }

   final List<x4>[] u3() {
      return this.z3;
   }

   final void n5(List<x4>[] var1) {
      this.z3 = var1;
   }

   final List<x4>[] a6() {
      return this.m1;
   }

   final void l6(List<x4>[] var1) {
      this.m1 = var1;
   }

   static void n5(IChartCategoryCollection var0, List<x4> var1, Chart var2) {
      if (var0 != null) {
         if (var0.getUseCells() && ((ChartData)var2.getChartData()).l6().k5() != 2) {
            n5((ChartCategoryCollection)var0, var1);
         } else {
            l6(var0, var1, var2);
         }
      }
   }

   private static void n5(ChartCategoryCollection var0, List<x4> var1) {
      if (var0.size() != 0) {
         int var2 = ((ChartCategory)var0.get_Item(0)).k5().n5();
         if (var2 == 0) {
            for (int var3 = 0; var3 < var0.size(); var3++) {
               ChartCategory var4 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var3), ChartCategory.class);
               x4 var5;
               if (var4.n5() == null) {
                  var5 = new x4(null, "");
                  var5.n5(true);
               } else {
                  var5 = new x4(null, var4.n5());
                  var5.n5(var0.u3().n5());
               }

               var1.addItem(var5);
            }
         } else {
            int var10 = var2 - 1;
            int var9 = 0;
            Object var8 = ((ChartCategory)var0.get_Item(0)).k5().n5(var10);

            for (int var6 = 0; var6 < var0.size(); var6++) {
               Object var7 = ((ChartCategory)var0.get_Item(var6)).k5().n5(var10);
               if (var7 != null && (var8 == null || !com.aspose.slides.ms.System.d1.a6(var8.toString(), var7.toString())) && !"".equals(var7.toString())) {
                  var1.addItem(new x4(var0, null, var10 - 1, var9, var6));
                  var8 = var7;
                  var9 = var6;
               }
            }

            var1.addItem(new x4(var0, null, var10 - 1, var9, var0.size()));
         }
      }
   }

   private static void l6(IChartCategoryCollection var0, List<x4> var1, Chart var2) {
      x4[] var3 = new x4[var0.getGroupingLevelCount()];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         for (int var5 = var0.getGroupingLevelCount() - 1; var5 >= 0; var5--) {
            int var6 = var0.getGroupingLevelCount() - 1 - var5;
            String var7 = null;
            Object var8 = null;
            if (var0.get_Item(var4).getGroupingLevels() == null) {
               ChartCategory var9 = (ChartCategory)var0.get_Item(var4);
               var8 = var9.getValue();
               if (var9.getUseCell()) {
                  var7 = ((ChartDataCell)var9.getAsCell()).n5(true);
               }
            } else {
               ChartCategory var12 = (ChartCategory)var0.get_Item(var4);
               ChartDataCell var10 = (ChartDataCell)var12.getGroupingLevels().get_Item(var5);
               if (var10 == null) {
                  continue;
               }

               var8 = var10.getValue();
               var7 = var10.n5(true);
            }

            if ((
                  var2.getChartData().getSeries().get_Item(0).getType() != 74 && var2.getChartData().getSeries().get_Item(0).getType() != 75
                     || var3[var6] == null
                     || var3[var6].l6() != var8
                     || var6 == var0.getGroupingLevelCount() - 1
               )
               && (var3[var6] == null || var8 != null || var6 == var0.getGroupingLevelCount() - 1)) {
               x4 var13;
               if (var6 == 0) {
                  Object var14 = var8;
                  if (var14 == null) {
                     var14 = "";
                  }

                  var13 = new x4(null, var14);
                  var1.addItem(var13);
               } else {
                  if (var3[var6 - 1] == null) {
                     throw new InvalidOperationException(
                        com.aspose.slides.ms.System.d1.n5(new Object[]{"Possibly the grouping level value has been used in place of category value: ", var8, "."})
                     );
                  }

                  var13 = new x4(var3[var6 - 1], var8);
                  var3[var6 - 1].h0().addItem(var13);
               }

               var13.n5(var7);
               if (var8 == null) {
                  var13.n5(true);
               }

               for (int var15 = var6; var15 < var0.getGroupingLevelCount(); var15++) {
                  var3[var15] = null;
               }

               var3[var6] = var13;
            }
         }
      }
   }

   final void u9() {
      boolean var1 = !com.aspose.slides.internal.v6g.k5.l6(this.d2(), r1c.class);
      float var2 = l6o.n5(this.d5(), this.d2());
      this.e2 = new j9e(this, var2, var1);
   }

   public final void h0() {
      this.e2.n5();
   }

   final j9e c8() {
      if (this.e2 == null) {
         throw new InvalidOperationException("3D Renderer for Charts is not initialized");
      } else {
         return this.e2;
      }
   }

   final g3b t2() {
      return this.l6;
   }

   final a8e s7() {
      return this.k5;
   }

   final b9y x8() {
      return this.u3;
   }

   final Chart n3() {
      return this.a6;
   }

   final List<g3y> y4() {
      return this.x8;
   }

   final List<g3y> e2() {
      return this.n3;
   }

   final List<g3y> t9() {
      return this.y4;
   }

   final g3y z1() {
      return this.n3.size() > 0 ? this.n3.get_Item(0) : null;
   }

   final g3y t4() {
      return this.y4.size() > 0 ? this.y4.get_Item(0) : null;
   }

   final l5 q0() {
      return this.u9;
   }

   final l5 z3() {
      return this.h0;
   }

   final l5 m1() {
      return this.c8;
   }

   final l5 k7() {
      return this.t2;
   }

   final l5 m3() {
      return this.s7;
   }

   final boolean z8() {
      return this.k7;
   }

   final void l6(boolean var1) {
      this.k7 = var1;
   }

   public final int j5() {
      return 100;
   }

   public final int w1() {
      return 100;
   }

   final float r4() {
      return this.m3;
   }

   final void n5(float var1) {
      this.m3 = var1;
   }

   public final float c4() {
      return this.n3().getWidth();
   }

   public final float y2() {
      return this.n3().getHeight();
   }

   public final float y1() {
      return this.a6.getX();
   }

   public final float a0() {
      return this.a6.getY();
   }

   public final e3 d2() {
      return this.z8;
   }

   public final void n5(e3 var1) {
      this.z8 = var1;
   }

   public final s5u d5() {
      return this.j5;
   }

   public final void n5(s5u var1) {
      this.j5 = var1;
   }

   static int u3(List<g3y> var0) {
      int var1 = 0;
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            g3y var3 = (g3y)var2.next();
            if (var3.c8().size() > var1) {
               var1 = var3.c8().size();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   final void n5(com.aspose.slides.internal.o9b.y1[] var1) {
      if (var1[0].x8() < this.y1()) {
         var1[0].k5(this.y1());
      }

      if (var1[0].n3() < this.a0()) {
         var1[0].u3(this.a0());
      }

      if (var1[0].h0() > this.y1() + this.c4()) {
         var1[0].k5(this.y1() + this.c4() - var1[0].s7());
      }

      if (var1[0].l6() > this.a0() + this.y2()) {
         var1[0].u3(this.a0() + this.y2() - var1[0].k5());
      }
   }

   final List<x4>[] a6(List<x4> var1) {
      List[] var2 = null;
      int var3 = h0(var1);
      if (var3 > 1) {
         var2 = new List[var3 - 1];

         for (int var4 = 0; var4 < var3 - 1; var4++) {
            var2[var4] = new List();
            n5(var1, var4, 0, var2[var4]);
         }
      }

      return var2;
   }

   static List<x4> u9(List<x4> var0) {
      List var1 = null;
      var1 = new List();
      int var2 = h0(var0);
      n5(var0, var2 - 1, 0, var1);
      return var1;
   }

   private static int h0(List<x4> var0) {
      if (var0.size() == 0) {
         return 0;
      }

      x4 var1 = (x4)var0.get_Item(0);
      int var2 = 1;

      while (var1.h0().size() > 0) {
         var2++;
         var1 = var1.h0().get_Item(0);
      }

      return var2;
   }

   private static void n5(List<x4> var0, int var1, int var2, List<x4> var3) {
      if (var1 == var2) {
         for (int var4 = 0; var4 < var0.size(); var4++) {
            x4 var5 = (x4)var0.get_Item(var4);
            var3.addItem(var5);
         }
      } else {
         for (int var6 = 0; var6 < var0.size(); var6++) {
            x4 var7 = (x4)var0.get_Item(var6);
            n5(var7.h0(), var1, var2 + 1, var3);
         }
      }
   }

   final int s3() {
      if (!u6p.n5(this.a6)) {
         if (ChartTypeCharacterizer.isChartTypeBar(this.a6.getType())) {
            if (this.a6.getRotation3D().getRotationX() < 0) {
               return 0;
            }

            if (this.a6.getRotation3D().getRotationX() > 44) {
               return 44;
            }
         }

         return this.a6.getRotation3D().getRotationX();
      } else {
         return 0;
      }
   }

   final int p8() {
      if (!u6p.n5(this.a6)) {
         if (ChartTypeCharacterizer.isChartTypeBar(this.a6.getType())) {
            if ((this.a6.getRotation3D().getRotationY() & 65535) < 0) {
               return 0;
            }

            if ((this.a6.getRotation3D().getRotationY() & 65535) > 44) {
               return 44;
            }
         }

         return this.a6.getRotation3D().getRotationY() & 65535;
      } else {
         return 0;
      }
   }

   final y9r f2() {
      return this.w1;
   }

   final void n5(y9r var1) {
      this.w1 = var1;
   }

   final y9r i1() {
      return this.r4;
   }

   final void l6(y9r var1) {
      this.r4 = var1;
   }

   final y9r e5() {
      return this.c4;
   }

   final void k5(y9r var1) {
      this.c4 = var1;
   }

   final y9r b3() {
      return this.y2;
   }

   final void u3(y9r var1) {
      this.y2 = var1;
   }

   final com.aspose.slides.internal.o9b.y1 o0() {
      return this.n3().getRotation3D().getRightAngleAxes()
         ? this.e5().k7()
         : new com.aspose.slides.internal.o9b.y1(this.n3().getX(), this.n3().getY(), this.n3().getWidth(), this.n3().getHeight());
   }

   public final float z7() {
      return this.y1;
   }

   public final void l6(float var1) {
      this.y1 = var1;
   }

   final void v4() {
      this.t1();
   }

   final void u6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.a6.getX(), this.a6.getY(), this.a6.getWidth(), this.a6.getHeight());
      if (this.n3().hasRoundedCorners()) {
         w5k.n5(
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            this,
            this.a5(),
            (LineFormat)this.a6.getLineFormat(),
            null,
            this.a6.getEffectFormat()
         );
      } else {
         w5k.n5(
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            this,
            var1.y4(),
            (LineFormat)this.a6.getLineFormat(),
            null,
            this.a6.getEffectFormat()
         );
      }
   }

   final void t1() {
      if (this.n3().hasRoundedCorners()) {
         w5k.n5(
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            this.h2().o8(),
            this,
            this.a5(),
            (LineFormat)this.a6.getLineFormat(),
            (FillFormat)this.a6.getFillFormat(),
            this.a6.getEffectFormat()
         );
      } else {
         com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.a6.getX(), this.a6.getY(), this.a6.getWidth(), this.a6.getHeight());
         w5k.l6(
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            this.h2().o8(),
            this,
            var1.y4(),
            (LineFormat)this.a6.getLineFormat(),
            (FillFormat)this.a6.getFillFormat(),
            this.a6.getEffectFormat()
         );
         w5k.n5(
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            this.h2().o8(),
            this,
            var1.y4(),
            (LineFormat)this.a6.getLineFormat(),
            (FillFormat)this.a6.getFillFormat(),
            this.a6.getEffectFormat()
         );
      }
   }

   private com.aspose.slides.internal.o9b.c8 h2() {
      com.aspose.slides.internal.o9b.c8 var1 = com.aspose.slides.internal.o9b.c8.u3.o8();
      if (this.a6.getStyle() + 1 >= 33 && this.a6.getStyle() + 1 <= 40) {
         this.a6.n5((byte)1).n5(var1);
      } else if (this.a6.getStyle() + 1 >= 41 && this.a6.getStyle() + 1 <= 48) {
         this.a6.n5((byte)0).n5(var1);
      }

      return var1;
   }

   final com.aspose.slides.internal.x4g.s7 a5() {
      float var1 = this.a6.getX();
      float var2 = this.a6.getY();
      float var3 = this.a6.getWidth();
      float var4 = this.a6.getHeight();
      float var5 = 13.0F;
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.l6(var1 + var5, var2, var1 + var3 - var5 * 2.0F, var2);
      var6.n5(var1 + var3 - var5 * 2.0F, var2, var5 * 2.0F, var5 * 2.0F, 270.0F, 90.0F);
      var6.l6(var1 + var3, var2 + var5, var1 + var3, var2 + var4 - var5 * 2.0F);
      var6.n5(var1 + var3 - var5 * 2.0F, var2 + var4 - var5 * 2.0F, var5 * 2.0F, var5 * 2.0F, 0.0F, 90.0F);
      var6.l6(var1 + var3 - var5 * 2.0F, var2 + var4, var1 + var5, var2 + var4);
      var6.n5(var1, var2 + var4 - var5 * 2.0F, var5 * 2.0F, var5 * 2.0F, 90.0F, 90.0F);
      var6.l6(var1, var2 + var4 - var5 * 2.0F, var1, var2 + var5);
      var6.n5(var1, var2, var5 * 2.0F, var5 * 2.0F, 180.0F, 90.0F);
      var6.n3();
      return var6;
   }
}
