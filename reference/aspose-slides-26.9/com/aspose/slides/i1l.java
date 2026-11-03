package com.aspose.slides;

class i1l extends v6g {
   private h2v l6;
   private h2v k5;
   private h2v u3;
   private h2v[] a6;
   private g3y u9;
   w3 n5;
   private z4d h0;

   @Override
   public int O_() {
      return 4;
   }

   private boolean u3() {
      return this.k5 != null && this.u3 != null;
   }

   public i1l(g3y var1, h2v[] var2, w3 var3) {
      this.a6 = var2;
      this.u9 = var1;
      this.n5 = var3;
      this.h0 = new z4d();
      this.n5(this.h0);
   }

   @Override
   protected void n5(z5 var1) {
      double var2 = this.n5.d2() / this.u9.u9().getDataPoints().size();
      float var4 = this.u9.u9().getParentSeriesGroup().getUpDownBars().getGapWidth() / 100.0F;
      this.k5((float)(var2 / (1.0F + var4)));
      this.l6 = this.h0();
      this.k5 = this.c8();
      this.u3 = this.t2();
      if (this.u3()) {
         this.u3(com.aspose.slides.ms.System.q1.n5(this.u3.f2() - this.k5.f2()));
      }

      this.h0.n3(var1);
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void l6(z5 var1) {
      if (this.u3()) {
         this.h0.a6(this.l6.p8() - this.d2() / 2.0F);
         this.h0.u9(this.k5.f2() <= this.u3.f2() ? this.k5.f2() : this.u3.f2());
         com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(this.h0.p8(), this.h0.f2(), this.d2(), this.d5());
         com.aspose.slides.internal.o9b.y1 var3 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1.n5(), var1.l6());
         var2.n5(var3.y4());
         if (var2.u3()) {
            this.h0 = null;
         } else {
            this.h0.a6(var2.a6());
            this.h0.u9(var2.t2());
            this.k5(var2.s7());
            this.u3(var2.k5());
         }
      }

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   private h2v h0() {
      h2v var1 = null;

      for (h2v var5 : this.a6) {
         if (var5 != null && !var5.e2().c8()) {
            if (var1 == null) {
               var1 = var5;
            } else if (var5.f2() < var1.f2()) {
               var1 = var5;
            }
         }
      }

      return var1;
   }

   private h2v c8() {
      for (int var1 = 0; var1 < this.a6.length; var1++) {
         if (this.a6[var1].T_()) {
            return this.a6[var1];
         }
      }

      return null;
   }

   private h2v t2() {
      for (int var1 = this.a6.length - 1; var1 >= 0; var1--) {
         if (this.a6[var1].T_()) {
            return this.a6[var1];
         }
      }

      return null;
   }

   @Override
   protected void l6() {
      if (this.u3()) {
         if (this.h0 != null) {
            com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.h0.p8(), this.h0.f2(), this.d2(), this.d5());
            boolean var2 = this.u9.l6(var1.y4(), this.k5.f2() > this.u3.f2());
            if (!var2) {
               this.u9.n5(var1.y4(), this.k5.f2() > this.u3.f2());
            }
         }
      }
   }
}
