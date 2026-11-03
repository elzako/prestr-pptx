package com.aspose.slides.internal.c9;

public class j4 extends com.aspose.slides.internal.t7.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.f5 var3 = (com.aspose.slides.internal.i3.f5)var1;
      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var2);
      var4.n5(var3.n5() & 65535);
      if ((var3.e2() & 4294967295L) > 4L) {
         var4.n5(var3.l6());
      }

      return true;
   }
}
