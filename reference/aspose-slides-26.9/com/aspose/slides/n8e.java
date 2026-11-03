package com.aspose.slides;

class n8e extends v6g {
   private z4d n5;
   private z4d l6;
   private float k5;
   private h2v[] u3;
   private g3y a6;
   private w3 u9;

   public final boolean u3() {
      return this.u3 != null && this.u3.length > 0;
   }

   public n8e(g3y var1, h2v[] var2, w3 var3) {
      this.u3 = var2;
      this.a6 = var1;
      this.u9 = var3;
      if (this.u3()) {
         this.n5 = new z4d();
         this.n5.u9(Float.NaN);
         this.l6 = new z4d();
         this.l6.u9(Float.NaN);
         this.n5(this.n5);
         this.n5(this.l6);
      }
   }

   private void h0() {
      for (h2v var4 : this.u3) {
         if (var4 != null && var4.T_()) {
            if (com.aspose.slides.ms.System.n1.k5(this.n5.o0())) {
               this.n5.a6(var4.b3());
               this.n5.u9(var4.o0());
            }

            if (var4.f2() < this.n5.f2()) {
               this.n5.u9(var4.o0());
            }

            if (com.aspose.slides.ms.System.n1.k5(this.l6.o0())) {
               this.l6.a6(var4.b3());
               this.l6.u9(var4.o0());
            }

            if (var4.f2() > this.l6.f2()) {
               this.l6.u9(var4.o0());
            }
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      if (this.u3()) {
         this.n5.n3(var1);
         this.l6.n3(var1);
      }
   }

   @Override
   protected void l6(z5 var1) {
      if (this.u3()) {
         this.h0();
         float var2 = this.u9.y4();
         this.k5 = this.l6.f2();
         if (this.n5.f2() > var2 && this.l6.f2() > var2) {
            this.n5.u9(this.l6.o0());
            this.k5 = this.u9.y4();
         }

         if (this.n5.f2() < var2 && this.l6.f2() < var2) {
            this.k5 = this.u9.y4();
         }

         this.l6.u9(this.k5);
      }

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   @Override
   protected void l6() {
      if (this.u3()) {
         this.a6.k5(this.n5.i1().u3(), this.l6.i1().u3());
      }
   }
}
