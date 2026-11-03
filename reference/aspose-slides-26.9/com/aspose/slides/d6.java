package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class d6 extends v6g {
   protected w3 n5;

   d6(w3 var1) {
      this.n5 = var1;
      if (!this.n5.n5().c8().isVisible()) {
         this.l6(false);
      }
   }

   @Override
   public int O_() {
      return 3;
   }

   @Override
   protected void n5(z5 var1) {
      this.u6();
      this.k5(this.n5.a6() ? 1.0F : var1.n5());
      this.u3(this.n5.a6() ? var1.l6() : 1.0F);
   }

   @Override
   protected void l6(z5 var1) {
      if (this.k5().n5().c8().getMajorTickMark() != 2) {
         List var2 = this.n5.m1();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            a3z var4 = new a3z(this.k5(), true);
            var4.n3(var1);
            if (this.n5.a6()) {
               var4.a6(this.n5(var4));
               var4.u9((Float)var2.get_Item(var3));
            } else {
               float var5 = ((u2w)this.y1().y1()).u3().z7();
               if (this.k5().n5().c8().isPlotOrderReversed()) {
                  var4.a6((Float)var2.get_Item(var3) - var5);
                  if (com.aspose.slides.internal.v6g.k5.l6(this.k5(), m3o.class)) {
                     var4.a6(var4.b3() + this.d2());
                  }
               } else {
                  var4.a6((Float)var2.get_Item(var3) + var5);
               }

               var4.u9(this.n5(var4));
            }

            this.n5(var4);
         }
      }

      if (this.k5().n5().c8().getMinorTickMark() != 2) {
         List var6 = this.n5.k7();

         for (int var8 = 0; var8 < var6.size(); var8++) {
            a3z var10 = new a3z(this.k5(), false);
            var10.n3(var1);
            if (this.n5.a6()) {
               var10.a6(this.n5(var10));
               var10.u9((Float)var6.get_Item(var8));
            } else {
               var10.a6((Float)var6.get_Item(var8));
               var10.u9(this.n5(var10));
            }

            this.n5(var10);
         }
      }

      for (v6g var12 : this.a0()) {
         var12.t1();
      }
   }

   protected final float n5(a3z var1) {
      int var2 = var1.u3() ? this.n5.n5().c8().getMajorTickMark() : this.n5.n5().c8().getMinorTickMark();
      boolean var3 = false;
      boolean var4 = false;
      boolean[] var5 = new boolean[]{false};
      boolean[] var6 = new boolean[]{false};
      this.n5(var2, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      float var7 = this.n5.a6() ? var1.d2() : var1.d5();
      if (var2 == 0) {
         return -var7 / 2.0F;
      } else if (var4) {
         return this.n5.a6() ? -var7 : 0.0F;
      } else if (var3) {
         return this.n5.a6() ? 0.0F : -var7;
      } else {
         return 0.0F;
      }
   }

   private void n5(int var1, boolean[] var2, boolean[] var3) {
      boolean var4 = this.k5().n3() != null && this.k5().n3().n5().c8().isPlotOrderReversed();
      boolean var5 = ((ChartCategoryCollection)this.y2().u3().n3().getChartData().getCategories()).h0();
      switch (var1) {
         case 1:
            var2[0] = true;
            if (var4) {
               var2[0] = false;
               var3[0] = true;
            }

            if (this.k5().n3() != null && this.k5().n3().n5().c8().getCrossType() == 1) {
               if (var4) {
                  var2[0] = true;
                  var3[0] = false;
               } else {
                  var2[0] = false;
                  var3[0] = true;
               }
            } else if (this.k5().n3() != null && this.k5().n3().z3() == 0 && this.k5().z3() == 2) {
               var3[0] = true;
               var2[0] = false;
               if (!var4 && !var5) {
                  var3[0] = false;
                  var2[0] = true;
               }
            }
            break;
         case 3:
            var3[0] = true;
            if (var4) {
               var3[0] = false;
               var2[0] = true;
            }

            if (this.k5().n3() != null && this.k5().n3().n5().c8().getCrossType() == 1) {
               if (!var4) {
                  var2[0] = true;
                  var3[0] = false;
               } else {
                  var2[0] = false;
                  var3[0] = true;
               }
            } else if (this.k5().n3() != null && this.k5().n3().z3() == 0 && this.k5().z3() == 2) {
               var3[0] = false;
               var2[0] = true;
               if (!var4 && !var5) {
                  var3[0] = true;
                  var2[0] = false;
               }
            }
      }
   }

   @Override
   protected void l6() {
      if (this.n5.a6()) {
         this.n5.n5().n5(this.p8(), this.f2(), this.p8(), this.f2() + this.d5());
      } else {
         this.n5.n5().n5(this.p8(), this.f2(), this.p8() + this.d2(), this.f2());
      }
   }

   public final w3 k5() {
      return this.n5;
   }

   @Override
   protected void u3(z5 var1) {
   }
}
