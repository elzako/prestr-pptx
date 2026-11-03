package com.aspose.slides;

class c0z extends s5u {
   private final IHtmlFormattingController n5;
   private final ISvgShapeFormattingController l6;
   private final HtmlGenerator k5;

   public c0z(
      IBaseSlide var1,
      com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var2,
      y4x var3,
      HtmlGenerator var4,
      IHtmlFormattingController var5,
      ISvgShapeFormattingController var6
   ) {
      super(var1, var2, var3);
      this.k5 = var4;
      this.n5 = var5;
      if (var6 == null && com.aspose.slides.internal.v6g.k5.l6(var5, ISvgShapeFormattingController.class)) {
         this.l6 = (ISvgShapeFormattingController)var5;
      } else {
         this.l6 = var6;
      }
   }

   @Override
   public void n5(e3 var1, Shape var2, InterruptionToken var3) {
      q4b var4 = (q4b)var1;
      this.n5.writeShapeStart(this.k5, var2);
      this.n5(var4);
      SvgShape var5 = new SvgShape();
      if (this.l6 != null) {
         this.l6.formatShape(var5, var2);
      }

      var4.n5(var2, var5);
      super.n5(var1, var2, var3);
      var4.l6(var2);
      this.n5.writeShapeEnd(this.k5, var2);
      this.n5(var4);
   }

   @Override
   public void n5(q4b var1, Portion var2, TextFrame var3) {
      if (this.l6 != null && com.aspose.slides.internal.v6g.k5.l6(this.l6, ISvgShapeAndTextFormattingController.class)) {
         SvgTSpan var4 = new SvgTSpan();
         ((ISvgShapeAndTextFormattingController)this.l6).formatText(var4, var2, var3);
         var1.n5(var4);
      }
   }

   private void n5(q4b var1) {
      if (this.k5.l6()) {
         if (var1.k5()) {
            var1.n5(this.k5.k5(), false);
            var1.n5();
         }

         this.k5.n5();
      }
   }
}
