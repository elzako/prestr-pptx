package com.aspose.slides.internal.t7p;

class e2$l6 implements t2 {
   private com.aspose.slides.internal.b7s.z1 n5;

   public e2$l6(com.aspose.slides.internal.b7s.z1 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(short[] var1, int var2, int var3) {
      int var4 = this.n5.x8();
      int var5 = var3 * var4 + var2;
      int var6 = var5 + 1;
      int var7 = var5 + var4;
      int var8 = var7 + 1;
      var1[var5] = (short)(var1[var5] + var1[var7] >> 1);
      var1[var6] = (short)(var1[var6] + var1[var8] >> 1);
   }
}
