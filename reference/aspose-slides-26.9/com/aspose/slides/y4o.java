package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class y4o {
   public static int n5(ISlideCollection var0, IXamlOptions var1) {
      if (var1 == null) {
         String var8 = com.aspose.slides.ms.System.d1.n5("You should to set  in the '{0}' class a required parameter '{1}'!",new Object[]{ "XamlOptions", "options"});
         throw new t1c(var8);
      }

      int var2 = 0;
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            ISlide var4 = (ISlide)var3.next();
            if (var1.getExportHiddenSlides() || !var4.getHidden()) {
               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }
}
