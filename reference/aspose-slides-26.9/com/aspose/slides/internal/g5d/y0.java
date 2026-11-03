package com.aspose.slides.internal.g5d;

import com.aspose.slides.internal.c4i.w2;

public class y0 extends com.aspose.slides.internal.s5r.n5 {
   @Override
   public boolean n5(com.aspose.slides.internal.c4i.e5[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      w2 var3 = new w2(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      com.aspose.slides.internal.y5s.j5[] var5 = (com.aspose.slides.internal.y5s.j5[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.y5s.j5.class), var3.u9())
      );
      if (var3.u3()) {
         for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].n5(com.aspose.slides.internal.v6g.k5.u3(var4.z1(), 6));
            var5[var6].l6(com.aspose.slides.internal.v6g.k5.u3(var4.z1(), 6));
            var5[var6].k5(com.aspose.slides.internal.v6g.k5.u3(var4.z1(), 6));
            var5[var6].u3(com.aspose.slides.internal.v6g.k5.u3(var4.z1(), 6));
         }
      } else {
         for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7].n5(var4.k7());
            var5[var7].l6(var4.k7());
            var5[var7].k5(var4.k7());
            var5[var7].u3(var4.k7());
         }
      }

      var3.n5(var5);
      var1[0] = var3;
      return true;
   }
}
