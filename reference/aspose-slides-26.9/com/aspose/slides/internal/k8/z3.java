package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.k5.a0;
import com.aspose.slides.internal.k5.y1;
import com.aspose.slides.ms.System.y8;

public class z3 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(y1.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("getOverrideStyle");

   @Override
   public void l6() {
      this.k5("getOverrideStyle");
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      y1 var4 = (y1)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(
               var4.n5((com.aspose.slides.internal.f5.z3)var3[0].D_(), var3[1].toString()),
               com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.m3.class)
            );
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(a0.class);
   }
}
