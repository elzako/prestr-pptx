package com.aspose.slides;

class p8e extends v6g {
   private z7s n5;

   public p8e(g3y var1) {
      this.n5 = new z7s(var1);
      this.n5(this.n5);
      this.n5.n5(0.0, 360.0);
   }

   @Override
   protected void n5(z5 var1) {
      a9v var2 = ((a9v)var1).u9();
      this.n5.n3(var2);
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = var1.n5() - this.n5.d2();
      float var3 = var1.l6() - this.n5.d5();
      this.n5.a6(var2 / 2.0F);
      this.n5.u9(var3 / 2.0F);
      this.n5.t1();
   }
}
