package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class s7 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.y4.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_lineNumber", "get_columnNumber", "get_byteOffset", "get_utf16Offset", "get_relatedNode", "get_uri"
   );

   @Override
   public void l6() {
      this.n5("lineNumber", 1);
      this.n5("columnNumber", 1);
      this.n5("byteOffset", 1);
      this.n5("utf16Offset", 1);
      this.n5("relatedNode", 1);
      this.n5("uri", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.f5.y4 var4 = (com.aspose.slides.internal.f5.y4)var2.C_();
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
            com.aspose.slides.internal.j3.z8 var5 = var4.a6();
            if (var5 == null) {
               return this.u9();
            }

            return this.n5(var5, j8.n5(var5));
         case 5:
            return this.n5(var4.u9());
         default:
            throw new j3("unknown function");
      }
   }
}
