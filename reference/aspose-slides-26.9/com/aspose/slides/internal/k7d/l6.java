package com.aspose.slides.internal.k7d;

import com.aspose.slides.internal.b3z.t2;
import com.aspose.slides.ms.System.d1;

public class l6 extends com.aspose.slides.internal.d0e.a6 {
   private final String[] c8 = new String[]{"matrix", "saturate", "hueRotate", "luminanceToAlpha"};

   public l6() {
      this.u9 = "feColorMatrix";
   }

   public final String a0() {
      return this.l6.k5("type", this.c8[0]);
   }

   public final int d2() {
      for (int var1 = 0; var1 < this.c8.length; var1++) {
         if (d1.a6(this.c8[var1], this.a0())) {
            return var1;
         }
      }

      return 0;
   }

   public final t2 d5() {
      return t2.n5(this.l6.k5("values", d1.n5));
   }

   public final String s3() {
      return this.l6.k5("in", null);
   }
}
