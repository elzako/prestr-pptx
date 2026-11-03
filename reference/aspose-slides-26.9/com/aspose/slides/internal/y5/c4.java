package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.f5.d5;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class c4 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(d5.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "splitText", "get_elementContentWhitespace", "get_wholeText", "replaceWholeText"
   );

   @Override
   public void l6() {
      this.k5("splitText");
      this.k5("replaceWholeText");
      this.n5("elementContentWhitespace", 1);
      this.n5("wholeText", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      d5 var4 = (d5)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].d2()), com.aspose.slides.internal.v6g.k5.n5(d5.class));
         case 1:
            return this.n5(var4.k5());
         case 2:
            return this.n5(var4.u3());
         case 3:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.a6(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(d5.class));
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.a6.class);
   }
}
