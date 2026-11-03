package com.aspose.slides;

class p1w extends d6 {
   p1w(w3 var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
   }

   @Override
   protected void l6(z5 var1) {
   }

   @Override
   protected void l6() {
      int var1 = this.k5().n3().n5.size();
      double var2 = (Math.PI * 2) / var1;
      double var4 = this.p8() + this.d2() / 2.0F;
      double var6 = this.f2() + this.d5() / 2.0F;
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1((float)var4, (float)var6);
      double var9 = (Math.PI / 2) + var2;
      double var11 = this.d2() / 2.0F;

      for (int var13 = 0; var13 < var1; var13++) {
         var9 -= var2;
         float var14 = (float)(var4 + var11 * com.aspose.slides.ms.System.q1.c8(var9));
         float var15 = (float)(var6 - var11 * com.aspose.slides.ms.System.q1.h0(var9));
         this.k5().n5().n5(var14, var15, var8.l6(), var8.k5());
      }
   }
}
