package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.internal.y8.n5$n5;
import com.aspose.slides.ms.System.d1;

public class m3 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      switch (var1.u9()) {
         case 0:
            h6 var3 = var1.e2();
            String var4 = var3.n5();
            if (com.aspose.slides.internal.w3.u9.l6(var4, n5$n5.d5)) {
               return u3.n5(var1, var2);
            } else if (com.aspose.slides.internal.w3.u9.l6(var4, n5$n5.s3)) {
               var2.c4().pop();
               var2.c4().push(t2);
               var2.n5(t2);
               return var2.n5(var1);
            } else if (d1.a6(var4, "col")) {
               var2.c4().pop();
               var2.c4().push(n3);
               var2.n5(n3);
               return var2.n5(var1);
            } else if (d1.a6(var4, "tr")) {
               var2.c4().pop();
               var2.c4().push(y4);
               var2.n5(y4);
               return var2.n5(var1);
            } else {
               if (com.aspose.slides.internal.w3.u9.l6(var4, "td", "th")) {
                  var2.c4().pop();
                  var2.c4().push(e2);
                  var2.n5(e2);
                  return var2.n5(var1);
               }

               return this.k5(var1, var2);
            }
         case 1:
            com.aspose.slides.internal.c3.s7 var5 = var1.t9();
            String var6 = var5.n5();
            if (c8$l6.t2.n5(var5.u3())) {
               return u3.n5(var1, var2);
            }

            var2.l6(this);
            return false;
         case 2:
         case 3:
         case 4:
            h0.n5(var1, var2);
         default:
            return true;
         case 5:
            if (!var2.l6().n5(c8$l6.t2)) {
               var2.p8();
               return false;
            } else {
               var2.l6(this);
               var2.l6(c8$l6.t2.l6());
               var2.z1();
               var2.c4().pop();
               var2.k5(false);
               return var2.n5(var1);
            }
      }
   }

   @Override
   public boolean k5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.c4().pop();
      var2.c4().push(h0);
      var2.n5(h0);
      return var2.n5(var1);
   }
}
