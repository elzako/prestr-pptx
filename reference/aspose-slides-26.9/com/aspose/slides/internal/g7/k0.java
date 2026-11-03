package com.aspose.slides.internal.g7;

class k0 {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9 = 1;

   public k0(int var1) {
      for (this.u3 = 1 + (1 << 3 * this.u9) - 1; this.u3 < var1; this.u3 = 1 + (1 << 3 * this.u9) - 1) {
         this.u9++;
      }

      this.n5 = 256 + 8 * this.u9;
      this.l6 = this.n5 + 1;
      this.k5 = this.l6 + 1;
      this.a6 = this.k5 + 1;
   }
}
