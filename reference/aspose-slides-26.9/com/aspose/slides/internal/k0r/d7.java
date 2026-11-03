package com.aspose.slides.internal.k0r;

public class d7 extends e6r {
   private f1s n5 = new f1s();
   private f1s l6 = new f1s();
   private int k5 = 1;
   private int u3 = 1;
   private boolean a6 = false;
   private boolean u9 = false;
   private boolean h0 = false;

   d7() {
      this.w1().n5(1045);
   }

   public final f1s l6() {
      return this.n5;
   }

   public final f1s k5() {
      return this.l6;
   }

   public final int u3() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int a6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final boolean u9() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public final boolean h0() {
      return this.u9;
   }

   public final void l6(boolean var1) {
      this.u9 = var1;
   }

   public final boolean c8() {
      return this.h0;
   }

   public final void k5(boolean var1) {
      this.h0 = var1;
   }

   final void t2() {
      this.n5 = new f1s(-156200006, 1000000000);
      this.l6 = new f1s(-946600019, 1000000000);
      this.k5 = 1;
      this.u3 = 1;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
      this.k5 = var1.z1() & 255;
      this.u3 = var1.z1() & 255;
      this.a6 = (var1.z1() & 255) != 0;
      byte var2 = var1.z1();
      this.u9 = (var2 & 255 & 1) != 0;
      this.h0 = (var2 & 255 & 2) != 0;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
      var1.n5((byte)this.k5);
      var1.n5((byte)this.u3);
      var1.n5((byte)(this.a6 ? 1 : 0));
      var1.n5((byte)((this.u9 ? 1 : 0) + (this.h0 ? 2 : 0)));
   }

   @Override
   public int n5() {
      return 20;
   }
}
