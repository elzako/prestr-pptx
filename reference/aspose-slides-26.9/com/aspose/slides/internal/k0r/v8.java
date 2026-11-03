package com.aspose.slides.internal.k0r;

public class v8 extends q1 {
   private byte[] n5;

   public v8(int var1, int var2) {
      super(var1, false);
      this.n5 = new byte[var2];
   }

   public v8(int var1, byte[] var2) {
      super(var1, false);
      this.n5 = new byte[var2.length];
      System.arraycopy(var2, 0, this.n5, 0, var2.length);
   }

   public v8(int var1, String var2) {
      super(var1, false);
      com.aspose.slides.internal.l7h.t1 var3 = new com.aspose.slides.internal.l7h.t1();
      byte[] var4 = var3.u3(var2);
      int var5 = var4.length + 2;
      this.n5 = new byte[var5];
      System.arraycopy(var4, 0, this.n5, 0, var4.length);
      this.n5[this.n5.length - 1] = 0;
      this.n5[this.n5.length - 2] = 0;
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = this.y4();
      var2 |= this.e2() ? 16384 : 0;
      var2 |= 32768;
      var1.n5((short)var2);
      var1.l6(this.n5.length);
   }

   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      var1.n5(this.n5, 0, this.n5.length);
   }

   void l6(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
   }

   @Override
   int n5() {
      return 6 + this.l6().length;
   }

   public byte[] l6() {
      return this.n5;
   }

   protected void n5(byte[] var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.n5.length;
   }

   protected final void n5(int var1) {
      byte[] var2 = this.n5;
      this.n5(new byte[var1]);
      System.arraycopy(var2, 0, this.n5, 0, var2.length < this.n5.length ? var2.length : this.n5.length);
   }
}
