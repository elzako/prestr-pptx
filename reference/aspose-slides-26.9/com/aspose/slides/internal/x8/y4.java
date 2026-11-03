package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class y4 extends k5 {
   public y4(String var1, String var2) {
      super(var1, var2);
   }

   @Override
   public int k5() {
      return 4;
   }

   @Override
   public String u9() {
      return this.n5() != null ? d1.n5("{0}|{1}",new Object[]{ this.n5(), this.l6()}) : this.l6();
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (var1 == null) {
         return false;
      }

      if (this.n5() != null) {
         if (this.n5().length() == 0) {
            return d1.n5(var1.s7());
         }

         if ("*".equals(this.n5())) {
            return d1.u3(var1.t2(), this.l6(), (short)3);
         }

         if (this.h0() != null && this.h0().a_() != null) {
            String var3 = this.h0().a_().a6().n5(this.n5());
            if (var3 != null && d1.a6(var3, var1.s7())) {
               return d1.u3(var1.t2(), this.l6(), (short)3);
            }
         }

         return false;
      } else {
         String var4;
         if (var1.x8() == null) {
            var4 = var1.h0();
         } else {
            var4 = var1.t2();
         }

         return d1.u3(var4, this.l6(), (short)3);
      }
   }

   @Override
   public int u3() {
      return 1;
   }
}
