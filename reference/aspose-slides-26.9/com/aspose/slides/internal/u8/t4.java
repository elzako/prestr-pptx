package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class t4 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.q0.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_elements",
      "get_length",
      "get_name",
      "set_name",
      "get_acceptCharset",
      "set_acceptCharset",
      "get_action",
      "set_action",
      "get_enctype",
      "set_enctype",
      "get_method",
      "set_method",
      "get_target",
      "set_target",
      "submit",
      "reset"
   );

   @Override
   public void l6() {
      this.k5("Submit");
      this.k5("Reset");
      this.n5("elements", 1);
      this.n5("length", 1);
      this.n5("name", 3);
      this.n5("acceptCharset", 3);
      this.n5("action", 3);
      this.n5("enctype", 3);
      this.n5("method", 3);
      this.n5("target", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.q0 var4 = (com.aspose.slides.internal.w8.q0)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 1:
            return this.n5(var4.z6());
         case 2:
            return this.n5(var4.e9());
         case 3:
            var4.m3(var3[0].toString());
            break;
         case 4:
            return this.n5(var4.o5());
         case 5:
            var4.z8(var3[0].toString());
            break;
         case 6:
            return this.n5(var4.j8());
         case 7:
            var4.j5(var3[0].toString());
            break;
         case 8:
            return this.n5(var4.w2());
         case 9:
            var4.w1(var3[0].toString());
            break;
         case 10:
            return this.n5(var4.s0());
         case 11:
            var4.r4(var3[0].toString());
            break;
         case 12:
            return this.n5(var4.v8());
         case 13:
            var4.c4(var3[0].toString());
         case 14:
         case 15:
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
