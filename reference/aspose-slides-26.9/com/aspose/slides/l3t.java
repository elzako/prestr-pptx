package com.aspose.slides;

class l3t extends v6g {
   private g3y n5;
   private a0 l6;

   l3t(g3y var1, a0 var2) {
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
         n1g var1 = this.n5.t2();
         com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
         f9 var3 = new f9(var1);
         var3.n5(var2.y4());

         try {
            com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5());
            com.aspose.slides.internal.o9b.c8 var5 = this.n5.u9().c8().o8();
            FillFormat var6 = (FillFormat)this.n5.u9().getFormat().getFill();
            if (this.l6.c8().getFill().getFillType() != -1) {
               var6 = (FillFormat)this.l6.c8().getFill();
            }

            IEffectFormat var7 = this.n5.u9().getFormat().getEffect();
            w5k.n5(var5.o8(), this.n5.t2(), var4.y4(), var6, var7);
         } finally {
            var3.n5();
         }
      }
   }
}
