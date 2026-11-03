package com.aspose.slides.internal.g2;

public class t4 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);
      com.aspose.slides.internal.i3.q0 var4 = new com.aspose.slides.internal.i3.q0(var1[0]);
      int var5 = var3.r4();
      if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.y4.class), var5)) {
         var4.n5(var5 & 65535);
         com.aspose.slides.internal.l8.z1 var6 = com.aspose.slides.internal.l8.t9.n5(var4.n5());
         com.aspose.slides.internal.i3.q0[] var7 = new com.aspose.slides.internal.i3.q0[]{var4};
         boolean var8 = var6.l6(var7, var3);
         var4 = var7[0];
         if (var8) {
            var1[0] = var4;
            return true;
         } else {
            com.aspose.slides.internal.f8y.n5.u3(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Unable to read WmfEscapeRecord; WmfMetafileEscape:", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.o4.y4.class, var4.n5())
               })
            );
            return false;
         }
      } else {
         com.aspose.slides.internal.f8y.n5.u3("Invalid WmfMetafileEscape for WmfEscapeRecord");
         return false;
      }
   }
}
