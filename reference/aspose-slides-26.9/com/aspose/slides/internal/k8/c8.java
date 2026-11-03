package com.aspose.slides.internal.k8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class c8 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.q0.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_type", "get_cssText", "set_cssText", "get_parentStyleSheet", "get_parentRule"
   );

   @Override
   public void l6() {
      this.n5("type", 1);
      this.n5("cssText", 3);
      this.n5("parentStyleSheet", 1);
      this.n5("parentRule", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.k5.q0 var4 = (com.aspose.slides.internal.k5.q0)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5());
         case 1:
            return this.n5(var4.l6());
         case 2:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.l6(var3[0].toString());
            return this.u9();
         case 3:
            return this.n5(var4.u3(), j8.n5(var4.u3()));
         case 4:
            return this.n5(var4.a6(), j8.n5(var4.a6()));
         default:
            throw new j3("unknown function");
      }
   }

   @Override
   protected void n5(g7 var1) {
      this.n5(var1, "CSS_INHERIT", this.n5(0.0));
      this.n5(var1, "STYLE_RULE", this.n5(1.0));
      this.n5(var1, "CHARSET_RULE", this.n5(2.0));
      this.n5(var1, "IMPORT_RULE", this.n5(3.0));
      this.n5(var1, "MEDIA_RULE", this.n5(4.0));
      this.n5(var1, "FONT_FACE_RULE", this.n5(5.0));
      this.n5(var1, "PAGE_RULE", this.n5(6.0));
      super.n5(var1);
   }
}
