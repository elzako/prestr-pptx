package com.aspose.slides.internal.o6;

import com.aspose.slides.internal.i3.v4;
import com.aspose.slides.internal.o4.m3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d5;

public abstract class l6 {
   public static boolean n5(v4[] var0, t4 var1) {
      boolean var2 = true;
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var1);
      var0[0].k5(var1.getPosition() & 4294967295L);
      long var4 = var3.c4();
      int var6 = var3.r4();
      if (d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(m3.class), var6)) {
         var0[0].k5(var6 & 65535);
      } else {
         var2 = false;
      }

      var0[0].l6(var4);
      return var2;
   }

   public abstract boolean l6(v4[] var1, t4 var2);
}
