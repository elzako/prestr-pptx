package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.ms.System.d1;

public class e2 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.h0() && var1.t4().l6()) {
         var2.n5(var1.t4());
         return true;
      }

      switch (var1.u9()) {
         case 0:
            h6 var3 = var1.e2();
            String var6 = var3.n5();
            if (d1.a6(var6, "html")) {
               return h0.n5(var1, var2);
            }

            if (com.aspose.slides.internal.w3.u9.l6(var6, "base", "basefont", "bgsound", "command", "link")) {
               var2.l6(var3);
               var2.n5();
               var2.k7();
            } else if (d1.a6(var6, "meta")) {
               var2.l6(var3);
               var2.n5();
               var2.f2();
            } else if (d1.a6(var6, "title")) {
               var2.n5(com.aspose.slides.internal.i6.d1.z7);
            } else if (com.aspose.slides.internal.w3.u9.l6(var6, "noframes", "style")) {
               var2.n5(com.aspose.slides.internal.i6.d1.i9);
            } else if (d1.a6(var6, "noscript")) {
               if (var2.r4()) {
                  var2.n5(com.aspose.slides.internal.i6.d1.i9);
               } else {
                  var2.l6(var3);
                  var2.n5(a6);
               }
            } else if (d1.a6(var6, "script")) {
               com.aspose.slides.internal.f5.z3 var7 = var2.l6(var3);
               var2.h0().n5(com.aspose.slides.internal.i6.d1.h2);
               var2.c8();
               var2.n5(c8);
            } else {
               if (!d1.a6(var6, "template")) {
                  if (d1.a6(var6, "head")) {
                     var2.l6(this);
                     return false;
                  }

                  return this.l6(var1, var2);
               }

               var2.l6(var3);
               var2.t4();
               var2.n5(false);
               var2.n5(q0);
               var2.c4().push(q0);
            }
            break;
         case 1:
            com.aspose.slides.internal.c3.s7 var5 = var1.t9();
            String var4 = var5.n5();
            if (d1.a6(var4, "head")) {
               var2.n5();
               var2.n5(u9);
            } else {
               if (com.aspose.slides.internal.w3.u9.l6(var4, "body", "html", "br")) {
                  return this.l6(var1, var2);
               }

               if (!d1.a6(var4, "template")) {
                  var2.l6(this);
                  return false;
               }

               if (var2.y2() == null) {
                  var2.l6(this);
                  return true;
               }

               var2.z3();
               if (!var2.u3().u3().n5(c8$l6.t2)) {
                  var2.l6(this);
               }

               var2.l6("template");
               var2.z1();
               var2.c4().pop();
               var2.k5(false);
            }
            break;
         case 2:
         default:
            return this.l6(var1, var2);
         case 3:
            var2.n5(var1.z1());
            break;
         case 4:
            var2.l6(this);
            return false;
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.n5();
      var2.n5(u9);
      return var2.n5(var1);
   }
}
