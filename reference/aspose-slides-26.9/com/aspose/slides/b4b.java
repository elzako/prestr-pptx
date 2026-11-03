package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class b4b {
   public static void n5(
      TextFrame var0, q4v var1, com.aspose.slides.internal.k4y.b2k var2, com.aspose.slides.internal.k4y.a8r var3, int var4, h6j var5, h2k var6
   ) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var2 == null) {
         throw new ArgumentNullException("listItemElementData");
      }

      Object[] var7 = t2f.n5("p", var2.n5());
      if (var7.length >= 1) {
         l4t.n5(var0, var1, var2.n5(), var3, var4, var5, var6);
      } else {
         Object[] var8 = t2f.n5("list", var2.n5());
         if (var8.length > 0) {
            if (((com.aspose.slides.internal.k4y.u0y)var8[0]).u3() != null) {
               d7g.n5(var0, (com.aspose.slides.internal.k4y.u0y)var8[0], var3, var5, var6);
            }

            for (com.aspose.slides.internal.k4y.b2k var12 : ((com.aspose.slides.internal.k4y.u0y)var8[0]).a6()) {
               n5(var0, var1, var12, var3, var4 + 1, var5, var6);
            }
         }
      }
   }
}
