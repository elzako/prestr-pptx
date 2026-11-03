package com.aspose.slides.internal.k0r;

public class r7c extends e6r {
   private long n5;
   private int l6;
   private short k5;
   private short u3;
   private byte[] a6;
   private int u9;

   public r7c() {
      this.w1().n5(1025);
      this.w1().n5((byte)1);
      this.n5 = 16777216L;
      this.l6 = Integer.MAX_VALUE;
      this.k5 = 0;
      this.u3 = 0;
      this.u9 = 1;
      this.a6 = new byte[64];
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.m3();
      this.k5 = var1.k7();
      this.u3 = var1.k7();
      this.a6 = var1.c8(64);
      this.u9 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.l6(this.l6);
      var1.n5(this.k5);
      var1.n5(this.u3);
      byte[] var2 = new byte[64];
      System.arraycopy(this.a6, 0, var2, 0, 64);
      var1.n5(var2);
      var1.l6(this.u9);
   }

   @Override
   public int n5() {
      return 80;
   }
}
