package com.aspose.slides.internal.p4t;

public class u3 {
   protected int n5;
   protected int l6;
   protected byte[] k5;
   protected int u3;

   public u3(int var1, int var2, byte[] var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public void n5(byte var1) {
      this.k5[this.u3++] = var1;
   }

   public byte n5() {
      return this.k5[this.u3++];
   }

   public void l6() {
      this.u3 = this.u3 + this.l6;
   }
}
