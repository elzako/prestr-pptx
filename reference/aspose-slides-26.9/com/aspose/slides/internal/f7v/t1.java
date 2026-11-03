package com.aspose.slides.internal.f7v;

public class t1 extends p3 {
   private long t2;
   private long s7;
   private int x8;

   public t1(com.aspose.slides.internal.c5e.l6 var1) {
      super("pHYs", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (var1.n5 != 9) {
         throw new com.aspose.slides.internal.c5e.e2("bad chunk length " + var1);
      }

      this.t2 = com.aspose.slides.internal.c5e.h0.k5(var1.k5, 0);
      if (this.t2 < 0L) {
         this.t2 += 4294967296L;
      }

      this.s7 = com.aspose.slides.internal.c5e.h0.k5(var1.k5, 4);
      if (this.s7 < 0L) {
         this.s7 += 4294967296L;
      }

      this.x8 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 8);
   }

   public long l6() {
      return this.t2;
   }

   public long k5() {
      return this.s7;
   }

   public int u3() {
      return this.x8;
   }

   public double[] a6() {
      return this.x8 != 1 ? new double[]{-1.0, -1.0} : new double[]{this.t2 * 0.0254, this.s7 * 0.0254};
   }
}
