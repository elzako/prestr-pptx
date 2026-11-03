package com.aspose.slides;

class q6t extends x2k {
   private g3y n5;

   public q6t(g3y var1) {
      com.aspose.slides.internal.f8y.n5.n5(var1 != null);
      this.n5 = var1;
      this.n5(this.n5.u9().getMarker(), this.n5);
   }

   @Override
   public int u3() {
      if (n5(this.n5)) {
         return 0;
      } else {
         return this.x8() ? 2 : 1;
      }
   }

   @Override
   protected LineFormat h0() {
      return (LineFormat)this.n5.u9().getFormat().getLine();
   }

   @Override
   protected boolean c8() {
      return ChartTypeCharacterizer.a6(this.n5.u9().getType());
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.s7 var1) {
      if (!this.c8()) {
         com.aspose.slides.internal.f8y.n5.n5(var1 != null);
         if (ChartTypeCharacterizer.isChartTypeBubble(this.n5.u9().getType())) {
            var1.n5(this.t2().y4());
         } else {
            var1.l6(this.t2().y4());
         }

         this.n5.n5(false);
         if (this.n5.u9().getType() == 79) {
            Chart var2 = (Chart)this.n5.u9().getChart();
            c5w var3 = this.n5(c5w.class);
            int var4 = com.aspose.slides.ms.System.u3.n5(var3.a0(), this.y1());
            com.aspose.slides.internal.o9b.c8[] var5 = k3o.n5(var2, var2.getStyle() + 1, 3);
            w5k.n5(var5[var4].o8(), this.n5.t2(), var1, (FillFormat)this.n5.u9().getFormat().getFill(), 1.0F, null);
            this.n5.n5(var1);
         } else if (ChartTypeCharacterizer.isChartTypeColumn(this.n5.u9().getType())) {
            this.n5.k5(var1);
            w5k.n5(this.n5.x8().z8().o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), this.n5.t2(), var1, (Format)this.n5.u9().getFormat());
         } else {
            this.n5.u3(var1);
            this.n5.l6(var1);
         }

         this.n5.n5(true);
      } else {
         this.n5.n5(false);
         this.n5((LineFormat)this.n5.u9().getFormat().getLine(), this.n5.t2(), this.n5.h0().o8(), this.s7(), this.n3().k5());
         this.n5.n5(true);
      }
   }

   private com.aspose.slides.ms.System.o5<Float> n3() {
      if (ChartTypeCharacterizer.isChartTypeLine(this.n5.u9().getType())) {
         return new com.aspose.slides.ms.System.o5<>(w5k.n5(this.n5.u9().getChart()));
      } else {
         return ChartTypeCharacterizer.isChartTypeRadar(this.n5.u9().getType())
            ? new com.aspose.slides.ms.System.o5<>(w5k.n5(this.n5.u9().getChart()))
            : new com.aspose.slides.ms.System.o5<>();
      }
   }
}
