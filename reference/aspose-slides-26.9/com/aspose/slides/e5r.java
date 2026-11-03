package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class e5r {
   public static void n5(PatternFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("patternFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      if (t2f.k5(var1.s3())) {
         if (var2.l6().c8().containsKey(var1.s3())) {
            com.aspose.slides.internal.k4y.x7t var3 = var2.l6().c8().get_Item(var1.s3());
            ((ColorFormat)var0.getForeColor()).n5(t2f.x8(var3.k5()).o8());
            var0.setPatternStyle((byte)0);
            n5(var0, var3);
         }
      }
   }

   private static void n5(PatternFormat var0, com.aspose.slides.internal.k4y.x7t var1) {
      int var2 = var1.a6();
      double var3 = t2f.u9(var1.u3());
      if (var1.l6() == 1) {
         if (var2 == 0 || var2 == 3600) {
            if (var3 < 25.0) {
               var0.setPatternStyle((byte)19);
               return;
            }

            var0.setPatternStyle((byte)49);
            return;
         }

         if (var2 == 900) {
            if (var3 < 25.0) {
               var0.setPatternStyle((byte)20);
               return;
            }

            var0.setPatternStyle((byte)50);
            return;
         }

         if (var2 > 0 && var2 < 900) {
            var0.setPatternStyle((byte)22);
            return;
         }

         if (var2 > 900 && var2 < 3600) {
            var0.setPatternStyle((byte)21);
         }
      } else if (var2 == 900) {
         if (var3 < 25.0) {
            var0.setPatternStyle((byte)51);
         } else {
            var0.setPatternStyle((byte)34);
         }
      } else {
         var0.setPatternStyle((byte)54);
      }
   }
}
