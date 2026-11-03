package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

abstract class ValueAxisBase extends w3 {
   protected double h0;
   protected double c8;
   protected double t2;
   protected double s7;
   protected double x8;
   protected boolean n3 = false;
   protected boolean y4 = false;
   protected int e2 = 0;
   private boolean z1;
   protected boolean t9;

   protected ValueAxisBase(l5 context) {
      super(context);
   }

   public void c8(z5 var1) {
      this.w1();
      this.z8();
      if (this.x8 == 0.0) {
         throw new ArgumentException("Wrong step value, can't be equal 0");
      }

      this.m3();
      this.h0(var1);
      this.t2(var1);
      this.h0();
      if (this.n5().c8().isAutomaticMajorUnit()) {
         this.n5().h0(this.x8);
         this.n5().k5(true);
      }
   }

   @Override
   String u9() {
      if (this.l6.size() != 0 && this.n5().c8().isNumberFormatLinkedToSource()) {
         ChartSeries var1 = this.l6.get_Item(0).u9();
         if (ChartTypeCharacterizer.n5(var1.getType()) == 5) {
            if (!com.aspose.slides.internal.v6g.k5.l6(this, i2z.class) && !com.aspose.slides.internal.v6g.k5.l6(this, i2t.class)) {
               if (!"General".equals(var1.getNumberFormatOfXValues()) && !com.aspose.slides.ms.System.d1.n5(var1.getNumberFormatOfXValues())) {
                  return var1.getNumberFormatOfXValues();
               }
            } else {
               if (!com.aspose.slides.ms.System.d1.n5(this.n5().d2().y4().get_Item(var1.getOrder()).c8().get_Item(0).u3())) {
                  return this.n5().d2().y4().get_Item(var1.getOrder()).c8().get_Item(0).u3();
               }

               if (!"General".equals(var1.getNumberFormatOfYValues()) && !com.aspose.slides.ms.System.d1.n5(var1.getNumberFormatOfYValues())) {
                  return var1.getNumberFormatOfYValues();
               }
            }
         }

         if (ChartTypeCharacterizer.s7(var1.getType())) {
            return "0%";
         } else {
            return com.aspose.slides.ms.System.d1.n5(this.n5().c8().getNumberFormat())
                  && this.n5().c8().isNumberFormatLinkedToSource()
                  && com.aspose.slides.ms.System.d1.t2(this.l6.get_Item(0).c8().get_Item(0).a6(), com.aspose.slides.internal.x7n.l6.u3().e2().q0())
               ? this.l6.get_Item(0).c8().get_Item(0).a6()
               : this.n5().c8().getNumberFormat();
         }
      } else {
         return this.n5().c8().getNumberFormat();
      }
   }

   protected abstract void m3();

   protected abstract void z8();

   protected abstract void h0(z5 var1);

   @Override
   protected com.aspose.slides.internal.o9b.f2 u9(z5 var1) {
      if (this.n5().c8().isVisible() && this.n5().c8().getTickLabelPosition() != 3) {
         float var2 = 0.0F;
         float var3 = 0.0F;

         for (int var4 = 0; var4 < this.n5.size(); var4 += this.n5().r4()) {
            g8t var5 = this.n5.get_Item(var4);
            d2k var6 = var5.u9(var1).u3();
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

   private void j5() {
      if (this.l6.isEmpty() || ChartTypeCharacterizer.isChartTypeBubble(this.l6.get_Item(0).u9().getType())) {
         if (!this.n5().c8().isLogarithmic()) {
            if (this.n5().c8().isAutomaticMaxValue() && this.c8 > 0.0) {
               this.c8 = this.c8 + this.c8 * 0.109F;
            }

            if (this.n5().c8().isAutomaticMinValue() && this.h0 < 0.0) {
               this.h0 = this.h0 + this.h0 * 0.109F;
            } else if (this.n5().c8().isAutomaticMinValue() && this.h0 == 0.0) {
               this.h0 = -1.0E-4F;
            }
         }
      }
   }

   private void f0() {
      if (!this.n5().c8().isAutomaticMajorUnit() && this.c8 / this.n5().c8().getMajorUnit() > 500.0) {
         this.c8 *= 1.05F;
      }
   }

   private void t2(z5 var1) {
      if (this.l6.isEmpty() || ChartTypeCharacterizer.isChartTypeBubble(this.l6.get_Item(0).u9().getType())) {
         if (!this.n5().c8().isLogarithmic()) {
            if (this.n5().c8().isAutomaticMinValue() || !this.n5().c8().isAutomaticMaxValue()) {
               double var2 = 0.0;
               double var4 = 0.0;
               double[] var6 = new double[]{0.0};
               double[] var7 = new double[]{0.0};
               com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), u2w.class).h0().n5(this, var6, var7);
               var2 = var6[0];
               var4 = var7[0];
               if (this.n5().c8().isAutomaticMinValue() && var2 > 0.0) {
                  double var8 = var2 / (var4 - var2);
                  if (var8 <= 0.197) {
                     this.t2 = this.t2 - this.x8;
                     this.n5(Double.valueOf(this.t2));
                  }
               }

               if (this.n5().c8().isAutomaticMaxValue() && var4 < 0.0) {
                  double var13 = com.aspose.slides.ms.System.q1.n5(var4) / (com.aspose.slides.ms.System.q1.n5(var2) - com.aspose.slides.ms.System.q1.n5(var4));
                  if (var13 <= 0.197) {
                     this.s7 = this.s7 - this.x8;
                     g8t var10 = new g8t(this.s7, this);
                     this.n5.insertItem(0, var10);
                     this.n5((v6g)var10);
                  }
               }
            }
         }
      }
   }

   protected final void w1() {
      double[] var1 = new double[]{this.h0};
      double[] var2 = new double[]{this.c8};
      com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), u2w.class).h0().n5(this, var1, var2);
      this.h0 = var1[0];
      this.c8 = var2[0];
      this.j5();
      this.f0();
      if (this.n5().c8().isLogarithmic()) {
         if (com.aspose.slides.ms.System.d2.k5(this.h0)) {
            this.h0 = 0.0;
         }

         if (this.h0 > 1.0) {
            this.h0 = 0.0;
         }
      }

      this.s7 = this.c8;
      this.t2 = this.h0;
      this.z1 = this.c8 == 0.0 && this.h0 == 0.0;
      if (!this.n5().c8().isAutomaticMaxValue()) {
         this.s7 = this.n5().c8().isLogarithmic() ? this.n5().n5(this.n5().c8().getMaxValue()) : this.n5().c8().getMaxValue();
      }

      if (!this.n5().c8().isAutomaticMinValue()) {
         this.t2 = this.n5().c8().isLogarithmic() ? this.n5().n5(this.n5().c8().getMinValue()) : this.n5().c8().getMinValue();
      }

      if (this.t2 == 0.0 && this.s7 == 0.0) {
         if (!this.n5().c8().isAutomaticMaxValue() && this.n5().c8().isAutomaticMinValue()) {
            this.t2--;
            this.h0 = this.t2 + (this.s7 - this.t2) / 10.0;
         } else {
            this.s7++;
            this.c8 = this.s7 - (this.s7 - this.t2) / 10.0;
         }
      } else if (this.h0 == this.c8) {
         if (!this.n5().c8().isAutomaticMaxValue() && this.n5().c8().isAutomaticMinValue()) {
            this.t2 = this.c8 < 0.0 ? this.c8 - 1.0 : 0.0;
            this.h0 = this.t2;
         } else if (this.n5().c8().isAutomaticMaxValue() && !this.n5().c8().isAutomaticMinValue()) {
            this.s7 = this.h0 < 0.0 ? 0.0 : this.h0 + 1.0;
            this.c8 = this.s7;
         }
      } else if (this.t2 > this.s7) {
         if (this.n5().c8().isAutomaticMinValue()) {
            this.t2--;
            this.h0 = this.t2 + (this.s7 - this.t2) / 10.0;
         } else if (this.n5().c8().isAutomaticMaxValue()) {
            this.s7++;
            this.c8 = this.s7 - (this.s7 - this.t2) / 10.0;
         }
      }

      if (this.t2 > this.s7 && this.n5().c8().isAutomaticMaxValue() && !this.n5().c8().isAutomaticMinValue()) {
         if (this.z1) {
            this.c8 = this.t2;
            this.h0 = this.t2;
            this.s7 = this.t2 * 2.0;
            this.t2 = 0.0;
            this.t9 = true;
         } else {
            this.s7 = this.t2 + this.c8 - this.h0;
            this.c8 = this.s7;
            this.h0 = this.t2;
         }
      }
   }

   protected final boolean r4() {
      return this.t9;
   }

   protected final double c4() {
      return !this.n5().c8().isAutomaticMaxValue() && !this.r4() ? this.n5().c8().getMaxValue() : this.s7;
   }

   protected final double a5() {
      return !this.n5().c8().isAutomaticMinValue() && !this.r4() ? this.n5().c8().getMinValue() : this.t2;
   }

   @Override
   protected void V_() {
      this.n5().c8().l6(this.h2());
      this.n5().c8().k5(this.v0());
      this.n5().c8().u3(this.n5().w1());
      this.n5().c8().a6(this.n5().j5());
   }

   public final double h2() {
      return this.s7;
   }

   public final double v0() {
      return this.t2;
   }
}
