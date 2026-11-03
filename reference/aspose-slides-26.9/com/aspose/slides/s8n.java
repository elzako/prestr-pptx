package com.aspose.slides;

class s8n extends a8 {
   public s8n(c9v var1, u2w var2) {
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
      this.n5(var3.a6(), var1.l6(), var1.n5());
      var4[0] = var2;
      var5[0] = var3;
      this.u9().n5(this.a6().getPlotArea(), var4, var5);
      var4[0].n5(var2);
      var5[0].l6(var3);
      this.n5(var3.a6(), var1.l6(), var1.n5());
   }

   private void n5(com.aspose.slides.internal.o9b.f2 var1, float var2, float var3) {
      if (this.l6() != null) {
         this.l6().n3(new z5(var1.l6(), var2 / 2.0F));
      }

      if (this.n5() != null) {
         this.n5().n3(new z5(var3 / 2.0F, var1.k5()));
      }

      if (this.u3() != null) {
         this.u3().n3(new z5(var1.l6(), var2 / 2.0F));
      }

      if (this.k5() != null) {
         this.k5().n3(new z5(var3 / 2.0F, var1.k5()));
      }

      if (this.h0().c8() != null) {
         this.h0().c8().n3(new z5(var1.l6(), var1.k5()));
      }

      if (this.h0().t2() != null) {
         this.h0().t2().n3(new z5(this.h0().c8().d2(), this.h0().c8().d5() / 2.0F));
      }

      if (this.h0().s7() != null) {
         this.h0().s7().n3(new z5(this.h0().c8().d2(), this.h0().c8().d5() / 2.0F));
      }
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.f2[] var2) {
      float var3 = this.u9().n5;
      float var4 = com.aspose.slides.ms.System.q1.n5(
         (float)(this.h0().k5(1)), (float)((this.h0().u3() == null || !this.h0().u3().T_()) && (this.h0().u9() == null || !this.h0().u9().T_()) ? 0.0F : this.h0().n5(1) + var3
      ));
      float var5 = com.aspose.slides.ms.System.q1.n5(
         (float)(this.h0().k5(2)), (float)((this.l6() == null || !this.l6().T_()) && (this.u3() == null || !this.u3().T_()) ? 0.0F : this.h0().n5(2) + var3
      ));
      float var6 = com.aspose.slides.ms.System.q1.n5((float)(this.h0().k5(3)), (float)(this.h0().n5(3)));
      float var7 = com.aspose.slides.ms.System.q1.n5((float)(this.h0().k5(0)), (float)(this.h0().n5(0)));
      var4 = com.aspose.slides.ms.System.q1.n5((float)(var4), (float)(this.h0().u3(1)));
      var5 = com.aspose.slides.ms.System.q1.n5((float)(var5), (float)(this.h0().u3(2)));
      var6 = com.aspose.slides.ms.System.q1.n5((float)(var6), (float)(this.h0().u3(3)));
      var7 = com.aspose.slides.ms.System.q1.n5((float)(var7), (float)(this.h0().u3(0)));
      this.n5(var1, var2, var4, var5, var6, var7);
   }
}
