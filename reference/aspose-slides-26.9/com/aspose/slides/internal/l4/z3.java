package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.ms.System.d1;

public class z3 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      switch (var1.u9()) {
         case 0:
            h6 var5 = var1.e2();
            String var6 = var5.n5();
            if (!d1.a6(var6, "tr")) {
               if (com.aspose.slides.internal.w3.u9.l6(var6, "th", "td")) {
                  var2.l6(this);
                  var2.d2();
                  var2.n5("tr");
                  var2.n5(e2);
                  return var2.n5((y8)var5);
               }

               if (com.aspose.slides.internal.w3.u9.l6(var6, "caption", "col", "colgroup", "tbody", "tfoot", "thead")) {
                  if (!var2.u3("tbody", "thead", "tfoot")) {
                     var2.l6(this);
                     return false;
                  }

                  var2.d2();
                  var2.n5(t2);
                  return var2.n5((y8)var5);
               }

               return this.l6(var1, var2);
            }

            var2.d2();
            var2.l6(var5);
            var2.n5(e2);
            break;
         case 1:
            com.aspose.slides.internal.c3.s7 var3 = var1.t9();
            String var4 = var3.n5();
            if (!com.aspose.slides.internal.w3.u9.l6(var4, "tbody", "tfoot", "thead")) {
               if (d1.a6(var4, "table")) {
                  if (!var2.u3("tbody", "thead", "tfoot")) {
                     var2.l6(this);
                     return false;
                  }

                  var2.d2();
                  var2.n5(t2);
                  return var2.n5(var3);
               }

               if (com.aspose.slides.internal.w3.u9.l6(var4, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                  var2.l6(this);
                  return false;
               }

               return this.l6(var1, var2);
            }

            if (!var2.a6(var4)) {
               var2.l6(this);
               return false;
            }

            var2.d2();
            var2.n5();
            var2.n5(t2);
            break;
         default:
            return this.l6(var1, var2);
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      return t2.n5(var1, var2);
   }
}
