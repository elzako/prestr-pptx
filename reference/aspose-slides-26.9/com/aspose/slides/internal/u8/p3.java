package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class p3 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.z6.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_cellIndex",
      "get_abbr",
      "set_abbr",
      "get_align",
      "set_align",
      "get_axis",
      "set_axis",
      "get_bgColor",
      "set_bgColor",
      "get_ch",
      "set_ch",
      "get_chOff",
      "set_chOff",
      "get_colSpan",
      "set_colSpan",
      "get_headers",
      "set_headers",
      "get_height",
      "set_height",
      "get_noWrap",
      "set_noWrap",
      "get_rowSpan",
      "set_rowSpan",
      "get_scope",
      "set_scope",
      "get_vAlign",
      "set_vAlign",
      "get_width",
      "set_width"
   );

   @Override
   public void l6() {
      this.n5("cellIndex", 1);
      this.n5("abbr", 3);
      this.n5("align", 3);
      this.n5("axis", 3);
      this.n5("bgColor", 3);
      this.n5("ch", 3);
      this.n5("chOff", 3);
      this.n5("colSpan", 3);
      this.n5("headers", 3);
      this.n5("height", 3);
      this.n5("noWrap", 3);
      this.n5("rowSpan", 3);
      this.n5("scope", 3);
      this.n5("vAlign", 3);
      this.n5("width", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.z6 var4 = (com.aspose.slides.internal.w8.z6)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9());
         case 1:
            return this.n5(var4.z6());
         case 2:
            var4.m3(var3[0].toString());
            break;
         case 3:
            return this.n5(var4.e9());
         case 4:
            var4.z8(var3[0].toString());
            break;
         case 5:
            return this.n5(var4.o5());
         case 6:
            var4.j5(var3[0].toString());
            break;
         case 7:
            return this.n5(var4.j8());
         case 8:
            var4.w1(var3[0].toString());
            break;
         case 9:
            return this.n5(var4.w2());
         case 10:
            var4.r4(var3[0].toString());
            break;
         case 11:
            return this.n5(var4.s0());
         case 12:
            var4.c4(var3[0].toString());
            break;
         case 13:
            return this.n5(var4.v8());
         case 14:
            var4.n5(var3[0].d2());
            break;
         case 15:
            return this.n5(var4.v3());
         case 16:
            var4.y2(var3[0].toString());
            break;
         case 17:
            return this.n5(var4.g7());
         case 18:
            var4.y1(var3[0].toString());
            break;
         case 19:
            return this.n5(var4.j4());
         case 20:
            var4.n5(var3[0].n5());
            break;
         case 21:
            return this.n5(var4.i9());
         case 22:
            var4.l6(var3[0].d2());
            break;
         case 23:
            return this.n5(var4.f5());
         case 24:
            var4.a0(var3[0].toString());
            break;
         case 25:
            return this.n5(var4.j3());
         case 26:
            var4.d2(var3[0].toString());
            break;
         case 27:
            return this.n5(var4.n1());
         case 28:
            var4.d5(var3[0].toString());
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
