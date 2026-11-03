package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class z9c {
   public static void n5(ISmartArt var0, int var1) {
      String var2 = b3o.n5(var1);
      if (var2 == null) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(
               "SmartArt data model for layoutType {0} does not exist", new Object[]{com.aspose.slides.ms.System.s3.n5(SmartArtLayoutType.class, var1)}
            ),
            "layoutType"
         );
      }

      d2c var3 = ((SmartArt)var0).u9();
      var3.n5((com.aspose.slides.internal.k4y.i1)null);
      com.aspose.slides.internal.c8m.d9 var4 = new com.aspose.slides.internal.c8m.d9();
      s1q var5 = new s1q(n5(var4, "tempDataPart", var2, new com.aspose.slides.internal.c8m.p8()), new t5w(var0.getPresentation(), InterruptionToken.getNone()));
      var5.n5(var3);
   }

   public static void l6(ISmartArt var0, int var1) {
      String var2 = h5h.n5(var1);
      if (var2 == null) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(
               "SmartArt layout template for layoutType {0} does not exist", new Object[]{com.aspose.slides.ms.System.s3.n5(SmartArtLayoutType.class, var1)}
            ),
            "layoutType"
         );
      }

      d2c var3 = ((SmartArt)var0).u9();
      var3.n5((com.aspose.slides.internal.k4y.v3)null);
      com.aspose.slides.internal.c8m.d9 var4 = new com.aspose.slides.internal.c8m.d9();
      r2s var5 = new r2s(
         n5(var4, "tempLayoutPart", var2, new com.aspose.slides.internal.c8m.i1()), new t5w(var0.getPresentation(), InterruptionToken.getNone())
      );
      var5.n5(var3);
   }

   public static void k5(ISmartArt var0, int var1) {
      String var2 = x9u.n5(var1);
      if (var2 == null) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(
               "SmartArt style for type {0} does not exist", new Object[]{com.aspose.slides.ms.System.s3.n5(SmartArtQuickStyleType.class, var1)}
            ),
            "quickStyleType"
         );
      }

      d2c var3 = ((SmartArt)var0).u9();
      var3.n5((com.aspose.slides.internal.k4y.q6)null);
      com.aspose.slides.internal.c8m.d9 var4 = new com.aspose.slides.internal.c8m.d9();
      r0a var5 = new r0a(
         n5(var4, "tempQuickStylePart", var2, new com.aspose.slides.internal.c8m.e5()), new t5w(var0.getPresentation(), InterruptionToken.getNone())
      );
      var5.n5(var3);
   }

   public static void u3(ISmartArt var0, int var1) {
      String var2 = e6d.n5(var1);
      if (var2 == null) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(
               "SmartArt colors template for colorType '{0}' does not exist", new Object[]{com.aspose.slides.ms.System.s3.n5(SmartArtColorType.class, var1)}
            ),
            "colorType"
         );
      }

      d2c var3 = ((SmartArt)var0).u9();
      var3.n5((com.aspose.slides.internal.k4y.y1)null);
      com.aspose.slides.internal.c8m.d9 var4 = new com.aspose.slides.internal.c8m.d9();
      z6s var5 = new z6s(
         n5(var4, "tempColorsPart", var2, new com.aspose.slides.internal.c8m.s3()), new t5w(var0.getPresentation(), InterruptionToken.getNone())
      );
      var5.n5(var3);
   }

   private static com.aspose.slides.internal.c8m.j8 n5(com.aspose.slides.internal.c8m.d9 var0, String var1, String var2, com.aspose.slides.internal.c8m.i4 var3) {
      return var0.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/diagrams/", var1, ".xml"}), null, var3, com.aspose.slides.internal.l7h.u6.z3().u3(var2));
   }
}
