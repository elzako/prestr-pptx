package com.aspose.slides.internal.c9;

public class y4 extends com.aspose.slides.internal.t7.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.e2 var3 = (com.aspose.slides.internal.i3.e2)var1;
      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var2);
      var4.n5(var3.n5() & 65535);
      var4.n5(var3.l6() & 65535);
      if (com.aspose.slides.internal.v6g.k5.l6(var3.k5(), com.aspose.slides.internal.k1.l6.class)) {
         new com.aspose.slides.internal.o3.n5().n5(var4, var3.k5());
      } else {
         new com.aspose.slides.internal.o3.u9().n5(var4, (com.aspose.slides.internal.k1.t2)var3.k5());
      }

      return true;
   }
}
