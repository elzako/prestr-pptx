package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class y1 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.j3.y1.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("handle");

   @Override
   public void l6() {
      this.k5("handle");
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.j3.y1 var4 = (com.aspose.slides.internal.j3.y1)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            if (var3.length != 5) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(
               (Byte)var3[0].D_(),
               var3[1].toString(),
               var3[2].D_(),
               (com.aspose.slides.internal.f5.r4)var3[3].D_(),
               (com.aspose.slides.internal.f5.r4)var3[4].D_()
            );
            return this.u9();
         default:
            throw new j3("unknown function");
      }
   }
}
