package com.aspose.slides.internal.c6;

import com.aspose.slides.IPresentation;
import com.aspose.slides.ISlide;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class b3 {
   private final e2[] n5;
   private final String l6;
   private static String k5 = "Do not add additional messages to the response. Translate to {0} the following text, retaining HTML formatting: {1}";

   public b3(IPresentation var1, String var2, String var3) {
      this.l6 = var3;
      this.n5 = n5(var1, var2, var3);
   }

   public final String[] n5() {
      String[] var1 = new String[this.n5.length];
      int var2 = 0;

      for (e2 var6 : this.n5) {
         a5 var7 = new a5();
         var6.l6(var7);
         var1[var2++] = d1.n5(k5, this.l6, var7);
      }

      return var1;
   }

   public final void n5(String[] var1) {
      int var2 = 0;

      for (String var6 : var1) {
         this.n5[var2++].l6(var6, 0);
      }
   }

   private static e2[] n5(IPresentation var0, String var1, String var2) {
      n3 var3 = new n3(var1, var2);
      e2[] var4 = new e2[var0.getSlides().size() + 2];
      int var5 = 0;
      IGenericEnumerator var6 = var0.getSlides().iterator();

      try {
         while (var6.hasNext()) {
            ISlide var7 = (ISlide)var6.next();
            var4[var5++] = var3.n5(var7);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var4[var5++] = var3.n5(var0.getMasters());
      var4[var5] = var3.n5(var0.getCommentAuthors());
      return var4;
   }
}
