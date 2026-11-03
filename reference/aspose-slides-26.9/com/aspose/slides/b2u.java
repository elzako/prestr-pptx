package com.aspose.slides;

class b2u extends s5n {
   public b2u(
      com.aspose.slides.internal.x4g.s7 var1, float var2, float var3, int var4, n6u var5, com.aspose.slides.ms.System.o5<com.aspose.slides.internal.s6.s0> var6
   ) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected com.aspose.slides.internal.s6.f2 l6() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      if (u6p.k5(this.h0)) {
         var1.n5(new com.aspose.slides.internal.o9b.y1(this.k5(), 0.0F, this.a6(), com.aspose.slides.ms.System.q1.n5(this.u3)));
         if (this.a6.l6()) {
            return com.aspose.slides.internal.s6.y1.n5(
               var1, this.n5, new com.aspose.slides.ms.System.o5<>(new com.aspose.slides.internal.s6.s0(this.a6.n5().n5(), this.k5))
            );
         }
      }

      if (u6p.l6(this.h0)) {
         var1.n5(new com.aspose.slides.internal.o9b.y1(this.u3(), 0.0F, this.u9(), com.aspose.slides.ms.System.q1.n5(this.u3)));
         return com.aspose.slides.internal.s6.y1.n5(
            var1, this.n5, new com.aspose.slides.ms.System.o5<>(new com.aspose.slides.internal.s6.s0(this.a6.n5().l6(), this.k5))
         );
      } else {
         return com.aspose.slides.internal.s6.y1.n5(var1, this.n5, new com.aspose.slides.ms.System.o5<>());
      }
   }

   @Override
   protected com.aspose.slides.internal.s6.v3 n5(float var1, float var2) {
      float var3 = this.c8.l6();
      if (u6p.l6(this.h0)) {
         float var7 = this.k5() - this.a6.n5().n5();
         float var8 = -(this.s7() - this.a6.n5().l6()) * (1.0F - var3) - var1 * var3;
         float var9 = (this.k5 - this.u3 / 2.0F) * (1.0F - var3) + (2.0F * this.k5 - this.u3 - var2) * var3;
         return new com.aspose.slides.internal.s6.v3(var7, var8, var9);
      } else {
         float var4 = var1 * var3 + (this.t2() - this.a6.n5().n5()) * (1.0F - var3);
         float var5 = this.a6.n5().l6() - this.h0();
         float var6 = var2 * var3 + (this.k5 - this.u3 / 2.0F) * (1.0F - var3);
         return new com.aspose.slides.internal.s6.v3(var4, var5, var6);
      }
   }

   @Override
   protected com.aspose.slides.internal.s6.v3 l6(float var1, float var2) {
      float var3 = this.c8.n5();
      if (u6p.l6(this.h0)) {
         float var7 = this.c8() - this.a6.n5().n5();
         float var8 = -(this.s7() - this.a6.n5().l6()) * (1.0F - var3) - var1 * var3;
         float var9 = (this.k5 - this.u3 / 2.0F) * (1.0F - var3) + (2.0F * this.k5 - this.u3 - var2) * var3;
         return new com.aspose.slides.internal.s6.v3(var7, var8, var9);
      } else {
         float var4 = var1 * var3 + (this.t2() - this.a6.n5().n5()) * (1.0F - var3);
         float var5 = this.a6.n5().l6() - this.u3();
         float var6 = var2 * var3 + (this.k5 - this.u3 / 2.0F) * (1.0F - var3);
         return new com.aspose.slides.internal.s6.v3(var4, var5, var6);
      }
   }
}
