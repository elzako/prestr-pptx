package com.aspose.slides.internal.y4u;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class p6 extends s7 {
   protected int z8;
   protected com.aspose.slides.internal.r1x.o5 j5;
   protected int w1;
   protected int r4;
   protected int c4;
   protected int y2;

   @Override
   protected void n5() {
      if (this.u9 <= 8 && this.t4 == null) {
         throw new ArgumentNullException("DestinationColorPalette");
      }

      this.j5 = new com.aspose.slides.internal.r1x.o5(this.t4);
      int var1 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, this.u9), 14);
      this.z8 = var1 - 1;
      this.y2 = 8 / this.u9;
      this.r4 = this.y4 / this.u9;
      this.c4 = this.y4 / 8;
      this.w1 = 8 - this.u9;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = (this.y2 - var3 / this.y4 % this.y2 - 1) * this.u9;
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   protected abstract void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8, int var9);
}
