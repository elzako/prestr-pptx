package com.aspose.slides.internal.k0r;

public class k0y extends a1g {
   protected long n5;
   protected long l6;
   protected long k5;
   protected int u3;
   protected int a6;

   k0y() {
      this.w1().n5(11003);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = var1.m3();
      this.a6 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5 & 4294967295L);
      var1.l6(this.u3);
      var1.l6(this.a6);
   }

   @Override
   public int n5() {
      return 20;
   }

   public final int a6() {
      return (int)this.n5;
   }

   public final void k5(int var1) {
      this.n5 = var1 & 4294967295L;
   }

   protected final void u3(int var1) {
      this.l6 = var1 & 4294967295L;
   }
}
