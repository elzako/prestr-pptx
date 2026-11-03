package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class Compress {
   public static void removeUnusedMasterSlides(Presentation pres) {
      for (int var1 = pres.getMasters().size() - 1; var1 >= 0; var1--) {
         if (!pres.getMasters().get_Item(var1).hasDependingSlides()) {
            pres.getMasters().removeAt(var1);
         }
      }
   }

   public static void removeUnusedLayoutSlides(Presentation pres) {
      for (int var1 = pres.getLayoutSlides().size() - 1; var1 >= 0; var1--) {
         if (!pres.getLayoutSlides().get_Item(var1).hasDependingSlides()) {
            pres.getLayoutSlides().get_Item(var1).remove();
         }
      }
   }

   public static void compressEmbeddedFonts(Presentation pres) {
      List var1 = new List();
      IGenericEnumerator var2 = pres.t9().n5().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!((c4y)var3.getValue()).t2()) {
               var1.addItem(var3.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (var1.size() != 0) {
         IFontsManager var13 = pres.getFontsManager();
         List$Enumerator var4 = var1.iterator();

         try {
            while (var4.hasNext()) {
               IFontData var5 = (IFontData)var4.next();
               var13.removeEmbeddedFont(var5);
               var13.addEmbeddedFont(var5, 0);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }
}
