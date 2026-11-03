package com.aspose.slides.internal.b4;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.g8.f2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d5;

public abstract class n5 {
   public static boolean n5(b3 var0, t4 var1) {
      boolean var2 = true;
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var1);
      short var4 = (short)var3.r4();
      if (d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(f2.class), var4)) {
         var0.l6(var4);
      } else {
         var2 = false;
      }

      var0.n5(var3.k7());
      var0.l6(var3.m3());
      var0.n5(var3.m3());
      return var2;
   }

   public abstract boolean n5(b3[] var1, t4 var2);
}
