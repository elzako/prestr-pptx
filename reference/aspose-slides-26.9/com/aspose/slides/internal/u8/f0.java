package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class f0 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.x9.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_disabled", "set_disabled", "get_media", "set_media", "get_type", "set_type"
   );

   @Override
   public void l6() {
      this.n5("disabled", 3);
      this.n5("media", 3);
      this.n5("type", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.x9 var4 = (com.aspose.slides.internal.w8.x9)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9());
         case 1:
            var4.n5(var3[0].n5());
            break;
         case 2:
            return this.n5(var4.z6());
         case 3:
            var4.m3(var3[0].toString());
            break;
         case 4:
            return this.n5(var4.e9());
         case 5:
            var4.z8(var3[0].toString());
            break;
         default:
            throw new j3("unknown function");
      }

      return this.u9();
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.h6.n5.class);
   }
}
