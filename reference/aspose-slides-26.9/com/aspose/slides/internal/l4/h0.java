package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.ms.System.d1;

public class h0 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.t2()) {
         var2.l6(this);
      } else {
         if (!var1.c8()) {
            if (var1.h0() && var1.t4().l6()) {
               return true;
            }

            if (var1.s7() && d1.a6(var1.y4().n5(), "html")) {
               com.aspose.slides.internal.f5.z3 var3 = var2.n5(var1.e2());
               var2.u9().k5(var3);
               var2.l6().n5(var3);
               var2.n5(k5);
               return true;
            }

            if (var1.x8() && com.aspose.slides.internal.w3.u9.l6(var1.y4().n5(), "head", "body", "html", "br")) {
               return this.l6(var1, var2);
            }

            if (var1.x8()) {
               var2.l6(this);
               return true;
            }

            return this.l6(var1, var2);
         }

         var2.n5((com.aspose.slides.internal.c3.a6)var1, var2.u9());
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      com.aspose.slides.internal.f5.z3 var3 = var2.n5(new h6("html"));
      var2.u9().k5(var3);
      var2.l6().n5(var3);
      var2.n5(k5);
      return var2.n5(var1);
   }
}
