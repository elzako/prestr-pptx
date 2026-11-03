package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class c7f extends x0q {
   IChart n5(IShapeCollection var1, IChart var2, com.aspose.slides.internal.k4y.s1k var3, i1x var4) {
      c1x var5 = new c1x(var4);
      this.n5();
      IChart var6 = null;

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && this.s7().n3().equals("chartSpace")) {
            com.aspose.slides.internal.k4y.y2 var7 = new com.aspose.slides.internal.k4y.y2(this.s7());
            var5.n5(var7.t4().q0());
            var6 = this.n5((ShapeCollection)var1, var2, var7);
            g4u.n5(var6, var3, var7, var5);
         }
      }

      this.n3();
      return var6;
   }

   private IChart n5(ShapeCollection var1, IChart var2, com.aspose.slides.internal.k4y.y2 var3) {
      if ((var1 == null || var2 == null) && (var1 != null || var2 != null)) {
         IChart var4;
         if (var2 != null) {
            var4 = var2;
         } else {
            int var5 = 0;
            int[] var6 = new int[]{0};
            int var7 = g4u.n5(var3.t4().q0(), 0, var6);
            var5 = var6[0];
            var4 = var1.n5(var7, var5);
         }

         return var4;
      } else {
         throw new Exception(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Wrong use of ChartPartParser.ReadPart() - ", "only parameter 'chartOfTemplateTo' or only paramenter 'shapes' must be not null."
            })
         );
      }
   }

   void n5(IChart var1, com.aspose.slides.internal.k4y.s1k var2, n4i var3) {
      j8m var4 = new j8m(var3);
      this.y4();
      com.aspose.slides.internal.k4y.y2 var5 = new com.aspose.slides.internal.k4y.y2();
      g4u.n5(var1, var5, var2, var4);
      var5.n5(null, this.x8(), "chartSpace");
      this.e2();
   }

   public c7f(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public c7f(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
