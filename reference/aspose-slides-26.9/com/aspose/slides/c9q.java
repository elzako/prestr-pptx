package com.aspose.slides;

class c9q extends g4j {
   private float k5;

   public final float u3() {
      return this.k5;
   }

   public c9q(t9z var1, double var2, double var4, double var6, double var8) {
      super(var1, var2, var4, var6, var8);
   }

   public c9q(z7s var1, double var2, double var4, double var6, double var8) {
      super(var1, var2, var4, var6, var8);
   }

   public final com.aspose.slides.internal.o9b.w1 h0() {
      return this.l6(this.u3() + (this.x8() - this.u3()) / 2.0);
   }

   @Override
   protected void u3(z5 var1) {
      t3o var2 = (t3o)var1;
      this.k5 = var2.k5();
      this.k5(var2.n5());
      this.u3(var2.l6());
   }

   @Override
   protected com.aspose.slides.internal.x4g.s7 c8() {
      if (this.k5 == 0.0F) {
         return super.c8();
      }

      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.w1 var2 = this.i1().u3();
      com.aspose.slides.internal.o9b.w1 var3 = x5h.n5(this.n3(), this.k5, var2.u3()).u3();
      com.aspose.slides.internal.o9b.w1 var4 = x5h.n5(this.n3(), this.x8(), var2.u3()).u3();
      var1.n5(var3.u3(), var4.u3());
      this.n5(var1, this.y4());
      var1.n5(this.e5().y4(), (float)this.n3(), (float)this.y4());
      this.n5(var1, this.y4());
      x5h.n5(this.n3() + this.y4(), this.x8(), var2.u3()).n5(var3);
      x5h.n5(this.n3() + this.y4(), this.k5, var2.u3()).n5(var4);
      var1.n5(var3.u3(), var4.u3());
      this.n5(var1, this.y4());
      com.aspose.slides.internal.o9b.y1 var5 = new com.aspose.slides.internal.o9b.y1(var2.l6() - this.k5, var2.k5() - this.k5, this.k5 * 2.0F, this.k5 * 2.0F);
      var1.n5(var5.y4(), (float)(this.n3() + this.y4()), (float)(-this.y4()));
      return var1;
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1, double var2) {
      if (var2 == 360.0) {
         var1.n3();
         var1.t9();
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.x4g.s7 var1 = this.c8();
      if (this.n5 != null) {
         boolean var2 = this.n5.l6(var1);
         if (!var2) {
            this.n5.k5(var1);
         }

         this.n5.n5(var1);
      }

      if (this.l6 != null) {
         w5k.k5(
            com.aspose.slides.internal.o9b.c8.w4().o8(),
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            this.l6.c8(),
            var1,
            (LineFormat)this.l6.h0().getFormat().getLine(),
            (FillFormat)this.l6.h0().getFormat().getFill(),
            this.l6.h0().getFormat().getEffect(),
            1.0F
         );
         w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), this.l6.c8(), var1, this.l6.h0().k5(), 1.0F, this.l6.h0().u3());
         w5k.n5(
            com.aspose.slides.internal.o9b.c8.w4().o8(),
            this.l6.c8(),
            var1,
            (LineFormat)this.l6.h0().getFormat().getLine(),
            this.l6.h0().getFormat().getEffect()
         );
      }
   }
}
