package com.aspose.slides;

class k4w extends v6g {
   private final e3x n5;

   public k4w(g3y var1) {
      int var2 = var1.u9().getType();
      this.n5 = new e3x(var1.u9().getFirstSliceAngle() & 65535, var1.u9(), var1.c8().toArray(new t9z[0]));
      this.n5(this.n5);
   }

   @Override
   protected void n5(z5 var1) {
      a9v var2 = (a9v)var1;
      this.n5.n3(var2.u9());
   }

   @Override
   protected void l6(z5 var1) {
      a9v var2 = (a9v)var1;
      a9v var3 = var2.u9();
      this.n5.a6(var3.u3() - var2.u3());
      this.n5.u9(var3.a6() - var2.a6());
      this.n5.t1();
   }
}
