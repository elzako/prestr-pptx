package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.p6;

public class u3 extends h0 {
   private int u9;
   private com.aspose.slides.internal.f9d.x8 h0;

   public u3(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, d2 var4) {
      super(var1, var2, var3, var4);
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.r2q.u9 var1) {
      this.h0 = new com.aspose.slides.internal.f9d.x8(var1, this.u9);
      this.h0.n3();
   }

   @Override
   protected p6 n5(byte[] var1, int var2) {
      return this.h0.n5(var1, var2);
   }
}
