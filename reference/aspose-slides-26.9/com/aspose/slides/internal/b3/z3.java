package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;

public class z3 extends s7 {
   @Override
   public int n5() {
      return 1;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      String var3 = var1[0].j_();
      if (var3 == null) {
         throw new z8("Incorrect parameter to from-nearest-specified-value function");
      } else {
         int var4 = com.aspose.slides.internal.e5.s7.n5(var3);
         if (var4 < 0) {
            throw new z8(d1.n5(new String[]{"Unknown property name used with inherited-property-value function: ", var3}));
         } else {
            return var2.u3().u9(var4);
         }
      }
   }
}
