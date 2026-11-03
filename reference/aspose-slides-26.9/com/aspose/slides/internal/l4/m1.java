package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.internal.y8.n5$n5;
import com.aspose.slides.ms.System.d1;

public class m1 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.h0() && com.aspose.slides.internal.w3.u9.l6(var2.u3().u3().l6(), n5$n5.w1)) {
         var2.m3();
         var2.c8();
         var2.n5(s7);
         return var2.n5(var1);
      }

      if (var1.c8()) {
         var2.n5(var1.z1());
         return true;
      }

      if (var1.t2()) {
         var2.l6(this);
         return false;
      }

      if (var1.s7()) {
         h6 var3 = var1.e2();
         String var4 = var3.n5();
         if (d1.a6(var4, "caption")) {
            var2.a0();
            var2.t4();
            var2.l6(var3);
            var2.n5(x8);
         } else if (d1.a6(var4, "colgroup")) {
            var2.a0();
            var2.l6(var3);
            var2.n5(n3);
         } else {
            if (d1.a6(var4, "col")) {
               var2.a0();
               var2.n5("colgroup");
               var2.n5(n3);
               return var2.n5(var1);
            }

            if (com.aspose.slides.internal.w3.u9.l6(var4, "tbody", "tfoot", "thead")) {
               var2.a0();
               var2.l6(var3);
               var2.n5(y4);
            } else {
               if (com.aspose.slides.internal.w3.u9.l6(var4, "td", "th", "tr")) {
                  var2.a0();
                  var2.n5("tbody");
                  var2.n5(y4);
                  return var2.n5(var1);
               }

               if (d1.a6(var4, "table")) {
                  var2.l6(this);
                  if (!var2.a6(var4)) {
                     return false;
                  }

                  var2.l6("table");
                  var2.k5(false);
                  return var2.n5(var1);
               }

               if (com.aspose.slides.internal.w3.u9.l6(var4, "style", "script", "template")) {
                  return u3.n5(var1, var2);
               }

               if (d1.a6(var4, "input")) {
                  if (!var3.k5().n5("type") || !d1.a6("hidden", var3.k5().l6("type"))) {
                     return this.l6(var1, var2);
                  }

                  var2.l6(this);
                  var2.l6(var3);
                  var2.n5();
                  var2.k7();
               } else {
                  if (!d1.a6(var4, "form")) {
                     return this.l6(var1, var2);
                  }

                  var2.l6(this);
                  if (var2.l6().n5(c8$l6.t2) || var2.n3() != null) {
                     return false;
                  }

                  com.aspose.slides.internal.f5.z3 var5 = var2.l6(var3);
                  var2.u3(var5);
                  var2.n5((com.aspose.slides.internal.j3.z3)var5);
               }
            }
         }
      } else {
         if (!var1.x8()) {
            if (var1.u9() == 5) {
               return h0.n5(var1, var2);
            }

            return this.l6(var1, var2);
         }

         com.aspose.slides.internal.c3.s7 var6 = var1.t9();
         String var7 = var6.n5();
         if (!d1.a6(var7, "table")) {
            if (com.aspose.slides.internal.w3.u9.l6(var7, n5$n5.c4)) {
               var2.l6(this);
               return false;
            }

            if (d1.a6(var7, "template")) {
               return u3.n5(var1, var2);
            }

            return this.l6(var1, var2);
         }

         if (!var2.a6(var7)) {
            var2.l6(this);
            return false;
         }

         var2.l6("table");
         var2.k5(false);
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.l6(this);
      var2.l6(true);
      h0.n5(var1, var2);
      var2.l6(false);
      return true;
   }
}
