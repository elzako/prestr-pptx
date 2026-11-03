package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

abstract class i1 extends u3 {
   protected i1(String var1) {
      super(var1);
   }

   protected static boolean n5(com.aspose.slides.internal.j3.z3 var0) {
      return i1$n5$n5.n5(var0.a6());
   }

   protected static boolean n5(com.aspose.slides.internal.j3.z3 var0, String var1, String var2) {
      if (!var0.t2(var1)) {
         return false;
      }

      String var3 = var0.u3(var1);
      return d1.n5(var2) ? d1.n5(var3) : d1.u3(var2, var3, (short)5);
   }
}
