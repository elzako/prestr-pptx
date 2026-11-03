package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;

public class k7 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      switch (var1.u9()) {
         case 2:
            com.aspose.slides.internal.c3.u3 var3 = var1.t4();
            if (var3.n5('\u0000')) {
               var2.l6(this);
               return false;
            }

            var2.z8().addItem(var3);
            return true;
         default:
            if (!var2.z8().n5()) {
               for (com.aspose.slides.internal.c3.u3 var5 : var2.z8()) {
                  t2.l6(var5, var2);
               }
            } else {
               for (com.aspose.slides.internal.c3.u3 var7 : var2.z8()) {
                  var2.n5(var7);
               }
            }

            var2.t2();
            return var2.n5(var1);
      }
   }
}
