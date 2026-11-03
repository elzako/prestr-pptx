package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class x8 extends l6 {
   public x8(b3 var1, b3 var2) {
      super(var1, var2);
   }

   @Override
   public String u9() {
      return d1.n5(new String[]{this.n5().u9(), " ", this.l6().u9()});
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!this.l6().n5(var1, var2)) {
         return false;
      }

      b3 var3 = this.n5();

      for (com.aspose.slides.internal.j3.z8 var4 = var1.a5(); var4 != null && var4.n3() == 1; var4 = var4.a5()) {
         if (var3.n5((com.aspose.slides.internal.j3.z3)var4, null)) {
            return true;
         }
      }

      return false;
   }
}
