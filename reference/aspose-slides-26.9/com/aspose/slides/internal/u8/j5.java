package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class j5 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.w1.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_align",
      "set_align",
      "get_frameBorder",
      "set_frameBorder",
      "get_height",
      "set_height",
      "get_longDesc",
      "set_longDesc",
      "get_marginHeight",
      "set_marginHeight",
      "get_marginWidth",
      "set_marginWidth",
      "get_name",
      "set_name",
      "get_scrolling",
      "set_scrolling",
      "get_src",
      "set_src",
      "get_width",
      "set_width",
      "get_contentDocument"
   );

   @Override
   public void l6() {
      this.n5("align", 3);
      this.n5("frameBorder", 3);
      this.n5("height", 3);
      this.n5("longDesc", 3);
      this.n5("marginHeight", 3);
      this.n5("marginWidth", 3);
      this.n5("name", 3);
      this.n5("scrolling", 3);
      this.n5("src", 3);
      this.n5("width", 3);
      this.n5("contentDocument", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.w1 var4 = (com.aspose.slides.internal.w8.w1)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9());
         case 1:
            var4.m3(var3[0].toString());
            break;
         case 2:
            return this.n5(var4.z6());
         case 3:
            var4.z8(var3[0].toString());
            break;
         case 4:
            return this.n5(var4.e9());
         case 5:
            var4.j5(var3[0].toString());
            break;
         case 6:
            return this.n5(var4.o5());
         case 7:
            var4.w1(var3[0].toString());
            break;
         case 8:
            return this.n5(var4.j8());
         case 9:
            var4.r4(var3[0].toString());
            break;
         case 10:
            return this.n5(var4.w2());
         case 11:
            var4.c4(var3[0].toString());
            break;
         case 12:
            return this.n5(var4.s0());
         case 13:
            var4.y2(var3[0].toString());
            break;
         case 14:
            return this.n5(var4.v8());
         case 15:
            var4.y1(var3[0].toString());
            break;
         case 16:
            return this.n5(var4.v3());
         case 17:
            var4.a0(var3[0].toString());
            break;
         case 18:
            return this.n5(var4.g7());
         case 19:
            var4.d2(var3[0].toString());
            break;
         case 20:
            return this.n5(var4.j4(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.z1.class));
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
