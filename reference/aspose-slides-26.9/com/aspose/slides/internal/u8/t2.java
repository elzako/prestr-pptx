package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class t2 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.t2.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_form",
      "get_accessKey",
      "set_accessKey",
      "get_disabled",
      "set_disabled",
      "get_name",
      "set_name",
      "get_tabIndex",
      "set_tabIndex",
      "get_type",
      "get_value",
      "set_value"
   );

   @Override
   public void l6() {
      this.n5("form", 1);
      this.n5("accessKey", 3);
      this.n5("disabled", 3);
      this.n5("name", 3);
      this.n5("tabIndex", 3);
      this.n5("type", 1);
      this.n5("value", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.t2 var4 = (com.aspose.slides.internal.w8.t2)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.q0.class));
         case 1:
            return this.n5(var4.z6());
         case 2:
            var4.m3(var3[0].toString());
            break;
         case 3:
            return this.n5(var4.e9());
         case 4:
            var4.n5(var3[0].n5());
            break;
         case 5:
            return this.n5(var4.o5());
         case 6:
            var4.z8(var3[0].toString());
            break;
         case 7:
            return this.n5(var4.j8());
         case 8:
            var4.n5(var3[0].d2());
            break;
         case 9:
            return this.n5(var4.w2());
         case 10:
            return this.n5(var4.s0());
         case 11:
            var4.j5(var3[0].toString());
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
