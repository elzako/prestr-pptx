package com.aspose.slides;

class g5c extends o2k {
   final void n5(ChartDataWorkbook var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "styleSheet".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.f3p var2 = new com.aspose.slides.internal.k4y.f3p(this.s7());
            var1.k5 = new l1h(var1);
            c1b.n5(var1.k5, var2.k5());
            var1.u3 = new a9f(var1);
            f6.n5(var1.u3, var2.c8());
            x1u var3 = var1.u9();
            var3.n5(var2.u9());
            var3.n5(var2.h0());
            var3.n5(var2.t2());
            var3.n5(var2.n3());
            var3.n5(var2.s7());
            var3.n5(var2.a6());
            var3.n5(var2.u3());
            var3.n5(var2.x8());
            var3.n5(var2.y4());
            if (var1.u3.n5() == 0) {
               var1.u3.n5(new t3u());
               if (var3.u3() == null) {
                  com.aspose.slides.internal.k4y.p2m var4 = new com.aspose.slides.internal.k4y.p2m();
                  var4.n5();
                  var4.n5(1L);
                  var3.n5(var4);
               }
            }
         }
      }

      this.n3();
   }

   final void l6(ChartDataWorkbook var1) {
      this.y4();
      com.aspose.slides.internal.k4y.f3p var2 = new com.aspose.slides.internal.k4y.f3p();
      if (var1.k5.n5() > 0) {
         c1b.l6(var1.k5, var2.n5());
      }

      if (var1.u3.n5() > 0) {
         if (var1.u9().u3() == null) {
            var1.u9().n5(new com.aspose.slides.internal.k4y.p2m());
         }

         com.aspose.slides.internal.k4y.s8u var3 = var2.l6();
         f6.l6(var1.u3, var3);
      }

      x1u var4 = var1.u9();
      var2.n5(var4.k5());
      var2.n5(var4.u3());
      var2.n5(var4.a6());
      var2.n5(var4.c8());
      var2.n5(var4.u9());
      var2.n5(var4.l6());
      var2.n5(var4.n5());
      var2.n5(var4.h0());
      var2.n5(var4.t2());
      var2.n5(null, this.x8(), "styleSheet");
      this.e2();
   }

   public g5c(com.aspose.slides.internal.c8m.j8 var1, o9g var2) {
      super(var1, var2);
   }

   public g5c(com.aspose.slides.internal.c8m.j8 var1, n2x var2) {
      super(var1, var2);
   }
}
