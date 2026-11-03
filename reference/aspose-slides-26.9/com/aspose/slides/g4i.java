package com.aspose.slides;

class g4i extends o2k {
   final void n5(ChartDataWorkbook var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "sst".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.o5o var2 = new com.aspose.slides.internal.k4y.o5o(this.s7());

            for (com.aspose.slides.internal.k4y.h7x var6 : var2.n5()) {
               var1.l6.n5(var6);
            }

            var1.l6.n5(var2.l6());
         }
      }

      this.n3();
   }

   final void l6(ChartDataWorkbook var1) {
      this.y4();
      com.aspose.slides.internal.k4y.o5o var2 = new com.aspose.slides.internal.k4y.o5o();
      var2.l6(var1.l6.l6);
      var2.n5(var1.l6.n5);

      for (int var3 = 0; var3 < var1.l6.l6(); var3++) {
         var2.n5(var1.l6.l6(var3));
      }

      var2.n5(var1.l6.k5());
      var2.n5(null, this.x8(), "sst");
      this.e2();
   }

   public g4i(com.aspose.slides.internal.c8m.j8 var1, o9g var2) {
      super(var1, var2);
   }

   public g4i(com.aspose.slides.internal.c8m.j8 var1, n2x var2) {
      super(var1, var2);
   }
}
