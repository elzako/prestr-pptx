package com.aspose.slides.internal.k0r;

public class z5 extends q1 {
   private long n5;

   public z5(int var1, long var2) {
      super(var1, false);
      this.n5 = var2;
   }

   public z5(int var1, boolean var2, long var3) {
      super(var1, var2);
      this.n5 = var3;
   }

   public z5(z5 var1) {
      super(var1.y4(), var1.e2());
      this.n5 = var1.j5();
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = this.y4();
      var2 |= this.e2() ? 16384 : 0;
      var1.n5((short)var2);
      var1.n5(this.n5 & 4294967295L);
   }

   @Override
   int n5() {
      return 6;
   }

   public final long j5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }
}
