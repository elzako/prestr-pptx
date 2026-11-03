package com.aspose.slides.internal.p2;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.ms.System.d1;

public class k5 {
   public static final k5 n5 = new k5();

   public final l6 n5(c8 var1) {
      if (c8.r5d.equals(var1)) {
         return u9.k5;
      } else if (c8.y4k.equals(var1)) {
         return h0.k5;
      } else if (c8.d4.equals(var1)) {
         return u3.k5;
      } else if (c8.r3q.equals(var1)) {
         return a6.k5;
      } else {
         throw new IOException(d1.n5(new String[]{"Unknown encoding for '", var1.n5(), "'"}));
      }
   }
}
