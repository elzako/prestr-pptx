package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class t9 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u9.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("get_cssText", "set_cssText", "get_cssValueType");

   @Override
   public void l6() {
      this.n5("cssText", 3);
      this.n5("cssValueType", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.k5.u9 var4 = (com.aspose.slides.internal.k5.u9)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.u9());
         case 1:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].toString());
            return this.u9();
         case 2:
            return this.n5(var4.h0());
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected void n5(g7 var1) {
      this.n5(var1, "CSS_INHERIT", this.n5(0.0));
      this.n5(var1, "CSS_PRIMITIVE_VALUE", this.n5(1.0));
      this.n5(var1, "CSS_VALUE_LIST", this.n5(2.0));
      this.n5(var1, "CSS_CUSTOM", this.n5(3.0));
      super.n5(var1);
   }
}
