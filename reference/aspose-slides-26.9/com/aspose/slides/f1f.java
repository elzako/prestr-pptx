package com.aspose.slides;

class f1f extends s5u {
   private final ISvgShapeFormattingController n5;

   public f1f(
      IBaseSlide var1,
      com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var2,
      y4x var3,
      ISvgShapeFormattingController var4
   ) {
      super(var1, var2, var3);
      this.n5 = var4;
   }

   @Override
   public void n5(e3 var1, Shape var2, InterruptionToken var3) {
      q4b var4 = (q4b)var1;
      SvgShape var5 = new SvgShape();
      if (this.n5 != null) {
         this.n5.formatShape(var5, var2);
      }

      var4.n5(var2, var5);
      super.n5(var1, var2, var3);
      var4.l6(var2);
   }

   @Override
   public void n5(q4b var1, Portion var2, TextFrame var3) {
      if (this.n5 != null && com.aspose.slides.internal.v6g.k5.l6(this.n5, ISvgShapeAndTextFormattingController.class)) {
         SvgTSpan var4 = new SvgTSpan();
         ((ISvgShapeAndTextFormattingController)this.n5).formatText(var4, var2, var3);
         var1.n5(var4);
      }
   }
}
