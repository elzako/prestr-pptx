package com.aspose.slides.internal.s5r;

import com.aspose.slides.internal.c4i.e5;
import com.aspose.slides.internal.j3z.x8;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d5;

public abstract class n5 {
   public static boolean n5(e5 var0, t4 var1) {
      boolean var2 = true;
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var1);
      short var4 = var3.k7();
      if (d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(x8.class), var4)) {
         var0.l6(var4);
      } else {
         var2 = false;
      }

      var0.n5(var3.k7());
      var0.l6(var3.m3());
      var0.b_(var3.m3());
      return var2;
   }

   public abstract boolean n5(e5[] var1, t4 var2);
}
