package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class z8 extends n5 {
   public z8(String var1, String var2, String var3) {
      super(var1, var2, var3);
   }

   @Override
   public String a6() {
      return d1.n5('[', this.l6(), "^=\"", this.k5(), "\"]");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!this.l6(var1)) {
         return false;
      }

      if (d1.n5(this.k5())) {
         return false;
      }

      String var3 = this.n5(var1);
      return var3.length() == 0 ? false : d1.l6(var3, this.k5());
   }
}
