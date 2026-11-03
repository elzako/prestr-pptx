package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class q0 extends n5 {
   public q0(String var1, String var2, String var3) {
      super(var1, var2, var3);
   }

   @Override
   public String a6() {
      return d1.n5('[', this.l6(), "~=\"", this.k5(), "\"]");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!d1.n5(this.k5()) && d1.u3(this.k5(), ' ') == -1) {
         if (!this.l6(var1)) {
            return false;
         }

         String[] var3 = d1.n5(this.n5(var1), new char[]{' '}, (short)1);

         for (String var7 : var3) {
            if (d1.a6(var7, this.k5())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
