package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.ms.System.d1;

public class x8 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.x8()) {
         com.aspose.slides.internal.c3.s7 var3 = var1.t9();
         String var4 = var3.n5();
         if (com.aspose.slides.internal.w3.u9.l6(var4, "td", "th")) {
            if (!var2.a6(var4)) {
               var2.l6(this);
               return false;
            }

            var2.z3();
            if (!d1.a6(var2.u3().u3().l6(), var4)) {
               var2.l6(this);
            }

            var2.l6(var4);
            var2.z1();
            var2.n5(e2);
            return true;
         } else {
            if (com.aspose.slides.internal.w3.u9.l6(var4, "body", "caption", "col", "colgroup", "html")) {
               var2.l6(this);
               return false;
            }

            if (com.aspose.slides.internal.w3.u9.l6(var4, "table", "tbody", "tfoot", "thead", "tr")) {
               if (!var2.a6(var4)) {
                  var2.l6(this);
                  return false;
               } else {
                  var2.s3();
                  return var2.n5(var1);
               }
            } else {
               return this.l6(var1, var2);
            }
         }
      } else if (!var1.s7() || !com.aspose.slides.internal.w3.u9.l6(var1.y4().n5(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
         return this.l6(var1, var2);
      } else if (!var2.u3("td", "th")) {
         var2.l6(this);
         return false;
      } else {
         var2.s3();
         return var2.n5(var1);
      }
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      return h0.n5(var1, var2);
   }
}
