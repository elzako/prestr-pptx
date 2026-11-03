package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.ms.System.d1;

public class z1 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.s7()) {
         h6 var3 = var1.e2();
         String var4 = var3.n5();
         if (!com.aspose.slides.internal.w3.u9.l6(var4, "th", "td")) {
            if (com.aspose.slides.internal.w3.u9.l6(var4, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr")) {
               if (!var2.a6("tr")) {
                  var2.l6(this);
                  return false;
               }

               var2.d5();
               var2.n5();
               var2.n5(y4);
               return var2.n5(var1);
            }

            return this.l6(var1, var2);
         }

         var2.d5();
         var2.l6(var3);
         var2.n5(t9);
         var2.t4();
      } else {
         if (!var1.x8()) {
            return this.l6(var1, var2);
         }

         com.aspose.slides.internal.c3.s7 var5 = var1.t9();
         String var6 = var5.n5();
         if (!d1.a6(var6, "tr")) {
            if (d1.a6(var6, "table")) {
               if (!var2.a6("tr")) {
                  var2.l6(this);
                  return false;
               }

               var2.d5();
               var2.n5();
               var2.n5(y4);
               return var2.n5(var1);
            }

            if (com.aspose.slides.internal.w3.u9.l6(var6, "tbody", "tfoot", "thead")) {
               if (!var2.a6(var6)) {
                  var2.l6(this);
                  return false;
               }

               if (!var2.a6("tr")) {
                  var2.l6(this);
                  return false;
               }

               var2.d5();
               var2.n5();
               var2.n5(y4);
               return var2.n5(var1);
            }

            if (com.aspose.slides.internal.w3.u9.l6(var6, "body", "caption", "col", "colgroup", "html", "td", "th")) {
               var2.l6(this);
               return false;
            }

            return this.l6(var1, var2);
         }

         if (!var2.a6("tr")) {
            var2.l6(this);
            return false;
         }

         var2.d5();
         var2.n5();
         var2.n5(y4);
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      return t2.n5(var1, var2);
   }
}
