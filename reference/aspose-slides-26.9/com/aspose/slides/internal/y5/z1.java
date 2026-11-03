package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class z1 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.m3.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_publicId", "get_systemId", "get_notationName", "get_inputEncoding", "get_xmlEncoding", "get_xmlVersion"
   );

   @Override
   public void l6() {
      this.n5("publicId", 1);
      this.n5("systemId", 1);
      this.n5("notationName", 1);
      this.n5("inputEncoding", 1);
      this.n5("xmlEncoding", 1);
      this.n5("xmlVersion", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.f5.m3 var4 = (com.aspose.slides.internal.f5.m3)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5());
         case 1:
            return this.n5(var4.l6());
         case 2:
            return this.n5(var4.k5());
         case 3:
            return this.n5(var4.u3());
         case 4:
            return this.n5(var4.a6());
         case 5:
            return this.n5(var4.u9());
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.r4.class);
   }
}
