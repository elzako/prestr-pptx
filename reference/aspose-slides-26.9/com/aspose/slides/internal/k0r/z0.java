package com.aspose.slides.internal.k0r;

public class z0 extends e6r {
   private String n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private byte a6;

   public z0() {
      this.w1().n5(4023);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = "";
      com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
      char[] var3 = var2.n5(var1.c8(64));
      this.n5 = com.aspose.slides.ms.System.d1.n5(var3);
      int var4 = com.aspose.slides.ms.System.d1.u3(this.n5, '\u0000');
      if (var4 > -1) {
         this.n5 = com.aspose.slides.ms.System.d1.l6(this.n5, 0, var4);
      }

      this.l6 = var1.z1();
      this.k5 = var1.z1();
      this.u3 = var1.z1();
      this.a6 = var1.z1();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
      String var3 = this.n5.length() > 31 ? com.aspose.slides.ms.System.d1.l6(this.n5, 0, 31) : this.n5;
      byte[] var4 = var2.l6(com.aspose.slides.ms.System.d1.c8(var3));
      byte[] var5 = new byte[64];
      System.arraycopy(var4, 0, var5, 0, var4.length);
      var1.n5(var5);
      var1.n5(this.l6);
      var1.n5(this.k5);
      var1.n5(this.u3);
      var1.n5(this.a6);
   }

   @Override
   public int n5() {
      return 68;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final byte k5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final byte u3() {
      return this.k5;
   }

   public final void l6(byte var1) {
      this.k5 = var1;
   }

   public final byte a6() {
      return (byte)(this.a6 & 0xFF & 240);
   }

   public final void k5(byte var1) {
      this.u3 = var1;
   }

   public final byte u9() {
      return (byte)(this.a6 & 0xFF & 15);
   }

   public final byte h0() {
      return this.a6;
   }

   public final void u3(byte var1) {
      this.a6 = var1;
   }
}
