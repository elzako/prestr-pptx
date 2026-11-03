package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.k5.s3;
import com.aspose.slides.ms.System.y8;

public class m3 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(s3.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("get_red", "get_green", "get_blue");

   @Override
   public void l6() {
      this.n5("red", 1);
      this.n5("green", 1);
      this.n5("blue", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      s3 var4 = (s3)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u3.class));
         case 1:
            return this.n5(var4.l6(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u3.class));
         case 2:
            return this.n5(var4.k5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u3.class));
         default:
            throw new j3("unknown function");
      }
   }
}
