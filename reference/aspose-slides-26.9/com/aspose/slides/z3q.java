package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class z3q {
   public static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, MarkdownSaveOptions var3) {
      n5(var1);
      l3u var4 = new l3u(var1);
      l7j var5 = null;
      com.aspose.slides.internal.z0k.t4 var6 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.z0k.e2.class);
      if (var6 == null) {
         var6 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.z0k.n3.class);
      }

      if (var6 != null) {
         if (var3 == null) {
            var5 = new l7j(com.aspose.slides.internal.z0k.u3.n5());
         } else {
            if (!com.aspose.slides.internal.z0k.u3.k5(var3.getBasePath())) {
               throw new InvalidOperationException(
                  com.aspose.slides.ms.System.d1.n5("Specified BasePath does not exist: {0}", new Object[]{var3.getBasePath()})
               );
            }

            var5 = new l7j(var3.getBasePath(), var3.getImagesSaveFolderName());
         }

         var5.n5(var3);
      } else {
         n5(var3);
      }

      d9r var7 = new d9r(var3, var5);
      if (var2 == null) {
         n5(var0, var7, var4);
      } else {
         n5(var0, var7, var4, var2);
      }
   }

   public static void n5(IPresentation var0, d9r var1, j9u var2) {
      IGenericEnumerator var3 = var0.getSlides().iterator();

      try {
         while (var3.hasNext()) {
            ISlide var4 = (ISlide)var3.next();
            if (!n5(var4, var1)) {
               g8f.n5(var4, var1, var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   public static void n5(IPresentation var0, d9r var1, j9u var2, int[] var3) {
      Dictionary var4 = new Dictionary();
      List var5 = n5(var3);

      for (int var6 = 0; var6 < var3.length; var6++) {
         int var7 = var3[var6];
         if (var7 > var0.getSlides().size() || var7 < 1) {
            throw new ArgumentOutOfRangeException(
               "slides",
               com.aspose.slides.ms.System.d1.n5("'slides' array contains {0} slide position, which is not present in the presentation.", new Object[]{var7})
            );
         }

         if (var4.containsKey(var7)) {
            var2.n5((String)var4.get_Item(var7));
         } else {
            ISlide var8 = var0.getSlides().get_Item(var7 - 1);
            String var9 = g8f.n5(var8, var1, var2);
            if (var5.containsItem(var7)) {
               var4.addItem(var7, var9);
            }
         }
      }
   }

   private static List<Integer> n5(int[] var0) {
      List var1 = new List();
      List var2 = new List();

      for (int var6 : var0) {
         if (!var1.containsItem(var6)) {
            if (var2.containsItem(var6)) {
               var1.addItem(var6);
            } else {
               var2.addItem(var6);
            }
         }
      }

      return var1;
   }

   private static boolean n5(ISlide var0, d9r var1) {
      return var0.getHidden() && !var1.k5.getShowHiddenSlides();
   }

   private static void n5(com.aspose.slides.internal.z0k.t4 var0) {
      if (var0 == null) {
         throw new ArgumentException("Value can't be null.", "stream");
      }
   }

   private static void n5(MarkdownSaveOptions var0) {
      if (var0.getExportType() != 1) {
         throw new InvalidOperationException("Stream does not support visual elements, please use 'FileOutputStream'.");
      }
   }
}
