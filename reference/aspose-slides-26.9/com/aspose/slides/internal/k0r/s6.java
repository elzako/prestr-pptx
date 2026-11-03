package com.aspose.slides.internal.k0r;

public class s6 extends l7 {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private long a6;
   private long u9;

   public s6() {
      super(61458, (byte)1);
      this.w1().n5((short)0);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = var1.c4();
      this.a6 = var1.c4();
      this.u9 = var1.c4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(this.u3 & 4294967295L);
      var1.n5(this.a6 & 4294967295L);
      var1.n5(this.u9 & 4294967295L);
   }

   @Override
   public int n5() {
      return 24;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void k5(long var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void u3(long var1) {
      this.u3 = var1;
   }

   public final int a6() {
      return (int)this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1 & 4294967295L;
   }

   public final int u9() {
      return (int)this.u9;
   }

   public final void l6(int var1) {
      this.u9 = var1 & 4294967295L;
   }
}
