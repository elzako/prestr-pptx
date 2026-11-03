package com.aspose.slides.internal.f4l;

public final class y0 extends u3 {
   private int n5;
   private int l6;
   private int k5;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
      this.l6 = var1 >> 4 & 15;
      this.k5 = var1 & 15;
   }
}
