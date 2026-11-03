package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class o9 extends com.aspose.slides.internal.n3.t2 {
   @Override
   public String n5() {
      return "text-shadow";
   }

   @Override
   public int l6() {
      return 258;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0(l6$n5.a0);
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();
      com.aspose.slides.internal.z8.y4 var4 = var1;

      for (int var5 = 0; var4 != null; var5++) {
         if (var5 == 0) {
            if (35 == var4.n5()) {
               if (com.aspose.slides.ms.System.d1.u3("none", var4.t2(), (short)3)) {
                  var3.l6(l6$n5.a0);
                  return var3;
               }

               throw this.n5(var1.t2());
            }

            var3.l6(super.n5(var4, var2));
         } else if (var5 == 1) {
            var3.l6(super.n5(var4, var2));
         } else if (var5 == 2) {
            if (35 == var4.n5()) {
               var3.l6(var2.h0(72).n5(var4, var2));
            } else {
               var3.l6(super.n5(var4, var2));
            }
         } else {
            if (var5 != 3) {
               throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
            }

            var3.l6(var2.h0(72).n5(var4, var2));
         }

         var4 = var4.k5();
      }

      return var3;
   }
}
