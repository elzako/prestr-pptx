package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class a6 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.j3.n5.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "setParameter", "getParameter", "canSetParameter", "get_parameterNames"
   );

   @Override
   public void l6() {
      this.k5("setParameter");
      this.k5("getParameter");
      this.k5("canSetParameter");
      this.n5("parameterNames", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.j3.n5 var4 = (com.aspose.slides.internal.j3.n5)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].toString(), var3[1].D_());
            return this.u9();
         case 1:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].toString()));
         case 2:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.l6(var3[0].toString(), var3[1].D_()));
         case 3:
            return this.n5(var4.n5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.t9.class));
         default:
            throw new j3("unknown function");
      }
   }
}
