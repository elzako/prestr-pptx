package com.aspose.slides;

class q8o extends v6g {
   private final t9z n5;
   private x2k l6;
   private final a0p k5;
   private float u3;
   private float a6;

   @Override
   public boolean T_() {
      return this.n5.t9().y4();
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1) {
      if (this.n3().z1() != null) {
         DataLabel var2 = this.x8().t9().l6();
         int var3 = -1;
         if (var2.getDataLabelFormat().getShowLabelAsDataCallout() && var2.t2() != null && var2.t2().getShapeType() != -1) {
            var3 = var2.t2().getShapeType();
         } else {
            DataLabelCollection var4 = (DataLabelCollection)var2.c8().getLabels();
            if (var4.getDefaultDataLabelFormat().getShowLabelAsDataCallout() && var4.u3() != null && var4.u3().getShapeType() != -1) {
               var3 = ((DataLabelCollection)var2.c8().getLabels()).u3().getShapeType();
            }
         }

         if (var3 != -1) {
            switch (var3) {
               case 117:
                  GeometryPath var5 = m2.n5(this.n3().z1().getWidth(), this.n3().z1().getHeight(), var1.u3());
                  this.n3().z1().setGeometryPath(var5);
            }
         }
      }
   }

   @Override
   protected void V_() {
      if (this.T_()) {
         DataLabel var1 = this.x8().t9().l6();
         var1.n5(this.p8() - this.x8().y4().t2().n3().getX());
         var1.l6(this.f2() - this.x8().y4().t2().n3().getY());
         var1.k5(this.d2());
         var1.u3(this.d5());
      }
   }

   public final boolean h0() {
      if (this.m1()) {
         return false;
      }

      byte var1 = this.n5.t9().t9().getFillFormat().getFillType();
      byte var2 = this.n5.t9().e2().getFillType();
      return (var1 == -1 || var1 == 0) && (var2 == -1 || var2 == 0);
   }

   public int c8() {
      return this.x8().t9().c8();
   }

   public final float t2() {
      return this.u3;
   }

   public final void n5(float var1) {
      this.u3 = var1;
   }

   public float s7() {
      return this.a6;
   }

   public void l6(float var1) {
      this.a6 = var1;
   }

   @Override
   public int O_() {
      return 4;
   }

   public final void n5(boolean var1) {
      this.k5.k5(var1);
   }

   final t9z x8() {
      return this.n5;
   }

   final a0p n3() {
      return this.k5;
   }

   final com.aspose.slides.internal.o9b.y1[] y4() {
      return this.k5.t9();
   }

   public q8o(t9z var1, a0p var2) {
      this.n5 = var1;
      this.k5 = var2;
      if (this.m1()) {
         if (var1.y4().u9().getParentSeriesGroup().getSeries().size() == 1) {
            this.l6 = new x1j(var1);
         } else {
            this.l6 = new q6t(var1.y4());
         }

         this.n5(this.l6);
      }

      this.n5(this.k5);
      this.n5(this.T_());
   }

   public final z5 e2() {
      float var1 = this.y2().d2();
      float var2 = this.y2().d5();
      float var3 = this.u3().getWidth();
      float var4 = this.u3().getHeight();
      if (!com.aspose.slides.ms.System.n1.k5(var3) && !com.aspose.slides.ms.System.n1.k5(var4)) {
         return new z5(var3 * var1, var4 * var2);
      }

      if (this.n5.t9().t4()) {
         var1 *= 0.199F;
      }

      return new z5(var1, var2);
   }

   public final z3y t9() {
      if (this.h0()) {
         z3y var1 = new z3y(this.k5.t9());
         var1.n5(this.i1().u3());
         return var1;
      } else {
         return this.z1();
      }
   }

   public final z3y z1() {
      com.aspose.slides.internal.o9b.w1[] var1 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 12)
      );
      var1[0] = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
      var1[1] = new com.aspose.slides.internal.o9b.w1(this.d2() * 0.25F, 0.0F);
      var1[2] = new com.aspose.slides.internal.o9b.w1(this.d2() * 0.5F, 0.0F);
      var1[3] = new com.aspose.slides.internal.o9b.w1(this.d2() * 0.75F, 0.0F);
      var1[4] = new com.aspose.slides.internal.o9b.w1(this.d2(), 0.0F);
      var1[5] = new com.aspose.slides.internal.o9b.w1(this.d2(), this.d5() / 2.0F);
      var1[6] = new com.aspose.slides.internal.o9b.w1(this.d2(), this.d5());
      var1[7] = new com.aspose.slides.internal.o9b.w1(this.d2() * 0.25F, this.d5());
      var1[8] = new com.aspose.slides.internal.o9b.w1(this.d2() * 0.5F, this.d5());
      var1[9] = new com.aspose.slides.internal.o9b.w1(this.d2() * 0.75F, this.d5());
      var1[10] = new com.aspose.slides.internal.o9b.w1(0.0F, this.d5());
      var1[11] = new com.aspose.slides.internal.o9b.w1(0.0F, this.d5() / 2.0F);
      z3y var2 = new z3y(var1);
      var2.n5(this.i1().u3());
      return var2;
   }

   public final com.aspose.slides.internal.o9b.w1[] t4() {
      return new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(this.p8(), this.i1().k5()), new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.i1().k5())
      };
   }

   public final com.aspose.slides.internal.o9b.w1[] q0() {
      return new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(this.p8(), this.i1().k5()), new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.i1().k5())
      };
   }

   public final com.aspose.slides.internal.o9b.w1[] z3() {
      return new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2() / 2.0F, this.f2()),
         new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2() / 2.0F, this.f2() + this.d5())
      };
   }

   public final com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.y1 var2) {
      com.aspose.slides.internal.o9b.w1 var3 = x5h.n5(var1.u3(), -this.d2() / 2.0F, -this.d5() / 2.0F).u3();
      return this.l6(var3.u3(), var2.y4());
   }

   public final com.aspose.slides.internal.o9b.w1 l6(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.y1 var2) {
      com.aspose.slides.internal.o9b.w1 var3 = x5h.n5(var1.u3(), this.d2(), this.d5(), var2.y4(), true).u3();
      if (this.u3 == 0.0F && this.a6 == 0.0F) {
         return var3;
      }

      var3.n5(var3.l6() + this.u3);
      var3.l6(var3.k5() + this.a6);
      return x5h.n5(var3.u3(), this.d2(), this.d5(), var2.y4(), false);
   }

   @Override
   protected void n5(z5 var1) {
      this.k5.n3(var1);
      if (this.m1()) {
         int var2 = this.l6.u3();
         float var3 = this.n3().s7().a6();
         float var4 = (float)com.aspose.slides.ms.System.q1.n5((double)(var3 / 3.0F), 0);
         if (var2 == 0) {
            this.l6.n3(new z5(var4, var4));
         } else {
            this.l6.n3(new z5(h9p.n5(var2), var4));
         }
      }

      float var5 = this.k5.d2();
      if (this.m1()) {
         var5 += this.l6.d2();
         if (this.l6.u3() == 0) {
            var5 += 8.0F;
         }
      }

      this.k5(var5);
      this.u3(this.k5.d5());
      if (!this.n5.t9().n3()) {
         this.u3 = this.u3().getX() * this.y2().d2();
         this.a6 = this.u3().getY() * this.y2().d5();
      }
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = 0.0F;
      if (this.m1()) {
         if (this.l6.u3() == 0) {
            var2 += 8.0F;
         }

         var2 += this.l6.d2() + 2.0F;
      }

      var2 += this.k5.d2();
      this.k5.u9(this.d5() / 2.0F - this.k5.d5() / 2.0F);
      float var3 = this.d2() / 2.0F - var2 / 2.0F;
      if (this.m1()) {
         if (this.l6.u3() == 0) {
            var3 += 8.0F;
         }

         this.l6.u9((float)(this.k5.s7().a6() / 2.0 - this.l6.d5() / 2.0));
         this.l6.a6(var3 + 6.0F);
         this.l6.t1();
         var3 += this.l6.d2() + h9p.n5(this.l6.u3(), this.k5.s7().a6());
      }

      this.k5.a6(var3);
      this.k5.t1();
   }

   @Override
   protected void u3(z5 var1) {
   }

   private DataLabel u3() {
      return this.n5.t9().l6();
   }

   private boolean m1() {
      return this.n5.t9().l6().getDataLabelFormat().getShowLegendKey();
   }
}
