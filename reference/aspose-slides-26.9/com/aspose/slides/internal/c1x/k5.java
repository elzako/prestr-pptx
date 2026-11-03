package com.aspose.slides.internal.c1x;

import java.io.IOException;

public class k5 extends com.aspose.slides.internal.n2z.k5 {
   private com.aspose.slides.internal.u7f.u3 n5 = new com.aspose.slides.internal.u7f.u3();

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5.k5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.n5.u3 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.n5.a6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.n5.u9 = com.aspose.slides.internal.l1b.k5.n5(var1, var2);
      var2++;
   }

   @Override
   public int n5() {
      return 104;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      if (this.n5.u9 == com.aspose.slides.internal.u7f.u3.l6) {
         var2.n5(198659);
      } else if (this.n5.u9 == com.aspose.slides.internal.u7f.u3.n5) {
         var2.n5(2498570);
      }
   }
}
