package com.aspose.slides.internal.q4o;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.t2d.k5;
import com.aspose.slides.internal.t2d.u3;

public class l6 {
   public static com.aspose.slides.internal.t2d.n5 n5(com.aspose.slides.internal.f2i.n5 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("options");
      }

      com.aspose.slides.internal.t2d.n5 var1;
      switch (var0.x8()) {
         case 0:
            var1 = new com.aspose.slides.internal.t2d.l6();
            break;
         case 1:
            var1 = new u3();
            break;
         default:
            var1 = new k5();
      }

      return var1;
   }
}
