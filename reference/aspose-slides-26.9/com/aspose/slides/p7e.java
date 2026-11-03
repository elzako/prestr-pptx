package com.aspose.slides;

class p7e extends v6g {
   private w3 n5;
   private boolean l6;
   private float k5;

   public p7e(w3 var1, boolean var2, float var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public int O_() {
      return 2;
   }

   public final float u3() {
      return this.k5;
   }

   @Override
   protected void n5(z5 var1) {
      if (!this.t2()) {
         if (this.n5.a6()) {
            this.k5(var1.n5());
            this.u3(1.0F);
         } else {
            this.k5(1.0F);
            this.u3(var1.l6());
         }
      } else {
         this.k5(this.u3() * 2.0F);
         this.u3(this.u3() * 2.0F);
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void l6() {
      if (!this.t2()) {
         this.c8();
      } else {
         this.h0();
      }
   }

   private void h0() {
      double var1 = (Math.PI * 2) / this.n5.n3().n5.size();
      double var3 = this.d2() / 2.0F;
      double var5 = this.d5() / 2.0F;
      double var7 = Math.PI / 2;
      double var9 = this.d2() / 2.0F;
      com.aspose.slides.internal.o9b.w1 var11 = com.aspose.slides.internal.o9b.w1.n5.u3();

      for (int var12 = 0; var12 < this.n5.n3().n5.size(); var12++) {
         double var13 = var3 + var9 * com.aspose.slides.ms.System.q1.c8(var7);
         double var15 = var5 - var9 * com.aspose.slides.ms.System.q1.h0(var7);
         com.aspose.slides.internal.o9b.w1 var17 = new com.aspose.slides.internal.o9b.w1((float)var13, (float)var15);
         if (var12 == 0) {
            double var18 = var3 + var9 * com.aspose.slides.ms.System.q1.c8(var7 + var1);
            double var20 = var5 - var9 * com.aspose.slides.ms.System.q1.h0(var7 + var1);
            var11 = new com.aspose.slides.internal.o9b.w1((float)var18, (float)var20);
         }

         if (com.aspose.slides.ms.System.q1.n5(var17.l6() - var11.l6()) > 1.0F || com.aspose.slides.ms.System.q1.n5(var17.k5() - var11.k5()) > 1.0F) {
            if (this.l6) {
               this.n5.n5().l6(this.p8() + (float)var13, this.f2() + (float)var15, this.p8() + var11.l6(), this.f2() + var11.k5());
            } else {
               this.n5.n5().k5(this.p8() + (float)var13, this.f2() + (float)var15, this.p8() + var11.l6(), this.f2() + var11.k5());
            }

            var17.n5(var11);
         }

         var7 -= var1;
      }
   }

   private void c8() {
      if (this.n5.a6()) {
         if (this.l6) {
            this.n5.n5().l6(this.p8(), this.f2(), this.p8() + this.d2(), this.f2());
         } else {
            this.n5.n5().k5(this.p8(), this.f2(), this.p8() + this.d2(), this.f2());
         }
      } else if (this.l6) {
         this.n5.n5().l6(this.p8(), this.f2(), this.p8(), this.f2() + this.d5());
      } else {
         this.n5.n5().k5(this.p8(), this.f2(), this.p8(), this.f2() + this.d5());
      }
   }

   private boolean t2() {
      return !this.n5.l6.isEmpty() && ChartTypeCharacterizer.isChartTypeRadar(this.n5.l6.get_Item(0).u9().getType());
   }
}
