package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.f5.s3;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class n5 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.n5.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_name", "get_specified", "get_value", "set_value", "get_ownerElement", "get_schemaTypeInfo", "get_isId"
   );

   @Override
   public void l6() {
      this.n5("name", 1);
      this.n5("specified", 1);
      this.n5("value", 3);
      this.n5("ownerElement", 1);
      this.n5("schemaTypeInfo", 1);
      this.n5("isId", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.f5.n5 var4 = (com.aspose.slides.internal.f5.n5)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5());
         case 1:
            return this.n5(var4.l6());
         case 2:
            return this.n5(var4.k5());
         case 3:
            var4.n5(var3[0].toString());
            return this.u9();
         case 4:
            com.aspose.slides.internal.j3.z3 var5 = var4.u3();
            if (var5 == null) {
               return this.u9();
            }

            return this.n5(var5, j8.n5(var5));
         case 5:
            return this.n5(var4.a6(), com.aspose.slides.internal.v6g.k5.n5(s3.class));
         case 6:
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
