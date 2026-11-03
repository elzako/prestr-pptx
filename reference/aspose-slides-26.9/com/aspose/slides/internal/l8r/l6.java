package com.aspose.slides.internal.l8r;

import java.io.IOException;

public final class l6 extends com.aspose.slides.internal.n2z.k5 {
   int n5;
   com.aspose.slides.internal.d2n.u9 l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      var2 += 4;
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      if (var2 < var3) {
         this.l6 = new com.aspose.slides.internal.d2n.u9();
         var2 += this.l6.n5(var1, var2);
      } else {
         this.l6 = null;
      }
   }

   @Override
   public int n5() {
      return 75;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.l6(this.l6, this.n5);
   }
}
