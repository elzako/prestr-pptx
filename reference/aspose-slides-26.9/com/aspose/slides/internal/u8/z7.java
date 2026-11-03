package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class z7 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.u6.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("get_length", "Item", "namedItem");

   @Override
   public void l6() {
      this.k5("NamedItem");
      this.k5("Item");
      this.n5("length", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.u6 var4 = (com.aspose.slides.internal.w8.u6)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5());
         case 1:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].d2()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.r4.class));
         case 2:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.r4.class));
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.c4.class);
   }
}
