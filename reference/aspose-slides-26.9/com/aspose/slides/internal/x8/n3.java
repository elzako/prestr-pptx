package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class n3 extends m3 {
   public n3(b3 var1, b3 var2) {
      super(var1, var2);
   }

   @Override
   public int k5() {
      return 12;
   }

   @Override
   public String u9() {
      return d1.n5(new String[]{this.n5().u9(), " + ", this.l6().u9()});
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!this.l6().n5(var1, var2)) {
         return false;
      }

      for (com.aspose.slides.internal.j3.z8 var3 = var1.v4(); var3 != null; var3 = var3.v4()) {
         if (var3.n3() == 1) {
            return this.n5().n5((com.aspose.slides.internal.j3.z3)var3, null);
         }
      }

      return false;
   }
}
