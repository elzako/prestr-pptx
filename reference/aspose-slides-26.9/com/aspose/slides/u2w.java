package com.aspose.slides;

class u2w extends k2p {
   private e2p l6;
   private c5w k5;
   private v6g u3;
   private c9v a6;
   private f3c u9;
   int n5 = 6;
   private int h0 = 12;

   public u2w(n1g var1) {
      super(var1);
      if (var1.e2().size() != 0 || var1.t9().size() != 0) {
         if (var1.n3().hasTitle()) {
            this.l6 = new e2p(var1);
            this.n5(this.l6);
         }

         if (var1.n3().hasLegend()) {
            this.k5 = new c5w(var1);
            this.n5(this.k5);
         }

         this.a6 = new c9v(this);
         this.n5(this.a6);
         this.u3 = new p0z(var1, this.a6);
         this.n5(this.u3);
         this.u9 = new f3c(var1);
         this.n5(this.u9);
         if (var1.n3().getType() == 74) {
            this.h0 = 6;
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      if (this.u3().e2().size() != 0 || this.u3().t9().size() != 0) {
         if (this.l6 != null) {
            this.l6.n3(this.u9(var1));
         }

         if (this.k5 != null) {
            this.k5.n3(this.h0(var1));
         }

         a9v var2 = this.a6(var1);
         this.a6.n3(var2);
         this.u3.n3(this.k5(var1));
         this.u9.n3(new z5(this.d2(), this.d5()));
      }
   }

   @Override
   protected void l6(z5 var1) {
      if (this.u3().e2().size() != 0 || this.u3().t9().size() != 0) {
         if (this.l6 != null) {
            a9v var2 = this.u9(var1);
            this.l6.a6(var2.u3());
            this.l6.u9(var2.a6());
            this.l6.t1();
         }

         if (this.k5 != null) {
            o3t var7 = this.h0(var1);
            this.k5.a6(var7.u3());
            this.k5.u9(var7.a6());
            this.k5.t1();
         }

         if (com.aspose.slides.internal.v6g.k5.n5(this.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
            a9v var8 = this.a6(var1);
            var8 = this.a6.n5(var8);
            this.a6.a6(var8.u3());
            this.a6.u9(var8.a6());
            this.u3.a6(this.a6.b3() + this.a6.u3(1));
            this.u3.u9(this.a6.o0() + this.a6.u3(3));
            if (this.a6.c8() != null) {
               this.u3.a6(this.a6.b3() + this.a6.c8().b3());
               this.u3.u9(this.a6.o0() + this.a6.c8().o0());
            }
         } else {
            a9v var10 = this.k5(var1);
            this.u3.a6(var10.u3());
            this.u3.u9(var10.a6());
            this.a6.a6(this.u3.b3() - this.a6.u3(1));
            if (this.a6.b3() < 0.0F && com.aspose.slides.internal.v6g.k5.n5(this.u3, p0z.class).u3().x8() != null) {
               this.a6.a6(0.0F);

               for (v6g var6 : this.a6.a0()) {
                  var6.a6(0.0F);
               }
            }

            this.a6.u9(this.u3.o0() - this.a6.u3(3));
         }

         this.a6.t1();
         this.u3.t1();
         this.u9.t1();
      }
   }

   private a9v u9(z5 var1) {
      com.aspose.slides.internal.o9b.w1 var2 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2();
      com.aspose.slides.internal.o9b.w1[] var4 = new com.aspose.slides.internal.o9b.w1[]{var2};
      com.aspose.slides.internal.o9b.f2[] var5 = new com.aspose.slides.internal.o9b.f2[]{var3};
      this.n5(this.u3().n3().getChartTitle(), var4, var5);
      var4[0].n5(var2);
      var5[0].l6(var3);
      float var6 = this.l6.d2() == 0.0F ? var1.n5() * 0.8F : this.l6.d2();
      float var7 = this.l6.d5() == 0.0F ? var1.l6() * 0.46F : this.l6.d5();
      if (com.aspose.slides.ms.System.n1.k5(var2.l6()) && com.aspose.slides.ms.System.n1.k5(var2.k5())) {
         var2 = new com.aspose.slides.internal.o9b.w1((var1.n5() - var6) / 2.0F, this.n5);
      }

      if (var2.l6() + this.l6.d2() > this.d2()) {
         var2.n5(this.d2() - this.l6.d2());
      }

      return new a9v(var6, var7, var2.l6(), var2.k5());
   }

   private o3t h0(z5 var1) {
      ILegend var2 = this.u3().n3().getLegend();
      com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2();
      com.aspose.slides.internal.o9b.w1[] var5 = new com.aspose.slides.internal.o9b.w1[]{var3};
      com.aspose.slides.internal.o9b.f2[] var6 = new com.aspose.slides.internal.o9b.f2[]{var4};
      this.n5(var2, var5, var6);
      var5[0].n5(var3);
      var6[0].l6(var4);
      float var7;
      float var8;
      float var10;
      float var11;
      if (this.k5.c8()) {
         var7 = var1.n5() * 0.35F;
         var8 = var2.getPosition() == 1 ? this.n5 : var1.n5() - this.k5.d2() - this.n5;
         float var9 = this.l6 != null && !this.l6.h0() ? this.l6.d5() + this.n5 : 0.0F;
         var11 = var9 + this.n5;
         var10 = var1.l6() - var11 - this.n5;
         if (ChartTypeCharacterizer.isChartTypeColumn(this.u3().n3().getType())) {
            var11 += this.n5;
            var10 -= 2 * this.n5;
         }

         if (var2.getPosition() != 4) {
            var11 += (var10 - this.k5.d5()) / 2.0F;
         } else if (this.k5.d5() > var10 / 3.0F) {
            var11 += this.n5;
         }
      } else {
         var10 = var1.l6() * 0.6666F;
         if (this.l6 != null && !this.l6.h0()) {
            var10 -= this.l6.d5();
         }

         if (ChartTypeCharacterizer.isChartTypePie(this.u3().n3().getType())) {
            var7 = var1.n5() * 0.87F;
         } else {
            var7 = var1.n5() * 0.9F;
         }

         var8 = (var1.n5() - this.k5.d2()) / 2.0F;
         if (var2.getPosition() == 0) {
            var11 = var1.l6() - this.n5 - this.k5.d5();
         } else {
            var11 = this.n5 + (this.l6 != null && !this.l6.h0() ? this.l6.d5() + this.n5 : 0.0F);
         }
      }

      if (!com.aspose.slides.ms.System.n1.k5(var3.l6()) && !com.aspose.slides.ms.System.n1.k5(var3.k5())) {
         var8 = var3.l6() + 1.0F;
         var11 = var3.k5();
         if (var8 + var4.l6() > this.d2()) {
            var8 = this.d2() - var4.l6();
         }

         if (var11 + var4.k5() > this.d5()) {
            var11 = this.d5() - var4.k5();
         }
      }

      return new o3t(var7, var10, var8, var11, var4.a6());
   }

   final a9v k5(z5 var1) {
      if (!com.aspose.slides.internal.v6g.k5.n5(this.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
         com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.f2 var9 = new com.aspose.slides.internal.o9b.f2();
         com.aspose.slides.internal.o9b.w1[] var10 = new com.aspose.slides.internal.o9b.w1[]{var8};
         com.aspose.slides.internal.o9b.f2[] var11 = new com.aspose.slides.internal.o9b.f2[]{var9};
         this.n5(this.u3().n3().getPlotArea(), var10, var11);
         var10[0].n5(var8);
         var11[0].l6(var9);
         if (!com.aspose.slides.internal.o9b.f2.k5(var9, com.aspose.slides.internal.o9b.f2.n5)
            || com.aspose.slides.ms.System.n1.k5(var8.l6())
            || com.aspose.slides.ms.System.n1.k5(var8.k5())) {
            return this.a6(var1);
         } else if (this.u3().n3().getPlotArea().getLayoutTargetType() == 0) {
            float var6 = this.a6.u3() == null ? var9.l6() : this.a6.u3().d2();
            float var7 = this.a6.a6() == null ? var9.k5() : this.a6.a6().d5();
            return new a9v(var6, var7, var8.l6(), var8.k5());
         } else {
            var9.n5(var9.l6() - this.a6.a6(1) - this.a6.a6(2));
            var9.l6(var9.k5() - this.a6.a6(3) - this.a6.a6(0));
            var8.n5(var8.l6() + this.a6.a6(1));
            var8.l6(var8.k5() + this.a6.a6(3));
            return new a9v(var9.l6(), var9.k5(), var8.l6(), var8.k5());
         }
      } else {
         a9v var2 = this.a6(var1);
         z5 var3 = this.a6.y4();
         float var4 = var2.u3() + this.a6.u3(1);
         float var5 = var2.a6() + this.a6.u3(3);
         return new a9v(var3.n5(), var3.l6(), var4, var5);
      }
   }

   final a9v a6(z5 var1) {
      if (!com.aspose.slides.internal.v6g.k5.n5(this.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()
         && this.u3().n3().getPlotArea().getLayoutTargetType() == 1) {
         com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.f2 var8 = new com.aspose.slides.internal.o9b.f2();
         com.aspose.slides.internal.o9b.w1[] var9 = new com.aspose.slides.internal.o9b.w1[]{var7};
         com.aspose.slides.internal.o9b.f2[] var10 = new com.aspose.slides.internal.o9b.f2[]{var8};
         this.n5(this.u3().n3().getPlotArea(), var9, var10);
         var9[0].n5(var7);
         var10[0].l6(var8);
         return com.aspose.slides.internal.o9b.f2.k5(var8, com.aspose.slides.internal.o9b.f2.n5)
               && !com.aspose.slides.ms.System.n1.k5(var7.l6())
               && !com.aspose.slides.ms.System.n1.k5(var7.k5())
            ? new a9v(var8.l6(), var8.k5(), var7.l6(), var7.k5())
            : new a9v(var1.n5(), var1.l6(), 0.0F, 0.0F);
      }

      float var2 = 0.0F;
      float var3 = 0.0F;
      float var4 = var1.n5();
      float var5 = var1.l6();
      if (this.u3().y4().get_Item(0).u9().getType() == 75) {
         this.h0 = 6;
      }

      if (this.l6 != null && !this.l6.h0()) {
         float var6 = this.n5 + this.l6.d5();
         var3 = var6;
         var5 -= var6;
      }

      if (this.k5 != null && !this.k5.h0()) {
         switch (this.k5.u3()) {
            case 0:
               var5 -= this.n5 + this.k5.d5();
               break;
            case 1:
               float var13 = this.n5 + this.k5.d2();
               var2 = var13;
               var4 -= var13;
               break;
            case 2:
               var4 -= this.n5 + this.k5.d2();
               break;
            case 3:
               float var12 = this.n5 + this.k5.d5();
               var5 -= var12;
               var3 += var12;
               break;
            case 4:
               var4 -= this.n5 + this.k5.d2();
               float var11;
               if (this.k5.d5() < var5 / 3.0F) {
                  var11 = this.k5.d5();
               } else {
                  var11 = this.n5;
               }

               var3 += var11;
               var5 -= var11;
         }
      }

      a9v var14 = new a9v(var4, var5, var2, var3);
      return this.n5(var14);
   }

   final void n5(ILayoutable var1, com.aspose.slides.internal.o9b.w1[] var2, com.aspose.slides.internal.o9b.f2[] var3) {
      var2[0] = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
      com.aspose.slides.internal.o9b.f2.n5.l6(var3[0]);
      float var4 = var1.getX();
      float var5 = var1.getY();
      float var6 = var1.getWidth();
      float var7 = var1.getHeight();
      float var8 = this.d2();
      float var9 = this.d5();
      if (!com.aspose.slides.ms.System.n1.k5(var4) && !com.aspose.slides.ms.System.n1.k5(var5)) {
         var2[0] = new com.aspose.slides.internal.o9b.w1(var4 * var8, var5 * var9);
      }

      if (!com.aspose.slides.ms.System.n1.k5(var6) && !com.aspose.slides.ms.System.n1.k5(var7)) {
         var3[0] = new com.aspose.slides.internal.o9b.f2(var6 * var8, var7 * var9);
      }

      ChartPlotArea var10 = com.aspose.slides.internal.v6g.k5.n5(var1, ChartPlotArea.class);
      if (var10 != null && this.u3().n3().getPlotArea().getLayoutTargetType() == 0) {
         if (com.aspose.slides.internal.v6g.k5.n5(this.u3, p0z.class).u3().x8() != null) {
            this.l6(var1, var2, var3);
         } else {
            this.l6(null, var2, var3);
         }
      }
   }

   final p0z h0() {
      return (p0z)this.u3;
   }

   final c5w c8() {
      return this.k5;
   }

   private void l6(ILayoutable var1, com.aspose.slides.internal.o9b.w1[] var2, com.aspose.slides.internal.o9b.f2[] var3) {
      float var4 = this.d2();
      float var5 = this.d5();
      if (var2[0].l6() + var3[0].l6() > var4) {
         var2[0].n5(var2[0].l6() - (var2[0].l6() + var3[0].l6() - var4));
      }

      if (var2[0].l6() < 0.0F) {
         var2[0].n5(0.0F);
         var3[0].n5(var4);
      }

      if (var2[0].k5() + var3[0].k5() > var5) {
         var2[0].l6(var2[0].k5() - (var2[0].k5() + var3[0].k5() - var5));
      }

      if (var2[0].k5() < 0.0F) {
         var2[0].l6(0.0F);
         var3[0].l6(var5);
      }

      if (this.a6.x8() != null && this.u3().n3().getPlotArea().getHeight() >= 1.0F) {
         var3[0].l6(var3[0].k5() - this.a6.x8().d5());
      }

      this.a6.n3().n5(var2, var3);
      if (var1 != null) {
         var1.setX(var2[0].l6() / var4);
         var1.setY(var2[0].k5() / var5);
         var1.setWidth(var3[0].l6() / var4);
         var1.setHeight(var3[0].k5() / var5);
      }
   }

   private a9v n5(a9v var1) {
      return new a9v(var1.n5() - this.h0 * 2, var1.l6() - this.h0 * 2, var1.u3() + this.h0, var1.a6() + this.h0);
   }
}
