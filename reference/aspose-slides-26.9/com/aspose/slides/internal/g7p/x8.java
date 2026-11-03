package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;

public class x8 extends n5<com.aspose.slides.internal.w4c.k5> {
   private com.aspose.slides.internal.o9b.c8[] l6;

   public x8(m3 var1, com.aspose.slides.internal.o9b.c8[] var2) {
      super(var1);
      this.l6 = this.n5(var1.t2(), var2[0]);
   }

   public com.aspose.slides.internal.o9b.c8 n5(float var1, float var2, com.aspose.slides.internal.w4c.k5 var3) {
      double var4 = this.n5(new w1(var1, var2), var3, false);
      return var4 == -1.0 ? null : this.n5(this.l6, var4);
   }
}
