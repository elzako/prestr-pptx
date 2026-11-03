package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class s1o extends x0q {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("strDim", "numDim");

   final IChart n5(IShapeCollection var1, IChart var2, com.aspose.slides.internal.k4y.s1k var3, i1x var4) {
      return this.n5(var1, var2, var3, var4, null);
   }

   final IChart n5(IShapeCollection var1, IChart var2, com.aspose.slides.internal.k4y.s1k var3, i1x var4, ChartDataWorkbook var5) {
      c1x var6 = new c1x(var4);
      this.n5();
      IChart var7 = null;

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "chartSpace".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.w2p var8 = new com.aspose.slides.internal.k4y.w2p(this.s7());
            var7 = this.n5((ShapeCollection)var1, var2, var8);
            if (var7 != null) {
               if (var5 != null && var8.l6() != null) {
                  n5(var8.l6(), var5);
               }

               u7f.n5(var7, var3, var8, var6);
            }
         }
      }

      this.n3();
      return var7;
   }

   private IChart n5(ShapeCollection var1, IChart var2, com.aspose.slides.internal.k4y.w2p var3) {
      if ((var1 == null || var2 == null) && (var1 != null || var2 != null)) {
         IChart var4;
         if (var2 != null) {
            var4 = var2;
         } else {
            if (var3.k5().u3().l6().u3().length == 0) {
               return null;
            }

            var4 = var1.n5(u7f.n5(var3.k5().u3(), var3.k5().u3().l6().u3()[0]));
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

   private static void n5(com.aspose.slides.internal.k4y.v3y var0, ChartDataWorkbook var1) {
      for (com.aspose.slides.internal.k4y.g1i var5 : var0.k5()) {
         List$Enumerator var6 = var5.l6().iterator();

         try {
            while (var6.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var7 = (com.aspose.slides.internal.k4y.g7)var6.next();
               switch (n5.n5(var7.n5())) {
                  case 0:
                     com.aspose.slides.internal.k4y.a9k var8 = com.aspose.slides.internal.v6g.k5.n5(var7.k5(), com.aspose.slides.internal.k4y.a9k.class);
                     if (var8 != null && var8.u3() != null) {
                        if (com.aspose.slides.ms.System.d1.l6(var8.u3().n5(), "_xlchart")) {
                           var8.u3().n5(var1.n5(var8.u3().n5()));
                        }

                        if (var8.a6().length == 0) {
                           n5(var8, var1);
                        }
                     }
                     break;
                  case 1:
                     com.aspose.slides.internal.k4y.o8n var9 = com.aspose.slides.internal.v6g.k5.n5(var7.k5(), com.aspose.slides.internal.k4y.o8n.class);
                     if (var9 != null && var9.u3() != null) {
                        if (com.aspose.slides.ms.System.d1.l6(var9.u3().n5(), "_xlchart")) {
                           var9.u3().n5(var1.n5(var9.u3().n5()));
                        }

                        if (var9.a6().length == 0) {
                           n5(var9, var1);
                        }
                     }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.a9k var0, ChartDataWorkbook var1) {
      List var2 = var1.n5(var0.u3().n5(), false, false);
      if (!var2.isEmpty()) {
         com.aspose.slides.internal.k4y.p4u var3 = var0.l6();
         var3.n5(var2.size() & 4294967295L);
         long var4 = 0L;
         List$Enumerator var6 = var2.iterator();

         try {
            while (var6.hasNext()) {
               ChartDataCell var7 = (ChartDataCell)var6.next();
               com.aspose.slides.internal.k4y.i0c var8 = var3.n5();
               var8.n5(var4++);
               var8.n5(com.aspose.slides.ms.System.z3.t9(var7.getValue(), com.aspose.slides.internal.x7n.l6.k5()));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.o8n var0, ChartDataWorkbook var1) {
      List var2 = var1.n5(var0.u3().n5(), false, false);
      if (!var2.isEmpty()) {
         com.aspose.slides.internal.k4y.w0r var3 = var0.l6();
         var3.n5(var2.size() & 4294967295L);
         var3.n5(((ChartDataCell)var2.get_Item(0)).getCustomNumberFormat());
         long var4 = 0L;
         List$Enumerator var6 = var2.iterator();

         try {
            while (var6.hasNext()) {
               ChartDataCell var7 = (ChartDataCell)var6.next();
               com.aspose.slides.internal.k4y.t7d var8 = var3.n5();
               var8.n5(var4++);
               var8.n5(com.aspose.slides.ms.System.z3.t9(var7.getValue(), com.aspose.slides.internal.x7n.l6.k5()));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }
   }

   final void n5(IChart var1, com.aspose.slides.internal.k4y.s1k var2, n4i var3) {
      j8m var4 = new j8m(var3);
      this.y4();
      com.aspose.slides.internal.k4y.w2p var5 = new com.aspose.slides.internal.k4y.w2p();
      u7f.n5(var1, var5, var2, var4);
      var5.n5(null, this.x8(), "chartSpace");
      this.e2();
   }

   public s1o(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public s1o(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
