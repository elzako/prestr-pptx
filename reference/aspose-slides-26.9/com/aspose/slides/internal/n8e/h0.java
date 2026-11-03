package com.aspose.slides.internal.n8e;

public class h0 {
   private byte[] n5;

   public final int n5() {
      return y2.k5(this.n5, 0);
   }

   public final byte[] l6() {
      return this.n5;
   }

   public h0() {
      this.n5 = new byte[]{0, 0, 0, 0};
   }

   public h0(byte[] var1) {
      this.n5 = new byte[var1.length];
      System.arraycopy(var1, 0, this.n5, 0, var1.length);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.a6(com.aspose.slides.internal.l7h.j5.z1().l6(this.n5, 4, this.n5()), '\u0000');
   }

   public final void n5(String var1) {
      var1 = com.aspose.slides.ms.System.d1.a6(var1, '\u0000');
      int var2 = 4 + var1.length() * 2 + 2;
      int var3 = var2 % 4;
      if (var3 != 0) {
         var2 = var2 - var3 + 4;
      }

      this.n5 = new byte[var2];
      System.arraycopy(com.aspose.slides.internal.l7h.j5.z1().u3(var1), 0, this.n5, 4, var1.length() * 2);
      y2.l6(this.n5, 0, var2 - 4);
   }
}
