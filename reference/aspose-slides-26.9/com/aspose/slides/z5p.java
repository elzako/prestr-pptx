package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class z5p {
   public static MathDelimiter n5(com.aspose.slides.internal.k4y.w7k var0, t5w var1) {
      List var2 = new List();

      for (com.aspose.slides.internal.k4y.s0m var6 : var0.l6()) {
         var2.addItem(b6l.n5(var6, var1));
      }

      MathDelimiter var7 = new MathDelimiter(var2, null);
      if (var0.n5() != null) {
         com.aspose.slides.internal.k4y.n0g var8 = var0.n5();
         if (var8.l6() != null) {
            var7.setBeginningCharacter(var8.l6().n5());
         }

         if (var8.k5() != null) {
            var7.setSeparatorCharacter(var8.k5().n5());
         }

         if (var8.u3() != null) {
            var7.setEndingCharacter(var8.u3().n5());
         }

         if (var8.a6() != null) {
            var7.setGrowToMatchOperandHeight(var8.a6().n5() == 0 || var8.a6().n5() == 1);
         }

         if (var8.u9() != null) {
            var7.setDelimiterShape(n1b.n5(var8.u9().n5()));
         }

         l0u.n5(var7.n5, var8.h0(), var1);
      }

      return var7;
   }

   public static com.aspose.slides.internal.k4y.w7k n5(MathDelimiter var0, g6c var1) {
      com.aspose.slides.internal.k4y.w7k var2 = new com.aspose.slides.internal.k4y.w7k();
      com.aspose.slides.internal.k4y.n0g var3 = new com.aspose.slides.internal.k4y.n0g();
      if (var0 != null && !var0.l6()) {
         com.aspose.slides.internal.k4y.m4f var4 = new com.aspose.slides.internal.k4y.m4f();
         var4.n5(var0.getBeginningCharacter());
         var3.n5(var4);
         com.aspose.slides.internal.k4y.m4f var5 = new com.aspose.slides.internal.k4y.m4f();
         var5.n5(var0.getSeparatorCharacter());
         var3.l6(var5);
         com.aspose.slides.internal.k4y.m4f var6 = new com.aspose.slides.internal.k4y.m4f();
         var6.n5(var0.getEndingCharacter());
         var3.k5(var6);
         var3.n5(o5b.n5(var0.getGrowToMatchOperandHeight()));
         com.aspose.slides.internal.k4y.h4t var7 = new com.aspose.slides.internal.k4y.h4t();
         var7.n5(n1b.l6(var0.getDelimiterShape()));
         var3.n5(var7);
         l0u.n5(var0.n5, new z5p$1(var3), var1);
      }

      var2.n5(var3);
      if (var0 != null && var0.getArguments() != null) {
         IGenericEnumerator var11 = var0.getArguments().iterator();

         try {
            while (var11.hasNext()) {
               IMathElement var12 = (IMathElement)var11.next();
               var2.n5(b6l.n5(var12, var1));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
               var11.dispose();
            }
         }
      }

      return var2;
   }
}
