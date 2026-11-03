package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class l4e {
   static void n5(TextStyle var0, com.aspose.slides.internal.k0r.n1g var1) {
      if (var1 != null) {
         if (var1.l6() != null) {
            IGenericEnumerator var2 = var1.l6().iterator();

            try {
               while (var2.hasNext()) {
                  com.aspose.slides.internal.k0r.m5l var3 = (com.aspose.slides.internal.k0r.m5l)var2.next();
                  double var4 = var3.n5() / 8.0;
                  int var6 = f8b.u3(var3.k5());
                  var0.u3()[0].getTabs().add(var4, var6);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }

         if (com.aspose.slides.ms.System.o5.l6(var1.n5(), null)) {
            var0.u3()[0].setDefaultTabSize(f8b.l6(var1.n5().n5()));
         }

         var0.u3()[0].setDefaultTabSize(Float.NaN);

         for (int var12 = 0; var12 < 5; var12++) {
            com.aspose.slides.internal.k0r.e6a var13 = var1.n5(var12);
            if (var0.u3()[var12 + 1] == null) {
               var0.n5(var12 + 1);
            }

            f8b$n5 var8 = new f8b$n5();
            var13.n5().n5(var8.n5);
            var13.l6().n5(var8.l6);
            if (var0.u3()[var12 + 1] != null && (!var8.n5.l6() || !var8.l6.l6())) {
               f8b$n5 var9 = new f8b$n5();
               var9.k5 = var0.u3()[var12 + 1].getMarginLeft();
               var9.u3 = var0.u3()[var12 + 1].getIndent();
               f8b.l6(var9);
               if (!var13.n5().l6()) {
                  var9.n5.n5(var8.n5);
               }

               if (!var13.l6().l6()) {
                  var9.l6.n5(var8.l6);
               }
            }

            f8b.n5(var8);
            var0.u3()[var12 + 1].setMarginLeft(var8.k5);
            var0.u3()[var12 + 1].setIndent(var8.u3);
            if (var13.n5().l6() || var13.l6().l6()) {
               var0.u3()[var12 + 1].a6().n5((TabCollection)var0.u3()[0].getTabs());
               var0.u3()[var12 + 1].setDefaultTabSize(var0.u3()[0].getDefaultTabSize());
            }
         }
      }
   }

   static void n5(int var0, com.aspose.slides.internal.k0r.n9q var1, com.aspose.slides.internal.k0r.d2n var2, com.aspose.slides.internal.k0r.u7f var3, s3f var4) {
      TextStyle var5 = var4.h0();
      var5.u3()[var0] = f8b.n5(var5, var1, var2, var3, var4.u3());
   }

   static void n5(s3f var0) {
      TextStyle var1 = var0.h0();
      com.aspose.slides.internal.k0r.l1b[] var2 = var0.a6();
      if (var2.length >= 1 && var1 != null) {
         var1.n5(new com.aspose.slides.ms.System.o5<>(var0.u9()));
         com.aspose.slides.internal.k0r.k2 var3 = var0.k5() != null
            ? com.aspose.slides.internal.v6g.k5.n5(var0.k5().s7(), com.aspose.slides.internal.k0r.k2.class)
            : null;
         com.aspose.slides.internal.k0r.j8m var4 = var3 != null ? var3.u3(var0.u9()) : null;

         for (int var5 = 0; var5 < 5; var5++) {
            com.aspose.slides.internal.k0r.l1b var6 = var2[var5];
            com.aspose.slides.internal.k0r.d2n var7 = var4 != null && var4.k5().size() > var5 ? var4.k5().get_Item(var5).n5() : null;
            if (var6 == null) {
               break;
            }

            n5(var5 + 1, var6.n5(), var7, var6.l6(), var0);
         }
      }
   }

   static void l6(s3f var0) {
      TextStyle var1 = var0.h0();
      com.aspose.slides.internal.k0r.l1b[] var2 = var0.a6();

      for (int var3 = 0; var3 < 5; var3++) {
         com.aspose.slides.internal.k0r.l1b var4 = var2[var3];
         ParagraphFormat var5 = var1.u3()[var3 + 1];
         f8b.n5(var4, var5);
      }
   }
}
