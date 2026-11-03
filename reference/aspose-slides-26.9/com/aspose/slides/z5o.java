package com.aspose.slides;

class z5o {
   private Presentation n5;
   private f7o l6;

   public final IMasterSlideCollection n5() {
      return this.n5.getMasters();
   }

   final Presentation l6() {
      return this.n5;
   }

   public z5o(f7o var1) {
      this.l6 = var1;
      this.n5 = new Presentation(this.l6.n5(), this.l6);
   }

   public z5o(String var1, LoadOptions var2, f7o var3) {
      this.l6 = var3;
      this.n5 = new Presentation(var1, var2, this.l6);
   }
}
