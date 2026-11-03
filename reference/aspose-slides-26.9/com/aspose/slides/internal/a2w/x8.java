package com.aspose.slides.internal.a2w;

public class x8 extends s7 {
   private byte[] n5;

   public void n5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   protected byte[] l6() {
      byte[] var1 = new byte[4 + this.n5.length];
      com.aspose.slides.internal.y5s.l6.n5(1951551059L, var1, 0);
      System.arraycopy(this.n5, 0, var1, 4, this.n5.length);
      return var1;
   }
}
