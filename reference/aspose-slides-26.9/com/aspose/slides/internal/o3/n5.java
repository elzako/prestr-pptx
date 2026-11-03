package com.aspose.slides.internal.o3;

public class n5 extends x8 {
   public void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.y6.u3 var2) {
      com.aspose.slides.internal.k1.l6 var3 = (com.aspose.slides.internal.k1.l6)var2;
      var1.n5(var3.n5());
      var1.n5(var3.l6());
      var1.n5(var3.k5());
      var1.n5(var3.u3());
      var1.n5(var3.u9());
      int var4 = (var3.l6() * (var3.h0() & 255) + 15 >> 4 << 1) * var3.k5();
      if (var3.c8().length != var4) {
         throw new com.aspose.slides.internal.p5.u3("Invalid Bits length.");
      }

      var1.n5(var3.c8());
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.k1.l6 var2) {
      var1.n5(var2.n5());
      var1.n5(var2.l6());
      var1.n5(var2.k5());
      var1.n5(var2.u3());
      var1.n5(var2.u9());
      var1.n5(var2.c8());
   }
}
