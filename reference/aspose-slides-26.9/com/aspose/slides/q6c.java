package com.aspose.slides;

class q6c extends x0q {
   final void n5(ITagCollection var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "tagLst".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.e8 var2 = new com.aspose.slides.internal.k4y.e8(this.s7());

            for (com.aspose.slides.internal.k4y.s1e var6 : var2.l6()) {
               var1.add(var6.n5(), var6.l6());
            }
         }
      }

      this.n3();
   }

   final void l6(ITagCollection var1) {
      this.y4();
      com.aspose.slides.internal.k4y.e8 var2 = new com.aspose.slides.internal.k4y.e8();

      for (String var6 : var1.getNamesOfTags()) {
         com.aspose.slides.internal.k4y.s1e var7 = var2.n5();
         var7.n5(var6);
         var7.l6(var1.get_Item(var6));
      }

      var2.n5(null, this.x8(), "tagLst");
      this.e2();
   }

   public q6c(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public q6c(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
