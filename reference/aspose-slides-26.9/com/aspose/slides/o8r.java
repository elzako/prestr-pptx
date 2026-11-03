package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class o8r extends w3 {
   protected o8r(l5 var1) {
      super(var1);
      if (this.n5().c8().isAutomaticMajorUnit()) {
         this.n5().h0(1.0);
         this.n5().k5(true);
      }

      if (this.n5().c8().isAutomaticMinorUnit()) {
         this.n5().u9(1.0);
         this.n5().u3(true);
      }
   }

   public void h0(z5 var1) {
      this.n5.clear();
      if (this.n5().c8().isVisible() && this.n5().c8().getTickLabelPosition() != 3) {
         int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14);
         int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14);
         if (this.n5().c8().getBaseUnitScale() == 2) {
            com.aspose.slides.ms.System.j5 var4 = g8t.n5(com.aspose.slides.ms.System.z3.h0(var2), false).m3();
            var4 = new com.aspose.slides.ms.System.j5(var4.e2(), var4.c8(), 1);
            var2 = com.aspose.slides.internal.v6g.k5.u3(var4.t9(), 14);
         }

         int var7 = var2;
         if (this.n5().c8().getBaseUnitScale() == 3) {
            int var5 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var7, false);
            if (var5 > var3) {
               this.n5(Integer.valueOf(var3));
               return;
            }
         }

         this.n5(Integer.valueOf(var2));

         for (int var8 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var7, false);
            var3 - var8 >= 0;
            var8 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var8, false)
         ) {
            this.n5(Integer.valueOf(var8));
         }
      }
   }

   protected final int m3() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14);
      if (this.n5().m3() && !this.n5().z8() && this.n5().w1() == 0.0) {
         return g6z.n5((float)(p4.n5(this.n5().k7(), var2, var1, false) / this.n5().j5()));
      }

      int var3 = var1;
      int var4 = 1;

      for (int var5 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var3, false);
         var2 - var5 >= 0;
         var5 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var5, false)
      ) {
         var4++;
      }

      return var4;
   }

   @Override
   protected com.aspose.slides.internal.o9b.f2 u9(z5 var1) {
      com.aspose.slides.internal.o9b.f2 var2 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      if (!this.n5.isEmpty()) {
         for (int var3 = 0; var3 < this.n5.size(); var3++) {
            g8t var4 = this.n5.get_Item(var3);
            g8t var5 = this.n5(var4.h0());
            d2k var6 = var5.k5(var1).u3();
            this.n5(var5);
            if (var6.n5 > var2.l6()) {
               var2.n5(var6.n5);
            }

            if (var6.l6 > var2.k5()) {
               var2.l6(var6.l6);
            }
         }
      } else {
         g8t var7 = this.n5(Double.valueOf(this.n5().z3()));
         d2k var8 = var7.k5(var1).u3();
         this.n5(var7);
         var2 = new com.aspose.slides.internal.o9b.f2(var8.n5, var8.l6);
      }

      return var2;
   }

   protected final com.aspose.slides.internal.o9b.f2 c8(z5 var1) {
      com.aspose.slides.internal.o9b.f2 var2 = this.t2(var1).a6();
      if (com.aspose.slides.internal.v6g.k5.l6(this, m3o.class) && this.n5().u9() != 0 && var2.k5() > var1.l6()) {
         List$Enumerator var3 = this.n5.iterator();

         try {
            while (var3.hasNext()) {
               g8t var4 = (g8t)var3.next();
               this.n5(var4, var1);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         this.t2(var1).l6(var2);
      }

      return var2;
   }

   protected final com.aspose.slides.internal.o9b.f2 t2(z5 var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      if (this.n5().c8().isPlotOrderReversed()) {
         this.n5.reverse();
      }

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

      if (this.n5().c8().isPlotOrderReversed()) {
         this.n5.reverse();
      }

      return new com.aspose.slides.internal.o9b.f2(var2, var3);
   }

   private void n5(g8t var1, z5 var2) {
      String var3 = var1.s7();
      d2k var4 = var1.k5(var2).u3();
      if (!(var4.l6 <= var2.l6() / 2.0F)) {
         while (var4.l6 > var2.l6() / 2.0F && var3.length() > 1) {
            var3 = com.aspose.slides.ms.System.d1.l6(var3, 0, var3.length() - 1);
            g8t var5 = new g8t(com.aspose.slides.ms.System.d1.n5(new Object[]{var3, '…'}), this);
            var5.n5(true);
            this.n5((v6g)var5);
            var5.k5(var2).n5(var4);
            this.l6(var5);
         }

         var1.n5(true);
         var1.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{var3, '…'}));
      }
   }

   final float s7(z5 var1) {
      g8t var2 = this.n5(Double.valueOf(this.n5().z3()));
      float var3 = var2.a6(var1).k5();
      this.n5(var2);
      return var3;
   }

   final int l6(int var1) {
      int var2;
      if (!this.n5().c8().getAxisBetweenCategories() && !this.n5().d2().n3().hasDataTable()) {
         var2 = p4.n5(
            var1,
            com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14),
            com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14),
            com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14),
            false
         );
         if (var2 == 0) {
            var2 = 1;
         }
      } else {
         var2 = p4.n5(
               var1,
               com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14),
               com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14),
               com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14),
               false
            )
            + 1;
      }

      if (!((ChartCategoryCollection)this.n5().d2().n3().getChartData().getCategories()).h0()) {
         var2 = (int)com.aspose.slides.internal.c8e.k5.n5(
            (double)var2 - com.aspose.slides.internal.v6g.k5.u3(this.n5().c8().getMinValue(), 14), 1.0, 2.147483647E9
         );
      }

      return var2;
   }

   protected final int z8() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14);
      if (this.n5().a0() || this.n5().d2().n3().hasDataTable()) {
         var1 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().c8().getBaseUnitScale(), 1, var1, false);
      }

      return var1;
   }

   @Override
   public float y4() {
      return this.n5(this.e2());
   }

   @Override
   public double e2() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14);
      int var2 = p4.n5(this.n5().c8().getBaseUnitScale(), com.aspose.slides.internal.v6g.k5.u3(this.n5().t4(), 13), false);
      if (this.n5().c8().getCrossType() == 1) {
         var2 = this.z8();
      }

      if (var2 > this.z8()) {
         var2 = this.z8();
      } else if (var2 < var1) {
         var2 = var1;
      }

      this.n5().n5((float)var2);
      return var2;
   }

   public final void j5() {
      if (this.n5().m3() && this.n5().z8()) {
         this.n5().u3(this.n5().c8().getBaseUnitScale());
         this.n5().a6(1);
         this.n5().h0(1.0);
         this.n5().u9(1.0);
         this.n5().k5(true);
         this.n5().u3(true);
      }

      if (!this.n5().m3() && this.n5().z8()) {
         this.n5()
            .u9(com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14));
         this.n5().u3(true);
         this.n5().a6(this.n5().m1());
      }
   }

   private boolean w1() {
      if (this.l6.size() > 1) {
         for (int var1 = 1; var1 < this.l6.size(); var1++) {
            if (this.l6.get_Item(var1 - 1).c8().size() != this.l6.get_Item(var1).c8().size()) {
               return true;
            }
         }
      }

      return false;
   }

   private double r4() {
      double var1 = -Double.MAX_VALUE;
      List$Enumerator var3 = this.l6.iterator();

      try {
         while (var3.hasNext()) {
            g3y var4 = (g3y)var3.next();
            List$Enumerator var5 = var4.c8().iterator();

            try {
               while (var5.hasNext()) {
                  t9z var6 = (t9z)var5.next();
                  if (var1 < var6.l6()) {
                     var1 = var6.l6();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   protected final void x8(z5 var1) {
      int var2 = n1g.u3(this.l6);
      List var3 = this.n5().y4() == 0 ? this.n5().d2().l6() : this.n5().d2().k5();
      boolean var4 = var3.size() == 0;
      List var5 = new List();

      for (int var6 = 0; var6 < var3.size(); var6++) {
         x4 var7 = (x4)var3.get_Item(var6);
         if (var7.l6() != null && com.aspose.slides.ms.System.d1.a6(var7.l6().toString(), "#N/A")) {
            var3.removeAt(var6);
            var6--;
         } else {
            int var8 = o9b.n5(var7.l6(), false);
            if (var8 >= 0) {
               var5.addItem(var8);
            } else if (!var7.u3()) {
               var4 = true;
               var5.clear();
               var3.clear();
               break;
            }
         }
      }

      if (var4) {
         for (int var13 = 1; var13 <= var2; var13++) {
            x4 var15 = new x4(null, var13);
            var3.addItem(var15);
            var5.addItem(var13);
         }
      }

      List var14 = new List(var5);
      var14.sort();
      if (this.n5().c8().isAutomaticMaxValue()) {
         if (this.w1()) {
            this.n5().a6(this.r4());
         } else {
            this.n5().a6((double)((Integer)var14.get_Item(var14.size() - 1)).intValue());
         }
      }

      if (this.n5().c8().isAutomaticMinValue() || !((ChartCategoryCollection)this.y2().u3().n3().getChartData().getCategories()).h0()) {
         this.n5().u3((double)((Integer)var14.get_Item(0)).intValue());
      }

      if (this.n5().c8().u3() && this.n5().c8().getBaseUnitScale() == 0) {
         g3y var16 = this.l6.get_Item(0);
         com.aspose.slides.ms.System.j5 var17 = p4.n5(this.n5().q0(), false).m3();
         com.aspose.slides.ms.System.j5 var9 = p4.n5(this.n5().z3(), false).m3();
         int var10 = com.aspose.slides.ms.System.j5.t2(var9, var17).n5();
         double var11 = (float)var10 / (var16.c8().size() - 1);
         if (var11 >= 365.0) {
            this.n5().c8().setBaseUnitScale(3);
         } else if (var11 >= 30.0) {
            this.n5().c8().setBaseUnitScale(2);
         } else if (var11 >= 1.0 && this.n5().c8().getBaseUnitScale() == 0) {
            this.n5().c8().setBaseUnitScale(1);
         }
      }
   }

   protected abstract z5 n5(z5 var1, int var2);

   protected final void n5(int[] var1) {
      switch (var1[0]) {
         case 1:
            if (this.n5().w1() == 1.0) {
               this.n5().h0(2.0);
            } else if (this.n5().w1() == 2.0) {
               this.n5().h0(7.0);
            } else {
               this.n5().h0(1.0);
               var1[0] = 2;
               this.n5().u3(2);
               this.n5().a6(2);
            }
            break;
         case 2:
            if (this.n5().w1() == 1.0) {
               this.n5().h0(2.0);
            } else if (this.n5().w1() == 2.0) {
               this.n5().h0(3.0);
            } else if (!this.n5().t2() && this.n5().w1() >= 3.0 && this.n5().w1() <= 6.0) {
               this.n5().h0(this.n5().w1() + 1.0);
            } else {
               this.n5().h0(1.0);
               var1[0] = 3;
               this.n5().u3(3);
               this.n5().a6(3);
            }
            break;
         case 3:
            this.n5().h0(this.n5().w1() + 1.0);
      }

      this.n5().k5(true);
   }

   protected final void k5(int var1) {
      if (this.n5().c8().getBaseUnitScale() == 1) {
         if (var1 <= 2) {
            this.n5().h0((double)var1);
            this.n5().u9(1.0);
            this.n5().u3(this.n5().c8().getBaseUnitScale());
            this.n5().a6(this.n5().c8().getBaseUnitScale());
         } else if (var1 > 2 && var1 <= 7) {
            this.n5().h0(7.0);
            this.n5().u9(1.0);
            this.n5().u3(this.n5().c8().getBaseUnitScale());
            this.n5().a6(this.n5().c8().getBaseUnitScale());
         } else if (var1 > 7 && var1 <= 14) {
            this.n5().h0(14.0);
            this.n5().u9(7.0);
            this.n5().u3(this.n5().c8().getBaseUnitScale());
            this.n5().a6(this.n5().c8().getBaseUnitScale());
         } else if (var1 > 14 && var1 <= 30) {
            this.n5().h0(1.0);
            this.n5().u9(1.0);
            this.n5().u3(2);
            this.n5().a6(2);
         } else if (var1 > 30 && var1 <= 360) {
            this.n5().h0(com.aspose.slides.ms.System.q1.l6((double)(var1 / 30.0F)));
            this.n5()
               .u9(com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14));
            this.n5().u3(2);
            this.n5().a6(2);
         } else {
            this.n5().h0((double)(var1 % 360 == 0 ? var1 / 360 : var1 / 360 + 1));
            this.n5()
               .u9(com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14));
            this.n5().u3(3);
            this.n5().a6(3);
         }
      } else if (this.n5().c8().getBaseUnitScale() == 2) {
         this.n5().h0((double)var1);
         this.n5()
            .u9(com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14));
         this.n5().u3(2);
         this.n5().a6(2);
      } else {
         this.n5().h0((double)var1);
         this.n5()
            .u9(com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14));
         this.n5().u3(3);
         this.n5().a6(3);
      }

      this.n5().k5(true);
      this.n5().u3(true);
   }

   protected final void u3(int var1) {
      if (this.n5().c8().getBaseUnitScale() == 1) {
         if (var1 <= 2) {
            if (this.n5().k7() > this.n5().c8().getBaseUnitScale()) {
               this.n5().u3(this.n5().k7());
               this.n5().h0(this.n5().j5());
            } else {
               this.n5().u3(this.n5().c8().getBaseUnitScale());
               this.n5().h0((double)var1);
               if (this.n5().w1() < this.n5().j5()) {
                  this.n5().h0(this.n5().j5());
               }
            }
         } else if (var1 > 2 && var1 <= 7) {
            if (this.n5().k7() > this.n5().c8().getBaseUnitScale()) {
               this.n5().u3(this.n5().k7());
               this.n5().h0(this.n5().j5());
            } else {
               this.n5().u3(this.n5().c8().getBaseUnitScale());
               this.n5().h0(7.0);
               if (this.n5().w1() < this.n5().j5()) {
                  this.n5().h0(this.n5().j5());
               }
            }
         } else if (var1 > 7 && var1 <= 30) {
            if (this.n5().k7() == 3) {
               this.n5().u3(this.n5().k7());
               this.n5().h0(this.n5().j5());
            } else {
               this.n5().u3(2);
               this.n5().h0(1.0);
               if (this.n5().w1() < this.n5().j5() && this.n5().k7() == 2) {
                  this.n5().h0(this.n5().j5());
               }
            }
         } else if (var1 > 30 && var1 <= 360) {
            if (this.n5().k7() == 3) {
               this.n5().u3(this.n5().k7());
               this.n5().h0(this.n5().j5());
            } else {
               this.n5().u3(2);
               this.n5().h0((double)(var1 % 30 == 0 ? var1 / 30 : var1 / 30 + 1));
               if (this.n5().w1() > 2.0) {
                  this.n5().u3(3);
                  this.n5().h0(1.0);
               }

               if (this.n5().w1() < this.n5().j5() && this.n5().k7() == 2 && this.n5().m1() == 2) {
                  this.n5().h0(this.n5().j5());
               }
            }
         } else {
            this.n5().h0((double)(var1 % 360 == 0 ? var1 / 360 : var1 / 360 + 1));
            this.n5().u3(3);
            if (this.n5().w1() < this.n5().j5() && this.n5().k7() == 3) {
               this.n5().h0(this.n5().j5());
            }
         }
      } else if (this.n5().c8().getBaseUnitScale() == 2) {
         if (var1 < 12) {
            if (this.n5().k7() == 2) {
               if (this.n5().j5() <= var1) {
                  this.n5().h0((double)var1);
                  this.n5().u3(2);
               } else {
                  this.n5().h0(this.n5().j5());
                  this.n5().u3(2);
               }
            } else {
               this.n5().h0(this.n5().j5());
               this.n5().u3(3);
            }
         } else {
            var1 = var1 % 12 == 0 ? var1 / 12 : var1 / 12 + 1;
            if (this.n5().k7() == 2) {
               this.n5().h0((double)var1);
               this.n5().u3(3);
            } else if (this.n5().j5() <= var1) {
               this.n5().h0((double)var1);
               this.n5().u3(3);
            } else {
               this.n5().h0(this.n5().j5());
               this.n5().u3(3);
            }
         }
      } else {
         if (this.n5().j5() <= var1) {
            this.n5().h0((double)var1);
         } else {
            this.n5().h0(this.n5().j5());
         }

         this.n5().u3(3);
      }

      this.n5().k5(true);
   }

   static double l6(Object var0) {
      double var1 = Double.NaN;
      if (var0 == null) {
         return var1;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, String.class)) {
         String var9 = var0.toString();
         if ("".equals(var9)) {
            return var1;
         }

         double var4 = 0.0;
         double[] var6 = new double[]{0.0};
         boolean var7 = com.aspose.slides.ms.System.d2.n5(var9, 111, com.aspose.slides.internal.x7n.l6.u3(), var6);
         var4 = var6[0];
         return var7 ? var4 : var1;
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)
            || com.aspose.slides.internal.v6g.k5.l6(var0, Integer.class)
            || com.aspose.slides.internal.v6g.k5.l6(var0, Boolean.class)) {
            return com.aspose.slides.ms.System.z3.n3(var0);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.ms.System.j5.class)) {
            com.aspose.slides.ms.System.j5 var3 = com.aspose.slides.internal.v6g.k5.u3(var0, com.aspose.slides.ms.System.j5.class).m3();
            return g6z.n5(var3.m3(), false);
         }

         try {
            return com.aspose.slides.ms.System.z3.a6(var0);
         } catch (RuntimeException var8) {
            com.aspose.slides.internal.n8e.v4.n5(var8);
            return var1;
         }
      }
   }

   @Override
   public List<Float> m1() {
      List var1 = new List();
      int var2 = this.l6(this.n5().c8().getBaseUnitScale());
      float var3 = this.a6() ? this.d5() : this.d2();
      double var4 = (double)var3 / var2;
      float var6 = this.n5().c8().isPlotOrderReversed() ? var3 : 0.0F;
      float var7 = this.n5().c8().isPlotOrderReversed() ? var3 : this.p8();

      for (int var8 = 0; var8 < this.n5.size(); var8++) {
         int var9 = com.aspose.slides.ms.System.z3.h0(this.n5.get_Item(var8).c8());
         if (this.n5().c8().isPlotOrderReversed()) {
            var7 -= var6;
         } else {
            var7 += var6;
         }

         int var10 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var9, false);
         var6 = (float)(var4 * p4.n5(this.n5().c8().getBaseUnitScale(), var10, var9, com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14), false));
         var1.addItem(var7);
      }

      return var1;
   }

   @Override
   public List<Float> k7() {
      List var1 = new List();
      int var2 = this.l6(this.n5().c8().getBaseUnitScale());
      float var3 = this.a6() ? this.d5() : this.d2();
      double var4 = (double)var3 / var2;
      float var6;
      if (this.n5().c8().isPlotOrderReversed()) {
         var6 = var3;
      } else {
         var6 = 0.0F;
      }

      int var7 = com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14);
      int var8 = p4.l6(
         this.n5().c8().getBaseUnitScale(),
         this.n5().m1(),
         com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14),
         com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14),
         false
      );

      do {
         boolean var9 = true;
         int var10 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().k7(), com.aspose.slides.internal.v6g.k5.u3(this.n5().j5(), 14), var7, false);
         if (var10 == var8) {
            var9 = false;
            var8 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var8, false);
         }

         if (var10 >= var8) {
            var8 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var8, false);
         }

         float var11 = (float)(var4 * p4.n5(this.n5().c8().getBaseUnitScale(), var10, var7, com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14), false));
         if (this.n5().c8().isPlotOrderReversed()) {
            var6 -= var11;
         } else {
            var6 += var11;
         }

         if (var9 && var6 >= 0.0F && var6 <= var3) {
            var1.addItem(var6);
         }

         var7 = var10;
      } while (var6 >= 0.0F && var6 <= var3);

      return var1;
   }

   @Override
   protected void V_() {
      this.n5().c8().u3(this.n5().w1());
      this.n5().c8().a6(this.n5().j5());
      this.n5().c8().n5(this.n5().m1());
      this.n5().c8().l6(this.n5().k7());
   }
}
