package com.aspose.slides.internal.b7s;

public class f2 implements h0 {
   private final byte[] n5;
   private final int l6;
   private final int k5;
   private int u3;

   public f2(byte[] var1, int var2, int var3, int var4) {
      this.n5 = var1;
      this.u3 = var2;
      this.l6 = var3;
      this.k5 = var4;
   }

   @Override
   public final void n5(byte[] var1, int var2, int var3, int var4) {
      System.arraycopy(this.n5, this.u3, var1, var2, var3 * this.l6);
      this.u3 = this.u3 + this.k5;
   }

   @Override
   public final void l6(byte[] var1, int var2, int var3, int var4) {
      System.arraycopy(var1, var2, this.n5, this.u3, var3 * this.l6);
      this.u3 = this.u3 + this.k5;
   }
}
