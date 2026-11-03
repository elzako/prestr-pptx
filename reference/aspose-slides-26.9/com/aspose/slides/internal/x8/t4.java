package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class t4 extends n5 {
   public t4(String var1, String var2) {
      super(var1, "id", var2);
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!this.l6(var1)) {
         return false;
      }

      String var3 = this.n5(var1);
      return d1.a6(var3, this.k5());
   }

   @Override
   public String a6() {
      return d1.n5(new String[]{"#", this.k5()});
   }

   @Override
   public int u3() {
      return 100;
   }
}
