package com.aspose.slides;

class h3 extends a8 {
   private final float l6 = 1.5F;

   public h3(c9v var1, u2w var2) {
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
      this.n5(var1, var3.a6());
      this.n5 = !this.n5(var3.a6(), var2.u3(), var1);
      if (this.n5) {
         this.n5(var2.u3(), var3.a6());
      } else {
         this.n5(var2.u3(), var3.a6(), var1);
      }
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.f2[] var2) {
      if (!this.n5) {
         if (this.h0().x8() != null && com.aspose.slides.internal.v6g.k5.l6(this.h0().x8().t2(), m3o.class)) {
            float var9 = 5.0F;
            float var10 = this.h0().x8().d5() + 5.0F;
            if (var10 > this.a6().getHeight() - (var1[0].k5() + var2[0].k5())) {
               var2[0].l6(var2[0].k5() - (var1[0].k5() + var2[0].k5() + var10 - this.a6().getHeight()));
            }
         }
      } else {
         this.l6(var1, var2);
         float var3 = this.h0().k5(3);
         if (var3 > var1[0].k5()) {
            var2[0].l6(var2[0].k5() - (var3 - var1[0].k5()));
            var1[0].l6(var3);
         }

         float var4 = this.h0().k5(0);
         if (this.l6() != null && this.l6().t9().k5() > 0.0F && com.aspose.slides.internal.v6g.k5.l6(this.l6(), a0k.class)) {
            var4 -= com.aspose.slides.ms.System.q1.l6(this.l6().t9().k5(), com.aspose.slides.internal.v6g.k5.n5(this.l6(), a0k.class).c8);
         }

         if (this.h0().x8() != null) {
            var4 += this.h0().x8().d5();
         }

         if (var1[0].k5() + var2[0].k5() + var4 > this.a6().getHeight()) {
            float var5 = var1[0].k5() + var2[0].k5() + var4 + this.n5(this.a6().getHeight() - var1[0].k5() - var2[0].k5());
            float var6 = var5 - this.a6().getHeight();
            if (this.t2()) {
               float var7 = var1[0].k5() - var3;
               if (var7 > 0.0F) {
                  float var8 = com.aspose.slides.ms.System.q1.l6(var6, var7);
                  var1[0].l6(var1[0].k5() - var8);
                  var6 -= var8;
               }
            }

            if (var6 > 0.0F) {
               var2[0].l6(var2[0].k5() - var6);
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.f2 var2) {
      com.aspose.slides.internal.o9b.w1 var3 = var1.u3();
      com.aspose.slides.internal.o9b.f2 var4 = var2.a6();
      com.aspose.slides.internal.o9b.w1[] var5 = new com.aspose.slides.internal.o9b.w1[]{var1};
      com.aspose.slides.internal.o9b.f2[] var6 = new com.aspose.slides.internal.o9b.f2[]{var2};
      this.u9().n5(this.a6().getPlotArea(), var5, var6);
      var5[0].n5(var1);
      var6[0].l6(var2);
      if (this.l6() != null) {
         this.l6().n3(new z5(var2.l6(), (this.a6().getHeight() - var1.k5()) / 2.0F));
      }

      if (this.u3() != null) {
         this.u3().n3(new z5(var2.l6(), this.a6().getHeight() / 2.0F));
      }

      if (this.h0().x8() != null) {
         if (this.n5() != null) {
            this.n5().n3(new z5(var2.l6(), var2.k5() - var1.k5() / 2.0F));
         }

         if (this.k5() != null) {
            this.k5().n3(new z5(var2.l6(), var2.k5() / 2.0F));
         }
      }

      float var7 = this.h0().x8() == null ? 0.0F : this.h0().x8().d5();
      if (this.h0().k5(3) > var3.k5() || this.h0().k5(0) + var7 > this.a6().getHeight() - (var3.k5() + var4.k5())) {
         var5[0] = var1;
         var6[0] = var2;
         this.u9().n5(this.a6().getPlotArea(), var5, var6);
         var5[0].n5(var1);
         var6[0].l6(var2);
         if (this.n5() != null) {
            this.n5().n3(new z5(this.a6().getWidth(), var2.k5()));
         }

         if (this.k5() != null) {
            this.k5().n3(new z5(this.a6().getWidth(), var2.k5()));
         }
      }

      if (this.h0().x8() == null && this.l6() != null && this.l6().n5().u9() != 0 && p4.n5(this.a6())) {
         var5[0] = var1;
         var6[0] = var2;
         this.u9().n5(this.a6().getPlotArea(), var5, var6);
         var5[0].n5(var1);
         var6[0].l6(var2);
         var2 = new com.aspose.slides.internal.o9b.f2(var2.k5(), var2.k5() - this.u9().c8().d5());
         if (this.n5() != null) {
            this.n5().n3(new z5(this.a6().getWidth(), var2.k5()));
         }

         if (this.k5() != null) {
            this.k5().n3(new z5(this.a6().getWidth(), var2.k5()));
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.f2 var2, z5 var3) {
      com.aspose.slides.internal.o9b.w1 var4 = var1.u3();
      com.aspose.slides.internal.o9b.f2 var5 = var2.a6();
      float var6 = var4.k5();
      float var7 = this.a6().getHeight() - (var4.k5() + var5.k5());
      if (this.l6() != null) {
         float var8 = this.l6().q0();
         if (this.l6().u3() == 3 && this.l6().t9().k5() > var6) {
            this.l6().n3(var6 < var8 ? new z5(var5.l6(), var3.l6() / 2.0F) : new z5(var5.l6(), var6));
         }

         if (this.l6().u3() == 0 && this.l6().t9().k5() > var7) {
            this.l6().n3(var7 < var8 ? new z5(var5.l6(), var3.l6() / 2.0F) : new z5(var5.l6(), var7));
         }
      }

      if (this.u3() != null) {
         float var9 = this.u3().n5().l6().a6();
         if (this.u3().u3() == 3 && this.u3().t9().k5() > var6) {
            this.u3().n3(var6 < var9 ? new z5(var5.l6(), var3.l6() / 2.0F) : new z5(var5.l6(), var6));
         }

         if (this.u3().u3() == 0 && this.u3().t9().k5() > var7) {
            this.u3().n3(var7 < var9 ? new z5(var5.l6(), var3.l6() / 2.0F) : new z5(var5.l6(), var7));
         }
      }
   }

   private float n5(int var1) {
      float var2 = this.h0().k5(var1);
      if (var2 > 0.0F) {
         var2 += 1.5F;
      }

      float var3 = this.h0().n5(var1);
      if (var3 > 0.0F) {
         var3 += this.u9().n5;
      }

      float var4 = com.aspose.slides.ms.System.q1.n5((float)(var2), (float)(var3));
      if (var1 == 1 && this.h0().x8() != null) {
         var4 = com.aspose.slides.ms.System.q1.n5((float)(this.h0().x8().c8() + 12.0F), (float)(var4));
      }

      return var4;
   }

   private float n5(float var1) {
      if (this.l6() == null) {
         return 0.0F;
      }

      if (this.l6().u3() != 0) {
         return 0.0F;
      }

      float var2 = this.l6().t9().k5();
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), a0k.class)) {
         var2 -= ((a0k)this.l6()).c8;
      }

      if (var1 > var2) {
         return 0.0F;
      }

      int var3 = this.l6().n5().c8().getTickLabelPosition();
      if ((var3 == 1 || var3 == 0) && this.c8()) {
         return 0.0F;
      }

      float var4 = this.n5(this.l6(), var1);
      float var5 = 25.0F;
      if (var4 > 75.0F) {
         return 1.5F;
      }

      if (var4 == 0.0F) {
         var4 = this.l6().l6("X").k5() + this.l6().q0();
         var5 = com.aspose.slides.internal.v6g.k5.l6(this.l6(), u7.class) ? 7.0F : 10.0F;
      }

      return (float)com.aspose.slides.internal.c8e.k5.n5(var1 - var4, 1.5, var5);
   }

   private void n5(z5 var1, com.aspose.slides.internal.o9b.f2 var2) {
      z5 var3 = new z5(var1.n5() / 2.0F, var2.k5());
      if (this.n5() != null) {
         this.n5().n3(var3);
      }

      if (this.k5() != null) {
         this.k5().n3(var3);
      }

      z5 var4 = new z5(var2.l6(), this.a6().getHeight() / 2.0F);
      if (this.l6() != null) {
         this.l6().n3(var4);
      }

      if (this.u3() != null) {
         this.u3().n3(var4);
      }
   }

   private void l6(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.f2[] var2) {
      if (this.n5) {
         ChartPlotArea var3 = (ChartPlotArea)this.a6().getPlotArea();
         float var4 = this.n5(1);
         if (var3.getLayoutTargetType() == 0
            && com.aspose.slides.internal.v6g.k5.l6(this.l6(), a0k.class)
            && var4 < var1[0].l6()
            && var1[0].l6() + var2[0].l6() >= this.a6().getWidth()) {
            var2[0].n5(var2[0].l6() + (var1[0].l6() - var4));
            var1[0].n5(var4);
         }

         float var5 = var1[0].l6();
         float var6 = this.h0().n5(3);
         float var7 = this.h0().n5(0);
         float var8 = this.n5(2);
         boolean var9 = this.a6().getWidth() - (var2[0].l6() + var4) > 0.0F;
         boolean var10 = var4 > var5;
         this.n5(var1, var2, var4, var8, var6, var7);
         if (this.h0().x8() != null && var9 && var10) {
            var2[0].n5(var2[0].l6() - (this.h0().x8().c8() - var5));
         }
      }
   }

   private boolean n5(com.aspose.slides.internal.o9b.f2 var1, com.aspose.slides.internal.o9b.w1 var2, z5 var3) {
      if (this.n5(1) > var2.l6()) {
         return false;
      }

      if (this.n5(2) > this.a6().getWidth() - (var2.l6() + var1.l6())) {
         return false;
      }

      if (this.h0().n5(3) > var2.k5()) {
         return false;
      }

      if (this.l6() != null && this.l6().T_()) {
         switch (this.l6().n5().c8().getTickLabelPosition()) {
            case 0:
            case 1:
               return false;
            case 2:
               if (this.a6().getHeight() - (var2.k5() + var1.k5()) < this.u9().n5) {
                  return false;
               }

               if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), m3o.class)
                  && this.l6().n5().m3()
                  && this.l6().n5().z8()
                  && com.aspose.slides.internal.v6g.k5.n5(this.l6(), m3o.class).s7(var3) > this.h0().n5(0)) {
                  return false;
               }
         }

         if (this.l6().n5().u9() == 0 && this.n5(0) > this.a6().getHeight() - (var2.k5() + var1.k5())) {
            float var4 = var1.l6() / this.l6().n5.size();
            g8t[] var5 = this.l6().n5.toArray(new g8t[0]);

            for (g8t var9 : var5) {
               String var10 = var9.s7();
               float var11 = this.l6().k5(var10).l6();
               if (var11 - var4 > 50.0F) {
                  return false;
               }
            }
         }
      }

      return this.u3() == null || !this.u3().T_() || this.u3().n5().c8().getTickLabelPosition() != 1 && this.u3().n5().c8().getTickLabelPosition() != 0;
   }

   private boolean c8() {
      w3 var1 = this.n5();
      if (var1 == null) {
         var1 = this.k5();
      }

      h7x var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h7x.class);
      if (var2 == null) {
         return false;
      }

      if (var2.n5().c8().isLogarithmic()) {
         return false;
      }

      int var3 = com.aspose.slides.ms.System.q1.u9(var2.v0());
      int var4 = com.aspose.slides.ms.System.q1.u9(var2.h2());
      return var3 != 0 && var4 != 0 ? var3 != var4 : false;
   }

   private float n5(w3 var1, float var2) {
      float var3 = 0.0F;

      for (int var4 = 0; var4 < var1.n5.size(); var4++) {
         g8t var5 = var1.n5.get_Item(var4);
         if (!(var5.d5() < 1.0E-6)) {
            float var6 = var5.d5() + var1.q0();
            if (!(var6 + this.u9().n5 > var2) && var3 < var6) {
               var3 = var6;
            }
         }
      }

      return var3;
   }

   private boolean t2() {
      ChartPlotArea var1 = com.aspose.slides.internal.v6g.k5.n5(this.a6().getPlotArea(), ChartPlotArea.class);
      a0k var2 = com.aspose.slides.internal.v6g.k5.n5(this.l6(), a0k.class);
      return var2 == null
         ? false
         : a0k.n5(
            var1,
            this.a6().getHeight(),
            var2.n5().c4(),
            var2.n5().t2(),
            this.l6().t9().k5(),
            com.aspose.slides.ms.System.q1.n5((float)(1.0F), (float)(this.l6().q0())),
            var2.n5.size(),
            var2.d2(),
            var2.l6("X").k5()
         );
   }
}
