package com.aspose.slides.internal.w5i;

import com.aspose.slides.internal.b3z.c8;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class u9 extends com.aspose.slides.internal.d0e.a6 {
   public u9() {
      this.u9 = "stop";
   }

   public final float a0() {
      float var1 = 0.0F;
      if (d1.k5(d1.l6(this.l6.k5("offset")), "%")) {
         var1 = com.aspose.slides.internal.b3z.c8.n5(d1.a6(this.l6.k5("offset"), '%')) / 100.0F;
      } else {
         var1 = com.aspose.slides.internal.b3z.c8.n5(this.l6.k5("offset"));
      }

      return q1.l6(1.0F, q1.n5(0.0F, var1));
   }

   public final void k5(float var1) {
      this.l6.l6("offset", com.aspose.slides.internal.b3z.c8.n5(var1));
   }

   public final com.aspose.slides.internal.b3z.u3 d2() {
      if ("inherit".equals(this.l6.k5("stop-color"))) {
         for (t2 var1 = this.z8(); var1 != null; var1 = var1.z8()) {
            if (!d1.n5(var1.l6.k5("stop-color")) && !"inherit".equals(var1.l6.k5("stop-color"))) {
               return com.aspose.slides.internal.b3z.u3.n5(var1.l6.k5("stop-color"));
            }
         }
      }

      return com.aspose.slides.internal.b3z.u3.n5(
         "currentColor".equals(this.l6.k5("stop-color")) ? this.z8().l6.k5("color") : this.l6.k5("stop-color", "black")
      );
   }

   public final void n5(com.aspose.slides.internal.b3z.u3 var1) {
      this.l6.l6("stop-color", var1.toString());
   }

   public final float d5() {
      float var1 = 1.0F;
      if (!this.s3()) {
         return var1;
      }

      if ("inherit".equals(this.l6.k5("stop-opacity"))) {
         for (t2 var2 = this.z8(); var2 != null; var2 = var2.z8()) {
            if (!d1.n5(var2.l6.k5("stop-opacity")) && !"inherit".equals(var2.l6.k5("stop-opacity"))) {
               var1 = com.aspose.slides.internal.b3z.c8.n5(var2.l6.k5("stop-opacity"));
            }
         }
      } else {
         var1 = com.aspose.slides.internal.b3z.c8.n5(this.l6.k5("stop-opacity"));
      }

      return q1.l6(1.0F, q1.n5(0.0F, var1));
   }

   public final void u3(float var1) {
      this.l6.l6("stop-opacity", com.aspose.slides.internal.b3z.c8.n5(var1));
   }

   public final boolean s3() {
      return this.l6.k5("stop-opacity") != null;
   }
}
