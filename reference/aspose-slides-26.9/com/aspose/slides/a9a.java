package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class a9a {
   public static void n5(MathBlock var0, com.aspose.slides.internal.k4y.o3d var1, t5w var2, MathPortion var3) {
      if (var0 == null) {
         throw new ArgumentNullException("mathBlock");
      }

      if (var1 == null) {
         throw new ArgumentNullException("mathBlockElementData");
      }

      var0.clear();
      List$Enumerator var4 = var1.n5().iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var5 = (com.aspose.slides.internal.k4y.g7)var4.next();
            c1s.n5(var5, var0, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   public static void n5(IMathBlock var0, com.aspose.slides.internal.k4y.o3d var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("mathBlock");
      }

      if (var1 == null) {
         throw new ArgumentNullException("mathBlockElementData");
      }

      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            IMathElement var4 = (IMathElement)var3.next();
            var1.n5(c1s.n5(var4, var2));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
