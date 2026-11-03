package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.k5.a0;
import com.aspose.slides.internal.k5.i1;
import com.aspose.slides.ms.System.y8;

public class m1 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(a0.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("get_stylesheets");

   @Override
   public void l6() {
      this.n5("stylesheets", 1);
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
            return this.n5(var4.l6(), com.aspose.slides.internal.v6g.k5.n5(i1.class));
         default:
            throw new j3("unknown function");
      }
   }
}
