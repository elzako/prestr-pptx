package com.aspose.slides.internal.o8m;

public class p8 extends y2 {
   static boolean n5 = "1".equals(com.aspose.slides.internal.x8w.z1.n5());
   private boolean u9;

   public p8() {
      this(com.aspose.slides.internal.x8w.t4.n5(8));
      this.l6(n5);
   }

   public p8(byte[] var1) {
      this.l6(n5);
      this.n5("SHA512");
      this.k5 = 512;
      this.n5(var1);
   }

   public void l6(boolean var1) {
      this.u9 = var1;
      this.n5(this.u9 ? 64 : 128);
   }
}
