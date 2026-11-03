package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class j9 extends u3 {
   public j9() {
      super("only-of-type");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (var1.a5() != null && var1.a5().n3() == 1) {
         for (com.aspose.slides.internal.j3.z8 var3 = var1.v4(); var3 != null; var3 = var3.v4()) {
            if (var3.n3() == 1 && d1.a6(((com.aspose.slides.internal.j3.z3)var3).a6(), var1.a6())) {
               return false;
            }
         }

         for (com.aspose.slides.internal.j3.z8 var4 = var1.z7(); var4 != null; var4 = var4.z7()) {
            if (var4.n3() == 1 && d1.a6(((com.aspose.slides.internal.j3.z3)var4).a6(), var1.a6())) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
