package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class v2z {
   public static void n5(IFormatScheme var0, com.aspose.slides.internal.k4y.u7c var1, t5w var2) {
      if (var1 != null) {
         List$Enumerator var3 = var1.l6().n5().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
               IFillFormat var5 = ((FillFormatCollection)var0.getFillStyles()).n5();
               x9f.n5(var5, var4, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         for (com.aspose.slides.internal.k4y.r5w var7 : var1.k5().l6()) {
            ILineFormat var8 = ((LineFormatCollection)var0.getLineStyles()).n5();
            i3z.n5(var8, var7);
         }

         for (com.aspose.slides.internal.k4y.n3c var24 : var1.u3().l6()) {
            IEffectStyle var25 = ((EffectStyleCollection)var0.getEffectStyles()).n5();
            b9j.n5(var25, var24, var2);
         }

         List$Enumerator var18 = var1.a6().n5().iterator();

         try {
            while (var18.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var21 = (com.aspose.slides.internal.k4y.g7)var18.next();
               IFillFormat var23 = ((FillFormatCollection)var0.getBackgroundFillStyles()).n5();
               x9f.n5(var23, var21, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
               var18.dispose();
            }
         }

         ((FormatScheme)var0).n5(var1.n5());
      }
   }

   public static void n5(IFormatScheme var0, com.aspose.slides.internal.k4y.u7c var1, g6c var2) {
      IGenericEnumerator var3 = var0.getFillStyles().iterator();

      try {
         while (var3.hasNext()) {
            IFillFormat var4 = (IFillFormat)var3.next();
            x9f.n5(var4, new v2z$1(var1), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var29 = var0.getLineStyles().iterator();

      try {
         while (var29.hasNext()) {
            ILineFormat var5 = (ILineFormat)var29.next();
            i3z.n5(var5, new v2z$2(var1), true);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
            var29.dispose();
         }
      }

      IGenericEnumerator var30 = var0.getEffectStyles().iterator();

      try {
         while (var30.hasNext()) {
            IEffectStyle var6 = (IEffectStyle)var30.next();
            b9j.n5(var6, new v2z$3(var1), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
            var30.dispose();
         }
      }

      IGenericEnumerator var31 = var0.getBackgroundFillStyles().iterator();

      try {
         while (var31.hasNext()) {
            IFillFormat var7 = (IFillFormat)var31.next();
            x9f.n5(var7, new v2z$4(var1), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var31, IDisposable.class)) {
            var31.dispose();
         }
      }

      var1.n5(((FormatScheme)var0).l6());
   }
}
