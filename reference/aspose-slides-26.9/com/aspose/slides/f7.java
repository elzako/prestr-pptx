package com.aspose.slides;

class f7 extends s5n {
   private boolean t2 = true;

   public f7(
      com.aspose.slides.internal.x4g.s7 var1, float var2, float var3, int var4, n6u var5, com.aspose.slides.ms.System.o5<com.aspose.slides.internal.s6.s0> var6
   ) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public com.aspose.slides.internal.s6.y2 n5() {
      if (this.t2) {
         byte var3 = 6;
         return new com.aspose.slides.internal.s6.y2(this.l6, this.k5, this.u3, var3, this.u9, null, false, this.n5, this.a6.k5());
      } else {
         com.aspose.slides.internal.s6.y2 var1 = new com.aspose.slides.internal.s6.y2();
         com.aspose.slides.internal.s6.f2 var2 = this.l6();
         this.n5(var1, var2);
         this.l6(var1, var2);
         return var1;
      }
   }

   @Override
   protected com.aspose.slides.internal.s6.f2 l6() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      if (u6p.k5(this.h0)) {
         var1.l6(new com.aspose.slides.internal.o9b.y1(this.k5(), 0.0F, this.a6(), com.aspose.slides.ms.System.q1.n5(this.u3)));
         if (this.a6.l6()) {
            return com.aspose.slides.internal.s6.y1.n5(
               var1, this.n5, new com.aspose.slides.ms.System.o5<>(new com.aspose.slides.internal.s6.s0(this.a6.n5().n5(), this.k5))
            );
         }
      }

      if (u6p.l6(this.h0)) {
         var1.l6(new com.aspose.slides.internal.o9b.y1(this.u3(), 0.0F, this.u9(), com.aspose.slides.ms.System.q1.n5(this.u3)));
         return com.aspose.slides.internal.s6.y1.n5(
            var1, this.n5, new com.aspose.slides.ms.System.o5<>(new com.aspose.slides.internal.s6.s0(this.a6.n5().l6(), this.k5))
         );
      } else {
         return com.aspose.slides.internal.s6.y1.n5(var1, this.n5, new com.aspose.slides.ms.System.o5<>());
      }
   }

   @Override
   protected com.aspose.slides.internal.s6.v3 n5(float var1, float var2) {
      return u6p.l6(this.h0)
         ? new com.aspose.slides.internal.s6.v3(this.k5() - this.a6.n5().n5(), -var1, 2.0F * this.k5 - this.u3 - var2)
         : new com.aspose.slides.internal.s6.v3(var1, this.a6.n5().l6() - this.h0(), var2);
   }

   @Override
   protected com.aspose.slides.internal.s6.v3 l6(float var1, float var2) {
      return u6p.l6(this.h0)
         ? new com.aspose.slides.internal.s6.v3(this.c8() - this.a6.n5().n5(), -var1, 2.0F * this.k5 - this.u3 - var2)
         : new com.aspose.slides.internal.s6.v3(var1, this.a6.n5().l6() - this.u3(), var2);
   }
}
