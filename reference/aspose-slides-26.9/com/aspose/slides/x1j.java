package com.aspose.slides;

class x1j extends x2k {
   private t9z n5;

   public x1j(t9z var1) {
      this.n5 = var1;
      this.n5(this.n5.s7().getMarker(), this.n5.y4());
   }

   @Override
   public int u3() {
      if (n5(this.n5.y4())) {
         return 0;
      } else {
         return this.x8() ? 2 : 1;
      }
   }

   @Override
   protected LineFormat h0() {
      return this.n5.z3();
   }

   @Override
   protected boolean c8() {
      return ChartTypeCharacterizer.a6(this.n5.y4().u9().getType());
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.s7 var1) {
      if (!this.c8()) {
         if (ChartTypeCharacterizer.isChartTypeBubble(this.n5.y4().u9().getType())) {
            var1.n5(this.t2().y4());
         } else {
            var1.l6(this.t2().y4());
         }

         this.n5.n5(false);
         this.n5.k5(var1);
         this.n5.n5(var1);
         this.n5.n5(true);
      } else {
         this.n5.n5(false);
         this.n5(this.n5.z3(), this.n5.y4().t2(), com.aspose.slides.internal.o9b.c8.u3.o8(), this.s7(), new com.aspose.slides.ms.System.o5<>());
         this.n5.n5(true);
      }
   }
}
