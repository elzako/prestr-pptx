package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.k5.s3;
import com.aspose.slides.internal.k5.v4;
import com.aspose.slides.ms.System.y8;

public class h0 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u3.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_primitiveType", "setFloatValue", "getFloatValue", "setStringValue", "getStringValue", "getCounterValue", "getRectValue", "getRGBColorValue"
   );

   @Override
   public void l6() {
      this.k5("setFloatValue");
      this.k5("getFloatValue");
      this.k5("setStringValue");
      this.k5("getStringValue");
      this.k5("getCounterValue");
      this.k5("getRectValue");
      this.k5("getRGBColorValue");
      this.n5("primitiveType", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.k5.u3 var4 = (com.aspose.slides.internal.k5.u3)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5());
         case 1:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(com.aspose.slides.ms.System.z3.a6(var3[0].d2()), (float)var3[1].l6());
            break;
         case 2:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(com.aspose.slides.ms.System.z3.a6(var3[0].d2())));
         case 3:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(com.aspose.slides.ms.System.z3.a6(var3[0].d2()), var3[1].toString());
            break;
         case 4:
            return this.n5(var4.l6());
         case 5:
            return this.n5(var4.k5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.t2.class));
         case 6:
            return this.n5(var4.u3(), com.aspose.slides.internal.v6g.k5.n5(v4.class));
         case 7:
            return this.n5(var4.a6(), com.aspose.slides.internal.v6g.k5.n5(s3.class));
         default:
            throw new j3("unknown function");
      }

      return this.u9();
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.u9.class);
   }

   @Override
   protected void n5(g7 var1) {
      this.n5(var1, "CSS_UNKNOWN", this.n5(0.0));
      this.n5(var1, "CSS_NUMBER", this.n5(1.0));
      this.n5(var1, "CSS_PERCENTAGE", this.n5(2.0));
      this.n5(var1, "CSS_EMS", this.n5(3.0));
      this.n5(var1, "CSS_EXS", this.n5(4.0));
      this.n5(var1, "CSS_PX", this.n5(5.0));
      this.n5(var1, "CSS_CM", this.n5(6.0));
      this.n5(var1, "CSS_MM", this.n5(7.0));
      this.n5(var1, "CSS_IN", this.n5(8.0));
      this.n5(var1, "CSS_PT", this.n5(9.0));
      this.n5(var1, "CSS_PC", this.n5(10.0));
      this.n5(var1, "CSS_DEG", this.n5(11.0));
      this.n5(var1, "CSS_RAD", this.n5(12.0));
      this.n5(var1, "CSS_GRAD", this.n5(13.0));
      this.n5(var1, "CSS_MS", this.n5(14.0));
      this.n5(var1, "CSS_S", this.n5(15.0));
      this.n5(var1, "CSS_HZ", this.n5(16.0));
      this.n5(var1, "CSS_KHZ", this.n5(17.0));
      this.n5(var1, "CSS_DIMENSION", this.n5(18.0));
      this.n5(var1, "CSS_STRING", this.n5(19.0));
      this.n5(var1, "CSS_URI", this.n5(20.0));
      this.n5(var1, "CSS_IDENT", this.n5(21.0));
      this.n5(var1, "CSS_ATTR", this.n5(22.0));
      this.n5(var1, "CSS_COUNTER", this.n5(23.0));
      this.n5(var1, "CSS_RECT", this.n5(24.0));
      this.n5(var1, "CSS_RGBCOLOR", this.n5(25.0));
      super.n5(var1);
   }
}
