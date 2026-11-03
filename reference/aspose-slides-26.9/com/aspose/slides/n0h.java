package com.aspose.slides;

class n0h extends a8 {
   public n0h(c9v var1, u2w var2) {
      super(var1, var2);
   }

   @Override
   void n5(z5 var1) {
      com.aspose.slides.internal.o9b.w1 var2 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2();
      com.aspose.slides.internal.o9b.w1[] var4 = new com.aspose.slides.internal.o9b.w1[]{var2};
      com.aspose.slides.internal.o9b.f2[] var5 = new com.aspose.slides.internal.o9b.f2[]{var3};
      this.u9().n5(this.a6().getPlotArea(), var4, var5);
      var4[0].n5(var2);
      var5[0].l6(var3);
      boolean var6 = this.c8() && this.t2() && this.s7();
      if (this.n5() != null) {
         this.n5().n3(new z5(var6 ? var2.l6() : var1.n5() / 2.0F, var3.k5()));
      }

      if (this.k5() != null) {
         this.k5().n3(new z5(var6 ? var2.l6() : var1.n5() / 2.0F, var3.k5()));
      }

      if (this.l6() != null) {
         this.l6().n3(new z5(var3.l6(), var1.l6() / 2.0F));
      }

      if (this.u3() != null) {
         this.u3().n3(new z5(var3.l6(), var1.l6() / 2.0F));
      }

      float var7 = com.aspose.slides.ms.System.q1.n5((float)(this.h0().k5(3)), (float)(this.h0().n5(3) > 0.0F ? this.h0().n5(3) + this.u9().n5 : 0.0F));
      float var8 = com.aspose.slides.ms.System.q1.n5((float)(this.h0().k5(0)), (float)(this.h0().n5(0) > 0.0F ? this.h0().n5(0) + this.u9().n5 : 0.0F));
      float var9 = this.h0().n5(1);
      float var10 = this.h0().n5(2);
      this.n5 = var9 > var2.l6()
         || var10 > this.a6().getWidth() - (var2.l6() + var3.l6())
         || var7 > var2.k5()
         || var8 > this.a6().getHeight() - (var2.k5() + var3.k5());
      if (this.n5() != null && this.n5().T_()) {
         if (this.n5().n5().c8().getTickLabelPosition() == 1 || this.n5().n5().c8().getTickLabelPosition() == 0) {
            this.n5 = true;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(this.n5(), u7.class) && com.aspose.slides.internal.v6g.k5.n5(this.n5(), u7.class).h0(var1) > var9) {
            this.n5 = true;
         }
      }

      if (this.k5() != null && this.k5().T_() && (this.k5().n5().c8().getTickLabelPosition() == 1 || this.k5().n5().c8().getTickLabelPosition() == 0)) {
         this.n5 = true;
      }

      if (this.n5) {
         this.n5(var2.u3(), var3.a6());
      } else {
         this.n5(var2.u3(), var3.a6(), var1);
      }
   }

   private boolean c8() {
      return this.a6().getPlotArea().getX() > 0.1 && this.a6().getPlotArea().getX() < this.a6().getPlotArea().getWidth();
   }

   private boolean t2() {
      return this.a6().getPlotArea().getRight() < 1.0F;
   }

   private boolean s7() {
      return this.l6() == null || !this.l6().n5().c8().isVisible() || this.l6().T_() && this.a6().getPlotArea().getBottom() < 1.0F;
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.f2 var2) {
      com.aspose.slides.internal.o9b.w1 var3 = var1.u3();
      com.aspose.slides.internal.o9b.f2 var4 = var2.a6();
      com.aspose.slides.internal.o9b.w1[] var5 = new com.aspose.slides.internal.o9b.w1[]{var1};
      com.aspose.slides.internal.o9b.f2[] var6 = new com.aspose.slides.internal.o9b.f2[]{var2};
      this.u9().n5(this.a6().getPlotArea(), var5, var6);
      var5[0].n5(var1);
      var6[0].l6(var2);
      boolean var7 = this.c8() && this.t2() && this.s7();
      if (this.n5() != null) {
         this.n5().n3(new z5(var7 ? var1.l6() : this.a6().getWidth() / 2.0F, var2.k5()));
      }

      if (this.k5() != null) {
         this.k5().n3(new z5(var7 ? var1.l6() : this.a6().getWidth() / 2.0F, var2.k5()));
      }

      if (this.h0().k5(1) > var3.l6() || this.h0().k5(2) > this.a6().getWidth() - (var3.l6() + var4.l6())) {
         var5[0] = var1;
         var6[0] = var2;
         this.u9().n5(this.a6().getPlotArea(), var5, var6);
         var5[0].n5(var1);
         var6[0].l6(var2);
         if (this.l6() != null) {
            this.l6().n3(new z5(var2.l6(), this.a6().getHeight()));
         }

         if (this.u3() != null) {
            this.u3().n3(new z5(var2.l6(), this.a6().getHeight()));
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.f2 var2, z5 var3) {
      com.aspose.slides.internal.o9b.w1 var4 = var1.u3();
      com.aspose.slides.internal.o9b.f2 var5 = var2.a6();
      float var6 = var4.l6();
      float var7 = this.a6().getWidth() - (var4.l6() + var5.l6());
      if (this.n5() != null) {
         float var8 = this.n5().n5().l6().a6();
         if (this.n5().u3() == 1 && this.n5().t9().l6() > var6) {
            if (var6 < var8) {
               this.n5().n3(new z5(var3.n5() / 2.0F, var5.k5()));
            } else {
               this.n5().n3(new z5(var6, var5.k5()));
            }
         }

         if (this.n5().u3() == 2 && this.n5().t9().l6() > var7) {
            if (var7 < var8) {
               this.n5().n3(new z5(var3.n5() / 2.0F, var5.k5()));
            } else {
               this.n5().n3(new z5(var7, var5.k5()));
            }
         }
      }

      if (this.k5() != null) {
         float var9 = this.k5().n5().l6().a6();
         if (this.k5().u3() == 1 && this.k5().t9().l6() > var6) {
            if (var6 < var9) {
               this.k5().n3(new z5(var3.n5() / 2.0F, var5.k5()));
            } else {
               this.k5().n3(new z5(var6, var5.k5()));
            }
         }

         if (this.k5().u3() == 2 && this.k5().t9().l6() > var7) {
            if (var7 < var9) {
               this.k5().n3(new z5(var3.n5() / 2.0F, var5.k5()));
            } else {
               this.k5().n3(new z5(var7, var5.k5()));
            }
         }
      }
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.f2[] var2) {
      float var3 = this.u9().n5;
      float var4 = this.h0().n5(1) > 0.0F ? this.h0().n5(1) + var3 : 0.0F;
      float var5 = this.h0().n5(2) > 0.0F ? this.h0().n5(2) + var3 : 0.0F;
      if (this.n5() != null && this.n5().T_() && (this.n5().n5().c8().getTickLabelPosition() == 1 || this.n5().n5().c8().getTickLabelPosition() == 0)) {
         if (this.n5().z3() == 1) {
            var4 = com.aspose.slides.ms.System.q1.n5((float)(var4), (float)(this.h0().k5(1)));
         }

         if (this.n5().z3() == 2) {
            var5 = com.aspose.slides.ms.System.q1.n5((float)(var5), (float)(this.h0().k5(2)));
         }
      }

      float var6 = com.aspose.slides.ms.System.q1.n5((float)(this.h0().k5(3)), (float)(this.h0().n5(3) > 0.0F ? this.h0().n5(3) + var3 : 0.0F));
      float var7 = com.aspose.slides.ms.System.q1.n5((float)(this.h0().k5(0)), (float)(this.h0().n5(0) > 0.0F ? this.h0().n5(0) + var3 : 0.0F));
      if (this.n5) {
         this.n5(var1, var2, var4, var5, var6, var7);
         float var8 = this.h0().k5(1);
         if (var8 > var1[0].l6()) {
            var2[0].n5(var2[0].l6() - (var8 - var1[0].l6()));
            var1[0].n5(var8);
         }

         float var9 = this.h0().k5(2);
         if (var1[0].l6() + var2[0].l6() + var9 > this.a6().getWidth()) {
            var2[0].n5(var2[0].l6() - (var1[0].l6() + var2[0].l6() + var9 - this.a6().getWidth()));
         }
      }
   }
}
