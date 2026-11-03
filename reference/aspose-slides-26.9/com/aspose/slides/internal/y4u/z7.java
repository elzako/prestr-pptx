package com.aspose.slides.internal.y4u;

public abstract class z7 extends s7 {
   private boolean z8 = false;

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      if (!this.z8) {
         this.l6(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         this.k5(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   protected abstract void l6(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8);

   protected abstract void k5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8);

   @Override
   protected void n5() {
      this.z8 = com.aspose.slides.internal.r1x.v4.n5(this.n3, com.aspose.slides.internal.r1x.v4.u9());
   }
}
