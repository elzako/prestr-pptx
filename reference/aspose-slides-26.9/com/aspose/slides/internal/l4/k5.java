package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;

public class k5 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.h0() && var1.t4().l6()) {
         return h0.n5(var1, var2);
      }

      if (var1.c8()) {
         var2.n5(var1.z1(), var2.l6().u3());
      } else {
         if (var1.t2()) {
            var2.l6(this);
            return false;
         }

         if (var1.s7() && c8$l6.n5.n5(var1.y4().u3())) {
            return h0.n5(var1, var2);
         }

         if (var1.x8() && c8$l6.n5.n5(var1.y4().u3())) {
            if (var2.w1()) {
               var2.l6(this);
               return false;
            }

            var2.n5(m3);
         } else {
            if (!var1.n3()) {
               return this.l6(var1, var2);
            }

            var2.p8();
         }
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.l6(this);
      var2.n5(h0);
      return var2.n5(var1);
   }
}
