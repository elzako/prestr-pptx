package com.aspose.slides.internal.m4d;

import java.awt.image.BufferedImage;

class c8 extends com.aspose.slides.internal.t2h.l6 {
   private final int a6;
   private final n5 u9;

   c8(int var1, int var2, int var3, int var4, n5 var5) {
      super(var1, var2, var3);
      this.a6 = var4;
      this.u9 = var5;
   }

   @Override
   protected BufferedImage n5() {
      return this.u9.n5(this.a6);
   }

   @Override
   public com.aspose.slides.internal.t2h.l6 n5(int var1) {
      return new c8(this.n5, this.l6, var1, this.a6, this.u9);
   }
}
