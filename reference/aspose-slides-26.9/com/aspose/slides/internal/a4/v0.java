package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class v0 extends e5 {
   public v0() {
      this.l6((short)16414);
   }

   public v0(b3 var1) {
      super(var1);
   }

   public final byte k5() {
      return (byte)((this.G_() & 254) >> 1);
   }

   public final void n5(byte var1) {
      short var2 = -255;
      this.n5((short)(this.G_() & -255));
      this.n5((short)(this.G_() | (byte)((var1 & 255) << 1) & 0xFF));
   }

   public final boolean u3() {
      return this.u9(0);
   }

   public final void n5(boolean var1) {
      this.n5(0, var1);
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, SmoothingMode: {1}, AntiAliasing: {2}",
         super.toString(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.e5.class, this.k5()),
         this.u3()
      );
   }

   @Override
   public int u9() {
      return 0;
   }
}
