package com.aspose.slides.internal.k0r;

public class w1n extends m4d {
   private long n5 = 0L;
   private int l6 = 0;
   private int k5 = 0;
   private long u3 = 0L;
   private int a6;

   public w1n(r5w var1) {
      super(var1);
      this.w1().n5(1011);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.m3();
      this.k5 = var1.m3();
      this.u3 = var1.c4();
      this.a6 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.l6(this.l6);
      var1.l6(this.k5);
      var1.n5(this.u3 & 4294967295L);
      var1.l6(this.a6);
   }

   @Override
   public int n5() {
      return 20;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.l6 |= 2;
      } else {
         this.l6 &= -3;
      }
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.l6 |= 4;
      } else {
         this.l6 &= -5;
      }
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }
}
