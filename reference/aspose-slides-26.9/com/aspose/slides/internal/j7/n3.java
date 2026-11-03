package com.aspose.slides.internal.j7;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;

public class n3 {
   private static final com.aspose.slides.internal.x7n.l6 n5 = com.aspose.slides.internal.r5t.t2.n5().u9();
   private static final com.aspose.slides.internal.x7n.l6 l6 = new com.aspose.slides.internal.x7n.l6("en-nz");

   public static t4 n5(String var0) {
      t4 var1 = com.aspose.slides.internal.b8.t2.l6(com.aspose.slides.internal.b8.t2.class, var0);
      if (var1 == null) {
         throw new InvalidOperationException(d1.n5("Cannot find resource '{0}'.", new Object[]{var0}));
      } else {
         return var1;
      }
   }
}
