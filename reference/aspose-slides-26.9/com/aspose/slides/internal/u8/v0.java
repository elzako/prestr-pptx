package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class v0 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.p3.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_type",
      "get_selectedIndex",
      "set_selectedIndex",
      "get_value",
      "set_value",
      "get_length",
      "set_length",
      "get_form",
      "get_options",
      "get_disabled",
      "set_disabled",
      "get_multiple",
      "set_multiple",
      "get_name",
      "set_name",
      "get_size",
      "set_size",
      "get_tabIndex",
      "set_tabIndex",
      "add",
      "remove",
      "blur",
      "focus"
   );

   @Override
   public void l6() {
      this.k5("Add");
      this.k5("Remove");
      this.k5("Blur");
      this.k5("Focus");
      this.n5("type", 1);
      this.n5("selectedIndex", 3);
      this.n5("value", 3);
      this.n5("length", 3);
      this.n5("form", 1);
      this.n5("options", 1);
      this.n5("disabled", 3);
      this.n5("multiple", 3);
      this.n5("name", 3);
      this.n5("size", 3);
      this.n5("tabIndex", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.p3 var4 = (com.aspose.slides.internal.w8.p3)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9());
         case 1:
            return this.n5(var4.z6());
         case 2:
            var4.n5(var3[0].d2());
            break;
         case 3:
            return this.n5(var4.e9());
         case 4:
            var4.m3(var3[0].toString());
            break;
         case 5:
            return this.n5(var4.o5());
         case 6:
            var4.l6(var3[0].d2());
            break;
         case 7:
            return this.n5(var4.j8(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.q0.class));
         case 8:
            return this.n5(var4.w2(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.u6.class));
         case 9:
            return this.n5(var4.s0());
         case 10:
            var4.n5(var3[0].n5());
            break;
         case 11:
            return this.n5(var4.v8());
         case 12:
            var4.k5(var3[0].n5());
            break;
         case 13:
            return this.n5(var4.v3());
         case 14:
            var4.z8(var3[0].toString());
            break;
         case 15:
            return this.n5(var4.g7());
         case 16:
            var4.k5(var3[0].d2());
            break;
         case 17:
            return this.n5(var4.j4());
         case 18:
            var4.u3(var3[0].d2());
            break;
         case 19:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }
            break;
         case 20:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }
         case 21:
         case 22:
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
