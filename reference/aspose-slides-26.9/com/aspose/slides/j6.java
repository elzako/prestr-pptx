package com.aspose.slides;

class j6 {
   static void n5(IBackdrop3DScene var0, com.aspose.slides.internal.k0r.r3 var1, com.aspose.slides.internal.k0r.a9 var2) {
   }

   static void n5(IBackdrop3DScene var0, com.aspose.slides.internal.k0r.r3 var1, com.aspose.slides.internal.k0r.a9 var2, g6o var3) {
      float[] var4 = var0.getAnchorPoint();
      float[] var5 = var0.getNormalVector();
      float[] var6 = var0.getUpVector();
      if (var5[0] != 0.0F || var5[1] != 0.0F || var5[2] != 0.0F || var6[0] != 0.0F || var6[1] != 0.0F || var6[2] != 0.0F) {
         var3.n5("Serialization of the Backdrop3DScene is not imlemented yet.", 2);
      }
   }
}
