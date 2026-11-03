package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class s7 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.m3.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_cssText",
      "set_cssText",
      "getPropertyValue",
      "getPropertyCSSValue",
      "removeProperty",
      "getPropertyPriority",
      "setProperty",
      "get_length",
      "item",
      "get_parentRule"
   );

   @Override
   public void l6() {
      this.k5("getPropertyValue");
      this.k5("getPropertyCSSValue");
      this.k5("removeProperty");
      this.k5("getPropertyPriority");
      this.k5("setProperty");
      this.k5("item");
      this.n5("cssText", 3);
      this.n5("length", 1);
      this.n5("parentRule", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.k5.m3 var4 = (com.aspose.slides.internal.k5.m3)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.i2());
         case 1:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.x0(var3[0].toString());
            break;
         case 2:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.o2(var3[0].toString()));
         case 3:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.e0(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u9.class));
         case 4:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.i2(var3[0].toString()));
         case 5:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.x7(var3[0].toString()));
         case 6:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].toString(), var3[1].toString(), var3[2].toString());
            break;
         case 7:
            return this.n5(var4.x7());
         case 8:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].d2()));
         case 9:
            return this.n5(var4.z0(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.q0.class));
         default:
            throw new j3("unknown function");
      }

      return this.u9();
   }
}
