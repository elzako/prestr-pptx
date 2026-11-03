package com.aspose.slides.internal.s7k;

class a0 extends z1 {
   private b3 t2 = new b3();

   @Override
   public void n5(m1 var1) {
      this.h0 = com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 10);
      this.n3();
      this.c8 = var1.k5();
      this.t2.n5 = com.aspose.slides.internal.v6g.k5.c8(var1.k5(), 10) / 65536.0F;
      this.t2.l6 = com.aspose.slides.internal.v6g.k5.c8(var1.k5(), 10) / 65536.0F;
      this.t2.k5 = com.aspose.slides.internal.v6g.k5.c8(var1.k5(), 10) / 65536.0F;
   }

   @Override
   protected void n3() {
      if (this.h0 != 1482250784) {
         throw new e2();
      }
   }

   public b3 y4() {
      return this.t2;
   }
}
