package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class e5f {
   public static void n5(
      TextFrame var0, q4v var1, com.aspose.slides.internal.k4y.u0y var2, com.aspose.slides.internal.k4y.a8r var3, int var4, h6j var5, h2k var6
   ) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var2 == null) {
         throw new ArgumentNullException("listElementData");
      }

      for (com.aspose.slides.internal.k4y.b2k var10 : var2.a6()) {
         b4b.n5(var0, var1, var10, var3, var4, var5, var6);
      }
   }
}
