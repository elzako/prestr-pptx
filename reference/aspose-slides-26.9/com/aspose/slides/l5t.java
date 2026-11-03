package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class l5t extends ValueAxisBase {
   l5t(l5 var1) {
      super(var1);
   }

   @Override
   protected void m3() {
      this.n5.clear();
      this.u6();

      double var1;
      for (var1 = this.t2; var1 < this.s7; var1 += this.x8) {
         this.n5(Double.valueOf(this.n5().l6(var1)));
      }

      this.n5(Double.valueOf(com.aspose.slides.ms.System.q1.n5((double)(this.n5().l6(this.s7)), 10)));
      if (com.aspose.slides.ms.System.q1.n5((double)(var1), 4) > com.aspose.slides.ms.System.q1.n5((double)(this.s7), 4)) {
         this.n5.get_Item(this.n5.size() - 1).l6(false);
      }
   }

   @Override
   protected void z8() {
      this.n3 = this.n5().c8().isAutomaticMinValue();
      this.y4 = this.n5().c8().isAutomaticMaxValue();
      this.e2 = 1;
      this.x8 = 1.0;
      if (!this.n5().c8().isAutomaticMajorUnit()) {
         this.x8 = com.aspose.slides.ms.System.q1.l6(this.n5().n5(this.n5().c8().getMajorUnit()), 1.0);
      }

      this.t2 = this.k5(this.t2);
      this.s7 = this.l6(this.s7);
      if (this.n5().c8().isAutomaticMaxValue() && this.n5().c8().isAutomaticMinValue()) {
         this.e2 = 1;
      } else if (!this.n5().c8().isAutomaticMaxValue() && this.n5().c8().isAutomaticMinValue()) {
         this.e2 = 1;
         this.s7 = com.aspose.slides.ms.System.q1.n5((double)(this.n5().n5(this.n5().c8().getMaxValue())), 10);
      } else if (this.n5().c8().isAutomaticMaxValue() && !this.n5().c8().isAutomaticMinValue()) {
         this.e2 = 1;
         this.t2 = com.aspose.slides.ms.System.q1.n5((double)(this.n5().n5(this.n5().c8().getMinValue())), 10);
      } else {
         this.t2 = this.n5().n5(this.n5().c8().getMinValue());
         this.s7 = this.n5().n5(this.n5().c8().getMaxValue());
      }

      while ((this.s7 - this.t2) / this.x8 > 1000.0) {
         this.x8 *= 2.0;
      }
   }

   private double l6(double var1) {
      boolean var3 = var1 >= 0.0;
      var1 = com.aspose.slides.ms.System.q1.n5(var1);
      if (var3) {
         double var7 = g6z.l6(var1);
         if (var7 != var1) {
            var7++;
         }

         return var7;
      } else {
         double var4 = g6z.l6(var1);
         return -var4;
      }
   }

   private double k5(double var1) {
      boolean var3 = var1 >= 0.0;
      var1 = com.aspose.slides.ms.System.q1.n5(var1);
      if (!var3) {
         double var4 = g6z.l6(var1);
         if (var4 != var1) {
            var4++;
         }

         return -var4;
      } else {
         return g6z.l6(var1);
      }
   }

   @Override
   public float y4() {
      return this.n5(this.e2());
   }

   @Override
   public double e2() {
      double var1;
      if (this.n5().c8().getCrossAt() == 0.0F && this.t2 > 0.0 && this.t2 < 1.0) {
         var1 = this.n5().n5(1.0);
      } else {
         var1 = this.n5().n5((double)this.n5().c8().getCrossAt());
      }

      double var3 = this.n5().n5(this.s7);
      double var5 = this.n5().n5(this.t2);
      if (this.n5().c8().getCrossType() == 1) {
         var1 = var3;
      }

      if (var1 > var3) {
         var1 = var3;
      }

      if (var1 < var5) {
         var1 = var5;
      }

      if (this.n5().c8().getCrossType() == 0 && this.j5()) {
         var1 = var3;
      }

      return var1;
   }

   private boolean j5() {
      List$Enumerator var1 = this.l6.iterator();

      try {
         while (var1.hasNext()) {
            g3y var2 = (g3y)var1.next();
            if (ChartTypeCharacterizer.s7(var2.u9().getType())) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return false;
   }

   @Override
   public List<Float> m1() {
      List var1 = new List();
      double var2 = this.n5().n5(this.h2());
      double var4 = this.n5().n5(this.v0());
      float var6 = this.a6() ? this.d5() : this.d2();

      for (int var7 = 0; var7 < this.n5.size(); var7++) {
         if (this.n5.get_Item(var7).T_()) {
            double var8 = this.n5().n5(com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(var7).h0(), double.class));
            if ((this.n5().c8().isPlotOrderReversed() || this.a6()) && (!this.n5().c8().isPlotOrderReversed() || !this.a6())) {
               var1.addItem((float)((var2 - var8) / (var2 - var4) * var6));
            } else {
               var1.addItem(var6 - (float)((var2 - var8) / (var2 - var4) * var6));
            }
         }
      }

      return var1;
   }

   @Override
   public List<Float> k7() {
      List var1 = new List();
      double var2 = this.n5().n5(this.h2());
      double var4 = this.n5().n5(this.v0());
      float var6 = this.a6() ? this.d5() : this.d2();
      double var7 = this.v0() * 2.0;

      for (double var9 = this.v0(); var7 < this.h2(); var7 = var9 * 2.0) {
         while (var7 < var9 * this.n5().c8().getLogBase() && var7 < this.h2()) {
            double var11 = this.n5().n5(var7);
            var7 += var9;
            if ((this.n5().c8().isPlotOrderReversed() || this.a6()) && (!this.n5().c8().isPlotOrderReversed() || !this.a6())) {
               var1.addItem((float)((var2 - var11) / (var2 - var4) * var6));
            } else {
               var1.addItem(var6 - (float)((var2 - var11) / (var2 - var4) * var6));
            }
         }

         var9 *= this.n5().c8().getLogBase();
      }

      return var1;
   }
}
