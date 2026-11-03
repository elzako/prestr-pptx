package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class n2q {
   public static String n5(IGroupShape var0, d9r var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      IGenericEnumerator var3 = var0.getShapes().iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            var2.n5(e4u.n5(var4, var1));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2.toString();
   }

   public static String n5(k5l var0, f4k var1, s8z var2) {
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(var0.a6() - var0.n5(), 13), com.aspose.slides.internal.v6g.k5.u3(var0.u3() - var0.l6(), 13)
      );

      String var13;
      try {
         var3.n5();
         com.aspose.slides.internal.o9b.z1 var4 = com.aspose.slides.internal.o9b.z1.n5(var3);

         try {
            List$Enumerator var5 = var0.k5().iterator();

            try {
               while (var5.hasNext()) {
                  IShape var6 = (IShape)var5.next();
                  com.aspose.slides.internal.o9b.l6 var7 = ((Shape)var6).n5(1, 1.0F, 1.0F);

                  try {
                     float var8 = var6.getX() - var0.n5();
                     float var9 = var6.getY() - var0.l6();
                     var4.n5(
                        var7,
                        com.aspose.slides.internal.v6g.k5.u3(var8, 13),
                        com.aspose.slides.internal.v6g.k5.u3(var9, 13),
                        com.aspose.slides.internal.v6g.k5.u3(var6.getWidth(), 13),
                        com.aspose.slides.internal.v6g.k5.u3(var6.getHeight(), 13)
                     );
                  } finally {
                     if (var7 != null) {
                        var7.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         String var35 = var1.n5(u4i.n5(var3));
         var13 = u2p.n5(var1, var2, var35);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      return var13;
   }
}
