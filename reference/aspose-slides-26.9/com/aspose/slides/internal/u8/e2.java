package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class e2 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.t9.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_title",
      "set_title",
      "get_referrer",
      "get_domain",
      "get_URL",
      "get_body",
      "set_body",
      "get_images",
      "get_applets",
      "get_links",
      "get_forms",
      "get_anchors",
      "get_cookie",
      "set_cookie",
      "get_defaultView",
      "open",
      "close",
      "getElementsByName",
      "normalizeDocument"
   );

   @Override
   public void l6() {
      this.k5("open");
      this.k5("close");
      this.k5("getElementsByName");
      this.k5("normalizeDocument");
      this.n5("title", 3);
      this.n5("referrer", 1);
      this.n5("domain", 1);
      this.n5("URL", 1);
      this.n5("body", 3);
      this.n5("images", 1);
      this.n5("applets", 1);
      this.n5("links", 1);
      this.n5("forms", 1);
      this.n5("anchors", 1);
      this.n5("cookie", 3);
      this.n5("defaultView", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.t9 var4 = (com.aspose.slides.internal.w8.t9)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.h2());
         case 1:
            var4.m1(var3[0].toString());
            break;
         case 2:
            return this.n5(var4.v0());
         case 3:
            return this.n5(var4.f0());
         case 4:
            return this.n5(var4.a3());
         case 5:
            return this.n5(var4.p3(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.c8.class));
         case 6:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.n5((com.aspose.slides.internal.w8.c8)var3[0].C_());
            break;
         case 7:
            return this.n5(var4.y0(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 8:
            return this.n5(var4.j9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 9:
            return this.n5(var4.z6(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 10:
            return this.n5(var4.e9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 11:
            return this.n5(var4.o5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 12:
            return this.n5(var4.j8());
         case 13:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.k7(var3[0].toString());
            break;
         case 14:
            return this.n5(var4.w2(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k5.e5.class));
         case 15:
         case 16:
         case 18:
            break;
         case 17:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            g7 var5 = this.n5(var4.m3(var3[0].toString()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.c4.class));
            var5.n5(
               com.aspose.slides.internal.v6g.k5.n5(
                  this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.r1.n5.class)), com.aspose.slides.internal.i4.z6.class
               )
            );
            return var5;
         default:
            throw new j3("unknown function");
      }

      return this.u9();
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.z1.class);
   }
}
