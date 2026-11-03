package com.aspose.slides.internal.k7d;

import com.aspose.slides.ms.System.d1;

public class n5 extends com.aspose.slides.internal.d0e.a6 {
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "normal", "multiply", "screen", "overlay", "darken", "lighten"
   );

   public n5() {
      this.u9 = "feBlend";
   }

   public final String a0() {
      return this.l6.k5("in", null);
   }

   public final String d2() {
      return this.l6.k5("in2", null);
   }

   public final String d5() {
      return this.l6.k5("mode", "normal");
   }

   public final int s3() {
      String var1 = d1.a6(this.d5());
      switch (c8.n5(var1)) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 4;
         case 5:
            return 5;
         default:
            return 6;
      }
   }
}
