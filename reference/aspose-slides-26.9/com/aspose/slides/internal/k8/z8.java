package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.k5.v4;
import com.aspose.slides.ms.System.y8;

public class z8 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(v4.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("get_top", "get_right", "get_bottom", "get_left");

   @Override
   public void l6() {
      this.n5("top", 1);
      this.n5("right", 1);
      this.n5("bottom", 1);
      this.n5("left", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      v4 var4 = (v4)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u3.class));
         case 1:
            return this.n5(var4.l6(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u3.class));
         case 2:
            return this.n5(var4.k5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u3.class));
         case 3:
            return this.n5(var4.u3(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u3.class));
         default:
            throw new j3("unknown function");
      }
   }
}
