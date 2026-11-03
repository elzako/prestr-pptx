package com.aspose.slides.internal.u6;

public abstract class w1 extends com.aspose.slides.internal.e5.t9 {
   private com.aspose.slides.internal.f2.u3 u9;
   private com.aspose.slides.internal.f2.u3 h0;
   private com.aspose.slides.internal.f2.u3 c8;
   private com.aspose.slides.internal.f2.u3 t2;
   public u3 x8;
   public u3 n3;
   public n5 y4;
   public n5 e2;
   public com.aspose.slides.internal.j9.k5 t9;

   public w1(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = var1.u3(20).u9();
      this.h0 = var1.u3(24).u9();
      this.c8 = var1.u3(34).u9();
      this.t2 = var1.u3(48).u9();
      if (this.z3() != 71 && this.z3() != 75 && this.x9().n5(com.aspose.slides.internal.f2.x8.n5())) {
         x8 var2 = j5.n5(this.q_().m1());
         var2.k5(this, this.t9(), this.m_());
      }
   }

   public z1 e5() {
      return ((w1)this.n5).e5();
   }

   public abstract com.aspose.slides.internal.h2.t2 x9();

   @Override
   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, com.aspose.slides.internal.e5.w1 var4) {
      super.n5(var1, var2, var3, var4);
      z1 var5 = this.e5();
      if (!this.p_() && !var5.s0()) {
         this.t9 = com.aspose.slides.internal.j9.k5.n5(var5.w2());
         this.i9();
      }
   }

   protected final void i9() {
      this.a6(2);
      this.a6(3);
      this.a6(0);
      this.a6(1);
   }

   private void a6(int var1) {
      n5 var2 = new n5(this.x9().n5(var1), this.z3());
      switch (var1) {
         case 0:
            this.x8 = new u3(var2, this.t9);
            break;
         case 1:
            this.n3 = new u3(var2, this.t9);
            break;
         case 2:
            this.y4 = var2;
            break;
         case 3:
            this.e2 = var2;
      }
   }
}
