package com.aspose.slides;

class h3p extends v6g {
   private boolean n5;
   private g3y l6;

   h3p(boolean var1, g3y var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
   }

   @Override
   protected void l6() {
      if (this.d2() != 0.0F && this.d5() != 0.0F) {
         com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();

         try {
            var1.n5(
               new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2() / 2.0F, this.f2()),
               new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2() / 2.0F, this.f2() + this.d5())
            );
            l6v var2 = d8.n5(this.l6, var1);
            com.aspose.slides.internal.x4g.s7 var3 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
            this.l6.t2().d2().n5(var3, var2, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }

         com.aspose.slides.internal.x4g.s7 var12 = new com.aspose.slides.internal.x4g.s7();

         try {
            if (this.n5) {
               var12.n5(new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()), new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2()));
            } else {
               var12.n5(
                  new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.d5()),
                  new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + this.d5())
               );
            }

            l6v var13 = d8.n5(this.l6, var12);
            com.aspose.slides.internal.x4g.s7 var4 = (com.aspose.slides.internal.x4g.s7)var12.deepClone();
            this.l6.t2().d2().n5(var4, var13, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
         } finally {
            if (var12 != null) {
               var12.dispose();
            }
         }
      }
   }
}
