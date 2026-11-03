package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.w8.w2;
import com.aspose.slides.ms.System.y8;

public class j9 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(w2.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_rowIndex",
      "get_sectionRowIndex",
      "get_cells",
      "get_align",
      "set_align",
      "get_bgColor",
      "set_bgColor",
      "get_ch",
      "set_ch",
      "get_chOff",
      "set_chOff",
      "get_vAlign",
      "set_vAlign",
      "insertCell",
      "deleteCell"
   );

   @Override
   public void l6() {
      this.k5("insertCell");
      this.k5("deleteCell");
      this.n5("rowIndex", 1);
      this.n5("sectionRowIndex", 1);
      this.n5("cells", 1);
      this.n5("align", 3);
      this.n5("bgColor", 3);
      this.n5("ch", 3);
      this.n5("chOff", 3);
      this.n5("vAlign", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      w2 var4 = (w2)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.j9());
         case 1:
            return this.n5(var4.z6());
         case 2:
            return this.n5(var4.e9(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 3:
            return this.n5(var4.o5());
         case 4:
            var4.m3(var3[0].toString());
            break;
         case 5:
            return this.n5(var4.j8());
         case 6:
            var4.z8(var3[0].toString());
            break;
         case 7:
            return this.n5(var4.w2());
         case 8:
            var4.j5(var3[0].toString());
            break;
         case 9:
            return this.n5(var4.s0());
         case 10:
            var4.w1(var3[0].toString());
            break;
         case 11:
            return this.n5(var4.v8());
         case 12:
            var4.r4(var3[0].toString());
            break;
         case 13:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].d2()), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.z6.class));
         case 14:
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
