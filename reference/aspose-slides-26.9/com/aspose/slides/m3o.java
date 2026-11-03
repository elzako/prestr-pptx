package com.aspose.slides;

class m3o extends o8r {
   m3o(l5 var1) {
      super(var1);
   }

   @Override
   protected void c8() {
      this.s7();
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u6();
      if (var1.n5() != 0.0F && var1.l6() != 0.0F) {
         this.x8(var1);
         this.h0();
         this.y4(var1);
         this.h0(var1);
         com.aspose.slides.internal.o9b.f2 var2 = this.c8(new z5(var1.n5() / this.n5.size(), var1.l6())).a6();
         this.u3(var2.k5() + this.q0());
         this.n5(var2.a6());
         this.a6(var1);
      }
   }

   final float w1() {
      int var1 = this.l6(this.n5().c8().getBaseUnitScale());
      return this.d2() / var1;
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = this.w1();
      boolean var3 = this.n5().u9() != 0 && p4.n5(this.n5().d2().n3());
      if (!((ChartCategoryCollection)this.n5().d2().n3().getChartData().getCategories()).h0() && this.n5().d2().n3().getChartData().getCategories().size() > 0) {
         this.n5().d2().l6(this.d2() - var2 * (this.l6.get_Item(0).c8().size() - 1));
      }

      for (int var4 = 0; var4 < this.n5.size(); var4++) {
         g8t var5 = this.n5.get_Item(var4);
         float var6 = this.n5().c8().getAxisBetweenCategories()
            ? this.n5((double)((Integer)var5.c8()).intValue()) + var2 / 2.0F
            : this.n5((double)((Integer)var5.c8()).intValue());
         if (this.n5().u9() == 0 || this.n5().u9() % 90 == 0) {
            var5.a6(var6 - var5.d2() / 2.0F);
         } else if (this.n5().u9() < 0) {
            if (this.n3().n5().c8().isPlotOrderReversed()) {
               var5.a6(var6 - var5.d2() + this.x8());
            } else {
               var5.a6(var6 - this.x8());
            }
         } else if (this.n3().n5().c8().isPlotOrderReversed()) {
            var5.a6(var6 - this.x8());
         } else {
            var5.a6(var6 - var5.d2() + this.x8());
         }

         if (this.z3() == 0) {
            if (var3) {
               var5.u9(this.q0() - ((u2w)this.y1().y1()).c8().d5());
            } else {
               var5.u9(this.q0());
            }
         } else {
            var5.u9(this.d5() - this.q0() - var5.d5());
         }
      }

      for (v6g var7 : this.a0()) {
         var7.t1();
      }
   }

   protected final void y4(z5 var1) {
      if (this.n5().c8().isVisible() && this.n5().c8().getTickLabelPosition() != 3) {
         if (this.n5().t2()) {
            this.l6(var1, this.n5().c8().getBaseUnitScale());
         } else {
            this.k5(var1, this.n5().c8().getBaseUnitScale());
         }
      }
   }

   protected final void l6(z5 var1, int var2) {
      float var3 = 0.0F;
      int var4 = this.m3();
      var3 = this.n5(var1, var4).n5();
      z5 var5 = new z5(this.n5().d2().c4(), this.n5().d2().y2());
      float var6 = this.t9(var5);
      if (this.n5().u9() != 0 && this.n5().u9() % 180 != 0) {
         if (this.n5().u9() % 90 == 0) {
            if (this.n5().l6().a6() > var3 * 1.14F) {
               if (this.n5().c8().isAutomaticMajorUnit() && this.n5().c8().isAutomaticMinorUnit()) {
                  int[] var12 = new int[]{var2};
                  this.n5(var12);
                  var2 = var12[0];
                  this.n5().n5(0);
                  this.l6(var1, var2);
               } else if (this.n5().c8().isAutomaticMajorUnit() && !this.n5().c8().isAutomaticMinorUnit()) {
                  int var7 = this.m3();
                  int var8 = com.aspose.slides.internal.v6g.k5.u3(var1.n5() / var6, 13);
                  int var9 = var7 % var8 == 0 ? var7 / var8 : var7 / var8 + 1;
                  this.u3(var9);
                  this.n5().n5(0);
                  this.l6(var1, var2);
               }
            }
         } else if (var6 * 0.885 > var3) {
            this.n5().n5(90);
            this.l6(var1, var2);
         }
      } else if (var6 * 1.2 > var3) {
         this.n5().n5(45);
         this.l6(var1, var2);
      }
   }

   private float t9(z5 var1) {
      float var2;
      if (this.n5().u9() == 0 || this.n5().u9() % 180 == 0) {
         var2 = this.e2(var1);
      } else if (this.n5().u9() % 90 == 0) {
         var2 = this.u9(var1).l6() * 1.3F;
      } else {
         var2 = this.r4();
      }

      return var2;
   }

   @Override
   protected z5 n5(z5 var1, int var2) {
      float var3 = (float)((double)var1.n5() / var2);
      float var4 = var1.l6() - this.q0();
      return new z5(var3, var4);
   }

   private float r4() {
      return (float)(this.n5().l6().e2() / com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.n5(this.n5().u9()) * Math.PI / 180.0));
   }

   protected final void k5(z5 var1, int var2) {
      z5 var3 = new z5(this.n5().d2().c4(), this.n5().d2().y2());
      int var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14);
      int var5 = p4.l6(this.n5().c8().getBaseUnitScale(), this.n5().m1(), com.aspose.slides.internal.v6g.k5.u3(this.n5().w1(), 14), var4, false);
      float var6 = com.aspose.slides.ms.System.q1.n5(this.n5((double)var5) - this.n5((double)var4));
      float var7 = this.t9(var3);
      if (this.n5().m3() && this.n5().z8()) {
         if ((this.n5().u9() == 0 || this.n5().u9() % 180 == 0) && var7 > var6 * 0.85F) {
            int[] var16 = new int[]{var2};
            this.n5(var16);
            var2 = var16[0];
            this.k5(var1, var2);
         } else if (this.n5().u9() % 90 == 0 && var7 > var6) {
            int[] var15 = new int[]{var2};
            this.n5(var15);
            var2 = var15[0];
            this.k5(var1, var2);
         } else if (var7 * 0.885 > var6) {
            int[] var14 = new int[]{var2};
            this.n5(var14);
            var2 = var14[0];
            this.k5(var1, var2);
         }
      } else if (!this.n5().m3() && this.n5().z8()) {
         this.n5()
            .u9(com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14));
         this.n5().a6(this.n5().m1());
      } else if (this.n5().m3() && !this.n5().z8() && var7 > var6) {
         int var8 = this.l6(this.n5().c8().getMinorUnitScale());
         int var9 = com.aspose.slides.internal.v6g.k5.u3(var1.n5() / var7, 13);
         int var10 = var8 % var9 == 0 ? var8 / var9 : var8 / var9 + 1;
         this.k5(var10);
         this.n5().u3(false);
      }
   }

   @Override
   float n5(double var1) {
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14);
      int var4 = this.l6(this.n5().c8().getBaseUnitScale());
      int var5 = p4.n5(
         this.n5().c8().getBaseUnitScale(),
         com.aspose.slides.internal.v6g.k5.u3(var1, 14),
         var3,
         com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14),
         false
      );
      float var6 = 0.0F;
      if (this.n5().c8().isPlotOrderReversed()) {
         var6 = this.d2() - (float)var5 / var4 * this.d2() - this.n5().d2().z7();
      } else {
         var6 = (float)var5 / var4 * this.d2() + this.n5().d2().z7();
      }

      return var6;
   }

   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return this.z1();
   }

   @Override
   protected void a6(z5 var1) {
      this.u3 = 0.0F;
      this.a6 = 0.0F;
      if (this.T_()) {
         g8t var2 = null;
         g8t var3 = null;
         float var4 = Float.NaN;
         float var5 = Float.NaN;
         float var6 = this.w1();
         var2 = this.n5.get_Item(0);
         var3 = this.n5.get_Item(this.n5.size() - 1);
         var4 = this.n5().c8().getAxisBetweenCategories() ? this.n5((double)((Integer)var2.c8()).intValue()) + var6 / 2.0F : this.n5((double)((Integer)var2.c8()).intValue());
         var5 = this.n5().c8().getAxisBetweenCategories() ? this.n5((double)((Integer)var3.c8()).intValue()) + var6 / 2.0F : this.n5((double)((Integer)var3.c8()).intValue());
         float var7 = 0.0F;
         float var8 = 0.0F;
         if (this.n5().u9() == 0) {
            var7 = var4 - var2.d2() / 2.0F;
            var8 = var5 + var3.d2() / 2.0F;
         } else if (this.n5().u9() % 90 != 0) {
            float var9 = this.n5().k5().a6();
            float var10 = com.aspose.slides.ms.System.q1.n5(this.n5().u9() / 90.0F * var9);
            if (this.n5().u9() > 0) {
               var7 = var4 + this.x8() - var2.d2();
               var8 = var5 + this.x8() + var10;
               var7 += var10;
            } else {
               var7 = var4 + this.x8() * -1.0F - var10;
               var8 = var5 - this.x8() + var3.d2();
               var8 -= var10;
            }
         }

         if (var7 < 0.0F) {
            this.u3 = var7 * -1.0F;
         }

         if (var8 > var1.n5()) {
            this.a6 = var8 - var1.n5();
         }

         if (ChartTypeCharacterizer.isChartTypeArea(this.n5().c8().getChart().getType())
            && this.n5().u9() == 0
            && com.aspose.slides.internal.v6g.k5.n5(this.n5().d2().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
            this.a6 = this.u3;
         }
      }
   }

   protected final float e2(z5 var1) {
      g8t var2 = this.n5(Double.valueOf(this.n5().q0()));
      float var3 = var2.a6(var1).l6();
      this.n5(var2);
      return var3;
   }
}
