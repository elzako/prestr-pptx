package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class o0 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.v4.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_form",
      "get_defaultSelected",
      "set_defaultSelected",
      "get_text",
      "get_index",
      "get_disabled",
      "set_disabled",
      "get_label",
      "set_label",
      "get_selected",
      "set_selected",
      "get_value",
      "set_value"
   );

   @Override
   public void l6() {
      this.n5("form", 1);
      this.n5("defaultSelected", 3);
      this.n5("text", 1);
      this.n5("index", 1);
      this.n5("disabled", 3);
      this.n5("label", 3);
      this.n5("selected", 3);
      this.n5("value", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.v4 var4 = (com.aspose.slides.internal.w8.v4)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.q0.class));
         case 1:
            return this.n5(var4.z6());
         case 2:
            var4.n5(var3[0].n5());
            break;
         case 3:
            return this.n5(var4.e9());
         case 4:
            return this.n5(var4.o5());
         case 5:
            return this.n5(var4.j8());
         case 6:
            var4.k5(var3[0].n5());
            break;
         case 7:
            return this.n5(var4.w2());
         case 8:
            var4.m3(var3[0].toString());
            break;
         case 9:
            return this.n5(var4.s0());
         case 10:
            var4.u3(var3[0].n5());
            break;
         case 11:
            return this.n5(var4.v8());
         case 12:
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
