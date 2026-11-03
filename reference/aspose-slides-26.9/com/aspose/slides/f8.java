package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class f8 extends l4w {
   f8(p7m var1, g3y var2) {
      super(var1, var2);
      boolean var3 = !((LineFormat)((DataLabelCollection)var2.u9().getLabels()).getLeaderLinesFormat().getLine()).isFormatNotDefined();
      List$Enumerator var4 = this.e2().c8().iterator();

      try {
         while (var4.hasNext()) {
            t9z var5 = (t9z)var4.next();
            o2 var6 = new o2(var5);
            this.l6.addItem(var6);
            this.n5(var6);
            if (!var5.c8() && var5.t9() != null && var5.t9().y4()) {
               t3h var7 = new t3h(var6);
               this.k5.addItem(var7);
               this.n5(var7);
               if (var3 && (var5.t9().l6().getDataLabelFormat().getShowLeaderLines() || var2.u9().getLabels().getDefaultDataLabelFormat().getShowLeaderLines())
                  )
                {
                  a6y var8 = new a6y(var5);
                  this.u3.addItem(var8);
                  this.n5(var8);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.u9();
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
      ValueAxisBase var2 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, ValueAxisBase.class);

      for (int var3 = 0; var3 < this.l6.size(); var3++) {
         o2 var4 = (o2)this.l6.get_Item(var3);
         if (!var4.e2().c8() && (!var2.n5().c8().isLogarithmic() || !com.aspose.slides.ms.System.d2.k5(var4.n3()))) {
            float var5 = this.u3() / (this.t9().n5.size() - this.t2() * (this.t9().n5.size() - 1) + this.c8());
            var4.n3(new z5(var4.k5(var1), var5));
         } else {
            this.l6.get_Item(var3).n3(var1);
            this.l6.get_Item(var3).l6(false);
         }
      }

      this.k5(var1);
   }

   @Override
   protected void l6(z5 var1) {
      this.z1();
      this.a6(var1);
      this.h0();
      this.n3();
      this.a6();

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   private void a6(z5 var1) {
      int var2 = this.t9().n5.indexOf(this);

      for (int var3 = 0; var3 < this.k5.size(); var3++) {
         o2 var4 = (o2)com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var3), t3h.class).u3();
         q8o var5 = this.k5.get_Item(var3);
         switch (var4.e2().t9().c8()) {
            case 2:
               if (var4.b3() < 0.0F) {
                  var5.a6((var4.b3() + var4.d2()) / 2.0F - var5.d2() / 2.0F);
               } else {
                  var5.a6(var4.b3() + var4.d2() / 2.0F - var5.d2() / 2.0F);
               }
               break;
            case 3:
               if (!var4.a6()) {
                  var5.a6(var4.b3() + var4.d2() - var5.d2());
               } else {
                  float var6 = 3.0F;
                  var5.a6(3.0F + (var4.b3() > 0.0F ? var4.b3() : 0.0F));
               }
               break;
            case 4:
               if (!var4.a6()) {
                  var5.a6(var4.b3());
               } else {
                  var5.a6(var4.b3() + var4.d2() - var5.d2());
               }
            case 5:
            default:
               break;
            case 6:
               if (!var4.a6()) {
                  var5.a6(var4.b3() - var5.d2());
               } else {
                  var5.a6(var4.b3() + var4.d2());
               }
         }

         var5.u9(var4.o0() + var4.d5() / 2.0F - var5.d5() / 2.0F);
         a9v var17 = (a9v)var1;
         com.aspose.slides.internal.o9b.y1 var7 = new com.aspose.slides.internal.o9b.y1(-var17.u3(), -var17.a6(), this.y2().d2(), this.y2().d5());
         if (this.t9().k5.n5().c8().isPlotOrderReversed()) {
            var5.n5(-var5.t2());
         }

         if (this.t9().l6.n5().c8().isPlotOrderReversed()) {
            var5.l6(-var5.s7());
         }

         if (ChartTypeCharacterizer.c8(this.e2().u9().getType()) && !var4.a6()) {
            var5.l6(-var5.s7());
         }

         com.aspose.slides.internal.o9b.w1 var8 = var5.l6(new com.aspose.slides.internal.o9b.w1(var5.b3(), var5.o0()), var7.y4()).u3();
         var5.a6(var8.l6());
         var5.u9(var8.k5());
         if (!this.e2().u9().getChart().getShowDataLabelsOverMaximum()) {
            double var9 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, h7x.class).v0();
            if (var2 > 0) {
               f7c var11 = this.t9().n5.get_Item(var2 - 1);
               int var12 = com.aspose.slides.internal.v6g.k5.n5(var5, t3h.class).u3().e2().z1();
               if (var11.l6.size() - 1 >= var12) {
                  var9 = var11.l6.get_Item(var12).n3();
               }
            }

            double var13 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, h7x.class).h2();
            switch (var5.c8()) {
               case 2:
                  if (var9 + (var4.n3() - var9) / 2.0 > var13) {
                     var5.n5(false);
                  }
                  break;
               case 3:
                  if (var9 > var13) {
                     var5.n5(false);
                  }
                  break;
               case 4:
                  if (var4.n3() > var13) {
                     var5.n5(false);
                  }
            }
         }

         float var15;
         float var16;
         if (this.e2().u9().getType() != 35 && this.e2().u9().getType() != 32) {
            var15 = var4.d2() >= 10.0F ? var4.b3() + var4.d2() - var5.b3() - 10.0F : var4.b3() + var4.d2() - var5.b3();
            var16 = var4.o0() + var4.d5() / 2.0F - var4.o0();
         } else if (var5.i1().k5() < var4.i1().k5()) {
            var15 = var4.b3() + var4.d2() / 2.0F - var5.b3();
            var16 = var4.o0() - var5.o0();
         } else {
            var15 = var4.b3() + var4.d2() / 2.0F - var5.b3();
            var16 = var4.o0() + var4.d5() - var5.o0();
         }

         var5.n5(new com.aspose.slides.internal.o9b.w1(var15, var16));
      }
   }

   private void z1() {
      float var1 = this.u3();

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         o2 var3 = (o2)this.l6.get_Item(var2);
         if (!var3.a6()) {
            this.l6.get_Item(var2).a6(this.t9().k5.n5(var3.n3()));
         } else {
            this.l6.get_Item(var2).a6(this.t9().k5.n5(var3.n3()) - this.l6.get_Item(var2).d2());
         }

         float var4 = var3.d5() * this.t2();
         float var5 = var3.d5() * this.c8();
         int var6 = this.t9().n5.indexOf(this);
         float var7 = var6 * (var3.d5() - var4);
         float var8 = var1 * var2 + var5 / 2.0F + var7;
         if (!this.t9().l6.n5().a0()) {
            var8 -= var1 / 2.0F;
         }

         if (!this.t9().l6.n5().c8().isPlotOrderReversed()) {
            var8 = this.d5() - var8 - var3.d5();
         }

         var3.u9(var8);
      }
   }

   protected final float u3() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.t9().l6, o8r.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, v3o.class).w1();
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.t9().l6, l5n.class)
            ? com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, l5n.class).a5()
            : this.d5() / this.l6.size();
      }
   }

   @Override
   protected void l6() {
      for (v6g var4 : this.a0()) {
         var4.U_();
      }
   }
}
