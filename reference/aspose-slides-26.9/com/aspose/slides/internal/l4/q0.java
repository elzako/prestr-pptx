package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.ms.System.d1;

public class q0 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      switch (var1.u9()) {
         case 0:
            h6 var6 = var1.e2();
            String var7 = var6.n5();
            if (d1.a6(var7, "html")) {
               return h0.n5(var1, var2);
            }

            if (d1.a6(var7, "option")) {
               if (d1.a6(var2.u3().u3().l6(), "option")) {
                  var2.n5();
               }

               var2.l6(var6);
            } else if (d1.a6(var7, "optgroup")) {
               if (var2.u3().u3().n5(c8$l6.k5)) {
                  var2.n5();
               }

               if (var2.u3().u3().n5(c8$l6.u3)) {
                  var2.n5();
               }

               var2.l6(var6);
            } else {
               if (!d1.a6(var7, "select")) {
                  if (com.aspose.slides.internal.w3.u9.l6(var7, "input", "keygen", "textarea")) {
                     var2.l6(this);
                     if (!var2.e2()) {
                        return false;
                     }

                     var2.l6("select");
                     var2.k5(false);
                     return var2.n5(var1);
                  }

                  if (d1.a6(var7, "script")) {
                     return u3.n5(var1, var2);
                  }

                  if (d1.a6(var7, c8$l6.t2.l6())) {
                     return u3.n5(var1, var2);
                  }

                  return this.l6(var1, var2);
               }

               var2.l6(this);
               var2.l6(var7);
               var2.k5(false);
            }
            break;
         case 1:
            com.aspose.slides.internal.c3.s7 var4 = var1.t9();
            String var5 = var4.n5();
            if (d1.a6(var5, "optgroup")) {
               if (var2.u3().u3().n5(c8$l6.k5) && var2.l6().u3(var2.u3()).u3().n5(c8$l6.u3)) {
                  var2.n5();
               }

               if (var2.u3().u3().n5(c8$l6.u3)) {
                  var2.n5();
               } else {
                  var2.l6(this);
               }
            } else if (d1.a6(var5, "option")) {
               if (d1.a6(var2.u3().u3().l6(), "option")) {
                  var2.n5();
               } else {
                  var2.l6(this);
               }
            } else {
               if (!d1.a6(var5, "select")) {
                  if (d1.a6(var5, c8$l6.t2.l6())) {
                     return u3.n5(var1, var2);
                  }

                  return this.l6(var1, var2);
               }

               if (!var2.e2()) {
                  var2.l6(this);
                  return false;
               }

               var2.l6(var5);
               var2.k5(false);
            }
            break;
         case 2:
            com.aspose.slides.internal.c3.u3 var3 = var1.t4();
            if (var3.n5('\u0000')) {
               var2.l6(this);
               return false;
            }

            var2.n5(var3);
            break;
         case 3:
            var2.n5(var1.z1());
            break;
         case 4:
            var2.l6(this);
            return false;
         case 5:
            return h0.n5(var1, var2);
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.l6(this);
      return true;
   }
}
