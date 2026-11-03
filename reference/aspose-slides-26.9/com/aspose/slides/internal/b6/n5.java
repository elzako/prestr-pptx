package com.aspose.slides.internal.b6;

public class n5 extends com.aspose.slides.internal.g1.u3 {
   @Override
   public void n5(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.n5 var4 = (com.aspose.slides.internal.i3.n5)var1;
      com.aspose.slides.internal.k1.e2 var5 = var4.n5();
      if (var3.x8() != null) {
         if ((var5.l6() & 65535) != var3.x8().k5()) {
            com.aspose.slides.internal.f8y.n5.k5("palette.NumberOfEntries != currentPalette.NumberOfEntries");
            return;
         }

         for (int var6 = 0; var6 < var3.x8().l6().length; var6++) {
            if ((var3.x8().n5()[var6] & 255 & 1) > 0) {
               var5.k5()[var6].u9().n5(var3.x8().l6()[var6]);
            }
         }
      }
   }
}
