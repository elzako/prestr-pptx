package com.aspose.slides;

class p2k extends x0g {
   private String k5;
   protected e1o l6;

   p2k(e1o var1, String var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   protected void n5(z5 var1) {
      this.n5(this.n5(this.h0(), var1.n5(), var1.l6()).u3());
   }

   @Override
   protected void l6(z5 var1) {
   }

   final String h0() {
      return this.k5;
   }

   @Override
   protected com.aspose.slides.internal.o9b.n3 u3() {
      return this.l6.h0().u9();
   }

   @Override
   protected com.aspose.slides.internal.o9b.c8 a6() {
      return this.l6.h0().l6();
   }

   @Override
   protected float u9() {
      return this.l6.h0().h0();
   }

   @Override
   protected void n5(AutoShape var1) {
      if (this.l6.h0().k5().getTextFrameForOverriding() != null && !com.aspose.slides.ms.System.d1.n5(this.l6.h0().k5().getTextFrameForOverriding().getText())) {
         var1.l6().l6(this.l6.h0().k5().getTextFrameForOverriding());
      }
   }

   @Override
   protected void u3(z5 var1) {
   }
}
