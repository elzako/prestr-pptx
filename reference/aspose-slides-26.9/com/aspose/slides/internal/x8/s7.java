package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class s7 extends n5 {
   public s7(String var1, String var2, String var3) {
      super(var1, var2, var3);
   }

   @Override
   public String a6() {
      return d1.n5('[', this.l6(), "|=\"", this.k5(), "\"]");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!this.l6(var1)) {
         return false;
      }

      String var3 = this.n5(var1);
      if (var3.length() < this.k5().length()) {
         return false;
      }

      if (var3.length() == this.k5().length()) {
         return d1.a6(var3, this.k5());
      }

      int var4 = d1.c8(var3, this.k5());
      return var4 != 0 ? false : var3.charAt(this.k5().length()) == '-';
   }
}
