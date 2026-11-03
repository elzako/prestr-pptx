package com.aspose.slides.internal.q8g;

import java.io.IOException;

public final class u9 extends com.aspose.slides.internal.s2b.u3 {
   short n5;
   short l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
   }

   @Override
   public int n5() {
      return 552;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.d2n.u9 var4 = var1.z1(this.n5);
      if (var4 == null) {
         throw new com.aspose.slides.internal.p7x.l6("MetafileImage broken.");
      }

      var1.a6();
      var1.t4(this.l6);
      var1.u9(var4);
      var1.u9(-1);
      super.n5(var1, var2, var3);
   }
}
