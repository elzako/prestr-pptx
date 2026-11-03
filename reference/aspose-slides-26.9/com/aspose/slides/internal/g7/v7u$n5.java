package com.aspose.slides.internal.g7;

class v7u$n5 {
   public int n5;
   public int l6;
   public int k5;
   public byte[] u3;
   public long a6;
   public n3c u9;

   public v7u$n5(int var1, int var2, int var3, v7u var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      switch (var3) {
         case 12:
            this.u9 = new d4n(var1, var2, var4);
            break;
         default:
            this.u9 = new o9b(var1, var2, var4);
      }
   }

   public final void n5() {
      byte[][] var1 = new byte[][]{this.u3};
      long[] var2 = new long[]{this.a6};
      this.u9.n5(var1, var2);
      this.u3 = var1[0];
      this.a6 = var2[0];
   }
}
