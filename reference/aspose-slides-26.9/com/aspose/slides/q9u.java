package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.ms.System.IDisposable;

class q9u {
   public static void n5(IChartTitle var0, com.aspose.slides.internal.k4y.n8e var1, t5w var2) {
      if (var1 != null) {
         y5s var3 = ((ChartTitle)var0).n5();
         boolean var4 = false;
         String var5 = ((DocumentProperties)var2.t9().getDocumentProperties()).getAppVersion();
         if (!com.aspose.slides.ms.System.d1.n5(var5)) {
            String[] var6 = com.aspose.slides.ms.System.d1.n5(var5, '.');
            if (var6.length > 0) {
               try {
                  int var7 = com.aspose.slides.ms.System.a3.n5(var6[0]);
                  if (var7 <= 12) {
                     var4 = true;
                  }
               } catch (FormatException var8) {
               }
            }
         }

         boolean var9 = ((DocumentProperties)var2.t9().getDocumentProperties()).u9();
         if (var1.c8() == null) {
            if (var9) {
               var0.setOverlay(!var4);
            } else {
               var0.setOverlay(true);
            }
         } else {
            var0.setOverlay(var1.c8().n5());
         }

         if (var1.u9() != null && "strRef".equals(var1.u9().n5().n5())) {
            ((ChartTitle)var0).n5().n5(var1.u9());
         }

         k5r.n5(var0.getFormat(), var1.t2(), var2);
         c4f.n5(var3, var1.h0());
         w5s.n5(var0, var1.u9(), var1.s7(), var2);
         var3.n5(var1.x8());
      }
   }

   public static void n5(IChartTitle var0, com.aspose.slides.internal.k4y.n8e var1, g6c var2) {
      y5s var3 = ((ChartTitle)var0).n5();
      var1.k5().n5(var0.getOverlay());
      k5r.n5(var0.getFormat(), new q9u$1(var1), var2, null, false);
      c4f.n5(var3, new q9u$2(var1));
      if (var0.getTextFrameForOverriding() != null) {
         IGenericEnumerator var4 = var0.getTextFrameForOverriding().getParagraphs().iterator();

         try {
            while (var4.hasNext()) {
               IParagraph var5 = (IParagraph)var4.next();
               ((ParagraphFormat)var5.getParagraphFormat()).t2().n5(true);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      w5s.n5(var0, new q9u$3(var1), new q9u$4(var1), var2);
      if (((ChartTitle)var0).n5().a6() != null && var1.u9() == null) {
         var1.n5(((ChartTitle)var0).n5().a6());
      }

      var1.n5(var3.n5());
   }
}
