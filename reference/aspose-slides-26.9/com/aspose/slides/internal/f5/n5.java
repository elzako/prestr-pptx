package com.aspose.slides.internal.f5;

public final class n5 extends r4 implements com.aspose.slides.internal.j3.k5 {
   private e2 n5;
   private String l6;
   private boolean k5;
   private boolean u3;

   public n5(e2 var1, z1 var2) {
      super(var2);
      this.n5 = var1;
   }

   @Override
   public final String n5() {
      return this.n5.l6();
   }

   public final boolean l6() {
      return this.k5;
   }

   @Override
   public final String k5() {
      return this.l6;
   }

   @Override
   public final void n5(String var1) {
      this.l6 = var1;
      this.k5 = false;
   }

   public final com.aspose.slides.internal.j3.z3 u3() {
      return com.aspose.slides.internal.v6g.k5.n5(this.y2(), z3.class);
   }

   public final com.aspose.slides.internal.j3.y2 a6() {
      return new s3(this);
   }

   @Override
   public final boolean u9() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   @Override
   public String h0() {
      return this.n5();
   }

   @Override
   public String c8() {
      return this.k5();
   }

   @Override
   public void l6(String var1) {
      this.n5(var1);
   }

   @Override
   public String t2() {
      return this.n5.n5();
   }

   @Override
   public String s7() {
      return this.n5.k5();
   }

   @Override
   public String x8() {
      return this.n5.a6();
   }

   @Override
   public void k5(String var1) {
      this.n5.n5(this.n5.u3().k5().n5(var1));
   }

   @Override
   public byte n3() {
      return 2;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 l6(boolean var1) {
      n5 var2 = this.y4().l6(this.x8(), this.t2(), this.s7());
      var2.n5(this.k5());
      return var2;
   }
}
