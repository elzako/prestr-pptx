package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class o7b extends l4w {
   o7b(p7m var1, g3y var2) {
      super(var1, var2);
      List$Enumerator var3 = this.e2().c8().iterator();

      try {
         while (var3.hasNext()) {
            t9z var4 = (t9z)var3.next();
            l3e var5 = new l3e(var4);
            this.l6.addItem(var5);
            this.n5((com.aspose.slides.v6g)var5);
            if (!var4.c8() && var4.t9() != null && var4.t9().y4()) {
               t3h var6 = new t3h(var5);
               this.k5.addItem(var6);
               this.n5(var6);
               if (var4.t9().l6().getDataLabelFormat().getShowLeaderLines() || var2.u9().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                  a6y var7 = new a6y(var4);
                  this.u3.addItem(var7);
                  this.n5(var7);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.u9();
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
      ValueAxisBase var2 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class);

      for (int var3 = 0; var3 < this.l6.size(); var3++) {
         l3e var4 = (l3e)this.l6.get_Item(var3);
         if (!var4.e2().c8() && (var2 == null || !var2.n5().c8().isLogarithmic() || !com.aspose.slides.ms.System.d2.k5(var4.n3()))) {
            float var5 = this.u3() / (this.t9().n5.size() - this.t2() * (this.t9().n5.size() - 1) + this.c8());
            if (com.aspose.slides.internal.v6g.k5.l6(this.e2().t2().d2(), w2.class)
               && this.u3() - var5 < 1.5
               && com.aspose.slides.ms.System.q1.n5(this.u3() - var5) > 0.1) {
               var5 = this.u3() - 1.5F;
            }

            if (var5 < 0.5) {
               var5 = 0.5F;
            }

            var4.n3(new z5(var5, var4.k5(var1)));
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
      float var2 = 4.0F;

      for (int var3 = 0; var3 < this.k5.size(); var3++) {
         l3e var4 = (l3e)com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var3), t3h.class).u3();
         q8o var5 = this.k5.get_Item(var3);
         a6y var6 = null;
         if (this.u3.size() > var3) {
            var6 = this.u3.get_Item(var3);
         }

         switch (var4.e2().t9().c8()) {
            case 2:
               if (var4.o0() < 0.0F && !com.aspose.slides.ms.System.n1.k5(var5.x8().t9().l6().getY())) {
                  var5.u9(-((a9v)var1).a6());
               } else {
                  var5.u9(var4.o0() + var4.d5() / 2.0F - var5.d5() / 2.0F);
               }
               break;
            case 3:
               if (!var4.a6()) {
                  var5.u9(var4.o0());
               } else {
                  var5.u9(var4.o0() + var4.d5() - var5.d5());
               }
               break;
            case 4:
               if (!var4.a6()) {
                  var5.u9(var4.o0() + var4.d5() - var5.d5());
               } else {
                  var5.u9(var4.o0() + var2 / 2.0F);
               }
            case 5:
            default:
               break;
            case 6:
               if (!var4.a6()) {
                  var5.u9(var4.o0() + var4.d5() + var2);
               } else {
                  var5.u9(var4.o0() - var5.d5() - var2);
               }
         }

         if (this.e2().u9().getType() == 0 && var5.d5() > var4.d5() && var4.e2().t9().c8() != 6) {
            if (var4.a6()) {
               var5.u9(var4.o0() + var4.d5() - var5.d5());
            } else {
               var5.u9(var4.o0());
            }
         }

         var5.a6(var4.b3() + var4.d2() / 2.0F - var5.d2() / 2.0F);
         a9v var7 = (a9v)var1;
         com.aspose.slides.internal.o9b.y1 var8 = new com.aspose.slides.internal.o9b.y1(-var7.u3(), -var7.a6(), this.y2().d2(), this.y2().d5());
         if (!var4.a6()) {
            var5.l6(-var5.s7());
         }

         if (this.t9().k5.n5().c8().isPlotOrderReversed()) {
            var5.n5(-var5.t2());
         }

         com.aspose.slides.internal.o9b.w1 var9 = var5.l6(new com.aspose.slides.internal.o9b.w1(var5.b3(), var5.o0()), var8.y4()).u3();
         var5.a6(var9.l6());
         var5.u9(var9.k5());
         if (this.e2().u9().getType() == 0
            && var4.e2().t9().c8() != 3
            && !this.e2().u9().getChart().getShowDataLabelsOverMaximum()
            && this.n5(com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var3), t3h.class).u3())) {
            this.l6(var5);
            if (var6 != null) {
               this.l6(var6);
            }
         }

         float var10;
         float var11;
         if (this.e2().u9().getType() != 1 && this.e2().u9().getType() != 2) {
            var10 = var4.b3() + var4.d2() / 2.0F - var5.b3();
            var11 = var4.d5() >= 10.0F ? var4.o0() - var5.o0() + 10.0F : var4.o0() - var5.o0();
         } else if (var5.i1().l6() > var4.i1().l6()) {
            var10 = var4.b3() + var4.d2() - var5.b3();
            var11 = var4.o0() + var4.d5() / 2.0F - var5.o0();
         } else {
            var10 = var4.b3() - var5.b3();
            var11 = var4.o0() + var4.d5() / 2.0F - var5.o0();
         }

         var5.n5(new com.aspose.slides.internal.o9b.w1(var10, var11));
      }
   }

   private void z1() {
      float var1 = this.u3();

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         l3e var3 = (l3e)this.l6.get_Item(var2);
         if (!var3.a6()) {
            var3.u9(this.t9().l6.n5(var3.n3()) - this.l6.get_Item(var2).d5());
         } else {
            var3.u9(this.t9().l6.n5(var3.n3()));
         }

         float var4 = var3.d2() * this.t2();
         float var5 = var3.d2() * this.c8();
         int var6 = this.t9().n5.indexOf(this);
         float var7 = var6 * (var3.d2() - var4);
         float var8 = var1 * var2 + var5 / 2.0F + var7;
         if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, o8r.class) && !com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var2).e2().l6())) {
            var8 = this.t9().k5.n5(this.l6.get_Item(var2).e2().l6()) + var5 / 2.0F + var7;
         }

         if (!this.t9().k5.n5().a0()) {
            var8 -= var1 / 2.0F;
         }

         if (this.t9().k5.n5().c8().isPlotOrderReversed()) {
            var8 = this.d2() - var8 - var3.d2();
         }

         var3.a6(var8);
      }
   }

   private boolean n5(h2v var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.t9().l6, ValueAxisBase.class)) {
         double var2 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class).h2();
         double var4 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class).v0();
         if (var1.e2().n5() < var4 || var1.e2().n5() > var2) {
            return true;
         }
      }

      return false;
   }

   protected final float u3() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, o8r.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, m3o.class).w1();
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, a0k.class)
            ? com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, a0k.class).a5()
            : this.d2() / this.l6.size();
      }
   }
}
