package com.aspose.slides.internal.a2;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.b9.e2;
import com.aspose.slides.internal.b9.z3;
import com.aspose.slides.internal.g8.f2;
import com.aspose.slides.internal.r6.u9;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public abstract class l6 extends com.aspose.slides.internal.r5.k5 {
   @Override
   public void n5(z3 var1, u9 var2) {
      if (var1.r4().l6() != 3) {
         e2 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, e2.class);
         if (var3 != null && var3.l6() != null && var3.l6().length > 0) {
            var2.a6 = false;

            for (b3 var7 : var3.l6()) {
               var2.v4().n5 = true;
               com.aspose.slides.internal.x3.k5 var8 = this.n5().n5().n5(var7.t4());

               try {
                  var8.n5(var7, var2.v4());
               } catch (RuntimeException var10) {
                  if (var1.r4().l6() == 5) {
                     com.aspose.slides.internal.f8y.n5.k5(d1.n5("EmfPlusException (", s3.n5(f2.class, var7.t4()), "): ", var10.getMessage()));
                     var2.a6 = true;
                     break;
                  }
               }

               if (var7.t4() == 16388) {
                  var2.a6 = true;
                  break;
               }

               if (var7.t4() == 16386) {
                  break;
               }

               this.k5(var1, var2);
            }
         }
      }
   }

   protected l6(n5 var1) {
      super(var1);
   }
}
