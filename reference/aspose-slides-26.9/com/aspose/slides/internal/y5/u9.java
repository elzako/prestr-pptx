package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class u9 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.t2.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_severity", "get_message", "get_type", "get_relatedException", "get_relatedData", "get_location"
   );

   @Override
   public void l6() {
      this.n5("severity", 1);
      this.n5("message", 1);
      this.n5("type", 1);
      this.n5("relatedException", 1);
      this.n5("relatedData", 1);
      this.n5("location", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.f5.t2 var4 = (com.aspose.slides.internal.f5.t2)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5() & 0xFF);
         case 1:
            return this.n5(var4.l6());
         case 2:
            return this.n5(var4.k5());
         case 3:
            return this.n5(var4.u3());
         case 4:
            return this.n5(var4.a6());
         case 5:
            return this.n5(var4.u9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.y4.class));
         default:
            throw new j3("unknown function");
      }
   }
}
