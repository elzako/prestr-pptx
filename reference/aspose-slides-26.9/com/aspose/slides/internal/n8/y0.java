package com.aspose.slides.internal.n8;

import com.aspose.slides.internal.a4.s0;

public class y0 extends com.aspose.slides.internal.o8.l6 {
   @Override
   public void l6(com.aspose.slides.internal.a4.b3 var1, com.aspose.slides.internal.z0k.t4 var2) {
      s0 var3 = (s0)var1;
      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var2);
      if (var3.k5()) {
         for (com.aspose.slides.internal.o9b.y2 var8 : var3.c8()) {
            var4.n5((byte)var8.s7());
            var4.n5((byte)var8.x8());
            var4.n5((byte)var8.t2());
            var4.n5((byte)var8.l6());
         }
      } else {
         for (com.aspose.slides.internal.o9b.y2 var12 : var3.c8()) {
            var4.n5((short)var12.s7());
            var4.n5((short)var12.x8());
            var4.n5((short)var12.t2());
            var4.n5((short)var12.l6());
         }
      }
   }
}
