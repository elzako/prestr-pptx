package com.aspose.slides;

class u2 extends x0g {
   private b9y l6;
   private l5 k5;

   u2(l5 var1) {
      this.l6 = var1.h0();
      this.k5 = var1;
   }

   @Override
   protected void n5(z5 var1) {
      n1g var2 = this.l6.h0();
      d2k var3;
      if (this.k5.d2().n3().hasTitle() && !this.k5.d2().n3().getChartTitle().getOverlay()) {
         var3 = new d2k(var1.n5(), var1.l6());
         d2k.n5(var3, 0.88F).n5(var3);
      } else {
         var3 = new d2k(var2.c4(), var2.y2());
         d2k.n5(var3, 0.8F).n5(var3);
      }

      d2k var4 = this.n5(this.l6.n5(), var3.n5, var3.l6).u3();
      this.n5(var4.u3());
   }

   final int k5() {
      return this.k5.c8().getPosition();
   }

   @Override
   protected void l6(z5 var1) {
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected com.aspose.slides.internal.o9b.n3 u3() {
      com.aspose.slides.internal.o9b.n3 var1 = this.l6.a6();
      if (var1 == null) {
         var1 = this.l6.l6();
      }

      return var1;
   }

   @Override
   protected com.aspose.slides.internal.o9b.c8 a6() {
      return this.l6.u9();
   }

   @Override
   protected float u9() {
      boolean var1 = this.k5.c8().getPosition() == 1 || this.k5.c8().getPosition() == 2;
      float var2 = var1 ? 90.0F : 0.0F;
      switch (this.k5.c8().getTitle().getTextFormat().getTextBlockFormat().getTextVerticalType()) {
         case 0:
            var2 = 0.0F;
            break;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            var2 = 90.0F;
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.k5.c8().getTitle().getTextFormat().getTextBlockFormat().getRotationAngle())) {
         var2 = this.k5.c8().getTitle().getTextFormat().getTextBlockFormat().getRotationAngle() * -1.0F;
      }

      if (this.k5.c8().getTitle().getTextFrameForOverriding() != null) {
         switch (this.k5.c8().getTitle().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType()) {
            case 0:
               var2 = 0.0F;
               break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
               var2 = 90.0F;
         }

         if (!com.aspose.slides.ms.System.n1.k5(this.k5.c8().getTitle().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle())) {
            var2 = this.k5.c8().getTitle().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle() * -1.0F;
         }
      }

      return var2;
   }

   @Override
   protected void n5(AutoShape var1) {
      this.n5(this.k5.c8().getTitle().getTextFormat());
      if (this.k5.c8().getTitle().getTextFormat().getTextBlockFormat().getTextVerticalType() != -1) {
         var1.getTextFrame().getTextFrameFormat().setTextVerticalType(this.k5.c8().getTitle().getTextFormat().getTextBlockFormat().getTextVerticalType());
      }

      if (this.k5.c8().getTitle().getTextFrameForOverriding() != null
         && this.k5.c8().getTitle().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType() != -1) {
         var1.getTextFrame()
            .getTextFrameFormat()
            .setTextVerticalType(this.k5.c8().getTitle().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType());
      }

      this.l6(var1);
   }

   private void l6(AutoShape var1) {
      float var2 = 3.0F;
      TextFrameFormat var3 = (TextFrameFormat)var1.getTextFrame().getTextFrameFormat();
      ITextFrameFormat var4 = null;
      if (this.k5.c8().getTitle().getTextFrameForOverriding() != null) {
         var4 = this.k5.c8().getTitle().getTextFrameForOverriding().getTextFrameFormat();
      }

      c0u var5 = var3.u3().l6();
      var5.l6 = var4 != null && !com.aspose.slides.ms.System.d2.k5(var4.getMarginLeft()) ? var4.getMarginLeft() : var2;
      var5.u3 = var4 != null && !com.aspose.slides.ms.System.d2.k5(var4.getMarginRight()) ? var4.getMarginRight() : var2;
      var3.n5(var5.l6());
   }

   @Override
   protected void l6() {
      w5k.n5(
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         this.k5.d2(),
         this.e5().y4(),
         (LineFormat)this.k5.c8().getTitle().getFormat().getLine(),
         (FillFormat)this.k5.c8().getTitle().getFormat().getFill(),
         this.k5.c8().getTitle().getFormat().getEffect()
      );
      super.l6();
   }
}
