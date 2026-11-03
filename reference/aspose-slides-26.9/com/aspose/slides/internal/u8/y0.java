package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.w8.v8;
import com.aspose.slides.internal.w8.w2;
import com.aspose.slides.ms.System.y8;

public class y0 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.o5.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_caption",
      "set_caption",
      "get_tHead",
      "set_tHead",
      "get_tFoot",
      "set_tFoot",
      "get_rows",
      "set_rows",
      "get_tBodies",
      "set_tBodies",
      "get_align",
      "set_align",
      "get_bgColor",
      "set_bgColor",
      "get_border",
      "set_border",
      "get_cellPadding",
      "set_cellPadding",
      "get_cellSpacing",
      "set_cellSpacing",
      "get_frame",
      "set_frame",
      "get_rules",
      "set_rules",
      "get_summary",
      "set_summary",
      "get_width",
      "set_width",
      "createTHead",
      "deleteTHead",
      "createTFoot",
      "deleteTFoot",
      "createCaption",
      "deleteCaption",
      "insertRow",
      "deleteRow"
   );

   @Override
   public void l6() {
      this.k5("createTHead");
      this.k5("deleteTHead");
      this.k5("createTFoot");
      this.k5("deleteTFoot");
      this.k5("createCaption");
      this.k5("deleteCaption");
      this.k5("insertRow");
      this.k5("deleteRow");
      this.n5("caption", 3);
      this.n5("tHead", 3);
      this.n5("tFoot", 3);
      this.n5("rows", 3);
      this.n5("tBodies", 3);
      this.n5("align", 3);
      this.n5("bgColor", 3);
      this.n5("border", 3);
      this.n5("cellPadding", 3);
      this.n5("cellSpacing", 3);
      this.n5("frame", 3);
      this.n5("rules", 3);
      this.n5("summary", 3);
      this.n5("width", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.w8.o5 var4 = (com.aspose.slides.internal.w8.o5)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.y0.class));
         case 1:
         case 3:
         case 5:
         case 7:
         case 9:
            break;
         case 2:
            return this.n5(var4.z6(), com.aspose.slides.internal.v6g.k5.n5(v8.class));
         case 4:
            return this.n5(var4.e9(), com.aspose.slides.internal.v6g.k5.n5(v8.class));
         case 6:
            return this.n5(var4.o5(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 8:
            return this.n5(var4.j8(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 10:
            return this.n5(var4.w2());
         case 11:
            var4.m3(var3[0].toString());
            break;
         case 12:
            return this.n5(var4.s0());
         case 13:
            var4.z8(var3[0].toString());
            break;
         case 14:
            return this.n5(var4.v8());
         case 15:
            var4.j5(var3[0].toString());
            break;
         case 16:
            return this.n5(var4.v3());
         case 17:
            var4.w1(var3[0].toString());
            break;
         case 18:
            return this.n5(var4.g7());
         case 19:
            var4.r4(var3[0].toString());
            break;
         case 20:
            return this.n5(var4.j4());
         case 21:
            var4.c4(var3[0].toString());
            break;
         case 22:
            return this.n5(var4.i9());
         case 23:
            var4.y2(var3[0].toString());
            break;
         case 24:
            return this.n5(var4.f5());
         case 25:
            var4.y1(var3[0].toString());
            break;
         case 26:
            return this.n5(var4.j3());
         case 27:
            var4.a0(var3[0].toString());
            break;
         case 28:
            return this.n5(var4.n1(), com.aspose.slides.internal.v6g.k5.n5(v8.class));
         case 29:
            var4.p6();
            break;
         case 30:
            return this.n5(var4.d1(), com.aspose.slides.internal.v6g.k5.n5(v8.class));
         case 31:
            var4.s4();
            break;
         case 32:
            return this.n5(var4.h6(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.y0.class));
         case 33:
            var4.y8();
            break;
         case 34:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].d2()), com.aspose.slides.internal.v6g.k5.n5(w2.class));
         case 35:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.l6(var3[0].d2());
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
