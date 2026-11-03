package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.internal.i4.j3;

public class w1 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.h0()) {
         var2.n5(var1.t4());
      } else {
         if (var1.u9() == 5) {
            var2.l6(this);
            if (var2.u3().n5(c8$l6.l6)) {
            }

            var2.n5();
            var2.t2();
            return var2.n5(var1);
         }

         if (!var1.x8() || !var1.y4().n5(c8$l6.l6)) {
            return this.u3(var1, var2);
         }

         com.aspose.slides.internal.f5.z3 var3 = var2.u3();
         var2.n5();
         var2.t2();
         var2.i1();
         String var4 = var3.e5();

         try {
            var2.y1().u3().l6(var4);
         } catch (j3 var6) {
            var2.n5(var6);
         }

         var2.e5();
      }

      return true;
   }

   @Override
   public boolean u3(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.n5();
      var2.t2();
      return true;
   }
}
