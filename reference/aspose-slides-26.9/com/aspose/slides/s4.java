package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class s4 {
   public static MathArray n5(com.aspose.slides.internal.k4y.m1j var0, t5w var1) {
      x3f var2 = null;
      if (var0.n5() != null) {
         var2 = h6.n5(var0.n5(), var1);
      }

      List var3 = new List();
      if (var0.l6() != null) {
         for (com.aspose.slides.internal.k4y.s0m var7 : var0.l6()) {
            var3.addItem(b6l.n5(var7, var1));
         }
      }

      return new MathArray(var3, var2);
   }

   public static com.aspose.slides.internal.k4y.m1j n5(MathArray var0, g6c var1) {
      com.aspose.slides.internal.k4y.m1j var2 = null;
      if (var0 != null) {
         var2 = new com.aspose.slides.internal.k4y.m1j();
         var2.n5(h6.n5(var0, var1));
         if (var0.getArguments() != null) {
            IGenericEnumerator var3 = var0.getArguments().iterator();

            try {
               while (var3.hasNext()) {
                  IMathElement var4 = (IMathElement)var3.next();
                  var2.n5(b6l.n5(var4, var1));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      }

      return var2;
   }
}
