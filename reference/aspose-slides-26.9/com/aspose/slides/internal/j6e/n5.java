package com.aspose.slides.internal.j6e;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.d3v.l6$q0;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;

public class n5 {
   public static l6$q0 n5(com.aspose.slides.internal.f2i.n5 var0, int var1, int var2, int var3, z6 var4) {
      if (var0.y2() != 5 || !v4.n5(var4.n5(), v4.k5()) && !v4.n5(var4.n5(), v4.l6())) {
         if (var0.y2() == 2 && v4.n5(var4.n5(), v4.l6(16))) {
            return new n5$n5(var0, var1, var2, var3);
         } else {
            throw new NotSupportedException("Color format not supported of the raw loader");
         }
      } else {
         return new com.aspose.slides.internal.d3c.k5(var0, var1, var2, var3, var4);
      }
   }
}
