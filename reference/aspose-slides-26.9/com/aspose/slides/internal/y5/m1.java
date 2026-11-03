package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class m1 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.h6.n5.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_id", "set_id", "get_title", "set_title", "get_lang", "set_lang", "get_dir", "set_dir", "get_className", "set_className", "get_style", "set_style"
   );

   @Override
   public void l6() {
      this.n5("id", 3);
      this.n5("title", 3);
      this.n5("lang", 3);
      this.n5("dir", 3);
      this.n5("className", 3);
      this.n5("style", 3);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.h6.n5 var4 = (com.aspose.slides.internal.h6.n5)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.m3());
         case 1:
            var4.s7(var3[0].toString());
            break;
         case 2:
            return this.n5(var4.z8());
         case 3:
            var4.x8(var3[0].toString());
            break;
         case 4:
            return this.n5(var4.r4());
         case 5:
            var4.n3(var3[0].toString());
            break;
         case 6:
            return this.n5(var4.h2());
         case 7:
            var4.y4(var3[0].toString());
            break;
         case 8:
            return this.n5(var4.v0());
         case 9:
            var4.e2(var3[0].toString());
            break;
         case 10:
            return this.n5(var4.f0());
         case 11:
            var4.m1(var3[0].toString());
            break;
         default:
            throw new j3("unknown function");
      }

      return this.u9();
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.z3.class);
   }
}
