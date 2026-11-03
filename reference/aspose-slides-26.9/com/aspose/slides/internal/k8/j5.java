package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.k5.e5;
import com.aspose.slides.ms.System.y8;

public class j5 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(e5.class);
   private com.aspose.slides.internal.k5.n5 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("getComputedStyle");

   @Override
   public void l6() {
      this.k5("getComputedStyle");
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      e5 var4 = (e5)var2.C_();
      switch (k5.n5(var1)) {
         case 0:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            com.aspose.slides.internal.k5.m3 var5 = var4.l6((com.aspose.slides.internal.f5.z3)var3[0].D_(), var3[1].toString());
            if (this.l6 == null || this.l6 != null && this.l6.n5() != var5) {
               this.l6 = new com.aspose.slides.internal.k5.n5(var5);
            }

            return this.n5(this.l6, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.s7.class));
         default:
            throw new j3("unknown function");
      }
   }
}
