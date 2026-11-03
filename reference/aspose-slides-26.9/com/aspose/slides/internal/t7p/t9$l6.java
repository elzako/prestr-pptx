package com.aspose.slides.internal.t7p;

class t9$l6 implements s7 {
   private final int n5;

   public t9$l6(int var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(short[] var1, int var2, int var3) {
      int var4 = var3 * this.n5 + var2;
      int var5 = var4 + 1;
      int var6 = var4 + this.n5;
      int var7 = var6 + 1;
      var1[var6] = var1[var4];
      var1[var7] = var1[var5];
   }
}
