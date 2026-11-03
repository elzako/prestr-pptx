package com.aspose.slides.internal.g2;

public class i1 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.e5 var3 = new com.aspose.slides.internal.i3.e5(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.n5(var4.r4());
      var3.n5(com.aspose.slides.internal.o6.n5.l6(var3.n5() & 65535, var4));
      long var5 = 0L;

      for (int var10 : var3.l6()) {
         var5 = (var5 & 4294967295L) + (var10 & 65535) & 4294967295L;
      }

      var3.n5(com.aspose.slides.internal.o6.u3.l6(var5, var4));
      var1[0] = var3;
      return true;
   }
}
