package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;

public class l6 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.c8()) {
         var2.l6(var1.z1());
      } else {
         if (var1.t2() || var1.h0() && var1.t4().l6() || var1.s7() && var1.y4().n5(c8$l6.n5)) {
            return h0.n5(var1, var2);
         }

         if (!var1.n3()) {
            if (var1.s7() && var1.y4().n5(c8$l6.h0)) {
               return u3.n5(var1, var2);
            }

            return this.l6(var1, var2);
         }

         var2.p8();
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.l6(this);
      return false;
   }
}
