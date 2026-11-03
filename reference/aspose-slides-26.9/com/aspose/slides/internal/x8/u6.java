package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class u6 extends i1 {
   public u6() {
      super("indeterminate");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!n5(var1)) {
         return false;
      }

      if (!var1.t2("indeterminate")) {
         return false;
      }

      String var3 = d1.a6(var1.u3("indeterminate"));
      return d1.a6(var3, "true") || d1.a6(var3, "1");
   }
}
