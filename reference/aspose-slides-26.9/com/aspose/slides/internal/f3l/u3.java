package com.aspose.slides.internal.f3l;

import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.ms.System.p8;

public class u3 {
   public static y4 n5(int var0) {
      y4 var1 = null;
      if (p8.l6) {
         var1 = l6(var0);
      } else if (p8.u3().n5() == 4) {
         var1 = u3(var0);
      } else if (p8.u3().n5() != 6 && p8.u3().n5() != 7) {
         var1 = l6(var0);
      } else {
         var1 = k5(var0);
      }

      return var1;
   }

   private static y4 l6(int var0) {
      y4 var1 = com.aspose.slides.internal.q6f.u3.n5(var0);
      if (var1 == null) {
         var1 = u9.n5(var0);
      }

      if (var1 == null) {
         var1 = com.aspose.slides.internal.q6f.k5.n5(var0);
      }

      if (var1 == null) {
         var1 = a6(var0);
      }

      return var1;
   }

   private static y4 k5(int var0) {
      y4 var1 = u9.n5(var0);
      if (var1 == null) {
         var1 = com.aspose.slides.internal.q6f.k5.n5(var0);
      }

      if (var1 == null) {
         var1 = a6(var0);
      }

      return var1;
   }

   private static y4 u3(int var0) {
      y4 var1 = com.aspose.slides.internal.q6f.l6.n5(var0);
      if (var1 == null) {
         var1 = u9.n5(var0);
      }

      if (var1 == null) {
         var1 = com.aspose.slides.internal.q6f.k5.n5(var0);
      }

      if (var1 == null) {
         var1 = a6(var0);
      }

      return var1;
   }

   private static y4 a6(int var0) {
      String var1;
      switch (var0) {
         case 0:
            var1 = "Serif";
            break;
         case 1:
            var1 = "SansSerif";
            break;
         default:
            var1 = "Monospaced";
      }

      return k5.k5(var1);
   }
}
