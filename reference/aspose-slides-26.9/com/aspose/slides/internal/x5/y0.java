package com.aspose.slides.internal.x5;

import com.aspose.slides.internal.a4.s0;

public class y0 extends com.aspose.slides.internal.b4.n5 {
   @Override
   public boolean n5(com.aspose.slides.internal.a4.b3[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      s0 var3 = new s0(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      com.aspose.slides.internal.o9b.y2[] var5 = (com.aspose.slides.internal.o9b.y2[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.y2.class), var3.u3())
      );
      if (var3.k5()) {
         for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].k5(var4.z1() & 255);
            var5[var6].u3(var4.z1() & 255);
            var5[var6].l6(var4.z1() & 255);
            var5[var6].n5(var4.z1() & 255);
         }
      } else {
         for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7].k5(var4.k7());
            var5[var7].u3(var4.k7());
            var5[var7].l6(var4.k7());
            var5[var7].n5(var4.k7());
         }
      }

      var3.n5(var5);
      var1[0] = var3;
      return true;
   }
}
