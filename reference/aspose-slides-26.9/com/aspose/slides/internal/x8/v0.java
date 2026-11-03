package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class v0 extends u3 {
   public v0() {
      super("last-of-type");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (var1.a5() != null && var1.a5().n3() == 1) {
         for (com.aspose.slides.internal.j3.z8 var3 = var1.z7(); var3 != null; var3 = var3.z7()) {
            if (var3.n3() == 1 && d1.a6(((com.aspose.slides.internal.j3.z3)var3).a6(), var1.a6())) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
