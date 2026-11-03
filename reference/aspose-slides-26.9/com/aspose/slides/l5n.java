package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class l5n extends u7 {
   l5n(l5 var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      if (this.n5().c4()) {
         this.n5().u9(1);
      }

      this.u6();
      if (!(var1.l6() <= 1.0F)) {
         this.u3(var1.l6());
         this.s7(var1);
         this.h0();
         com.aspose.slides.internal.o9b.f2 var2 = this.x8(var1).a6();
         this.j5();
         this.k5(var2.l6() + this.q0());
         this.n5(var2.a6());
         this.a6(var1);
         if (!this.l6.isEmpty() && !ChartTypeCharacterizer.u3(this.l6.get_Item(0).u9().getType())) {
            this.y4(var1);
         }
      }
   }

   private void y4(z5 var1) {
      this.w1().clear();
      if (this.n5().d2().u3() != null) {
         for (int var2 = 0; var2 < this.n5().d2().u3().length; var2++) {
            List var3 = new List();
            this.w1().addItem(var3);
            float var4 = 0.0F;
            z5 var5 = new z5(var1.n5(), var1.l6() / this.n5().d2().u3()[var2].size());

            for (int var6 = 0; var6 < this.n5().d2().u3()[var2].size(); var6++) {
               g8t var7 = new g8t(this.n5().d2().u3()[var2].get_Item(var6).l6(), this);
               var7.n5(90.0F);
               var7.n5(p4.n5(this.n5().d2().u3()[var2].get_Item(var6)));
               this.n5((v6g)var7);
               var3.addItem(var7);
               d2k var8 = var7.k5(var5).u3();
               if (var7.k5(var5).n5 > var4) {
                  var4 = var8.n5;
               }

               var7.n3(new z5(var8.n5, var8.l6));
            }

            if (!this.n5().c8().isPlotOrderReversed()) {
               var3.reverse();
            }

            this.k5(this.d2() + this.q0() + var4);
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = this.n5().k5().a6() / 2.0F;
      int var3 = 0;
      if (this.n5().c8().isPlotOrderReversed() || this.n5(80)) {
         var3 = this.n5().r4() - 1;
         this.n5.reverse();
      }

      while (var3 < this.n5.size()) {
         g8t var4 = this.n5.get_Item(var3);
         float var5;
         if (this.n5().a0()) {
            var5 = this.a5() * var3 + this.a5() / 2.0F;
         } else {
            var5 = this.a5() * var3;
         }

         float var6;
         if (this.n5().u9() == 0 || this.n5().u9() % 90 == 0) {
            var6 = var5 + var4.d5() / 2.0F;
         } else if (this.n5().u9() > 0) {
            var6 = var5 + var2;
         } else {
            var6 = var5 - var2 + var4.d5();
         }

         var4.u9(this.d5() - var6);
         var4.a6(this.z3() == 1 ? this.d2() - this.q0() - var4.d2() : this.q0());
         var3 += this.n5().r4();
      }

      this.h2();

      for (v6g var7 : this.a0()) {
         var7.t1();
      }
   }

   private void h2() {
      if (this.w1().size() != 0) {
         float var1 = this.d5() / this.n5.size();
         float var2 = this.z3() == 1 ? 0.0F : this.d2();
         List$Enumerator var3 = this.w1().iterator();

         try {
            while (var3.hasNext()) {
               List var4 = (List)var3.next();
               float var5 = 0.0F;
               float var6 = 0.0F;

               for (int var7 = 0; var7 < var4.size(); var7++) {
                  g8t var8 = (g8t)var4.get_Item(var7);
                  var6 = com.aspose.slides.ms.System.q1.n5((float)(var8.d2()), (float)(var6));
               }

               for (int var14 = 0; var14 < var4.size(); var14++) {
                  g8t var15 = (g8t)var4.get_Item(var14);
                  float var9 = var1 * var15.y4();
                  float var10 = var5 + var9 / 2.0F;
                  var5 += var9;
                  var15.u9(var10 - var15.d5() / 2.0F);
                  var15.a6(this.z3() == 1 ? var2 + var6 - var15.d2() : var2 - var15.d2());
               }

               var2 = this.z3() == 1 ? var2 + var6 + this.q0() : var2 - var6 - this.q0();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   protected final com.aspose.slides.internal.o9b.f2 x8(z5 var1) {
      if (this.n5().c8().isVisible() && this.n5().c8().getTickLabelPosition() != 3) {
         z5 var2 = this.t2(var1);
         com.aspose.slides.internal.o9b.f2 var3 = this.u9(var2).a6();
         if (!this.n5().c4()) {
            return this.u9(var1);
         } else if (this.n5().u9() != 0) {
            return this.u9(var1);
         } else if (!(var3.k5() - 2.0F > var2.l6())) {
            return var3;
         } else if (this.e2(var2)) {
            return this.x8(var1);
         } else if (this.z8() > 1) {
            this.n5().u9(this.n5().r4() + 1);
            return this.x8(var1);
         } else {
            return var3;
         }
      } else {
         return new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      }
   }

   private boolean e2(z5 var1) {
      boolean var2 = false;
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            g8t var4 = (g8t)var3.next();
            String var5 = var4.z1().l6().u3.n5(var1.n5(), var1.l6(), true);
            if (com.aspose.slides.ms.System.d1.c8(var5, var4.s7()) == -1) {
               var4.n5(var5);
               var2 = true;
               var4.n5(true);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   @Override
   protected z5 t2(z5 var1) {
      int var2 = this.m3();
      float var3 = var1.n5() * 0.51F - this.q0();
      float var4 = var1.l6();
      if (!com.aspose.slides.internal.v6g.k5.n5(this.n5().d2().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
         var3 = var1.n5() - this.q0();
      }

      if (var2 > 0) {
         var4 = var1.l6() / var2;
      }

      return new z5(var3, var4);
   }

   @Override
   protected void c8() {
      this.t2();
   }

   @Override
   protected void a6(z5 var1) {
      this.a6 = 0.0F;
      this.u3 = 0.0F;
   }

   final float a5() {
      return this.n5().a0() ? this.d5() / this.n5.size() : this.d5() / (this.n5.size() - 1);
   }

   @Override
   float n5(double var1) {
      byte var3 = 1;
      float var4;
      if (!this.n5().c8().isPlotOrderReversed()) {
         var4 = (float)((this.r4() - var1) / (this.r4() - var3) * this.d5());
      } else {
         var4 = (float)((var1 - var3) / (this.r4() - var3) * this.d5());
      }

      return var4;
   }

   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return this.t4();
   }

   @Override
   protected void l6() {
      super.l6();
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y2().p8(), this.y2().f2(), this.y2().d2(), this.y2().d5());
      f9 var2 = new f9(this.n5().d2());
      var2.n5(var1.y4());

      try {
         if (this.w1().size() == 0) {
            return;
         }

         float var3 = this.d5() / this.n5.size();
         float var4 = this.z3() == 1 ? 0.0F : this.d2();
         this.n5().n5(this.p8(), this.f2(), this.p8() + this.d2(), this.f2());
         List$Enumerator var5 = this.w1().iterator();

         try {
            while (var5.hasNext()) {
               List var6 = (List)var5.next();
               float var7 = this.f2();
               float var8 = 0.0F;

               for (int var9 = 0; var9 < var6.size(); var9++) {
                  g8t var10 = (g8t)var6.get_Item(var9);
                  var8 = com.aspose.slides.ms.System.q1.n5((float)(var10.d2()), (float)(var8));
               }

               for (int var20 = 0; var20 < var6.size(); var20++) {
                  g8t var21 = (g8t)var6.get_Item(var20);
                  float var11 = var3 * var21.y4();
                  var7 += var11;
                  this.n5().n5(this.z3() == 1 ? this.p8() + var4 : this.p8(), var7, this.z3() == 1 ? this.p8() + this.d2() : this.p8() + var4, var7);
               }

               var4 = this.z3() == 1 ? var4 + var8 + this.q0() : var4 - var8 - this.q0();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      } finally {
         var2.n5();
      }
   }
}
