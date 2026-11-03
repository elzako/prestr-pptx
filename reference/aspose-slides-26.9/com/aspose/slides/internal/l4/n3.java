package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.internal.f5.d2;
import com.aspose.slides.ms.System.d1;

public class n3 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.h0() && var1.t4().l6()) {
         var2.n5(var1.t4());
         return true;
      }

      switch (var1.u9()) {
         case 0:
            h6 var5 = var1.e2();
            String var6 = var5.n5();
            if (d1.a6(var6, "html")) {
               return h0.n5(var1, var2);
            }

            if (!d1.a6(var6, "col")) {
               if (d1.a6(var6, c8$l6.t2.l6())) {
                  return u3.n5(var1, var2);
               }

               return this.l6(var1, var2);
            }

            var2.l6(var5);
            var2.n5();
            var2.k7();
            break;
         case 1:
            com.aspose.slides.internal.c3.s7 var3 = var1.t9();
            String var4 = var3.n5();
            if (!d1.a6(var4, "colgroup")) {
               if (d1.a6(var4, "col")) {
                  var2.l6(this);
                  return false;
               }

               if (d1.a6(var4, c8$l6.t2.l6())) {
                  return u3.n5(var1, var2);
               }

               return this.l6(var1, var2);
            }

            if (!d1.a6(var2.u3().u3().l6(), var4)) {
               var2.l6(this);
               return false;
            }

            var2.n5();
            var2.n5(t2);
            break;
         case 2:
         default:
            return this.l6(var1, var2);
         case 3:
            var2.n5(var1.z1());
            break;
         case 4:
            var2.l6(this);
            break;
         case 5:
            return h0.n5(var1, var2);
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (!var2.u3().u3().n5(d2.n5("colgroup"))) {
         var2.l6(this);
         return false;
      } else {
         var2.n5();
         var2.n5(t2);
         return var2.n5(var1);
      }
   }
}
