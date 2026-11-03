package com.aspose.slides.internal.l6z;

class u9 extends n1 {
   private long n5;
   private byte l6;
   private byte k5;

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.r4();
      this.n5 = var2 & 65535 & 4095 & 4294967295L;
      this.l6 = (byte)((var2 & 65535) >> 12 & 7);
      this.k5 = (byte)((var2 & 65535) >> 15 & 1);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = (int)(this.n5 & 65535L);
      var2 = (var2 & 65535) + ((this.l6 & 255) << 12 & 65535) & 65535;
      var2 = (var2 & 65535) + ((this.k5 & 255) << 15 & 65535) & 65535;
      var1.n5(var2 & 65535);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final byte l6() {
      return this.k5;
   }

   public final void l6(byte var1) {
      this.k5 = var1;
   }
}
