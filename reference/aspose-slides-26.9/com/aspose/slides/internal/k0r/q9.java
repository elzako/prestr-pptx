package com.aspose.slides.internal.k0r;

public class q9 extends e6r {
   private int n5 = 0;
   private int l6 = 0;
   private int k5 = 0;
   private int u3 = 0;

   public q9() {
      super(61449, (byte)1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = var1.m3();
      this.k5 = var1.m3() - this.n5;
      this.u3 = var1.m3() - this.l6;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.l6(this.l6);
      var1.l6(this.n5 + this.k5);
      var1.l6(this.l6 + this.u3);
   }

   @Override
   public int n5() {
      return 16;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int u3() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final int a6() {
      return this.u3;
   }

   public final void u3(int var1) {
      this.u3 = var1;
   }

   public final void n5(com.aspose.slides.internal.o9b.y2 var1) {
      this.n5 = var1.s7();
      this.l6 = var1.x8();
      this.k5 = var1.t2();
      this.u3 = var1.l6();
   }
}
