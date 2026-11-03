package com.aspose.slides.internal.u8;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.w8.v8;
import com.aspose.slides.internal.w8.w2;
import com.aspose.slides.ms.System.y8;

public class z6 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(v8.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_align", "set_align", "get_ch", "set_ch", "get_chOff", "set_chOff", "get_vAlign", "set_vAlign", "get_rows", "insertRow", "deleteRow"
   );

   @Override
   public void l6() {
      this.k5("insertRow");
      this.k5("deleteRow");
      this.n5("align", 3);
      this.n5("ch", 3);
      this.n5("chOff", 3);
      this.n5("vAlign", 3);
      this.n5("rows", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      v8 var4 = (v8)var2.C_();
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
            return this.n5(var4.j8(), com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w8.s7.class));
         case 9:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].d2()), com.aspose.slides.internal.v6g.k5.n5(w2.class));
         case 10:
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
