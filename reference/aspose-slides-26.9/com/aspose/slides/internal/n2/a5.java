package com.aspose.slides.internal.n2;

public class a5 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      n5(var1, var2);
      com.aspose.slides.internal.b9.x9 var3 = (com.aspose.slides.internal.b9.x9)var1;
      new com.aspose.slides.internal.o3.t4().n5(var2, var3.n5());
      var2.n5(var3.l6() & 4294967295L);
      var2.n5(var3.k5() & 4294967295L);
      var2.n5(var3.u3() & 4294967295L);

      for (com.aspose.slides.internal.t5.z8 var7 : var3.u9().n5()) {
         new com.aspose.slides.internal.l0.z1().n5(var2, var7);
      }

      if (var3.u3() == 0L || var3.u3() == 1L) {
         for (com.aspose.slides.internal.t5.a6 var15 : var3.u9().l6()) {
            new com.aspose.slides.internal.l0.k5().n5(var2, var15);
         }

         var2.n5(var3.u9().u3());
      } else if (var3.u3() == 2L) {
         for (com.aspose.slides.internal.t5.u9 var14 : var3.u9().k5()) {
            new com.aspose.slides.internal.l0.u3().n5(var2, var14);
         }
      }

      return true;
   }
}
