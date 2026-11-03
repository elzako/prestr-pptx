package com.aspose.slides.internal.u7q;

import com.aspose.slides.ms.System.q1;

public class u9 extends n5 {
   @Override
   public void n5(com.aspose.slides.internal.w2i.s7 var1) {
      this.h0 = (int)var1.k5();
      this.y4();
      this.c8 = var1.k5();
      long var2 = var1.k5();
      this.n5 = var1.k5((int)var2);
   }

   @Override
   public float n5(float var1) {
      var1 = com.aspose.slides.internal.g7i.k5.k5(var1);
      if (this.n5.length == 0) {
         return var1;
      }

      if (this.n5.length == 1) {
         return (float)q1.a6(var1, (float)(this.n5[0] * 65535.0 / 256.0));
      }

      int var2 = this.n5.length - 1;
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var1 * var2, 13);
      if (var3 != var2) {
         float var4 = var1 * var2 - var3;
         float var5 = this.n5[var3];
         float var6 = var5 + (this.n5[var3 + 1] - var5) * var4;
         if (var6 > 1.0F) {
            var6 = 1.0F;
         }

         return var6;
      } else {
         return this.n5[var3];
      }
   }

   @Override
   public boolean l6() {
      if (this.k5().length == 0) {
         return true;
      }

      if (this.k5().length == 1) {
         return com.aspose.slides.internal.g7i.k5.n5(this.n5[0] * 65535.0F / 256.0F);
      }

      int var1 = this.n5.length - 1;

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         if (q1.n5(this.n5[var2] - (float)var2 / var1) > 1.0E-7F) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void y4() {
      if (this.h0 != 1668641398) {
         throw new com.aspose.slides.internal.d3l.h0();
      }
   }
}
