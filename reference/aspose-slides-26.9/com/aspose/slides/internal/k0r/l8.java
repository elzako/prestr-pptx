package com.aspose.slides.internal.k0r;

public abstract class l8 extends g2 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private byte[] l6;
   public long s7 = 0L;

   public l8(int var1, byte var2) {
      super(var1, var2);
   }

   public final com.aspose.slides.ms.System.o0 h0() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   public final byte[] c8() {
      return this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final int t2() {
      return (this.w1().u3() & 65535) - 61464;
   }

   protected static com.aspose.slides.ms.System.o0 l6(com.aspose.slides.internal.z0k.n5 var0) {
      return new com.aspose.slides.ms.System.o0(var0.c8(16));
   }

   protected final void l6(byte[] var1) {
      com.aspose.slides.internal.h3k.a6.n5(var1).k5(this.n5);
   }

   public abstract byte[] k5();

   @Override
   public abstract int n5();
}
