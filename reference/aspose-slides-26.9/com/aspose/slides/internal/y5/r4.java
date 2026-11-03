package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.f5.a0;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class r4 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(a0.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("get_target", "get_data", "set_data");

   @Override
   public void l6() {
      this.n5("target", 1);
      this.n5("data", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      a0 var4 = (a0)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5());
         case 1:
            return this.n5(var4.l6());
         case 2:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].toString());
            return this.u9();
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.r4.class);
   }
}
