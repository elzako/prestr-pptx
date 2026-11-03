package com.aspose.slides;

class u5l {
   private com.aspose.slides.internal.o9b.n3 n5;
   private com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   private LegendEntryProperties k5;
   private String u3;
   private int a6;
   private w3q u9;
   private g3y h0;
   private com.aspose.slides.internal.o9b.c8 c8 = new com.aspose.slides.internal.o9b.c8();

   u5l(LegendEntryProperties var1) {
      Chart var2 = (Chart)var1.getChart();
      this.k5 = var1;
      this.n5 = var2.n5(this.k5.getTextFormat());
      var2.n5(this.k5.getTextFormat(), this.l6.o8()).n5(this.l6);
   }

   u5l(Chart var1) {
      this.k5 = new LegendEntryProperties(var1);
      this.n5 = var1.n5(this.k5.getTextFormat());
      var1.n5(this.k5.getTextFormat(), this.l6.o8()).n5(this.l6);
   }

   public final String n5() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final int l6() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final w3q k5() {
      return this.u9;
   }

   public final void n5(w3q var1) {
      this.u9 = var1;
   }

   public final g3y u3() {
      return this.h0;
   }

   public final void n5(g3y var1) {
      this.h0 = var1;
   }

   public final LegendEntryProperties a6() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.c8 u9() {
      return this.c8.o8();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.c8 = var1.o8();
   }
}
