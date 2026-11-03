package com.aspose.slides.internal.n2;

public class z6 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      n5(var1, var2);
      com.aspose.slides.internal.b9.v3 var3 = (com.aspose.slides.internal.b9.v3)var1;
      var2.n5((long)(var3.k5() & 65535));
      var2.n5(var3.n5() & 4294967295L);
      var2.n5(var3.l6() & 4294967295L);
      byte[] var4 = com.aspose.slides.internal.l7h.j5.z1().u3(var3.u3());
      var2.n5(var4);
      var2.n5(var3.u9());
      return true;
   }
}
