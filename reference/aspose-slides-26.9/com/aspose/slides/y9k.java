package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class y9k {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("m", "cm", "mm", "in", "pc", "1/cm", "1/in");

   static double n5(double var0, String var2) {
      double var3 = 0.0;
      switch (n5.n5(var2)) {
         case 0:
            var3 = var0 * 100.0 / 2.54 * 72.0;
            break;
         case 1:
            var3 = var0 / 2.54 * 72.0;
            break;
         case 2:
            var3 = var0 * 10.0 * 2.54 * 72.0;
            break;
         case 3:
            var3 = var0 * 72.0;
            break;
         case 4:
            var3 = var0;
            break;
         case 5:
            var3 = var0 * 2.54 / 72.0;
            break;
         case 6:
            var3 = var0 / 72.0;
            break;
         default:
            var3 = var0;
      }

      return var3;
   }

   static double l6(double var0, String var2) {
      double var3 = 0.0;
      switch (n5.n5(var2)) {
         case 0:
            var3 = var0 * 2.54 * 100.0 / 72.0;
            break;
         case 1:
            var3 = var0 / 72.0 * 2.54;
            break;
         case 2:
            var3 = var0 / 1828.8;
            break;
         case 3:
            var3 = var0 / 72.0;
            break;
         case 4:
            var3 = var0;
            break;
         case 5:
            var3 = var0 * 72.0 / 2.54;
            break;
         case 6:
            var3 = var0 * 72.0;
            break;
         default:
            var3 = var0;
      }

      return var3;
   }

   static a9j n5(Ink var0, String var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var1) && var0.x8() != null) {
         String var2;
         if (var1.charAt(0) == '#') {
            var2 = com.aspose.slides.ms.System.d1.k5(var1, 1);
         } else {
            var2 = var1;
         }

         List$Enumerator var3 = var0.x8().iterator();

         try {
            while (var3.hasNext()) {
               h2i var4 = (h2i)var3.next();
               List$Enumerator var5 = var4.u3().iterator();

               try {
                  while (var5.hasNext()) {
                     r6s var6 = (r6s)var5.next();
                     if (com.aspose.slides.ms.System.d1.a6(var2, var6.n5())) {
                        if (var6.x8() != null) {
                           return var6.x8();
                        }

                        return var6.n3().h0();
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return null;
   }

   static InkBrush l6(Ink var0, String var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var1) && var0.x8() != null) {
         String var2;
         if (var1.charAt(0) == '#') {
            var2 = com.aspose.slides.ms.System.d1.k5(var1, 1);
         } else {
            var2 = var1;
         }

         List$Enumerator var3 = var0.x8().iterator();

         try {
            while (var3.hasNext()) {
               h2i var4 = (h2i)var3.next();
               List$Enumerator var5 = var4.n5().iterator();

               try {
                  while (var5.hasNext()) {
                     InkBrush var6 = (InkBrush)var5.next();
                     if (com.aspose.slides.ms.System.d1.a6(var2, var6.h0())) {
                        return var6;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return null;
   }
}
