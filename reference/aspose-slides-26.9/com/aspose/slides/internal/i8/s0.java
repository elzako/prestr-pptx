package com.aspose.slides.internal.i8;

import com.aspose.slides.internal.i0.a7;
import com.aspose.slides.internal.i0.l4;

public class s0 extends e5 {
   private final long n5;
   private final int l6;

   public s0(long var1, int var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.x8().getPosition();
      l4 var4 = new l4();
      if ((this.n5 & 2L) > 0L) {
         var4.n5((a7)new v3().n5(var1));
      }

      int var5 = this.l6 - (int)(var1.x8().getPosition() - var2);
      if (var5 > 24) {
         var4.n5((com.aspose.slides.internal.i0.o0)new d2().n5(var1));
      }

      return var4;
   }
}
