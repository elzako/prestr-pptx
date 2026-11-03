package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

abstract class h7x extends ValueAxisBase {
   protected h7x(l5 var1) {
      super(var1);
   }

   @Override
   protected void m3() {
      this.n5.clear();
      this.u6();
      switch (this.e2) {
         case 0:
            this.p3();
            break;
         case 1:
            this.a3();
            break;
         case 2:
            this.f0();
      }

      if ((ChartTypeCharacterizer.s7(this.n5().d2().n3().getType()) || !this.l6.isEmpty() && ChartTypeCharacterizer.s7(this.l6.get_Item(0).u9().getType()))
         && com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(0).h0(), double.class) > this.s7) {
         this.n5(this.n5.get_Item(0));
      }
   }

   private void f0() {
      double var1 = 0.0;
      int var3 = g6z.u3(this.x8);

      while (var1 <= this.s7 || g6z.n5(var1, this.s7) < this.x8) {
         var1 = com.aspose.slides.ms.System.q1.n5((double)(var1), var3);
         if (!this.n5().c8().isAutomaticMaxValue() && var1 > this.s7) {
            this.n5(Double.valueOf(this.s7));
         } else {
            this.n5(Double.valueOf(var1));
         }

         var1 += this.x8;
      }

      if (this.n5().c8().isAutomaticMaxValue() && !this.r4()) {
         double var4 = -2.1474836E9F;
         if (this.n5.size() > 0) {
            var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class);
         }

         if (var4 - this.c8 > this.x8) {
            var4 -= this.x8;
            if ((this.c8 - this.h0) / (var4 - this.h0) <= 0.9523809523809523) {
               this.n5(this.n5.get_Item(this.n5.size() - 1));
            }
         } else if ((this.c8 - this.h0) / (var4 - this.h0) > 0.9523809523809523) {
            var1 = com.aspose.slides.ms.System.q1.n5((double)(var4 + this.x8), var3);
            this.n5(Double.valueOf(var1));
         }
      }

      this.n5.reverse();
      var1 = 0.0 - this.x8;

      while (var1 >= this.t2 || g6z.n5(this.t2, var1) < this.x8) {
         var1 = com.aspose.slides.ms.System.q1.n5((double)(var1), var3);
         if (!this.n5().c8().isAutomaticMinValue() && var1 < this.t2) {
            this.n5(Double.valueOf(this.t2));
         } else {
            this.n5(Double.valueOf(var1));
         }

         var1 -= this.x8;
      }

      if (this.n5().c8().isAutomaticMinValue()) {
         double var12 = 2.147483647E9;
         if (this.n5.size() > 0) {
            var12 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class);
         }

         if (this.h0 - var12 > this.x8) {
            var12 += this.x8;
            if ((this.h0 - this.c8) / (var12 - this.c8) <= 0.9523809523809523) {
               this.n5(this.n5.get_Item(this.n5.size() - 1));
            }
         } else if ((this.h0 - this.c8) / (var12 - this.c8) > 0.9523809523809523) {
            var1 = com.aspose.slides.ms.System.q1.n5((double)(var12 - this.x8), var3);
            this.n5(Double.valueOf(var1));
         }
      }
   }

   private void a3() {
      double var1 = this.t2;
      int var3 = g6z.u3(this.x8);

      while (var1 <= this.s7 || var1 < this.s7 + this.x8) {
         var1 = com.aspose.slides.ms.System.q1.n5((double)(var1), var3);
         if (!this.n5().c8().isAutomaticMaxValue() && var1 > this.s7) {
            this.n5(Double.valueOf(this.s7));
         } else if (!this.n5().c8().isAutomaticMinValue() && var1 < this.t2) {
            this.n5(Double.valueOf(this.t2));
         } else {
            this.n5(Double.valueOf(var1));
         }

         var1 += this.x8;
      }

      if (this.r4()) {
         for (double var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class);
            var4 != 0.0 && var4 > this.c8 * 2.0;
            var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class)
         ) {
            this.n5(this.n5.get_Item(this.n5.size() - 1));
         }
      } else if (this.n5().c8().isAutomaticMaxValue()) {
         double var8 = -2.1474836E9F;
         if (this.n5.size() > 0) {
            var8 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class);
         }

         if (g6z.n5(var8, this.c8) > this.x8 && var8 != 0.0) {
            while (g6z.n5(var8, this.c8) > this.x8 && var8 != 0.0 && (this.c8 - this.t2) / (var8 - this.t2) <= 0.9523809523809523) {
               var8 -= this.x8;
               if ((this.c8 - this.t2) / (var8 - this.t2) <= 0.9523809523809523) {
                  this.n5(this.n5.get_Item(this.n5.size() - 1));
               }
            }
         } else if ((this.c8 - this.t2) / (var8 - this.t2) > 0.9523809523809523 && var8 != 0.0 && !this.y0()) {
            var1 = com.aspose.slides.ms.System.q1.n5((double)(var8 + this.x8), var3);
            this.n5(Double.valueOf(var1));
         }
      }

      this.n5.reverse();
   }

   private void p3() {
      com.aspose.slides.ms.System.c4 var1 = com.aspose.slides.internal.v6g.k5.s7(this.s7, 14).l6();
      int var2 = g6z.u3(this.x8);

      while (
         com.aspose.slides.ms.System.c4.s7(var1, com.aspose.slides.internal.v6g.k5.s7(this.t2, 14))
            || com.aspose.slides.ms.System.c4.x8(
               com.aspose.slides.ms.System.c4.u3(com.aspose.slides.internal.v6g.k5.s7(this.t2, 14), var1), com.aspose.slides.internal.v6g.k5.s7(this.x8, 14)
            )
      ) {
         double var3 = com.aspose.slides.ms.System.q1.n5((double)(com.aspose.slides.internal.v6g.k5.t2(var1, 15)), var2);
         if (!this.n5().c8().isAutomaticMinValue() && var3 < this.t2) {
            this.n5(Double.valueOf(this.t2));
         } else {
            this.n5(Double.valueOf(var3));
         }

         com.aspose.slides.ms.System.c4.u3(var1, com.aspose.slides.internal.v6g.k5.s7(this.x8, 14)).k7(var1);
      }

      if (this.n5().c8().isAutomaticMinValue()) {
         double var8 = 2.147483647E9;
         if (this.n5.size() > 0) {
            var8 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class);
         }

         double var5 = this.h0 - var8;
         if (var5 > this.x8 && var8 != 0.0) {
            var8 += this.x8;
            if ((this.h0 - this.s7) / (var8 - this.s7) <= 0.9523809523809523) {
               this.n5(this.n5.get_Item(this.n5.size() - 1));
            }
         } else if ((this.h0 - this.s7) / (var8 - this.s7) > 0.9523809523809523 && var8 != 0.0) {
            com.aspose.slides.internal.v6g.k5.s7(com.aspose.slides.ms.System.q1.n5((double)(var8 - this.x8), var2), 14).k7(var1);
            this.n5(var1.l6());
         }
      }

      for (int var7 = 0; var7 < this.n5.size(); var7++) {
         this.n5.get_Item(var7).n5(com.aspose.slides.ms.System.z3.n3(this.n5.get_Item(var7).h0()));
      }
   }

   @Override
   protected void z8() {
      this.n3 = this.n5().c8().isAutomaticMinValue();
      this.y4 = this.n5().c8().isAutomaticMaxValue();
      if (this.n5().m3()) {
         this.x9();
      } else {
         this.v8();
      }

      if (!this.n5().z8() && this.x8 < this.n5().j5()) {
         this.x8 = this.n5().j5();
      }

      if (!this.n5().c8().isAutomaticMajorUnit()) {
         this.x8 = this.n5().c8().getMajorUnit();
      }

      while ((this.s7 - this.t2) / this.x8 > 1000.0) {
         this.x8 *= 2.0;
      }
   }

   private void x9() {
      double var1 = this.n5().c8().isAutomaticMinValue() ? this.h0 : this.a5();
      double var3 = this.n5().c8().isAutomaticMaxValue() && !this.r4() ? this.c8 : this.c4();
      double var5 = 0.0;
      double var7 = 0.0;
      double var9 = 0.0;
      double var11 = 0.0;
      double[] var13 = new double[]{0.0};
      double[] var14 = new double[]{0.0};
      o9b.n5(var1, var13, var14, this.n5());
      var5 = var13[0];
      var7 = var14[0];
      double[] var15 = new double[]{0.0};
      double[] var16 = new double[]{0.0};
      o9b.n5(var3, var15, var16, this.n5());
      var9 = var15[0];
      var11 = var16[0];
      this.x8 = com.aspose.slides.ms.System.q1.l6(var5, var9);
      this.x8 = com.aspose.slides.ms.System.q1.n5(this.x8);
      this.t2 = com.aspose.slides.ms.System.q1.k5(var1, var7);
      this.s7 = com.aspose.slides.ms.System.q1.l6(var3, var11);
      if (var1 != var3) {
         if (var1 > 0.0 && var3 > 0.0) {
            this.e9();
         } else if (var1 < 0.0 && var3 < 0.0) {
            this.o5();
         } else if (var1 < 0.0 && var3 >= 0.0) {
            this.j8();
         }
      }

      this.z6();
      this.j9();
   }

   private boolean y0() {
      return this.n5().d2().n3().getType() == 70 || this.n5().d2().n3().getType() == 71 || this.n5().d2().n3().getType() == 72;
   }

   private void j9() {
      double var1 = this.t2;
      double var3 = this.s7;
      int var5 = g6z.u3(this.x8);
      switch (this.e2) {
         case 0:
            double var28 = this.s7;
            if (!this.n5().c8().isAutomaticMinValue()) {
               var1 = this.a5();
            } else {
               boolean var8 = false;

               while (var28 >= this.t2 || this.t2 - var28 < this.x8) {
                  var28 = com.aspose.slides.ms.System.q1.n5((double)(var28), var5);
                  var1 = var28;
                  double var9 = this.x8;
                  if (!var8 && !Double.isInfinite(Math.abs(this.t2 / (var28 - var9))) && Math.abs(this.t2 / (var28 - var9)) > 20.0) {
                     double var30 = Math.abs(this.t2 / (var28 - var9));
                     var28 += (var28 - var9) * var30 - (var28 - var9);
                     var8 = true;
                  }

                  var28 = g6z.n5(var28, var9);
               }

               if ((!(g6z.n5(this.h0, var1) > this.x8) || var1 == 0.0) && (this.h0 - this.t2) / (var1 - this.s7) > 0.9523809523809523 && var1 != 0.0) {
                  var1 = com.aspose.slides.ms.System.q1.n5((double)(var1 - this.x8), var5);
               }
            }
            break;
         case 1:
            double var25 = this.t2;
            if (!this.n5().c8().isAutomaticMaxValue()) {
               var3 = this.c4();
            } else {
               var25 = com.aspose.slides.ms.System.q1.n5((double)(var25), var5);
               double var32 = this.x8;
               int var15 = this.r4() ? 20 : 10;

               while ((this.c8 - this.t2 + this.x8) / this.x8 < var15) {
                  var32 = this.x8;
                  this.s0();
               }

               var5 = g6z.u3(this.x8);
               this.x8 = var32;
               double var11 = this.r4() ? this.c8 * 2.0 : this.c8 + this.x8;

               while (var25 < var11) {
                  var25 = com.aspose.slides.ms.System.q1.n5((double)(var25), var5);
                  var3 = var25;
                  double var16 = this.x8;
                  var25 = g6z.l6(var25, var16);
               }

               if ((!(g6z.n5(var3, this.c8) > this.x8) || var3 == 0.0) && (this.c8 - this.t2) / (var3 - this.t2) > 0.9523809523809523 && var3 != 0.0) {
                  var3 = com.aspose.slides.ms.System.q1.n5((double)(var3 + this.x8), var5);
               }
            }

            if (this.s7 - this.x8 >= this.c8 && this.y0()) {
               this.s7 = this.s7 - this.x8;
            }
            break;
         case 2:
            double var6 = 0.0;
            if (!this.n5().c8().isAutomaticMinValue()) {
               var1 = this.a5();
            } else {
               while (var6 >= this.t2 || this.t2 - var6 < this.x8) {
                  var6 = com.aspose.slides.ms.System.q1.n5((double)(var6), var5);
                  var1 = var6;
                  double var13 = this.x8;
                  var6 = g6z.n5(var6, var13);
               }

               if ((!(g6z.n5(this.h0, var1) > this.x8) || var1 == 0.0) && (this.h0 - this.t2) / (var1 - this.s7) > 0.9523809523809523 && var1 != 0.0) {
                  var1 = com.aspose.slides.ms.System.q1.n5((double)(var1 - this.x8), var5);
               }
            }

            var6 = 0.0;
            if (!this.n5().c8().isAutomaticMaxValue()) {
               var3 = this.c4();
            } else {
               while (var6 <= this.s7 || var6 < this.s7 + this.x8) {
                  var6 = com.aspose.slides.ms.System.q1.n5((double)(var6), var5);
                  var3 = var6;
                  double var31 = this.x8;
                  var6 = g6z.l6(var6, var31);
               }

               if ((!(g6z.n5(var3, this.c8) > this.x8) || var3 == 0.0) && (this.c8 - this.t2) / (var3 - this.t2) > 0.9523809523809523 && var3 != 0.0) {
                  var3 = com.aspose.slides.ms.System.q1.n5((double)(var3 + this.x8), var5);
               }
            }
      }

      if (ChartTypeCharacterizer.s7(this.n5().d2().n3().getType()) || !this.l6.isEmpty() && ChartTypeCharacterizer.s7(this.l6.get_Item(0).u9().getType())) {
         if (this.c8 == 1.0 && this.n5().c8().isAutomaticMaxValue()) {
            this.s7 = 1.0;
            var3 = 1.0;
         }

         if (this.h0 == -1.0 && this.n5().c8().isAutomaticMinValue()) {
            this.t2 = -1.0;
            var1 = -1.0;
         }
      }

      double var33 = this.x8;
      double var18 = (var3 - var1) / this.x8;
      int var20 = this.r4() ? 21 : 11;
      if (var18 > var20) {
         this.w2();
      } else {
         this.s0();
         if (var3 - var1 > 10.0 * this.x8) {
            this.x8 = var33;
         }
      }
   }

   private void z6() {
      if (this.n3 && this.y4) {
         this.e2 = 2;
         if (this.h0 == 0.0 || this.c8 == this.h0 && this.c8 > 0.0) {
            this.e2 = 1;
            this.t2 = 0.0;
         }

         if (this.c8 == 0.0 || this.c8 == this.h0 && this.c8 < 0.0) {
            this.e2 = 0;
            this.s7 = 0.0;
         }
      } else if (this.n3 && !this.y4) {
         this.e2 = 0;
         this.s7 = this.c4();
         if (this.h0 > 0.0 && this.h0 / this.s7 < 0.8333333F) {
            this.t2 = 0.0;
         }

         if (ChartTypeCharacterizer.isChartTypeColumn(this.n5().d2().n3().getType())
            || !this.l6.isEmpty() && ChartTypeCharacterizer.isChartTypeColumn(this.l6.get_Item(0).u9().getType())) {
            double var9 = this.s7 - this.t2;
            double var11 = this.t2 * this.h0 / this.c8;
            if (var11 > 0.0) {
               while (var11 < this.t2 && !(this.h0 - var9 / 2.0 > this.t2)) {
                  this.t2 = this.t2 - this.x8;
               }

               if (this.x8 > 1.0) {
                  this.t2 = this.t2 - this.x8;
               }
            }
         }
      } else if (!this.n3 && this.y4) {
         this.e2 = 1;
         this.t2 = this.a5();
      } else {
         this.e2 = 1;
         this.t2 = this.a5();
         this.s7 = this.c4();
         if (this.n5().c8().isAutomaticMajorUnit()) {
            double var1 = g6z.n5(this.s7, this.t2);
            double var3 = 0.0;
            double var5 = 0.0;
            double[] var7 = new double[]{0.0};
            double[] var8 = new double[]{0.0};
            o9b.n5(var1, var7, var8, this.n5());
            var3 = var7[0];
            var5 = var8[0];
            this.x8 = var3;
         }
      }
   }

   private void e9() {
      double var1 = g6z.n5(this.c8, this.h0);
      double var3 = 0.0;
      double var5 = 0.0;
      double[] var7 = new double[]{0.0};
      double[] var8 = new double[]{0.0};
      o9b.n5(var1, var7, var8, this.n5());
      var3 = var7[0];
      var5 = var8[0];
      if (var1 != 0.0 && (float)(this.h0 / var1) >= 5.0F) {
         this.s7 = this.h0 + var5;
         this.x8 = com.aspose.slides.ms.System.q1.n5(var3);
         double var9 = g6z.n5(this.c8, this.h0);
         if (var9 / this.x8 >= 5.0) {
            this.w2();
         }

         int var11 = g6z.u3(this.x8);
         double var12 = 3.0 * this.h0 - this.c8;
         var12 = com.aspose.slides.ms.System.q1.n5(var12, 10);
         double var14 = 2.0 * this.x8;
         double var16 = com.aspose.slides.ms.System.q1.k5(var12 / var14);
         if (this.n3 && this.y4) {
            this.n3 = false;
            if (!this.l6.isEmpty() && ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(this.l6.get_Item(0).u9().getType())) {
               this.t2 = this.h0 - this.x8;
            } else {
               double var18 = com.aspose.slides.ms.System.q1.n5(var16 * this.x8, var11);
               if ((this.h0 - var18) / var14 > 2.0) {
                  var18 -= this.x8;
               }

               this.t2 = var18;
            }
         }
      } else {
         if (this.n3 && this.y4) {
            this.n3 = false;
         }

         this.t2 = 0.0;
      }
   }

   private void o5() {
      double var1 = g6z.n5(this.h0, this.c8);
      double var3 = 0.0;
      double var5 = 0.0;
      double[] var7 = new double[]{0.0};
      double[] var8 = new double[]{0.0};
      o9b.n5(var1, var7, var8, this.n5());
      var3 = var7[0];
      var5 = var8[0];
      if (var1 != 0.0 && (float)(this.c8 / var1) >= 5.0F) {
         this.s7 = this.c8 - var5 / 2.0;
         this.t2 = this.c8 + var5;
         this.x8 = com.aspose.slides.ms.System.q1.n5(var3);
         if ((this.c8 - this.h0) / this.x8 >= 5.0) {
            this.w2();
         }

         int var9 = g6z.u3(this.x8);
         double var10 = 0.0;

         while (var10 - 3.0 * this.x8 > this.c8) {
            var10 = com.aspose.slides.ms.System.q1.n5(var10, var9);
            var10 -= this.x8;
         }

         if (this.n3 && this.y4) {
            this.y4 = false;
            this.s7 = var10;
         }
      } else {
         if (this.n3 && this.y4) {
            this.y4 = false;
         }

         this.s7 = 0.0;
      }
   }

   private void j8() {
      double var1 = g6z.n5(this.c8, this.h0);
      double var3 = 0.0;
      double var5 = 0.0;
      double[] var7 = new double[]{0.0};
      double[] var8 = new double[]{0.0};
      o9b.n5(var1, var7, var8, this.n5());
      var3 = var7[0];
      var5 = var8[0];
      this.x8 = com.aspose.slides.ms.System.q1.n5(var3);
      if ((this.c8 - this.h0) / this.x8 > 9.0) {
         this.w2();
      }
   }

   private void w2() {
      char var1 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.internal.x7n.s7.s7().q0());
      boolean var2 = !(this.x8 < 0.0);
      this.x8 = com.aspose.slides.ms.System.q1.n5(this.x8);
      int var3 = 1;
      if (this.x8 > 1.0) {
         String var4 = com.aspose.slides.ms.System.d2.u9(this.x8);
         var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var4.charAt(0)));
      } else if (this.x8 == 0.0) {
         this.x8 = 0.0;
      }

      if (this.x8 < 1.0) {
         String var6 = com.aspose.slides.ms.System.d2.u9(this.x8);

         for (int var5 = 0; var5 < var6.length(); var5++) {
            if (var6.charAt(var5) != '0' && var6.charAt(var5) != var1) {
               var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var6.charAt(var5)));
               break;
            }
         }
      }

      if (var3 != 1 && var3 != 5) {
         this.x8 = this.x8 * 5.0 / 2.0;
      } else {
         this.x8 = 2.0 * this.x8;
      }

      if (!var2) {
         this.x8 = -this.x8;
      }
   }

   private void s0() {
      char var1 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.internal.x7n.s7.s7().q0());
      boolean var2 = !(this.x8 < 0.0);
      this.x8 = com.aspose.slides.ms.System.q1.n5(this.x8);
      int var3 = 1;
      if (this.x8 > 1.0) {
         String var4 = com.aspose.slides.ms.System.d2.u9(this.x8);
         var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var4.charAt(0)));
      } else if (this.x8 == 0.0) {
         this.x8 = 0.0;
         return;
      }

      if (this.x8 < 1.0) {
         String var6 = com.aspose.slides.ms.System.d2.u9(this.x8);

         for (int var5 = 0; var5 < var6.length(); var5++) {
            if (var6.charAt(var5) != '0' && var6.charAt(var5) != var1) {
               var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var6.charAt(var5)));
               break;
            }
         }
      }

      if (var3 != 1 && var3 != 2) {
         this.x8 = this.x8 * 2.0 / 5.0;
      } else {
         this.x8 /= 2.0;
      }

      if (!var2) {
         this.x8 = -this.x8;
      }
   }

   private void v8() {
      if (this.h0 != this.c8) {
         if (this.h0 >= 0.0 && this.c8 >= 0.0) {
            this.g7();
         } else if (this.h0 < 0.0 && this.c8 < 0.0) {
            this.v3();
         }
      }

      this.z6();
   }

   private void v3() {
      double var1 = g6z.n5(this.h0, this.c8);
      double var3 = 0.0;
      double var5 = 0.0;
      this.x8 = this.n5().c8().getMajorUnit();
      double[] var7 = new double[]{0.0};
      double[] var8 = new double[]{0.0};
      o9b.n5(var1, var7, var8, this.n5());
      var3 = var7[0];
      var5 = var8[0];
      if (var1 != 0.0 && (float)(this.c8 / var1) >= 5.0F) {
         this.s7 = this.c8;
         this.t2 = this.c8 + var5;
         double var9 = com.aspose.slides.ms.System.q1.n5(var3);
         int var11 = g6z.u3(var9);
         double var12 = 0.0;

         while (var12 > this.s7) {
            var12 = com.aspose.slides.ms.System.q1.n5(var12, var11);
            var12 -= var9;
         }

         if (this.n3 && this.y4) {
            this.s7 = var12 + this.x8;
            this.y4 = false;
         }
      } else {
         if (this.n3 && this.y4) {
            this.y4 = false;
         }

         this.s7 = 0.0;
      }
   }

   private void g7() {
      double var1 = g6z.n5(this.s7, this.t2);
      this.x8 = this.n5().c8().getMajorUnit();
      double var3 = 0.0;
      double var5 = 0.0;
      double[] var7 = new double[]{0.0};
      double[] var8 = new double[]{0.0};
      o9b.n5(var1, var7, var8, this.n5());
      var3 = var7[0];
      var5 = var8[0];
      if (var1 != 0.0 && (float)(this.h0 / var1) >= 5.0F) {
         this.t2 = this.h0;
         this.s7 = this.h0 + var5;
         double var9 = com.aspose.slides.ms.System.q1.n5(var3);
         int var11 = g6z.u3(var9);
         double var12 = 0.0;

         while (var12 < this.t2) {
            var12 = com.aspose.slides.ms.System.q1.n5(var12, var11);
            var12 += var9;
         }

         if (this.n3 && this.y4) {
            this.t2 = var12 - this.x8;
            this.n3 = false;
         }
      } else {
         if (this.n3 && this.y4) {
            this.n3 = false;
         }

         this.t2 = 0.0;
      }
   }

   protected final void j5() {
      double var1 = 1.0E-6;

      for (int var3 = 0; var3 < this.n5.size(); var3++) {
         if (var3 - 1 > 0) {
            if (com.aspose.slides.ms.System.q1.n5(
                     g6z.n5(
                        this.x8,
                        com.aspose.slides.ms.System.q1.n5(
                           g6z.n5(
                              com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(var3).h0(), double.class),
                              com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(var3 - 1).h0(), double.class)
                           )
                        )
                     )
                  )
                  / this.x8
               > var1) {
               this.n5.get_Item(var3).l6(false);
            }
         } else if (var3 + 1 < this.n5.size()
            && com.aspose.slides.ms.System.q1.n5(
                     g6z.n5(
                        this.x8,
                        com.aspose.slides.ms.System.q1.n5(
                           g6z.n5(
                              com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(var3).h0(), double.class),
                              com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(var3 + 1).h0(), double.class)
                           )
                        )
                     )
                  )
                  / this.x8
               > var1) {
            this.n5.get_Item(var3).l6(false);
         }
      }
   }

   @Override
   public float y4() {
      return this.n5(this.e2());
   }

   @Override
   public double e2() {
      double var1 = this.s7;
      double var3 = this.t2;
      double var5 = this.n5().c8().getCrossAt();
      if (this.n5().c8().getCrossType() == 1) {
         var5 = var1;
      }

      if (var5 > var1) {
         var5 = var1;
      }

      if (var5 < var3) {
         var5 = var3;
      }

      if (this.n5(78) || this.n5(79)) {
         var5 = var3;
      }

      return var5;
   }

   @Override
   public List<Float> k7() {
      List var1 = new List();
      float var2 = this.a6() ? this.d5() : this.d2();
      float var3 = (float)(this.n5().j5() / (this.h2() - this.v0()) * var2);
      if (var3 == 0.0F) {
         throw new PptxException("MinorTickMarkElement step can't be equal 0");
      }

      float var4;
      if (!this.n5().c8().isPlotOrderReversed()) {
         var4 = var2;
         var3 = -var3;
      } else {
         var4 = 0.0F;
      }

      float var5 = var4;

      do {
         var1.addItem(var5);
         var5 += var3;
      } while (var5 >= 0.0F && var5 <= var2);

      return var1;
   }

   @Override
   public List<Float> m1() {
      List var1 = new List();

      for (int var2 = this.n5.size() - 1; var2 >= 0; var2--) {
         if (this.n5.get_Item(var2).T_()) {
            double var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(var2).h0(), double.class);
            float var5 = this.n5(var3);
            var1.addItem(var5);
         }
      }

      return var1;
   }
}
