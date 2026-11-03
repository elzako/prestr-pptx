package com.aspose.slides;

abstract class k2p extends v6g {
   private final n1g n5;

   public final n1g u3() {
      return this.n5;
   }

   protected k2p(n1g var1) {
      this.n5 = var1;
      this.k5(var1.n3().getWidth());
      this.u3(var1.n3().getHeight());
   }

   public final void a6() {
      this.u9();
      this.z7();
   }

   public final void u9() {
      this.n3(new z5(this.d2(), this.d5()));
      this.a6(this.n5.y1());
      this.u9(this.n5.a0());
      this.v4();
   }

   @Override
   protected void l6() {
      this.n5.t1();
   }
}
