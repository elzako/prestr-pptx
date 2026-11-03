package com.aspose.slides;

class t4p extends v6g {
   private d1x n5;
   private w3 l6;
   private m5k k5;
   private s1z u3;

   t4p(a8e var1, w3 var2) {
      this.l6 = var2;
      this.n5 = new d1x(var1);
      this.k5 = new m5k(var1, var2);
      this.u3 = new s1z(var1, this.n5);
      this.n5(this.u3);
      this.n5(this.n5);
      this.n5(this.k5);
   }

   @Override
   protected void n5(z5 var1) {
      this.n5.n3(var1);
      if (this.u3()) {
         this.k5.n3(new z5(this.l6.d2(), var1.l6()));
      } else {
         this.k5.n3(new z5(var1.n5() - this.n5.d2(), var1.l6()));
      }

      this.u3.n3(new z5(this.k5.d2(), this.n5.d5()));
      this.k5(this.n5.d2() + this.k5.d2());
      this.u3(this.n5.d5() + this.k5.d5() + this.h0());
   }

   @Override
   protected void l6(z5 var1) {
      this.k5.u9(this.h0());
      this.n5.u9(this.k5.d5() + this.h0());
      this.k5.a6(this.c8());
      this.u3.a6(this.c8());
      this.u3.u9(this.k5.d5() + this.h0());

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   public final boolean u3() {
      return com.aspose.slides.internal.v6g.k5.l6(this.l6, a0k.class);
   }

   public final float h0() {
      if (this.u3()) {
         return 0.0F;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.l6, m3o.class) ? 6.5F : 8.0F;
      }
   }

   public final float c8() {
      return this.n5.d2();
   }

   final w3 t2() {
      return this.l6;
   }
}
