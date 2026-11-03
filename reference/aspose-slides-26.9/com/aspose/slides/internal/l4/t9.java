package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.ms.System.d1;

public class t9 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.t2()) {
         var2.l6(this);
      } else {
         if (var1.s7() && d1.a6(var1.e2().n5(), "html")) {
            return h0.n5(var1, var2);
         }

         if (!var1.x8() || !d1.a6(var1.t9().n5(), "noscript")) {
            if ((!var1.h0() || !var1.t4().l6())
               && !var1.c8()
               && (!var1.s7() || !com.aspose.slides.internal.w3.u9.l6(var1.y4().n5(), "basefont", "bgsound", "link", "meta", "noframes", "style"))) {
               if (var1.x8() && d1.a6(var1.y4().n5(), "br")) {
                  return this.l6(var1, var2);
               }

               if ((!var1.s7() || !com.aspose.slides.internal.w3.u9.l6(var1.y4().n5(), "head", "noscript")) && !var1.x8()) {
                  return this.l6(var1, var2);
               }

               var2.l6(this);
               return false;
            }

            return u3.n5(var1, var2);
         }

         var2.n5();
         var2.n5(u3);
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.l6(this);
      var2.n5();
      var2.n5(u3);
      return var2.n5(var1);
   }
}
