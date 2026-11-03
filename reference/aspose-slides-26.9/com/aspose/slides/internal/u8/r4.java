package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class r4 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.c4.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_defaultValue",
      "set_defaultValue",
      "get_defaultChecked",
      "set_defaultChecked",
      "get_form",
      "get_accept",
      "set_accept",
      "get_accessKey",
      "set_accessKey",
      "get_align",
      "set_align",
      "get_alt",
      "set_alt",
      "get_checked",
      "set_checked",
      "get_disabled",
      "set_disabled",
      "get_maxLength",
      "set_maxLength",
      "get_name",
      "set_name",
      "get_readOnly",
      "set_readOnly",
      "get_size",
      "set_size",
      "get_src",
      "set_src",
      "get_tabIndex",
      "set_tabIndex",
      "get_type",
      "set_type",
      "get_useMap",
      "set_useMap",
      "get_value",
      "set_value",
      "blur",
      "focus",
      "select",
      "click"
   );

   @Override
   public void l6() {
      this.k5("Blur");
      this.k5("Focus");
      this.k5("Select");
      this.k5("Click");
      this.n5("defaultValue", 3);
      this.n5("defaultChecked", 3);
      this.n5("form", 1);
      this.n5("accept", 3);
      this.n5("accessKey", 3);
      this.n5("align", 3);
      this.n5("alt", 3);
      this.n5("checked", 3);
      this.n5("disabled", 3);
      this.n5("maxLength", 3);
      this.n5("name", 3);
      this.n5("readOnly", 3);
      this.n5("size", 3);
      this.n5("src", 3);
      this.n5("tabIndex", 3);
      this.n5("type", 3);
      this.n5("useMap", 3);
      this.n5("value", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.c4 var4 = (com.aspose.slides.internal.w8.c4)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9());
         case 1:
            var4.m3(var3[0].toString());
            break;
         case 2:
            return this.n5(var4.z6());
         case 3:
            var4.n5(var3[0].n5());
            break;
         case 4:
            return this.n5(var4.e9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.q0.class));
         case 5:
            return this.n5(var4.o5());
         case 6:
            var4.z8(var3[0].toString());
            break;
         case 7:
            return this.n5(var4.j8());
         case 8:
            var4.j5(var3[0].toString());
            break;
         case 9:
            return this.n5(var4.w2());
         case 10:
            var4.w1(var3[0].toString());
            break;
         case 11:
            return this.n5(var4.s0());
         case 12:
            var4.r4(var3[0].toString());
            break;
         case 13:
            return this.n5(var4.v8());
         case 14:
            var4.k5(var3[0].n5());
            break;
         case 15:
            return this.n5(var4.v3());
         case 16:
            var4.u3(var3[0].n5());
            break;
         case 17:
            return this.n5(var4.g7());
         case 18:
            var4.n5(var3[0].d2());
            break;
         case 19:
            return this.n5(var4.j4());
         case 20:
            var4.c4(var3[0].toString());
            break;
         case 21:
            return this.n5(var4.i9());
         case 22:
            var4.a6(var3[0].n5());
            break;
         case 23:
            return this.n5(var4.f5());
         case 24:
            var4.l6(var3[0].d2());
            break;
         case 25:
            return this.n5(var4.j3());
         case 26:
            var4.y2(var3[0].toString());
            break;
         case 27:
            return this.n5(var4.n1());
         case 28:
            var4.k5(var3[0].d2());
            break;
         case 29:
            return this.n5(var4.p6());
         case 30:
            var4.y1(var3[0].toString());
            break;
         case 31:
            return this.n5(var4.d1());
         case 32:
            var4.a0(var3[0].toString());
            break;
         case 33:
            return this.n5(var4.s4());
         case 34:
            var4.d2(var3[0].toString());
         case 35:
         case 36:
         case 37:
         case 38:
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
