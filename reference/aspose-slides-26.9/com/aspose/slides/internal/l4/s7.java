package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.y8.n5$n5;
import com.aspose.slides.ms.System.d1;

public class s7 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.x8() && d1.a6(var1.y4().n5(), "caption")) {
         com.aspose.slides.internal.c3.s7 var5 = var1.t9();
         String var4 = var5.n5();
         if (!var2.a6(var4)) {
            var2.l6(this);
            return false;
         }

         var2.z3();
         if (!d1.a6(var2.u3().u3().l6(), "caption")) {
            var2.l6(this);
         }

         var2.l6("caption");
         var2.z1();
         var2.n5(t2);
         return true;
      } else if ((!var1.s7() || !com.aspose.slides.internal.w3.u9.l6(var1.e2().n5(), n5$n5.y2)) && (!var1.x8() || !d1.a6(var1.t9().n5(), "table"))) {
         if (var1.x8() && com.aspose.slides.internal.w3.u9.l6(var1.y4().n5(), n5$n5.y1)) {
            var2.l6(this);
            return false;
         } else {
            return this.l6(var1, var2);
         }
      } else {
         var2.l6(this);
         String var3 = "caption";
         if (!var2.a6(var3)) {
            var2.l6(this);
            return false;
         } else {
            var2.l6(var3);
            var2.z1();
            var2.n5(t2);
            return var2.n5(var1);
         }
      }
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      return h0.n5(var1, var2);
   }
}
