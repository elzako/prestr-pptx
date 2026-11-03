package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class j5 extends k5 {
   public j5(String var1) {
      super(var1, null);
   }

   @Override
   public int k5() {
      return 1;
   }

   @Override
   public String u9() {
      return this.n5() != null ? d1.n5("{0}|*", new Object[]{this.n5()}) : "*";
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (this.n5() != null) {
         if (this.n5().length() == 0) {
            return d1.n5(var1.s7());
         }

         if ("*".equals(this.n5())) {
            return true;
         }

         if (this.h0() != null && this.h0().a_() != null) {
            String var3 = this.h0().a_().a6().n5(this.n5());
            if (var3 != null) {
               return d1.a6(var3, var1.s7());
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public int u3() {
      return 0;
   }
}
