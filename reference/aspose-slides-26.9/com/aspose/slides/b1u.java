package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class b1u {
   public static void n5(IFonts var0, com.aspose.slides.internal.k4y.p4l var1) {
      if (var1 != null) {
         FontData var2 = m9b.n5(var1.l6());
         var0.setLatinFont(var2);
         FontData var3 = m9b.n5(var1.k5());
         var0.setEastAsianFont(com.aspose.slides.ms.System.d1.n5(var3.getFontName()) ? var2 : var3);
         FontData var4 = m9b.n5(var1.u3());
         var0.setComplexScriptFont(var4);
         k5(var0, var1);
      }
   }

   private static void k5(IFonts var0, com.aspose.slides.internal.k4y.p4l var1) {
      a6k var2 = ((Fonts)var0).n5();

      for (com.aspose.slides.internal.k4y.x5h var6 : var1.a6()) {
         var2.n5(var6.n5(), var6.l6());
      }

      var2.n5(var1.u9());
   }

   public static void l6(IFonts var0, com.aspose.slides.internal.k4y.p4l var1) {
      m9b.n5(var0.getLatinFont(), var1.l6());
      m9b.n5(var0.getEastAsianFont(), var1.k5());
      m9b.n5(var0.getComplexScriptFont(), var1.u3());
      u3(var0, var1);
   }

   private static void u3(IFonts var0, com.aspose.slides.internal.k4y.p4l var1) {
      a6k var2 = ((Fonts)var0).n5();
      Dictionary$Enumerator var3 = var2.n5().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            com.aspose.slides.internal.k4y.x5h var5 = var1.n5();
            var5.n5((String)var4.getKey());
            var5.l6((String)var4.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var1.n5(var2.l6());
   }
}
