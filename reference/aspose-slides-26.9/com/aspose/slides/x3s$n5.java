package com.aspose.slides;

class x3s$n5 {
   public final PortionFormat n5 = new PortionFormat();
   public IParagraphFormat l6;
   public boolean k5;
   public boolean u3;
   public boolean a6;
   public boolean u9;

   public x3s$n5() {
      this.l6 = new ParagraphFormat(null);
   }

   public x3s$n5(x3s$n5 var1) {
      this.n5.n5((com.aspose.slides.BasePortionFormat)var1.n5);
      this.l6 = new ParagraphFormat((ParagraphFormat)var1.l6, null);
      this.u3 = var1.u3;
      this.u9 = var1.u9;
   }

   public final void n5(IParagraphFormat var1) {
      this.l6 = var1;
   }
}
