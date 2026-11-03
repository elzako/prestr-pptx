package com.aspose.slides.internal.k0r;

public class h3d extends k5 {
   private int u3;
   private final int[] a6 = new int[8];
   private long u9;

   public h3d() {
      this.w1().n5(1007);
      this.w1().n5((byte)2);
      this.u3 = 16;

      for (int var1 = 0; var1 < this.a6.length; var1++) {
         this.a6[var1] = 0;
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.u3 = var1.m3();

      for (int var2 = 0; var2 < 8; var2++) {
         this.a6[var2] = var1.z1() & 255;
      }

      this.u9 = var1.c4();
      super.n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.u3 & 4294967295L);

      for (int var2 = 0; var2 < 8; var2++) {
         var1.n5((byte)this.a6[var2]);
      }

      var1.n5(this.u9);
      super.n5(var1);
   }

   @Override
   public int n5() {
      return 16 + super.n5();
   }

   public final int h0() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final int[] c8() {
      return this.a6;
   }

   public final long t2() {
      return this.u9;
   }

   public final void n5(long var1) {
      this.u9 = var1;
   }

   public final void l6(long var1) {
      this.n5 = var1;
   }
}
