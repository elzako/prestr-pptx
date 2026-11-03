package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.k5.d5;
import com.aspose.slides.ms.System.y8;

public class a6 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.z1.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("get_media", "get_cssRules", "insertRule", "deleteRule");

   @Override
   public void l6() {
      this.k5("insertRule");
      this.k5("deleteRule");
      this.n5("media", 1);
      this.n5("cssRules", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.k5.z1 var4 = (com.aspose.slides.internal.k5.z1)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.k5(), com.aspose.slides.internal.v6g.k5.n5(d5.class));
         case 1:
            return this.n5(var4.u9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.z3.class));
         case 2:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].toString(), var3[1].d2()));
         case 3:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].d2());
            return this.u9();
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.q0.class);
   }
}
