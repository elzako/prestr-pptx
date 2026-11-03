package com.aspose.slides.internal.v0;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class x8 {
   private static final String[] n5 = new String[]{"italic", "oblique", "inclined"};
   private static final String[] l6 = new String[]{"light"};
   private static final String[] k5 = new String[]{"medium"};
   private static final String[] u3 = new String[]{"demi", "semi"};
   private static final String[] a6 = new String[]{"bold"};
   private static final String[] u9 = new String[]{"extrabold", "extra bold", "black", "heavy", "ultra", "super"};

   public static int n5(String var0) {
      int var1 = 400;

      try {
         var1 = a3.n5(var0);
         var1 = var1 / 100 * 100;
         var1 = q1.n5(var1, 100);
         var1 = q1.l6(var1, 900);
      } catch (RuntimeException var3) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var3, FormatException.class)) {
            throw var3;
         }

         if (d1.a6(var0, "normal")) {
            var1 = 400;
         } else {
            if (!d1.a6(var0, "bold")) {
               throw new ArgumentException(
                  d1.n5(
                     "Illegal value for font weight: '", var0, "'. Use one of: 100, 200, 300, ", "400, 500, 600, 700, 800, 900, ", "normal (=400), bold (=700)"
                  )
               );
            }

            var1 = 700;
         }
      }

      return var1;
   }
}
