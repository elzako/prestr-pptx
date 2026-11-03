package com.aspose.slides.internal.g7;

class j8 {
   private int n5;
   private byte l6;
   private int[] k5;
   private byte[] u3;
   private long a6;
   private long u9;

   public final long n5() {
      return this.a6;
   }

   public final void n5(long var1) {
      this.a6 = var1;
   }

   public final long l6() {
      return this.u9;
   }

   public final void l6(long var1) {
      this.u9 = var1;
   }

   public final int k5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final byte u3() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final int[] a6() {
      return this.k5;
   }

   public final void n5(int[] var1) {
      this.k5 = var1;
   }

   public final byte[] u9() {
      return this.u3;
   }

   public final void n5(byte[] var1) {
      this.u3 = var1;
   }

   public final void n5(int var1, int[] var2, int[] var3) {
      int var4 = var1 + 1;

      while (var4 < this.k5() && this.a6()[var4] == 0) {
         var4++;
      }

      var3[0] = this.a6()[var4] - this.a6()[var1];
      var2[0] = this.a6()[var1] - 1;
   }
}
