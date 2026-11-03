package com.aspose.slides.internal.f1s;

import com.aspose.slides.internal.o8m.h6;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.s3;

class x8$k5 extends x8$l6 {
   private com.aspose.slides.internal.w0.y4 n5;
   private int l6;

   public x8$k5(com.aspose.slides.internal.w0.y4 var1, com.aspose.slides.internal.w0.c8 var2) {
      super((com.aspose.slides.internal.f1s.x8$1) null);
      this.n5 = var1;
      int var3 = var1.a6().hashCode();
      int var4 = 137;
      h6 var5 = new h6();

      try {
         for (byte var9 : var5.l6(var1.l6())) {
            var4 = 13 * var4 ^ com.aspose.slides.ms.System.e2.n5(var9);
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      int var11 = n1.n5(var1.k5());
      int var12 = var1.n3().hashCode();
      int var13 = var2.hashCode();
      int var14 = s3.n5(var1.y4());
      int var15;
      if (var1.u3() != null) {
         var15 = 137;

         for (com.aspose.slides.internal.p1s.n5 var21 : var1.u3()) {
            var15 = 13 * var15 ^ var21.hashCode();
         }
      } else {
         var15 = -1;
      }

      this.l6 = 137;
      this.l6 = 13 * this.l6 ^ var3;
      this.l6 = 13 * this.l6 ^ var4;
      this.l6 = 13 * this.l6 ^ var11;
      this.l6 = 13 * this.l6 ^ var12;
      this.l6 = 13 * this.l6 ^ var13;
      this.l6 = 13 * this.l6 ^ var14;
      this.l6 = 13 * this.l6 ^ var15;
   }

   @Override
   public int hashCode() {
      return this.l6;
   }

   @Override
   protected boolean n5(x8$l6 var1) {
      x8$k5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, x8$k5.class);
      return j8.l6(null, var2) ? false : a3.l6(this.l6, var2.l6);
   }
}
