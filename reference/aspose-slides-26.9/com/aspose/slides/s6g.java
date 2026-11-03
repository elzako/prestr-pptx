package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class s6g extends f7c {
   List<z4d> n5 = new List<>();

   s6g(p7m var1, g3y var2) {
      super(var1, var2);

      for (int var3 = 0; var3 < var2.u9().s7().n5(); var3++) {
         z4d var4 = new z4d();
         var4.l6(com.aspose.slides.internal.v6g.k5.n5(var2.u9().s7().n5(var3), a0.class).n3());
         this.n5(var4);
         this.n5.addItem(var4);
      }
   }

   @Override
   protected void n5(z5 var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            z4d var3 = (z4d)var2.next();
            var3.n3(new z5(0.0F, 0.0F));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         float var3 = var1.n5() / this.n5.size();
         float var4 = this.t9().l6.n5(this.n5.get_Item(var2).h0());
         this.n5.get_Item(var2).u9(var4);
         this.n5.get_Item(var2).a6(var2 * var3 + var3 / 2.0F);
         this.n5.get_Item(var2).t1();
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      Chart var2 = (Chart)this.e2().u9().getChart();
      com.aspose.slides.internal.o9b.c8[] var3 = k3o.n5(var2, var2.getStyle() + 1, 2);

      for (int var4 = 1; var4 < this.n5.size(); var4++) {
         var1.n5(this.n5.get_Item(var4 - 1).i1().u3(), this.n5.get_Item(var4).i1().u3());
         this.e2().n5(var3[1].o8(), var1, (LineFormat)this.e2().u9().getFormat().getLine(), w5k.n5(this.e2().u9().getChart()));
         var1.t2();
      }
   }

   @Override
   void n5(double[] var1, double[] var2) {
      a0 var3 = this.e2().u9().s7().n5(0);
      var1[0] = var3.n3();
      var2[0] = var3.n3();
      if (this.e2().u9().s7().n5() > 1) {
         for (int var4 = 1; var4 < this.e2().u9().s7().n5(); var4++) {
            var3 = this.e2().u9().s7().n5(var4);
            if (var3.n3() > var2[0]) {
               var2[0] = var3.n3();
            }

            if (var3.n3() < var1[0]) {
               var1[0] = var3.n3();
            }
         }
      }
   }
}
