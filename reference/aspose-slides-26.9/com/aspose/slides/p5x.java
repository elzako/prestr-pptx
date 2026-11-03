package com.aspose.slides;

class p5x extends x0g {
   private v4y l6;
   private l5 k5;

   p5x(l5 var1) {
      this.l6 = var1.y1();
      this.k5 = var1;
      boolean var2 = this.k5.c8().getPosition() == 1 || this.k5.c8().getPosition() == 2;
      if (this.l6.n5() && var2) {
         this.l6.n5(90);
      }
   }

   @Override
   protected void n5(z5 var1) {
      n1g var2 = this.k5.d2();
      d2k var3 = new d2k(var2.c4(), var2.y2());
      d2k var4 = new d2k(var3.n5 * 0.85F, var3.l6 * 0.6F);
      d2k var5 = this.n5(this.l6.k5(), var4.n5, var4.l6).u3();
      this.n5(var5.u3());
   }

   @Override
   protected void l6(z5 var1) {
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected com.aspose.slides.internal.o9b.n3 u3() {
      return this.l6.u3();
   }

   @Override
   protected com.aspose.slides.internal.o9b.c8 a6() {
      return this.l6.a6();
   }

   @Override
   protected float u9() {
      float var1 = this.l6.l6();
      if (!com.aspose.slides.ms.System.n1.k5(this.k5.c8().k5().getTextFormat().getTextBlockFormat().getRotationAngle())) {
         var1 = this.k5.c8().k5().getTextFormat().getTextBlockFormat().getRotationAngle() * -1.0F;
      }

      if (this.k5.c8().k5().getTextFrameForOverriding() == null) {
         return var1;
      }

      switch (this.k5.c8().k5().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType()) {
         case 0:
            var1 = 0.0F;
            break;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            var1 = 90.0F;
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.k5.c8().k5().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle())) {
         var1 = this.k5.c8().k5().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle() * -1.0F;
      }

      return var1;
   }

   final int h0() {
      return this.k5.c8().getPosition();
   }

   @Override
   protected void n5(AutoShape var1) {
      this.n5(this.k5.c8().k5().getTextFormat());
      if (this.k5.c8().k5().getTextFrameForOverriding() != null && !com.aspose.slides.ms.System.d1.n5(this.k5.c8().k5().getTextFrameForOverriding().getText())) {
         var1.l6().l6(this.k5.c8().k5().getTextFrameForOverriding());
      }

      if (this.k5.c8().k5().getTextFormat().getTextBlockFormat().getTextVerticalType() != -1) {
         var1.getTextFrame().getTextFrameFormat().setTextVerticalType(this.k5.c8().k5().getTextFormat().getTextBlockFormat().getTextVerticalType());
      }

      if (this.k5.c8().k5().getTextFrameForOverriding() != null
         && this.k5.c8().k5().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType() != -1) {
         var1.getTextFrame().getTextFrameFormat().setTextVerticalType(this.k5.c8().k5().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType());
      }

      this.l6(var1);
   }

   private void l6(AutoShape var1) {
      float var2 = 3.0F;
      TextFrameFormat var3 = (TextFrameFormat)var1.getTextFrame().getTextFrameFormat();
      ITextFrameFormat var4 = null;
      if (this.k5.c8().k5().getTextFrameForOverriding() != null) {
         var4 = this.k5.c8().k5().getTextFrameForOverriding().getTextFrameFormat();
      }

      c0u var5 = var3.u3().l6();
      var5.l6 = var4 != null && !com.aspose.slides.ms.System.d2.k5(var4.getMarginLeft()) ? var4.getMarginLeft() : 3.0;
      var5.u3 = var4 != null && !com.aspose.slides.ms.System.d2.k5(var4.getMarginRight()) ? var4.getMarginRight() : 3.0;
      var3.n5(var5.l6());
   }
}
