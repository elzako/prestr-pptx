package com.aspose.slides;

class p3p {
   static byte[] n5(IPPImage var0) {
      float var1 = 1.3333334F;
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.o9b.l6 var3 = com.aspose.slides.internal.n8e.k7.n5(
            var0.getBinaryData(),
            com.aspose.slides.internal.v6g.k5.u3(var0.getWidth() * 1.3333334F, 13),
            com.aspose.slides.internal.v6g.k5.u3(var0.getHeight() * 1.3333334F, 13)
         );

         try {
            var3.n5(var2, com.aspose.slides.internal.j9e.x8.s7());
            return var2.toArray();
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         var2.dispose();
      }
   }
}
