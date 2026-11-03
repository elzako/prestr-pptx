package com.aspose.slides.internal.r4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.e5.y2;

public class t4 {
   public static List<w1> n5(com.aspose.slides.internal.z0k.t4 var0, q0 var1) {
      return n5(var0, var1, null);
   }

   private static List<w1> n5(com.aspose.slides.internal.z0k.t4 var0, q0 var1, String var2) {
      boolean var3 = false;
      boolean[] var4 = new boolean[]{false};
      z1.n5(var4);
      var3 = var4[0];
      com.aspose.slides.internal.y1.u9 var5 = null;

      try {
         var5 = com.aspose.slides.internal.y1.u9.n5();
         com.aspose.slides.internal.y1.u3 var6 = var5.l6();
         var6.c8 = new List<>();
         var6.l6(var1.l6());
         var6.t2 = var1.k5();
         var6.n5(var1.u3());
         var6.l6(var1.a6());
         var6.n5(var1.a6());
         var6.u3(var1.u9());
         var6.n5(var1.h0());
         var5.n5(new com.aspose.slides.internal.e5.h0());
         var5.n5(new y2());
         var5.n5(var1.n5());
         com.aspose.slides.internal.y1.a6 var7 = var5.n5("application/X-fop-ex-aps", var6, new com.aspose.slides.internal.z0k.e2());
         com.aspose.slides.internal.w2.x8 var8 = new com.aspose.slides.internal.w2.x8();
         var8.n5(var7.n5());
         var8.n5(var0, var2);
         return com.aspose.slides.internal.v6g.k5.n5(var6.c8, List.class);
      } finally {
         if (!var3) {
            z1.n5().dispose();
         }

         if (var5 != null) {
            var5.dispose();
         }
      }
   }
}
