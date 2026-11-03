package com.aspose.slides.internal.x4a;

import com.aspose.slides.internal.o9b.m3;
import java.awt.Color;
import java.io.IOException;

public final class u9 extends com.aspose.slides.internal.s2b.u3 {
   short n5;
   short l6;
   Color k5;

   public u9() {
   }

   public u9(Color var1) {
      this.k5 = var1;
   }

   public u9(m3 var1) {
      this.k5 = com.aspose.slides.internal.o9b.c8.l6(var1.k5());
      short var2 = 0;
      switch (var1.e2()) {
         case 0:
            var2 = 8192;
            break;
         case 1:
            var2 = 4096;
      }

      byte var3 = 0;
      switch (var1.y4()) {
         case 0:
            var2 = 512;
            break;
         case 1:
            var2 = 256;
      }

      this.n5 = (short)(var1.x8() | var2 | var3);
      this.l6 = (short)var1.q0();
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
   }

   @Override
   public int n5() {
      return 762;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.c4t.t2 var4 = new com.aspose.slides.internal.c4t.t2(com.aspose.slides.internal.c4t.t2.n5(this.n5, this.l6), this.k5);
      var1.n5(var4);
      super.n5(var1, var2, var3);
   }
}
