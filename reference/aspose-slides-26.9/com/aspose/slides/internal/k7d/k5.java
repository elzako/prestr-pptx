package com.aspose.slides.internal.k7d;

import com.aspose.slides.internal.b3z.c8;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public final class k5 extends com.aspose.slides.internal.d0e.a6 {
   public k5() {
      this.u9 = "feFlood";
   }

   public final String a0() {
      return this.l6.k5("flood-color", "#000");
   }

   public final float d2() {
      for (t2 var1 = this; var1 != null; var1 = var1.z8()) {
         String var2 = var1.l6.k5("flood-opacity", null);
         if (!d1.n5(var2) && !"inherit".equals(var2)) {
            return q1.l6(1.0F, q1.n5(0.0F, com.aspose.slides.internal.b3z.c8.n5(var2)));
         }
      }

      return 1.0F;
   }
}
