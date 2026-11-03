package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;

public class y4 extends n5<com.aspose.slides.internal.w4c.n5> {
   private com.aspose.slides.internal.o9b.c8[] l6;

   public y4(m3 var1) {
      super(var1);
      this.l6 = this.n5(var1.t2(), var1.y4()[0]);
   }

   public com.aspose.slides.internal.o9b.c8 n5(float var1, float var2, com.aspose.slides.internal.w4c.n5 var3) {
      if (var3.k5(var1, var2)) {
         return this.n5.t2();
      }

      double var4 = this.n5(new w1(var1, var2), var3, false);
      return var4 == -1.0 ? null : this.n5(this.l6, var4);
   }
}
