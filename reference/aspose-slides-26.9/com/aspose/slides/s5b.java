package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class s5b {
   public static void n5(Presentation var0, com.aspose.slides.internal.k4y.r1l var1, h6j var2) {
      if (var1.n5() != null) {
         if ("presentation".equals(var1.n5().n5())) {
            com.aspose.slides.internal.k4y.l4i var3 = com.aspose.slides.internal.v6g.k5.n5(var1.n5().l6(), com.aspose.slides.internal.k4y.l4i.class);
            if (var3 == null) {
               throw new InvalidOperationException();
            }

            if (var3.k5().length > 1) {
               for (int var4 = 1; var4 < var3.k5().length; var4++) {
                  var0.getSlides().addClone(var0.getSlides().get_Item(0));
               }
            }

            for (int var8 = 0; var8 < var3.k5().length; var8++) {
               var2.n5().u3().throwIfInterruptionRequested();
               Slide var5 = (Slide)var0.getSlides().get_Item(var8);
               com.aspose.slides.internal.k4y.i4x var6 = var3.k5()[var8];
               ILayoutSlide var7 = n5(var6.h0(), var0.getLayoutSlides());
               if (var7 != null) {
                  var5.setLayoutSlide(var7);
               }

               t5s.n5(var5, var6, var3.l6(), var2);
               ((SlideCollection)var0.getSlides()).n5(var5.getShapes());
            }
         }
      }
   }

   private static ILayoutSlide n5(String var0, IGlobalLayoutSlideCollection var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            ILayoutSlide var3 = (ILayoutSlide)var2.next();
            if (com.aspose.slides.ms.System.d1.a6(var3.getName(), var0)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }
}
