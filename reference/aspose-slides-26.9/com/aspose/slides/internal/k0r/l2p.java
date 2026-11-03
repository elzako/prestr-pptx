package com.aspose.slides.internal.k0r;

public class l2p extends e6r {
   private int n5;
   private int l6;
   private byte k5;
   private byte u3;
   private int a6;
   private byte u9;

   public l2p() {
      this.w1().n5(1017);
      this.a6 = 1;
      this.k5 = 2;
      this.n5 = 0;
      this.l6 = 0;
      this.u9 = 0;
      this.u3 = 0;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = var1.m3();
      this.k5 = var1.z1();
      this.u3 = var1.z1();
      this.a6 = var1.r4();
      this.u9 = var1.z1();
      var1.z1();
      var1.z1();
      var1.z1();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.l6(this.l6);
      var1.n5(this.k5);
      var1.n5(this.u3);
      var1.n5((short)this.a6);
      var1.n5(this.u9);
      var1.n5((byte)0);
      var1.n5((byte)0);
      var1.n5((byte)0);
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

   public final byte u3() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
   }

   public final byte a6() {
      return this.u3;
   }

   public final void l6(byte var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.a6;
   }

   public final void k5(int var1) {
      this.a6 = var1;
   }

   public final byte h0() {
      return this.u9;
   }

   public final void k5(byte var1) {
      this.u9 = var1;
   }

   public final void c8() {
      switch (this.u3) {
         case 0:
         case 2:
         case 3:
         case 8:
         case 11:
         case 21:
            if ((this.k5 & 255) > 1) {
               this.k5 = 0;
            }
            break;
         case 1:
         case 5:
         case 6:
         case 17:
         case 18:
         case 19:
         case 22:
         case 23:
         case 27:
            this.k5 = 0;
         case 4:
         case 7:
         case 9:
         case 10:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 20:
         case 24:
         case 25:
         case 26:
      }
   }
}
