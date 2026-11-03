package com.aspose.slides.internal.j9;

import com.aspose.slides.internal.h2.t2$n5;

public class u3 extends k5 {
   @Override
   public com.aspose.slides.internal.u6.n5 n5(com.aspose.slides.internal.u6.n5 var1, com.aspose.slides.internal.u6.n5 var2) {
      t2$n5 var3 = var1.l6();
      t2$n5 var4 = var2.l6();
      if (var3.n5() == 57) {
         return var1;
      }

      if (var4.n5() == 57) {
         return var2;
      }

      if (var4.n5() == 95) {
         return var1;
      }

      if (var3.n5() == 95) {
         return var2;
      }

      int var5 = var3.u3();
      int var6 = var4.u3();
      if (var5 > var6) {
         return var1;
      }

      if (var5 == var6) {
         int var7 = n5(var3.n5(), var4.n5());
         if (var7 > 0) {
            return var1;
         } else if (var7 < 0) {
            return var2;
         } else {
            var7 = l6(var1.k5(), var2.k5());
            if (var7 > 0) {
               return var1;
            } else {
               return var7 < 0 ? var2 : null;
            }
         }
      } else {
         return var2;
      }
   }
}
