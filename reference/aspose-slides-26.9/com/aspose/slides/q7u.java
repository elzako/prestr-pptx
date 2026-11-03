package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class q7u {
   public static void n5(MathParagraph var0, com.aspose.slides.internal.k4y.m1r var1, t5w var2, MathPortion var3) {
      if (var0 == null) {
         throw new ArgumentNullException("mathParagraph");
      }

      if (var1 == null) {
         throw new ArgumentNullException("mathParagraphElementData");
      }

      var0.l6();
      if (var1.l6() != null && var1.l6().n5() != null) {
         var0.setJustification(w2p.k5(var1.l6().n5().n5()));
      }

      for (com.aspose.slides.internal.k4y.o3d var7 : var1.k5()) {
         MathBlock var8 = new MathBlock();
         var0.add(var8);
         a9a.n5(var8, var7, var2, var3);
      }

      var0.n5(true);
   }

   public static void n5(MathParagraph var0, com.aspose.slides.internal.k4y.m1r var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("mathParagraph");
      }

      if (var1 == null) {
         throw new ArgumentNullException("mathParagraphElementData");
      }

      com.aspose.slides.internal.k4y.a0k var3 = new com.aspose.slides.internal.k4y.a0k();
      var3.n5(w2p.u3(var0.getJustification()));
      com.aspose.slides.internal.k4y.m3o var4 = new com.aspose.slides.internal.k4y.m3o();
      var4.n5(var3);
      var1.n5(var4);
      IGenericEnumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            IMathBlock var6 = (IMathBlock)var5.next();
            com.aspose.slides.internal.k4y.o3d var7 = var1.n5();
            a9a.n5(var6, var7, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }
}
