package com.aspose.slides;

class m6c extends v6g {
   private z4d n5;
   private z4d l6;
   private h2v[] k5;
   private g3y u3;

   @Override
   public int O_() {
      return 2;
   }

   public final boolean u3() {
      return this.k5 != null && this.k5.length > 0;
   }

   public m6c(g3y var1, h2v[] var2) {
      this.u3 = var1;
      this.k5 = var2;
      if (this.u3()) {
         this.n5 = new z4d();
         this.n5.u9(Float.NaN);
         this.l6 = new z4d();
         this.l6.u9(Float.NaN);
         this.n5(this.n5);
         this.n5(this.l6);
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
         for (h2v var5 : this.k5) {
            if (var5 != null && var5.T_()) {
               if (com.aspose.slides.ms.System.n1.k5(this.n5.o0())) {
                  this.n5.a6(var5.b3());
                  this.n5.u9(var5.o0());
               }

               if (var5.f2() < this.n5.f2()) {
                  this.n5.u9(var5.o0());
               }

               if (com.aspose.slides.ms.System.n1.k5(this.l6.o0())) {
                  this.l6.a6(var5.b3());
                  this.l6.u9(var5.o0());
               }

               if (var5.f2() > this.l6.f2()) {
                  this.l6.u9(var5.o0());
               }
            }
         }

         if (this.n5(this.n5.i1().u3())) {
            this.n5.a6(com.aspose.slides.ms.System.q1.n5((float)(this.n5.b3()), (float)(0.0F)));
            this.n5.a6(com.aspose.slides.ms.System.q1.l6(this.n5.b3(), var1.n5()));
            this.n5.u9(com.aspose.slides.ms.System.q1.n5((float)(this.n5.o0()), (float)(0.0F)));
            this.n5.u9(com.aspose.slides.ms.System.q1.l6(this.n5.o0(), var1.l6()));
         } else {
            this.n5 = null;
         }

         if (this.n5(this.l6.i1().u3())) {
            this.l6.a6(com.aspose.slides.ms.System.q1.n5((float)(this.l6.b3()), (float)(0.0F)));
            this.l6.a6(com.aspose.slides.ms.System.q1.l6(this.l6.b3(), var1.n5()));
            this.l6.u9(com.aspose.slides.ms.System.q1.n5((float)(this.l6.o0()), (float)(0.0F)));
            this.l6.u9(com.aspose.slides.ms.System.q1.l6(this.l6.o0(), var1.l6()));
         } else {
            this.l6 = null;
         }
      }

      for (v6g var9 : this.a0()) {
         var9.t1();
      }
   }

   @Override
   protected void l6() {
      if (this.n5 != null && this.l6 != null) {
         this.u3.u3(this.n5.i1().u3(), this.l6.i1().u3());
      }
   }

   private boolean n5(com.aspose.slides.internal.o9b.w1 var1) {
      return 0.0F <= var1.l6() && var1.l6() < this.y2().d2() && 0.0F <= var1.k5() && var1.k5() < this.y2().d5();
   }
}
