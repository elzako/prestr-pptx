package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.p6;

public class l6 extends h0 {
   private final boolean u9;
   private com.aspose.slides.internal.f9d.t9 h0;

   public l6(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, d2 var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.u9 = var5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.r2q.u9 var1) {
      this.h0 = new com.aspose.slides.internal.f9d.t9(var1, this.u9);
   }

   @Override
   protected p6 n5(byte[] var1, int var2) {
      return this.h0.n5(var1, 0, var2);
   }
}
