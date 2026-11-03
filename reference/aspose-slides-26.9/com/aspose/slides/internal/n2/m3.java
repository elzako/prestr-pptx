package com.aspose.slides.internal.n2;

public class m3 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      long var3 = var2.n5().getPosition();
      n5(var1, var2);
      com.aspose.slides.internal.b9.r4 var5 = (com.aspose.slides.internal.b9.r4)var1;
      var2.n5(var5.n5() & 4294967295L);
      var2.n5(var5.l6() & 4294967295L);
      var2.n5(var5.k5() & 4294967295L);
      var2.n5(var5.u3() & 4294967295L);
      var2.n5(var5.u9() & 4294967295L);
      var2.n5(var5.h0() & 4294967295L);
      new com.aspose.slides.internal.o3.u9(var3, var5.y2(), var5.k5(), var5.u3(), var5.u9(), var5.h0(), (int)(var5.l6() & 65535L)).n5(var2, var1);
      return true;
   }
}
