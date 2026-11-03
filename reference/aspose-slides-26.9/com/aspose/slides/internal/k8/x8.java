package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class x8 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.z8.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("get_selectorText", "set_selectorText", "get_style");

   @Override
   public void l6() {
      this.n5("selectorText", 3);
      this.n5("style", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.k5.z8 var4 = (com.aspose.slides.internal.k5.z8)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.k5());
         case 1:
            throw new j3("Setting selectorText is not allowed.");
         case 2:
            return this.n5(var4.u9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.m3.class));
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.q0.class);
   }
}
